package io.github.onograph.dbms.utils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringJoiner;
import java.util.function.Function;
import org.neo4j.common.EntityType;
import org.neo4j.exceptions.KernelException;
import org.neo4j.internal.kernel.api.TokenRead;
import org.neo4j.internal.kernel.api.exceptions.PropertyKeyIdNotFoundKernelException;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexProviderDescriptor;
import org.neo4j.internal.schema.SchemaDescriptor;
import org.neo4j.internal.schema.SchemaRule;
import org.neo4j.values.storable.BooleanValue;
import org.neo4j.values.storable.DoubleArray;
import org.neo4j.values.storable.StringValue;
import org.neo4j.values.storable.Value;


public class SchemaQueryGenService {


  private static String _btcgveasrString(Value _cniValue) {
    if (_cniValue instanceof DoubleArray) {

      DoubleArray _doubleArray = (DoubleArray) _cniValue;
      return Arrays.toString(_doubleArray.asObjectCopy());
    } else {

      throw new IllegalArgumentException("*** Error: 8838e682-bab1-4868-9686-9a01d492f640");
    }
  }


  private static String _bteopoString(IndexDescriptor idx) {
    return _opString(SchemaQueryGenService::_btcgveasrString, idx);
  }


  private static String _cofastnString(Function<Value, String> _functionFstvvs,
      Map<String, Value> _mapMvssv) {

    StringJoiner _stringJoiner = new StringJoiner(", ", "{", "}");

    Iterator _iterator = _mapMvssv.entrySet().iterator();

    while (_iterator.hasNext()) {

      Entry<String, Value> _entryEtysv = (Entry) _iterator.next();

      String _strVr00 = _entryEtysv.getKey();
      _stringJoiner.add(
          io.github.onograph.I18N.format("io.github.onograph.dbms.utils.SchemaQueryGenService.add3",
              _strVr00,
              _functionFstvvs.apply(_entryEtysv.getValue())));
    }

    return _stringJoiner.toString();
  }


  private static String _esebtString(String _strS) {
    return _strS.replaceAll("`", "``");
  }


  private static String _fuecnassnString(IndexDescriptor idx) {
    return _opString(SchemaQueryGenService::_fuecnvaassnString, idx);
  }


  private static String _fuecnvaassnString(Value _cniValue) {
    if (_cniValue instanceof BooleanValue) {

      BooleanValue _booleanValue = (BooleanValue) _cniValue;
      return io.github.onograph.I18N.format(
          "io.github.onograph.dbms.utils.SchemaQueryGenService.fuecnvaassnString",
          _booleanValue.booleanValue());
    } else if (_cniValue instanceof StringValue) {

      StringValue _stringValue = (StringValue) _cniValue;
      return io.github.onograph.I18N.format(
          "io.github.onograph.dbms.utils.SchemaQueryGenService.fuecnvaassnString2",
          _stringValue.stringValue());
    } else {

      throw new IllegalArgumentException("*** Error: 54aa96fe-ff6b-4e17-a107-328f234b897a");
    }
  }


  private static String _laeorrltpString(SchemaDescriptor _schemaDescriptor, TokenRead _tokenRead)
      throws KernelException {
    return EntityType.NODE.equals(_schemaDescriptor.entityType()) ? _esebtString(
        _tokenRead.nodeLabelName(_schemaDescriptor.getLabelId()))
        : _esebtString(_tokenRead.relationshipTypeName(_schemaDescriptor.getRelTypeId()));
  }


  private static String _lasorltsaolString(SchemaDescriptor _schemaDescriptor, TokenRead _tokenRead)
      throws KernelException {

    StringJoiner _trolStringJoiner = new StringJoiner("|");

    int[] _iVArray = _schemaDescriptor.getEntityTokenIds();

    int _iVa = _iVArray.length;

    for (

        int _iVar = 0; _iVar < _iVa; ++_iVar) {

      int _iIte = _iVArray[_iVar];

      String _strVr00;
      if (EntityType.NODE.equals(_schemaDescriptor.entityType())) {
        _strVr00 = _tokenRead.nodeLabelName(_iIte);
        _trolStringJoiner.add(
            io.github.onograph.I18N.format(
                "io.github.onograph.dbms.utils.SchemaQueryGenService.add", _esebtString(_strVr00)));
      } else {
        _strVr00 = _tokenRead.relationshipTypeName(_iIte);
        _trolStringJoiner.add(
            io.github.onograph.I18N.format(
                "io.github.onograph.dbms.utils.SchemaQueryGenService.add2",
                _esebtString(_strVr00)));
      }
    }

    return _trolStringJoiner.toString();
  }


