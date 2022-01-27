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
package org.neo4j.kernel.impl.index.schema.config;

import org.neo4j.configuration.Config;
import org.neo4j.gis.spatial.index.curves.SpaceFillingCurve;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.values.storable.CoordinateReferenceSystem;
import org.neo4j.values.storable.PointValue;
import org.neo4j.values.storable.Values;

import static org.assertj.core.api.Assertions.assertThat;

public class SpatialIndexValueTestUtil
{
    public static Pair<PointValue,PointValue> pointsWithSameValueOnSpaceFillingCurve( Config config )
    {
        ConfiguredSpaceFillingCurveSettingsCache configuredCache = new ConfiguredSpaceFillingCurveSettingsCache( config );
        SpaceFillingCurveSettings spaceFillingCurveSettings = configuredCache.forCRS( CoordinateReferenceSystem.WGS84 );
        SpaceFillingCurve curve = spaceFillingCurveSettings.curve();
        double[] origin = {0.0, 0.0};
        Long spaceFillingCurveMapForOrigin = curve.derivedValueFor( origin );
        double[] centerPointForOriginTile = curve.centerPointFor( spaceFillingCurveMapForOrigin );
        PointValue originValue = Values.pointValue( CoordinateReferenceSystem.WGS84, origin );
        PointValue centerPointValue = Values.pointValue( CoordinateReferenceSystem.WGS84, centerPointForOriginTile );
        assertThat( origin ).as( "need non equal points for this test" ).isNotEqualTo( centerPointValue );
        return Pair.of( originValue, centerPointValue );
    }
}
