package io.github.onograph.cluster.raft.module.dprot.impl.stack;

import akka.actor.ActorSystem.Settings;
import akka.event.DefaultLoggingFilter;
import akka.event.EventStream;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.NullLogProvider;


public class LoggingFilterImpl implements akka.event.LoggingFilter {


  private static LogProvider logProvider = NullLogProvider.getInstance();


  private final DefaultLoggingFilter defaultLoggingFilter;

  LoggingFilterImpl(Settings _settings, EventStream _eventStream) {
    this.defaultLoggingFilter = new DefaultLoggingFilter(_settings, _eventStream);
  }


  static void enbForLo(LogProvider _logProvider) {
    LoggingFilterImpl.logProvider = _logProvider;
  }

  @Override
  public boolean isDebugEnabled(Class<?> _classLcObject, String _strSl) {
    return this.defaultLoggingFilter.isDebugEnabled(_classLcObject, _strSl) && logProvider.getLog(
        _classLcObject).isDebugEnabled();
  }

  @Override
  public boolean isErrorEnabled(Class<?> _classClObject, String _strSl) {
    return this.defaultLoggingFilter.isErrorEnabled(_classClObject, _strSl);
  }

  @Override
  public boolean isInfoEnabled(Class<?> _classClObject, String _strSl) {
    return this.defaultLoggingFilter.isInfoEnabled(_classClObject, _strSl);
  }

  @Override
  public boolean isWarningEnabled(Class<?> _classLcObject, String _strLs) {
    return this.defaultLoggingFilter.isWarningEnabled(_classLcObject, _strLs);
  }
}
