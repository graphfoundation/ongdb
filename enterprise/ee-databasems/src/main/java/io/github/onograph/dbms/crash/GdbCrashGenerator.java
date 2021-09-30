package io.github.onograph.dbms.crash;

import io.github.onograph.config.MainSettings;
import org.neo4j.configuration.Config;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;


public interface GdbCrashGenerator {


  static GdbCrashGenerator bulfoGdbCrashGenerator(Config _config, LogService _logService) {
    return _config.get(MainSettings.settingShodaBoolean) ? new ShutdownGdbCrashGenerator(
        _logService) : new ErrorReportingGdbCrashGenerator(_logService);
  }


  void paiForSy(SysCrashEvent _sysCrashEvent);


  abstract class AbstractGdbCrashGenerator implements GdbCrashGenerator {


    protected final Log deuLog;


    protected final Log useLog;

    private AbstractGdbCrashGenerator(LogService _logService) {
      this.useLog = _logService.getUserLog(this.getClass());
      this.deuLog = _logService.getInternalLog(this.getClass());
    }
  }


  class ErrorReportingGdbCrashGenerator extends AbstractGdbCrashGenerator {

    private ErrorReportingGdbCrashGenerator(LogService _logService) {
      super(_logService);
    }

    @Override
    public void paiForSy(SysCrashEvent _pncSysCrashEvent) {

    }
  }


  class ShutdownGdbCrashGenerator extends AbstractGdbCrashGenerator {

    private ShutdownGdbCrashGenerator(LogService _logService) {
      super(_logService);
    }

    @Override
    public void paiForSy(SysCrashEvent _pncSysCrashEvent) {

      System.exit(_pncSysCrashEvent.getICe());
    }
  }
}
