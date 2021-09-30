package io.github.onograph.fabric.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.neo4j.driver.Value;
import org.neo4j.driver.types.IsoDuration;
import org.neo4j.driver.types.MapAccessor;
import org.neo4j.driver.types.Node;
import org.neo4j.driver.types.Path;
import org.neo4j.driver.types.Point;
import org.neo4j.driver.types.Relationship;
import org.neo4j.fabric.executor.ExecutionOptions;
import org.neo4j.fabric.stream.SourceTagging;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.BooleanValue;
import org.neo4j.values.storable.ByteArray;
import org.neo4j.values.storable.CoordinateReferenceSystem;
import org.neo4j.values.storable.DateTimeValue;
import org.neo4j.values.storable.DateValue;
import org.neo4j.values.storable.DoubleValue;
import org.neo4j.values.storable.DurationValue;
import org.neo4j.values.storable.LocalDateTimeValue;
import org.neo4j.values.storable.LocalTimeValue;
import org.neo4j.values.storable.LongValue;
import org.neo4j.values.storable.PointValue;
import org.neo4j.values.storable.TextArray;
import org.neo4j.values.storable.TextValue;
import org.neo4j.values.storable.TimeValue;
import org.neo4j.values.storable.Values;
import org.neo4j.values.virtual.ListValue;
import org.neo4j.values.virtual.ListValueBuilder;
import org.neo4j.values.virtual.MapValue;
import org.neo4j.values.virtual.MapValueBuilder;
import org.neo4j.values.virtual.NodeValue;
import org.neo4j.values.virtual.PathValue;
import org.neo4j.values.virtual.RelationshipValue;
import org.neo4j.values.virtual.VirtualValues;


class RecordUtils {


  private final boolean isTsh;


  private final long lgVts;

  RecordUtils() {
    this.isTsh = false;
    this.lgVts = 0L;
  }

  RecordUtils(ExecutionOptions _executionOptions) {
    this.isTsh = _executionOptions.addSourceTag();
    if (this.isTsh) {
      this.lgVts = SourceTagging.makeSourceTag(_executionOptions.sourceId());
    } else {
      this.lgVts = 0L;
    }
  }


  private DurationValue _cordaDurationValue(IsoDuration _vdIsoDuration) {
    return DurationValue.duration(_vdIsoDuration.months(), _vdIsoDuration.days(),
        _vdIsoDuration.seconds(), _vdIsoDuration.nanoseconds());
  }


  private DateTimeValue _cordetDateTimeValue(ZonedDateTime _vdZonedDateTime) {
    return DateTimeValue.datetime(_vdZonedDateTime);
  }


  private LocalDateTimeValue _corladetLocalDateTimeValue(LocalDateTime _vdLocalDateTime) {
    return LocalDateTimeValue.localDateTime(_vdLocalDateTime);
  }


  private LocalTimeValue _corlateLocalTimeValue(LocalTime _vdLocalTime) {
    return LocalTimeValue.localTime(_vdLocalTime);
  }


  private NodeValue _cornerrNodeValue(long _lgIn) {
    return VirtualValues.nodeValue(_lgIn, this._corsiarTextArray(new String[0]),
        this._covtmpMapValue(Collections.emptyMap()));
  }


  private RelationshipValue _corrasRelationshipValue(Relationship _vdRelationship) {

    NodeValue _nsNodeValue = this._cornerrNodeValue(this._covti(_vdRelationship.startNodeId()));

    NodeValue _neNodeValue = this._cornerrNodeValue(this._covti(_vdRelationship.endNodeId()));
    return this._corrasRelationshipValue(_neNodeValue, _nsNodeValue, _vdRelationship);
  }


