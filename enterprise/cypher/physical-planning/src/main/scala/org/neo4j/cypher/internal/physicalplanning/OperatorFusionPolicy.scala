/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.cypher.internal.physicalplanning

import org.neo4j.cypher.internal.logical.plans.LogicalPlan

sealed trait OperatorFusionPolicy {
  def fusionEnabled: Boolean

  def fusionOverPipelineEnabled: Boolean

  def canFuse(lp: LogicalPlan): Boolean

  def canFuseOverPipeline(lp: LogicalPlan): Boolean
}

object OperatorFusionPolicy {
  def apply(fusionEnabled: Boolean, fusionOverPipelinesEnabled: Boolean): OperatorFusionPolicy = {
    null
  }

  case object OPERATOR_FUSION_DISABLED extends OperatorFusionPolicy {
    override def canFuse(lp: LogicalPlan): Boolean = {
      false
    }

    override def canFuseOverPipeline(lp: LogicalPlan): Boolean = {
      false
    }

    override def fusionEnabled: Boolean = {
      false
    }

    override def fusionOverPipelineEnabled: Boolean = {
      false
    }
  }

  case object OPERATOR_FUSION_OVER_PIPELINES extends OperatorFusionPolicy {
    override def fusionEnabled: Boolean = {
      false
    }

    override def fusionOverPipelineEnabled: Boolean = {
      false
    }

    override def canFuse(lp: LogicalPlan): Boolean = {
      false
    }

    override def canFuseOverPipeline(lp: LogicalPlan): Boolean = {
      false
    }
  }

  case object OPERATOR_FUSION_WITHIN_PIPELINE extends OperatorFusionPolicy {
    override def fusionEnabled: Boolean = {
      false
    }

    override def fusionOverPipelineEnabled: Boolean = {
      false
    }

    override def canFuse(lp: LogicalPlan): Boolean = {
      false
    }

    override def canFuseOverPipeline(lp: LogicalPlan): Boolean = {
      false
    }
  }

}
