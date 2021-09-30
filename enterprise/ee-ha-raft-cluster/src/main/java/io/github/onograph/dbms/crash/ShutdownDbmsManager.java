package io.github.onograph.dbms.crash;

import io.github.onograph.dbms.DbmsManagerWatchTagImpl;
import org.neo4j.internal.helpers.Exceptions;


public final class ShutdownDbmsManager implements DbmsCrashManager {


  private final DbmsManagerWatchTagImpl qoDbmsManagerWatchTagImpl;

  ShutdownDbmsManager(DbmsManagerWatchTagImpl _oqDbmsManagerWatchTagImpl) {
    this.qoDbmsManagerWatchTagImpl = _oqDbmsManagerWatchTagImpl;
  }


  public static DbmsCrashManager craDbmsCrashManager(
      DbmsManagerWatchTagImpl _qoDbmsManagerWatchTagImpl) {
    return new ShutdownDbmsManager(_qoDbmsManagerWatchTagImpl);
  }


  String gepnmsString(GdbCrashEvent _pncGdbCrashEvent) {
    return Exceptions.findCauseOrSuppressed(_pncGdbCrashEvent.casThrowable, (throwable) ->
    {
      return throwable != null && throwable.getMessage() != null;
    }).map((throwable) ->
    {

      String _strVr00 = _pncGdbCrashEvent.causeInfo.getInfo();
      return io.github.onograph.I18N.format(
          "io.github.onograph.dbms.crash.ShutdownDbmsManager.gepnmsString", _strVr00,
          throwable.getMessage());
    }).orElse(_pncGdbCrashEvent.causeInfo.getInfo());
  }

  @Override
  public void handleCrash(GdbCrashEvent _pncGdbCrashEvent) {
    this.qoDbmsManagerWatchTagImpl.stpopiForNaTh(_pncGdbCrashEvent.getNamedDatabaseId(),
        new IllegalStateException(this.gepnmsString(_pncGdbCrashEvent),
            _pncGdbCrashEvent.gecsThrowable()));
  }
}