  private static String _lasorltsflepdString(SchemaDescriptor _schemaDescriptor,
      TokenRead _tokenRead) throws KernelException {

    StringJoiner _trolStringJoiner = new StringJoiner(", ", "[", "]");

    int[] _iVarArray = _schemaDescriptor.getEntityTokenIds();

    int _iVa = _iVarArray.length;

    for (

        int _iVa2 = 0; _iVa2 < _iVa; ++_iVa2) {

      int _iIte = _iVarArray[_iVa2];

      String _strVr00;
      if (EntityType.NODE.equals(_schemaDescriptor.entityType())) {
        _strVr00 = _tokenRead.nodeLabelName(_iIte);
        _trolStringJoiner.add(io.github.onograph.I18N.format(
            "io.github.onograph.dbms.utils.SchemaQueryGenService.add4", _strVr00));
      } else {
        _strVr00 = _tokenRead.relationshipTypeName(_iIte);
        _trolStringJoiner.add(io.github.onograph.I18N.format(
            "io.github.onograph.dbms.utils.SchemaQueryGenService.add5", _strVr00));
      }
    }

    return _trolStringJoiner.toString();
  }


  private static String _leyuuscttseString(IndexDescriptor _biIndexDescriptor,
      ConstraintDescriptor _constraintDescriptor, TokenRead _tokenRead)
      throws KernelException {

    String _strLort = _lasorltsflepdString(_constraintDescriptor.schema(), _tokenRead);

    String _strPoete = _prrflgpruString(_constraintDescriptor.schema(), _tokenRead);

    String _strNp = _biIndexDescriptor.getIndexProvider().name();

    String _strCni = _cofastnString(SchemaQueryGenService::_btcgveasrString,
        _biIndexDescriptor.getIndexConfig().asMap());
    return String
        .format(io.github.onograph.I18N.format(
                "io.github.onograph.dbms.utils.SchemaQueryGenService.format5"),
            _constraintDescriptor.getName(), _strLort, _strPoete,
            _strNp,
            _strCni);
  }


  private static String _opString(Function<Value, String> _functionFstvvs, IndexDescriptor idx) {

    StringBuilder _sStringBuilder = new StringBuilder();

    Map<String, Value> _mapSvmsv = idx.getIndexConfig().asMap();

    IndexProviderDescriptor _indexProviderDescriptor = idx.getIndexProvider();
    _sStringBuilder.append(io.github.onograph.I18N.format(
        "io.github.onograph.dbms.utils.SchemaQueryGenService.append"));
    _sStringBuilder.append(_indexProviderDescriptor.name());
    _sStringBuilder.append("'");
    if (!_mapSvmsv.isEmpty()) {
      _sStringBuilder.append(io.github.onograph.I18N.format(
          "io.github.onograph.dbms.utils.SchemaQueryGenService.append2"));
      _sStringBuilder.append(_cofastnString(_functionFstvvs, _mapSvmsv));
    }

    return _sStringBuilder.toString();
  }


  private static String _prrflgpruString(SchemaDescriptor _schemaDescriptor, TokenRead _tokenRead)
      throws PropertyKeyIdNotFoundKernelException {

    StringJoiner _poeteStringJoiner = new StringJoiner(", ", "[", "]");

    int[] _iVarArray = _schemaDescriptor.getPropertyIds();

    int _iVar = _iVarArray.length;

    for (

        int _iV = 0; _iV < _iVar; ++_iV) {

      int _iIp = _iVarArray[_iV];

      String _strVr00 = _tokenRead.propertyKeyName(_iIp);
      _poeteStringJoiner.add(
          io.github.onograph.I18N.format("io.github.onograph.dbms.utils.SchemaQueryGenService.add6",
              _strVr00));
    }

    return _poeteStringJoiner.toString();
  }


  private static String _prrlwipeString(SchemaDescriptor _schemaDescriptor, TokenRead _tokenRead)
      throws PropertyKeyIdNotFoundKernelException {

    StringJoiner _poeteStringJoiner = _prstjrStringJoiner(_schemaDescriptor.entityType());

    int[] _iVarArray = _schemaDescriptor.getPropertyIds();

    int _iVa = _iVarArray.length;

    for (

        int _iVa2 = 0; _iVa2 < _iVa; ++_iVa2) {

      int _iIp = _iVarArray[_iVa2];
      _poeteStringJoiner.add(_esebtString(_tokenRead.propertyKeyName(_iIp)));
    }

    return _poeteStringJoiner.toString();
  }


