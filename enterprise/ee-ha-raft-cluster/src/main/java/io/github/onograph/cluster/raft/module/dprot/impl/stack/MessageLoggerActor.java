package io.github.onograph.cluster.raft.module.dprot.impl.stack;

import akka.actor.AbstractActor;
import akka.actor.ActorSystem;
import akka.dispatch.RequiresMessageQueue;
import akka.event.LoggerMessageQueueSemantics;
import akka.event.Logging;
import akka.event.Logging.Debug;
import akka.event.Logging.Error;
import akka.event.Logging.Info;
import akka.event.Logging.InitializeLogger;
import akka.event.Logging.LogEvent;
import akka.event.Logging.Warning;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.NullLogProvider;


public class MessageLoggerActor extends AbstractActor implements
    RequiresMessageQueue<LoggerMessageQueueSemantics> {


  private static final Map<ActorSystem, LogProvider> LG_PRVE = new HashMap();


  private static LogProvider deatLogProvider = NullLogProvider.getInstance();


  static void diaeForAc(ActorSystem _actorSystem) {

    Optional<LogProvider> _optionalRmvdLogProvider = Optional.ofNullable(
        LG_PRVE.remove(_actorSystem));
    _optionalRmvdLogProvider.ifPresent((log) ->
    {

    });
  }


  static void enbForLo(LogProvider _logProvider) {
    deatLogProvider = _logProvider;
  }


  static void enbForLo(ActorSystem _actorSystem, LogProvider _logProvider) {
    LG_PRVE.put(_actorSystem, _logProvider);


  }


  private Log _gelLog(Class _lgigClass) {

    LogProvider _cniueLogProvider = LG_PRVE.get(this.getContext().system());

    LogProvider _logProvider = _cniueLogProvider == null ? deatLogProvider : _cniueLogProvider;
    return _logProvider.getLog(_lgigClass);
  }


  private String _gemseString(LogEvent _errLogEvent) {
    return _errLogEvent.message() == null ? io.github.onograph.TokenConstants.NULL
        : _errLogEvent.message().toString();
  }

  @Override
  public Receive createReceive() {
    return this.receiveBuilder().match(Error.class, (error) ->
    {

    }).match(Warning.class, (warning) ->
    {

    }).match(Info.class, (info) ->
    {

    }).match(Debug.class, (debug) ->
    {

    }).match(InitializeLogger.class, (ignored) ->
    {
      this.sender().tell(Logging.loggerInitialized(), this.self());
    }).build();
  }
}
