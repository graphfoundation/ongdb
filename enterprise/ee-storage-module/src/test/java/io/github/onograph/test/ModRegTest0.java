package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModRegTest0 {

  public static boolean debug = false;

  @Test
  public void test0001() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0001");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitConf.PX_LIMT_UID_BXS;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 50 + "'", int0 == 50);
  }

  @Test
  public void test0002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0002");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.v400.RelationshipGroupRecordFormat.INCS_OUT_BX;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
  }

  @Test
  public void test0003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0003");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(
        (long) (byte) 10, (long) (byte) 1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
  }

  @Test
  public void test0004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0004");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.v400.V400.DST_VX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HL4.0.0" + "'", str0, "HL4.0.0");
  }

  @Test
  public void test0005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0005");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        0);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0006");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.v400.RelationshipGroupRecordFormat.INCS_LOO_BX;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
  }

  @Test
  public void test0007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0007");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction0 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.INT_STORE_HEADER_READER;
    org.junit.Assert.assertNotNull(storeHeaderFunction0);
  }

  @Test
  public void test0008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0008");
    }
    int int0 = org.neo4j.kernel.impl.store.format.RecordFormat.NO_RECORD_SIZE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test0009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0009");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(
        (long) (byte) -1, (long) 100);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
  }

  @Test
  public void test0010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0010");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat.RC_TOT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
  }

  @Test
  public void test0011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0011");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.toable(
        (long) 'a', (long) (byte) -1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 96L + "'", long2 == 96L);
  }

  @Test
  public void test0012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0012");
    }
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats0 = io.github.onograph.kernel.srv.store.format.highlimit.v320.V320.RCD_FMXS;
    org.junit.Assert.assertNotNull(recordFormats0);
  }

  @Test
  public void test0013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0013");
    }
    org.neo4j.io.pagecache.PageCursor pageCursor1 = null;
    try {
      io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.enoForPa(0L,
          pageCursor1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0014");
    }
    int int0 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.IN_USE_BIT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test0015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0015");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitConf.REL_TPX_HTOK_LIMT_UID_BXS;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24 + "'", int0 == 24);
  }

  @Test
  public void test0016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0016");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.v300.V300.DST_VX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vE.H.0" + "'", str0, "vE.H.0");
  }

  @Test
  public void test0017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0017");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.v400.RelationshipGroupRecordFormat.INCS_IN_BX;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
  }

  @Test
  public void test0018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0018");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat.V_INCS_FLW_BX;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
  }

  @Test
  public void test0019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0019");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 1,
        (long) (byte) 1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
  }

  @Test
  public void test0020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0020");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.AbstractHighLimitRecordFormat.HDX_BX_FXD_RFD;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
  }

  @Test
  public void test0021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0021");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum highLimitEncEnum0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_3;
    org.junit.Assert.assertTrue("'" + highLimitEncEnum0 + "' != '"
            + io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_3 + "'",
        highLimitEncEnum0.equals(
            io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_3));
  }

  @Test
  public void test0022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0022");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat.RC_TOT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
  }

  @Test
  public void test0023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0023");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat.PROP_B_IDNT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
  }

  @Test
  public void test0024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0024");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat.RC_TOT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 48 + "'", int0 == 48);
  }

  @Test
  public void test0025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0025");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat.V_INCS_LOO_BX;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
  }

  @Test
  public void test0026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0026");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.AbstractHighLimitRecordFormat.HDX_BX_FXD_RFD;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
  }

  @Test
  public void test0027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0027");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.v320.V320.TITLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "high_limitV3_2_0" + "'", str0,
        "high_limitV3_2_0");
  }

  @Test
  public void test0028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0028");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.v340.V340.DST_VX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vE.H.4" + "'", str0, "vE.H.4");
  }

  @Test
  public void test0029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0029");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction0 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.INT_STORE_HEADER_READER;
    org.junit.Assert.assertNotNull(storeHeaderFunction0);
  }

  @Test
  public void test0030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0030");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.v320.V320.DST_VX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vE.H.3" + "'", str0, "vE.H.3");
  }

  @Test
  public void test0031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0031");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat.INCS_C1_FLW_FLW_BX;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
  }

  @Test
  public void test0032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0032");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = null;
    try {
      long long2 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0033");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord1 = relationshipRecordFormat0.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor2 = null;
    try {
      boolean boolean3 = relationshipRecordFormat0.isInUse(pageCursor2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecord1);
  }

  @Test
  public void test0034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0034");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (int) (short) 10);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0035");
    }
    int int0 = org.neo4j.kernel.impl.store.format.RecordFormats.NO_GENERATION;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
  }

  @Test
  public void test0036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0036");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.io.pagecache.PageCursor pageCursor1 = null;
    try {
      boolean boolean2 = relationshipGroupHighLimitRecordFormat0.isInUse(pageCursor1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0037");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitRecordFormats.DST_VX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HL4.3.0" + "'", str0, "HL4.3.0");
  }

  @Test
  public void test0038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0038");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord6 = null;
    try {
      int int7 = nodeRecordFormat0.rerdtlgForRE(nodeRecord6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
  }

  @Test
  public void test0039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0039");
    }
    int int0 = org.neo4j.kernel.impl.store.format.RecordFormat.NO_RECORD_SIZE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test0040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0040");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitConf.REL_GRP_LIMT_UID_BXS;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 50 + "'", int0 == 50);
  }

  @Test
  public void test0041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0041");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitConf.DYAC_LIMT_UID_BXS;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 50 + "'", int0 == 50);
  }

  @Test
  public void test0042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0042");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum highLimitEncEnum0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_6;
    org.junit.Assert.assertTrue("'" + highLimitEncEnum0 + "' != '"
            + io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_6 + "'",
        highLimitEncEnum0.equals(
            io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_6));
  }

  @Test
  public void test0043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0043");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    try {
      int int2 = nodeRecordFormat0.rerdtlgForRE(nodeRecord1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0044");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.v340.V340.TITLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "high_limitV3_4_0" + "'", str0,
        "high_limitV3_4_0");
  }

  @Test
  public void test0045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0045");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    try {
      int int3 = relationshipGroupHighLimitRecordFormat0.getPageSize((int) (short) 10,
          (int) (byte) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ArithmeticException; message: / by zero");
    } catch (java.lang.ArithmeticException e) {
    }
  }

  @Test
  public void test0046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0046");
    }
    int int0 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.IN_USE_BIT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test0047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0047");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        16);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0048");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitConf.STD_LIMT_BXS_PER_UID;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 50 + "'", int0 == 50);
  }

  @Test
  public void test0049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0049");
    }
    int int0 = org.neo4j.kernel.impl.store.format.RecordFormat.NO_RECORD_SIZE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test0050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0050");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction0 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.INT_STORE_HEADER_READER;
    org.junit.Assert.assertNotNull(storeHeaderFunction0);
  }

  @Test
  public void test0051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0051");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord3 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor4 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad5 = null;
    try {
      propertyRecordFormat0.read(propertyRecord3, pageCursor4, recordLoad5, (int) '#',
          (int) (byte) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
  }

  @Test
  public void test0052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0052");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitConf.ND_LIMT_UID_BXS;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 50 + "'", int0 == 50);
  }

  @Test
  public void test0053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0053");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord3 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor4 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad5 = null;
    try {
      recordFormatDynamicRecordImpl0.read(dynamicRecord3, pageCursor4, recordLoad5, 100, 4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0054");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        24);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord2 = null;
    try {
      int int3 = nodeHighLimitRecordFormat1.rerdtlgForRE(nodeRecord2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0055");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        64);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0056");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord1 = null;
    org.neo4j.internal.id.IdSequence idSequence3 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext4 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord1, (int) (byte) 0,
          idSequence3, cursorContext4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0057");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        24);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord2 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor3 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad4 = null;
    try {
      nodeHighLimitRecordFormat1.read(nodeRecord2, pageCursor3, recordLoad4, 24, 4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0058");
    }
    int int0 = org.neo4j.kernel.impl.store.format.RecordFormat.NO_RECORD_SIZE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test0059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0059");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor7 = null;
    try {
      propertyRecordFormat0.write(propertyRecord6, pageCursor7, 0, 52);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0060");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.io.pagecache.PageCursor pageCursor1 = null;
    try {
      boolean boolean2 = propertyRecordFormat0.isInUse(pageCursor1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0061");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor2 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad3 = null;
    try {
      propertyOneByteHeaderRecordFormat0.read(propertyRecord1, pageCursor2, recordLoad3,
          (int) (byte) 0, (int) (byte) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0062");
    }
    org.neo4j.internal.batchimport.BatchImporterFactory batchImporterFactory0 = org.neo4j.internal.batchimport.BatchImporterFactory.withHighestPriority();
    org.junit.Assert.assertNotNull(batchImporterFactory0);
  }

  @Test
  public void test0063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0063");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.v306.V306.TITLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "high_limitV3_0_6" + "'", str0,
        "high_limitV3_0_6");
  }

  @Test
  public void test0064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0064");
    }
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats0 = io.github.onograph.kernel.srv.store.format.highlimit.v400.V400.RCD_FMXS;
    org.junit.Assert.assertNotNull(recordFormats0);
  }

  @Test
  public void test0065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0065");
    }
    int int1 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.leg(
        (long) (byte) 100);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
  }

  @Test
  public void test0066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0066");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(
        (long) (short) 0, 1L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
  }

  @Test
  public void test0067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0067");
    }
    int int0 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.IN_USE_BIT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test0068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0068");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction0 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.INT_STORE_HEADER_READER;
    org.junit.Assert.assertNotNull(storeHeaderFunction0);
  }

  @Test
  public void test0069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0069");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat.INCS_C2_FLW_FLW_BX;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
  }

  @Test
  public void test0070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0070");
    }
    int int0 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.IN_USE_BIT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test0071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0071");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(
        1125899906842623L, (long) 10);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842623L + "'",
        long2 == 1125899906842623L);
  }

  @Test
  public void test0072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0072");
    }
    int int0 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.IN_USE_BIT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test0073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0073");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat1 = v306_0.node();
    java.lang.String str2 = v306_0.introductionVersion();
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3.0.6" + "'", str2, "3.0.6");
  }

  @Test
  public void test0074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0074");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord1 = null;
    long long2 = relationshipGroupHighLimitRecordFormat0.getNextRecordReference(
        relationshipGroupRecord1);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor4 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad5 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.read(relationshipGroupRecord3, pageCursor4,
          recordLoad5, 52, (int) (byte) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
  }

  @Test
  public void test0075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0075");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitConf.PX_HTOK_LIMT_UID_BXS;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24 + "'", int0 == 24);
  }

  @Test
  public void test0076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0076");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord3 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor4 = null;
    try {
      recordFormatDynamicRecordImpl0.write(dynamicRecord3, pageCursor4, 50, 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test0077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0077");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction0 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.INT_STORE_HEADER_READER;
    org.junit.Assert.assertNotNull(storeHeaderFunction0);
  }

  @Test
  public void test0078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0078");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    org.neo4j.io.pagecache.PageCursor pageCursor1 = null;
    try {
      boolean boolean2 = recordFormatDynamicRecordImpl0.isInUse(pageCursor1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0079");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    org.neo4j.io.pagecache.PageCursor pageCursor2 = null;
    try {
      boolean boolean3 = relationshipGroupHighLimitRecordFormat0.isInUse(pageCursor2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
  }

  @Test
  public void test0080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0080");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord3 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor4 = null;
    try {
      propertyRecordFormat0.write(propertyRecord3, pageCursor4, 50, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
  }

  @Test
  public void test0081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0081");
    }
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats0 = io.github.onograph.kernel.srv.store.format.highlimit.v306.V306.RCD_FMXS;
    org.junit.Assert.assertNotNull(recordFormats0);
  }

  @Test
  public void test0082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0082");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord2 = null;
    long long3 = relationshipGroupHighLimitRecordFormat1.getNextRecordReference(
        relationshipGroupRecord2);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord4 = relationshipGroupHighLimitRecordFormat1.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor5 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord4, pageCursor5,
          (int) '#', (int) '#');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord4);
  }

  @Test
  public void test0083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0083");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord1 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor2 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord1, pageCursor2, 32,
          (int) '4');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0084");
    }
    int int0 = org.neo4j.kernel.impl.store.format.RecordFormat.NO_RECORD_SIZE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test0085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0085");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    long long3 = recordFormatDynamicRecordImpl0.getMaxId();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    try {
      int int5 = recordFormatDynamicRecordImpl0.getRecordSize(storeHeader4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
  }

  @Test
  public void test0086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0086");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.torete(
        (long) (short) 1, (long) 32);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
  }

  @Test
  public void test0087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0087");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord1 = relationshipRecordFormat0.newRecord();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord2 = relationshipRecordFormat0.newRecord();
    try {
      int int5 = relationshipRecordFormat0.getPageSize(0, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ArithmeticException; message: / by zero");
    } catch (java.lang.ArithmeticException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecord1);
    org.junit.Assert.assertNotNull(relationshipRecord2);
  }

  @Test
  public void test0088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0088");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.v310.V310.DST_VX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vE.H.2" + "'", str0, "vE.H.2");
  }

  @Test
  public void test0089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0089");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor2 = null;
    try {
      propertyOneByteHeaderRecordFormat0.write(propertyRecord1, pageCursor2, 8, (int) (short) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0090");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord1 = null;
    long long2 = relationshipGroupHighLimitRecordFormat0.getNextRecordReference(
        relationshipGroupRecord1);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord4 = null;
    long long5 = relationshipGroupHighLimitRecordFormat3.getNextRecordReference(
        relationshipGroupRecord4);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord6 = relationshipGroupHighLimitRecordFormat3.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor7 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord6, pageCursor7, 16, 48);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord6);
  }

  @Test
  public void test0091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0091");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.AbstractHighLimitRecordFormat.HDX_BX_FXD_RFD;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
  }

  @Test
  public void test0092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0092");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.AbstractHighLimitRecordFormat.HDX_BX_FXD_RFD;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
  }

  @Test
  public void test0093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0093");
    }
    org.neo4j.io.pagecache.PageCursor pageCursor0 = null;
    try {
      long long1 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.deoForPa(
          pageCursor0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0094");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    long long3 = propertyRecordFormat0.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord4 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor5 = null;
    try {
      propertyRecordFormat0.write(propertyRecord4, pageCursor5, (int) (byte) 1, 52);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
  }

  @Test
  public void test0095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0095");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.v310.V310.TITLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "high_limitV3_1_0" + "'", str0,
        "high_limitV3_1_0");
  }

  @Test
  public void test0096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0096");
    }
    int int0 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.IN_USE_BIT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test0097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0097");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat1 = v306_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat2 = v306_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat3 = v306_0.property();
    org.neo4j.storageengine.api.format.Capability capability4 = null;
    boolean boolean5 = v306_0.hasCapability(capability4);
    org.neo4j.storageengine.api.format.Capability[] capabilityArray6 = v306_0.capabilities();
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat1);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat2);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(capabilityArray6);
  }

  @Test
  public void test0098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0098");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor6 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord5, pageCursor6,
          (int) (byte) -1, (int) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
  }

  @Test
  public void test0099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0099");
    }
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats0 = io.github.onograph.kernel.srv.store.format.highlimit.v310.V310.RCD_FMXS;
    org.junit.Assert.assertNotNull(recordFormats0);
  }

  @Test
  public void test0100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0100");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord1 = null;
    long long2 = relationshipGroupHighLimitRecordFormat0.getNextRecordReference(
        relationshipGroupRecord1);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = relationshipGroupHighLimitRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = null;
    long long6 = relationshipGroupHighLimitRecordFormat4.getNextRecordReference(
        relationshipGroupRecord5);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord7 = relationshipGroupHighLimitRecordFormat4.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor8 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad9 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.read(relationshipGroupRecord7, pageCursor8,
          recordLoad9, 10, (int) (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord3);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord7);
  }

  @Test
  public void test0101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0101");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction0 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.INT_STORE_HEADER_READER;
    org.junit.Assert.assertNotNull(storeHeaderFunction0);
  }

  @Test
  public void test0102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0102");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitConf.REL_LIMT_UID_BXS;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 50 + "'", int0 == 50);
  }

  @Test
  public void test0103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0103");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 'a',
        (long) (byte) 0);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
  }

  @Test
  public void test0104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0104");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat.RC_TOT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
  }

  @Test
  public void test0105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0105");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader6 = null;
    int int7 = nodeRecordFormat0.getRecordSize(storeHeader6);
    int int10 = nodeRecordFormat0.getPageSize(100, (int) (byte) -1);
    int int13 = nodeRecordFormat0.getPageSize(4, 24);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
  }

  @Test
  public void test0106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0106");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 100,
        (long) 'a');
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
  }

  @Test
  public void test0107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0107");
    }
    int int1 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.leg(101L);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
  }

  @Test
  public void test0108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0108");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean8 = propertyRecordFormat0.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = null;
    try {
      long long10 = propertyRecordFormat0.getNextRecordReference(propertyRecord9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0109");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum highLimitEncEnum0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_4;
    org.junit.Assert.assertTrue("'" + highLimitEncEnum0 + "' != '"
            + io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_4 + "'",
        highLimitEncEnum0.equals(
            io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_4));
  }

  @Test
  public void test0110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0110");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.v400.V400.TITLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "high_limitV4_0_0" + "'", str0,
        "high_limitV4_0_0");
  }

  @Test
  public void test0111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0111");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    long long3 = recordFormatDynamicRecordImpl0.getMaxId();
    int int6 = recordFormatDynamicRecordImpl0.getPageSize(64, 48);
    org.neo4j.io.pagecache.PageCursor pageCursor7 = null;
    try {
      boolean boolean8 = recordFormatDynamicRecordImpl0.isInUse(pageCursor7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
  }

  @Test
  public void test0112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0112");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitRecordFormats.TITLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "high_limit" + "'", str0, "high_limit");
  }

  @Test
  public void test0113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0113");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean8 = propertyRecordFormat0.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = null;
    org.neo4j.internal.id.IdSequence idSequence11 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext12 = null;
    propertyRecordFormat0.prepare(propertyRecord9, (int) (short) 0, idSequence11, cursorContext12);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord14 = null;
    try {
      long long15 = propertyRecordFormat0.getNextRecordReference(propertyRecord14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0114");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 0,
        (long) (short) 0);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
  }

  @Test
  public void test0115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0115");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        10);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0116");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (int) (short) 10);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0117");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 48,
        96L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 112L + "'", long2 == 112L);
  }

  @Test
  public void test0118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0118");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.toable(
        (long) (short) 10, (long) 128);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
  }

  @Test
  public void test0119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0119");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (int) (short) 0);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0120");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(
        (long) (short) -1, 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
  }

  @Test
  public void test0121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0121");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) '#',
        (long) (-1));
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
  }

  @Test
  public void test0122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0122");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v300_1.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat3 = v300_1.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_0,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1, capabilityType4);
    org.neo4j.storageengine.api.format.Capability[] capabilityArray6 = v306_0.capabilities();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat7 = v306_0.propertyKeyToken();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(capabilityArray6);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat7);
  }

  @Test
  public void test0123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0123");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = null;
    try {
      long long2 = propertyRecordFormat0.getNextRecordReference(propertyRecord1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0124");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum highLimitEncEnum0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_7;
    java.lang.Class<?> wildcardClass1 = highLimitEncEnum0.getClass();
    org.junit.Assert.assertTrue("'" + highLimitEncEnum0 + "' != '"
            + io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_7 + "'",
        highLimitEncEnum0.equals(
            io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_7));
    org.junit.Assert.assertNotNull(wildcardClass1);
  }

  @Test
  public void test0125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0125");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (int) (short) 1);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0126");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor2 = null;
    try {
      propertyOneByteHeaderRecordFormat0.write(propertyRecord1, pageCursor2, (-1), 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0127");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = null;
    try {
      long long7 = propertyRecordFormat0.getNextRecordReference(propertyRecord6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0128");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.v400.RelationshipGroupRecordFormat.INCS_FLW_BX;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
  }

  @Test
  public void test0129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0129");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.torete(
        (long) 64, (long) 24);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-40L) + "'", long2 == (-40L));
  }

  @Test
  public void test0130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0130");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    int int1 = propertyRecordFormat0.getRecordHeaderSize();
    int int2 = propertyRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord3 = null;
    try {
      long long4 = propertyRecordFormat0.getNextRecordReference(propertyRecord3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
  }

  @Test
  public void test0131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0131");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader6 = null;
    int int7 = nodeRecordFormat0.getRecordSize(storeHeader6);
    int int10 = nodeRecordFormat0.getPageSize((int) ' ', 4);
    org.neo4j.io.pagecache.PageCursor pageCursor11 = null;
    try {
      boolean boolean12 = nodeRecordFormat0.isInUse(pageCursor11);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
  }

  @Test
  public void test0132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0132");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor7 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad8 = null;
    try {
      propertyRecordFormat0.read(propertyRecord6, pageCursor7, recordLoad8, 35, (int) (short) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0133");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.v300.V300.TITLE;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "high_limitV3_0_0" + "'", str0,
        "high_limitV3_0_0");
  }

  @Test
  public void test0134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0134");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        24);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0135");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat1 = v306_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat2 = v306_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat3 = v306_0.dynamic();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat4 = v306_0.node();
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat1);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat2);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat3);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat4);
  }

  @Test
  public void test0136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0136");
    }
    io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory enterpriseBatchImporterFactory0 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory();
    org.neo4j.io.layout.DatabaseLayout databaseLayout1 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer3 = null;
    org.neo4j.internal.batchimport.Configuration configuration4 = null;
    org.neo4j.logging.internal.LogService logService5 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor6 = null;
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds7 = null;
    org.neo4j.configuration.Config config8 = null;
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_9 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat10 = v310_9.labelToken();
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor11 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler12 = null;
    org.neo4j.internal.batchimport.input.Collector collector13 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer14 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory15 = null;
    org.neo4j.memory.MemoryTracker memoryTracker16 = null;
    try {
      org.neo4j.internal.batchimport.BatchImporter batchImporter17 = enterpriseBatchImporterFactory0.instantiate(
          databaseLayout1, fileSystemAbstraction2, pageCacheTracer3, configuration4, logService5,
          executionMonitor6, additionalInitialIds7, config8,
          (org.neo4j.kernel.impl.store.format.RecordFormats) v310_9, monitor11, jobScheduler12,
          collector13, logFilesInitializer14, indexImporterFactory15, memoryTracker16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat10);
  }

  @Test
  public void test0137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0137");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long1 = propertyOneByteHeaderRecordFormat0.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord2 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor3 = null;
    try {
      propertyOneByteHeaderRecordFormat0.write(propertyRecord2, pageCursor3, (int) (short) 10,
          (int) (byte) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
  }

  @Test
  public void test0138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0138");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.storageengine.api.format.Capability capability1 = null;
    boolean boolean2 = v310_0.hasCapability(capability1);
    int int3 = v310_0.generation();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat4 = v310_0.schema();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat4);
  }

  @Test
  public void test0139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0139");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, 0, idSequence7,
        cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader11 = null;
    int int12 = relationshipGroupRecordFormat10.getRecordSize(storeHeader11);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = relationshipGroupRecordFormat10.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader15 = null;
    int int16 = relationshipGroupRecordFormat14.getRecordSize(storeHeader15);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat17 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long18 = relationshipGroupHighLimitRecordFormat17.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat19 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord20 = null;
    long long21 = relationshipGroupHighLimitRecordFormat19.getNextRecordReference(
        relationshipGroupRecord20);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord22 = relationshipGroupHighLimitRecordFormat19.newRecord();
    org.neo4j.internal.id.IdSequence idSequence24 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext25 = null;
    relationshipGroupHighLimitRecordFormat17.prepare(relationshipGroupRecord22, (int) (byte) 1,
        idSequence24, cursorContext25);
    org.neo4j.internal.id.IdSequence idSequence28 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext29 = null;
    relationshipGroupRecordFormat14.prepare(relationshipGroupRecord22, 0, idSequence28,
        cursorContext29);
    long long31 = relationshipGroupRecordFormat10.getNextRecordReference(relationshipGroupRecord22);
    long long32 = relationshipGroupHighLimitRecordFormat0.getNextRecordReference(
        relationshipGroupRecord22);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat33 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long34 = relationshipGroupHighLimitRecordFormat33.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat35 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord36 = null;
    long long37 = relationshipGroupHighLimitRecordFormat35.getNextRecordReference(
        relationshipGroupRecord36);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord38 = relationshipGroupHighLimitRecordFormat35.newRecord();
    org.neo4j.internal.id.IdSequence idSequence40 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext41 = null;
    relationshipGroupHighLimitRecordFormat33.prepare(relationshipGroupRecord38, 0, idSequence40,
        cursorContext41);
    org.neo4j.io.pagecache.PageCursor pageCursor43 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad44 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.read(relationshipGroupRecord38, pageCursor43,
          recordLoad44, (int) (short) 0, (int) (byte) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    org.junit.Assert.assertNotNull(relationshipGroupRecord13);
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1125899906842623L + "'",
        long18 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord22);
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
    org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1125899906842623L + "'",
        long34 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord38);
  }

  @Test
  public void test0140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0140");
    }
    int int0 = org.neo4j.kernel.impl.store.format.RecordFormat.NO_RECORD_SIZE;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
  }

  @Test
  public void test0141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0141");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v300_1.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat3 = v300_1.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_0,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1, capabilityType4);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat6 = v300_1.relationship();
    boolean boolean8 = v300_1.equals((java.lang.Object) 24);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat9 = v300_1.dynamic();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat9);
  }

  @Test
  public void test0142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0142");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord11 = null;
    long long12 = relationshipGroupHighLimitRecordFormat10.getNextRecordReference(
        relationshipGroupRecord11);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = relationshipGroupHighLimitRecordFormat10.newRecord();
    org.neo4j.internal.id.IdSequence idSequence15 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext16 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord13, 0, idSequence15,
        cursorContext16);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat18 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader19 = null;
    int int20 = relationshipGroupRecordFormat18.getRecordSize(storeHeader19);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord21 = relationshipGroupRecordFormat18.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat22 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader23 = null;
    int int24 = relationshipGroupRecordFormat22.getRecordSize(storeHeader23);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat25 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long26 = relationshipGroupHighLimitRecordFormat25.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat27 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord28 = null;
    long long29 = relationshipGroupHighLimitRecordFormat27.getNextRecordReference(
        relationshipGroupRecord28);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord30 = relationshipGroupHighLimitRecordFormat27.newRecord();
    org.neo4j.internal.id.IdSequence idSequence32 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext33 = null;
    relationshipGroupHighLimitRecordFormat25.prepare(relationshipGroupRecord30, (int) (byte) 1,
        idSequence32, cursorContext33);
    org.neo4j.internal.id.IdSequence idSequence36 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext37 = null;
    relationshipGroupRecordFormat22.prepare(relationshipGroupRecord30, 0, idSequence36,
        cursorContext37);
    long long39 = relationshipGroupRecordFormat18.getNextRecordReference(relationshipGroupRecord30);
    org.neo4j.io.pagecache.PageCursor pageCursor40 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad41 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.read(relationshipGroupRecord30, pageCursor40,
          recordLoad41, (int) (byte) 10, (int) (byte) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord13);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    org.junit.Assert.assertNotNull(relationshipGroupRecord21);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1125899906842623L + "'",
        long26 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord30);
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
  }

  @Test
  public void test0143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0143");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl6 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean8 = recordFormatDynamicRecordImpl6.equals((java.lang.Object) 100.0f);
    int int11 = recordFormatDynamicRecordImpl6.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord12 = recordFormatDynamicRecordImpl6.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor13 = null;
    try {
      recordFormatDynamicRecordImpl0.write(dynamicRecord12, pageCursor13, (int) (short) 100,
          (int) '#');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord12);
  }

  @Test
  public void test0144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0144");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v300_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat2 = v300_0.relationshipTypeToken();
    java.lang.Class<?> wildcardClass3 = v300_0.getClass();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0145");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        0);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0146");
    }
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds0 = null;
    org.neo4j.internal.batchimport.input.Collector collector1 = null;
    org.neo4j.internal.batchimport.Configuration configuration2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout4 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor5 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory7 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler8 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer9 = null;
    org.neo4j.logging.internal.LogService logService10 = null;
    org.neo4j.memory.MemoryTracker memoryTracker11 = null;
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_14 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat15 = v310_14.relationshipGroup();
    try {
      io.github.onograph.internal.batchimport.EnterpriseBatchImporter enterpriseBatchImporter16 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporter(
          additionalInitialIds0, collector1, configuration2, config3, databaseLayout4,
          executionMonitor5, fileSystemAbstraction6, indexImporterFactory7, jobScheduler8,
          logFilesInitializer9, logService10, memoryTracker11, monitor12, pageCacheTracer13,
          (org.neo4j.kernel.impl.store.format.RecordFormats) v310_14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat15);
  }

  @Test
  public void test0147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0147");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat.RC_TOT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 48 + "'", int0 == 48);
  }

  @Test
  public void test0148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0148");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        0);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0149");
    }
    java.lang.String str0 = io.github.onograph.kernel.srv.store.format.highlimit.v306.V306.DST_VX;
    org.junit.Assert.assertEquals("'" + str0 + "' != '" + "vE.H.0b" + "'", str0, "vE.H.0b");
  }

  @Test
  public void test0150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0150");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 1,
        (long) (byte) 1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
  }

  @Test
  public void test0151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0151");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.toable(
        (long) (-1), (long) 16);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
  }

  @Test
  public void test0152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0152");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl6 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean8 = recordFormatDynamicRecordImpl6.equals((java.lang.Object) 100.0f);
    int int11 = recordFormatDynamicRecordImpl6.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord12 = recordFormatDynamicRecordImpl6.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor13 = null;
    try {
      recordFormatDynamicRecordImpl0.write(dynamicRecord12, pageCursor13, 16, (int) ' ');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord12);
  }

  @Test
  public void test0153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0153");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord2 = relationshipHighLimitRecordFormat1.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord4 = relationshipRecordFormat3.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor5 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad6 = null;
    try {
      relationshipHighLimitRecordFormat1.read(relationshipRecord4, pageCursor5, recordLoad6,
          (int) (short) 1, 8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecord2);
    org.junit.Assert.assertNotNull(relationshipRecord4);
  }

  @Test
  public void test0154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0154");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long1 = propertyOneByteHeaderRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader3 = null;
    int int4 = propertyRecordFormat2.getRecordSize(storeHeader3);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl5 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats6 = highLimitFactoryDefaultImpl5.newInstance();
    boolean boolean7 = propertyRecordFormat2.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl5);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean10 = propertyRecordFormat2.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord11 = null;
    org.neo4j.internal.id.IdSequence idSequence13 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext14 = null;
    propertyRecordFormat2.prepare(propertyRecord11, (int) (short) 0, idSequence13, cursorContext14);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat16 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord17 = propertyRecordFormat16.newRecord();
    org.neo4j.internal.id.IdSequence idSequence19 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext20 = null;
    propertyRecordFormat2.prepare(propertyRecord17, 52, idSequence19, cursorContext20);
    org.neo4j.io.pagecache.PageCursor pageCursor22 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad23 = null;
    try {
      propertyOneByteHeaderRecordFormat0.read(propertyRecord17, pageCursor22, recordLoad23,
          (int) (short) 10, (int) ' ');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
    org.junit.Assert.assertNotNull(recordFormats6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(propertyRecord17);
  }

  @Test
  public void test0155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0155");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    int int9 = recordFormatDynamicRecordImpl0.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord10 = recordFormatDynamicRecordImpl0.newRecord();
    long long11 = recordFormatDynamicRecordImpl0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl12 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean14 = recordFormatDynamicRecordImpl12.equals((java.lang.Object) 100.0f);
    int int17 = recordFormatDynamicRecordImpl12.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord18 = recordFormatDynamicRecordImpl12.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl19 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean21 = recordFormatDynamicRecordImpl19.equals((java.lang.Object) 100.0f);
    int int24 = recordFormatDynamicRecordImpl19.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord25 = recordFormatDynamicRecordImpl19.newRecord();
    long long26 = recordFormatDynamicRecordImpl12.getNextRecordReference(dynamicRecord25);
    org.neo4j.io.pagecache.PageCursor pageCursor27 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad28 = null;
    try {
      recordFormatDynamicRecordImpl0.read(dynamicRecord25, pageCursor27, recordLoad28, 24, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord10);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1125899906842623L + "'",
        long11 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord18);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord25);
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
  }

  @Test
  public void test0156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0156");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int3 = recordFormatDynamicRecordImpl0.getPageSize(24, 8);
    try {
      int int6 = recordFormatDynamicRecordImpl0.getPageSize(64, (int) (byte) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ArithmeticException; message: / by zero");
    } catch (java.lang.ArithmeticException e) {
    }
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
  }

  @Test
  public void test0157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0157");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (-1));
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0158");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat.V_INCS_IN_BX;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
  }

  @Test
  public void test0159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0159");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long11 = relationshipGroupHighLimitRecordFormat10.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = null;
    long long14 = relationshipGroupHighLimitRecordFormat12.getNextRecordReference(
        relationshipGroupRecord13);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord15 = relationshipGroupHighLimitRecordFormat12.newRecord();
    org.neo4j.internal.id.IdSequence idSequence17 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext18 = null;
    relationshipGroupHighLimitRecordFormat10.prepare(relationshipGroupRecord15, (int) (byte) 1,
        idSequence17, cursorContext18);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat20 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord21 = null;
    long long22 = relationshipGroupHighLimitRecordFormat20.getNextRecordReference(
        relationshipGroupRecord21);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord23 = relationshipGroupHighLimitRecordFormat20.newRecord();
    org.neo4j.internal.id.IdSequence idSequence25 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext26 = null;
    relationshipGroupHighLimitRecordFormat10.prepare(relationshipGroupRecord23, 0, idSequence25,
        cursorContext26);
    org.neo4j.internal.id.IdSequence idSequence29 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext30 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord23, 128, idSequence29,
        cursorContext30);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat32 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long33 = relationshipGroupHighLimitRecordFormat32.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat34 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord35 = null;
    long long36 = relationshipGroupHighLimitRecordFormat34.getNextRecordReference(
        relationshipGroupRecord35);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord37 = relationshipGroupHighLimitRecordFormat34.newRecord();
    org.neo4j.internal.id.IdSequence idSequence39 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext40 = null;
    relationshipGroupHighLimitRecordFormat32.prepare(relationshipGroupRecord37, (int) (byte) 1,
        idSequence39, cursorContext40);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat42 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord43 = null;
    long long44 = relationshipGroupHighLimitRecordFormat42.getNextRecordReference(
        relationshipGroupRecord43);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord45 = relationshipGroupHighLimitRecordFormat42.newRecord();
    org.neo4j.internal.id.IdSequence idSequence47 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext48 = null;
    relationshipGroupHighLimitRecordFormat32.prepare(relationshipGroupRecord45, 0, idSequence47,
        cursorContext48);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord50 = relationshipGroupHighLimitRecordFormat32.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor51 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord50, pageCursor51, 0,
          (-1));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1125899906842623L + "'",
        long11 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord15);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord23);
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1125899906842623L + "'",
        long33 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord37);
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord45);
    org.junit.Assert.assertNotNull(relationshipGroupRecord50);
  }

  @Test
  public void test0160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0160");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = propertyRecordFormat0.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor2 = null;
    try {
      boolean boolean3 = propertyRecordFormat0.isInUse(pageCursor2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord1);
  }

  @Test
  public void test0161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0161");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat.RC_TOT;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
  }

  @Test
  public void test0162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0162");
    }
    io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory enterpriseBatchImporterFactory0 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory();
    java.lang.String str1 = enterpriseBatchImporterFactory0.getName();
    org.neo4j.io.layout.DatabaseLayout databaseLayout2 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction3 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer4 = null;
    org.neo4j.internal.batchimport.Configuration configuration5 = null;
    org.neo4j.logging.internal.LogService logService6 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor7 = null;
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds8 = null;
    org.neo4j.configuration.Config config9 = null;
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_10 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat11 = v320_10.relationship();
    java.lang.String str12 = v320_10.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat13 = v320_10.property();
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor14 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.internal.batchimport.input.Collector collector16 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer17 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory18 = null;
    org.neo4j.memory.MemoryTracker memoryTracker19 = null;
    try {
      org.neo4j.internal.batchimport.BatchImporter batchImporter20 = enterpriseBatchImporterFactory0.instantiate(
          databaseLayout2, fileSystemAbstraction3, pageCacheTracer4, configuration5, logService6,
          executionMonitor7, additionalInitialIds8, config9,
          (org.neo4j.kernel.impl.store.format.RecordFormats) v320_10, monitor14, jobScheduler15,
          collector16, logFilesInitializer17, indexImporterFactory18, memoryTracker19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "restartable" + "'", str1, "restartable");
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "high_limitV3_2_0" + "'", str12,
        "high_limitV3_2_0");
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat13);
  }

  @Test
  public void test0163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0163");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (int) 'a');
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0164");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    long long3 = propertyRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum highLimitEncEnum4 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8;
    boolean boolean5 = propertyRecordFormat0.equals((java.lang.Object) highLimitEncEnum4);
    org.neo4j.io.pagecache.PageCursor pageCursor6 = null;
    try {
      boolean boolean7 = propertyRecordFormat0.isInUse(pageCursor6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + highLimitEncEnum4 + "' != '"
            + io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8 + "'",
        highLimitEncEnum4.equals(
            io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8));
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0165");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.torete(
        (long) (byte) 1, 97L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 96L + "'", long2 == 96L);
  }

  @Test
  public void test0166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0166");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 16,
        (long) 1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
  }

  @Test
  public void test0167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0167");
    }
    int int1 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.leg(112L);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
  }

  @Test
  public void test0168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0168");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    int int1 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.io.pagecache.PageCursor pageCursor2 = null;
    try {
      boolean boolean3 = nodeRecordFormat0.isInUse(pageCursor2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
  }

  @Test
  public void test0169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0169");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord1 = null;
    long long2 = relationshipGroupHighLimitRecordFormat0.getNextRecordReference(
        relationshipGroupRecord1);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = relationshipGroupHighLimitRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader5 = null;
    int int6 = relationshipGroupRecordFormat4.getRecordSize(storeHeader5);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long8 = relationshipGroupHighLimitRecordFormat7.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord10 = null;
    long long11 = relationshipGroupHighLimitRecordFormat9.getNextRecordReference(
        relationshipGroupRecord10);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord12 = relationshipGroupHighLimitRecordFormat9.newRecord();
    org.neo4j.internal.id.IdSequence idSequence14 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext15 = null;
    relationshipGroupHighLimitRecordFormat7.prepare(relationshipGroupRecord12, (int) (byte) 1,
        idSequence14, cursorContext15);
    org.neo4j.internal.id.IdSequence idSequence18 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext19 = null;
    relationshipGroupRecordFormat4.prepare(relationshipGroupRecord12, 0, idSequence18,
        cursorContext19);
    org.neo4j.internal.id.IdSequence idSequence22 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext23 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord12, (int) '4',
        idSequence22, cursorContext23);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord25 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor26 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad27 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.read(relationshipGroupRecord25, pageCursor26,
          recordLoad27, (int) (short) 10, 24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord3);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1125899906842623L + "'",
        long8 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord12);
  }

  @Test
  public void test0170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0170");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(100L,
        (long) 35);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 103L + "'", long2 == 103L);
  }

  @Test
  public void test0171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0171");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 35,
        1125899906842623L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842623L + "'",
        long2 == 1125899906842623L);
  }

  @Test
  public void test0172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0172");
    }
    io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory enterpriseBatchImporterFactory0 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory();
    org.neo4j.io.layout.DatabaseLayout databaseLayout1 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer3 = null;
    org.neo4j.internal.batchimport.Configuration configuration4 = null;
    org.neo4j.logging.internal.LogService logService5 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor6 = null;
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds7 = null;
    org.neo4j.configuration.Config config8 = null;
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_9 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_10 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat11 = v300_10.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat12 = v300_10.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType13 = null;
    boolean boolean14 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_9,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_10, capabilityType13);
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_15 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat16 = v306_15.node();
    org.neo4j.storageengine.api.format.Capability capability17 = null;
    boolean boolean18 = v306_15.hasCapability(capability17);
    org.neo4j.storageengine.api.format.CapabilityType capabilityType19 = null;
    boolean boolean20 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_10,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_15, capabilityType19);
    org.neo4j.kernel.impl.store.format.RecordFormats[] recordFormatsArray21 = v306_15.compatibleVersionsForRollingUpgrade();
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor22 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler23 = null;
    org.neo4j.internal.batchimport.input.Collector collector24 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer25 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory26 = null;
    org.neo4j.memory.MemoryTracker memoryTracker27 = null;
    try {
      org.neo4j.internal.batchimport.BatchImporter batchImporter28 = enterpriseBatchImporterFactory0.instantiate(
          databaseLayout1, fileSystemAbstraction2, pageCacheTracer3, configuration4, logService5,
          executionMonitor6, additionalInitialIds7, config8,
          (org.neo4j.kernel.impl.store.format.RecordFormats) v306_15, monitor22, jobScheduler23,
          collector24, logFilesInitializer25, indexImporterFactory26, memoryTracker27);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat11);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat12);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat16);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(recordFormatsArray21);
  }

  @Test
  public void test0173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0173");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 35,
        0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
  }

  @Test
  public void test0174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0174");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl7 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean9 = recordFormatDynamicRecordImpl7.equals((java.lang.Object) 100.0f);
    int int12 = recordFormatDynamicRecordImpl7.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord13 = recordFormatDynamicRecordImpl7.newRecord();
    long long14 = recordFormatDynamicRecordImpl0.getNextRecordReference(dynamicRecord13);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl15 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean17 = recordFormatDynamicRecordImpl15.equals((java.lang.Object) 100.0f);
    int int20 = recordFormatDynamicRecordImpl15.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord21 = null;
    org.neo4j.internal.id.IdSequence idSequence23 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext24 = null;
    recordFormatDynamicRecordImpl15.prepare(dynamicRecord21, (int) (byte) -1, idSequence23,
        cursorContext24);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl26 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean28 = recordFormatDynamicRecordImpl26.equals((java.lang.Object) 100.0f);
    int int31 = recordFormatDynamicRecordImpl26.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord32 = recordFormatDynamicRecordImpl26.newRecord();
    long long33 = recordFormatDynamicRecordImpl15.getNextRecordReference(dynamicRecord32);
    org.neo4j.io.pagecache.PageCursor pageCursor34 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad35 = null;
    try {
      recordFormatDynamicRecordImpl0.read(dynamicRecord32, pageCursor34, recordLoad35, (int) '#',
          0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord13);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + int31 + "' != '" + 16 + "'", int31 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord32);
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
  }

  @Test
  public void test0175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0175");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord2 = relationshipHighLimitRecordFormat1.newRecord();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader3 = null;
    int int4 = relationshipHighLimitRecordFormat1.getRecordSize(storeHeader3);
    org.junit.Assert.assertNotNull(relationshipRecord2);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
  }

  @Test
  public void test0176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0176");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord2 = propertyRecordFormat1.newRecord();
    long long3 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord2);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord5 = propertyRecordFormat4.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor6 = null;
    try {
      propertyOneByteHeaderRecordFormat0.write(propertyRecord5, pageCursor6, (int) (byte) 10, 48);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord5);
  }

  @Test
  public void test0177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0177");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v300_1.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat3 = v300_1.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_0,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1, capabilityType4);
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_6 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat7 = v306_6.node();
    org.neo4j.storageengine.api.format.Capability capability8 = null;
    boolean boolean9 = v306_6.hasCapability(capability8);
    org.neo4j.storageengine.api.format.CapabilityType capabilityType10 = null;
    boolean boolean11 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_6, capabilityType10);
    java.lang.String str12 = v306_6.storeVersion();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat13 = v306_6.dynamic();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "vE.H.0b" + "'", str12, "vE.H.0b");
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat13);
  }

  @Test
  public void test0178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0178");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 1,
        10L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
  }

  @Test
  public void test0179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0179");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v300_1.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat3 = v300_1.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_0,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1, capabilityType4);
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_6 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat7 = v306_6.node();
    org.neo4j.storageengine.api.format.Capability capability8 = null;
    boolean boolean9 = v306_6.hasCapability(capability8);
    org.neo4j.storageengine.api.format.CapabilityType capabilityType10 = null;
    boolean boolean11 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_6, capabilityType10);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.MetaDataRecord> metaDataRecordRecordFormat12 = v300_1.metaData();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat13 = v300_1.property();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(metaDataRecordRecordFormat12);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat13);
  }

  @Test
  public void test0180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0180");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(1L,
        (long) 32);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33L + "'", long2 == 33L);
  }

  @Test
  public void test0181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0181");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat1 = v300_0.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat2 = v300_0.relationship();
    java.lang.String str3 = v300_0.storeVersion();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "vE.H.0" + "'", str3, "vE.H.0");
  }

  @Test
  public void test0182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0182");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord11 = null;
    long long12 = relationshipGroupHighLimitRecordFormat10.getNextRecordReference(
        relationshipGroupRecord11);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = relationshipGroupHighLimitRecordFormat10.newRecord();
    org.neo4j.internal.id.IdSequence idSequence15 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext16 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord13, 0, idSequence15,
        cursorContext16);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord18 = relationshipGroupHighLimitRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat19 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader20 = null;
    int int21 = relationshipGroupRecordFormat19.getRecordSize(storeHeader20);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord22 = relationshipGroupRecordFormat19.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor23 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord22, pageCursor23, 1,
          (int) (byte) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord13);
    org.junit.Assert.assertNotNull(relationshipGroupRecord18);
    org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    org.junit.Assert.assertNotNull(relationshipGroupRecord22);
  }

  @Test
  public void test0183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0183");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        24);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0184");
    }
    int int1 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.leg(
        (long) 128);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
  }

  @Test
  public void test0185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0185");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long1 = propertyOneByteHeaderRecordFormat0.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord2 = propertyOneByteHeaderRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long4 = propertyOneByteHeaderRecordFormat3.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord5 = propertyOneByteHeaderRecordFormat3.newRecord();
    long long6 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord5);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord8 = propertyRecordFormat7.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor9 = null;
    try {
      propertyOneByteHeaderRecordFormat0.write(propertyRecord8, pageCursor9, (int) (byte) 0,
          (int) (short) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord2);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1125899906842623L + "'",
        long4 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord5);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord8);
  }

  @Test
  public void test0186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0186");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) ' ',
        (long) (-1));
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
  }

  @Test
  public void test0187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0187");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(15L,
        1125899906842623L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842623L + "'",
        long2 == 1125899906842623L);
  }

  @Test
  public void test0188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0188");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    try {
      int int3 = relationshipRecordFormat0.getPageSize(128, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ArithmeticException; message: / by zero");
    } catch (java.lang.ArithmeticException e) {
    }
  }

  @Test
  public void test0189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0189");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    int int3 = relationshipGroupRecordFormat0.getPageSize((int) 'a', (int) (short) 100);
    long long4 = relationshipGroupRecordFormat0.getMaxId();
    org.neo4j.io.pagecache.PageCursor pageCursor5 = null;
    try {
      boolean boolean6 = relationshipGroupRecordFormat0.isInUse(pageCursor5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1125899906842623L + "'",
        long4 == 1125899906842623L);
  }

  @Test
  public void test0190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0190");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat1 = v300_0.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat2 = v300_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat3 = v300_0.labelToken();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat2);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat3);
  }

  @Test
  public void test0191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0191");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.toable(
        (long) 100, 101L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 201L + "'", long2 == 201L);
  }

  @Test
  public void test0192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0192");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader6 = null;
    int int7 = nodeRecordFormat0.getRecordSize(storeHeader6);
    int int10 = nodeRecordFormat0.getPageSize((int) ' ', 4);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord11 = nodeRecordFormat0.newRecord();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader12 = null;
    int int13 = nodeRecordFormat0.getRecordSize(storeHeader12);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord14 = null;
    try {
      int int15 = nodeRecordFormat0.rerdtlgForRE(nodeRecord14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    org.junit.Assert.assertNotNull(nodeRecord11);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
  }

  @Test
  public void test0193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0193");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v300_1.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat3 = v300_1.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_0,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1, capabilityType4);
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_6 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat7 = v306_6.node();
    org.neo4j.storageengine.api.format.Capability capability8 = null;
    boolean boolean9 = v306_6.hasCapability(capability8);
    org.neo4j.storageengine.api.format.CapabilityType capabilityType10 = null;
    boolean boolean11 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_6, capabilityType10);
    org.neo4j.kernel.impl.store.format.RecordFormats[] recordFormatsArray12 = v306_6.compatibleVersionsForRollingUpgrade();
    java.lang.String str13 = v306_6.introductionVersion();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat14 = v306_6.propertyKeyToken();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(recordFormatsArray12);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3.0.6" + "'", str13, "3.0.6");
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat14);
  }

  @Test
  public void test0194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0194");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) '4',
        (long) 50);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54L + "'", long2 == 54L);
  }

  @Test
  public void test0195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0195");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long2 = relationshipGroupHighLimitRecordFormat1.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord4 = null;
    long long5 = relationshipGroupHighLimitRecordFormat3.getNextRecordReference(
        relationshipGroupRecord4);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord6 = relationshipGroupHighLimitRecordFormat3.newRecord();
    org.neo4j.internal.id.IdSequence idSequence8 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext9 = null;
    relationshipGroupHighLimitRecordFormat1.prepare(relationshipGroupRecord6, (int) (byte) 1,
        idSequence8, cursorContext9);
    long long11 = relationshipGroupHighLimitRecordFormat0.getNextRecordReference(
        relationshipGroupRecord6);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long13 = relationshipGroupHighLimitRecordFormat12.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord15 = null;
    long long16 = relationshipGroupHighLimitRecordFormat14.getNextRecordReference(
        relationshipGroupRecord15);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord17 = relationshipGroupHighLimitRecordFormat14.newRecord();
    org.neo4j.internal.id.IdSequence idSequence19 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext20 = null;
    relationshipGroupHighLimitRecordFormat12.prepare(relationshipGroupRecord17, (int) (byte) 1,
        idSequence19, cursorContext20);
    org.neo4j.io.pagecache.PageCursor pageCursor22 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord17, pageCursor22, 52,
          (int) (short) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842623L + "'",
        long2 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord6);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1125899906842623L + "'",
        long13 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord17);
  }

  @Test
  public void test0196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0196");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader6 = null;
    int int7 = nodeRecordFormat0.getRecordSize(storeHeader6);
    int int10 = nodeRecordFormat0.getPageSize((int) ' ', 4);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord11 = nodeRecordFormat0.newRecord();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader12 = null;
    int int13 = nodeRecordFormat0.getRecordSize(storeHeader12);
    org.neo4j.io.pagecache.PageCursor pageCursor14 = null;
    try {
      boolean boolean15 = nodeRecordFormat0.isInUse(pageCursor14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    org.junit.Assert.assertNotNull(nodeRecord11);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
  }

  @Test
  public void test0197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0197");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v300_1.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat3 = v300_1.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_0,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1, capabilityType4);
    org.neo4j.storageengine.api.format.Capability[] capabilityArray6 = v306_0.capabilities();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat7 = v306_0.relationshipGroup();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(capabilityArray6);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat7);
  }

  @Test
  public void test0198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0198");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v300_1.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat3 = v300_1.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_0,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1, capabilityType4);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat6 = v300_1.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat7 = v300_1.relationship();
    java.lang.String str8 = v300_1.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat9 = v300_1.property();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat6);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "high_limitV3_0_0" + "'", str8,
        "high_limitV3_0_0");
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat9);
  }

  @Test
  public void test0199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0199");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long3 = relationshipGroupHighLimitRecordFormat2.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = null;
    long long6 = relationshipGroupHighLimitRecordFormat4.getNextRecordReference(
        relationshipGroupRecord5);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord7 = relationshipGroupHighLimitRecordFormat4.newRecord();
    org.neo4j.internal.id.IdSequence idSequence9 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext10 = null;
    relationshipGroupHighLimitRecordFormat2.prepare(relationshipGroupRecord7, (int) (byte) 1,
        idSequence9, cursorContext10);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long13 = relationshipGroupHighLimitRecordFormat12.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord15 = null;
    long long16 = relationshipGroupHighLimitRecordFormat14.getNextRecordReference(
        relationshipGroupRecord15);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord17 = relationshipGroupHighLimitRecordFormat14.newRecord();
    org.neo4j.internal.id.IdSequence idSequence19 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext20 = null;
    relationshipGroupHighLimitRecordFormat12.prepare(relationshipGroupRecord17, (int) (byte) 1,
        idSequence19, cursorContext20);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat22 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord23 = null;
    long long24 = relationshipGroupHighLimitRecordFormat22.getNextRecordReference(
        relationshipGroupRecord23);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord25 = relationshipGroupHighLimitRecordFormat22.newRecord();
    org.neo4j.internal.id.IdSequence idSequence27 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext28 = null;
    relationshipGroupHighLimitRecordFormat12.prepare(relationshipGroupRecord25, 0, idSequence27,
        cursorContext28);
    org.neo4j.internal.id.IdSequence idSequence31 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext32 = null;
    relationshipGroupHighLimitRecordFormat2.prepare(relationshipGroupRecord25, 128, idSequence31,
        cursorContext32);
    org.neo4j.io.pagecache.PageCursor pageCursor34 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord25, pageCursor34, 1,
          (int) (byte) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord7);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1125899906842623L + "'",
        long13 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord17);
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord25);
  }

  @Test
  public void test0200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0200");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    long long3 = propertyRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum highLimitEncEnum4 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8;
    boolean boolean5 = propertyRecordFormat0.equals((java.lang.Object) highLimitEncEnum4);
    long long6 = propertyRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long8 = propertyOneByteHeaderRecordFormat7.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = propertyOneByteHeaderRecordFormat7.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long11 = propertyOneByteHeaderRecordFormat10.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord12 = propertyOneByteHeaderRecordFormat10.newRecord();
    long long13 = propertyOneByteHeaderRecordFormat7.getNextRecordReference(propertyRecord12);
    org.neo4j.io.pagecache.PageCursor pageCursor14 = null;
    try {
      propertyRecordFormat0.write(propertyRecord12, pageCursor14, 10, (int) (short) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + highLimitEncEnum4 + "' != '"
            + io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8 + "'",
        highLimitEncEnum4.equals(
            io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8));
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1125899906842623L + "'",
        long6 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1125899906842623L + "'",
        long8 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord9);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1125899906842623L + "'",
        long11 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord12);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
  }

  @Test
  public void test0201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0201");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitConf.LBL_HTOK_LIMT_UID_BXS;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
  }

  @Test
  public void test0202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0202");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    org.neo4j.io.pagecache.PageCursor pageCursor6 = null;
    try {
      boolean boolean7 = propertyRecordFormat0.isInUse(pageCursor6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
  }

  @Test
  public void test0203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0203");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord7 = null;
    long long8 = nodeRecordFormat6.getNextRecordReference(nodeRecord7);
    int int9 = nodeRecordFormat6.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader10 = null;
    int int11 = nodeRecordFormat6.getRecordSize(storeHeader10);
    int int14 = nodeRecordFormat6.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord15 = nodeRecordFormat6.newRecord();
    long long16 = nodeRecordFormat0.getNextRecordReference(nodeRecord15);
    int int19 = nodeRecordFormat0.getPageSize(48, (int) (short) 1);
    int int22 = nodeRecordFormat0.getPageSize(0, (int) (byte) 100);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    org.junit.Assert.assertNotNull(nodeRecord15);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
    org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
  }

  @Test
  public void test0204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0204");
    }
    int int0 = io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat.V_INCS_OUT_BX;
    org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
  }

  @Test
  public void test0205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0205");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0206");
    }
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds0 = null;
    org.neo4j.internal.batchimport.input.Collector collector1 = null;
    org.neo4j.internal.batchimport.Configuration configuration2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout4 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor5 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory7 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler8 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer9 = null;
    org.neo4j.logging.internal.LogService logService10 = null;
    org.neo4j.memory.MemoryTracker memoryTracker11 = null;
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_14 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_15 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat16 = v300_15.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat17 = v300_15.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType18 = null;
    boolean boolean19 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_14,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_15, capabilityType18);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat20 = v300_15.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat21 = v300_15.relationship();
    try {
      io.github.onograph.internal.batchimport.EnterpriseBatchImporter enterpriseBatchImporter22 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporter(
          additionalInitialIds0, collector1, configuration2, config3, databaseLayout4,
          executionMonitor5, fileSystemAbstraction6, indexImporterFactory7, jobScheduler8,
          logFilesInitializer9, logService10, memoryTracker11, monitor12, pageCacheTracer13,
          (org.neo4j.kernel.impl.store.format.RecordFormats) v300_15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat16);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat20);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat21);
  }

  @Test
  public void test0207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0207");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    int int9 = recordFormatDynamicRecordImpl0.getPageSize(48, 35);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl10 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean12 = recordFormatDynamicRecordImpl10.equals((java.lang.Object) 100.0f);
    int int15 = recordFormatDynamicRecordImpl10.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord16 = recordFormatDynamicRecordImpl10.newRecord();
    long long17 = recordFormatDynamicRecordImpl0.getNextRecordReference(dynamicRecord16);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl18 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int21 = recordFormatDynamicRecordImpl18.getPageSize(24, 8);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl22 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean24 = recordFormatDynamicRecordImpl22.equals((java.lang.Object) 100.0f);
    int int27 = recordFormatDynamicRecordImpl22.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord28 = recordFormatDynamicRecordImpl22.newRecord();
    long long29 = recordFormatDynamicRecordImpl18.getNextRecordReference(dynamicRecord28);
    org.neo4j.io.pagecache.PageCursor pageCursor30 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad31 = null;
    try {
      recordFormatDynamicRecordImpl0.read(dynamicRecord28, pageCursor30, recordLoad31, 64, 3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord16);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16 + "'", int27 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord28);
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
  }

  @Test
  public void test0208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0208");
    }
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds0 = null;
    org.neo4j.internal.batchimport.input.Collector collector1 = null;
    org.neo4j.internal.batchimport.Configuration configuration2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout4 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor5 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory7 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler8 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer9 = null;
    org.neo4j.logging.internal.LogService logService10 = null;
    org.neo4j.memory.MemoryTracker memoryTracker11 = null;
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_14 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat15 = v306_14.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat16 = v306_14.labelToken();
    try {
      io.github.onograph.internal.batchimport.EnterpriseBatchImporter enterpriseBatchImporter17 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporter(
          additionalInitialIds0, collector1, configuration2, config3, databaseLayout4,
          executionMonitor5, fileSystemAbstraction6, indexImporterFactory7, jobScheduler8,
          logFilesInitializer9, logService10, memoryTracker11, monitor12, pageCacheTracer13,
          (org.neo4j.kernel.impl.store.format.RecordFormats) v306_14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat15);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat16);
  }

  @Test
  public void test0209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0209");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader3 = null;
    int int4 = nodeRecordFormat2.getRecordSize(storeHeader3);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord5 = nodeRecordFormat2.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor6 = null;
    try {
      nodeHighLimitRecordFormat1.write(nodeRecord5, pageCursor6, 8, 32);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
    org.junit.Assert.assertNotNull(nodeRecord5);
  }

  @Test
  public void test0210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0210");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = null;
    org.neo4j.internal.id.IdSequence idSequence3 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext4 = null;
    propertyRecordFormat0.prepare(propertyRecord1, (int) (short) -1, idSequence3, cursorContext4);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = propertyRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader8 = null;
    int int9 = propertyRecordFormat7.getRecordSize(storeHeader8);
    long long10 = propertyRecordFormat7.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum highLimitEncEnum11 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8;
    boolean boolean12 = propertyRecordFormat7.equals((java.lang.Object) highLimitEncEnum11);
    long long13 = propertyRecordFormat7.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord14 = propertyRecordFormat7.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor15 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad16 = null;
    try {
      propertyRecordFormat0.read(propertyRecord14, pageCursor15, recordLoad16, (int) (byte) 1,
          (int) '4');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1125899906842623L + "'",
        long10 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + highLimitEncEnum11 + "' != '"
            + io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8 + "'",
        highLimitEncEnum11.equals(
            io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8));
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1125899906842623L + "'",
        long13 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord14);
  }

  @Test
  public void test0211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0211");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        8);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0212");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = relationshipGroupRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long4 = relationshipGroupHighLimitRecordFormat3.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat5 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord6 = null;
    long long7 = relationshipGroupHighLimitRecordFormat5.getNextRecordReference(
        relationshipGroupRecord6);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord8 = relationshipGroupHighLimitRecordFormat5.newRecord();
    org.neo4j.internal.id.IdSequence idSequence10 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext11 = null;
    relationshipGroupHighLimitRecordFormat3.prepare(relationshipGroupRecord8, (int) (byte) 1,
        idSequence10, cursorContext11);
    org.neo4j.internal.id.IdSequence idSequence14 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext15 = null;
    relationshipGroupRecordFormat0.prepare(relationshipGroupRecord8, 0, idSequence14,
        cursorContext15);
    org.neo4j.io.pagecache.PageCursor pageCursor17 = null;
    try {
      boolean boolean18 = relationshipGroupRecordFormat0.isInUse(pageCursor17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1125899906842623L + "'",
        long4 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord8);
  }

  @Test
  public void test0213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0213");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat1 = v306_0.node();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily2 = v306_0.getFormatFamily();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily3 = v306_0.getFormatFamily();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat4 = v306_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat5 = v306_0.propertyKeyToken();
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat1);
    org.junit.Assert.assertTrue(
        "'" + formatFamily2 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily2.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
    org.junit.Assert.assertTrue(
        "'" + formatFamily3 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily3.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat4);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat5);
  }

  @Test
  public void test0214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0214");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) '4',
        100L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 116L + "'", long2 == 116L);
  }

  @Test
  public void test0215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0215");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    long long1 = relationshipRecordFormat0.getMaxId();
    try {
      int int4 = relationshipRecordFormat0.getPageSize((int) (byte) 1, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ArithmeticException; message: / by zero");
    } catch (java.lang.ArithmeticException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
  }

  @Test
  public void test0216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0216");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        128);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0217");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    long long3 = propertyRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum highLimitEncEnum4 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8;
    boolean boolean5 = propertyRecordFormat0.equals((java.lang.Object) highLimitEncEnum4);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long7 = propertyOneByteHeaderRecordFormat6.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat8 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord10 = propertyRecordFormat9.newRecord();
    long long11 = propertyOneByteHeaderRecordFormat8.getNextRecordReference(propertyRecord10);
    long long12 = propertyOneByteHeaderRecordFormat6.getNextRecordReference(propertyRecord10);
    org.neo4j.io.pagecache.PageCursor pageCursor13 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad14 = null;
    try {
      propertyRecordFormat0.read(propertyRecord10, pageCursor13, recordLoad14, 0, 2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + highLimitEncEnum4 + "' != '"
            + io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8 + "'",
        highLimitEncEnum4.equals(
            io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8));
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1125899906842623L + "'",
        long7 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord10);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
  }

  @Test
  public void test0218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0218");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = propertyRecordFormat3.getRecordSize(storeHeader4);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl6 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats7 = highLimitFactoryDefaultImpl6.newInstance();
    boolean boolean8 = propertyRecordFormat3.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl6);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean11 = propertyRecordFormat3.equals((java.lang.Object) (short) 100);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord13 = propertyRecordFormat12.newRecord();
    long long14 = propertyRecordFormat3.getNextRecordReference(propertyRecord13);
    org.neo4j.io.pagecache.PageCursor pageCursor15 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad16 = null;
    try {
      propertyRecordFormat0.read(propertyRecord13, pageCursor15, recordLoad16, 128, (int) '#');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
    org.junit.Assert.assertNotNull(recordFormats7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    org.junit.Assert.assertNotNull(propertyRecord13);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
  }

  @Test
  public void test0219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0219");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    int int9 = recordFormatDynamicRecordImpl0.getPageSize(48, 35);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl10 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean12 = recordFormatDynamicRecordImpl10.equals((java.lang.Object) 100.0f);
    int int15 = recordFormatDynamicRecordImpl10.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord16 = recordFormatDynamicRecordImpl10.newRecord();
    long long17 = recordFormatDynamicRecordImpl0.getNextRecordReference(dynamicRecord16);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl18 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean20 = recordFormatDynamicRecordImpl18.equals((java.lang.Object) 100.0f);
    int int23 = recordFormatDynamicRecordImpl18.getPageSize(16, (-1));
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl24 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int27 = recordFormatDynamicRecordImpl24.getPageSize(24, 8);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl28 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean30 = recordFormatDynamicRecordImpl28.equals((java.lang.Object) 100.0f);
    int int33 = recordFormatDynamicRecordImpl28.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord34 = recordFormatDynamicRecordImpl28.newRecord();
    long long35 = recordFormatDynamicRecordImpl24.getNextRecordReference(dynamicRecord34);
    org.neo4j.internal.id.IdSequence idSequence37 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext38 = null;
    recordFormatDynamicRecordImpl18.prepare(dynamicRecord34, 10, idSequence37, cursorContext38);
    org.neo4j.internal.id.IdSequence idSequence41 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext42 = null;
    recordFormatDynamicRecordImpl0.prepare(dynamicRecord34, 35, idSequence41, cursorContext42);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl44 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean46 = recordFormatDynamicRecordImpl44.equals((java.lang.Object) 100.0f);
    int int49 = recordFormatDynamicRecordImpl44.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord50 = recordFormatDynamicRecordImpl44.newRecord();
    int int53 = recordFormatDynamicRecordImpl44.getPageSize(48, 35);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl54 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean56 = recordFormatDynamicRecordImpl54.equals((java.lang.Object) 100.0f);
    int int59 = recordFormatDynamicRecordImpl54.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord60 = recordFormatDynamicRecordImpl54.newRecord();
    long long61 = recordFormatDynamicRecordImpl44.getNextRecordReference(dynamicRecord60);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl62 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean64 = recordFormatDynamicRecordImpl62.equals((java.lang.Object) 100.0f);
    int int67 = recordFormatDynamicRecordImpl62.getPageSize(16, (-1));
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl68 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int71 = recordFormatDynamicRecordImpl68.getPageSize(24, 8);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl72 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean74 = recordFormatDynamicRecordImpl72.equals((java.lang.Object) 100.0f);
    int int77 = recordFormatDynamicRecordImpl72.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord78 = recordFormatDynamicRecordImpl72.newRecord();
    long long79 = recordFormatDynamicRecordImpl68.getNextRecordReference(dynamicRecord78);
    org.neo4j.internal.id.IdSequence idSequence81 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext82 = null;
    recordFormatDynamicRecordImpl62.prepare(dynamicRecord78, 10, idSequence81, cursorContext82);
    org.neo4j.internal.id.IdSequence idSequence85 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext86 = null;
    recordFormatDynamicRecordImpl44.prepare(dynamicRecord78, 35, idSequence85, cursorContext86);
    org.neo4j.io.pagecache.PageCursor pageCursor88 = null;
    try {
      recordFormatDynamicRecordImpl0.write(dynamicRecord78, pageCursor88, (int) (byte) 100, 16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord16);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24 + "'", int27 == 24);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16 + "'", int33 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord34);
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    org.junit.Assert.assertTrue("'" + int49 + "' != '" + 16 + "'", int49 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord50);
    org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    org.junit.Assert.assertTrue("'" + int59 + "' != '" + 16 + "'", int59 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord60);
    org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    org.junit.Assert.assertTrue("'" + int67 + "' != '" + 16 + "'", int67 == 16);
    org.junit.Assert.assertTrue("'" + int71 + "' != '" + 24 + "'", int71 == 24);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    org.junit.Assert.assertTrue("'" + int77 + "' != '" + 16 + "'", int77 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord78);
    org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-1L) + "'", long79 == (-1L));
  }

  @Test
  public void test0220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0220");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long1 = propertyOneByteHeaderRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord3 = null;
    org.neo4j.internal.id.IdSequence idSequence5 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext6 = null;
    propertyRecordFormat2.prepare(propertyRecord3, (int) (short) -1, idSequence5, cursorContext6);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord8 = propertyRecordFormat2.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor9 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad10 = null;
    try {
      propertyOneByteHeaderRecordFormat0.read(propertyRecord8, pageCursor9, recordLoad10,
          (int) (short) -1, (int) (short) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord8);
  }

  @Test
  public void test0221() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0221");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean8 = propertyRecordFormat0.equals((java.lang.Object) (short) 100);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long10 = propertyOneByteHeaderRecordFormat9.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat11 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord13 = propertyRecordFormat12.newRecord();
    long long14 = propertyOneByteHeaderRecordFormat11.getNextRecordReference(propertyRecord13);
    long long15 = propertyOneByteHeaderRecordFormat9.getNextRecordReference(propertyRecord13);
    org.neo4j.io.pagecache.PageCursor pageCursor16 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad17 = null;
    try {
      propertyRecordFormat0.read(propertyRecord13, pageCursor16, recordLoad17, (int) (byte) -1,
          (int) ' ');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1125899906842623L + "'",
        long10 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord13);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
  }

  @Test
  public void test0222() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0222");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    int int8 = nodeRecordFormat0.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord9 = nodeRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_10 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat11 = v306_10.relationship();
    org.neo4j.storageengine.api.format.Capability[] capabilityArray12 = v306_10.capabilities();
    java.lang.String str13 = v306_10.introductionVersion();
    boolean boolean14 = nodeRecordFormat0.equals((java.lang.Object) v306_10);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader15 = null;
    int int16 = nodeRecordFormat0.getRecordSize(storeHeader15);
    int int19 = nodeRecordFormat0.getPageSize(100, 16);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    org.junit.Assert.assertNotNull(nodeRecord9);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat11);
    org.junit.Assert.assertNotNull(capabilityArray12);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3.0.6" + "'", str13, "3.0.6");
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 96 + "'", int19 == 96);
  }

  @Test
  public void test0223() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0223");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 'a',
        (long) (byte) 0);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
  }

  @Test
  public void test0224() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0224");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord7 = null;
    long long8 = nodeRecordFormat6.getNextRecordReference(nodeRecord7);
    int int9 = nodeRecordFormat6.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader10 = null;
    int int11 = nodeRecordFormat6.getRecordSize(storeHeader10);
    int int14 = nodeRecordFormat6.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord15 = nodeRecordFormat6.newRecord();
    long long16 = nodeRecordFormat0.getNextRecordReference(nodeRecord15);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord17 = nodeRecordFormat0.newRecord();
    int int20 = nodeRecordFormat0.getPageSize((int) (short) 0, (int) (byte) -1);
    int int23 = nodeRecordFormat0.getPageSize(100, 3);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    org.junit.Assert.assertNotNull(nodeRecord15);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    org.junit.Assert.assertNotNull(nodeRecord17);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 99 + "'", int23 == 99);
  }

  @Test
  public void test0225() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0225");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat1 = v310_0.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat2 = v310_0.dynamic();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat3 = v310_0.relationshipTypeToken();
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat1);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat2);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat3);
  }

  @Test
  public void test0226() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0226");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 0,
        (long) '4');
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
  }

  @Test
  public void test0227() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0227");
    }
    int int1 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.leg(
        (long) (byte) -1);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
  }

  @Test
  public void test0228() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0228");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(
        (long) (byte) 10, (long) 4);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
  }

  @Test
  public void test0229() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0229");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        128);
  }

  @Test
  public void test0230() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0230");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    int int9 = recordFormatDynamicRecordImpl0.getPageSize(48, 35);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl10 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean12 = recordFormatDynamicRecordImpl10.equals((java.lang.Object) 100.0f);
    int int15 = recordFormatDynamicRecordImpl10.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord16 = recordFormatDynamicRecordImpl10.newRecord();
    long long17 = recordFormatDynamicRecordImpl0.getNextRecordReference(dynamicRecord16);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl18 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean20 = recordFormatDynamicRecordImpl18.equals((java.lang.Object) 100.0f);
    int int23 = recordFormatDynamicRecordImpl18.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord24 = recordFormatDynamicRecordImpl18.newRecord();
    int int27 = recordFormatDynamicRecordImpl18.getPageSize(48, 35);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl28 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean30 = recordFormatDynamicRecordImpl28.equals((java.lang.Object) 100.0f);
    int int33 = recordFormatDynamicRecordImpl28.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord34 = recordFormatDynamicRecordImpl28.newRecord();
    long long35 = recordFormatDynamicRecordImpl18.getNextRecordReference(dynamicRecord34);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl36 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean38 = recordFormatDynamicRecordImpl36.equals((java.lang.Object) 100.0f);
    int int41 = recordFormatDynamicRecordImpl36.getPageSize(16, (-1));
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl42 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int45 = recordFormatDynamicRecordImpl42.getPageSize(24, 8);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl46 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean48 = recordFormatDynamicRecordImpl46.equals((java.lang.Object) 100.0f);
    int int51 = recordFormatDynamicRecordImpl46.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord52 = recordFormatDynamicRecordImpl46.newRecord();
    long long53 = recordFormatDynamicRecordImpl42.getNextRecordReference(dynamicRecord52);
    org.neo4j.internal.id.IdSequence idSequence55 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext56 = null;
    recordFormatDynamicRecordImpl36.prepare(dynamicRecord52, 10, idSequence55, cursorContext56);
    org.neo4j.internal.id.IdSequence idSequence59 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext60 = null;
    recordFormatDynamicRecordImpl18.prepare(dynamicRecord52, 35, idSequence59, cursorContext60);
    org.neo4j.io.pagecache.PageCursor pageCursor62 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad63 = null;
    try {
      recordFormatDynamicRecordImpl0.read(dynamicRecord52, pageCursor62, recordLoad63, 2,
          (int) (short) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord16);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord24);
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16 + "'", int33 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord34);
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + 16 + "'", int41 == 16);
    org.junit.Assert.assertTrue("'" + int45 + "' != '" + 24 + "'", int45 == 24);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    org.junit.Assert.assertTrue("'" + int51 + "' != '" + 16 + "'", int51 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord52);
    org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
  }

  @Test
  public void test0231() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0231");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord11 = null;
    long long12 = relationshipGroupHighLimitRecordFormat10.getNextRecordReference(
        relationshipGroupRecord11);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = relationshipGroupHighLimitRecordFormat10.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader15 = null;
    int int16 = relationshipGroupRecordFormat14.getRecordSize(storeHeader15);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat17 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long18 = relationshipGroupHighLimitRecordFormat17.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat19 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord20 = null;
    long long21 = relationshipGroupHighLimitRecordFormat19.getNextRecordReference(
        relationshipGroupRecord20);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord22 = relationshipGroupHighLimitRecordFormat19.newRecord();
    org.neo4j.internal.id.IdSequence idSequence24 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext25 = null;
    relationshipGroupHighLimitRecordFormat17.prepare(relationshipGroupRecord22, (int) (byte) 1,
        idSequence24, cursorContext25);
    org.neo4j.internal.id.IdSequence idSequence28 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext29 = null;
    relationshipGroupRecordFormat14.prepare(relationshipGroupRecord22, 0, idSequence28,
        cursorContext29);
    org.neo4j.internal.id.IdSequence idSequence32 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext33 = null;
    relationshipGroupHighLimitRecordFormat10.prepare(relationshipGroupRecord22, (int) '4',
        idSequence32, cursorContext33);
    org.neo4j.io.pagecache.PageCursor pageCursor35 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad36 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.read(relationshipGroupRecord22, pageCursor35,
          recordLoad36, 50, 16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord13);
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1125899906842623L + "'",
        long18 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord22);
  }

  @Test
  public void test0232() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0232");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(138L,
        (long) 96);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 234L + "'", long2 == 234L);
  }

  @Test
  public void test0233() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0233");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.torete(
        (long) (-1), (-40L));
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-39L) + "'", long2 == (-39L));
  }

  @Test
  public void test0234() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0234");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = null;
    org.neo4j.internal.id.IdSequence idSequence3 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext4 = null;
    propertyRecordFormat0.prepare(propertyRecord1, (int) (short) -1, idSequence3, cursorContext4);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader7 = null;
    int int8 = propertyRecordFormat6.getRecordSize(storeHeader7);
    long long9 = propertyRecordFormat6.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat11 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord12 = propertyRecordFormat11.newRecord();
    long long13 = propertyOneByteHeaderRecordFormat10.getNextRecordReference(propertyRecord12);
    org.neo4j.internal.id.IdSequence idSequence15 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext16 = null;
    propertyRecordFormat6.prepare(propertyRecord12, 0, idSequence15, cursorContext16);
    org.neo4j.io.pagecache.PageCursor pageCursor18 = null;
    try {
      propertyRecordFormat0.write(propertyRecord12, pageCursor18, (int) (short) 1, 99);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1125899906842623L + "'",
        long9 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord12);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
  }

  @Test
  public void test0235() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0235");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) 'a');
  }

  @Test
  public void test0236() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0236");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        52);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0237() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0237");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    java.lang.String str6 = highLimitFactoryDefaultImpl3.getName();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats7 = highLimitFactoryDefaultImpl3.newInstance();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats8 = highLimitFactoryDefaultImpl3.newInstance();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats9 = highLimitFactoryDefaultImpl3.newInstance();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "high_limitV4_0_0" + "'", str6,
        "high_limitV4_0_0");
    org.junit.Assert.assertNotNull(recordFormats7);
    org.junit.Assert.assertNotNull(recordFormats8);
    org.junit.Assert.assertNotNull(recordFormats9);
  }

  @Test
  public void test0238() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0238");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    int int8 = nodeRecordFormat0.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord9 = nodeRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_10 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat11 = v306_10.relationship();
    org.neo4j.storageengine.api.format.Capability[] capabilityArray12 = v306_10.capabilities();
    java.lang.String str13 = v306_10.introductionVersion();
    boolean boolean14 = nodeRecordFormat0.equals((java.lang.Object) v306_10);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_15 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily16 = v300_15.getFormatFamily();
    boolean boolean17 = v306_10.equals((java.lang.Object) formatFamily16);
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily18 = v306_10.getFormatFamily();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    org.junit.Assert.assertNotNull(nodeRecord9);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat11);
    org.junit.Assert.assertNotNull(capabilityArray12);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3.0.6" + "'", str13, "3.0.6");
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue(
        "'" + formatFamily16 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily16.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue(
        "'" + formatFamily18 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily18.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
  }

  @Test
  public void test0239() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0239");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = propertyRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long3 = propertyOneByteHeaderRecordFormat2.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord4 = propertyOneByteHeaderRecordFormat2.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat5 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long6 = propertyOneByteHeaderRecordFormat5.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord7 = propertyOneByteHeaderRecordFormat5.newRecord();
    long long8 = propertyOneByteHeaderRecordFormat2.getNextRecordReference(propertyRecord7);
    org.neo4j.io.pagecache.PageCursor pageCursor9 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad10 = null;
    try {
      propertyRecordFormat0.read(propertyRecord7, pageCursor9, recordLoad10, 128, (int) (byte) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord1);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord4);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1125899906842623L + "'",
        long6 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord7);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
  }

  @Test
  public void test0240() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0240");
    }
    io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory enterpriseBatchImporterFactory0 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory();
    java.lang.String str1 = enterpriseBatchImporterFactory0.getName();
    org.neo4j.io.layout.DatabaseLayout databaseLayout2 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction3 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer4 = null;
    org.neo4j.internal.batchimport.Configuration configuration5 = null;
    org.neo4j.logging.internal.LogService logService6 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor7 = null;
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds8 = null;
    org.neo4j.configuration.Config config9 = null;
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_10 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat11 = v320_10.dynamic();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat12 = v320_10.property();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat13 = v320_10.property();
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor14 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.internal.batchimport.input.Collector collector16 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer17 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory18 = null;
    org.neo4j.memory.MemoryTracker memoryTracker19 = null;
    try {
      org.neo4j.internal.batchimport.BatchImporter batchImporter20 = enterpriseBatchImporterFactory0.instantiate(
          databaseLayout2, fileSystemAbstraction3, pageCacheTracer4, configuration5, logService6,
          executionMonitor7, additionalInitialIds8, config9,
          (org.neo4j.kernel.impl.store.format.RecordFormats) v320_10, monitor14, jobScheduler15,
          collector16, logFilesInitializer17, indexImporterFactory18, memoryTracker19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "restartable" + "'", str1, "restartable");
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat11);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat12);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat13);
  }

  @Test
  public void test0241() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0241");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v310_0.relationship();
    java.lang.String str2 = v310_0.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat3 = v310_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat4 = v310_0.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormats[] recordFormatsArray5 = v310_0.compatibleVersionsForRollingUpgrade();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "high_limitV3_1_0" + "'", str2,
        "high_limitV3_1_0");
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat3);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat4);
    org.junit.Assert.assertNotNull(recordFormatsArray5);
  }

  @Test
  public void test0242() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0242");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord11 = null;
    long long12 = relationshipGroupHighLimitRecordFormat10.getNextRecordReference(
        relationshipGroupRecord11);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = relationshipGroupHighLimitRecordFormat10.newRecord();
    org.neo4j.internal.id.IdSequence idSequence15 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext16 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord13, 0, idSequence15,
        cursorContext16);
    org.neo4j.io.pagecache.PageCursor pageCursor18 = null;
    try {
      boolean boolean19 = relationshipGroupHighLimitRecordFormat0.isInUse(pageCursor18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord13);
  }

  @Test
  public void test0243() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0243");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 24,
        (long) 10);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
  }

  @Test
  public void test0244() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0244");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 2,
        54L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54L + "'", long2 == 54L);
  }

  @Test
  public void test0245() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0245");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(52L, 234L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 254L + "'", long2 == 254L);
  }

  @Test
  public void test0246() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0246");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v300_1.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat3 = v300_1.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_0,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1, capabilityType4);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat6 = v300_1.schema();
    org.neo4j.storageengine.api.format.Capability capability7 = null;
    boolean boolean8 = v300_1.hasCapability(capability7);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
  }

  @Test
  public void test0247() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0247");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v320_0.relationship();
    java.lang.String str2 = v320_0.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat3 = v320_0.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat4 = v320_0.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat5 = v320_0.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat6 = v320_0.node();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "high_limitV3_2_0" + "'", str2,
        "high_limitV3_2_0");
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat3);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat4);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat5);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat6);
  }

  @Test
  public void test0248() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0248");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord2 = null;
    long long3 = nodeRecordFormat1.getNextRecordReference(nodeRecord2);
    int int4 = nodeRecordFormat1.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader5 = null;
    int int6 = nodeRecordFormat1.getRecordSize(storeHeader5);
    int int9 = nodeRecordFormat1.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord10 = nodeRecordFormat1.newRecord();
    int int11 = nodeRecordFormat0.rerdtlgForRE(nodeRecord10);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord12 = nodeRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat nodeRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord15 = null;
    long long16 = nodeRecordFormat14.getNextRecordReference(nodeRecord15);
    int int17 = nodeRecordFormat14.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader18 = null;
    int int19 = nodeRecordFormat14.getRecordSize(storeHeader18);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat20 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord21 = null;
    long long22 = nodeRecordFormat20.getNextRecordReference(nodeRecord21);
    int int23 = nodeRecordFormat20.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader24 = null;
    int int25 = nodeRecordFormat20.getRecordSize(storeHeader24);
    int int28 = nodeRecordFormat20.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord29 = nodeRecordFormat20.newRecord();
    long long30 = nodeRecordFormat14.getNextRecordReference(nodeRecord29);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord31 = nodeRecordFormat14.newRecord();
    long long32 = nodeRecordFormat13.getNextRecordReference(nodeRecord31);
    int int33 = nodeRecordFormat0.rerdtlgForRE(nodeRecord31);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    org.junit.Assert.assertNotNull(nodeRecord10);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    org.junit.Assert.assertNotNull(nodeRecord12);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    org.junit.Assert.assertTrue("'" + int25 + "' != '" + 16 + "'", int25 == 16);
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    org.junit.Assert.assertNotNull(nodeRecord29);
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
    org.junit.Assert.assertNotNull(nodeRecord31);
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
  }

  @Test
  public void test0249() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0249");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v300_1.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat3 = v300_1.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_0,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1, capabilityType4);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat6 = v300_1.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat7 = v300_1.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat8 = v300_1.relationshipGroup();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat6);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat7);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat8);
  }

  @Test
  public void test0250() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0250");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v320_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat2 = v320_0.relationshipGroup();
    org.neo4j.storageengine.api.format.Capability capability3 = null;
    boolean boolean4 = v320_0.hasCapability(capability3);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat5 = v320_0.propertyKeyToken();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat5);
  }

  @Test
  public void test0251() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0251");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = propertyOneByteHeaderRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader3 = null;
    int int4 = propertyRecordFormat2.getRecordSize(storeHeader3);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl5 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats6 = highLimitFactoryDefaultImpl5.newInstance();
    boolean boolean7 = propertyRecordFormat2.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl5);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean10 = propertyRecordFormat2.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord11 = null;
    org.neo4j.internal.id.IdSequence idSequence13 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext14 = null;
    propertyRecordFormat2.prepare(propertyRecord11, (int) (short) 0, idSequence13, cursorContext14);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat16 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord17 = propertyRecordFormat16.newRecord();
    org.neo4j.internal.id.IdSequence idSequence19 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext20 = null;
    propertyRecordFormat2.prepare(propertyRecord17, 52, idSequence19, cursorContext20);
    org.neo4j.io.pagecache.PageCursor pageCursor22 = null;
    try {
      propertyOneByteHeaderRecordFormat0.write(propertyRecord17, pageCursor22, 8, (-1));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord1);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
    org.junit.Assert.assertNotNull(recordFormats6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(propertyRecord17);
  }

  @Test
  public void test0252() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0252");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord1 = relationshipRecordFormat0.newRecord();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord2 = relationshipRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord5 = relationshipHighLimitRecordFormat4.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipRecordFormat0.prepare(relationshipRecord5, (int) (byte) 100, idSequence7,
        cursorContext8);
    org.neo4j.io.pagecache.PageCursor pageCursor10 = null;
    try {
      boolean boolean11 = relationshipRecordFormat0.isInUse(pageCursor10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecord1);
    org.junit.Assert.assertNotNull(relationshipRecord2);
    org.junit.Assert.assertNotNull(relationshipRecord5);
  }

  @Test
  public void test0253() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0253");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = null;
    org.neo4j.internal.id.IdSequence idSequence3 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext4 = null;
    propertyRecordFormat0.prepare(propertyRecord1, (int) (short) -1, idSequence3, cursorContext4);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long7 = propertyOneByteHeaderRecordFormat6.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord8 = propertyOneByteHeaderRecordFormat6.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor9 = null;
    try {
      propertyRecordFormat0.write(propertyRecord8, pageCursor9, (int) '#', 12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1125899906842623L + "'",
        long7 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord8);
  }

  @Test
  public void test0254() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0254");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    long long3 = propertyRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat5 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = propertyRecordFormat5.newRecord();
    long long7 = propertyOneByteHeaderRecordFormat4.getNextRecordReference(propertyRecord6);
    org.neo4j.internal.id.IdSequence idSequence9 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext10 = null;
    propertyRecordFormat0.prepare(propertyRecord6, 0, idSequence9, cursorContext10);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord12 = propertyRecordFormat0.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord13 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor14 = null;
    try {
      propertyRecordFormat0.write(propertyRecord13, pageCursor14, (int) (byte) 1, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord6);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord12);
  }

  @Test
  public void test0255() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0255");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long1 = propertyOneByteHeaderRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord4 = propertyRecordFormat3.newRecord();
    long long5 = propertyOneByteHeaderRecordFormat2.getNextRecordReference(propertyRecord4);
    long long6 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord4);
    int int9 = propertyOneByteHeaderRecordFormat0.getPageSize(64, (int) (short) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord11 = propertyRecordFormat10.newRecord();
    long long12 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord11);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long14 = propertyOneByteHeaderRecordFormat13.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat15 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat16 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord17 = propertyRecordFormat16.newRecord();
    long long18 = propertyOneByteHeaderRecordFormat15.getNextRecordReference(propertyRecord17);
    long long19 = propertyOneByteHeaderRecordFormat13.getNextRecordReference(propertyRecord17);
    int int22 = propertyOneByteHeaderRecordFormat13.getPageSize(64, (int) (short) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat23 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord24 = propertyRecordFormat23.newRecord();
    long long25 = propertyOneByteHeaderRecordFormat13.getNextRecordReference(propertyRecord24);
    org.neo4j.io.pagecache.PageCursor pageCursor26 = null;
    try {
      propertyOneByteHeaderRecordFormat0.write(propertyRecord24, pageCursor26, (int) (byte) 0,
          (int) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord4);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    org.junit.Assert.assertNotNull(propertyRecord11);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1125899906842623L + "'",
        long14 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord17);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
    org.junit.Assert.assertNotNull(propertyRecord24);
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
  }

  @Test
  public void test0256() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0256");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord11 = null;
    long long12 = relationshipGroupHighLimitRecordFormat10.getNextRecordReference(
        relationshipGroupRecord11);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = relationshipGroupHighLimitRecordFormat10.newRecord();
    org.neo4j.internal.id.IdSequence idSequence15 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext16 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord13, 0, idSequence15,
        cursorContext16);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat18 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long19 = relationshipGroupHighLimitRecordFormat18.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat20 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord21 = null;
    long long22 = relationshipGroupHighLimitRecordFormat20.getNextRecordReference(
        relationshipGroupRecord21);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord23 = relationshipGroupHighLimitRecordFormat20.newRecord();
    org.neo4j.internal.id.IdSequence idSequence25 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext26 = null;
    relationshipGroupHighLimitRecordFormat18.prepare(relationshipGroupRecord23, 0, idSequence25,
        cursorContext26);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat28 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader29 = null;
    int int30 = relationshipGroupRecordFormat28.getRecordSize(storeHeader29);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord31 = relationshipGroupRecordFormat28.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat32 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader33 = null;
    int int34 = relationshipGroupRecordFormat32.getRecordSize(storeHeader33);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat35 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long36 = relationshipGroupHighLimitRecordFormat35.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat37 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord38 = null;
    long long39 = relationshipGroupHighLimitRecordFormat37.getNextRecordReference(
        relationshipGroupRecord38);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord40 = relationshipGroupHighLimitRecordFormat37.newRecord();
    org.neo4j.internal.id.IdSequence idSequence42 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext43 = null;
    relationshipGroupHighLimitRecordFormat35.prepare(relationshipGroupRecord40, (int) (byte) 1,
        idSequence42, cursorContext43);
    org.neo4j.internal.id.IdSequence idSequence46 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext47 = null;
    relationshipGroupRecordFormat32.prepare(relationshipGroupRecord40, 0, idSequence46,
        cursorContext47);
    long long49 = relationshipGroupRecordFormat28.getNextRecordReference(relationshipGroupRecord40);
    long long50 = relationshipGroupHighLimitRecordFormat18.getNextRecordReference(
        relationshipGroupRecord40);
    org.neo4j.internal.id.IdSequence idSequence52 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext53 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord40, 3, idSequence52,
        cursorContext53);
    long long55 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord13);
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1125899906842623L + "'",
        long19 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord23);
    org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    org.junit.Assert.assertNotNull(relationshipGroupRecord31);
    org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1125899906842623L + "'",
        long36 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord40);
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
    org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1125899906842623L + "'",
        long55 == 1125899906842623L);
  }

  @Test
  public void test0257() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0257");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(254L,
        (long) (short) 10);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 254L + "'", long2 == 254L);
  }

  @Test
  public void test0258() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0258");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0259() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0259");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader6 = null;
    int int7 = propertyRecordFormat0.getRecordSize(storeHeader6);
    org.neo4j.io.pagecache.PageCursor pageCursor8 = null;
    try {
      boolean boolean9 = propertyRecordFormat0.isInUse(pageCursor8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
  }

  @Test
  public void test0260() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0260");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat1 = v310_0.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v310_0.labelToken();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat1);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
  }

  @Test
  public void test0261() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0261");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat1 = v306_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat2 = v306_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat3 = v306_0.node();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord4 = nodeRecordRecordFormat3.newRecord();
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat1);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat2);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat3);
    org.junit.Assert.assertNotNull(nodeRecord4);
  }

  @Test
  public void test0262() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0262");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    long long3 = propertyRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum highLimitEncEnum4 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8;
    boolean boolean5 = propertyRecordFormat0.equals((java.lang.Object) highLimitEncEnum4);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = null;
    org.neo4j.internal.id.IdSequence idSequence8 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext9 = null;
    propertyRecordFormat0.prepare(propertyRecord6, 128, idSequence8, cursorContext9);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat11 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long12 = propertyOneByteHeaderRecordFormat11.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord15 = propertyRecordFormat14.newRecord();
    long long16 = propertyOneByteHeaderRecordFormat13.getNextRecordReference(propertyRecord15);
    long long17 = propertyOneByteHeaderRecordFormat11.getNextRecordReference(propertyRecord15);
    int int20 = propertyOneByteHeaderRecordFormat11.getPageSize(64, (int) (short) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat21 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord22 = propertyRecordFormat21.newRecord();
    long long23 = propertyOneByteHeaderRecordFormat11.getNextRecordReference(propertyRecord22);
    org.neo4j.io.pagecache.PageCursor pageCursor24 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad25 = null;
    try {
      propertyRecordFormat0.read(propertyRecord22, pageCursor24, recordLoad25, 0, 50);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + highLimitEncEnum4 + "' != '"
            + io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8 + "'",
        highLimitEncEnum4.equals(
            io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8));
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1125899906842623L + "'",
        long12 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord15);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
    org.junit.Assert.assertNotNull(propertyRecord22);
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
  }

  @Test
  public void test0263() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0263");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long2 = relationshipGroupHighLimitRecordFormat1.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord4 = null;
    long long5 = relationshipGroupHighLimitRecordFormat3.getNextRecordReference(
        relationshipGroupRecord4);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord6 = relationshipGroupHighLimitRecordFormat3.newRecord();
    org.neo4j.internal.id.IdSequence idSequence8 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext9 = null;
    relationshipGroupHighLimitRecordFormat1.prepare(relationshipGroupRecord6, (int) (byte) 1,
        idSequence8, cursorContext9);
    long long11 = relationshipGroupHighLimitRecordFormat0.getNextRecordReference(
        relationshipGroupRecord6);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long13 = relationshipGroupHighLimitRecordFormat12.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord15 = null;
    long long16 = relationshipGroupHighLimitRecordFormat14.getNextRecordReference(
        relationshipGroupRecord15);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord17 = relationshipGroupHighLimitRecordFormat14.newRecord();
    org.neo4j.internal.id.IdSequence idSequence19 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext20 = null;
    relationshipGroupHighLimitRecordFormat12.prepare(relationshipGroupRecord17, (int) (byte) 1,
        idSequence19, cursorContext20);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat22 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord23 = null;
    long long24 = relationshipGroupHighLimitRecordFormat22.getNextRecordReference(
        relationshipGroupRecord23);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord25 = relationshipGroupHighLimitRecordFormat22.newRecord();
    org.neo4j.internal.id.IdSequence idSequence27 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext28 = null;
    relationshipGroupHighLimitRecordFormat12.prepare(relationshipGroupRecord25, 0, idSequence27,
        cursorContext28);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat30 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long31 = relationshipGroupHighLimitRecordFormat30.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat32 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord33 = null;
    long long34 = relationshipGroupHighLimitRecordFormat32.getNextRecordReference(
        relationshipGroupRecord33);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord35 = relationshipGroupHighLimitRecordFormat32.newRecord();
    org.neo4j.internal.id.IdSequence idSequence37 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext38 = null;
    relationshipGroupHighLimitRecordFormat30.prepare(relationshipGroupRecord35, 0, idSequence37,
        cursorContext38);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat40 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader41 = null;
    int int42 = relationshipGroupRecordFormat40.getRecordSize(storeHeader41);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord43 = relationshipGroupRecordFormat40.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat44 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader45 = null;
    int int46 = relationshipGroupRecordFormat44.getRecordSize(storeHeader45);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat47 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long48 = relationshipGroupHighLimitRecordFormat47.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat49 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord50 = null;
    long long51 = relationshipGroupHighLimitRecordFormat49.getNextRecordReference(
        relationshipGroupRecord50);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord52 = relationshipGroupHighLimitRecordFormat49.newRecord();
    org.neo4j.internal.id.IdSequence idSequence54 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext55 = null;
    relationshipGroupHighLimitRecordFormat47.prepare(relationshipGroupRecord52, (int) (byte) 1,
        idSequence54, cursorContext55);
    org.neo4j.internal.id.IdSequence idSequence58 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext59 = null;
    relationshipGroupRecordFormat44.prepare(relationshipGroupRecord52, 0, idSequence58,
        cursorContext59);
    long long61 = relationshipGroupRecordFormat40.getNextRecordReference(relationshipGroupRecord52);
    long long62 = relationshipGroupHighLimitRecordFormat30.getNextRecordReference(
        relationshipGroupRecord52);
    org.neo4j.internal.id.IdSequence idSequence64 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext65 = null;
    relationshipGroupHighLimitRecordFormat12.prepare(relationshipGroupRecord52, 3, idSequence64,
        cursorContext65);
    org.neo4j.internal.id.IdSequence idSequence68 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext69 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord52, 2, idSequence68,
        cursorContext69);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842623L + "'",
        long2 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord6);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1125899906842623L + "'",
        long13 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord17);
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord25);
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1125899906842623L + "'",
        long31 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord35);
    org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
    org.junit.Assert.assertNotNull(relationshipGroupRecord43);
    org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1125899906842623L + "'",
        long48 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord52);
    org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
    org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
  }

  @Test
  public void test0264() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0264");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat1 = v310_0.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat2 = v310_0.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat3 = v310_0.propertyKeyToken();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat2);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat3);
  }

  @Test
  public void test0265() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0265");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord3 = relationshipRecordFormat2.newRecord();
    long long4 = relationshipHighLimitRecordFormat1.getNextRecordReference(relationshipRecord3);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord7 = relationshipHighLimitRecordFormat6.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat8 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader9 = null;
    int int10 = relationshipRecordFormat8.getRecordSize(storeHeader9);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord14 = relationshipRecordFormat13.newRecord();
    long long15 = relationshipHighLimitRecordFormat12.getNextRecordReference(relationshipRecord14);
    org.neo4j.internal.id.IdSequence idSequence17 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext18 = null;
    relationshipRecordFormat8.prepare(relationshipRecord14, 3, idSequence17, cursorContext18);
    org.neo4j.internal.id.IdSequence idSequence21 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext22 = null;
    relationshipHighLimitRecordFormat6.prepare(relationshipRecord14, 0, idSequence21,
        cursorContext22);
    org.neo4j.io.pagecache.PageCursor pageCursor24 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad25 = null;
    try {
      relationshipHighLimitRecordFormat1.read(relationshipRecord14, pageCursor24, recordLoad25, 8,
          48);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecord3);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipRecord7);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    org.junit.Assert.assertNotNull(relationshipRecord14);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
  }

  @Test
  public void test0266() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0266");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean8 = propertyRecordFormat0.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = null;
    org.neo4j.internal.id.IdSequence idSequence11 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext12 = null;
    propertyRecordFormat0.prepare(propertyRecord9, (int) (short) 0, idSequence11, cursorContext12);
    boolean boolean15 = propertyRecordFormat0.equals((java.lang.Object) "3.0.6");
    try {
      int int18 = propertyRecordFormat0.getPageSize(4, (int) (short) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ArithmeticException; message: / by zero");
    } catch (java.lang.ArithmeticException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
  }

  @Test
  public void test0267() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0267");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        1);
    long long2 = relationshipHighLimitRecordFormat1.getMaxId();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842623L + "'",
        long2 == 1125899906842623L);
  }

  @Test
  public void test0268() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0268");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        128);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0269() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0269");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int3 = recordFormatDynamicRecordImpl0.getPageSize(24, 8);
    try {
      int int6 = recordFormatDynamicRecordImpl0.getPageSize(0, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.ArithmeticException; message: / by zero");
    } catch (java.lang.ArithmeticException e) {
    }
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
  }

  @Test
  public void test0270() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0270");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat1 = v306_0.node();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily2 = v306_0.getFormatFamily();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily3 = v306_0.getFormatFamily();
    int int4 = v306_0.generation();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat5 = v306_0.labelToken();
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat1);
    org.junit.Assert.assertTrue(
        "'" + formatFamily2 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily2.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
    org.junit.Assert.assertTrue(
        "'" + formatFamily3 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily3.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat5);
  }

  @Test
  public void test0271() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0271");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat1 = v306_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat2 = v306_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat3 = v306_0.dynamic();
    org.neo4j.kernel.impl.store.format.RecordFormats[] recordFormatsArray4 = v306_0.compatibleVersionsForRollingUpgrade();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat5 = v306_0.relationship();
    org.neo4j.storageengine.api.format.Capability capability6 = null;
    boolean boolean7 = v306_0.hasCapability(capability6);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat1);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat2);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat3);
    org.junit.Assert.assertNotNull(recordFormatsArray4);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
  }

  @Test
  public void test0272() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0272");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(254L, 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 254L + "'", long2 == 254L);
  }

  @Test
  public void test0273() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0273");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl7 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean9 = recordFormatDynamicRecordImpl7.equals((java.lang.Object) 100.0f);
    int int12 = recordFormatDynamicRecordImpl7.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord13 = recordFormatDynamicRecordImpl7.newRecord();
    long long14 = recordFormatDynamicRecordImpl0.getNextRecordReference(dynamicRecord13);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl15 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean17 = recordFormatDynamicRecordImpl15.equals((java.lang.Object) 100.0f);
    int int20 = recordFormatDynamicRecordImpl15.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord21 = recordFormatDynamicRecordImpl15.newRecord();
    int int24 = recordFormatDynamicRecordImpl15.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord25 = recordFormatDynamicRecordImpl15.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor26 = null;
    try {
      recordFormatDynamicRecordImpl0.write(dynamicRecord25, pageCursor26, (-1), (int) (byte) 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord13);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord21);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord25);
  }

  @Test
  public void test0274() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0274");
    }
    org.neo4j.io.pagecache.PageCursor pageCursor1 = null;
    try {
      io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.enoForPa(11L,
          pageCursor1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0275() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0275");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    int int4 = nodeHighLimitRecordFormat1.getPageSize(35, (int) (byte) -1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord5 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor6 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad7 = null;
    try {
      nodeHighLimitRecordFormat1.read(nodeRecord5, pageCursor6, recordLoad7, (int) (byte) -1, 2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
  }

  @Test
  public void test0276() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0276");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    int int9 = recordFormatDynamicRecordImpl0.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord10 = recordFormatDynamicRecordImpl0.newRecord();
    int int13 = recordFormatDynamicRecordImpl0.getPageSize((int) '4', (int) (short) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_14 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat15 = v320_14.relationship();
    boolean boolean16 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) v320_14);
    long long17 = recordFormatDynamicRecordImpl0.getMaxId();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader18 = null;
    try {
      int int19 = recordFormatDynamicRecordImpl0.getRecordSize(storeHeader18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord10);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1125899906842623L + "'",
        long17 == 1125899906842623L);
  }

  @Test
  public void test0277() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0277");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(
        (long) (byte) 0, 138L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
  }

  @Test
  public void test0278() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0278");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v300_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat2 = v300_0.relationshipTypeToken();
    java.lang.String str3 = v300_0.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat4 = v300_0.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat5 = v300_0.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat6 = v300_0.labelToken();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "high_limitV3_0_0" + "'", str3,
        "high_limitV3_0_0");
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat4);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat5);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat6);
  }

  @Test
  public void test0279() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0279");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        64);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0280() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0280");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord2 = propertyRecordFormat1.newRecord();
    long long3 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord2);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat5 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = propertyRecordFormat5.newRecord();
    long long7 = propertyOneByteHeaderRecordFormat4.getNextRecordReference(propertyRecord6);
    long long8 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord6);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long10 = propertyOneByteHeaderRecordFormat9.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord11 = propertyOneByteHeaderRecordFormat9.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long13 = propertyOneByteHeaderRecordFormat12.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord14 = propertyOneByteHeaderRecordFormat12.newRecord();
    long long15 = propertyOneByteHeaderRecordFormat9.getNextRecordReference(propertyRecord14);
    org.neo4j.internal.id.IdSequence idSequence17 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext18 = null;
    propertyOneByteHeaderRecordFormat0.prepare(propertyRecord14, (int) (byte) -1, idSequence17,
        cursorContext18);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat20 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord21 = propertyOneByteHeaderRecordFormat20.newRecord();
    long long22 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord21);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat23 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader24 = null;
    int int25 = propertyRecordFormat23.getRecordSize(storeHeader24);
    long long26 = propertyRecordFormat23.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat27 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat28 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord29 = propertyRecordFormat28.newRecord();
    long long30 = propertyOneByteHeaderRecordFormat27.getNextRecordReference(propertyRecord29);
    org.neo4j.internal.id.IdSequence idSequence32 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext33 = null;
    propertyRecordFormat23.prepare(propertyRecord29, 0, idSequence32, cursorContext33);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord35 = propertyRecordFormat23.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor36 = null;
    try {
      propertyOneByteHeaderRecordFormat0.write(propertyRecord35, pageCursor36, 50, 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord6);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1125899906842623L + "'",
        long10 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord11);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1125899906842623L + "'",
        long13 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord14);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord21);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    org.junit.Assert.assertTrue("'" + int25 + "' != '" + 48 + "'", int25 == 48);
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1125899906842623L + "'",
        long26 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord29);
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord35);
  }

  @Test
  public void test0281() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0281");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v300_1.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat3 = v300_1.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_0,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1, capabilityType4);
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_6 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat7 = v310_6.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat8 = v310_6.dynamic();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat9 = v310_6.labelToken();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType10 = null;
    boolean boolean11 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v310_6, capabilityType10);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat12 = v300_1.relationshipGroup();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat7);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat8);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat12);
  }

  @Test
  public void test0282() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0282");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(
        (long) (byte) 100, (long) 128);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 228L + "'", long2 == 228L);
  }

  @Test
  public void test0283() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0283");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader6 = null;
    int int7 = nodeRecordFormat0.getRecordSize(storeHeader6);
    int int10 = nodeRecordFormat0.getPageSize(100, (int) (byte) -1);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat nodeRecordFormat11 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord13 = null;
    long long14 = nodeRecordFormat12.getNextRecordReference(nodeRecord13);
    int int15 = nodeRecordFormat12.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader16 = null;
    int int17 = nodeRecordFormat12.getRecordSize(storeHeader16);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat18 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord19 = null;
    long long20 = nodeRecordFormat18.getNextRecordReference(nodeRecord19);
    int int21 = nodeRecordFormat18.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader22 = null;
    int int23 = nodeRecordFormat18.getRecordSize(storeHeader22);
    int int26 = nodeRecordFormat18.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord27 = nodeRecordFormat18.newRecord();
    long long28 = nodeRecordFormat12.getNextRecordReference(nodeRecord27);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord29 = nodeRecordFormat12.newRecord();
    long long30 = nodeRecordFormat11.getNextRecordReference(nodeRecord29);
    org.neo4j.internal.id.IdSequence idSequence32 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext33 = null;
    nodeRecordFormat0.prepare(nodeRecord29, (int) (short) 10, idSequence32, cursorContext33);
    org.neo4j.io.pagecache.PageCursor pageCursor35 = null;
    try {
      boolean boolean36 = nodeRecordFormat0.isInUse(pageCursor35);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
    org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    org.junit.Assert.assertNotNull(nodeRecord27);
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
    org.junit.Assert.assertNotNull(nodeRecord29);
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
  }

  @Test
  public void test0284() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0284");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat1 = v310_0.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat2 = v310_0.dynamic();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat3 = v310_0.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat4 = v310_0.relationship();
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat1);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat2);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat3);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat4);
  }

  @Test
  public void test0285() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0285");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(
        (long) (byte) 0, (long) (short) 1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
  }

  @Test
  public void test0286() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0286");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord3 = null;
    long long4 = nodeRecordFormat2.getNextRecordReference(nodeRecord3);
    int int5 = nodeRecordFormat2.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader6 = null;
    int int7 = nodeRecordFormat2.getRecordSize(storeHeader6);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader8 = null;
    int int9 = nodeRecordFormat2.getRecordSize(storeHeader8);
    int int12 = nodeRecordFormat2.getPageSize(100, (int) (byte) -1);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat nodeRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord15 = null;
    long long16 = nodeRecordFormat14.getNextRecordReference(nodeRecord15);
    int int17 = nodeRecordFormat14.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader18 = null;
    int int19 = nodeRecordFormat14.getRecordSize(storeHeader18);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat20 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord21 = null;
    long long22 = nodeRecordFormat20.getNextRecordReference(nodeRecord21);
    int int23 = nodeRecordFormat20.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader24 = null;
    int int25 = nodeRecordFormat20.getRecordSize(storeHeader24);
    int int28 = nodeRecordFormat20.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord29 = nodeRecordFormat20.newRecord();
    long long30 = nodeRecordFormat14.getNextRecordReference(nodeRecord29);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord31 = nodeRecordFormat14.newRecord();
    long long32 = nodeRecordFormat13.getNextRecordReference(nodeRecord31);
    org.neo4j.internal.id.IdSequence idSequence34 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext35 = null;
    nodeRecordFormat2.prepare(nodeRecord31, (int) (short) 10, idSequence34, cursorContext35);
    org.neo4j.io.pagecache.PageCursor pageCursor37 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad38 = null;
    try {
      nodeHighLimitRecordFormat1.read(nodeRecord31, pageCursor37, recordLoad38, 16, (int) '4');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    org.junit.Assert.assertTrue("'" + int25 + "' != '" + 16 + "'", int25 == 16);
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
    org.junit.Assert.assertNotNull(nodeRecord29);
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
    org.junit.Assert.assertNotNull(nodeRecord31);
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
  }

  @Test
  public void test0287() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0287");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.toable(52L,
        (long) (byte) 10);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62L + "'", long2 == 62L);
  }

  @Test
  public void test0288() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0288");
    }
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds0 = null;
    org.neo4j.internal.batchimport.input.Collector collector1 = null;
    org.neo4j.internal.batchimport.Configuration configuration2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout4 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor5 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory7 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler8 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer9 = null;
    org.neo4j.logging.internal.LogService logService10 = null;
    org.neo4j.memory.MemoryTracker memoryTracker11 = null;
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_14 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_15 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat16 = v300_15.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat17 = v300_15.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType18 = null;
    boolean boolean19 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_14,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_15, capabilityType18);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat20 = v300_15.relationship();
    boolean boolean22 = v300_15.equals((java.lang.Object) 24);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat23 = v300_15.labelToken();
    try {
      io.github.onograph.internal.batchimport.EnterpriseBatchImporter enterpriseBatchImporter24 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporter(
          additionalInitialIds0, collector1, configuration2, config3, databaseLayout4,
          executionMonitor5, fileSystemAbstraction6, indexImporterFactory7, jobScheduler8,
          logFilesInitializer9, logService10, memoryTracker11, monitor12, pageCacheTracer13,
          (org.neo4j.kernel.impl.store.format.RecordFormats) v300_15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat16);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat17);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat23);
  }

  @Test
  public void test0289() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0289");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat1 = v306_0.node();
    java.lang.String str2 = v306_0.storeVersion();
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vE.H.0b" + "'", str2, "vE.H.0b");
  }

  @Test
  public void test0290() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0290");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader3 = null;
    int int4 = propertyRecordFormat0.getRecordSize(storeHeader3);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat5 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long6 = propertyOneByteHeaderRecordFormat5.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat8 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = propertyRecordFormat8.newRecord();
    long long10 = propertyOneByteHeaderRecordFormat7.getNextRecordReference(propertyRecord9);
    long long11 = propertyOneByteHeaderRecordFormat5.getNextRecordReference(propertyRecord9);
    org.neo4j.io.pagecache.PageCursor pageCursor12 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad13 = null;
    try {
      propertyRecordFormat0.read(propertyRecord9, pageCursor12, recordLoad13, 2, 12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1125899906842623L + "'",
        long6 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord9);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
  }

  @Test
  public void test0291() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0291");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(54L, 103L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 119L + "'", long2 == 119L);
  }

  @Test
  public void test0292() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0292");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat1 = v310_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat2 = v310_0.relationshipGroup();
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat2);
  }

  @Test
  public void test0293() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0293");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.torete(
        (long) 24, (long) 'a');
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 73L + "'", long2 == 73L);
  }

  @Test
  public void test0294() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0294");
    }
    io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory enterpriseBatchImporterFactory0 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory();
    org.neo4j.io.layout.DatabaseLayout databaseLayout1 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer3 = null;
    org.neo4j.internal.batchimport.Configuration configuration4 = null;
    org.neo4j.logging.internal.LogService logService5 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor6 = null;
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds7 = null;
    org.neo4j.configuration.Config config8 = null;
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_9 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.storageengine.api.format.Capability capability10 = null;
    boolean boolean11 = v310_9.hasCapability(capability10);
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor12 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler13 = null;
    org.neo4j.internal.batchimport.input.Collector collector14 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer15 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory16 = null;
    org.neo4j.memory.MemoryTracker memoryTracker17 = null;
    try {
      org.neo4j.internal.batchimport.BatchImporter batchImporter18 = enterpriseBatchImporterFactory0.instantiate(
          databaseLayout1, fileSystemAbstraction2, pageCacheTracer3, configuration4, logService5,
          executionMonitor6, additionalInitialIds7, config8,
          (org.neo4j.kernel.impl.store.format.RecordFormats) v310_9, monitor12, jobScheduler13,
          collector14, logFilesInitializer15, indexImporterFactory16, memoryTracker17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
  }

  @Test
  public void test0295() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0295");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl6 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int9 = recordFormatDynamicRecordImpl6.getPageSize(24, 8);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl10 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean12 = recordFormatDynamicRecordImpl10.equals((java.lang.Object) 100.0f);
    int int15 = recordFormatDynamicRecordImpl10.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord16 = recordFormatDynamicRecordImpl10.newRecord();
    long long17 = recordFormatDynamicRecordImpl6.getNextRecordReference(dynamicRecord16);
    org.neo4j.internal.id.IdSequence idSequence19 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext20 = null;
    recordFormatDynamicRecordImpl0.prepare(dynamicRecord16, 10, idSequence19, cursorContext20);
    int int22 = recordFormatDynamicRecordImpl0.getRecordHeaderSize();
    org.neo4j.io.pagecache.PageCursor pageCursor23 = null;
    try {
      boolean boolean24 = recordFormatDynamicRecordImpl0.isInUse(pageCursor23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 24 + "'", int9 == 24);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord16);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
  }

  @Test
  public void test0296() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0296");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum highLimitEncEnum0 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_5;
    org.junit.Assert.assertTrue("'" + highLimitEncEnum0 + "' != '"
            + io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_5 + "'",
        highLimitEncEnum0.equals(
            io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_5));
  }

  @Test
  public void test0297() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0297");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord4 = null;
    long long5 = relationshipGroupHighLimitRecordFormat3.getNextRecordReference(
        relationshipGroupRecord4);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord6 = relationshipGroupHighLimitRecordFormat3.newRecord();
    org.neo4j.internal.id.IdSequence idSequence8 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext9 = null;
    relationshipGroupRecordFormat2.prepare(relationshipGroupRecord6, (-1), idSequence8,
        cursorContext9);
    org.neo4j.io.pagecache.PageCursor pageCursor11 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord6, pageCursor11,
          (int) (byte) -1, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord6);
  }

  @Test
  public void test0298() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0298");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(234L, 15L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 239L + "'", long2 == 239L);
  }

  @Test
  public void test0299() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0299");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord2 = propertyRecordFormat1.newRecord();
    long long3 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord2);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = propertyOneByteHeaderRecordFormat0.getRecordSize(storeHeader4);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long7 = propertyOneByteHeaderRecordFormat6.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat8 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord10 = propertyRecordFormat9.newRecord();
    long long11 = propertyOneByteHeaderRecordFormat8.getNextRecordReference(propertyRecord10);
    long long12 = propertyOneByteHeaderRecordFormat6.getNextRecordReference(propertyRecord10);
    org.neo4j.internal.id.IdSequence idSequence14 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext15 = null;
    propertyOneByteHeaderRecordFormat0.prepare(propertyRecord10, 64, idSequence14, cursorContext15);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat17 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader18 = null;
    int int19 = propertyRecordFormat17.getRecordSize(storeHeader18);
    long long20 = propertyRecordFormat17.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum highLimitEncEnum21 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8;
    boolean boolean22 = propertyRecordFormat17.equals((java.lang.Object) highLimitEncEnum21);
    long long23 = propertyRecordFormat17.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord24 = propertyRecordFormat17.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor25 = null;
    try {
      propertyOneByteHeaderRecordFormat0.write(propertyRecord24, pageCursor25, 48, 24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1125899906842623L + "'",
        long7 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord10);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1125899906842623L + "'",
        long20 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + highLimitEncEnum21 + "' != '"
            + io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8 + "'",
        highLimitEncEnum21.equals(
            io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1125899906842623L + "'",
        long23 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord24);
  }

  @Test
  public void test0300() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0300");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.toable(97L,
        (-39L));
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58L + "'", long2 == 58L);
  }

  @Test
  public void test0301() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0301");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    int int9 = recordFormatDynamicRecordImpl0.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord10 = recordFormatDynamicRecordImpl0.newRecord();
    int int13 = recordFormatDynamicRecordImpl0.getPageSize((int) '4', (int) (short) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_14 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat15 = v320_14.relationship();
    boolean boolean16 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) v320_14);
    long long17 = recordFormatDynamicRecordImpl0.getMaxId();
    org.neo4j.io.pagecache.PageCursor pageCursor18 = null;
    try {
      boolean boolean19 = recordFormatDynamicRecordImpl0.isInUse(pageCursor18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord10);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1125899906842623L + "'",
        long17 == 1125899906842623L);
  }

  @Test
  public void test0302() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0302");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (int) (short) 100);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0303() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0303");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord1 = relationshipRecordFormat0.newRecord();
    int int2 = relationshipRecordFormat0.getRecordHeaderSize();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord5 = relationshipRecordFormat4.newRecord();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord6 = relationshipRecordFormat4.newRecord();
    org.neo4j.internal.id.IdSequence idSequence8 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext9 = null;
    relationshipRecordFormat3.prepare(relationshipRecord6, 100, idSequence8, cursorContext9);
    long long11 = relationshipRecordFormat0.getNextRecordReference(relationshipRecord6);
    org.neo4j.io.pagecache.PageCursor pageCursor12 = null;
    try {
      boolean boolean13 = relationshipRecordFormat0.isInUse(pageCursor12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecord1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNotNull(relationshipRecord5);
    org.junit.Assert.assertNotNull(relationshipRecord6);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
  }

  @Test
  public void test0304() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0304");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        8);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0305() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0305");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    int int10 = relationshipGroupHighLimitRecordFormat0.getRecordHeaderSize();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat11 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord12 = null;
    long long13 = relationshipGroupHighLimitRecordFormat11.getNextRecordReference(
        relationshipGroupRecord12);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord14 = relationshipGroupHighLimitRecordFormat11.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor15 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad16 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.read(relationshipGroupRecord14, pageCursor15,
          recordLoad16, 64, 128);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord14);
  }

  @Test
  public void test0306() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0306");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((-1L),
        (long) (short) 1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
  }

  @Test
  public void test0307() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0307");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord11 = null;
    long long12 = relationshipGroupHighLimitRecordFormat10.getNextRecordReference(
        relationshipGroupRecord11);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = relationshipGroupHighLimitRecordFormat10.newRecord();
    org.neo4j.internal.id.IdSequence idSequence15 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext16 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord13, 0, idSequence15,
        cursorContext16);
    long long18 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat19 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long20 = relationshipGroupHighLimitRecordFormat19.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat21 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord22 = null;
    long long23 = relationshipGroupHighLimitRecordFormat21.getNextRecordReference(
        relationshipGroupRecord22);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord24 = relationshipGroupHighLimitRecordFormat21.newRecord();
    org.neo4j.internal.id.IdSequence idSequence26 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext27 = null;
    relationshipGroupHighLimitRecordFormat19.prepare(relationshipGroupRecord24, 0, idSequence26,
        cursorContext27);
    org.neo4j.io.pagecache.PageCursor pageCursor29 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord24, pageCursor29, 3,
          (int) ' ');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord13);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1125899906842623L + "'",
        long18 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1125899906842623L + "'",
        long20 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord24);
  }

  @Test
  public void test0308() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0308");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 10,
        10L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
  }

  @Test
  public void test0309() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0309");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord3 = relationshipRecordFormat2.newRecord();
    long long4 = relationshipHighLimitRecordFormat1.getNextRecordReference(relationshipRecord3);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat5 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord6 = relationshipRecordFormat5.newRecord();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord7 = relationshipRecordFormat5.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor8 = null;
    try {
      relationshipHighLimitRecordFormat1.write(relationshipRecord7, pageCursor8, (int) (byte) 0,
          64);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecord3);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipRecord6);
    org.junit.Assert.assertNotNull(relationshipRecord7);
  }

  @Test
  public void test0310() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0310");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(201L,
        (long) 48);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 249L + "'", long2 == 249L);
  }

  @Test
  public void test0311() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0311");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long11 = relationshipGroupHighLimitRecordFormat10.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = null;
    long long14 = relationshipGroupHighLimitRecordFormat12.getNextRecordReference(
        relationshipGroupRecord13);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord15 = relationshipGroupHighLimitRecordFormat12.newRecord();
    org.neo4j.internal.id.IdSequence idSequence17 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext18 = null;
    relationshipGroupHighLimitRecordFormat10.prepare(relationshipGroupRecord15, (int) (byte) 1,
        idSequence17, cursorContext18);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat20 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord21 = null;
    long long22 = relationshipGroupHighLimitRecordFormat20.getNextRecordReference(
        relationshipGroupRecord21);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord23 = relationshipGroupHighLimitRecordFormat20.newRecord();
    org.neo4j.internal.id.IdSequence idSequence25 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext26 = null;
    relationshipGroupHighLimitRecordFormat10.prepare(relationshipGroupRecord23, 0, idSequence25,
        cursorContext26);
    org.neo4j.internal.id.IdSequence idSequence29 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext30 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord23, 128, idSequence29,
        cursorContext30);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat32 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long33 = relationshipGroupHighLimitRecordFormat32.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat34 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord35 = null;
    long long36 = relationshipGroupHighLimitRecordFormat34.getNextRecordReference(
        relationshipGroupRecord35);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord37 = relationshipGroupHighLimitRecordFormat34.newRecord();
    org.neo4j.internal.id.IdSequence idSequence39 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext40 = null;
    relationshipGroupHighLimitRecordFormat32.prepare(relationshipGroupRecord37, (int) (byte) 1,
        idSequence39, cursorContext40);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat42 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord43 = null;
    long long44 = relationshipGroupHighLimitRecordFormat42.getNextRecordReference(
        relationshipGroupRecord43);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord45 = relationshipGroupHighLimitRecordFormat42.newRecord();
    org.neo4j.internal.id.IdSequence idSequence47 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext48 = null;
    relationshipGroupHighLimitRecordFormat32.prepare(relationshipGroupRecord45, 0, idSequence47,
        cursorContext48);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord50 = relationshipGroupHighLimitRecordFormat32.newRecord();
    org.neo4j.internal.id.IdSequence idSequence52 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext53 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord50, 8, idSequence52,
        cursorContext53);
    org.neo4j.io.pagecache.PageCursor pageCursor55 = null;
    try {
      boolean boolean56 = relationshipGroupHighLimitRecordFormat0.isInUse(pageCursor55);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1125899906842623L + "'",
        long11 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord15);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord23);
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1125899906842623L + "'",
        long33 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord37);
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord45);
    org.junit.Assert.assertNotNull(relationshipGroupRecord50);
  }

  @Test
  public void test0312() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0312");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(101L, 17L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 117L + "'", long2 == 117L);
  }

  @Test
  public void test0313() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0313");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean8 = propertyRecordFormat0.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = null;
    org.neo4j.internal.id.IdSequence idSequence11 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext12 = null;
    propertyRecordFormat0.prepare(propertyRecord9, (int) (short) 0, idSequence11, cursorContext12);
    boolean boolean15 = propertyRecordFormat0.equals((java.lang.Object) "3.0.6");
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat16 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader17 = null;
    int int18 = propertyRecordFormat16.getRecordSize(storeHeader17);
    int int21 = propertyRecordFormat16.getPageSize((int) (byte) -1, 128);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat22 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long23 = propertyOneByteHeaderRecordFormat22.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord24 = propertyOneByteHeaderRecordFormat22.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord25 = propertyOneByteHeaderRecordFormat22.newRecord();
    long long26 = propertyRecordFormat16.getNextRecordReference(propertyRecord25);
    long long27 = propertyRecordFormat0.getNextRecordReference(propertyRecord25);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat28 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long29 = propertyOneByteHeaderRecordFormat28.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord30 = propertyOneByteHeaderRecordFormat28.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord31 = propertyOneByteHeaderRecordFormat28.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor32 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad33 = null;
    try {
      propertyRecordFormat0.read(propertyRecord31, pageCursor32, recordLoad33, 100, (int) '4');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
    org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1125899906842623L + "'",
        long23 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord24);
    org.junit.Assert.assertNotNull(propertyRecord25);
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1125899906842623L + "'",
        long29 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord30);
    org.junit.Assert.assertNotNull(propertyRecord31);
  }

  @Test
  public void test0314() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0314");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(228L, (-1L));
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
  }

  @Test
  public void test0315() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0315");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader6 = null;
    int int7 = propertyRecordFormat0.getRecordSize(storeHeader6);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat8 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader9 = null;
    int int10 = propertyRecordFormat8.getRecordSize(storeHeader9);
    int int13 = propertyRecordFormat8.getPageSize((int) (byte) -1, 128);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long15 = propertyOneByteHeaderRecordFormat14.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord16 = propertyOneByteHeaderRecordFormat14.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord17 = propertyOneByteHeaderRecordFormat14.newRecord();
    long long18 = propertyRecordFormat8.getNextRecordReference(propertyRecord17);
    org.neo4j.io.pagecache.PageCursor pageCursor19 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad20 = null;
    try {
      propertyRecordFormat0.read(propertyRecord17, pageCursor19, recordLoad20, 16, (int) '4');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1125899906842623L + "'",
        long15 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord16);
    org.junit.Assert.assertNotNull(propertyRecord17);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
  }

  @Test
  public void test0316() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0316");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord3 = relationshipRecordFormat2.newRecord();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord4 = relationshipRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence6 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext7 = null;
    relationshipRecordFormat1.prepare(relationshipRecord4, 100, idSequence6, cursorContext7);
    int int11 = relationshipRecordFormat1.getPageSize(0, 3);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord12 = relationshipRecordFormat1.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor13 = null;
    try {
      relationshipHighLimitRecordFormat0.write(relationshipRecord12, pageCursor13, 4, 3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecord3);
    org.junit.Assert.assertNotNull(relationshipRecord4);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    org.junit.Assert.assertNotNull(relationshipRecord12);
  }

  @Test
  public void test0317() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0317");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0318() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0318");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord2 = relationshipHighLimitRecordFormat1.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord5 = relationshipHighLimitRecordFormat4.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipHighLimitRecordFormat1.prepare(relationshipRecord5, (int) (short) 1, idSequence7,
        cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord11 = relationshipRecordFormat10.newRecord();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord12 = relationshipRecordFormat10.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord15 = relationshipHighLimitRecordFormat14.newRecord();
    org.neo4j.internal.id.IdSequence idSequence17 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext18 = null;
    relationshipRecordFormat10.prepare(relationshipRecord15, (int) (byte) 100, idSequence17,
        cursorContext18);
    org.neo4j.io.pagecache.PageCursor pageCursor20 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad21 = null;
    try {
      relationshipHighLimitRecordFormat1.read(relationshipRecord15, pageCursor20, recordLoad21,
          (int) '4', 96);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecord2);
    org.junit.Assert.assertNotNull(relationshipRecord5);
    org.junit.Assert.assertNotNull(relationshipRecord11);
    org.junit.Assert.assertNotNull(relationshipRecord12);
    org.junit.Assert.assertNotNull(relationshipRecord15);
  }

  @Test
  public void test0319() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0319");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    int int8 = nodeRecordFormat0.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord9 = nodeRecordFormat0.newRecord();
    int int12 = nodeRecordFormat0.getPageSize(32, (int) 'a');
    int int15 = nodeRecordFormat0.getPageSize(35, 96);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    org.junit.Assert.assertNotNull(nodeRecord9);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
  }

  @Test
  public void test0320() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0320");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = propertyRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader3 = null;
    int int4 = propertyRecordFormat2.getRecordSize(storeHeader3);
    long long5 = propertyRecordFormat2.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord8 = propertyRecordFormat7.newRecord();
    long long9 = propertyOneByteHeaderRecordFormat6.getNextRecordReference(propertyRecord8);
    org.neo4j.internal.id.IdSequence idSequence11 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext12 = null;
    propertyRecordFormat2.prepare(propertyRecord8, 0, idSequence11, cursorContext12);
    long long14 = propertyRecordFormat0.getNextRecordReference(propertyRecord8);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat15 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long16 = propertyOneByteHeaderRecordFormat15.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord17 = propertyOneByteHeaderRecordFormat15.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor18 = null;
    try {
      propertyRecordFormat0.write(propertyRecord17, pageCursor18, 64, (int) '4');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord1);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1125899906842623L + "'",
        long5 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord8);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1125899906842623L + "'",
        long16 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord17);
  }

  @Test
  public void test0321() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0321");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl6 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int9 = recordFormatDynamicRecordImpl6.getPageSize(24, 8);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl10 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean12 = recordFormatDynamicRecordImpl10.equals((java.lang.Object) 100.0f);
    int int15 = recordFormatDynamicRecordImpl10.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord16 = recordFormatDynamicRecordImpl10.newRecord();
    long long17 = recordFormatDynamicRecordImpl6.getNextRecordReference(dynamicRecord16);
    org.neo4j.internal.id.IdSequence idSequence19 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext20 = null;
    recordFormatDynamicRecordImpl0.prepare(dynamicRecord16, 10, idSequence19, cursorContext20);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl22 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean24 = recordFormatDynamicRecordImpl22.equals((java.lang.Object) 100.0f);
    int int27 = recordFormatDynamicRecordImpl22.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord28 = recordFormatDynamicRecordImpl22.newRecord();
    int int31 = recordFormatDynamicRecordImpl22.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord32 = recordFormatDynamicRecordImpl22.newRecord();
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord33 = recordFormatDynamicRecordImpl22.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor34 = null;
    try {
      recordFormatDynamicRecordImpl0.write(dynamicRecord33, pageCursor34, 35, 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 24 + "'", int9 == 24);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord16);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16 + "'", int27 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord28);
    org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord32);
    org.junit.Assert.assertNotNull(dynamicRecord33);
  }

  @Test
  public void test0322() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0322");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord1 = null;
    long long2 = relationshipGroupHighLimitRecordFormat0.getNextRecordReference(
        relationshipGroupRecord1);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = relationshipGroupHighLimitRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader5 = null;
    int int6 = relationshipGroupRecordFormat4.getRecordSize(storeHeader5);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long8 = relationshipGroupHighLimitRecordFormat7.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord10 = null;
    long long11 = relationshipGroupHighLimitRecordFormat9.getNextRecordReference(
        relationshipGroupRecord10);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord12 = relationshipGroupHighLimitRecordFormat9.newRecord();
    org.neo4j.internal.id.IdSequence idSequence14 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext15 = null;
    relationshipGroupHighLimitRecordFormat7.prepare(relationshipGroupRecord12, (int) (byte) 1,
        idSequence14, cursorContext15);
    org.neo4j.internal.id.IdSequence idSequence18 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext19 = null;
    relationshipGroupRecordFormat4.prepare(relationshipGroupRecord12, 0, idSequence18,
        cursorContext19);
    org.neo4j.internal.id.IdSequence idSequence22 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext23 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord12, (int) '4',
        idSequence22, cursorContext23);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat25 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    int int28 = relationshipGroupRecordFormat25.getPageSize((int) 'a', (int) (short) 100);
    long long29 = relationshipGroupRecordFormat25.getMaxId();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord30 = relationshipGroupRecordFormat25.newRecord();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord31 = relationshipGroupRecordFormat25.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor32 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord31, pageCursor32,
          (int) '4', 48);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord3);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1125899906842623L + "'",
        long8 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord12);
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1125899906842623L + "'",
        long29 == 1125899906842623L);
    org.junit.Assert.assertNotNull(relationshipGroupRecord30);
    org.junit.Assert.assertNotNull(relationshipGroupRecord31);
  }

  @Test
  public void test0323() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0323");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader6 = null;
    int int7 = nodeRecordFormat0.getRecordSize(storeHeader6);
    int int10 = nodeRecordFormat0.getPageSize((int) ' ', 4);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord11 = nodeRecordFormat0.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor12 = null;
    try {
      boolean boolean13 = nodeRecordFormat0.isInUse(pageCursor12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    org.junit.Assert.assertNotNull(nodeRecord11);
  }

  @Test
  public void test0324() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0324");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = propertyRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_2 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat3 = v310_2.relationship();
    java.lang.String str4 = v310_2.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat5 = v310_2.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat6 = v310_2.node();
    org.neo4j.storageengine.api.format.Capability[] capabilityArray7 = v310_2.capabilities();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat8 = v310_2.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat9 = v310_2.node();
    boolean boolean10 = propertyRecordFormat0.equals((java.lang.Object) v310_2);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat11 = v310_2.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat12 = v310_2.dynamic();
    org.junit.Assert.assertNotNull(propertyRecord1);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "high_limitV3_1_0" + "'", str4,
        "high_limitV3_1_0");
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat5);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat6);
    org.junit.Assert.assertNotNull(capabilityArray7);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat8);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat9);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat11);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat12);
  }

  @Test
  public void test0325() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0325");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long3 = relationshipGroupHighLimitRecordFormat2.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = null;
    long long6 = relationshipGroupHighLimitRecordFormat4.getNextRecordReference(
        relationshipGroupRecord5);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord7 = relationshipGroupHighLimitRecordFormat4.newRecord();
    org.neo4j.internal.id.IdSequence idSequence9 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext10 = null;
    relationshipGroupHighLimitRecordFormat2.prepare(relationshipGroupRecord7, (int) (byte) 1,
        idSequence9, cursorContext10);
    long long12 = relationshipGroupHighLimitRecordFormat1.getNextRecordReference(
        relationshipGroupRecord7);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long14 = relationshipGroupHighLimitRecordFormat13.getMaxId();
    long long15 = relationshipGroupHighLimitRecordFormat13.getMaxId();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord16 = relationshipGroupHighLimitRecordFormat13.newRecord();
    org.neo4j.internal.id.IdSequence idSequence18 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext19 = null;
    relationshipGroupHighLimitRecordFormat1.prepare(relationshipGroupRecord16, 3, idSequence18,
        cursorContext19);
    org.neo4j.io.pagecache.PageCursor pageCursor21 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad22 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.read(relationshipGroupRecord16, pageCursor21,
          recordLoad22, (int) 'a', 3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord7);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1125899906842623L + "'",
        long14 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1125899906842623L + "'",
        long15 == 1125899906842623L);
    org.junit.Assert.assertNotNull(relationshipGroupRecord16);
  }

  @Test
  public void test0326() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0326");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.storageengine.api.format.Capability capability1 = null;
    boolean boolean2 = v310_0.hasCapability(capability1);
    int int3 = v310_0.generation();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat4 = v310_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat5 = v310_0.propertyKeyToken();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat4);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat5);
  }

  @Test
  public void test0327() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0327");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl7 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean9 = recordFormatDynamicRecordImpl7.equals((java.lang.Object) 100.0f);
    int int12 = recordFormatDynamicRecordImpl7.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord13 = recordFormatDynamicRecordImpl7.newRecord();
    long long14 = recordFormatDynamicRecordImpl0.getNextRecordReference(dynamicRecord13);
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_15 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat16 = v320_15.property();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat17 = v320_15.relationshipGroup();
    boolean boolean18 = recordFormatDynamicRecordImpl0.equals(
        (java.lang.Object) relationshipGroupRecordRecordFormat17);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl19 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean21 = recordFormatDynamicRecordImpl19.equals((java.lang.Object) 100.0f);
    int int24 = recordFormatDynamicRecordImpl19.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord25 = recordFormatDynamicRecordImpl19.newRecord();
    int int28 = recordFormatDynamicRecordImpl19.getPageSize(48, 35);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl29 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean31 = recordFormatDynamicRecordImpl29.equals((java.lang.Object) 100.0f);
    int int34 = recordFormatDynamicRecordImpl29.getPageSize(16, (-1));
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl35 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int38 = recordFormatDynamicRecordImpl35.getPageSize(24, 8);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl39 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean41 = recordFormatDynamicRecordImpl39.equals((java.lang.Object) 100.0f);
    int int44 = recordFormatDynamicRecordImpl39.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord45 = recordFormatDynamicRecordImpl39.newRecord();
    long long46 = recordFormatDynamicRecordImpl35.getNextRecordReference(dynamicRecord45);
    org.neo4j.internal.id.IdSequence idSequence48 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext49 = null;
    recordFormatDynamicRecordImpl29.prepare(dynamicRecord45, 10, idSequence48, cursorContext49);
    org.neo4j.internal.id.IdSequence idSequence52 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext53 = null;
    recordFormatDynamicRecordImpl19.prepare(dynamicRecord45, (int) (byte) 1, idSequence52,
        cursorContext53);
    org.neo4j.io.pagecache.PageCursor pageCursor55 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad56 = null;
    try {
      recordFormatDynamicRecordImpl0.read(dynamicRecord45, pageCursor55, recordLoad56, 0, 2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord13);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat16);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord25);
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertTrue("'" + int34 + "' != '" + 16 + "'", int34 == 16);
    org.junit.Assert.assertTrue("'" + int38 + "' != '" + 24 + "'", int38 == 24);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    org.junit.Assert.assertTrue("'" + int44 + "' != '" + 16 + "'", int44 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord45);
    org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
  }

  @Test
  public void test0328() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0328");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(
        (long) (short) 0, 254L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 254L + "'", long2 == 254L);
  }

  @Test
  public void test0329() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0329");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat1 = v320_0.dynamic();
    java.lang.String str2 = v320_0.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat3 = v320_0.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat4 = v320_0.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat5 = v320_0.propertyKeyToken();
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "high_limitV3_2_0" + "'", str2,
        "high_limitV3_2_0");
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat3);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat4);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat5);
  }

  @Test
  public void test0330() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0330");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        16);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0331() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0331");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        24);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0332() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0332");
    }
    io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory enterpriseBatchImporterFactory0 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory();
    org.neo4j.io.layout.DatabaseLayout databaseLayout1 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer3 = null;
    org.neo4j.internal.batchimport.Configuration configuration4 = null;
    org.neo4j.logging.internal.LogService logService5 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor6 = null;
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds7 = null;
    org.neo4j.configuration.Config config8 = null;
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_9 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat10 = v306_9.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat11 = v306_9.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat12 = v306_9.dynamic();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat13 = v306_9.property();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily14 = v306_9.getFormatFamily();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily15 = v306_9.getFormatFamily();
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor16 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler17 = null;
    org.neo4j.internal.batchimport.input.Collector collector18 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer19 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory20 = null;
    org.neo4j.memory.MemoryTracker memoryTracker21 = null;
    try {
      org.neo4j.internal.batchimport.BatchImporter batchImporter22 = enterpriseBatchImporterFactory0.instantiate(
          databaseLayout1, fileSystemAbstraction2, pageCacheTracer3, configuration4, logService5,
          executionMonitor6, additionalInitialIds7, config8,
          (org.neo4j.kernel.impl.store.format.RecordFormats) v306_9, monitor16, jobScheduler17,
          collector18, logFilesInitializer19, indexImporterFactory20, memoryTracker21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat10);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat11);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat12);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat13);
    org.junit.Assert.assertTrue(
        "'" + formatFamily14 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily14.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
    org.junit.Assert.assertTrue(
        "'" + formatFamily15 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily15.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
  }

  @Test
  public void test0333() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0333");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v300_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat2 = v300_0.relationshipTypeToken();
    java.lang.String str3 = v300_0.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat4 = v300_0.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat5 = v300_0.labelToken();
    java.lang.String str6 = v300_0.toString();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "high_limitV3_0_0" + "'", str3,
        "high_limitV3_0_0");
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat4);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RecordFormat:V300[vE.H.0]" + "'", str6,
        "RecordFormat:V300[vE.H.0]");
  }

  @Test
  public void test0334() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0334");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    org.neo4j.io.pagecache.PageCursor pageCursor10 = null;
    try {
      boolean boolean11 = relationshipGroupHighLimitRecordFormat0.isInUse(pageCursor10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
  }

  @Test
  public void test0335() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0335");
    }
    int int1 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.leg(
        (long) ' ');
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
  }

  @Test
  public void test0336() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0336");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v306_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v306_0.labelToken();
    boolean boolean4 = v306_0.equals((java.lang.Object) 64);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat5 = v306_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat6 = v306_0.node();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat5);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat6);
  }

  @Test
  public void test0337() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0337");
    }
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds0 = null;
    org.neo4j.internal.batchimport.input.Collector collector1 = null;
    org.neo4j.internal.batchimport.Configuration configuration2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout4 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor5 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory7 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler8 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer9 = null;
    org.neo4j.logging.internal.LogService logService10 = null;
    org.neo4j.memory.MemoryTracker memoryTracker11 = null;
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_14 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat15 = v310_14.relationship();
    java.lang.String str16 = v310_14.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat17 = v310_14.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat18 = v310_14.node();
    org.neo4j.storageengine.api.format.Capability[] capabilityArray19 = v310_14.capabilities();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat20 = v310_14.relationshipTypeToken();
    try {
      io.github.onograph.internal.batchimport.EnterpriseBatchImporter enterpriseBatchImporter21 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporter(
          additionalInitialIds0, collector1, configuration2, config3, databaseLayout4,
          executionMonitor5, fileSystemAbstraction6, indexImporterFactory7, jobScheduler8,
          logFilesInitializer9, logService10, memoryTracker11, monitor12, pageCacheTracer13,
          (org.neo4j.kernel.impl.store.format.RecordFormats) v310_14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "high_limitV3_1_0" + "'", str16,
        "high_limitV3_1_0");
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat17);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat18);
    org.junit.Assert.assertNotNull(capabilityArray19);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat20);
  }

  @Test
  public void test0338() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0338");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long2 = relationshipGroupHighLimitRecordFormat1.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord4 = null;
    long long5 = relationshipGroupHighLimitRecordFormat3.getNextRecordReference(
        relationshipGroupRecord4);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord6 = relationshipGroupHighLimitRecordFormat3.newRecord();
    org.neo4j.internal.id.IdSequence idSequence8 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext9 = null;
    relationshipGroupHighLimitRecordFormat1.prepare(relationshipGroupRecord6, (int) (byte) 1,
        idSequence8, cursorContext9);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat11 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord12 = null;
    long long13 = relationshipGroupHighLimitRecordFormat11.getNextRecordReference(
        relationshipGroupRecord12);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord14 = relationshipGroupHighLimitRecordFormat11.newRecord();
    org.neo4j.internal.id.IdSequence idSequence16 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext17 = null;
    relationshipGroupHighLimitRecordFormat1.prepare(relationshipGroupRecord14, 0, idSequence16,
        cursorContext17);
    long long19 = relationshipGroupHighLimitRecordFormat1.getMaxId();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord20 = relationshipGroupHighLimitRecordFormat1.newRecord();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord21 = relationshipGroupHighLimitRecordFormat1.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor22 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord21, pageCursor22,
          (int) (short) 10, 30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842623L + "'",
        long2 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord6);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord14);
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1125899906842623L + "'",
        long19 == 1125899906842623L);
    org.junit.Assert.assertNotNull(relationshipGroupRecord20);
    org.junit.Assert.assertNotNull(relationshipGroupRecord21);
  }

  @Test
  public void test0339() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0339");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    java.lang.String str1 = v300_0.introductionVersion();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3.0.0" + "'", str1, "3.0.0");
  }

  @Test
  public void test0340() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0340");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.FactoryHighLimitDefaultImpl factoryHighLimitDefaultImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.FactoryHighLimitDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats1 = factoryHighLimitDefaultImpl0.newInstance();
    org.neo4j.kernel.impl.store.format.RecordFormats[] recordFormatsArray2 = recordFormats1.compatibleVersionsForRollingUpgrade();
    org.junit.Assert.assertNotNull(recordFormats1);
    org.junit.Assert.assertNotNull(recordFormatsArray2);
  }

  @Test
  public void test0341() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0341");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(138L, 0L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
  }

  @Test
  public void test0342() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0342");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord2 = relationshipHighLimitRecordFormat1.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord5 = relationshipHighLimitRecordFormat4.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipHighLimitRecordFormat1.prepare(relationshipRecord5, (int) (short) 1, idSequence7,
        cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat11 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord12 = relationshipHighLimitRecordFormat11.newRecord();
    org.neo4j.internal.id.IdSequence idSequence14 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext15 = null;
    relationshipHighLimitRecordFormat1.prepare(relationshipRecord12, (int) (short) 1, idSequence14,
        cursorContext15);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat17 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat18 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord19 = relationshipRecordFormat18.newRecord();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord20 = relationshipRecordFormat18.newRecord();
    org.neo4j.internal.id.IdSequence idSequence22 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext23 = null;
    relationshipRecordFormat17.prepare(relationshipRecord20, 100, idSequence22, cursorContext23);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat26 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord27 = relationshipHighLimitRecordFormat26.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat29 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord30 = relationshipHighLimitRecordFormat29.newRecord();
    org.neo4j.internal.id.IdSequence idSequence32 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext33 = null;
    relationshipHighLimitRecordFormat26.prepare(relationshipRecord30, (int) (short) 1, idSequence32,
        cursorContext33);
    org.neo4j.internal.id.IdSequence idSequence36 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext37 = null;
    relationshipRecordFormat17.prepare(relationshipRecord30, 24, idSequence36, cursorContext37);
    org.neo4j.io.pagecache.PageCursor pageCursor39 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad40 = null;
    try {
      relationshipHighLimitRecordFormat1.read(relationshipRecord30, pageCursor39, recordLoad40,
          (int) 'a', (int) (byte) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecord2);
    org.junit.Assert.assertNotNull(relationshipRecord5);
    org.junit.Assert.assertNotNull(relationshipRecord12);
    org.junit.Assert.assertNotNull(relationshipRecord19);
    org.junit.Assert.assertNotNull(relationshipRecord20);
    org.junit.Assert.assertNotNull(relationshipRecord27);
    org.junit.Assert.assertNotNull(relationshipRecord30);
  }

  @Test
  public void test0343() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0343");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    int int8 = nodeRecordFormat0.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord9 = nodeRecordFormat0.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor10 = null;
    try {
      boolean boolean11 = nodeRecordFormat0.isInUse(pageCursor10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    org.junit.Assert.assertNotNull(nodeRecord9);
  }

  @Test
  public void test0344() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0344");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long1 = propertyOneByteHeaderRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord4 = propertyRecordFormat3.newRecord();
    long long5 = propertyOneByteHeaderRecordFormat2.getNextRecordReference(propertyRecord4);
    long long6 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord4);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader8 = null;
    int int9 = propertyRecordFormat7.getRecordSize(storeHeader8);
    long long10 = propertyRecordFormat7.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat11 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord13 = propertyRecordFormat12.newRecord();
    long long14 = propertyOneByteHeaderRecordFormat11.getNextRecordReference(propertyRecord13);
    org.neo4j.internal.id.IdSequence idSequence16 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext17 = null;
    propertyRecordFormat7.prepare(propertyRecord13, 0, idSequence16, cursorContext17);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord19 = propertyRecordFormat7.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor20 = null;
    try {
      propertyOneByteHeaderRecordFormat0.write(propertyRecord19, pageCursor20, 10,
          (int) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord4);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1125899906842623L + "'",
        long10 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord13);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord19);
  }

  @Test
  public void test0345() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0345");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v310_0.relationship();
    java.lang.String str2 = v310_0.name();
    org.neo4j.kernel.impl.store.format.RecordFormats[] recordFormatsArray3 = v310_0.compatibleVersionsForRollingUpgrade();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat4 = v310_0.dynamic();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat5 = v310_0.property();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "high_limitV3_1_0" + "'", str2,
        "high_limitV3_1_0");
    org.junit.Assert.assertNotNull(recordFormatsArray3);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat4);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat5);
  }

  @Test
  public void test0346() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0346");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) (-1),
        254L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
  }

  @Test
  public void test0347() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0347");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(96L, 14L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110L + "'", long2 == 110L);
  }

  @Test
  public void test0348() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0348");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat1 = v310_0.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat2 = v310_0.dynamic();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat3 = v310_0.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormats[] recordFormatsArray4 = v310_0.compatibleVersionsForRollingUpgrade();
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat1);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat2);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat3);
    org.junit.Assert.assertNotNull(recordFormatsArray4);
  }

  @Test
  public void test0349() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0349");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v300_1.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat3 = v300_1.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_0,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1, capabilityType4);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat6 = v300_1.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat7 = v300_1.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat8 = v300_1.relationshipTypeToken();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat6);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat7);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat8);
  }

  @Test
  public void test0350() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0350");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader3 = null;
    int int4 = propertyRecordFormat0.getRecordSize(storeHeader3);
    int int5 = propertyRecordFormat0.getRecordHeaderSize();
    long long6 = propertyRecordFormat0.getMaxId();
    org.neo4j.io.pagecache.PageCursor pageCursor7 = null;
    try {
      boolean boolean8 = propertyRecordFormat0.isInUse(pageCursor7);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1125899906842623L + "'",
        long6 == 1125899906842623L);
  }

  @Test
  public void test0351() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0351");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.FactoryHighLimitDefaultImpl factoryHighLimitDefaultImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.FactoryHighLimitDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats1 = factoryHighLimitDefaultImpl0.newInstance();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats2 = factoryHighLimitDefaultImpl0.newInstance();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats3 = factoryHighLimitDefaultImpl0.newInstance();
    org.junit.Assert.assertNotNull(recordFormats1);
    org.junit.Assert.assertNotNull(recordFormats2);
    org.junit.Assert.assertNotNull(recordFormats3);
  }

  @Test
  public void test0352() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0352");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (int) '4');
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0353() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0353");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (byte) 100);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord3 = null;
    long long4 = nodeRecordFormat2.getNextRecordReference(nodeRecord3);
    int int5 = nodeRecordFormat2.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader6 = null;
    int int7 = nodeRecordFormat2.getRecordSize(storeHeader6);
    int int10 = nodeRecordFormat2.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord11 = nodeRecordFormat2.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor12 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad13 = null;
    try {
      nodeHighLimitRecordFormat1.read(nodeRecord11, pageCursor12, recordLoad13, 32, 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    org.junit.Assert.assertNotNull(nodeRecord11);
  }

  @Test
  public void test0354() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0354");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int3 = recordFormatDynamicRecordImpl0.getPageSize(24, 8);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl4 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean6 = recordFormatDynamicRecordImpl4.equals((java.lang.Object) 100.0f);
    int int9 = recordFormatDynamicRecordImpl4.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord10 = recordFormatDynamicRecordImpl4.newRecord();
    long long11 = recordFormatDynamicRecordImpl0.getNextRecordReference(dynamicRecord10);
    org.neo4j.io.pagecache.PageCursor pageCursor12 = null;
    try {
      boolean boolean13 = recordFormatDynamicRecordImpl0.isInUse(pageCursor12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord10);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
  }

  @Test
  public void test0355() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0355");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v306_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat2 = v306_0.schema();
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_3 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat4 = v310_3.relationship();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType5 = null;
    boolean boolean6 = v306_0.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v310_3, capabilityType5);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat7 = v306_0.node();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat2);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat7);
  }

  @Test
  public void test0356() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0356");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((-39L),
        228L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
  }

  @Test
  public void test0357() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0357");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (int) (short) -1);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0358() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0358");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        64);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0359() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0359");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v320_0.relationship();
    java.lang.String str2 = v320_0.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat3 = v320_0.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat4 = v320_0.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat5 = v320_0.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat6 = v320_0.dynamic();
    java.lang.String str7 = v320_0.name();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "high_limitV3_2_0" + "'", str2,
        "high_limitV3_2_0");
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat3);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat4);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat5);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "high_limitV3_2_0" + "'", str7,
        "high_limitV3_2_0");
  }

  @Test
  public void test0360() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0360");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl7 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean9 = recordFormatDynamicRecordImpl7.equals((java.lang.Object) 100.0f);
    int int12 = recordFormatDynamicRecordImpl7.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord13 = recordFormatDynamicRecordImpl7.newRecord();
    long long14 = recordFormatDynamicRecordImpl0.getNextRecordReference(dynamicRecord13);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl15 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean17 = recordFormatDynamicRecordImpl15.equals((java.lang.Object) 100.0f);
    int int20 = recordFormatDynamicRecordImpl15.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord21 = recordFormatDynamicRecordImpl15.newRecord();
    int int24 = recordFormatDynamicRecordImpl15.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord25 = recordFormatDynamicRecordImpl15.newRecord();
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord26 = recordFormatDynamicRecordImpl15.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor27 = null;
    try {
      recordFormatDynamicRecordImpl0.write(dynamicRecord26, pageCursor27, (int) (byte) 0, 64);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord13);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord21);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord25);
    org.junit.Assert.assertNotNull(dynamicRecord26);
  }

  @Test
  public void test0361() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0361");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord2 = propertyRecordFormat1.newRecord();
    long long3 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord2);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader5 = null;
    int int6 = propertyRecordFormat4.getRecordSize(storeHeader5);
    long long7 = propertyRecordFormat4.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat8 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord10 = propertyRecordFormat9.newRecord();
    long long11 = propertyOneByteHeaderRecordFormat8.getNextRecordReference(propertyRecord10);
    org.neo4j.internal.id.IdSequence idSequence13 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext14 = null;
    propertyRecordFormat4.prepare(propertyRecord10, 0, idSequence13, cursorContext14);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord16 = propertyRecordFormat4.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor17 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad18 = null;
    try {
      propertyOneByteHeaderRecordFormat0.read(propertyRecord16, pageCursor17, recordLoad18,
          (int) (byte) 1, 4);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1125899906842623L + "'",
        long7 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord10);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord16);
  }

  @Test
  public void test0362() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0362");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        4);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0363() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0363");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long11 = relationshipGroupHighLimitRecordFormat10.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = null;
    long long14 = relationshipGroupHighLimitRecordFormat12.getNextRecordReference(
        relationshipGroupRecord13);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord15 = relationshipGroupHighLimitRecordFormat12.newRecord();
    org.neo4j.internal.id.IdSequence idSequence17 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext18 = null;
    relationshipGroupHighLimitRecordFormat10.prepare(relationshipGroupRecord15, (int) (byte) 1,
        idSequence17, cursorContext18);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat20 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord21 = null;
    long long22 = relationshipGroupHighLimitRecordFormat20.getNextRecordReference(
        relationshipGroupRecord21);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord23 = relationshipGroupHighLimitRecordFormat20.newRecord();
    org.neo4j.internal.id.IdSequence idSequence25 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext26 = null;
    relationshipGroupHighLimitRecordFormat10.prepare(relationshipGroupRecord23, 0, idSequence25,
        cursorContext26);
    org.neo4j.internal.id.IdSequence idSequence29 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext30 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord23, 128, idSequence29,
        cursorContext30);
    org.neo4j.io.pagecache.PageCursor pageCursor32 = null;
    try {
      boolean boolean33 = relationshipGroupHighLimitRecordFormat0.isInUse(pageCursor32);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1125899906842623L + "'",
        long11 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord15);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord23);
  }

  @Test
  public void test0364() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0364");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord2 = propertyRecordFormat1.newRecord();
    long long3 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord2);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = propertyOneByteHeaderRecordFormat0.getRecordSize(storeHeader4);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long7 = propertyOneByteHeaderRecordFormat6.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat8 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord10 = propertyRecordFormat9.newRecord();
    long long11 = propertyOneByteHeaderRecordFormat8.getNextRecordReference(propertyRecord10);
    long long12 = propertyOneByteHeaderRecordFormat6.getNextRecordReference(propertyRecord10);
    org.neo4j.internal.id.IdSequence idSequence14 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext15 = null;
    propertyOneByteHeaderRecordFormat0.prepare(propertyRecord10, 64, idSequence14, cursorContext15);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat17 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord18 = propertyRecordFormat17.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor19 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad20 = null;
    try {
      propertyOneByteHeaderRecordFormat0.read(propertyRecord18, pageCursor19, recordLoad20, 64, 3);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1125899906842623L + "'",
        long7 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord10);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord18);
  }

  @Test
  public void test0365() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0365");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat3 = v300_2.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat4 = v300_2.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType5 = null;
    boolean boolean6 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_1,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_2, capabilityType5);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat7 = v300_2.relationship();
    boolean boolean8 = relationshipGroupRecordFormat0.equals(
        (java.lang.Object) relationshipRecordRecordFormat7);
    int int9 = relationshipGroupRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader10 = null;
    int int11 = relationshipGroupRecordFormat0.getRecordSize(storeHeader10);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat3);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat7);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
  }

  @Test
  public void test0366() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0366");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    int int5 = propertyRecordFormat0.getPageSize((int) (byte) -1, 128);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long7 = propertyOneByteHeaderRecordFormat6.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord8 = propertyOneByteHeaderRecordFormat6.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = propertyOneByteHeaderRecordFormat6.newRecord();
    long long10 = propertyRecordFormat0.getNextRecordReference(propertyRecord9);
    java.lang.Class<?> wildcardClass11 = propertyRecordFormat0.getClass();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1125899906842623L + "'",
        long7 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord8);
    org.junit.Assert.assertNotNull(propertyRecord9);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0367() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0367");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        128);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0368() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0368");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(
        (long) (byte) -1, (long) 100);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
  }

  @Test
  public void test0369() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0369");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v300_1.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat3 = v300_1.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_0,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1, capabilityType4);
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_6 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat7 = v306_6.node();
    org.neo4j.storageengine.api.format.Capability capability8 = null;
    boolean boolean9 = v306_6.hasCapability(capability8);
    org.neo4j.storageengine.api.format.CapabilityType capabilityType10 = null;
    boolean boolean11 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_6, capabilityType10);
    org.neo4j.storageengine.api.format.Capability capability12 = null;
    boolean boolean13 = v306_6.hasCapability(capability12);
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily14 = v306_6.getFormatFamily();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat15 = v306_6.node();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue(
        "'" + formatFamily14 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily14.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat15);
  }

  @Test
  public void test0370() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0370");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord1 = null;
    long long2 = relationshipGroupHighLimitRecordFormat0.getNextRecordReference(
        relationshipGroupRecord1);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = relationshipGroupHighLimitRecordFormat0.newRecord();
    int int4 = relationshipGroupHighLimitRecordFormat0.getRecordHeaderSize();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord3);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
  }

  @Test
  public void test0371() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0371");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat1 = v310_0.relationshipGroup();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader3 = null;
    int int4 = propertyRecordFormat2.getRecordSize(storeHeader3);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl5 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats6 = highLimitFactoryDefaultImpl5.newInstance();
    boolean boolean7 = propertyRecordFormat2.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl5);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean10 = propertyRecordFormat2.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord11 = propertyRecordFormat2.newRecord();
    boolean boolean12 = v310_0.equals((java.lang.Object) propertyRecordFormat2);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader14 = null;
    int int15 = propertyRecordFormat13.getRecordSize(storeHeader14);
    int int18 = propertyRecordFormat13.getPageSize((int) (byte) -1, 128);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat19 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long20 = propertyOneByteHeaderRecordFormat19.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord21 = propertyOneByteHeaderRecordFormat19.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord22 = propertyOneByteHeaderRecordFormat19.newRecord();
    long long23 = propertyRecordFormat13.getNextRecordReference(propertyRecord22);
    org.neo4j.io.pagecache.PageCursor pageCursor24 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad25 = null;
    try {
      propertyRecordFormat2.read(propertyRecord22, pageCursor24, recordLoad25, (int) (short) 0,
          128);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat1);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
    org.junit.Assert.assertNotNull(recordFormats6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(propertyRecord11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1125899906842623L + "'",
        long20 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord21);
    org.junit.Assert.assertNotNull(propertyRecord22);
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
  }

  @Test
  public void test0372() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0372");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat1 = v300_0.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat2 = v300_0.schema();
    java.lang.String str3 = v300_0.storeVersion();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat4 = v300_0.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat5 = v300_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat6 = v300_0.property();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat1);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "vE.H.0" + "'", str3, "vE.H.0");
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat4);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat5);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat6);
  }

  @Test
  public void test0373() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0373");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v310_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat2 = v310_0.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat3 = v310_0.relationship();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat3);
  }

  @Test
  public void test0374() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0374");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        50);
    int int2 = relationshipHighLimitRecordFormat1.getRecordHeaderSize();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord5 = relationshipHighLimitRecordFormat4.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord7 = relationshipRecordFormat6.newRecord();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord8 = relationshipRecordFormat6.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord11 = relationshipHighLimitRecordFormat10.newRecord();
    org.neo4j.internal.id.IdSequence idSequence13 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext14 = null;
    relationshipRecordFormat6.prepare(relationshipRecord11, (int) (byte) 100, idSequence13,
        cursorContext14);
    org.neo4j.internal.id.IdSequence idSequence17 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext18 = null;
    relationshipHighLimitRecordFormat4.prepare(relationshipRecord11, 100, idSequence17,
        cursorContext18);
    org.neo4j.io.pagecache.PageCursor pageCursor20 = null;
    try {
      relationshipHighLimitRecordFormat1.write(relationshipRecord11, pageCursor20, 2,
          (int) (byte) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertNotNull(relationshipRecord5);
    org.junit.Assert.assertNotNull(relationshipRecord7);
    org.junit.Assert.assertNotNull(relationshipRecord8);
    org.junit.Assert.assertNotNull(relationshipRecord11);
  }

  @Test
  public void test0375() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0375");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        50);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0376() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0376");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord11 = null;
    long long12 = relationshipGroupHighLimitRecordFormat10.getNextRecordReference(
        relationshipGroupRecord11);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = relationshipGroupHighLimitRecordFormat10.newRecord();
    org.neo4j.internal.id.IdSequence idSequence15 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext16 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord13, 0, idSequence15,
        cursorContext16);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat18 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long19 = relationshipGroupHighLimitRecordFormat18.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat20 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord21 = null;
    long long22 = relationshipGroupHighLimitRecordFormat20.getNextRecordReference(
        relationshipGroupRecord21);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord23 = relationshipGroupHighLimitRecordFormat20.newRecord();
    org.neo4j.internal.id.IdSequence idSequence25 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext26 = null;
    relationshipGroupHighLimitRecordFormat18.prepare(relationshipGroupRecord23, 0, idSequence25,
        cursorContext26);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat28 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader29 = null;
    int int30 = relationshipGroupRecordFormat28.getRecordSize(storeHeader29);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord31 = relationshipGroupRecordFormat28.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat32 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader33 = null;
    int int34 = relationshipGroupRecordFormat32.getRecordSize(storeHeader33);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat35 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long36 = relationshipGroupHighLimitRecordFormat35.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat37 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord38 = null;
    long long39 = relationshipGroupHighLimitRecordFormat37.getNextRecordReference(
        relationshipGroupRecord38);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord40 = relationshipGroupHighLimitRecordFormat37.newRecord();
    org.neo4j.internal.id.IdSequence idSequence42 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext43 = null;
    relationshipGroupHighLimitRecordFormat35.prepare(relationshipGroupRecord40, (int) (byte) 1,
        idSequence42, cursorContext43);
    org.neo4j.internal.id.IdSequence idSequence46 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext47 = null;
    relationshipGroupRecordFormat32.prepare(relationshipGroupRecord40, 0, idSequence46,
        cursorContext47);
    long long49 = relationshipGroupRecordFormat28.getNextRecordReference(relationshipGroupRecord40);
    long long50 = relationshipGroupHighLimitRecordFormat18.getNextRecordReference(
        relationshipGroupRecord40);
    org.neo4j.internal.id.IdSequence idSequence52 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext53 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord40, 3, idSequence52,
        cursorContext53);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader55 = null;
    int int56 = relationshipGroupHighLimitRecordFormat0.getRecordSize(storeHeader55);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord57 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor58 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad59 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.read(relationshipGroupRecord57, pageCursor58,
          recordLoad59, 24, (int) (byte) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord13);
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1125899906842623L + "'",
        long19 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord23);
    org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    org.junit.Assert.assertNotNull(relationshipGroupRecord31);
    org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1125899906842623L + "'",
        long36 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord40);
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
    org.junit.Assert.assertTrue("'" + int56 + "' != '" + 32 + "'", int56 == 32);
  }

  @Test
  public void test0377() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0377");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        8);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0378() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0378");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v310_0.relationship();
    java.lang.String str2 = v310_0.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat3 = v310_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat4 = v310_0.node();
    org.neo4j.storageengine.api.format.Capability[] capabilityArray5 = v310_0.capabilities();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat6 = v310_0.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat7 = v310_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat8 = v310_0.dynamic();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "high_limitV3_1_0" + "'", str2,
        "high_limitV3_1_0");
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat3);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat4);
    org.junit.Assert.assertNotNull(capabilityArray5);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat6);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat7);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat8);
  }

  @Test
  public void test0379() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0379");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) ' ');
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord3 = null;
    long long4 = nodeRecordFormat2.getNextRecordReference(nodeRecord3);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord5 = nodeRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    nodeHighLimitRecordFormat1.prepare(nodeRecord5, 32, idSequence7, cursorContext8);
    org.neo4j.io.pagecache.PageCursor pageCursor10 = null;
    try {
      boolean boolean11 = nodeHighLimitRecordFormat1.isInUse(pageCursor10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(nodeRecord5);
  }

  @Test
  public void test0380() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0380");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    int int5 = propertyRecordFormat0.getPageSize((int) (byte) -1, 128);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long7 = propertyOneByteHeaderRecordFormat6.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord8 = propertyOneByteHeaderRecordFormat6.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = propertyOneByteHeaderRecordFormat6.newRecord();
    long long10 = propertyRecordFormat0.getNextRecordReference(propertyRecord9);
    long long11 = propertyRecordFormat0.getMaxId();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1125899906842623L + "'",
        long7 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord8);
    org.junit.Assert.assertNotNull(propertyRecord9);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1125899906842623L + "'",
        long11 == 1125899906842623L);
  }

  @Test
  public void test0381() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0381");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    int int1 = nodeRecordFormat0.getRecordHeaderSize();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat nodeRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord4 = null;
    long long5 = nodeRecordFormat3.getNextRecordReference(nodeRecord4);
    int int6 = nodeRecordFormat3.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader7 = null;
    int int8 = nodeRecordFormat3.getRecordSize(storeHeader7);
    int int11 = nodeRecordFormat3.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord12 = nodeRecordFormat3.newRecord();
    int int13 = nodeRecordFormat2.rerdtlgForRE(nodeRecord12);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord14 = nodeRecordFormat2.newRecord();
    int int15 = nodeRecordFormat0.rerdtlgForRE(nodeRecord14);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat16 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long17 = relationshipGroupHighLimitRecordFormat16.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat18 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord19 = null;
    long long20 = relationshipGroupHighLimitRecordFormat18.getNextRecordReference(
        relationshipGroupRecord19);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord21 = relationshipGroupHighLimitRecordFormat18.newRecord();
    org.neo4j.internal.id.IdSequence idSequence23 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext24 = null;
    relationshipGroupHighLimitRecordFormat16.prepare(relationshipGroupRecord21, (int) (byte) 1,
        idSequence23, cursorContext24);
    boolean boolean26 = nodeRecordFormat0.equals((java.lang.Object) cursorContext24);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    org.junit.Assert.assertNotNull(nodeRecord12);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    org.junit.Assert.assertNotNull(nodeRecord14);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1125899906842623L + "'",
        long17 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord21);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
  }

  @Test
  public void test0382() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0382");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.FactoryHighLimitDefaultImpl factoryHighLimitDefaultImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.FactoryHighLimitDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats1 = factoryHighLimitDefaultImpl0.newInstance();
    io.github.onograph.kernel.srv.store.format.highlimit.v310.FactoryHighLimitDefaultImpl factoryHighLimitDefaultImpl2 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.FactoryHighLimitDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats3 = factoryHighLimitDefaultImpl2.newInstance();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        recordFormats1, recordFormats3, capabilityType4);
    org.junit.Assert.assertNotNull(recordFormats1);
    org.junit.Assert.assertNotNull(recordFormats3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
  }

  @Test
  public void test0383() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0383");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(0L,
        (long) 50);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 50L + "'", long2 == 50L);
  }

  @Test
  public void test0384() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0384");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_1 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat2 = v300_1.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat3 = v300_1.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType4 = null;
    boolean boolean5 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_0,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_1, capabilityType4);
    org.neo4j.storageengine.api.format.Capability[] capabilityArray6 = v306_0.capabilities();
    org.neo4j.kernel.impl.store.format.RecordFormats[] recordFormatsArray7 = v306_0.compatibleVersionsForRollingUpgrade();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat8 = v306_0.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat9 = v306_0.labelToken();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(capabilityArray6);
    org.junit.Assert.assertNotNull(recordFormatsArray7);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat8);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat9);
  }

  @Test
  public void test0385() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0385");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        100);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0386() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0386");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    int int3 = relationshipRecordFormat2.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord4 = relationshipRecordFormat2.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor5 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad6 = null;
    try {
      relationshipHighLimitRecordFormat1.read(relationshipRecord4, pageCursor5, recordLoad6, 50, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertNotNull(relationshipRecord4);
  }

  @Test
  public void test0387() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0387");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat1 = v310_0.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat2 = v310_0.dynamic();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat3 = v310_0.relationshipGroup();
    java.lang.String str4 = v310_0.storeVersion();
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat1);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat2);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "vE.H.2" + "'", str4, "vE.H.2");
  }

  @Test
  public void test0388() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0388");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    int int9 = recordFormatDynamicRecordImpl0.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord10 = recordFormatDynamicRecordImpl0.newRecord();
    int int13 = recordFormatDynamicRecordImpl0.getPageSize((int) '4', (int) (short) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_14 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat15 = v320_14.relationship();
    boolean boolean16 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) v320_14);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat17 = v320_14.property();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat18 = v320_14.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat19 = v320_14.relationshipTypeToken();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord10);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat17);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat18);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat19);
  }

  @Test
  public void test0389() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0389");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        4);
  }

  @Test
  public void test0390() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0390");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord7 = null;
    long long8 = nodeRecordFormat6.getNextRecordReference(nodeRecord7);
    int int9 = nodeRecordFormat6.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader10 = null;
    int int11 = nodeRecordFormat6.getRecordSize(storeHeader10);
    int int14 = nodeRecordFormat6.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord15 = nodeRecordFormat6.newRecord();
    long long16 = nodeRecordFormat0.getNextRecordReference(nodeRecord15);
    org.neo4j.io.pagecache.PageCursor pageCursor17 = null;
    try {
      boolean boolean18 = nodeRecordFormat0.isInUse(pageCursor17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    org.junit.Assert.assertNotNull(nodeRecord15);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
  }

  @Test
  public void test0391() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0391");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.toable(100L,
        (-40L));
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
  }

  @Test
  public void test0392() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0392");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    long long3 = recordFormatDynamicRecordImpl0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl4 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean6 = recordFormatDynamicRecordImpl4.equals((java.lang.Object) 100.0f);
    int int9 = recordFormatDynamicRecordImpl4.getPageSize(16, (-1));
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl10 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean12 = recordFormatDynamicRecordImpl10.equals((java.lang.Object) 100.0f);
    int int15 = recordFormatDynamicRecordImpl10.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord16 = recordFormatDynamicRecordImpl10.newRecord();
    int int19 = recordFormatDynamicRecordImpl10.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord20 = recordFormatDynamicRecordImpl10.newRecord();
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord21 = recordFormatDynamicRecordImpl10.newRecord();
    org.neo4j.internal.id.IdSequence idSequence23 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext24 = null;
    recordFormatDynamicRecordImpl4.prepare(dynamicRecord21, 10, idSequence23, cursorContext24);
    org.neo4j.io.pagecache.PageCursor pageCursor26 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad27 = null;
    try {
      recordFormatDynamicRecordImpl0.read(dynamicRecord21, pageCursor26, recordLoad27, 0,
          (int) '#');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord16);
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord20);
    org.junit.Assert.assertNotNull(dynamicRecord21);
  }

  @Test
  public void test0393() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0393");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord11 = null;
    long long12 = relationshipGroupHighLimitRecordFormat10.getNextRecordReference(
        relationshipGroupRecord11);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = relationshipGroupHighLimitRecordFormat10.newRecord();
    org.neo4j.internal.id.IdSequence idSequence15 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext16 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord13, 0, idSequence15,
        cursorContext16);
    long long18 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat19 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    int int22 = relationshipGroupRecordFormat19.getPageSize((int) 'a', (int) (short) 100);
    long long23 = relationshipGroupRecordFormat19.getMaxId();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord24 = relationshipGroupRecordFormat19.newRecord();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord25 = relationshipGroupRecordFormat19.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor26 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord25, pageCursor26, 16,
          (int) (byte) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord13);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1125899906842623L + "'",
        long18 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1125899906842623L + "'",
        long23 == 1125899906842623L);
    org.junit.Assert.assertNotNull(relationshipGroupRecord24);
    org.junit.Assert.assertNotNull(relationshipGroupRecord25);
  }

  @Test
  public void test0394() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0394");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean8 = propertyRecordFormat0.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = null;
    org.neo4j.internal.id.IdSequence idSequence11 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext12 = null;
    propertyRecordFormat0.prepare(propertyRecord9, (int) (short) 0, idSequence11, cursorContext12);
    long long14 = propertyRecordFormat0.getMaxId();
    int int15 = propertyRecordFormat0.getRecordHeaderSize();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1125899906842623L + "'",
        long14 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
  }

  @Test
  public void test0395() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0395");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 2,
        11L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
  }

  @Test
  public void test0396() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0396");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(103L,
        (long) 100);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 103L + "'", long2 == 103L);
  }

  @Test
  public void test0397() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0397");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat1 = v310_0.relationshipGroup();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader3 = null;
    int int4 = propertyRecordFormat2.getRecordSize(storeHeader3);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl5 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats6 = highLimitFactoryDefaultImpl5.newInstance();
    boolean boolean7 = propertyRecordFormat2.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl5);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean10 = propertyRecordFormat2.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord11 = propertyRecordFormat2.newRecord();
    boolean boolean12 = v310_0.equals((java.lang.Object) propertyRecordFormat2);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord14 = propertyRecordFormat13.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat15 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader16 = null;
    int int17 = propertyRecordFormat15.getRecordSize(storeHeader16);
    long long18 = propertyRecordFormat15.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat19 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat20 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord21 = propertyRecordFormat20.newRecord();
    long long22 = propertyOneByteHeaderRecordFormat19.getNextRecordReference(propertyRecord21);
    org.neo4j.internal.id.IdSequence idSequence24 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext25 = null;
    propertyRecordFormat15.prepare(propertyRecord21, 0, idSequence24, cursorContext25);
    long long27 = propertyRecordFormat13.getNextRecordReference(propertyRecord21);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat28 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader29 = null;
    int int30 = propertyRecordFormat28.getRecordSize(storeHeader29);
    int int33 = propertyRecordFormat28.getPageSize((int) (byte) -1, 128);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat34 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long35 = propertyOneByteHeaderRecordFormat34.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord36 = propertyOneByteHeaderRecordFormat34.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord37 = propertyOneByteHeaderRecordFormat34.newRecord();
    long long38 = propertyRecordFormat28.getNextRecordReference(propertyRecord37);
    long long39 = propertyRecordFormat13.getNextRecordReference(propertyRecord37);
    org.neo4j.io.pagecache.PageCursor pageCursor40 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad41 = null;
    try {
      propertyRecordFormat2.read(propertyRecord37, pageCursor40, recordLoad41, 0, 12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat1);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
    org.junit.Assert.assertNotNull(recordFormats6);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    org.junit.Assert.assertNotNull(propertyRecord11);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(propertyRecord14);
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1125899906842623L + "'",
        long18 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord21);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
    org.junit.Assert.assertTrue("'" + int30 + "' != '" + 48 + "'", int30 == 48);
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1125899906842623L + "'",
        long35 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord36);
    org.junit.Assert.assertNotNull(propertyRecord37);
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
  }

  @Test
  public void test0398() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0398");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        4);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0399() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0399");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long2 = relationshipGroupHighLimitRecordFormat1.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord4 = null;
    long long5 = relationshipGroupHighLimitRecordFormat3.getNextRecordReference(
        relationshipGroupRecord4);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord6 = relationshipGroupHighLimitRecordFormat3.newRecord();
    org.neo4j.internal.id.IdSequence idSequence8 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext9 = null;
    relationshipGroupHighLimitRecordFormat1.prepare(relationshipGroupRecord6, (int) (byte) 1,
        idSequence8, cursorContext9);
    long long11 = relationshipGroupHighLimitRecordFormat0.getNextRecordReference(
        relationshipGroupRecord6);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long13 = relationshipGroupHighLimitRecordFormat12.getMaxId();
    long long14 = relationshipGroupHighLimitRecordFormat12.getMaxId();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord15 = relationshipGroupHighLimitRecordFormat12.newRecord();
    org.neo4j.internal.id.IdSequence idSequence17 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext18 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord15, 3, idSequence17,
        cursorContext18);
    int int22 = relationshipGroupHighLimitRecordFormat0.getPageSize((int) (byte) 0,
        (int) (byte) 100);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord23 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor24 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord23, pageCursor24,
          (int) (short) 10, (int) '4');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842623L + "'",
        long2 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord6);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1125899906842623L + "'",
        long13 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1125899906842623L + "'",
        long14 == 1125899906842623L);
    org.junit.Assert.assertNotNull(relationshipGroupRecord15);
    org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
  }

  @Test
  public void test0400() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0400");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v306_0.relationship();
    org.neo4j.storageengine.api.format.Capability[] capabilityArray2 = v306_0.capabilities();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat3 = v306_0.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily4 = v306_0.getFormatFamily();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(capabilityArray2);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat3);
    org.junit.Assert.assertTrue(
        "'" + formatFamily4 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily4.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
  }

  @Test
  public void test0401() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0401");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v306_0.relationship();
    org.neo4j.storageengine.api.format.Capability[] capabilityArray2 = v306_0.capabilities();
    java.lang.String str3 = v306_0.introductionVersion();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat4 = v306_0.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat5 = v306_0.labelToken();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(capabilityArray2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3.0.6" + "'", str3, "3.0.6");
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat4);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat5);
  }

  @Test
  public void test0402() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0402");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, 0, idSequence7,
        cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader11 = null;
    int int12 = relationshipGroupRecordFormat10.getRecordSize(storeHeader11);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = relationshipGroupRecordFormat10.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader15 = null;
    int int16 = relationshipGroupRecordFormat14.getRecordSize(storeHeader15);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat17 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long18 = relationshipGroupHighLimitRecordFormat17.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat19 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord20 = null;
    long long21 = relationshipGroupHighLimitRecordFormat19.getNextRecordReference(
        relationshipGroupRecord20);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord22 = relationshipGroupHighLimitRecordFormat19.newRecord();
    org.neo4j.internal.id.IdSequence idSequence24 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext25 = null;
    relationshipGroupHighLimitRecordFormat17.prepare(relationshipGroupRecord22, (int) (byte) 1,
        idSequence24, cursorContext25);
    org.neo4j.internal.id.IdSequence idSequence28 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext29 = null;
    relationshipGroupRecordFormat14.prepare(relationshipGroupRecord22, 0, idSequence28,
        cursorContext29);
    long long31 = relationshipGroupRecordFormat10.getNextRecordReference(relationshipGroupRecord22);
    long long32 = relationshipGroupHighLimitRecordFormat0.getNextRecordReference(
        relationshipGroupRecord22);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat33 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long34 = relationshipGroupHighLimitRecordFormat33.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat35 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord36 = null;
    long long37 = relationshipGroupHighLimitRecordFormat35.getNextRecordReference(
        relationshipGroupRecord36);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord38 = relationshipGroupHighLimitRecordFormat35.newRecord();
    org.neo4j.internal.id.IdSequence idSequence40 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext41 = null;
    relationshipGroupHighLimitRecordFormat33.prepare(relationshipGroupRecord38, (int) (byte) 1,
        idSequence40, cursorContext41);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat43 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord44 = null;
    long long45 = relationshipGroupHighLimitRecordFormat43.getNextRecordReference(
        relationshipGroupRecord44);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord46 = relationshipGroupHighLimitRecordFormat43.newRecord();
    org.neo4j.internal.id.IdSequence idSequence48 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext49 = null;
    relationshipGroupHighLimitRecordFormat33.prepare(relationshipGroupRecord46, 0, idSequence48,
        cursorContext49);
    long long51 = relationshipGroupHighLimitRecordFormat33.getMaxId();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord52 = relationshipGroupHighLimitRecordFormat33.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor53 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad54 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.read(relationshipGroupRecord52, pageCursor53,
          recordLoad54, (int) (short) 0, (int) (short) 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    org.junit.Assert.assertNotNull(relationshipGroupRecord13);
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1125899906842623L + "'",
        long18 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord22);
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
    org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1125899906842623L + "'",
        long34 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord38);
    org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord46);
    org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1125899906842623L + "'",
        long51 == 1125899906842623L);
    org.junit.Assert.assertNotNull(relationshipGroupRecord52);
  }

  @Test
  public void test0403() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0403");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v310_0.relationship();
    java.lang.String str2 = v310_0.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat3 = v310_0.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat4 = v310_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat5 = v310_0.labelToken();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "high_limitV3_1_0" + "'", str2,
        "high_limitV3_1_0");
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat3);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat4);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat5);
  }

  @Test
  public void test0404() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0404");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.FactoryHighLimitDefaultImpl factoryHighLimitDefaultImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.FactoryHighLimitDefaultImpl();
    java.lang.String str1 = factoryHighLimitDefaultImpl0.getName();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats2 = factoryHighLimitDefaultImpl0.newInstance();
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "high_limitV3_0_6" + "'", str1,
        "high_limitV3_0_6");
    org.junit.Assert.assertNotNull(recordFormats2);
  }

  @Test
  public void test0405() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0405");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int1 = recordFormatDynamicRecordImpl0.getRecordHeaderSize();
    org.neo4j.io.pagecache.PageCursor pageCursor2 = null;
    try {
      boolean boolean3 = recordFormatDynamicRecordImpl0.isInUse(pageCursor2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
  }

  @Test
  public void test0406() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0406");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat1 = v310_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat2 = v310_0.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat3 = v310_0.relationship();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily4 = v310_0.getFormatFamily();
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat3);
    org.junit.Assert.assertTrue(
        "'" + formatFamily4 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily4.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
  }

  @Test
  public void test0407() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0407");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = null;
    org.neo4j.internal.id.IdSequence idSequence8 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext9 = null;
    recordFormatDynamicRecordImpl0.prepare(dynamicRecord6, (int) (byte) -1, idSequence8,
        cursorContext9);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl11 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean13 = recordFormatDynamicRecordImpl11.equals((java.lang.Object) 100.0f);
    int int16 = recordFormatDynamicRecordImpl11.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord17 = recordFormatDynamicRecordImpl11.newRecord();
    int int20 = recordFormatDynamicRecordImpl11.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord21 = recordFormatDynamicRecordImpl11.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor22 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad23 = null;
    try {
      recordFormatDynamicRecordImpl0.read(dynamicRecord21, pageCursor22, recordLoad23, 96,
          (int) (short) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord17);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord21);
  }

  @Test
  public void test0408() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0408");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v306_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat2 = v306_0.schema();
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_3 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat4 = v310_3.relationship();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType5 = null;
    boolean boolean6 = v306_0.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v310_3, capabilityType5);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat7 = v306_0.relationship();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily8 = v306_0.getFormatFamily();
    java.lang.String str9 = v306_0.toString();
    int int10 = v306_0.generation();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat2);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat7);
    org.junit.Assert.assertTrue(
        "'" + formatFamily8 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily8.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RecordFormat:V306[vE.H.0b]" + "'", str9,
        "RecordFormat:V306[vE.H.0b]");
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
  }

  @Test
  public void test0409() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0409");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat(
        0);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long3 = relationshipGroupHighLimitRecordFormat2.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = null;
    long long6 = relationshipGroupHighLimitRecordFormat4.getNextRecordReference(
        relationshipGroupRecord5);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord7 = relationshipGroupHighLimitRecordFormat4.newRecord();
    org.neo4j.internal.id.IdSequence idSequence9 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext10 = null;
    relationshipGroupHighLimitRecordFormat2.prepare(relationshipGroupRecord7, (int) (byte) 1,
        idSequence9, cursorContext10);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long13 = relationshipGroupHighLimitRecordFormat12.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord15 = null;
    long long16 = relationshipGroupHighLimitRecordFormat14.getNextRecordReference(
        relationshipGroupRecord15);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord17 = relationshipGroupHighLimitRecordFormat14.newRecord();
    org.neo4j.internal.id.IdSequence idSequence19 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext20 = null;
    relationshipGroupHighLimitRecordFormat12.prepare(relationshipGroupRecord17, (int) (byte) 1,
        idSequence19, cursorContext20);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat22 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord23 = null;
    long long24 = relationshipGroupHighLimitRecordFormat22.getNextRecordReference(
        relationshipGroupRecord23);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord25 = relationshipGroupHighLimitRecordFormat22.newRecord();
    org.neo4j.internal.id.IdSequence idSequence27 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext28 = null;
    relationshipGroupHighLimitRecordFormat12.prepare(relationshipGroupRecord25, 0, idSequence27,
        cursorContext28);
    org.neo4j.internal.id.IdSequence idSequence31 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext32 = null;
    relationshipGroupHighLimitRecordFormat2.prepare(relationshipGroupRecord25, 128, idSequence31,
        cursorContext32);
    org.neo4j.internal.id.IdSequence idSequence35 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext36 = null;
    relationshipGroupHighLimitRecordFormat1.prepare(relationshipGroupRecord25, 16, idSequence35,
        cursorContext36);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat38 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader39 = null;
    int int40 = relationshipGroupRecordFormat38.getRecordSize(storeHeader39);
    long long41 = relationshipGroupRecordFormat38.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat42 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord43 = null;
    long long44 = relationshipGroupHighLimitRecordFormat42.getNextRecordReference(
        relationshipGroupRecord43);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord45 = relationshipGroupHighLimitRecordFormat42.newRecord();
    org.neo4j.internal.id.IdSequence idSequence47 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext48 = null;
    relationshipGroupRecordFormat38.prepare(relationshipGroupRecord45, 128, idSequence47,
        cursorContext48);
    long long50 = relationshipGroupHighLimitRecordFormat1.getNextRecordReference(
        relationshipGroupRecord45);
    org.neo4j.io.pagecache.PageCursor pageCursor51 = null;
    try {
      boolean boolean52 = relationshipGroupHighLimitRecordFormat1.isInUse(pageCursor51);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord7);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1125899906842623L + "'",
        long13 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord17);
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord25);
    org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
    org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1125899906842623L + "'",
        long41 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord45);
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
  }

  @Test
  public void test0410() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0410");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v306_0.relationship();
    org.neo4j.storageengine.api.format.Capability[] capabilityArray2 = v306_0.capabilities();
    java.lang.String str3 = v306_0.introductionVersion();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat4 = v306_0.propertyKeyToken();
    java.lang.String str5 = v306_0.introductionVersion();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(capabilityArray2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3.0.6" + "'", str3, "3.0.6");
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3.0.6" + "'", str5, "3.0.6");
  }

  @Test
  public void test0411() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0411");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(
        (long) (short) 10, (long) (short) 1);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
  }

  @Test
  public void test0412() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0412");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord3 = nodeRecordFormat0.newRecord();
    long long4 = nodeRecordFormat0.getMaxId();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertNotNull(nodeRecord3);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1125899906842623L + "'",
        long4 == 1125899906842623L);
  }

  @Test
  public void test0413() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0413");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat1 = v306_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat2 = v306_0.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat3 = v306_0.relationshipGroup();
    java.lang.Class<?> wildcardClass4 = relationshipGroupRecordRecordFormat3.getClass();
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat1);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0414() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0414");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        50);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0415() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0415");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader6 = null;
    int int7 = nodeRecordFormat0.getRecordSize(storeHeader6);
    int int10 = nodeRecordFormat0.getPageSize((int) ' ', 4);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord11 = nodeRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat nodeRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.NodeRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord14 = null;
    long long15 = nodeRecordFormat13.getNextRecordReference(nodeRecord14);
    int int16 = nodeRecordFormat13.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader17 = null;
    int int18 = nodeRecordFormat13.getRecordSize(storeHeader17);
    int int21 = nodeRecordFormat13.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord22 = nodeRecordFormat13.newRecord();
    int int23 = nodeRecordFormat12.rerdtlgForRE(nodeRecord22);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord24 = nodeRecordFormat12.newRecord();
    int int25 = nodeRecordFormat0.rerdtlgForRE(nodeRecord24);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    org.junit.Assert.assertNotNull(nodeRecord11);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    org.junit.Assert.assertNotNull(nodeRecord22);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    org.junit.Assert.assertNotNull(nodeRecord24);
    org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
  }

  @Test
  public void test0416() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0416");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long2 = relationshipGroupHighLimitRecordFormat1.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord4 = null;
    long long5 = relationshipGroupHighLimitRecordFormat3.getNextRecordReference(
        relationshipGroupRecord4);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord6 = relationshipGroupHighLimitRecordFormat3.newRecord();
    org.neo4j.internal.id.IdSequence idSequence8 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext9 = null;
    relationshipGroupHighLimitRecordFormat1.prepare(relationshipGroupRecord6, (int) (byte) 1,
        idSequence8, cursorContext9);
    long long11 = relationshipGroupHighLimitRecordFormat0.getNextRecordReference(
        relationshipGroupRecord6);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader13 = null;
    int int14 = relationshipGroupRecordFormat12.getRecordSize(storeHeader13);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat15 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long16 = relationshipGroupHighLimitRecordFormat15.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat17 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord18 = null;
    long long19 = relationshipGroupHighLimitRecordFormat17.getNextRecordReference(
        relationshipGroupRecord18);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord20 = relationshipGroupHighLimitRecordFormat17.newRecord();
    org.neo4j.internal.id.IdSequence idSequence22 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext23 = null;
    relationshipGroupHighLimitRecordFormat15.prepare(relationshipGroupRecord20, 0, idSequence22,
        cursorContext23);
    long long25 = relationshipGroupRecordFormat12.getNextRecordReference(relationshipGroupRecord20);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat26 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader27 = null;
    int int28 = relationshipGroupRecordFormat26.getRecordSize(storeHeader27);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat29 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long30 = relationshipGroupHighLimitRecordFormat29.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat31 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord32 = null;
    long long33 = relationshipGroupHighLimitRecordFormat31.getNextRecordReference(
        relationshipGroupRecord32);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord34 = relationshipGroupHighLimitRecordFormat31.newRecord();
    org.neo4j.internal.id.IdSequence idSequence36 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext37 = null;
    relationshipGroupHighLimitRecordFormat29.prepare(relationshipGroupRecord34, 0, idSequence36,
        cursorContext37);
    long long39 = relationshipGroupRecordFormat26.getNextRecordReference(relationshipGroupRecord34);
    org.neo4j.internal.id.IdSequence idSequence41 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext42 = null;
    relationshipGroupRecordFormat12.prepare(relationshipGroupRecord34, (int) '#', idSequence41,
        cursorContext42);
    org.neo4j.io.pagecache.PageCursor pageCursor44 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad45 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.read(relationshipGroupRecord34, pageCursor44,
          recordLoad45, 8, (int) (short) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842623L + "'",
        long2 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord6);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1125899906842623L + "'",
        long16 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord20);
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1125899906842623L + "'",
        long30 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord34);
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
  }

  @Test
  public void test0417() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0417");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = relationshipGroupRecordFormat0.getRecordSize(storeHeader1);
    long long3 = relationshipGroupRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = null;
    long long6 = relationshipGroupHighLimitRecordFormat4.getNextRecordReference(
        relationshipGroupRecord5);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord7 = relationshipGroupHighLimitRecordFormat4.newRecord();
    org.neo4j.internal.id.IdSequence idSequence9 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext10 = null;
    relationshipGroupRecordFormat0.prepare(relationshipGroupRecord7, 128, idSequence9,
        cursorContext10);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    int int15 = relationshipGroupRecordFormat12.getPageSize((int) 'a', (int) (short) 100);
    long long16 = relationshipGroupRecordFormat12.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat17 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat18 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord19 = null;
    long long20 = relationshipGroupHighLimitRecordFormat18.getNextRecordReference(
        relationshipGroupRecord19);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord21 = relationshipGroupHighLimitRecordFormat18.newRecord();
    org.neo4j.internal.id.IdSequence idSequence23 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext24 = null;
    relationshipGroupRecordFormat17.prepare(relationshipGroupRecord21, (-1), idSequence23,
        cursorContext24);
    org.neo4j.internal.id.IdSequence idSequence27 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext28 = null;
    relationshipGroupRecordFormat12.prepare(relationshipGroupRecord21, 128, idSequence27,
        cursorContext28);
    org.neo4j.internal.id.IdSequence idSequence31 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext32 = null;
    relationshipGroupRecordFormat0.prepare(relationshipGroupRecord21, 10, idSequence31,
        cursorContext32);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord7);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1125899906842623L + "'",
        long16 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord21);
  }

  @Test
  public void test0418() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0418");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 16,
        (long) 24);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
  }

  @Test
  public void test0419() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0419");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord2 = propertyRecordFormat1.newRecord();
    long long3 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord2);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat5 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = propertyRecordFormat5.newRecord();
    long long7 = propertyOneByteHeaderRecordFormat4.getNextRecordReference(propertyRecord6);
    long long8 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord6);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord10 = propertyOneByteHeaderRecordFormat9.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor11 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad12 = null;
    try {
      propertyOneByteHeaderRecordFormat0.read(propertyRecord10, pageCursor11, recordLoad12, 3, 35);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord6);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord10);
  }

  @Test
  public void test0420() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0420");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(14L,
        (long) (short) 100);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110L + "'", long2 == 110L);
  }

  @Test
  public void test0421() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0421");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v306_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat2 = v306_0.schema();
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_3 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat4 = v310_3.relationship();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType5 = null;
    boolean boolean6 = v306_0.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v310_3, capabilityType5);
    java.lang.String str7 = v310_3.name();
    java.lang.String str8 = v310_3.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat9 = v310_3.relationship();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat2);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "high_limitV3_1_0" + "'", str7,
        "high_limitV3_1_0");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "high_limitV3_1_0" + "'", str8,
        "high_limitV3_1_0");
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat9);
  }

  @Test
  public void test0422() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0422");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v320_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat2 = v320_0.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat3 = v320_0.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat4 = v320_0.relationshipTypeToken();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat2);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat3);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat4);
  }

  @Test
  public void test0423() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0423");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader6 = null;
    int int7 = nodeRecordFormat0.getRecordSize(storeHeader6);
    int int10 = nodeRecordFormat0.getPageSize((int) ' ', 4);
    boolean boolean12 = nodeRecordFormat0.equals((java.lang.Object) 100L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
  }

  @Test
  public void test0424() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0424");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v300_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat2 = v300_0.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat3 = v300_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat4 = v300_0.property();
    java.lang.Class<?> wildcardClass5 = v300_0.getClass();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat3);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0425() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0425");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord11 = null;
    long long12 = relationshipGroupHighLimitRecordFormat10.getNextRecordReference(
        relationshipGroupRecord11);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = relationshipGroupHighLimitRecordFormat10.newRecord();
    org.neo4j.internal.id.IdSequence idSequence15 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext16 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord13, 0, idSequence15,
        cursorContext16);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat18 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long19 = relationshipGroupHighLimitRecordFormat18.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat20 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord21 = null;
    long long22 = relationshipGroupHighLimitRecordFormat20.getNextRecordReference(
        relationshipGroupRecord21);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord23 = relationshipGroupHighLimitRecordFormat20.newRecord();
    org.neo4j.internal.id.IdSequence idSequence25 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext26 = null;
    relationshipGroupHighLimitRecordFormat18.prepare(relationshipGroupRecord23, 0, idSequence25,
        cursorContext26);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat28 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader29 = null;
    int int30 = relationshipGroupRecordFormat28.getRecordSize(storeHeader29);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord31 = relationshipGroupRecordFormat28.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat32 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader33 = null;
    int int34 = relationshipGroupRecordFormat32.getRecordSize(storeHeader33);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat35 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long36 = relationshipGroupHighLimitRecordFormat35.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat37 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord38 = null;
    long long39 = relationshipGroupHighLimitRecordFormat37.getNextRecordReference(
        relationshipGroupRecord38);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord40 = relationshipGroupHighLimitRecordFormat37.newRecord();
    org.neo4j.internal.id.IdSequence idSequence42 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext43 = null;
    relationshipGroupHighLimitRecordFormat35.prepare(relationshipGroupRecord40, (int) (byte) 1,
        idSequence42, cursorContext43);
    org.neo4j.internal.id.IdSequence idSequence46 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext47 = null;
    relationshipGroupRecordFormat32.prepare(relationshipGroupRecord40, 0, idSequence46,
        cursorContext47);
    long long49 = relationshipGroupRecordFormat28.getNextRecordReference(relationshipGroupRecord40);
    long long50 = relationshipGroupHighLimitRecordFormat18.getNextRecordReference(
        relationshipGroupRecord40);
    org.neo4j.internal.id.IdSequence idSequence52 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext53 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord40, 3, idSequence52,
        cursorContext53);
    int int55 = relationshipGroupHighLimitRecordFormat0.getRecordHeaderSize();
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord13);
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1125899906842623L + "'",
        long19 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord23);
    org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    org.junit.Assert.assertNotNull(relationshipGroupRecord31);
    org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1125899906842623L + "'",
        long36 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord40);
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
    org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
  }

  @Test
  public void test0426() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0426");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = propertyRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader3 = null;
    int int4 = propertyRecordFormat2.getRecordSize(storeHeader3);
    long long5 = propertyRecordFormat2.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord8 = propertyRecordFormat7.newRecord();
    long long9 = propertyOneByteHeaderRecordFormat6.getNextRecordReference(propertyRecord8);
    org.neo4j.internal.id.IdSequence idSequence11 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext12 = null;
    propertyRecordFormat2.prepare(propertyRecord8, 0, idSequence11, cursorContext12);
    long long14 = propertyRecordFormat0.getNextRecordReference(propertyRecord8);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat15 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader16 = null;
    int int17 = propertyRecordFormat15.getRecordSize(storeHeader16);
    int int20 = propertyRecordFormat15.getPageSize((int) (byte) -1, 128);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat21 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long22 = propertyOneByteHeaderRecordFormat21.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord23 = propertyOneByteHeaderRecordFormat21.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord24 = propertyOneByteHeaderRecordFormat21.newRecord();
    long long25 = propertyRecordFormat15.getNextRecordReference(propertyRecord24);
    long long26 = propertyRecordFormat0.getNextRecordReference(propertyRecord24);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat27 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long28 = propertyOneByteHeaderRecordFormat27.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat29 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat30 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord31 = propertyRecordFormat30.newRecord();
    long long32 = propertyOneByteHeaderRecordFormat29.getNextRecordReference(propertyRecord31);
    long long33 = propertyOneByteHeaderRecordFormat27.getNextRecordReference(propertyRecord31);
    long long34 = propertyRecordFormat0.getNextRecordReference(propertyRecord31);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat35 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long36 = propertyOneByteHeaderRecordFormat35.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat37 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat38 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord39 = propertyRecordFormat38.newRecord();
    long long40 = propertyOneByteHeaderRecordFormat37.getNextRecordReference(propertyRecord39);
    long long41 = propertyOneByteHeaderRecordFormat35.getNextRecordReference(propertyRecord39);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat42 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat43 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord44 = propertyRecordFormat43.newRecord();
    long long45 = propertyOneByteHeaderRecordFormat42.getNextRecordReference(propertyRecord44);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat46 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat47 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord48 = propertyRecordFormat47.newRecord();
    long long49 = propertyOneByteHeaderRecordFormat46.getNextRecordReference(propertyRecord48);
    long long50 = propertyOneByteHeaderRecordFormat42.getNextRecordReference(propertyRecord48);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat51 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long52 = propertyOneByteHeaderRecordFormat51.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord53 = propertyOneByteHeaderRecordFormat51.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat54 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long55 = propertyOneByteHeaderRecordFormat54.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord56 = propertyOneByteHeaderRecordFormat54.newRecord();
    long long57 = propertyOneByteHeaderRecordFormat51.getNextRecordReference(propertyRecord56);
    org.neo4j.internal.id.IdSequence idSequence59 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext60 = null;
    propertyOneByteHeaderRecordFormat42.prepare(propertyRecord56, (int) (byte) -1, idSequence59,
        cursorContext60);
    long long62 = propertyOneByteHeaderRecordFormat35.getNextRecordReference(propertyRecord56);
    org.neo4j.io.pagecache.PageCursor pageCursor63 = null;
    try {
      propertyRecordFormat0.write(propertyRecord56, pageCursor63, 64, 48);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord1);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1125899906842623L + "'",
        long5 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord8);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1125899906842623L + "'",
        long22 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord23);
    org.junit.Assert.assertNotNull(propertyRecord24);
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1125899906842623L + "'",
        long28 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord31);
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
    org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1125899906842623L + "'",
        long36 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord39);
    org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
    org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord44);
    org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord48);
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1125899906842623L + "'",
        long52 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord53);
    org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1125899906842623L + "'",
        long55 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord56);
    org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
    org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
  }

  @Test
  public void test0427() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0427");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v310_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat2 = v310_0.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat3 = v310_0.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat4 = v310_0.relationshipGroup();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat5 = v310_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat6 = v310_0.dynamic();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat3);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat4);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat5);
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat6);
  }

  @Test
  public void test0428() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0428");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(
        (long) (byte) 1, 138L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 139L + "'", long2 == 139L);
  }

  @Test
  public void test0429() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0429");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) '4');
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord4 = relationshipHighLimitRecordFormat3.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord7 = relationshipHighLimitRecordFormat6.newRecord();
    org.neo4j.internal.id.IdSequence idSequence9 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext10 = null;
    relationshipHighLimitRecordFormat3.prepare(relationshipRecord7, (int) (short) 1, idSequence9,
        cursorContext10);
    int int12 = relationshipHighLimitRecordFormat3.getRecordHeaderSize();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader14 = null;
    int int15 = relationshipRecordFormat13.getRecordSize(storeHeader14);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat17 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat18 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord19 = relationshipRecordFormat18.newRecord();
    long long20 = relationshipHighLimitRecordFormat17.getNextRecordReference(relationshipRecord19);
    org.neo4j.internal.id.IdSequence idSequence22 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext23 = null;
    relationshipRecordFormat13.prepare(relationshipRecord19, 3, idSequence22, cursorContext23);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord25 = relationshipRecordFormat13.newRecord();
    org.neo4j.internal.id.IdSequence idSequence27 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext28 = null;
    relationshipHighLimitRecordFormat3.prepare(relationshipRecord25, (int) (byte) 10, idSequence27,
        cursorContext28);
    long long30 = relationshipHighLimitRecordFormat1.getNextRecordReference(relationshipRecord25);
    org.junit.Assert.assertNotNull(relationshipRecord4);
    org.junit.Assert.assertNotNull(relationshipRecord7);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    org.junit.Assert.assertNotNull(relationshipRecord19);
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    org.junit.Assert.assertNotNull(relationshipRecord25);
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
  }

  @Test
  public void test0430() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0430");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord2 = propertyRecordFormat1.newRecord();
    long long3 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord2);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat5 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = propertyRecordFormat5.newRecord();
    long long7 = propertyOneByteHeaderRecordFormat4.getNextRecordReference(propertyRecord6);
    long long8 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord6);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long10 = propertyOneByteHeaderRecordFormat9.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord11 = propertyOneByteHeaderRecordFormat9.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long13 = propertyOneByteHeaderRecordFormat12.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord14 = propertyOneByteHeaderRecordFormat12.newRecord();
    long long15 = propertyOneByteHeaderRecordFormat9.getNextRecordReference(propertyRecord14);
    org.neo4j.internal.id.IdSequence idSequence17 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext18 = null;
    propertyOneByteHeaderRecordFormat0.prepare(propertyRecord14, (int) (byte) -1, idSequence17,
        cursorContext18);
    int int20 = propertyOneByteHeaderRecordFormat0.getRecordHeaderSize();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat21 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat22 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord23 = propertyRecordFormat22.newRecord();
    long long24 = propertyOneByteHeaderRecordFormat21.getNextRecordReference(propertyRecord23);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat25 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long26 = propertyOneByteHeaderRecordFormat25.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat27 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat28 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord29 = propertyRecordFormat28.newRecord();
    long long30 = propertyOneByteHeaderRecordFormat27.getNextRecordReference(propertyRecord29);
    long long31 = propertyOneByteHeaderRecordFormat25.getNextRecordReference(propertyRecord29);
    long long32 = propertyOneByteHeaderRecordFormat21.getNextRecordReference(propertyRecord29);
    org.neo4j.io.pagecache.PageCursor pageCursor33 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad34 = null;
    try {
      propertyOneByteHeaderRecordFormat0.read(propertyRecord29, pageCursor33, recordLoad34, 24,
          (int) (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord6);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1125899906842623L + "'",
        long10 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord11);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1125899906842623L + "'",
        long13 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord14);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    org.junit.Assert.assertNotNull(propertyRecord23);
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1125899906842623L + "'",
        long26 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord29);
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
  }

  @Test
  public void test0431() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0431");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord6 = nodeRecordFormat0.newRecord();
    int int9 = nodeRecordFormat0.getPageSize((int) (short) 0, 4);
    org.neo4j.io.pagecache.PageCursor pageCursor10 = null;
    try {
      boolean boolean11 = nodeRecordFormat0.isInUse(pageCursor10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(nodeRecord6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
  }

  @Test
  public void test0432() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0432");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v300_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat2 = v300_0.relationshipTypeToken();
    java.lang.String str3 = v300_0.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat4 = v300_0.property();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat5 = v300_0.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat6 = v300_0.node();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "high_limitV3_0_0" + "'", str3,
        "high_limitV3_0_0");
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat4);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat5);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat6);
  }

  @Test
  public void test0433() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0433");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v320_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat2 = v320_0.relationshipGroup();
    org.neo4j.storageengine.api.format.Capability capability3 = null;
    boolean boolean4 = v320_0.hasCapability(capability3);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat5 = v320_0.property();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat6 = v320_0.relationshipGroup();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat5);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat6);
  }

  @Test
  public void test0434() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0434");
    }
    io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory enterpriseBatchImporterFactory0 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporterFactory();
    java.lang.String str1 = enterpriseBatchImporterFactory0.getName();
    java.lang.String str2 = enterpriseBatchImporterFactory0.getName();
    org.neo4j.io.layout.DatabaseLayout databaseLayout3 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction4 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer5 = null;
    org.neo4j.internal.batchimport.Configuration configuration6 = null;
    org.neo4j.logging.internal.LogService logService7 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor8 = null;
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds9 = null;
    org.neo4j.configuration.Config config10 = null;
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_11 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat12 = v310_11.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat13 = v310_11.propertyKeyToken();
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor14 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler15 = null;
    org.neo4j.internal.batchimport.input.Collector collector16 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer17 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory18 = null;
    org.neo4j.memory.MemoryTracker memoryTracker19 = null;
    try {
      org.neo4j.internal.batchimport.BatchImporter batchImporter20 = enterpriseBatchImporterFactory0.instantiate(
          databaseLayout3, fileSystemAbstraction4, pageCacheTracer5, configuration6, logService7,
          executionMonitor8, additionalInitialIds9, config10,
          (org.neo4j.kernel.impl.store.format.RecordFormats) v310_11, monitor14, jobScheduler15,
          collector16, logFilesInitializer17, indexImporterFactory18, memoryTracker19);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertEquals("'" + str1 + "' != '" + "restartable" + "'", str1, "restartable");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "restartable" + "'", str2, "restartable");
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat12);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat13);
  }

  @Test
  public void test0435() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0435");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean8 = propertyRecordFormat0.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = null;
    org.neo4j.internal.id.IdSequence idSequence11 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext12 = null;
    propertyRecordFormat0.prepare(propertyRecord9, (int) (short) 0, idSequence11, cursorContext12);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord15 = propertyRecordFormat14.newRecord();
    org.neo4j.internal.id.IdSequence idSequence17 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext18 = null;
    propertyRecordFormat0.prepare(propertyRecord15, 52, idSequence17, cursorContext18);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader20 = null;
    int int21 = propertyRecordFormat0.getRecordSize(storeHeader20);
    int int24 = propertyRecordFormat0.getPageSize((-1), (int) (short) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat25 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord26 = propertyRecordFormat25.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor27 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad28 = null;
    try {
      propertyRecordFormat0.read(propertyRecord26, pageCursor27, recordLoad28, 48, 52);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(propertyRecord15);
    org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    org.junit.Assert.assertNotNull(propertyRecord26);
  }

  @Test
  public void test0436() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0436");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    java.lang.String str6 = highLimitFactoryDefaultImpl3.getName();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats7 = highLimitFactoryDefaultImpl3.newInstance();
    java.lang.String str8 = highLimitFactoryDefaultImpl3.getName();
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "high_limitV4_0_0" + "'", str6,
        "high_limitV4_0_0");
    org.junit.Assert.assertNotNull(recordFormats7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "high_limitV4_0_0" + "'", str8,
        "high_limitV4_0_0");
  }

  @Test
  public void test0437() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0437");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    int int10 = relationshipGroupHighLimitRecordFormat0.getRecordHeaderSize();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat11 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_12 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_13 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat14 = v300_13.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat15 = v300_13.schema();
    org.neo4j.storageengine.api.format.CapabilityType capabilityType16 = null;
    boolean boolean17 = org.neo4j.kernel.impl.store.format.BaseRecordFormats.hasCompatibleCapabilities(
        (org.neo4j.kernel.impl.store.format.RecordFormats) v306_12,
        (org.neo4j.kernel.impl.store.format.RecordFormats) v300_13, capabilityType16);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat18 = v300_13.relationship();
    boolean boolean19 = relationshipGroupRecordFormat11.equals(
        (java.lang.Object) relationshipRecordRecordFormat18);
    boolean boolean20 = relationshipGroupHighLimitRecordFormat0.equals(
        (java.lang.Object) boolean19);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat21 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long22 = relationshipGroupHighLimitRecordFormat21.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat23 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord24 = null;
    long long25 = relationshipGroupHighLimitRecordFormat23.getNextRecordReference(
        relationshipGroupRecord24);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord26 = relationshipGroupHighLimitRecordFormat23.newRecord();
    org.neo4j.internal.id.IdSequence idSequence28 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext29 = null;
    relationshipGroupHighLimitRecordFormat21.prepare(relationshipGroupRecord26, (int) (byte) 1,
        idSequence28, cursorContext29);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat31 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord32 = null;
    long long33 = relationshipGroupHighLimitRecordFormat31.getNextRecordReference(
        relationshipGroupRecord32);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord34 = relationshipGroupHighLimitRecordFormat31.newRecord();
    org.neo4j.internal.id.IdSequence idSequence36 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext37 = null;
    relationshipGroupHighLimitRecordFormat21.prepare(relationshipGroupRecord34, 0, idSequence36,
        cursorContext37);
    org.neo4j.io.pagecache.PageCursor pageCursor39 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord34, pageCursor39,
          (int) (short) 0, 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat14);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1125899906842623L + "'",
        long22 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord26);
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord34);
  }

  @Test
  public void test0438() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0438");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.toable(
        (long) 48, 17L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 65L + "'", long2 == 65L);
  }

  @Test
  public void test0439() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0439");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader6 = null;
    int int7 = nodeRecordFormat0.getRecordSize(storeHeader6);
    int int10 = nodeRecordFormat0.getPageSize((int) ' ', 4);
    int int11 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord12 = nodeRecordFormat0.newRecord();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    org.junit.Assert.assertNotNull(nodeRecord12);
  }

  @Test
  public void test0440() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0440");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat1 = v306_0.node();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily2 = v306_0.getFormatFamily();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily3 = v306_0.getFormatFamily();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat4 = v306_0.node();
    java.lang.Class<?> wildcardClass5 = v306_0.getClass();
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat1);
    org.junit.Assert.assertTrue(
        "'" + formatFamily2 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily2.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
    org.junit.Assert.assertTrue(
        "'" + formatFamily3 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily3.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0441() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0441");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long1 = propertyOneByteHeaderRecordFormat0.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord2 = propertyOneByteHeaderRecordFormat0.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord3 = propertyOneByteHeaderRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long5 = propertyOneByteHeaderRecordFormat4.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = propertyOneByteHeaderRecordFormat4.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord7 = propertyOneByteHeaderRecordFormat4.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor8 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad9 = null;
    try {
      propertyOneByteHeaderRecordFormat0.read(propertyRecord7, pageCursor8, recordLoad9, 96, 12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord2);
    org.junit.Assert.assertNotNull(propertyRecord3);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1125899906842623L + "'",
        long5 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord6);
    org.junit.Assert.assertNotNull(propertyRecord7);
  }

  @Test
  public void test0442() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0442");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long1 = relationshipGroupHighLimitRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord3 = null;
    long long4 = relationshipGroupHighLimitRecordFormat2.getNextRecordReference(
        relationshipGroupRecord3);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord5 = relationshipGroupHighLimitRecordFormat2.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord5, (int) (byte) 1,
        idSequence7, cursorContext8);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat10 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord11 = null;
    long long12 = relationshipGroupHighLimitRecordFormat10.getNextRecordReference(
        relationshipGroupRecord11);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord13 = relationshipGroupHighLimitRecordFormat10.newRecord();
    org.neo4j.internal.id.IdSequence idSequence15 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext16 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord13, 0, idSequence15,
        cursorContext16);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat18 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long19 = relationshipGroupHighLimitRecordFormat18.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat20 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord21 = null;
    long long22 = relationshipGroupHighLimitRecordFormat20.getNextRecordReference(
        relationshipGroupRecord21);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord23 = relationshipGroupHighLimitRecordFormat20.newRecord();
    org.neo4j.internal.id.IdSequence idSequence25 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext26 = null;
    relationshipGroupHighLimitRecordFormat18.prepare(relationshipGroupRecord23, 0, idSequence25,
        cursorContext26);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat28 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader29 = null;
    int int30 = relationshipGroupRecordFormat28.getRecordSize(storeHeader29);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord31 = relationshipGroupRecordFormat28.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat relationshipGroupRecordFormat32 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipGroupRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader33 = null;
    int int34 = relationshipGroupRecordFormat32.getRecordSize(storeHeader33);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat35 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long36 = relationshipGroupHighLimitRecordFormat35.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat37 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord38 = null;
    long long39 = relationshipGroupHighLimitRecordFormat37.getNextRecordReference(
        relationshipGroupRecord38);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord40 = relationshipGroupHighLimitRecordFormat37.newRecord();
    org.neo4j.internal.id.IdSequence idSequence42 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext43 = null;
    relationshipGroupHighLimitRecordFormat35.prepare(relationshipGroupRecord40, (int) (byte) 1,
        idSequence42, cursorContext43);
    org.neo4j.internal.id.IdSequence idSequence46 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext47 = null;
    relationshipGroupRecordFormat32.prepare(relationshipGroupRecord40, 0, idSequence46,
        cursorContext47);
    long long49 = relationshipGroupRecordFormat28.getNextRecordReference(relationshipGroupRecord40);
    long long50 = relationshipGroupHighLimitRecordFormat18.getNextRecordReference(
        relationshipGroupRecord40);
    org.neo4j.internal.id.IdSequence idSequence52 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext53 = null;
    relationshipGroupHighLimitRecordFormat0.prepare(relationshipGroupRecord40, 3, idSequence52,
        cursorContext53);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat55 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat56 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long57 = relationshipGroupHighLimitRecordFormat56.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat58 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord59 = null;
    long long60 = relationshipGroupHighLimitRecordFormat58.getNextRecordReference(
        relationshipGroupRecord59);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord61 = relationshipGroupHighLimitRecordFormat58.newRecord();
    org.neo4j.internal.id.IdSequence idSequence63 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext64 = null;
    relationshipGroupHighLimitRecordFormat56.prepare(relationshipGroupRecord61, (int) (byte) 1,
        idSequence63, cursorContext64);
    long long66 = relationshipGroupHighLimitRecordFormat55.getNextRecordReference(
        relationshipGroupRecord61);
    org.neo4j.io.pagecache.PageCursor pageCursor67 = null;
    try {
      relationshipGroupHighLimitRecordFormat0.write(relationshipGroupRecord61, pageCursor67, 35, 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1125899906842623L + "'",
        long1 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord5);
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord13);
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1125899906842623L + "'",
        long19 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord23);
    org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    org.junit.Assert.assertNotNull(relationshipGroupRecord31);
    org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1125899906842623L + "'",
        long36 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord40);
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
    org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
    org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1125899906842623L + "'",
        long57 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord61);
    org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
  }

  @Test
  public void test0443() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0443");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) (-1),
        239L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
  }

  @Test
  public void test0444() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0444");
    }
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds0 = null;
    org.neo4j.internal.batchimport.input.Collector collector1 = null;
    org.neo4j.internal.batchimport.Configuration configuration2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout4 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor5 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory7 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler8 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer9 = null;
    org.neo4j.logging.internal.LogService logService10 = null;
    org.neo4j.memory.MemoryTracker memoryTracker11 = null;
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats14 = io.github.onograph.kernel.srv.store.format.highlimit.v300.V300.RCD_FMXS;
    try {
      io.github.onograph.internal.batchimport.EnterpriseBatchImporter enterpriseBatchImporter15 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporter(
          additionalInitialIds0, collector1, configuration2, config3, databaseLayout4,
          executionMonitor5, fileSystemAbstraction6, indexImporterFactory7, jobScheduler8,
          logFilesInitializer9, logService10, memoryTracker11, monitor12, pageCacheTracer13,
          recordFormats14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(recordFormats14);
  }

  @Test
  public void test0445() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0445");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        50);
    int int2 = relationshipHighLimitRecordFormat1.getRecordHeaderSize();
    int int5 = relationshipHighLimitRecordFormat1.getPageSize(16, 64);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
  }

  @Test
  public void test0446() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0446");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (-1));
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0447() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0447");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean8 = propertyRecordFormat0.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = null;
    org.neo4j.internal.id.IdSequence idSequence11 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext12 = null;
    propertyRecordFormat0.prepare(propertyRecord9, (int) (short) 0, idSequence11, cursorContext12);
    boolean boolean15 = propertyRecordFormat0.equals((java.lang.Object) "3.0.6");
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat16 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat17 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord18 = propertyRecordFormat17.newRecord();
    long long19 = propertyOneByteHeaderRecordFormat16.getNextRecordReference(propertyRecord18);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat20 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long21 = propertyOneByteHeaderRecordFormat20.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat22 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat23 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord24 = propertyRecordFormat23.newRecord();
    long long25 = propertyOneByteHeaderRecordFormat22.getNextRecordReference(propertyRecord24);
    long long26 = propertyOneByteHeaderRecordFormat20.getNextRecordReference(propertyRecord24);
    long long27 = propertyOneByteHeaderRecordFormat16.getNextRecordReference(propertyRecord24);
    org.neo4j.io.pagecache.PageCursor pageCursor28 = null;
    try {
      propertyRecordFormat0.write(propertyRecord24, pageCursor28, 0, 64);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(propertyRecord18);
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1125899906842623L + "'",
        long21 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord24);
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
  }

  @Test
  public void test0448() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0448");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl6 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int9 = recordFormatDynamicRecordImpl6.getPageSize(24, 8);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl10 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean12 = recordFormatDynamicRecordImpl10.equals((java.lang.Object) 100.0f);
    int int15 = recordFormatDynamicRecordImpl10.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord16 = recordFormatDynamicRecordImpl10.newRecord();
    long long17 = recordFormatDynamicRecordImpl6.getNextRecordReference(dynamicRecord16);
    org.neo4j.internal.id.IdSequence idSequence19 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext20 = null;
    recordFormatDynamicRecordImpl0.prepare(dynamicRecord16, 10, idSequence19, cursorContext20);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat22 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat23 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord24 = propertyRecordFormat23.newRecord();
    long long25 = propertyOneByteHeaderRecordFormat22.getNextRecordReference(propertyRecord24);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat26 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat27 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord28 = propertyRecordFormat27.newRecord();
    long long29 = propertyOneByteHeaderRecordFormat26.getNextRecordReference(propertyRecord28);
    long long30 = propertyOneByteHeaderRecordFormat22.getNextRecordReference(propertyRecord28);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat31 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long32 = propertyOneByteHeaderRecordFormat31.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord33 = propertyOneByteHeaderRecordFormat31.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat34 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long35 = propertyOneByteHeaderRecordFormat34.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord36 = propertyOneByteHeaderRecordFormat34.newRecord();
    long long37 = propertyOneByteHeaderRecordFormat31.getNextRecordReference(propertyRecord36);
    org.neo4j.internal.id.IdSequence idSequence39 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext40 = null;
    propertyOneByteHeaderRecordFormat22.prepare(propertyRecord36, (int) (byte) -1, idSequence39,
        cursorContext40);
    boolean boolean42 = recordFormatDynamicRecordImpl0.equals(
        (java.lang.Object) propertyOneByteHeaderRecordFormat22);
    int int45 = recordFormatDynamicRecordImpl0.getPageSize(2, (int) (byte) 1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 24 + "'", int9 == 24);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord16);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord24);
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord28);
    org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1125899906842623L + "'",
        long32 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord33);
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1125899906842623L + "'",
        long35 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord36);
    org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
  }

  @Test
  public void test0449() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0449");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.storageengine.api.format.Capability capability1 = null;
    boolean boolean2 = v310_0.hasCapability(capability1);
    int int3 = v310_0.generation();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat4 = v310_0.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily5 = v310_0.getFormatFamily();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat4);
    org.junit.Assert.assertTrue(
        "'" + formatFamily5 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily5.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
  }

  @Test
  public void test0450() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0450");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 8,
        (long) (byte) 10);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
  }

  @Test
  public void test0451() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0451");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = propertyRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader3 = null;
    int int4 = propertyRecordFormat2.getRecordSize(storeHeader3);
    long long5 = propertyRecordFormat2.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord8 = propertyRecordFormat7.newRecord();
    long long9 = propertyOneByteHeaderRecordFormat6.getNextRecordReference(propertyRecord8);
    org.neo4j.internal.id.IdSequence idSequence11 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext12 = null;
    propertyRecordFormat2.prepare(propertyRecord8, 0, idSequence11, cursorContext12);
    long long14 = propertyRecordFormat0.getNextRecordReference(propertyRecord8);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat15 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader16 = null;
    int int17 = propertyRecordFormat15.getRecordSize(storeHeader16);
    int int20 = propertyRecordFormat15.getPageSize((int) (byte) -1, 128);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat21 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long22 = propertyOneByteHeaderRecordFormat21.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord23 = propertyOneByteHeaderRecordFormat21.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord24 = propertyOneByteHeaderRecordFormat21.newRecord();
    long long25 = propertyRecordFormat15.getNextRecordReference(propertyRecord24);
    long long26 = propertyRecordFormat0.getNextRecordReference(propertyRecord24);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader27 = null;
    int int28 = propertyRecordFormat0.getRecordSize(storeHeader27);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat29 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord30 = null;
    org.neo4j.internal.id.IdSequence idSequence32 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext33 = null;
    propertyRecordFormat29.prepare(propertyRecord30, (int) (short) -1, idSequence32,
        cursorContext33);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord35 = propertyRecordFormat29.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat36 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat37 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord38 = propertyRecordFormat37.newRecord();
    long long39 = propertyOneByteHeaderRecordFormat36.getNextRecordReference(propertyRecord38);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader40 = null;
    int int41 = propertyOneByteHeaderRecordFormat36.getRecordSize(storeHeader40);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat42 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long43 = propertyOneByteHeaderRecordFormat42.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat44 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat45 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord46 = propertyRecordFormat45.newRecord();
    long long47 = propertyOneByteHeaderRecordFormat44.getNextRecordReference(propertyRecord46);
    long long48 = propertyOneByteHeaderRecordFormat42.getNextRecordReference(propertyRecord46);
    org.neo4j.internal.id.IdSequence idSequence50 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext51 = null;
    propertyOneByteHeaderRecordFormat36.prepare(propertyRecord46, 64, idSequence50,
        cursorContext51);
    long long53 = propertyRecordFormat29.getNextRecordReference(propertyRecord46);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord54 = propertyRecordFormat29.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor55 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad56 = null;
    try {
      propertyRecordFormat0.read(propertyRecord54, pageCursor55, recordLoad56, (int) '4',
          (int) (byte) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord1);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1125899906842623L + "'",
        long5 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord8);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1125899906842623L + "'",
        long22 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord23);
    org.junit.Assert.assertNotNull(propertyRecord24);
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 48 + "'", int28 == 48);
    org.junit.Assert.assertNotNull(propertyRecord35);
    org.junit.Assert.assertNotNull(propertyRecord38);
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + 48 + "'", int41 == 48);
    org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1125899906842623L + "'",
        long43 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord46);
    org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
    org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord54);
  }

  @Test
  public void test0452() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0452");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl7 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean9 = recordFormatDynamicRecordImpl7.equals((java.lang.Object) 100.0f);
    int int12 = recordFormatDynamicRecordImpl7.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord13 = recordFormatDynamicRecordImpl7.newRecord();
    long long14 = recordFormatDynamicRecordImpl0.getNextRecordReference(dynamicRecord13);
    org.neo4j.io.pagecache.PageCursor pageCursor15 = null;
    try {
      boolean boolean16 = recordFormatDynamicRecordImpl0.isInUse(pageCursor15);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord13);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
  }

  @Test
  public void test0453() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0453");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v310_0.relationship();
    java.lang.String str2 = v310_0.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat3 = v310_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat4 = v310_0.node();
    org.neo4j.storageengine.api.format.Capability[] capabilityArray5 = v310_0.capabilities();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat6 = v310_0.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat7 = v310_0.property();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "high_limitV3_1_0" + "'", str2,
        "high_limitV3_1_0");
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat3);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat4);
    org.junit.Assert.assertNotNull(capabilityArray5);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat6);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat7);
  }

  @Test
  public void test0454() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0454");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        32);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0455() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0455");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v320_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat2 = v320_0.relationshipGroup();
    org.neo4j.storageengine.api.format.Capability capability3 = null;
    boolean boolean4 = v320_0.hasCapability(capability3);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat5 = v320_0.relationshipTypeToken();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat5);
  }

  @Test
  public void test0456() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0456");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v306.V306 v306_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v306.V306();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat1 = v306_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat2 = v306_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat3 = v306_0.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.MetaDataRecord> metaDataRecordRecordFormat4 = v306_0.metaData();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat5 = v306_0.node();
    int int6 = v306_0.generation();
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat1);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat2);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat3);
    org.junit.Assert.assertNotNull(metaDataRecordRecordFormat4);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat5);
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
  }

  @Test
  public void test0457() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0457");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean8 = propertyRecordFormat0.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = null;
    org.neo4j.internal.id.IdSequence idSequence11 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext12 = null;
    propertyRecordFormat0.prepare(propertyRecord9, (int) (short) 0, idSequence11, cursorContext12);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat14 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord15 = propertyRecordFormat14.newRecord();
    org.neo4j.internal.id.IdSequence idSequence17 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext18 = null;
    propertyRecordFormat0.prepare(propertyRecord15, 52, idSequence17, cursorContext18);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord20 = propertyRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat21 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader22 = null;
    int int23 = propertyRecordFormat21.getRecordSize(storeHeader22);
    int int26 = propertyRecordFormat21.getPageSize((int) (byte) -1, 128);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat27 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long28 = propertyOneByteHeaderRecordFormat27.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord29 = propertyOneByteHeaderRecordFormat27.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord30 = propertyOneByteHeaderRecordFormat27.newRecord();
    long long31 = propertyRecordFormat21.getNextRecordReference(propertyRecord30);
    org.neo4j.io.pagecache.PageCursor pageCursor32 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad33 = null;
    try {
      propertyRecordFormat0.read(propertyRecord30, pageCursor32, recordLoad33, 4, (int) 'a');
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertNotNull(propertyRecord15);
    org.junit.Assert.assertNotNull(propertyRecord20);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 48 + "'", int23 == 48);
    org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1125899906842623L + "'",
        long28 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord29);
    org.junit.Assert.assertNotNull(propertyRecord30);
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
  }

  @Test
  public void test0458() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0458");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v310_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat2 = v310_0.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat3 = v310_0.propertyKeyToken();
    java.lang.String str4 = v310_0.toString();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat5 = v310_0.node();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RecordFormat:V310[vE.H.2]" + "'", str4,
        "RecordFormat:V310[vE.H.2]");
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat5);
  }

  @Test
  public void test0459() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0459");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v310_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat2 = v310_0.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat3 = v310_0.property();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat3);
  }

  @Test
  public void test0460() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0460");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(119L, 17L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 119L + "'", long2 == 119L);
  }

  @Test
  public void test0461() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0461");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    long long3 = propertyRecordFormat0.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum highLimitEncEnum4 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8;
    boolean boolean5 = propertyRecordFormat0.equals((java.lang.Object) highLimitEncEnum4);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = null;
    org.neo4j.internal.id.IdSequence idSequence8 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext9 = null;
    propertyRecordFormat0.prepare(propertyRecord6, 128, idSequence8, cursorContext9);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat11 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord13 = propertyRecordFormat12.newRecord();
    long long14 = propertyOneByteHeaderRecordFormat11.getNextRecordReference(propertyRecord13);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat15 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat16 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord17 = propertyRecordFormat16.newRecord();
    long long18 = propertyOneByteHeaderRecordFormat15.getNextRecordReference(propertyRecord17);
    long long19 = propertyOneByteHeaderRecordFormat11.getNextRecordReference(propertyRecord17);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat20 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long21 = propertyOneByteHeaderRecordFormat20.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord22 = propertyOneByteHeaderRecordFormat20.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat23 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long24 = propertyOneByteHeaderRecordFormat23.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord25 = propertyOneByteHeaderRecordFormat23.newRecord();
    long long26 = propertyOneByteHeaderRecordFormat20.getNextRecordReference(propertyRecord25);
    org.neo4j.internal.id.IdSequence idSequence28 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext29 = null;
    propertyOneByteHeaderRecordFormat11.prepare(propertyRecord25, (int) (byte) -1, idSequence28,
        cursorContext29);
    long long31 = propertyRecordFormat0.getNextRecordReference(propertyRecord25);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat32 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader33 = null;
    int int34 = propertyRecordFormat32.getRecordSize(storeHeader33);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl35 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats36 = highLimitFactoryDefaultImpl35.newInstance();
    boolean boolean37 = propertyRecordFormat32.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl35);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat39 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean40 = propertyRecordFormat32.equals((java.lang.Object) (short) 100);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat41 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord42 = propertyRecordFormat41.newRecord();
    long long43 = propertyRecordFormat32.getNextRecordReference(propertyRecord42);
    org.neo4j.io.pagecache.PageCursor pageCursor44 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad45 = null;
    try {
      propertyRecordFormat0.read(propertyRecord42, pageCursor44, recordLoad45, 1, 35);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1125899906842623L + "'",
        long3 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + highLimitEncEnum4 + "' != '"
            + io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8 + "'",
        highLimitEncEnum4.equals(
            io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8));
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertNotNull(propertyRecord13);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord17);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1125899906842623L + "'",
        long21 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord22);
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1125899906842623L + "'",
        long24 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord25);
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
    org.junit.Assert.assertTrue("'" + int34 + "' != '" + 48 + "'", int34 == 48);
    org.junit.Assert.assertNotNull(recordFormats36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    org.junit.Assert.assertNotNull(propertyRecord42);
    org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
  }

  @Test
  public void test0462() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0462");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord2 = propertyRecordFormat1.newRecord();
    long long3 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord2);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = propertyOneByteHeaderRecordFormat0.getRecordSize(storeHeader4);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long7 = propertyOneByteHeaderRecordFormat6.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat8 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord10 = propertyRecordFormat9.newRecord();
    long long11 = propertyOneByteHeaderRecordFormat8.getNextRecordReference(propertyRecord10);
    long long12 = propertyOneByteHeaderRecordFormat6.getNextRecordReference(propertyRecord10);
    org.neo4j.internal.id.IdSequence idSequence14 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext15 = null;
    propertyOneByteHeaderRecordFormat0.prepare(propertyRecord10, 64, idSequence14, cursorContext15);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat18 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat relationshipRecordFormat19 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.RelationshipRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord20 = relationshipRecordFormat19.newRecord();
    long long21 = relationshipHighLimitRecordFormat18.getNextRecordReference(relationshipRecord20);
    boolean boolean22 = propertyOneByteHeaderRecordFormat0.equals((java.lang.Object) long21);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat23 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader24 = null;
    int int25 = propertyRecordFormat23.getRecordSize(storeHeader24);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl26 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats27 = highLimitFactoryDefaultImpl26.newInstance();
    boolean boolean28 = propertyRecordFormat23.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl26);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat30 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean31 = propertyRecordFormat23.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord32 = null;
    org.neo4j.internal.id.IdSequence idSequence34 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext35 = null;
    propertyRecordFormat23.prepare(propertyRecord32, (int) (short) 0, idSequence34,
        cursorContext35);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat37 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord38 = propertyRecordFormat37.newRecord();
    org.neo4j.internal.id.IdSequence idSequence40 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext41 = null;
    propertyRecordFormat23.prepare(propertyRecord38, 52, idSequence40, cursorContext41);
    org.neo4j.io.pagecache.PageCursor pageCursor43 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad44 = null;
    try {
      propertyOneByteHeaderRecordFormat0.read(propertyRecord38, pageCursor43, recordLoad44, 3, 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 48 + "'", int5 == 48);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1125899906842623L + "'",
        long7 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord10);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    org.junit.Assert.assertNotNull(relationshipRecord20);
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertTrue("'" + int25 + "' != '" + 48 + "'", int25 == 48);
    org.junit.Assert.assertNotNull(recordFormats27);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(propertyRecord38);
  }

  @Test
  public void test0463() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0463");
    }
    org.neo4j.internal.batchimport.AdditionalInitialIds additionalInitialIds0 = null;
    org.neo4j.internal.batchimport.input.Collector collector1 = null;
    org.neo4j.internal.batchimport.Configuration configuration2 = null;
    org.neo4j.configuration.Config config3 = null;
    org.neo4j.io.layout.DatabaseLayout databaseLayout4 = null;
    org.neo4j.internal.batchimport.staging.ExecutionMonitor executionMonitor5 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.internal.batchimport.IndexImporterFactory indexImporterFactory7 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler8 = null;
    org.neo4j.storageengine.api.LogFilesInitializer logFilesInitializer9 = null;
    org.neo4j.logging.internal.LogService logService10 = null;
    org.neo4j.memory.MemoryTracker memoryTracker11 = null;
    org.neo4j.internal.batchimport.ImportLogic.Monitor monitor12 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer13 = null;
    io.github.onograph.kernel.srv.store.format.highlimit.v310.V310 v310_14 = new io.github.onograph.kernel.srv.store.format.highlimit.v310.V310();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat15 = v310_14.relationship();
    java.lang.String str16 = v310_14.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat17 = v310_14.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat18 = v310_14.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.NodeRecord> nodeRecordRecordFormat19 = v310_14.node();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat20 = v310_14.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat21 = v310_14.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat22 = v310_14.labelToken();
    try {
      io.github.onograph.internal.batchimport.EnterpriseBatchImporter enterpriseBatchImporter23 = new io.github.onograph.internal.batchimport.EnterpriseBatchImporter(
          additionalInitialIds0, collector1, configuration2, config3, databaseLayout4,
          executionMonitor5, fileSystemAbstraction6, indexImporterFactory7, jobScheduler8,
          logFilesInitializer9, logService10, memoryTracker11, monitor12, pageCacheTracer13,
          (org.neo4j.kernel.impl.store.format.RecordFormats) v310_14);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat15);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "high_limitV3_1_0" + "'", str16,
        "high_limitV3_1_0");
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat17);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat18);
    org.junit.Assert.assertNotNull(nodeRecordRecordFormat19);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat20);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat21);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat22);
  }

  @Test
  public void test0464() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0464");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = propertyRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader3 = null;
    int int4 = propertyRecordFormat2.getRecordSize(storeHeader3);
    long long5 = propertyRecordFormat2.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord8 = propertyRecordFormat7.newRecord();
    long long9 = propertyOneByteHeaderRecordFormat6.getNextRecordReference(propertyRecord8);
    org.neo4j.internal.id.IdSequence idSequence11 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext12 = null;
    propertyRecordFormat2.prepare(propertyRecord8, 0, idSequence11, cursorContext12);
    long long14 = propertyRecordFormat0.getNextRecordReference(propertyRecord8);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat15 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader16 = null;
    int int17 = propertyRecordFormat15.getRecordSize(storeHeader16);
    int int20 = propertyRecordFormat15.getPageSize((int) (byte) -1, 128);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat21 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long22 = propertyOneByteHeaderRecordFormat21.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord23 = propertyOneByteHeaderRecordFormat21.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord24 = propertyOneByteHeaderRecordFormat21.newRecord();
    long long25 = propertyRecordFormat15.getNextRecordReference(propertyRecord24);
    long long26 = propertyRecordFormat0.getNextRecordReference(propertyRecord24);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader27 = null;
    int int28 = propertyRecordFormat0.getRecordSize(storeHeader27);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat29 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader30 = null;
    int int31 = propertyRecordFormat29.getRecordSize(storeHeader30);
    long long32 = propertyRecordFormat29.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum highLimitEncEnum33 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8;
    boolean boolean34 = propertyRecordFormat29.equals((java.lang.Object) highLimitEncEnum33);
    long long35 = propertyRecordFormat29.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord36 = propertyRecordFormat29.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor37 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad38 = null;
    try {
      propertyRecordFormat0.read(propertyRecord36, pageCursor37, recordLoad38, 64, (int) (byte) 10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord1);
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 48 + "'", int4 == 48);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1125899906842623L + "'",
        long5 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord8);
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1125899906842623L + "'",
        long22 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord23);
    org.junit.Assert.assertNotNull(propertyRecord24);
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    org.junit.Assert.assertTrue("'" + int28 + "' != '" + 48 + "'", int28 == 48);
    org.junit.Assert.assertTrue("'" + int31 + "' != '" + 48 + "'", int31 == 48);
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1125899906842623L + "'",
        long32 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + highLimitEncEnum33 + "' != '"
            + io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8 + "'",
        highLimitEncEnum33.equals(
            io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.HLENC_BTX_8));
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1125899906842623L + "'",
        long35 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord36);
  }

  @Test
  public void test0465() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0465");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat1 = v300_0.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.SchemaRecord> schemaRecordRecordFormat2 = v300_0.schema();
    java.lang.String str3 = v300_0.introductionVersion();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat1);
    org.junit.Assert.assertNotNull(schemaRecordRecordFormat2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3.0.0" + "'", str3, "3.0.0");
  }

  @Test
  public void test0466() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0466");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl7 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean9 = recordFormatDynamicRecordImpl7.equals((java.lang.Object) 100.0f);
    int int12 = recordFormatDynamicRecordImpl7.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord13 = recordFormatDynamicRecordImpl7.newRecord();
    long long14 = recordFormatDynamicRecordImpl0.getNextRecordReference(dynamicRecord13);
    int int15 = recordFormatDynamicRecordImpl0.getRecordHeaderSize();
    int int16 = recordFormatDynamicRecordImpl0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord17 = recordFormatDynamicRecordImpl0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl18 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean20 = recordFormatDynamicRecordImpl18.equals((java.lang.Object) 100.0f);
    int int23 = recordFormatDynamicRecordImpl18.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord24 = recordFormatDynamicRecordImpl18.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl25 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean27 = recordFormatDynamicRecordImpl25.equals((java.lang.Object) 100.0f);
    int int30 = recordFormatDynamicRecordImpl25.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord31 = recordFormatDynamicRecordImpl25.newRecord();
    long long32 = recordFormatDynamicRecordImpl18.getNextRecordReference(dynamicRecord31);
    int int33 = recordFormatDynamicRecordImpl18.getRecordHeaderSize();
    int int34 = recordFormatDynamicRecordImpl18.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord35 = recordFormatDynamicRecordImpl18.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl36 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean38 = recordFormatDynamicRecordImpl36.equals((java.lang.Object) 100.0f);
    int int41 = recordFormatDynamicRecordImpl36.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord42 = recordFormatDynamicRecordImpl36.newRecord();
    int int45 = recordFormatDynamicRecordImpl36.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord46 = recordFormatDynamicRecordImpl36.newRecord();
    long long47 = recordFormatDynamicRecordImpl36.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl48 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean50 = recordFormatDynamicRecordImpl48.equals((java.lang.Object) 100.0f);
    int int53 = recordFormatDynamicRecordImpl48.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord54 = recordFormatDynamicRecordImpl48.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl55 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean57 = recordFormatDynamicRecordImpl55.equals((java.lang.Object) 100.0f);
    int int60 = recordFormatDynamicRecordImpl55.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord61 = recordFormatDynamicRecordImpl55.newRecord();
    long long62 = recordFormatDynamicRecordImpl48.getNextRecordReference(dynamicRecord61);
    org.neo4j.internal.id.IdSequence idSequence64 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext65 = null;
    recordFormatDynamicRecordImpl36.prepare(dynamicRecord61, 128, idSequence64, cursorContext65);
    org.neo4j.internal.id.IdSequence idSequence68 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext69 = null;
    recordFormatDynamicRecordImpl18.prepare(dynamicRecord61, 48, idSequence68, cursorContext69);
    org.neo4j.io.pagecache.PageCursor pageCursor71 = null;
    try {
      recordFormatDynamicRecordImpl0.write(dynamicRecord61, pageCursor71, 128, (int) (short) -1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord13);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
    org.junit.Assert.assertNotNull(dynamicRecord17);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord24);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    org.junit.Assert.assertTrue("'" + int30 + "' != '" + 16 + "'", int30 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord31);
    org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
    org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
    org.junit.Assert.assertTrue("'" + int34 + "' != '" + 12 + "'", int34 == 12);
    org.junit.Assert.assertNotNull(dynamicRecord35);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + 16 + "'", int41 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord42);
    org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord46);
    org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1125899906842623L + "'",
        long47 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    org.junit.Assert.assertTrue("'" + int53 + "' != '" + 16 + "'", int53 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord54);
    org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    org.junit.Assert.assertTrue("'" + int60 + "' != '" + 16 + "'", int60 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord61);
    org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
  }

  @Test
  public void test0467() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0467");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) '#',
        (long) ' ');
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
  }

  @Test
  public void test0468() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0468");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat1 = v320_0.dynamic();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat2 = v320_0.property();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat3 = v320_0.property();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat4 = v320_0.property();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.MetaDataRecord> metaDataRecordRecordFormat5 = v320_0.metaData();
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat1);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat2);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat3);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat4);
    org.junit.Assert.assertNotNull(metaDataRecordRecordFormat5);
  }

  @Test
  public void test0469() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0469");
    }
    int int1 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.leg((long) 12);
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
  }

  @Test
  public void test0470() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0470");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord2 = propertyRecordFormat1.newRecord();
    long long3 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord2);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader5 = null;
    int int6 = propertyRecordFormat4.getRecordSize(storeHeader5);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl7 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats8 = highLimitFactoryDefaultImpl7.newInstance();
    boolean boolean9 = propertyRecordFormat4.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl7);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat11 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean12 = propertyRecordFormat4.equals((java.lang.Object) (short) 100);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord14 = propertyRecordFormat13.newRecord();
    long long15 = propertyRecordFormat4.getNextRecordReference(propertyRecord14);
    org.neo4j.io.pagecache.PageCursor pageCursor16 = null;
    try {
      propertyOneByteHeaderRecordFormat0.write(propertyRecord14, pageCursor16, 2, 48);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 48 + "'", int6 == 48);
    org.junit.Assert.assertNotNull(recordFormats8);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertNotNull(propertyRecord14);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
  }

  @Test
  public void test0471() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0471");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod((long) 32,
        201L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 233L + "'", long2 == 233L);
  }

  @Test
  public void test0472() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0472");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat(
        0);
    long long2 = relationshipGroupHighLimitRecordFormat1.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat3 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long5 = relationshipGroupHighLimitRecordFormat4.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord7 = null;
    long long8 = relationshipGroupHighLimitRecordFormat6.getNextRecordReference(
        relationshipGroupRecord7);
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord9 = relationshipGroupHighLimitRecordFormat6.newRecord();
    org.neo4j.internal.id.IdSequence idSequence11 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext12 = null;
    relationshipGroupHighLimitRecordFormat4.prepare(relationshipGroupRecord9, (int) (byte) 1,
        idSequence11, cursorContext12);
    long long14 = relationshipGroupHighLimitRecordFormat3.getNextRecordReference(
        relationshipGroupRecord9);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat15 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat();
    long long16 = relationshipGroupHighLimitRecordFormat15.getMaxId();
    long long17 = relationshipGroupHighLimitRecordFormat15.getMaxId();
    org.neo4j.kernel.impl.store.record.RelationshipGroupRecord relationshipGroupRecord18 = relationshipGroupHighLimitRecordFormat15.newRecord();
    org.neo4j.internal.id.IdSequence idSequence20 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext21 = null;
    relationshipGroupHighLimitRecordFormat3.prepare(relationshipGroupRecord18, 3, idSequence20,
        cursorContext21);
    long long23 = relationshipGroupHighLimitRecordFormat1.getNextRecordReference(
        relationshipGroupRecord18);
    int int24 = relationshipGroupHighLimitRecordFormat1.getRecordHeaderSize();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842623L + "'",
        long2 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1125899906842623L + "'",
        long5 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    org.junit.Assert.assertNotNull(relationshipGroupRecord9);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1125899906842623L + "'",
        long16 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1125899906842623L + "'",
        long17 == 1125899906842623L);
    org.junit.Assert.assertNotNull(relationshipGroupRecord18);
    org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
  }

  @Test
  public void test0473() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0473");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    int int9 = recordFormatDynamicRecordImpl0.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord10 = recordFormatDynamicRecordImpl0.newRecord();
    int int13 = recordFormatDynamicRecordImpl0.getPageSize((int) '4', (int) (short) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_14 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat15 = v320_14.relationship();
    boolean boolean16 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) v320_14);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat17 = v320_14.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat18 = v320_14.labelToken();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord10);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat17);
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat18);
  }

  @Test
  public void test0474() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0474");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat relationshipGroupHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipGroupHighLimitRecordFormat(
        (int) ' ');
    org.neo4j.io.pagecache.PageCursor pageCursor2 = null;
    try {
      boolean boolean3 = relationshipGroupHighLimitRecordFormat1.isInUse(pageCursor2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0475() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0475");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    int int9 = recordFormatDynamicRecordImpl0.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord10 = recordFormatDynamicRecordImpl0.newRecord();
    int int13 = recordFormatDynamicRecordImpl0.getPageSize((int) '4', (int) (short) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_14 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat15 = v320_14.relationship();
    boolean boolean16 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) v320_14);
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat17 = v320_14.relationshipGroup();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord10);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat17);
  }

  @Test
  public void test0476() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0476");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0477() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0477");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    int int1 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord2 = nodeRecordFormat0.newRecord();
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    org.junit.Assert.assertNotNull(nodeRecord2);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
  }

  @Test
  public void test0478() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0478");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    int int9 = recordFormatDynamicRecordImpl0.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord10 = recordFormatDynamicRecordImpl0.newRecord();
    int int13 = recordFormatDynamicRecordImpl0.getPageSize((int) '4', (int) (short) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_14 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat15 = v320_14.relationship();
    boolean boolean16 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) v320_14);
    java.lang.String str17 = v320_14.name();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat18 = v320_14.property();
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord10);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "high_limitV3_2_0" + "'", str17,
        "high_limitV3_2_0");
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat18);
  }

  @Test
  public void test0479() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0479");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.LabelTokenRecord> labelTokenRecordRecordFormat1 = v300_0.labelToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord> propertyKeyTokenRecordRecordFormat2 = v300_0.propertyKeyToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat3 = v300_0.relationship();
    org.junit.Assert.assertNotNull(labelTokenRecordRecordFormat1);
    org.junit.Assert.assertNotNull(propertyKeyTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat3);
  }

  @Test
  public void test0480() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0480");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.V300 v300_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.V300();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat1 = v300_0.relationship();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat2 = v300_0.relationshipTypeToken();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipGroupRecord> relationshipGroupRecordRecordFormat3 = v300_0.relationshipGroup();
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat1);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat2);
    org.junit.Assert.assertNotNull(relationshipGroupRecordRecordFormat3);
  }

  @Test
  public void test0481() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0481");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_0 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.DynamicRecord> dynamicRecordRecordFormat1 = v320_0.dynamic();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat2 = v320_0.property();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.PropertyRecord> propertyRecordRecordFormat3 = v320_0.property();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord> relationshipTypeTokenRecordRecordFormat4 = v320_0.relationshipTypeToken();
    java.lang.String str5 = v320_0.name();
    org.neo4j.kernel.impl.store.format.FormatFamily formatFamily6 = v320_0.getFormatFamily();
    org.junit.Assert.assertNotNull(dynamicRecordRecordFormat1);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat2);
    org.junit.Assert.assertNotNull(propertyRecordRecordFormat3);
    org.junit.Assert.assertNotNull(relationshipTypeTokenRecordRecordFormat4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "high_limitV3_2_0" + "'", str5,
        "high_limitV3_2_0");
    org.junit.Assert.assertTrue(
        "'" + formatFamily6 + "' != '" + org.neo4j.kernel.impl.store.format.FormatFamily.high_limit
            + "'",
        formatFamily6.equals(org.neo4j.kernel.impl.store.format.FormatFamily.high_limit));
  }

  @Test
  public void test0482() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0482");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader1 = null;
    int int2 = propertyRecordFormat0.getRecordSize(storeHeader1);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl3 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats4 = highLimitFactoryDefaultImpl3.newInstance();
    boolean boolean5 = propertyRecordFormat0.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl3);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean8 = propertyRecordFormat0.equals((java.lang.Object) (short) 100);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = null;
    org.neo4j.internal.id.IdSequence idSequence11 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext12 = null;
    propertyRecordFormat0.prepare(propertyRecord9, (int) (short) 0, idSequence11, cursorContext12);
    boolean boolean15 = propertyRecordFormat0.equals((java.lang.Object) "3.0.6");
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat16 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord17 = propertyRecordFormat16.newRecord();
    org.neo4j.io.pagecache.PageCursor pageCursor18 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad19 = null;
    try {
      propertyRecordFormat0.read(propertyRecord17, pageCursor18, recordLoad19, (int) (byte) 1, 2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    org.junit.Assert.assertNotNull(recordFormats4);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(propertyRecord17);
  }

  @Test
  public void test0483() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0483");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int3 = recordFormatDynamicRecordImpl0.getPageSize(24, 8);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl4 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean6 = recordFormatDynamicRecordImpl4.equals((java.lang.Object) 100.0f);
    int int9 = recordFormatDynamicRecordImpl4.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord10 = recordFormatDynamicRecordImpl4.newRecord();
    long long11 = recordFormatDynamicRecordImpl0.getNextRecordReference(dynamicRecord10);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader12 = null;
    try {
      int int13 = recordFormatDynamicRecordImpl0.getRecordSize(storeHeader12);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord10);
    org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
  }

  @Test
  public void test0484() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0484");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl6 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int9 = recordFormatDynamicRecordImpl6.getPageSize(24, 8);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl10 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean12 = recordFormatDynamicRecordImpl10.equals((java.lang.Object) 100.0f);
    int int15 = recordFormatDynamicRecordImpl10.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord16 = recordFormatDynamicRecordImpl10.newRecord();
    long long17 = recordFormatDynamicRecordImpl6.getNextRecordReference(dynamicRecord16);
    org.neo4j.internal.id.IdSequence idSequence19 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext20 = null;
    recordFormatDynamicRecordImpl0.prepare(dynamicRecord16, 10, idSequence19, cursorContext20);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl22 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean24 = recordFormatDynamicRecordImpl22.equals((java.lang.Object) 100.0f);
    int int27 = recordFormatDynamicRecordImpl22.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord28 = recordFormatDynamicRecordImpl22.newRecord();
    int int31 = recordFormatDynamicRecordImpl22.getPageSize(48, 35);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl32 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean34 = recordFormatDynamicRecordImpl32.equals((java.lang.Object) 100.0f);
    int int37 = recordFormatDynamicRecordImpl32.getPageSize(16, (-1));
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl38 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int41 = recordFormatDynamicRecordImpl38.getPageSize(24, 8);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl42 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean44 = recordFormatDynamicRecordImpl42.equals((java.lang.Object) 100.0f);
    int int47 = recordFormatDynamicRecordImpl42.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord48 = recordFormatDynamicRecordImpl42.newRecord();
    long long49 = recordFormatDynamicRecordImpl38.getNextRecordReference(dynamicRecord48);
    org.neo4j.internal.id.IdSequence idSequence51 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext52 = null;
    recordFormatDynamicRecordImpl32.prepare(dynamicRecord48, 10, idSequence51, cursorContext52);
    org.neo4j.internal.id.IdSequence idSequence55 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext56 = null;
    recordFormatDynamicRecordImpl22.prepare(dynamicRecord48, (int) (byte) 1, idSequence55,
        cursorContext56);
    org.neo4j.io.pagecache.PageCursor pageCursor58 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad59 = null;
    try {
      recordFormatDynamicRecordImpl0.read(dynamicRecord48, pageCursor58, recordLoad59, 96,
          (int) (byte) 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 24 + "'", int9 == 24);
    org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord16);
    org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16 + "'", int27 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord28);
    org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    org.junit.Assert.assertTrue("'" + int37 + "' != '" + 16 + "'", int37 == 16);
    org.junit.Assert.assertTrue("'" + int41 + "' != '" + 24 + "'", int41 == 24);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    org.junit.Assert.assertTrue("'" + int47 + "' != '" + 16 + "'", int47 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord48);
    org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
  }

  @Test
  public void test0485() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0485");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        (int) ' ');
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0486() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0486");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat2 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        1);
    io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat relationshipHighLimitRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.RelationshipHighLimitRecordFormat(
        (int) (byte) 1);
    org.neo4j.kernel.impl.store.record.RelationshipRecord relationshipRecord5 = relationshipHighLimitRecordFormat4.newRecord();
    org.neo4j.internal.id.IdSequence idSequence7 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext8 = null;
    relationshipHighLimitRecordFormat2.prepare(relationshipRecord5, (int) 'a', idSequence7,
        cursorContext8);
    org.neo4j.io.pagecache.PageCursor pageCursor10 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad11 = null;
    try {
      relationshipHighLimitRecordFormat0.read(relationshipRecord5, pageCursor10, recordLoad11, 8,
          0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(relationshipRecord5);
  }

  @Test
  public void test0487() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0487");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = null;
    org.neo4j.internal.id.IdSequence idSequence3 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext4 = null;
    propertyRecordFormat0.prepare(propertyRecord1, (int) (short) -1, idSequence3, cursorContext4);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = propertyRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat8 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = propertyRecordFormat8.newRecord();
    long long10 = propertyOneByteHeaderRecordFormat7.getNextRecordReference(propertyRecord9);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader11 = null;
    int int12 = propertyOneByteHeaderRecordFormat7.getRecordSize(storeHeader11);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long14 = propertyOneByteHeaderRecordFormat13.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat15 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat16 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord17 = propertyRecordFormat16.newRecord();
    long long18 = propertyOneByteHeaderRecordFormat15.getNextRecordReference(propertyRecord17);
    long long19 = propertyOneByteHeaderRecordFormat13.getNextRecordReference(propertyRecord17);
    org.neo4j.internal.id.IdSequence idSequence21 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext22 = null;
    propertyOneByteHeaderRecordFormat7.prepare(propertyRecord17, 64, idSequence21, cursorContext22);
    long long24 = propertyRecordFormat0.getNextRecordReference(propertyRecord17);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat25 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader26 = null;
    int int27 = propertyRecordFormat25.getRecordSize(storeHeader26);
    io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl highLimitFactoryDefaultImpl28 = new io.github.onograph.kernel.srv.store.format.highlimit.v400.HighLimitFactoryDefaultImpl();
    org.neo4j.kernel.impl.store.format.RecordFormats recordFormats29 = highLimitFactoryDefaultImpl28.newInstance();
    boolean boolean30 = propertyRecordFormat25.equals(
        (java.lang.Object) highLimitFactoryDefaultImpl28);
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat32 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (short) 100);
    boolean boolean33 = propertyRecordFormat25.equals((java.lang.Object) (short) 100);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat34 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord35 = propertyRecordFormat34.newRecord();
    long long36 = propertyRecordFormat25.getNextRecordReference(propertyRecord35);
    org.neo4j.io.pagecache.PageCursor pageCursor37 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad38 = null;
    try {
      propertyRecordFormat0.read(propertyRecord35, pageCursor37, recordLoad38, 2, (-1));
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord6);
    org.junit.Assert.assertNotNull(propertyRecord9);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1125899906842623L + "'",
        long14 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord17);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 48 + "'", int27 == 48);
    org.junit.Assert.assertNotNull(recordFormats29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(propertyRecord35);
    org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
  }

  @Test
  public void test0488() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0488");
    }
    java.util.function.Function<org.neo4j.kernel.impl.store.StoreHeader, java.lang.Integer> storeHeaderFunction1 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.fixedRecordSize(
        16);
    org.junit.Assert.assertNotNull(storeHeaderFunction1);
  }

  @Test
  public void test0489() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0489");
    }
    long long2 = io.github.onograph.kernel.srv.store.format.highlimit.HighLimitEncEnum.toable(0L,
        234L);
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 234L + "'", long2 == 234L);
  }

  @Test
  public void test0490() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0490");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = null;
    org.neo4j.internal.id.IdSequence idSequence3 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext4 = null;
    propertyRecordFormat0.prepare(propertyRecord1, (int) (short) -1, idSequence3, cursorContext4);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = propertyRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat8 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = propertyRecordFormat8.newRecord();
    long long10 = propertyOneByteHeaderRecordFormat7.getNextRecordReference(propertyRecord9);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader11 = null;
    int int12 = propertyOneByteHeaderRecordFormat7.getRecordSize(storeHeader11);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long14 = propertyOneByteHeaderRecordFormat13.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat15 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat16 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord17 = propertyRecordFormat16.newRecord();
    long long18 = propertyOneByteHeaderRecordFormat15.getNextRecordReference(propertyRecord17);
    long long19 = propertyOneByteHeaderRecordFormat13.getNextRecordReference(propertyRecord17);
    org.neo4j.internal.id.IdSequence idSequence21 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext22 = null;
    propertyOneByteHeaderRecordFormat7.prepare(propertyRecord17, 64, idSequence21, cursorContext22);
    long long24 = propertyRecordFormat0.getNextRecordReference(propertyRecord17);
    org.neo4j.io.pagecache.PageCursor pageCursor25 = null;
    try {
      boolean boolean26 = propertyRecordFormat0.isInUse(pageCursor25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord6);
    org.junit.Assert.assertNotNull(propertyRecord9);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1125899906842623L + "'",
        long14 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord17);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
  }

  @Test
  public void test0491() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0491");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean2 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) 100.0f);
    int int5 = recordFormatDynamicRecordImpl0.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord6 = recordFormatDynamicRecordImpl0.newRecord();
    int int9 = recordFormatDynamicRecordImpl0.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord10 = recordFormatDynamicRecordImpl0.newRecord();
    int int13 = recordFormatDynamicRecordImpl0.getPageSize((int) '4', (int) (short) 1);
    io.github.onograph.kernel.srv.store.format.highlimit.v320.V320 v320_14 = new io.github.onograph.kernel.srv.store.format.highlimit.v320.V320();
    org.neo4j.kernel.impl.store.format.RecordFormat<org.neo4j.kernel.impl.store.record.RelationshipRecord> relationshipRecordRecordFormat15 = v320_14.relationship();
    boolean boolean16 = recordFormatDynamicRecordImpl0.equals((java.lang.Object) v320_14);
    int int19 = recordFormatDynamicRecordImpl0.getPageSize(16, 8);
    org.neo4j.io.pagecache.PageCursor pageCursor20 = null;
    try {
      boolean boolean21 = recordFormatDynamicRecordImpl0.isInUse(pageCursor20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord6);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord10);
    org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    org.junit.Assert.assertNotNull(relationshipRecordRecordFormat15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
  }

  @Test
  public void test0492() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0492");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord1 = null;
    long long2 = nodeRecordFormat0.getNextRecordReference(nodeRecord1);
    int int3 = nodeRecordFormat0.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader4 = null;
    int int5 = nodeRecordFormat0.getRecordSize(storeHeader4);
    io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat nodeRecordFormat6 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.NodeRecordFormat();
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord7 = null;
    long long8 = nodeRecordFormat6.getNextRecordReference(nodeRecord7);
    int int9 = nodeRecordFormat6.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader10 = null;
    int int11 = nodeRecordFormat6.getRecordSize(storeHeader10);
    int int14 = nodeRecordFormat6.getPageSize((int) '4', (int) (short) 1);
    org.neo4j.kernel.impl.store.record.NodeRecord nodeRecord15 = nodeRecordFormat6.newRecord();
    long long16 = nodeRecordFormat0.getNextRecordReference(nodeRecord15);
    int int19 = nodeRecordFormat0.getPageSize(48, (int) (short) 1);
    int int20 = nodeRecordFormat0.getRecordHeaderSize();
    int int21 = nodeRecordFormat0.getRecordHeaderSize();
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    org.junit.Assert.assertNotNull(nodeRecord15);
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
  }

  @Test
  public void test0493() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0493");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord2 = propertyRecordFormat1.newRecord();
    long long3 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord2);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat4 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat5 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = propertyRecordFormat5.newRecord();
    long long7 = propertyOneByteHeaderRecordFormat4.getNextRecordReference(propertyRecord6);
    long long8 = propertyOneByteHeaderRecordFormat0.getNextRecordReference(propertyRecord6);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat9 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long10 = propertyOneByteHeaderRecordFormat9.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord11 = propertyOneByteHeaderRecordFormat9.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat12 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long13 = propertyOneByteHeaderRecordFormat12.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord14 = propertyOneByteHeaderRecordFormat12.newRecord();
    long long15 = propertyOneByteHeaderRecordFormat9.getNextRecordReference(propertyRecord14);
    org.neo4j.internal.id.IdSequence idSequence17 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext18 = null;
    propertyOneByteHeaderRecordFormat0.prepare(propertyRecord14, (int) (byte) -1, idSequence17,
        cursorContext18);
    int int20 = propertyOneByteHeaderRecordFormat0.getRecordHeaderSize();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat21 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader22 = null;
    int int23 = propertyRecordFormat21.getRecordSize(storeHeader22);
    int int26 = propertyRecordFormat21.getPageSize((int) (byte) -1, 128);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat27 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long28 = propertyOneByteHeaderRecordFormat27.getMaxId();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord29 = propertyOneByteHeaderRecordFormat27.newRecord();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord30 = propertyOneByteHeaderRecordFormat27.newRecord();
    long long31 = propertyRecordFormat21.getNextRecordReference(propertyRecord30);
    org.neo4j.io.pagecache.PageCursor pageCursor32 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad33 = null;
    try {
      propertyOneByteHeaderRecordFormat0.read(propertyRecord30, pageCursor32, recordLoad33, 99, 2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord2);
    org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord6);
    org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1125899906842623L + "'",
        long10 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord11);
    org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1125899906842623L + "'",
        long13 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord14);
    org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    org.junit.Assert.assertTrue("'" + int23 + "' != '" + 48 + "'", int23 == 48);
    org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1125899906842623L + "'",
        long28 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord29);
    org.junit.Assert.assertNotNull(propertyRecord30);
    org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
  }

  @Test
  public void test0494() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0494");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat nodeHighLimitRecordFormat1 = new io.github.onograph.kernel.srv.store.format.highlimit.NodeHighLimitRecordFormat(
        (int) (byte) 100);
    org.neo4j.io.pagecache.PageCursor pageCursor2 = null;
    try {
      boolean boolean3 = nodeHighLimitRecordFormat1.isInUse(pageCursor2);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
  }

  @Test
  public void test0495() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0495");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat0 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord1 = null;
    org.neo4j.internal.id.IdSequence idSequence3 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext4 = null;
    propertyRecordFormat0.prepare(propertyRecord1, (int) (short) -1, idSequence3, cursorContext4);
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord6 = propertyRecordFormat0.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat7 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat8 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord9 = propertyRecordFormat8.newRecord();
    long long10 = propertyOneByteHeaderRecordFormat7.getNextRecordReference(propertyRecord9);
    org.neo4j.kernel.impl.store.StoreHeader storeHeader11 = null;
    int int12 = propertyOneByteHeaderRecordFormat7.getRecordSize(storeHeader11);
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat13 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    long long14 = propertyOneByteHeaderRecordFormat13.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat15 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat16 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord17 = propertyRecordFormat16.newRecord();
    long long18 = propertyOneByteHeaderRecordFormat15.getNextRecordReference(propertyRecord17);
    long long19 = propertyOneByteHeaderRecordFormat13.getNextRecordReference(propertyRecord17);
    org.neo4j.internal.id.IdSequence idSequence21 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext22 = null;
    propertyOneByteHeaderRecordFormat7.prepare(propertyRecord17, 64, idSequence21, cursorContext22);
    long long24 = propertyRecordFormat0.getNextRecordReference(propertyRecord17);
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat25 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord26 = propertyRecordFormat25.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat propertyRecordFormat27 = new io.github.onograph.kernel.srv.store.format.highlimit.v300.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.StoreHeader storeHeader28 = null;
    int int29 = propertyRecordFormat27.getRecordSize(storeHeader28);
    long long30 = propertyRecordFormat27.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat propertyOneByteHeaderRecordFormat31 = new io.github.onograph.kernel.srv.store.format.highlimit.PropertyOneByteHeaderRecordFormat();
    io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat propertyRecordFormat32 = new io.github.onograph.kernel.srv.store.format.highlimit.v340.PropertyRecordFormat();
    org.neo4j.kernel.impl.store.record.PropertyRecord propertyRecord33 = propertyRecordFormat32.newRecord();
    long long34 = propertyOneByteHeaderRecordFormat31.getNextRecordReference(propertyRecord33);
    org.neo4j.internal.id.IdSequence idSequence36 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext37 = null;
    propertyRecordFormat27.prepare(propertyRecord33, 0, idSequence36, cursorContext37);
    long long39 = propertyRecordFormat25.getNextRecordReference(propertyRecord33);
    org.neo4j.io.pagecache.PageCursor pageCursor40 = null;
    try {
      propertyRecordFormat0.write(propertyRecord33, pageCursor40, (int) ' ', (int) (short) 0);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(propertyRecord6);
    org.junit.Assert.assertNotNull(propertyRecord9);
    org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1125899906842623L + "'",
        long14 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord17);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    org.junit.Assert.assertNotNull(propertyRecord26);
    org.junit.Assert.assertTrue("'" + int29 + "' != '" + 48 + "'", int29 == 48);
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1125899906842623L + "'",
        long30 == 1125899906842623L);
    org.junit.Assert.assertNotNull(propertyRecord33);
    org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
    org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
  }

  @Test
  public void test0496() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0496");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(97L,
        (long) '#');
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
  }

  @Test
  public void test0497() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0497");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int3 = recordFormatDynamicRecordImpl0.getPageSize(24, 8);
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl4 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean6 = recordFormatDynamicRecordImpl4.equals((java.lang.Object) 100.0f);
    int int9 = recordFormatDynamicRecordImpl4.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord10 = recordFormatDynamicRecordImpl4.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl11 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean13 = recordFormatDynamicRecordImpl11.equals((java.lang.Object) 100.0f);
    int int16 = recordFormatDynamicRecordImpl11.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord17 = recordFormatDynamicRecordImpl11.newRecord();
    long long18 = recordFormatDynamicRecordImpl4.getNextRecordReference(dynamicRecord17);
    int int19 = recordFormatDynamicRecordImpl4.getRecordHeaderSize();
    int int20 = recordFormatDynamicRecordImpl4.getRecordHeaderSize();
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord21 = recordFormatDynamicRecordImpl4.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl22 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean24 = recordFormatDynamicRecordImpl22.equals((java.lang.Object) 100.0f);
    int int27 = recordFormatDynamicRecordImpl22.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord28 = recordFormatDynamicRecordImpl22.newRecord();
    int int31 = recordFormatDynamicRecordImpl22.getPageSize(48, 35);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord32 = recordFormatDynamicRecordImpl22.newRecord();
    long long33 = recordFormatDynamicRecordImpl22.getMaxId();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl34 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean36 = recordFormatDynamicRecordImpl34.equals((java.lang.Object) 100.0f);
    int int39 = recordFormatDynamicRecordImpl34.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord40 = recordFormatDynamicRecordImpl34.newRecord();
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl41 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    boolean boolean43 = recordFormatDynamicRecordImpl41.equals((java.lang.Object) 100.0f);
    int int46 = recordFormatDynamicRecordImpl41.getPageSize(16, (-1));
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord47 = recordFormatDynamicRecordImpl41.newRecord();
    long long48 = recordFormatDynamicRecordImpl34.getNextRecordReference(dynamicRecord47);
    org.neo4j.internal.id.IdSequence idSequence50 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext51 = null;
    recordFormatDynamicRecordImpl22.prepare(dynamicRecord47, 128, idSequence50, cursorContext51);
    org.neo4j.internal.id.IdSequence idSequence54 = null;
    org.neo4j.io.pagecache.context.CursorContext cursorContext55 = null;
    recordFormatDynamicRecordImpl4.prepare(dynamicRecord47, 48, idSequence54, cursorContext55);
    org.neo4j.io.pagecache.PageCursor pageCursor57 = null;
    org.neo4j.kernel.impl.store.record.RecordLoad recordLoad58 = null;
    try {
      recordFormatDynamicRecordImpl0.read(dynamicRecord47, pageCursor57, recordLoad58, 4,
          (int) (byte) 1);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord10);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord17);
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
    org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
    org.junit.Assert.assertNotNull(dynamicRecord21);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16 + "'", int27 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord28);
    org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
    org.junit.Assert.assertNotNull(dynamicRecord32);
    org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1125899906842623L + "'",
        long33 == 1125899906842623L);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertTrue("'" + int39 + "' != '" + 16 + "'", int39 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord40);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertTrue("'" + int46 + "' != '" + 16 + "'", int46 == 16);
    org.junit.Assert.assertNotNull(dynamicRecord47);
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
  }

  @Test
  public void test0498() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0498");
    }
    io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl recordFormatDynamicRecordImpl0 = new io.github.onograph.kernel.srv.store.format.highlimit.RecordFormatDynamicRecordImpl();
    int int3 = recordFormatDynamicRecordImpl0.getPageSize(24, 8);
    org.neo4j.kernel.impl.store.record.DynamicRecord dynamicRecord4 = null;
    org.neo4j.io.pagecache.PageCursor pageCursor5 = null;
    try {
      recordFormatDynamicRecordImpl0.write(dynamicRecord4, pageCursor5, 100, 100);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
  }

  @Test
  public void test0499() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0499");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(11L, (-40L));
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-37L) + "'", long2 == (-37L));
  }

  @Test
  public void test0500() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest0.test0500");
    }
    long long2 = org.neo4j.kernel.impl.store.format.BaseRecordFormat.longFromIntAndMod(97L, (-37L));
    org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
  }
}