  private RelationshipValue _corrasRelationshipValue(NodeValue _neNodeValue, NodeValue _snNodeValue,
      Relationship _vdRelationship) {

    TextValue tNme = this._covtsrgTextValue(_vdRelationship.type());

    MapValue _poeteMapValue = this._covtmpMapValue(_vdRelationship);
    return VirtualValues.relationshipValue(this._covti(_vdRelationship.id()), _snNodeValue,
        _neNodeValue, tNme, _poeteMapValue);
  }


  private TextArray _corsiarTextArray(String[] _strVdArray) {
    return Values.stringArray(_strVdArray);
  }


  private ByteArray _covtbtByteArray(byte[] _vdByteArray) {
    return Values.byteArray(_vdByteArray);
  }


  private DateValue _covtdtDateValue(LocalDate _vdLocalDate) {
    return DateValue.date(_vdLocalDate);
  }


  private DoubleValue _covtdueDoubleValue(Double _vdDouble) {
    return Values.doubleValue(_vdDouble);
  }


  private long _covti(long _lgVd) {
    return this.isTsh ? SourceTagging.tagId(_lgVd, this.lgVts) : _lgVd;
  }


  private LongValue _covtlnLongValue(Long _lgVd) {
    return Values.longValue(_lgVd);
  }


  private ListValue _covtlsListValue(List<Object> _listVdObject) {

    ListValueBuilder _listValueBuilder = ListValueBuilder.newListBuilder(_listVdObject.size());

    Iterator _iterator = _listVdObject.iterator();

    while (_iterator.hasNext()) {

      Object obj = _iterator.next();
      _listValueBuilder.add(this._covtvlAnyValue(obj));
    }

    return _listValueBuilder.build();
  }


  private MapValue _covtmpMapValue(MapAccessor _vdMapAccessor) {
    if (_vdMapAccessor.size() == 0) {
      return VirtualValues.EMPTY_MAP;
    } else {

      MapValueBuilder _mapValueBuilder = new MapValueBuilder(_vdMapAccessor.size());

      Iterator _iterator = _vdMapAccessor.keys().iterator();

      while (_iterator.hasNext()) {

        String k = (String) _iterator.next();
        _mapValueBuilder.add(k, this._covtvlAnyValue(_vdMapAccessor.get(k)));
      }

      return _mapValueBuilder.build();
    }
  }


  private MapValue _covtmpMapValue(Map<String, Object> _mapVdso) {
    if (_mapVdso.isEmpty()) {
      return VirtualValues.EMPTY_MAP;
    } else {

      MapValueBuilder _mapValueBuilder = new MapValueBuilder(_mapVdso.size());
      _mapVdso.forEach((key, value) ->
      {
        _mapValueBuilder.add(key, this._covtvlAnyValue(value));
      });
      return _mapValueBuilder.build();
    }
  }


  private NodeValue _covtndNodeValue(Node _vdNode) {

    String[] _strLblArray = Iterables.asArray(String.class, _vdNode.labels());

    TextArray _lsTextArray = this._corsiarTextArray(_strLblArray);

    MapValue _poeteMapValue = this._covtmpMapValue(_vdNode);
    return VirtualValues.nodeValue(this._covti(_vdNode.id()), _lsTextArray, _poeteMapValue);
  }


  private PointValue _covtpiPointValue(Point _point) {

    CoordinateReferenceSystem _coordinateReferenceSystem = CoordinateReferenceSystem.get(
        _point.srid());
    return Double.isNaN(_point.z()) ? Values.pointValue(_coordinateReferenceSystem, _point.x(),
        _point.y())
        : Values.pointValue(_coordinateReferenceSystem, _point.x(), _point.y(), _point.z());
  }


