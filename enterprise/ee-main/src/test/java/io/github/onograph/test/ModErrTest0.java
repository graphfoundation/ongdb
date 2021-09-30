package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModErrTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test01");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    int int5 = entryPointImpl3.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    int int6 = entryPointImpl1.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl4",
        (entryPointImpl0.compareTo(entryPointImpl4) == 0) == entryPointImpl0.equals(
            entryPointImpl4));
  }

  @Test
  public void test02() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test02");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl5.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    int int12 = entryPointImpl10.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl11);
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl10.getPriority();
    int int15 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl5",
        (entryPointImpl3.compareTo(entryPointImpl5) == 0) == entryPointImpl3.equals(
            entryPointImpl5));
  }

  @Test
  public void test03() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test03");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl5.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl0.getPriority();
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl5",
        (entryPointImpl3.compareTo(entryPointImpl5) == 0) == entryPointImpl3.equals(
            entryPointImpl5));
  }

  @Test
  public void test04() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test04");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl8 = new io.github.onograph.server.EntryPointImpl();
    int int9 = entryPointImpl5.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl10.getPriority();
    int int14 = entryPointImpl5.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    int int15 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl8",
        (entryPointImpl3.compareTo(entryPointImpl8) == 0) == entryPointImpl3.equals(
            entryPointImpl8));
  }

  @Test
  public void test05() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test05");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    int int8 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl6",
        (entryPointImpl3.compareTo(entryPointImpl6) == 0) == entryPointImpl3.equals(
            entryPointImpl6));
  }

  @Test
  public void test06() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test06");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl5.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl5.getPriority();
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl3",
        (entryPointImpl0.compareTo(entryPointImpl3) == 0) == entryPointImpl0.equals(
            entryPointImpl3));
  }

  @Test
  public void test07() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test07");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl5.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    int int11 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl5",
        (entryPointImpl3.compareTo(entryPointImpl5) == 0) == entryPointImpl3.equals(
            entryPointImpl5));
  }

  @Test
  public void test08() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test08");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl6.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl10.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl14 = new io.github.onograph.server.EntryPointImpl();
    int int15 = entryPointImpl10.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl14);
    int int16 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl14);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl6",
        (entryPointImpl3.compareTo(entryPointImpl6) == 0) == entryPointImpl3.equals(
            entryPointImpl6));
  }

  @Test
  public void test09() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test09");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    int int5 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl8 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl8.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl8.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    int int12 = entryPointImpl8.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl11);
    io.github.onograph.server.EntryPointImpl entryPointImpl13 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl13.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority15 = entryPointImpl13.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority16 = entryPointImpl13.getPriority();
    int int17 = entryPointImpl8.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl13);
    int int18 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl13);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl8",
        (entryPointImpl0.compareTo(entryPointImpl8) == 0) == entryPointImpl0.equals(
            entryPointImpl8));
  }

  @Test
  public void test10() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test10");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl6.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl6.getPriority();
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl3",
        (entryPointImpl0.compareTo(entryPointImpl3) == 0) == entryPointImpl0.equals(
            entryPointImpl3));
  }

  @Test
  public void test11() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test11");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    int int5 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    int int8 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl6.getPriority();
    int int10 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl4 and entryPointImpl7",
        (entryPointImpl4.compareTo(entryPointImpl7) == 0) == entryPointImpl4.equals(
            entryPointImpl7));
  }

  @Test
  public void test12() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test12");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    int int5 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl8 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl8.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl8.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl8.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl12 = new io.github.onograph.server.EntryPointImpl();
    int int13 = entryPointImpl8.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl12);
    int int14 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl12);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl8",
        (entryPointImpl0.compareTo(entryPointImpl8) == 0) == entryPointImpl0.equals(
            entryPointImpl8));
  }

  @Test
  public void test13() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test13");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority4 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl8 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl9 = new io.github.onograph.server.EntryPointImpl();
    int int10 = entryPointImpl8.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl8.getPriority();
    int int12 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    int int13 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl1 and entryPointImpl6",
        (entryPointImpl1.compareTo(entryPointImpl6) == 0) == entryPointImpl1.equals(
            entryPointImpl6));
  }

  @Test
  public void test14() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test14");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    int int8 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl4.getPriority();
    int int10 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl11.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl15 = new io.github.onograph.server.EntryPointImpl();
    int int16 = entryPointImpl11.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl15);
    int int17 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl15);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl4 and entryPointImpl7",
        (entryPointImpl4.compareTo(entryPointImpl7) == 0) == entryPointImpl4.equals(
            entryPointImpl7));
  }

  @Test
  public void test15() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test15");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    int int8 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl4.getPriority();
    int int10 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl11.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl15 = new io.github.onograph.server.EntryPointImpl();
    int int16 = entryPointImpl11.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl15);
    int int17 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl15);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl7",
        (entryPointImpl0.compareTo(entryPointImpl7) == 0) == entryPointImpl0.equals(
            entryPointImpl7));
  }

  @Test
  public void test16() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test16");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    int int7 = entryPointImpl5.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    io.github.onograph.server.EntryPointImpl entryPointImpl8 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl8.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl8.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl8.getPriority();
    int int12 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    int int13 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl5",
        (entryPointImpl3.compareTo(entryPointImpl5) == 0) == entryPointImpl3.equals(
            entryPointImpl5));
  }

  @Test
  public void test17() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test17");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl5.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl10.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl13 = new io.github.onograph.server.EntryPointImpl();
    int int14 = entryPointImpl10.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl13);
    org.neo4j.server.startup.EntryPoint.Priority priority15 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority16 = entryPointImpl10.getPriority();
    int int17 = entryPointImpl5.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl3",
        (entryPointImpl0.compareTo(entryPointImpl3) == 0) == entryPointImpl0.equals(
            entryPointImpl3));
  }

  @Test
  public void test18() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test18");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl2 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl2.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl2.getPriority();
    int int6 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl2);
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl7.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl7.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    int int11 = entryPointImpl7.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    int int12 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl2 and entryPointImpl3",
        (entryPointImpl2.compareTo(entryPointImpl3) == 0) == entryPointImpl2.equals(
            entryPointImpl3));
  }

  @Test
  public void test19() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test19");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl3.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl6.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl9 = new io.github.onograph.server.EntryPointImpl();
    int int10 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    int int11 = entryPointImpl3.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl6",
        (entryPointImpl0.compareTo(entryPointImpl6) == 0) == entryPointImpl0.equals(
            entryPointImpl6));
  }

  @Test
  public void test20() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test20");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    int int8 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl4.getPriority();
    int int10 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl4.getPriority();
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl7",
        (entryPointImpl0.compareTo(entryPointImpl7) == 0) == entryPointImpl0.equals(
            entryPointImpl7));
  }

  @Test
  public void test21() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test21");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    int int5 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl8 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl9 = new io.github.onograph.server.EntryPointImpl();
    int int10 = entryPointImpl8.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl8.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl8.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl8.getPriority();
    int int14 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl9",
        (entryPointImpl0.compareTo(entryPointImpl9) == 0) == entryPointImpl0.equals(
            entryPointImpl9));
  }

  @Test
  public void test22() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test22");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority4 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl8 = new io.github.onograph.server.EntryPointImpl();
    int int9 = entryPointImpl5.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl5.getPriority();
    int int11 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl1 and entryPointImpl8",
        (entryPointImpl1.compareTo(entryPointImpl8) == 0) == entryPointImpl1.equals(
            entryPointImpl8));
  }

  @Test
  public void test23() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test23");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority4 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    int int8 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    io.github.onograph.server.EntryPointImpl entryPointImpl9 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl9.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl9.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl9.getPriority();
    int int13 = entryPointImpl7.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    int int14 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl1 and entryPointImpl6",
        (entryPointImpl1.compareTo(entryPointImpl6) == 0) == entryPointImpl1.equals(
            entryPointImpl6));
  }

  @Test
  public void test24() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test24");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    int int8 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl6.getPriority();
    int int10 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl7",
        (entryPointImpl3.compareTo(entryPointImpl7) == 0) == entryPointImpl3.equals(
            entryPointImpl7));
  }

  @Test
  public void test25() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test25");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority4 = entryPointImpl3.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl3.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl3.getPriority();
    int int7 = entryPointImpl1.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl3.getPriority();
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl1",
        (entryPointImpl0.compareTo(entryPointImpl1) == 0) == entryPointImpl0.equals(
            entryPointImpl1));
  }

  @Test
  public void test26() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test26");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    int int6 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl7.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl7.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl7.getPriority();
    int int11 = entryPointImpl5.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    int int12 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl1 and entryPointImpl4",
        (entryPointImpl1.compareTo(entryPointImpl4) == 0) == entryPointImpl1.equals(
            entryPointImpl4));
  }

  @Test
  public void test27() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test27");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl7.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl9 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    int int11 = entryPointImpl9.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl9.getPriority();
    int int13 = entryPointImpl7.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    int int14 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl7",
        (entryPointImpl3.compareTo(entryPointImpl7) == 0) == entryPointImpl3.equals(
            entryPointImpl7));
  }

  @Test
  public void test28() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test28");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl6.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl9 = new io.github.onograph.server.EntryPointImpl();
    int int10 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl11.getPriority();
    int int15 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl11);
    int int16 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl9",
        (entryPointImpl3.compareTo(entryPointImpl9) == 0) == entryPointImpl3.equals(
            entryPointImpl9));
  }

  @Test
  public void test29() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test29");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority4 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl6.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl9 = new io.github.onograph.server.EntryPointImpl();
    int int10 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl6.getPriority();
    int int14 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl1 and entryPointImpl9",
        (entryPointImpl1.compareTo(entryPointImpl9) == 0) == entryPointImpl1.equals(
            entryPointImpl9));
  }

  @Test
  public void test30() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test30");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    int int5 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl8 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl9 = new io.github.onograph.server.EntryPointImpl();
    int int10 = entryPointImpl8.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl8.getPriority();
    int int12 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    int int13 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl6",
        (entryPointImpl0.compareTo(entryPointImpl6) == 0) == entryPointImpl0.equals(
            entryPointImpl6));
  }

  @Test
  public void test31() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test31");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl6.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl10.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl13 = new io.github.onograph.server.EntryPointImpl();
    int int14 = entryPointImpl10.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl13);
    org.neo4j.server.startup.EntryPoint.Priority priority15 = entryPointImpl10.getPriority();
    int int16 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl3",
        (entryPointImpl0.compareTo(entryPointImpl3) == 0) == entryPointImpl0.equals(
            entryPointImpl3));
  }

  @Test
  public void test32() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test32");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl2 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl2.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl2.getPriority();
    int int6 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl2);
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl2.getPriority();
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl3",
        (entryPointImpl0.compareTo(entryPointImpl3) == 0) == entryPointImpl0.equals(
            entryPointImpl3));
  }

  @Test
  public void test33() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test33");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    int int5 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl7.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl7.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    int int11 = entryPointImpl7.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    io.github.onograph.server.EntryPointImpl entryPointImpl12 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl12.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl12.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority15 = entryPointImpl12.getPriority();
    int int16 = entryPointImpl7.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl12);
    int int17 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl10",
        (entryPointImpl0.compareTo(entryPointImpl10) == 0) == entryPointImpl0.equals(
            entryPointImpl10));
  }

  @Test
  public void test34() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test34");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl5.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    int int12 = entryPointImpl10.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl11);
    int int13 = entryPointImpl5.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl3",
        (entryPointImpl0.compareTo(entryPointImpl3) == 0) == entryPointImpl0.equals(
            entryPointImpl3));
  }

  @Test
  public void test35() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test35");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority4 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl7.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl7.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    int int11 = entryPointImpl7.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl7.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl7.getPriority();
    int int14 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl1 and entryPointImpl10",
        (entryPointImpl1.compareTo(entryPointImpl10) == 0) == entryPointImpl1.equals(
            entryPointImpl10));
  }

  @Test
  public void test36() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test36");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    int int8 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl4.getPriority();
    int int10 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl0.getPriority();
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl4 and entryPointImpl7",
        (entryPointImpl4.compareTo(entryPointImpl7) == 0) == entryPointImpl4.equals(
            entryPointImpl7));
  }

  @Test
  public void test37() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test37");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl6.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl10.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl13 = new io.github.onograph.server.EntryPointImpl();
    int int14 = entryPointImpl10.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl13);
    org.neo4j.server.startup.EntryPoint.Priority priority15 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority16 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority17 = entryPointImpl10.getPriority();
    int int18 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl6",
        (entryPointImpl3.compareTo(entryPointImpl6) == 0) == entryPointImpl3.equals(
            entryPointImpl6));
  }

  @Test
  public void test38() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test38");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl6.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl0.getPriority();
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl6",
        (entryPointImpl3.compareTo(entryPointImpl6) == 0) == entryPointImpl3.equals(
            entryPointImpl6));
  }

  @Test
  public void test39() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test39");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl2 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl2.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority4 = entryPointImpl2.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl2.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl6.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl9 = new io.github.onograph.server.EntryPointImpl();
    int int10 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl6.getPriority();
    int int12 = entryPointImpl2.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    int int13 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl2);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl6 and entryPointImpl9",
        (entryPointImpl6.compareTo(entryPointImpl9) == 0) == entryPointImpl6.equals(
            entryPointImpl9));
  }

  @Test
  public void test40() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test40");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority4 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    int int8 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    io.github.onograph.server.EntryPointImpl entryPointImpl9 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    int int11 = entryPointImpl9.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    io.github.onograph.server.EntryPointImpl entryPointImpl12 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl12.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl12.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority15 = entryPointImpl12.getPriority();
    int int16 = entryPointImpl10.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl12);
    int int17 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl12);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl1 and entryPointImpl5",
        (entryPointImpl1.compareTo(entryPointImpl5) == 0) == entryPointImpl1.equals(
            entryPointImpl5));
  }

  @Test
  public void test41() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test41");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    int int5 = entryPointImpl3.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    int int6 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl1 and entryPointImpl4",
        (entryPointImpl1.compareTo(entryPointImpl4) == 0) == entryPointImpl1.equals(
            entryPointImpl4));
  }

  @Test
  public void test42() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test42");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    int int8 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl4.getPriority();
    int int10 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl12 = new io.github.onograph.server.EntryPointImpl();
    int int13 = entryPointImpl11.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl12);
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority15 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority16 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority17 = entryPointImpl11.getPriority();
    int int18 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl11);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl7",
        (entryPointImpl0.compareTo(entryPointImpl7) == 0) == entryPointImpl0.equals(
            entryPointImpl7));
  }

  @Test
  public void test43() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test43");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority4 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    int int8 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl5.getPriority();
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl1",
        (entryPointImpl0.compareTo(entryPointImpl1) == 0) == entryPointImpl0.equals(
            entryPointImpl1));
  }

  @Test
  public void test44() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test44");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl5.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl9 = new io.github.onograph.server.EntryPointImpl();
    int int10 = entryPointImpl5.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    int int11 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl9);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl5",
        (entryPointImpl3.compareTo(entryPointImpl5) == 0) == entryPointImpl3.equals(
            entryPointImpl5));
  }

  @Test
  public void test45() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test45");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl6.getPriority();
    int int10 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl12 = new io.github.onograph.server.EntryPointImpl();
    int int13 = entryPointImpl11.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl12);
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority15 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority16 = entryPointImpl11.getPriority();
    int int17 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl11);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl3",
        (entryPointImpl0.compareTo(entryPointImpl3) == 0) == entryPointImpl0.equals(
            entryPointImpl3));
  }

  @Test
  public void test46() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test46");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl7.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl7.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl7.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    int int12 = entryPointImpl7.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl11);
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl11.getPriority();
    int int15 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl11);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl7",
        (entryPointImpl3.compareTo(entryPointImpl7) == 0) == entryPointImpl3.equals(
            entryPointImpl7));
  }

  @Test
  public void test47() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test47");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority4 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    int int7 = entryPointImpl5.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl5.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl10.getPriority();
    int int13 = entryPointImpl5.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    int int14 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl1 and entryPointImpl6",
        (entryPointImpl1.compareTo(entryPointImpl6) == 0) == entryPointImpl1.equals(
            entryPointImpl6));
  }

  @Test
  public void test48() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test48");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl8 = new io.github.onograph.server.EntryPointImpl();
    int int9 = entryPointImpl7.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl10.getPriority();
    int int14 = entryPointImpl8.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    int int15 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl7",
        (entryPointImpl3.compareTo(entryPointImpl7) == 0) == entryPointImpl3.equals(
            entryPointImpl7));
  }

  @Test
  public void test49() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test49");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    int int8 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl4.getPriority();
    int int10 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl11.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl14 = new io.github.onograph.server.EntryPointImpl();
    int int15 = entryPointImpl11.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl14);
    org.neo4j.server.startup.EntryPoint.Priority priority16 = entryPointImpl14.getPriority();
    int int17 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl14);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl7",
        (entryPointImpl0.compareTo(entryPointImpl7) == 0) == entryPointImpl0.equals(
            entryPointImpl7));
  }

  @Test
  public void test50() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test50");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl5.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl10.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl12 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl13 = new io.github.onograph.server.EntryPointImpl();
    int int14 = entryPointImpl12.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl13);
    org.neo4j.server.startup.EntryPoint.Priority priority15 = entryPointImpl12.getPriority();
    int int16 = entryPointImpl10.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl12);
    int int17 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl12);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl5",
        (entryPointImpl3.compareTo(entryPointImpl5) == 0) == entryPointImpl3.equals(
            entryPointImpl5));
  }

  @Test
  public void test51() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test51");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    int int5 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    int int12 = entryPointImpl10.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl11);
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority15 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority16 = entryPointImpl10.getPriority();
    int int17 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl11",
        (entryPointImpl0.compareTo(entryPointImpl11) == 0) == entryPointImpl0.equals(
            entryPointImpl11));
  }

  @Test
  public void test52() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test52");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    io.github.onograph.server.EntryPointImpl entryPointImpl5 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl5.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl5.getPriority();
    int int9 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl5);
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl10.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl10.getPriority();
    int int14 = entryPointImpl5.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl3",
        (entryPointImpl0.compareTo(entryPointImpl3) == 0) == entryPointImpl0.equals(
            entryPointImpl3));
  }

  @Test
  public void test53() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test53");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    int int5 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl8 = new io.github.onograph.server.EntryPointImpl();
    int int9 = entryPointImpl7.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    int int10 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl8",
        (entryPointImpl0.compareTo(entryPointImpl8) == 0) == entryPointImpl0.equals(
            entryPointImpl8));
  }

  @Test
  public void test54() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test54");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    int int8 = entryPointImpl6.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl7);
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl6.getPriority();
    int int10 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    int int11 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl6 and entryPointImpl7",
        (entryPointImpl6.compareTo(entryPointImpl7) == 0) == entryPointImpl6.equals(
            entryPointImpl7));
  }

  @Test
  public void test55() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test55");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl8 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl8.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl8.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl8.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl12 = new io.github.onograph.server.EntryPointImpl();
    int int13 = entryPointImpl8.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl12);
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl12.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority15 = entryPointImpl12.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority16 = entryPointImpl12.getPriority();
    int int17 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl12);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl8",
        (entryPointImpl3.compareTo(entryPointImpl8) == 0) == entryPointImpl3.equals(
            entryPointImpl8));
  }

  @Test
  public void test56() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test56");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    int int5 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl9 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl10 = new io.github.onograph.server.EntryPointImpl();
    int int11 = entryPointImpl9.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    int int12 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl10);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl9",
        (entryPointImpl0.compareTo(entryPointImpl9) == 0) == entryPointImpl0.equals(
            entryPointImpl9));
  }

  @Test
  public void test57() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test57");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl7 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl8 = new io.github.onograph.server.EntryPointImpl();
    int int9 = entryPointImpl7.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl7.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority11 = entryPointImpl7.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl12 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl12.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl12.getPriority();
    int int15 = entryPointImpl7.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl12);
    int int16 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl12);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl7",
        (entryPointImpl3.compareTo(entryPointImpl7) == 0) == entryPointImpl3.equals(
            entryPointImpl7));
  }

  @Test
  public void test58() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test58");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority4 = entryPointImpl3.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl3.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl3.getPriority();
    int int7 = entryPointImpl1.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl1.getPriority();
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl0 and entryPointImpl3",
        (entryPointImpl0.compareTo(entryPointImpl3) == 0) == entryPointImpl0.equals(
            entryPointImpl3));
  }

  @Test
  public void test59() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test59");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    int int2 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl4.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl4.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl8 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl8.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority10 = entryPointImpl8.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    int int12 = entryPointImpl8.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl11);
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl8.getPriority();
    int int14 = entryPointImpl4.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    int int15 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl8);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl1 and entryPointImpl4",
        (entryPointImpl1.compareTo(entryPointImpl4) == 0) == entryPointImpl1.equals(
            entryPointImpl4));
  }

  @Test
  public void test60() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test60");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    io.github.onograph.server.EntryPointImpl entryPointImpl1 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl1.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority3 = entryPointImpl1.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl4 = new io.github.onograph.server.EntryPointImpl();
    int int5 = entryPointImpl1.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl4);
    org.neo4j.server.startup.EntryPoint.Priority priority6 = entryPointImpl1.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl1.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl1.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl1.getPriority();
    int int10 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl1);
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl11.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl14 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority15 = entryPointImpl14.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority16 = entryPointImpl14.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority17 = entryPointImpl14.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl18 = new io.github.onograph.server.EntryPointImpl();
    int int19 = entryPointImpl14.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl18);
    int int20 = entryPointImpl11.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl14);
    int int21 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl11);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl1 and entryPointImpl4",
        (entryPointImpl1.compareTo(entryPointImpl4) == 0) == entryPointImpl1.equals(
            entryPointImpl4));
  }

  @Test
  public void test61() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModErrTest0.test61");
    }
    io.github.onograph.server.EntryPointImpl entryPointImpl0 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority1 = entryPointImpl0.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority2 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl3 = new io.github.onograph.server.EntryPointImpl();
    int int4 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl3);
    org.neo4j.server.startup.EntryPoint.Priority priority5 = entryPointImpl0.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl6 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority7 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority8 = entryPointImpl6.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority9 = entryPointImpl6.getPriority();
    int int10 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl6);
    io.github.onograph.server.EntryPointImpl entryPointImpl11 = new io.github.onograph.server.EntryPointImpl();
    org.neo4j.server.startup.EntryPoint.Priority priority12 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority13 = entryPointImpl11.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority14 = entryPointImpl11.getPriority();
    io.github.onograph.server.EntryPointImpl entryPointImpl15 = new io.github.onograph.server.EntryPointImpl();
    int int16 = entryPointImpl11.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl15);
    org.neo4j.server.startup.EntryPoint.Priority priority17 = entryPointImpl15.getPriority();
    org.neo4j.server.startup.EntryPoint.Priority priority18 = entryPointImpl15.getPriority();
    int int19 = entryPointImpl0.compareTo((org.neo4j.server.startup.EntryPoint) entryPointImpl15);
    org.junit.Assert.assertFalse(
        "Contract failed: compareTo-equals on entryPointImpl3 and entryPointImpl6",
        (entryPointImpl3.compareTo(entryPointImpl6) == 0) == entryPointImpl3.equals(
            entryPointImpl6));
  }
}

