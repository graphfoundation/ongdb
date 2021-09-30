package io.github.onograph.dbms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.neo4j.dbms.OperatorState;
import org.neo4j.dbms.database.SystemGraphDbmsModel;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.kernel.database.DatabaseIdFactory;
import org.neo4j.kernel.database.NamedDatabaseId;


public class DefaultSystemGraphDbmsModel extends SystemGraphDbmsModel {


  protected final Supplier<GraphDatabaseService> supplierSytdasGraphDatabaseService;

  public DefaultSystemGraphDbmsModel(
      Supplier<GraphDatabaseService> _supplierDsGraphDatabaseService) {
    this.supplierSytdasGraphDatabaseService = _supplierDsGraphDatabaseService;
  }


  static GdbInfoWrapper upedasGdbInfoWrapper(Map<String, GdbMetaClone> _mapCretsg,
      Map<String, GdbMetaClone> _mapNesg) {

    Set<NamedDatabaseId> _setDcNamedDatabaseId = new HashSet();

    Set<NamedDatabaseId> _setDdNamedDatabaseId = new HashSet();

    Iterator _iterator = _mapNesg.entrySet().iterator();

    while (true) {
      while (true) {

        GdbMetaClone _ssGdbMetaClone;

        boolean _isUis;
        do {
          if (!_iterator.hasNext()) {
            return new GdbInfoWrapper(_setDcNamedDatabaseId, _setDdNamedDatabaseId);
          }

          Entry<String, GdbMetaClone> _entryEsg = (Entry) _iterator.next();

          String gdbName = _entryEsg.getKey();
          _ssGdbMetaClone = _entryEsg.getValue();
          _isUis = !Objects.equals(_mapCretsg.get(gdbName), _ssGdbMetaClone);
        }
        while (!_isUis);

        OperatorStateEnterpriseTypeImpl _operatorStateEnterpriseTypeImpl = _ssGdbMetaClone.getDatabaseStateEnterpriseImpl()
            .operatorState();
        if (_operatorStateEnterpriseTypeImpl != OperatorStateEnterpriseTypeImpl.SETI_D &&
            _operatorStateEnterpriseTypeImpl != OperatorStateEnterpriseTypeImpl.SETI_DD) {
          _setDcNamedDatabaseId.add(_ssGdbMetaClone.getDatabaseStateEnterpriseImpl().databaseId());
        } else {
          _setDdNamedDatabaseId.add(_ssGdbMetaClone.getDatabaseStateEnterpriseImpl().databaseId());
        }
      }
    }
  }


  private NamedDatabaseId _gedasidNamedDatabaseId(Node _node) {

    String title = (String) _node.getProperty(io.github.onograph.TokenConstants.NAME);

    UUID _uUID = UUID.fromString(
        (String) _node.getProperty(io.github.onograph.TokenConstants.UUID));
    return DatabaseIdFactory.from(title, _uUID);
  }


  private OperatorStateEnterpriseTypeImpl _gedldasaOperatorStateEnterpriseTypeImpl(Node _node) {
    return (Boolean) _node.getProperty(io.github.onograph.TokenConstants.DUMP_DATA, false)
        ? OperatorStateEnterpriseTypeImpl.SETI_DD
        : OperatorStateEnterpriseTypeImpl.SETI_D;
  }


  private String _gedtenString(Node _node) {
    return (String) _node.getProperty(io.github.onograph.TokenConstants.NAME);
  }


  private GdbMetaClone _gedtesessGdbMetaClone(boolean _isDlto, Node _node) {

    OperatorStateEnterpriseTypeImpl _soOperatorStateEnterpriseTypeImpl =
        _isDlto ? this._gedldasaOperatorStateEnterpriseTypeImpl(_node)
            : this._geolstOperatorStateEnterpriseTypeImpl(_node);

    DatabaseStateEnterpriseImpl _databaseStateEnterpriseImpl =
        new DatabaseStateEnterpriseImpl(this._gedasidNamedDatabaseId(_node),
            _soOperatorStateEnterpriseTypeImpl);

    long _lgIu = (Long) _node.getProperty(io.github.onograph.TokenConstants.UPDATE_ID, 0L);
    return new GdbMetaClone(_databaseStateEnterpriseImpl, _lgIu);
  }