  private static StringJoiner _prstjrStringJoiner(EntityType _entityType) {
    return EntityType.NODE.equals(_entityType) ? new StringJoiner(
        io.github.onograph.I18N.format(
            "io.github.onograph.dbms.utils.SchemaQueryGenService.entityType"), "n.`",
        "`")
        : new StringJoiner(io.github.onograph.I18N.format(
            "io.github.onograph.dbms.utils.SchemaQueryGenService.entityType2"),
            "r.`", "`");
  }


  static String gecnhsteString(ConstraintDescriptor _constraintDescriptor,
      Function<String, IndexDescriptor> _functionLisi, TokenRead _tokenRead)
      throws KernelException {

    String title = _constraintDescriptor.getName();

    String _strTrol = _laeorrltpString(_constraintDescriptor.schema(), _tokenRead);
    if (_constraintDescriptor.isIndexBackedConstraint()) {

      String _strPoete = _prrlwipeString(_constraintDescriptor.schema(), _tokenRead);

      IndexDescriptor _ibIndexDescriptor = _functionLisi.apply(title);

      String _strOtos = _bteopoString(_ibIndexDescriptor);
      if (_constraintDescriptor.isUniquenessConstraint()) {
        if (_constraintDescriptor.schema().getPropertyIds().length == 1) {
          return String
              .format(io.github.onograph.I18N.format(
                      "io.github.onograph.dbms.utils.SchemaQueryGenService.format"),
                  _esebtString(title), _strTrol,
                  _strPoete,
                  _strOtos);
        }

        return _leyuuscttseString(_ibIndexDescriptor, _constraintDescriptor, _tokenRead);
      }

      if (_constraintDescriptor.isNodeKeyConstraint()) {
        return String
            .format(io.github.onograph.I18N.format(
                    "io.github.onograph.dbms.utils.SchemaQueryGenService.format2"),
                _esebtString(title), _strTrol,
                _strPoete,
                _strOtos);
      }
    }

    int _iIp = _constraintDescriptor.schema().getPropertyId();

    String prop = _tokenRead.propertyKeyName(_iIp);
    if (_constraintDescriptor.isNodePropertyExistenceConstraint()) {
      return String.format(io.github.onograph.I18N.format(
              "io.github.onograph.dbms.utils.SchemaQueryGenService.format3"),
          _esebtString(title), _strTrol,
          _esebtString(prop));
    } else if (_constraintDescriptor.isRelationshipPropertyExistenceConstraint()) {
      return String.format(io.github.onograph.I18N.format(
              "io.github.onograph.dbms.utils.SchemaQueryGenService.format4"),
          _esebtString(title), _strTrol,
          _esebtString(prop));
    } else {

      throw new IllegalArgumentException("*** Error: 5d10aaf4-2b86-446f-83ed-ce2204d8c480");
    }
  }


  static String geidshsteString(IndexDescriptor idx, TokenRead _tokenRead)
      throws KernelException {

    String title = _esebtString(idx.getName());

    String _strSc;
    switch (idx.getIndexType()) {
      case BTREE:
        _strSc = idx.schema().entityType() == EntityType.NODE ? io.github.onograph.I18N.format(
            "io.github.onograph.dbms.utils.SchemaQueryGenService.var")
            : io.github.onograph.I18N.format(
                "io.github.onograph.dbms.utils.SchemaQueryGenService.var2");
        return String.format(_strSc, title, _laeorrltpString(idx.schema(), _tokenRead),
            _prrlwipeString(idx.schema(), _tokenRead),
            _bteopoString(idx));
      case FULLTEXT:
        _strSc = idx.schema().entityType() == EntityType.NODE ? io.github.onograph.I18N.format(
            "io.github.onograph.dbms.utils.SchemaQueryGenService.var3")
            : io.github.onograph.I18N.format(
                "io.github.onograph.dbms.utils.SchemaQueryGenService.var4");
        return String.format(_strSc, title, _lasorltsaolString(idx.schema(), _tokenRead),
            _prrlwipeString(idx.schema(), _tokenRead), _fuecnassnString(idx));
      case LOOKUP:
        _strSc = idx.schema().entityType() == EntityType.NODE ? io.github.onograph.I18N.format(
            "io.github.onograph.dbms.utils.SchemaQueryGenService.var5")
            : io.github.onograph.I18N.format(
                "io.github.onograph.dbms.utils.SchemaQueryGenService.var6");
        if ("__org_neo4j_schema_index_label_scan_store_converted_to_token_index".equals(
            idx.getName())) {
          title = SchemaRule.generateName(idx, new String[0], new String[0]);
        }

        return String.format(_strSc, title);
      default:

        throw new IllegalArgumentException("*** Error: e2fc1fc9-4397-44ef-a575-2e91c368b50e");
    }
  }
}
