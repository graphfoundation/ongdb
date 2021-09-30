package io.github.onograph.dbms.crash;


@FunctionalInterface
public interface DbmsCrashManager {


  void handleCrash(GdbCrashEvent _gdbCrashEvent);
}