  private PathValue _covtptPathValue(Path _vdPath) {

    Map<Long, NodeValue> _mapNeln = new HashMap(_vdPath.length() + 1);

    NodeValue[] _ndsNodeValueArray = new NodeValue[_vdPath.length() + 1];

    RelationshipValue[] _rltosRelationshipValueArray = new RelationshipValue[_vdPath.length()];

    int cur = 0;

    Iterator _iterator;

    NodeValue _nsNodeValue;
    for (_iterator = _vdPath.nodes().iterator(); _iterator.hasNext(); ++cur) {

      Node _dieNode = (Node) _iterator.next();
      _nsNodeValue = this._covtndNodeValue(_dieNode);
      _ndsNodeValueArray[cur] = _nsNodeValue;
      _mapNeln.put(_dieNode.id(), _nsNodeValue);
    }

    cur = 0;

    for (_iterator = _vdPath.relationships().iterator(); _iterator.hasNext(); ++cur) {

      Relationship _dieRelationship = (Relationship) _iterator.next();
      _nsNodeValue = _mapNeln.get(_dieRelationship.startNodeId());

      NodeValue _neNodeValue = _mapNeln.get(_dieRelationship.endNodeId());

      RelationshipValue _relationshipValue = this._corrasRelationshipValue(_neNodeValue,
          _nsNodeValue, _dieRelationship);
      _rltosRelationshipValueArray[cur] = _relationshipValue;
    }

    return VirtualValues.path(_ndsNodeValueArray, _rltosRelationshipValueArray);
  }


  private TextValue _covtsrgTextValue(String _strVd) {
    return Values.utf8Value(_strVd);
  }


  private TimeValue _covttmTimeValue(OffsetTime _vdOffsetTime) {
    return TimeValue.time(_vdOffsetTime);
  }


  AnyValue _covtvlAnyValue(Value _dieValue) {

    Object val = _dieValue.asObject();
    return this._covtvlAnyValue(val);
  }


  private AnyValue _covtvlAnyValue(Object _obVd) {
    if (_obVd == null) {
      return Values.NO_VALUE;
    } else if (_obVd instanceof Node) {
      return this._covtndNodeValue((Node) _obVd);
    } else if (_obVd instanceof Relationship) {
      return this._corrasRelationshipValue((Relationship) _obVd);
    } else if (_obVd instanceof Path) {
      return this._covtptPathValue((Path) _obVd);
    } else if (_obVd instanceof Long) {
      return this._covtlnLongValue((Long) _obVd);
    } else if (_obVd instanceof Double) {
      return this._covtdueDoubleValue((Double) _obVd);
    } else if (_obVd instanceof Boolean) {
      return this._isCovtboaBooleanValue((Boolean) _obVd);
    } else if (_obVd instanceof String) {
      return this._covtsrgTextValue((String) _obVd);
    } else if (_obVd instanceof Map) {
      return this._covtmpMapValue((Map) _obVd);
    } else if (_obVd instanceof List) {
      return this._covtlsListValue((List) _obVd);
    } else if (_obVd instanceof byte[]) {
      return this._covtbtByteArray((byte[]) _obVd);
    } else if (_obVd instanceof LocalDate) {
      return this._covtdtDateValue((LocalDate) _obVd);
    } else if (_obVd instanceof LocalTime) {
      return this._corlateLocalTimeValue((LocalTime) _obVd);
    } else if (_obVd instanceof LocalDateTime) {
      return this._corladetLocalDateTimeValue((LocalDateTime) _obVd);
    } else if (_obVd instanceof OffsetTime) {
      return this._covttmTimeValue((OffsetTime) _obVd);
    } else if (_obVd instanceof ZonedDateTime) {
      return this._cordetDateTimeValue((ZonedDateTime) _obVd);
    } else if (_obVd instanceof IsoDuration) {
      return this._cordaDurationValue((IsoDuration) _obVd);
    } else if (_obVd instanceof Point) {
      return this._covtpiPointValue((Point) _obVd);
    } else {

      throw new IllegalStateException("*** Error: f97baa3e-b073-4c1e-bcf8-249f4fdebf19");
    }
  }


  private BooleanValue _isCovtboaBooleanValue(Boolean _isVd) {
    return Values.booleanValue(_isVd);
  }
}
