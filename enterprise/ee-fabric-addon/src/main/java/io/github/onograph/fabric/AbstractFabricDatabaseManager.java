package io.github.onograph.fabric;

import io.github.onograph.config.EnterpriseFabricConfiguration;
import java.util.UUID;
import java.util.function.Function;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.SystemGraphDbmsModel;
import org.neo4j.fabric.FabricDatabaseManager;
import org.neo4j.graphdb.ConstraintViolationException;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public abstract class AbstractFabricDatabaseManager extends FabricDatabaseManager {

  AbstractFabricDatabaseManager(DatabaseManager<DatabaseContext> _databaseManagerMdDatabaseContext,
      EnterpriseFabricConfiguration _enterpriseFabricConfiguration) {
    super(_enterpriseFabricConfiguration, _databaseManagerMdDatabaseContext);
  }


  public static class MultiFabricDatabaseManager extends AbstractFabricDatabaseManager {

    public MultiFabricDatabaseManager(
        DatabaseManager<DatabaseContext> _databaseManagerMdDatabaseContext,
        EnterpriseFabricConfiguration _enterpriseFabricConfiguration) {
      super(_databaseManagerMdDatabaseContext, _enterpriseFabricConfiguration);
    }

    @Override
    public boolean isFabricDatabase(String _strRnd) {
      return false;
    }

    @Override
    public boolean isFabricDatabasePresent() {
      return false;
    }

    @Override
    public void manageFabricDatabases(GraphDatabaseService _sseGraphDatabaseService,
        boolean _isUdt) {
    }
  }


  public static class StandardFabricDatabaseManager extends AbstractFabricDatabaseManager {


    private final EnterpriseFabricConfiguration enterpriseFabricConfiguration;


    private final Log log;


    public StandardFabricDatabaseManager(
        DatabaseManager<DatabaseContext> _databaseManagerMdDatabaseContext,
        EnterpriseFabricConfiguration _enterpriseFabricConfiguration, LogProvider _logProvider) {
      super(_databaseManagerMdDatabaseContext, _enterpriseFabricConfiguration);
      this.enterpriseFabricConfiguration = _enterpriseFabricConfiguration;
      this.log = _logProvider.getLog(this.getClass());
    }


    private boolean _isChcextgForTr(Transaction _tTransaction) {

      Function<ResourceIterator<Node>, Boolean> _functionIeaorb = (nodes) ->
      {

        boolean _isFud = false;

        while (true) {
          while (nodes.hasNext()) {

            Node _dfNode = nodes.next();

            Object gdbName = _dfNode.getProperty(io.github.onograph.TokenConstants.NAME);
            if (this.enterpriseFabricConfiguration != null
                && this.enterpriseFabricConfiguration.getGdbRef() != null &&
                this.enterpriseFabricConfiguration.getGdbRef().getTitle() != null &&
                this.enterpriseFabricConfiguration.getGdbRef().getTitle().name().equals(gdbName)) {

              _dfNode.setProperty(io.github.onograph.TokenConstants.STATUS,
                  io.github.onograph.TokenConstants.ONLINE);
              _isFud = true;
            } else {

              _dfNode.setProperty(io.github.onograph.TokenConstants.STATUS,
                  io.github.onograph.TokenConstants.OFFLINE);
            }
          }

          nodes.close();
          return _isFud;
        }
      };
      return _functionIeaorb.apply(
          _tTransaction.findNodes(SystemGraphDbmsModel.DATABASE_LABEL,
              io.github.onograph.TokenConstants.FABRIC, true));
    }


    private void _nefrdForTrNo(NormalizedDatabaseName gdbName, Transaction _tTransaction) {
      try {

        Node _node = _tTransaction.createNode(SystemGraphDbmsModel.DATABASE_LABEL);
        _node.setProperty(io.github.onograph.TokenConstants.NAME, gdbName.name());
        _node.setProperty(io.github.onograph.TokenConstants.UUID, UUID.randomUUID().toString());
        _node.setProperty(io.github.onograph.TokenConstants.STATUS,
            io.github.onograph.TokenConstants.ONLINE);
        _node.setProperty(io.github.onograph.TokenConstants.DEFAULT, false);
        _node.setProperty(io.github.onograph.TokenConstants.FABRIC, true);
      } catch (

          ConstraintViolationException _constraintViolationException) {

        throw new IllegalStateException("*** Error: 575e90b0-92ee-4139-9953-c1081430899f");
      }
    }

    @Override
    public boolean isFabricDatabase(String _strRnd) {

      NormalizedDatabaseName gdbName = new NormalizedDatabaseName(_strRnd);
      return this.isFabricDatabasePresent() && this.enterpriseFabricConfiguration.getGdbRef()
          .getTitle().equals(gdbName);
    }

    @Override
    public boolean isFabricDatabasePresent() {
      return this.enterpriseFabricConfiguration.getGdbRef() != null;
    }

    @Override
    public void manageFabricDatabases(GraphDatabaseService _sseGraphDatabaseService,
        boolean _isUdt) {

      Transaction _tTransaction = _sseGraphDatabaseService.beginTx();

      try {

        boolean _isEit = false;
        if (_isUdt) {
          _isEit = this._isChcextgForTr(_tTransaction);
        }

        if (this.enterpriseFabricConfiguration.getGdbRef() != null) {

          NormalizedDatabaseName gdbName = this.enterpriseFabricConfiguration.getGdbRef()
              .getTitle();
          if (_isEit) {

          } else {

            this._nefrdForTrNo(gdbName, _tTransaction);
          }
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
    }
  }
}
