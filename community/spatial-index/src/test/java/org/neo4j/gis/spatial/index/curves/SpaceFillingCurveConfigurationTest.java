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
package org.neo4j.gis.spatial.index.curves;

import org.junit.jupiter.api.Test;

import org.neo4j.gis.spatial.index.Envelope;

import static org.assertj.core.api.Assertions.assertThat;

class SpaceFillingCurveConfigurationTest
{
    @Test
    void shouldHandleMaxDepthWithEmptySearchArea()
    {
        SpaceFillingCurveConfiguration standardConfiguration = new StandardConfiguration();
        SpaceFillingCurveConfiguration partialOverlapConf = new PartialOverlapConfiguration();
        // search area is a line, thus having a search area = 0
        Envelope search = new Envelope( -180, -180, -90, 90 );
        Envelope range = new Envelope( -180, 180, -90, 90 );
        // We pad the line to a small area, but we don't expect to go deeper than level 20
        // which would take too long
        int maxLevel = 20;
        assertThat( partialOverlapConf.maxDepth( search, range, 2, 30 ) ).isLessThan( maxLevel );
        assertThat( standardConfiguration.maxDepth( search, range, 2, 30 ) ).isLessThan( maxLevel );
    }

    @Test
    void shouldReturnMaxDepth1WithWholeSearchArea()
    {
        SpaceFillingCurveConfiguration standardConfiguration = new StandardConfiguration();
        SpaceFillingCurveConfiguration partialOverlapConf = new PartialOverlapConfiguration();
        // search area is a line, thus having a search area = 0
        Envelope range = new Envelope( -180, 180, -90, 90 );
        assertThat( partialOverlapConf.maxDepth( range, range, 2, 30 ) ).isEqualTo( 1 );
        assertThat( standardConfiguration.maxDepth( range, range, 2, 30 ) ).isEqualTo( 1 );
    }

    @Test
    void shouldReturnMaxDepth2WithQuarterOfWholeArea()
    {
        SpaceFillingCurveConfiguration standardConfiguration = new StandardConfiguration();
        SpaceFillingCurveConfiguration partialOverlapConf = new PartialOverlapConfiguration();
        // search area is a line, thus having a search area = 0
        Envelope range = new Envelope( -180, 180, -90, 90 );
        Envelope search = new Envelope( 0, 180, 0, 90 );
        assertThat( partialOverlapConf.maxDepth( search, range, 2, 30 ) ).isEqualTo( 2 );
        assertThat( standardConfiguration.maxDepth( search, range, 2, 30 ) ).isEqualTo( 2 );
    }

    @Test
    void shouldReturnAppropriateDepth()
    {
        final int maxLevel = 30;
        for ( int i = 0; i < maxLevel; i++ )
        {
            SpaceFillingCurveConfiguration standardConfiguration = new StandardConfiguration();
            SpaceFillingCurveConfiguration partialOverlapConf = new PartialOverlapConfiguration();
            // search area is a line, thus having a search area = 0
            Envelope range = new Envelope( 0, 1, 0, 1 );
            Envelope search = new Envelope( 0, Math.pow( 2, -i ), 0, Math.pow( 2, -i ) );
            assertThat( partialOverlapConf.maxDepth( search, range, 2, maxLevel ) ).isEqualTo( i + 1 );
            assertThat( standardConfiguration.maxDepth( search, range, 2, maxLevel ) ).isEqualTo( i + 1 );
        }
    }
}
