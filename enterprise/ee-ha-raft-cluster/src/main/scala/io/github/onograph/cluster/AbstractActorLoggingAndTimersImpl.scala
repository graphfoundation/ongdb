package io.github.onograph.cluster

import akka.actor.{AbstractActorWithTimers, ActorLogging}

abstract class AbstractActorLoggingAndTimersImpl
  extends AbstractActorWithTimers
    with ActorLogging {}
