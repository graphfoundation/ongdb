package io.github.onograph.cluster.raft.share.calg.nltof;

import java.time.Clock;
import java.time.Duration;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;
import org.neo4j.kernel.database.NamedDatabaseId;


class ServerStatTags {


  private final Clock clock;


  private final Map<ServerId, TransferCollection<DatabaseId>> mapSsst = new ConcurrentHashMap();


  private final Duration tsDuration;


  ServerStatTags(Clock _clock, Duration _tsDuration) {
    this.clock = _clock;
    this.tsDuration = _tsDuration;
  }


  private void _dremmes() {

    Iterator _iterator = this.mapSsst.keySet().iterator();

    while (_iterator.hasNext()) {

      ServerId _serverId = (ServerId) _iterator.next();
      this.mapSsst.computeIfPresent(_serverId, (serverId, suspendedDatabases) ->
      {
        return suspendedDatabases.isEmy() ? null : suspendedDatabases;
      });
    }
  }


  public boolean isNospdForDaSe(DatabaseId _databaseId, ServerId _serverId) {

    TransferCollection<DatabaseId> _transferCollectionDsDatabaseId = this.mapSsst.get(_serverId);
    return _transferCollectionDsDatabaseId == null || !_transferCollectionDsDatabaseId.isCotnForT(
        _databaseId);
  }


  void upelForSeNa(NamedDatabaseId _namedDatabaseId, ServerId _serverId) {
    this.mapSsst.compute(_serverId, (serverId, suspendedDatabases) ->
    {
      suspendedDatabases =
          suspendedDatabases == null ? new TransferCollection(this.clock, this.tsDuration)
              : suspendedDatabases;
      suspendedDatabases.addForT(_namedDatabaseId.databaseId());
      return suspendedDatabases;
    });
    this._dremmes();
  }
}
