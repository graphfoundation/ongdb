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
package org.neo4j.internal.batchimport.staging;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.neo4j.internal.batchimport.Configuration;
import org.neo4j.internal.batchimport.stats.Keys;
import org.neo4j.internal.helpers.collection.Pair;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.neo4j.internal.batchimport.staging.ControlledStep.stepWithAverageOf;

class StageExecutionTest
{
    @Test
    void shouldOrderStepsAscending()
    {
        // GIVEN
        Collection<Step<?>> steps = new ArrayList<>();
        steps.add( stepWithAverageOf( "step1", 0, 10 ) );
        steps.add( stepWithAverageOf( "step2", 0, 5 ) );
        steps.add( stepWithAverageOf( "step3", 0, 30 ) );
        StageExecution execution = new StageExecution( "Test", null, Configuration.DEFAULT, steps, Step.ORDER_SEND_DOWNSTREAM );

        // WHEN
        Iterator<Pair<Step<?>,Float>> ordered = execution.stepsOrderedBy( Keys.avg_processing_time, true ).iterator();

        // THEN
        Pair<Step<?>,Float> fastest = ordered.next();
        assertEquals( 1f / 2f, fastest.other(), 0f );
        Pair<Step<?>,Float> faster = ordered.next();
        assertEquals( 1f / 3f, faster.other(), 0f );
        Pair<Step<?>,Float> fast = ordered.next();
        assertEquals( 1f, fast.other(), 0f );
        assertFalse( ordered.hasNext() );
    }

    @Test
    void shouldOrderStepsDescending()
    {
        // GIVEN
        Collection<Step<?>> steps = new ArrayList<>();
        steps.add( stepWithAverageOf( "step1", 0, 10 ) );
        steps.add( stepWithAverageOf( "step2", 0, 5 ) );
        steps.add( stepWithAverageOf( "step3", 0, 30 ) );
        steps.add( stepWithAverageOf( "step4", 0, 5 ) );
        StageExecution execution = new StageExecution( "Test", null, Configuration.DEFAULT, steps, Step.ORDER_SEND_DOWNSTREAM );

        // WHEN
        Iterator<Pair<Step<?>,Float>> ordered = execution.stepsOrderedBy( Keys.avg_processing_time, false ).iterator();

        // THEN
        Pair<Step<?>,Float> slowest = ordered.next();
        assertEquals( 3f, slowest.other(), 0f );
        Pair<Step<?>,Float> slower = ordered.next();
        assertEquals( 2f, slower.other(), 0f );
        Pair<Step<?>,Float> slow = ordered.next();
        assertEquals( 1f, slow.other(), 0f );
        Pair<Step<?>,Float> alsoSlow = ordered.next();
        assertEquals( 1f, alsoSlow.other(), 0f );
        assertFalse( ordered.hasNext() );
    }
}
