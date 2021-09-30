package io.github.onograph.dbms.crash;


@Deprecated
@FunctionalInterface
public interface GdbCrashSender {


  void initiate(GdbCrashCauseInfo _gdbCrashCauseInfo, Throwable _throwable);
}
