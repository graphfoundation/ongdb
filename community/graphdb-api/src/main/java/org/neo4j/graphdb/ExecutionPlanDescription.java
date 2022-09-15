/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.graphdb;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.neo4j.annotations.api.PublicApi;
import org.neo4j.internal.helpers.MathUtil;

/**
 * Instances describe single execution steps in a Cypher query execution plan
 *
 * Execution plans form a tree of execution steps.  Each step is described by a {@link ExecutionPlanDescription} object.
 */
@PublicApi
public interface ExecutionPlanDescription
{
    /**
     * Retrieves the name of this execution step.
     *
     * @return descriptive name for this kind of execution step
     */
    String getName();

    /**
     * Retrieves the children of this execution step.
     *
     * @return list of previous (child) execution step descriptions
     */
    List<ExecutionPlanDescription> getChildren();

    /**
     * Retrieve argument map for the associated execution step
     *
     * Valid arguments are all Java primitive values, Strings, Arrays of those, and Maps from Strings to
     * valid arguments.  Results are guaranteed to be trees (i.e. there are no cyclic dependencies among values)
     *
     * @return a map containing arguments that describe this execution step in more detail
     */
    Map<String, Object> getArguments();

    /**
     * @return the set of identifiers used in this execution step
     */
    Set<String> getIdentifiers();

    /**
     * Signifies that the query was profiled, and that statistics from the profiling can
     * {@link #getProfilerStatistics() be retrieved}.
     *
     * The <a href="https://neo4j.com/docs/developer-manual/current/cypher/execution-plans/">{@code PROFILE}</a> directive in Cypher
     * ensures the presence of profiler statistics in the plan description.
     *
     * @return true, if {@link ProfilerStatistics} are available for this execution step
     */
    boolean hasProfilerStatistics();

    /**
     * Retrieve the statistics collected from profiling this query.
     *
     * If the query was not profiled, this method will throw {@link java.util.NoSuchElementException}.
     *
     * @return profiler statistics for this execution step iff available
     * @throws java.util.NoSuchElementException iff profiler statistics are not available
     */
    ProfilerStatistics getProfilerStatistics();

    /**
     * Instances describe statistics from the profiler of a particular step in the execution plan.
     */
    interface ProfilerStatistics
    {
        /**
         * @return if the number of rows was recorded.
         */
        boolean hasRows();

        /**
         * @return number of rows processed by the associated execution step
         * @throws IllegalStateException if no time was recorded.
         */
        long getRows();

        /**
         * @return if the number of DB hits was recorded.
         */
        boolean hasDbHits();

        /**
         * @return number of database hits (potential disk accesses) caused by executing the associated execution step
         * @throws IllegalStateException if no time was recorded.
         */
        long getDbHits();

        /**
         * @return if the number page cache hits and misses and the ratio was recorded.
         */
        boolean hasPageCacheStats();

        /**
         * @return number of page cache hits caused by executing the associated execution step
         * @throws IllegalStateException if no time was recorded.
         */
        long getPageCacheHits();

        /**
         * @return number of page cache misses caused by executing the associated execution step

         * @throws IllegalStateException if no time was recorded.
         */
        long getPageCacheMisses();

        /**
         * @return the ratio of page cache hits to total number of lookups or 0 if no data is available

         * @throws IllegalStateException if no time was recorded.
         */
        default double getPageCacheHitRatio()
        {
            return MathUtil.portion( getPageCacheHits(), getPageCacheMisses() );
        }

        /**
         * @return if the time was recorded.
         */
        boolean hasTime();

        /**
         * @return amount of time spent in the associated execution step.
         * @throws IllegalStateException if no time was recorded.
         */
        long getTime();
    }
}
