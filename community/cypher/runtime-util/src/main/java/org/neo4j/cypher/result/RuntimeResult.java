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
package org.neo4j.cypher.result;

import org.neo4j.graphdb.QueryStatistics;
import org.neo4j.kernel.impl.query.QuerySubscription;
import org.neo4j.memory.HeapHighWaterMarkTracker;

/**
 * The result API of a Cypher runtime
 */
public interface RuntimeResult extends AutoCloseable, QuerySubscription, HeapHighWaterMarkTracker
{
    enum ConsumptionState
    {
        NOT_STARTED,
        HAS_MORE,
        EXHAUSTED
    }

    /**
     * Names of the returned fields of this result.
     */
    String[] fieldNames();

    /**
     * Returns the consumption state of this result. This state changes when the result is served
     */
    ConsumptionState consumptionState();

    /**
     * Get the {@link QueryStatistics} related to this query execution.
     */
    QueryStatistics queryStatistics();

    /**
     * Get the {@link QueryProfile} of this query execution.
     */
    QueryProfile queryProfile();

    @Override
    void close();
}
