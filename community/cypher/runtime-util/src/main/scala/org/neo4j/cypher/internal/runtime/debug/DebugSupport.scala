/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypher.internal.runtime.debug

object DebugSupport {

  /** DEBUG CONFIGURATION **/

  final val DEBUG_PHYSICAL_PLANNING = false
  final val DEBUG_TIMELINE = false
  final val DEBUG_WORKERS = false
  final val DEBUG_QUERIES = false
  final val DEBUG_TRACKER = false
  final val DEBUG_LOCKS = false
  final val DEBUG_ERROR_HANDLING = false
  final val DEBUG_CURSORS = false
  final val DEBUG_BUFFERS = false
  final val DEBUG_SCHEDULING = false
  final val DEBUG_ASM = false
  final val DEBUG_PIPELINES = false
  final val DEBUG_GENERATED_SOURCE_CODE = false

  /** LOGS */

  final val PHYSICAL_PLANNING = new DebugLog(DEBUG_PHYSICAL_PLANNING, "")
  final val TIMELINE = new DebugTimeline(DEBUG_TIMELINE)
  final val WORKERS = new DebugLog(DEBUG_WORKERS, "")
  final val QUERIES = new DebugLog(DEBUG_QUERIES, "")
  final val TRACKER = new DebugLog(DEBUG_TRACKER, Yellow)
  final val LOCKS = new DebugLog(DEBUG_LOCKS, Blue)
  final val ERROR_HANDLING = new DebugLog(DEBUG_ERROR_HANDLING, Red)
  final val CURSORS = new DebugLog(DEBUG_CURSORS, "")
  final val BUFFERS = new DebugLog(DEBUG_BUFFERS, Magenta)
  final val SCHEDULING = new DebugLog(DEBUG_SCHEDULING, Cyan)
  final val ASM = new DebugLog(DEBUG_ASM, "")

  /** COLORS AND FORMATTING **/

  final val Black   = "\u001b[30m"
  final val Red     = "\u001b[31m"
  final val Green   = "\u001b[32m"
  final val Yellow  = "\u001b[33m"
  final val Blue    = "\u001b[34m"
  final val Magenta = "\u001b[35m"
  final val Cyan    = "\u001b[36m"
  final val White   = "\u001b[37m"

  final val Bold      = "\u001b[1m"
  final val Underline = "\u001b[4m"
  final val Reversed  = "\u001b[7m"

  final val Reset   = "\u001b[0m"

  /** TOOLING **/

  def logPipelines(rows: => Seq[String]): Unit = {
    if (DEBUG_PIPELINES) {
      for (row <- rows) {
        print(s"       || $row\n")
      }
    }
  }

  final class DebugLog(private[this] val enabled: Boolean, val color: String) {

    // Not using println because that is synchronized and can hide
    // parallel problems.
    def log(str: String): Unit = {
      if (enabled) {
        print(s"        $color$str$Reset\n")
      }
    }

    def log(str: String, x: Any): Unit =
      if (enabled) {
        log(str.format(x))
      }

    def log(str: String, x1: Any, x2: Any): Unit =
      if (enabled) {
        log(str.format(x1, x2))
      }

    def log(str: String, x1: Any, x2: Any, x3: Any): Unit =
      if (enabled) {
        log(str.format(x1, x2, x3))
      }

    def log(throwable: Throwable): Unit = {
      if(enabled) {
        throwable.printStackTrace()
      }
    }
  }

  final class DebugTimeline(private[this] val enabled: Boolean) {

    private var t0: Long = 0L
    private var tn: Long = 0L

    def beginTime(): Unit =
      if (enabled) {
        println("")
        println("            ~= BEGINNING OF TIME =~")
        t0 = System.currentTimeMillis()
        log("")
      }

    def log(str: String): Unit =
      if (enabled) {
        tn = System.currentTimeMillis()
        println("[%6d ms] %s".format(tn - t0, str))
      }

    def log(str: String, x: Any): Unit =
      if (enabled) {
        tn = System.currentTimeMillis()
        println("[%6d ms] %s".format(tn - t0, str.format(x)))
      }

    def log(str: String, x1: Any, x2: Any): Unit =
      if (enabled) {
        tn = System.currentTimeMillis()
        println("[%6d ms] %s".format(tn - t0, str.format(x1, x2)))
      }

    def log(str: String, x1: Any, x2: Any, x3: Any): Unit =
      if (enabled) {
        tn = System.currentTimeMillis()
        println("[%6d ms] %s".format(tn - t0, str.format(x1, x2, x3)))
      }

    def logDiff(str: String): Unit =
      if (enabled) {
        val tPrev = tn
        tn = System.currentTimeMillis()
        println("     %+4d ms: %s".format(tn - tPrev, str))
      }
  }
}
