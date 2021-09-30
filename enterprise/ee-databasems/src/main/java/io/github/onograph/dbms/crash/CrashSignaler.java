package io.github.onograph.dbms.crash;


@FunctionalInterface
public interface CrashSignaler {


  void signal(CrashEvent _crashEvent);


  interface CauseInfo {


    String getInfo();
  }


  interface CrashEvent {


    Throwable gecsThrowable();


    CauseInfo gersCrashSignalerCauseInfo();
  }
}
