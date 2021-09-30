package io.github.onograph.dbms.crash;


public final class DbmsCrashManagerSystemGdbImpl implements DbmsCrashManager {


  private final CrashSignaler crashSignaler;

  DbmsCrashManagerSystemGdbImpl(CrashSignaler crashSignaler) {
    this.crashSignaler = crashSignaler;
  }


  public static DbmsCrashManager craDbmsCrashManager(CrashSignaler crashSignaler) {
    return new DbmsCrashManagerSystemGdbImpl(crashSignaler);
  }

  @Override
  public void handleCrash(GdbCrashEvent _pncGdbCrashEvent) {
    if (_pncGdbCrashEvent.getNamedDatabaseId().isSystemDatabase()) {
      this.crashSignaler.signal(
          new SysCrashEvent(_pncGdbCrashEvent.gecsThrowable(), SysCrashCauseInfo.CCI_SGDB_ERR));
    }
  }
}
