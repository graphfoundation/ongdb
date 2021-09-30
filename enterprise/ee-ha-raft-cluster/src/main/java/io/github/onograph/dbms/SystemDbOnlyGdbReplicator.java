package io.github.onograph.dbms;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.neo4j.function.ThrowingConsumer;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class SystemDbOnlyGdbReplicator implements GdbReplicator {


  private final List<io.github.onograph.dbms.GdbReplicator.ListenEvents> listLseesListenEvents = new CopyOnWriteArrayList();


  private final Log log;

  public SystemDbOnlyGdbReplicator(LogProvider _logProvider) {
    this.log = _logProvider.getLog(this.getClass());
  }


  private void _astsdasForNa(NamedDatabaseId _namedDatabaseId) {
    if (!_namedDatabaseId.isSystemDatabase()) {

      throw new IllegalArgumentException("*** Error: c27aded3-760c-4bea-92e3-636c29149e19");
    }
  }


  private void _dipcevtForTh(
      ThrowingConsumer<io.github.onograph.dbms.GdbReplicator.ListenEvents, Exception> _throwingConsumerAtoge) {
    this.listLseesListenEvents.forEach((listener) ->
    {
      try {
        _throwingConsumerAtoge.accept(listener);
      } catch (

          Exception _exception) {

      }
    });
  }

  @Override
  public io.github.onograph.dbms.GdbReplicator.FireEvents gedteetdaGdbReplicatorFireEvents(
      NamedDatabaseId _namedDatabaseId) {
    return !_namedDatabaseId.isSystemDatabase() ? NO_EVX_DIPC
        : new io.github.onograph.dbms.GdbReplicator.FireEvents() {
          @Override
          public void fitrcct(long transIdx) {
            SystemDbOnlyGdbReplicator.this._dipcevtForTh((listener) ->
            {
              listener.tranci(transIdx);
            });
          }

          @Override
          public void ftree(long transIdx) {
            SystemDbOnlyGdbReplicator.this._dipcevtForTh((listener) ->
            {
              listener.strread(transIdx);
            });
          }
        };
  }

  @Override
  public void retlsrForNaGd(io.github.onograph.dbms.GdbReplicator.ListenEvents _lseeListenEvents,
      NamedDatabaseId _namedDatabaseId) {
    this._astsdasForNa(_namedDatabaseId);
    this.listLseesListenEvents.add(_lseeListenEvents);
  }

  @Override
  public void unilnForNaGd(io.github.onograph.dbms.GdbReplicator.ListenEvents _lseeListenEvents,
      NamedDatabaseId _namedDatabaseId) {
    this._astsdasForNa(_namedDatabaseId);
    this.listLseesListenEvents.remove(_lseeListenEvents);
  }
}
