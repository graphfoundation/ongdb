package io.github.onograph.kernel.srv.log.query;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import org.neo4j.internal.helpers.Strings;
import org.neo4j.kernel.api.query.QuerySnapshot;
import org.neo4j.values.AnyValue;
import org.neo4j.values.AnyValueWriter.EntityMode;
import org.neo4j.values.utils.PrettyPrinter;
import org.neo4j.values.virtual.MapValue;


class Formatter {

  private Formatter() {
  }


  private static void _fomavuForAnStAn(EntityMode _entityMode, int _iCnm,
      StringBuilder _stringBuilder, AnyValue val) {

    PrettyPrinter _prettyPrinter = new PrettyPrinter("'", _entityMode, _iCnm);
    val.writeTo(_prettyPrinter);
    _prettyPrinter.valueInto(_stringBuilder);
  }


  private static void _fomvuForStOb(StringBuilder _rslStringBuilder, Object val) {
    if (val instanceof Map) {
      fommForStMa(Collections.emptySet(), (Map) val, _rslStringBuilder);
    } else if (val instanceof String) {
      _rslStringBuilder.append('\'').append(val).append('\'');
    } else {
      _rslStringBuilder.append(Strings.prettyPrint(val));
    }
  }


  private static void fommForStMa(Collection<String> _collectionOfsaeString,
      Map<String, Object> _mapPrmso, StringBuilder _rslStringBuilder) {
    _rslStringBuilder.append('{');
    if (_mapPrmso != null) {

      String _strS = "";

      for (

          Iterator _iterator = _mapPrmso.entrySet().iterator(); _iterator.hasNext(); _strS = ", ") {

        Entry<String, Object> _entryEtyso = (Entry) _iterator.next();
        _rslStringBuilder.append(_strS).append(_entryEtyso.getKey()).append(": ");
        if (_collectionOfsaeString.contains(_entryEtyso.getKey())) {
          _rslStringBuilder.append("******");
        } else {
          _fomvuForStOb(_rslStringBuilder, _entryEtyso.getValue());
        }
      }
    }

    _rslStringBuilder.append("}");
  }


  static void fommForStMa(Map<String, Object> _mapPrmso, StringBuilder _rslStringBuilder) {
    fommForStMa(Collections.emptySet(), _mapPrmso, _rslStringBuilder);
  }


  static void fommvuForStMaAn(EntityMode _entityMode, int _iLpm, MapValue _prmMapValue,
      StringBuilder _rslStringBuilder) {
    _rslStringBuilder.append('{');
    if (_prmMapValue != null) {

      String[] _strSArray = new String[]{""};
      _prmMapValue.foreach((key, value) ->
      {
        _rslStringBuilder.append(_strSArray[0]).append(key).append(": ");
        _fomavuForAnStAn(_entityMode, _iLpm, _rslStringBuilder, value);
        _strSArray[0] = ", ";
      });
    }

    _rslStringBuilder.append("}");
  }


  static void fotacbForStQu(QuerySnapshot _querySnapshot, StringBuilder _rslStringBuilder) {
    _rslStringBuilder.append(_querySnapshot.allocatedBytes())
        .append(io.github.onograph.I18N.format(
            "io.github.onograph.kernel.srv.log.query.Formatter.append3"));
  }


  static void fotditiForStQu(QuerySnapshot _querySnapshot, StringBuilder _rslStringBuilder) {
    _rslStringBuilder.append(
            io.github.onograph.I18N.format("io.github.onograph.kernel.srv.log.query.Formatter.append4"))
        .append(TimeUnit.MICROSECONDS.toMillis(_querySnapshot.compilationTimeMicros()));
    _querySnapshot.cpuTimeMicros().ifPresent((aLong) ->
    {
      _rslStringBuilder.append(io.github.onograph.I18N.format(
              "io.github.onograph.kernel.srv.log.query.Formatter.append5"))
          .append(TimeUnit.MICROSECONDS.toMillis(aLong));
    });
    _rslStringBuilder.append(
            io.github.onograph.I18N.format("io.github.onograph.kernel.srv.log.query.Formatter.append6"))
        .append(TimeUnit.MICROSECONDS.toMillis(_querySnapshot.waitTimeMicros()));
    _rslStringBuilder.append(") - ");
  }


  static void fotpdlForStQu(QuerySnapshot _querySnapshot, StringBuilder _rslStringBuilder) {
    _rslStringBuilder.append(_querySnapshot.pageHits())
        .append(io.github.onograph.I18N.format(
            "io.github.onograph.kernel.srv.log.query.Formatter.append"));
    _rslStringBuilder.append(_querySnapshot.pageFaults())
        .append(io.github.onograph.I18N.format(
            "io.github.onograph.kernel.srv.log.query.Formatter.append2"));
  }
}