  private OperatorStateEnterpriseTypeImpl _geolstOperatorStateEnterpriseTypeImpl(Node _node) {

    String _strOs = (String) _node.getProperty(io.github.onograph.TokenConstants.STATUS);

    byte _byte1 = -1;
    switch (_strOs.hashCode()) {
      case -1548612125:
        if (_strOs.equals(io.github.onograph.TokenConstants.OFFLINE)) {
          _byte1 = 1;
        }
        break;
      case -1012222381:
        if (_strOs.equals(io.github.onograph.TokenConstants.ONLINE)) {
          _byte1 = 0;
        }
    }

    switch (_byte1) {
      case 0:
        return OperatorStateEnterpriseTypeImpl.SETI_RUNNING;
      case 1:
        return OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING;
      default:

        throw new IllegalArgumentException("*** Error: db7a493d-11e4-4366-8d64-a57599831255");
    }
  }


  Map<String, GdbMetaClone> gedteseMap() {

    Map<String, GdbMetaClone> _mapDtbsssg = new HashMap();

    Transaction _tTransaction = this.supplierSytdasGraphDatabaseService.get().beginTx();

    try {

      List<Node> _listDdNode = _tTransaction.findNodes(DELETED_DATABASE_LABEL).stream()
          .collect(Collectors.toList());

      Iterator _iterator = _listDdNode.iterator();

      while (_iterator.hasNext()) {

        Node _node = (Node) _iterator.next();

        String gdbName = this._gedtenString(_node);

        GdbMetaClone _ssdGdbMetaClone = this._gedtesessGdbMetaClone(true, _node);
        _mapDtbsssg.put(gdbName, _ssdGdbMetaClone);
      }

      List<Node> _listDeNode = _tTransaction.findNodes(DATABASE_LABEL).stream()
          .collect(Collectors.toList());

      Iterator _iterator2 = _listDeNode.iterator();

      while (true) {
        if (!_iterator2.hasNext()) {
          _tTransaction.commit();
          break;
        }

        Node _node2 = (Node) _iterator2.next();

        String gdbName = this._gedtenString(_node2);

        GdbMetaClone _ssdGdbMetaClone2 = this._gedtesessGdbMetaClone(false, _node2);
        _mapDtbsssg.put(gdbName, _ssdGdbMetaClone2);
      }
    } catch (

        Throwable _throwable) {
      if (_tTransaction != null) {
        try {
          _tTransaction.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_tTransaction != null) {
      _tTransaction.close();
    }

    return _mapDtbsssg;
  }


  Set<NamedDatabaseId> geeigdbnaSet() {

    Transaction _tTransaction = this.supplierSytdasGraphDatabaseService.get().beginTx();

    Set _set;
    try {
      _set = _tTransaction.findNodes(DATABASE_LABEL).stream().map(this::_gedasidNamedDatabaseId)
          .collect(Collectors.toSet());
    } catch (

        Throwable _throwable) {
      if (_tTransaction != null) {
        try {
          _tTransaction.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_tTransaction != null) {
      _tTransaction.close();
    }

    return _set;
  }


  Optional<OperatorState> gestOptional(NamedDatabaseId _namedDatabaseId) {

    Transaction _tTransaction = this.supplierSytdasGraphDatabaseService.get().beginTx();

    Optional _rslOptional;
    try {

      String _strU = _namedDatabaseId.databaseId().uuid().toString();

      Node _dtbsNode = _tTransaction.findNode(DATABASE_LABEL,
          io.github.onograph.TokenConstants.UUID, _strU);

      Node _ddNode = _tTransaction.findNode(DELETED_DATABASE_LABEL,
          io.github.onograph.TokenConstants.UUID, _strU);
      if (_dtbsNode != null) {
        _rslOptional = Optional.of(this._geolstOperatorStateEnterpriseTypeImpl(_dtbsNode));
      } else if (_ddNode != null) {
        _rslOptional = Optional.of(this._gedldasaOperatorStateEnterpriseTypeImpl(_ddNode));
      } else {
        _rslOptional = Optional.empty();
      }

      _tTransaction.commit();
    } catch (

        Throwable _throwable) {
      if (_tTransaction != null) {
        try {
          _tTransaction.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_tTransaction != null) {
      _tTransaction.close();
    }

    return _rslOptional;
  }
}
