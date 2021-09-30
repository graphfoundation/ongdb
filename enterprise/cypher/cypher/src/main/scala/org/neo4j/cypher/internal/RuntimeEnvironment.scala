package org.neo4j.cypher.internal

import org.neo4j.internal.kernel.api.CursorFactory
import org.neo4j.kernel.lifecycle.LifeSupport
import org.neo4j.memory.MemoryTracker
import org.neo4j.scheduler.JobScheduler

class RuntimeEnvironment(
                          val cursors: CursorFactory,
                        ) {

}

object RuntimeEnvironment {
  def of(config: CypherRuntimeConfiguration, jobScheduler: JobScheduler, cursors: CursorFactory, lifeSupport: LifeSupport,
         memoryTracker: MemoryTracker): RuntimeEnvironment = {

    new RuntimeEnvironment(

      cursors,

    )

  }

}
