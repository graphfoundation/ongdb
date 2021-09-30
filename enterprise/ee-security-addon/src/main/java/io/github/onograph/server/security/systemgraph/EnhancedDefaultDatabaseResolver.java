package io.github.onograph.server.security.systemgraph;

import com.github.benmanes.caffeine.cache.Cache;
import java.util.function.Supplier;
import org.neo4j.configuration.Config;
import org.neo4j.cypher.internal.cache.CaffeineCacheFactory;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.NotFoundException;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.event.TransactionData;
import org.neo4j.server.security.systemgraph.CommunityDefaultDatabaseResolver;


public class EnhancedDefaultDatabaseResolver extends CommunityDefaultDatabaseResolver
    implements io.github.onograph.dbms.GdbReplicator.ListenEvents {


  private static final String HOM_GDB_PX = io.github.onograph.TokenConstants.HOME_DATABASE;


  private static final int STD_GDB_CAH_SIZ = 1000;


  private final Cache<String, String> cacheCcess;


  private final Supplier<GraphDatabaseService> supplierSdsGraphDatabaseService;


  private GraphDatabaseService sdGraphDatabaseService;


  public EnhancedDefaultDatabaseResolver(CaffeineCacheFactory _caffeineCacheFactory, Config _config,
      Supplier<GraphDatabaseService> _supplierSdsGraphDatabaseService) {
    super(_config, _supplierSdsGraphDatabaseService);
    this.supplierSdsGraphDatabaseService = _supplierSdsGraphDatabaseService;
    this.cacheCcess = _caffeineCacheFactory.createCache(1000);
  }


  private GraphDatabaseService _gestdGraphDatabaseService() {
    if (this.sdGraphDatabaseService == null) {
      this.sdGraphDatabaseService = this.supplierSdsGraphDatabaseService.get();
    }

    return this.sdGraphDatabaseService;
  }

  @Override
  public void afterCommit(TransactionData _transactionData, Object _obSae,
      GraphDatabaseService _graphDatabaseService) {
    this.clearCache();
  }

  @Override
  public void clearCache() {
    this.cacheCcess.invalidateAll();
    super.clearCache();
  }

  @Override
  public String defaultDatabase(String uname) {
    return uname != null && !uname.isBlank() ? this.cacheCcess.get(uname, (u) ->
    {

      String defGdbName = "";

      try {

        Transaction _tTransaction = this._gestdGraphDatabaseService().beginTx();

        try {

          Node _useNode = _tTransaction.findNode(
              Label.label(io.github.onograph.TokenConstants.USER2),
              io.github.onograph.TokenConstants.NAME, u);
          if (_useNode != null) {

            String _strDh = (String) _useNode.getProperty(
                io.github.onograph.TokenConstants.HOME_DATABASE, null);
            defGdbName = _strDh != null ? _strDh : super.defaultDatabase(u);
          } else {
            defGdbName = super.defaultDatabase(u);
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
      } catch (

          NotFoundException _notFoundException) {
        defGdbName = super.defaultDatabase(u);
      }

      return defGdbName;
    }) : super.defaultDatabase(uname);
  }

  @Override
  public void strread(long transIdx) {
    this.clearCache();
  }

  @Override
  public void tranci(long transIdx) {
    this.clearCache();
  }
}
