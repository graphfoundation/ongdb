package io.github.onograph.dbms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.NotFoundException;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.store.MetaDataStore;
import org.neo4j.storageengine.api.StoreId;


public class SystemGraphDbmsModelClusterImpl extends DefaultSystemGraphDbmsModel {


  public static final String DENSR = io.github.onograph.TokenConstants.DESIGNATED_SEEDER;


  public static final String DST_CRAO_LTM = io.github.onograph.TokenConstants.STORE_CREATION_TIME;


  public static final String DST_RAD_UID = io.github.onograph.TokenConstants.STORE_RANDOM_ID;


  public static final String DST_VX = io.github.onograph.TokenConstants.STORE_VERSION;


  public static final String INTLRR = io.github.onograph.TokenConstants.INITIAL_MEMBERS;

  public SystemGraphDbmsModelClusterImpl(
      Supplier<GraphDatabaseService> _supplierDsGraphDatabaseService) {
    super(_supplierDsGraphDatabaseService);
  }


  public static void clceppeForGr(GraphDatabaseService _sseGraphDatabaseService) {

    Transaction _tTransaction = _sseGraphDatabaseService.beginTx();

    try {

      ResourceIterator _idResourceIterator = _tTransaction.findNodes(DATABASE_LABEL);

      try {
        while (_idResourceIterator.hasNext()) {

          Node _dtbsNode = (Node) _idResourceIterator.next();
          _dtbsNode.removeProperty(io.github.onograph.TokenConstants.INITIAL_MEMBERS);
          _dtbsNode.removeProperty(io.github.onograph.TokenConstants.STORE_CREATION_TIME);
          _dtbsNode.removeProperty(io.github.onograph.TokenConstants.STORE_RANDOM_ID);
          _dtbsNode.removeProperty(io.github.onograph.TokenConstants.STORE_VERSION);
          _dtbsNode.removeProperty(io.github.onograph.TokenConstants.DESIGNATED_SEEDER);
        }
      } catch (

          Throwable _throwable) {
        if (_idResourceIterator != null) {
          try {
            _idResourceIterator.close();
          } catch (

              Throwable _throwable2) {
            _throwable.addSuppressed(_throwable2);
          }
        }

        throw _throwable;
      }

      if (_idResourceIterator != null) {
        _idResourceIterator.close();
      }

      _tTransaction.commit();
    } catch (

        Throwable _throwable3) {
      if (_tTransaction != null) {
        try {
          _tTransaction.close();
        } catch (

            Throwable _throwable4) {
          _throwable3.addSuppressed(_throwable4);
        }
      }

      throw _throwable3;
    }

    if (_tTransaction != null) {
      _tTransaction.close();
    }
  }


  private Node _daasnoNode(NamedDatabaseId _namedDatabaseId, Transaction _tTransaction) {
    return Optional.ofNullable(
            _tTransaction.findNode(DATABASE_LABEL, io.github.onograph.TokenConstants.UUID,
                _namedDatabaseId.databaseId().uuid().toString()))
        .or(() ->
        {
          return Optional
              .ofNullable(
                  _tTransaction.findNode(
                      DELETED_DATABASE_LABEL, io.github.onograph.TokenConstants.UUID,
                      _namedDatabaseId
                          .databaseId()
                          .uuid()
                          .toString()));
        }).orElseThrow(() ->
        {
          return new IllegalStateException("*** Error: 28c1c18a-eabe-45ff-b2b6-a9be51509359");
        });
  }


  public Optional<ServerId> densrOptional(NamedDatabaseId _namedDatabaseId) {

    Transaction _tTransaction = this.supplierSytdasGraphDatabaseService.get().beginTx();

    Optional _optional;
    try {

      Node _node = this._daasnoNode(_namedDatabaseId, _tTransaction);

      String _strUsd = (String) _node.getProperty(
          io.github.onograph.TokenConstants.DESIGNATED_SEEDER, null);
      _optional = Optional.ofNullable(_strUsd).map(UUID::fromString).map(ServerId::new);
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

    return _optional;
  }


  public Set<ServerId> geirSet(NamedDatabaseId _namedDatabaseId) {
    try {

      Transaction _tTransaction = this.supplierSytdasGraphDatabaseService.get().beginTx();

      Set _set;
      try {

        Node _node = this._daasnoNode(_namedDatabaseId, _tTransaction);

        String[] _strSiArray = (String[]) _node.getProperty(
            io.github.onograph.TokenConstants.INITIAL_MEMBERS);
        _set = Arrays.stream(_strSiArray).map(UUID::fromString).map(ServerId::new)
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
    } catch (

        NotFoundException _notFoundException) {
      return Collections.emptySet();
    }
  }


  public StoreId gesridStoreId(NamedDatabaseId _namedDatabaseId) {

    Transaction _tTransaction = this.supplierSytdasGraphDatabaseService.get().beginTx();

    StoreId _storeId;
    try {

      Node _node = this._daasnoNode(_namedDatabaseId, _tTransaction);

      long _lgTc = (Long) _node.getProperty(io.github.onograph.TokenConstants.STORE_CREATION_TIME);

      long _lgRi = (Long) _node.getProperty(io.github.onograph.TokenConstants.STORE_RANDOM_ID);

      String _strVs = (String) _node.getProperty(io.github.onograph.TokenConstants.STORE_VERSION);
      _storeId = new StoreId(_lgTc, _lgRi, MetaDataStore.versionStringToLong(_strVs));
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

    return _storeId;
  }
}
