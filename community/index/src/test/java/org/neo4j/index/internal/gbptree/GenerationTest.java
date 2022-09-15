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
package org.neo4j.index.internal.gbptree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerationTest
{
    @Test
    void shouldSetLowGenerations()
    {
        shouldComposeAndDecomposeGeneration( GenerationSafePointer.MIN_GENERATION, GenerationSafePointer.MIN_GENERATION + 1 );
    }

    @Test
    void shouldSetHighGenerations()
    {
        shouldComposeAndDecomposeGeneration( GenerationSafePointer.MAX_GENERATION - 1, GenerationSafePointer.MAX_GENERATION );
    }

    private static void shouldComposeAndDecomposeGeneration( long stable, long unstable )
    {
        // WHEN
        long generation = Generation.generation( stable, unstable );
        long readStable = Generation.stableGeneration( generation );
        long readUnstable = Generation.unstableGeneration( generation );

        // THEN
        assertEquals( stable, readStable );
        assertEquals( unstable, readUnstable );
    }
}
