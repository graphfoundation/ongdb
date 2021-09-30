package io.github.onograph.fabric.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.neo4j.driver.Value;
import org.neo4j.driver.Values;
import org.neo4j.graphdb.spatial.CRS;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.BooleanValue;
import org.neo4j.values.storable.ByteArray;
import org.neo4j.values.storable.DateTimeValue;
import org.neo4j.values.storable.DateValue;
import org.neo4j.values.storable.DoubleValue;
import org.neo4j.values.storable.DurationValue;
import org.neo4j.values.storable.LocalDateTimeValue;
import org.neo4j.values.storable.LocalTimeValue;
import org.neo4j.values.storable.LongValue;
import org.neo4j.values.storable.NoValue;
import org.neo4j.values.storable.PointValue;
import org.neo4j.values.storable.StringValue;
import org.neo4j.values.storable.TextValue;
import org.neo4j.values.storable.TimeValue;
import org.neo4j.values.virtual.ListValue;
import org.neo4j.values.virtual.MapValue;


class ParamConversionUtil {


  private Value _cordaForDu(DurationValue _vsDurationValue) {
    return Values.isoDuration(_vsDurationValue.get(ChronoUnit.MONTHS),
        _vsDurationValue.get(ChronoUnit.DAYS),
        _vsDurationValue.get(ChronoUnit.SECONDS),
        (int) _vsDurationValue.get(ChronoUnit.NANOS));
  }


  private ZonedDateTime _cordetZonedDateTime(DateTimeValue _vsDateTimeValue) {
    return _vsDateTimeValue.asObjectCopy();
  }


  private LocalDateTime _corladetLocalDateTime(LocalDateTimeValue _vsLocalDateTimeValue) {
    return _vsLocalDateTimeValue.asObjectCopy();
  }


  private LocalTime _corlateLocalTime(LocalTimeValue _vsLocalTimeValue) {
    return _vsLocalTimeValue.asObjectCopy();
  }


  private byte[] _covtbtForBy(ByteArray _vsByteArray) {
    return _vsByteArray.asObjectCopy();
  }


  private LocalDate _covtdtLocalDate(DateValue _vsDateValue) {
    return _vsDateValue.asObjectCopy();
  }


  private Double _covtdueDouble(DoubleValue _svDoubleValue) {
    return _svDoubleValue.asObjectCopy();
  }


  private Long _covtlnLong(LongValue _svLongValue) {
    return _svLongValue.asObjectCopy();
  }


  private List<Object> _covtlsList(ListValue _vsListValue) {

    List<Object> _listVdObject = new ArrayList();
    _vsListValue.forEach((value) ->
    {
      _listVdObject.add(this.covtvlObject(value));
    });
    return _listVdObject;
  }


  private Map<String, Object> _covtmpMap(MapValue _vsMapValue) {

    Map<String, Object> _mapVdso = new HashMap();
    _vsMapValue.foreach((key, value) ->
    {
      _mapVdso.put(key, this.covtvlObject(value));
    });
    return _mapVdso;
  }


  private Value _covtpiForPo(PointValue _pointValue) {

    double[] _codntDoubleArray = _pointValue.coordinate();

    CRS _cRS = _pointValue.getCRS();
    return _codntDoubleArray.length == 2 ? Values.point(_cRS.getCode(), _codntDoubleArray[0],
        _codntDoubleArray[1])
        : Values.point(_cRS.getCode(), _codntDoubleArray[0], _codntDoubleArray[1],
            _codntDoubleArray[2]);
  }


  private String _covtsrgString(TextValue _vsTextValue) {
    return _vsTextValue.stringValue();
  }


  private OffsetTime _covttmOffsetTime(TimeValue _vsTimeValue) {
    return _vsTimeValue.asObjectCopy();
  }


  private boolean _isCovtboaForBo(BooleanValue _vsBooleanValue) {
    return _vsBooleanValue.booleanValue();
  }


  Object covtvlObject(AnyValue _vsAnyValue) {
    if (_vsAnyValue instanceof NoValue) {
      return null;
    } else if (_vsAnyValue instanceof LongValue) {
      return this._covtlnLong((LongValue) _vsAnyValue);
    } else if (_vsAnyValue instanceof DoubleValue) {
      return this._covtdueDouble((DoubleValue) _vsAnyValue);
    } else if (_vsAnyValue instanceof BooleanValue) {
      return this._isCovtboaForBo((BooleanValue) _vsAnyValue);
    } else if (_vsAnyValue instanceof StringValue) {
      return this._covtsrgString((StringValue) _vsAnyValue);
    } else if (_vsAnyValue instanceof MapValue) {
      return this._covtmpMap((MapValue) _vsAnyValue);
    } else if (_vsAnyValue instanceof ListValue) {
      return this._covtlsList((ListValue) _vsAnyValue);
    } else if (_vsAnyValue instanceof ByteArray) {
      return this._covtbtForBy((ByteArray) _vsAnyValue);
    } else if (_vsAnyValue instanceof DateValue) {
      return this._covtdtLocalDate((DateValue) _vsAnyValue);
    } else if (_vsAnyValue instanceof LocalTimeValue) {
      return this._corlateLocalTime((LocalTimeValue) _vsAnyValue);
    } else if (_vsAnyValue instanceof LocalDateTimeValue) {
      return this._corladetLocalDateTime((LocalDateTimeValue) _vsAnyValue);
    } else if (_vsAnyValue instanceof TimeValue) {
      return this._covttmOffsetTime((TimeValue) _vsAnyValue);
    } else if (_vsAnyValue instanceof DateTimeValue) {
      return this._cordetZonedDateTime((DateTimeValue) _vsAnyValue);
    } else if (_vsAnyValue instanceof DurationValue) {
      return this._cordaForDu((DurationValue) _vsAnyValue);
    } else if (_vsAnyValue instanceof PointValue) {
      return this._covtpiForPo((PointValue) _vsAnyValue);
    } else {

      throw new IllegalStateException("*** Error: 4beeab7d-ac80-4f65-ae11-1b8f23961a5c");
    }
  }
}
