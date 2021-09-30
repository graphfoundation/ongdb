package io.github.onograph.dbms.utils;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.impl.store.record.PrimitiveRecord;
import org.neo4j.kernel.impl.store.record.PropertyRecord;
import org.neo4j.logging.Log;
import org.neo4j.values.storable.Value;


class NodeWrapperInfoMetrics {


  private static final int LIMT_LG_LEG = 120;

  final LongAdder cnt = new LongAdder();

  final LongAdder reodLongAdder = new LongAdder();

  final LongAdder unsLongAdder = new LongAdder();


  private final long lgSt;


  private final Log log;

  NodeWrapperInfoMetrics(Log _log) {
    this.log = _log;
    this.lgSt = System.nanoTime();
  }


  private static int _pect(long _lgPa, long _lgTtl) {
    return _lgTtl == 0L ? 0 : (int) (100.0D * (double) _lgPa / (double) _lgTtl);
  }


  private static String _trtomleString(String val) {
    return val.length() <= 120 ? val : io.github.onograph.I18N.format(
        "io.github.onograph.dbms.utils.NodeWrapperInfoMetrics.trtomleString",
        val.substring(0, 120));
  }


  void adcrtForSt(int _iI, String tNme) {

  }


  void brkroForStEx(Exception _exception, long _lgI, String tNme) {

  }


  void brnpechForStPrEx(Exception _exception, PrimitiveRecord _primitiveRecord, String tNme) {

  }


  void brnpetoForStPrVa(int _iIik, Value _pnValue, PrimitiveRecord _primitiveRecord, String tNme) {

    String val = _pnValue.toString();


  }


  void cilpoycnForStPrPr(PropertyRecord _ccPropertyRecord, PrimitiveRecord _primitiveRecord,
      String tNme) {

  }


  void inadidForInEx(Exception _exception, IndexDescriptor _indexDescriptor) {

  }


  void inicsnForCoEx(ConstraintDescriptor _constraintDescriptor, Exception _exception) {

  }


  void prnsua() {

    long _lgScns = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - this.lgSt);

    long cnt = this.cnt.sum();

    long _lgUue = this.unsLongAdder.sum();

    long _lgRmvd = this.reodLongAdder.sum();


  }
}
