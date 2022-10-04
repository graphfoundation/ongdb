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
package org.neo4j.kernel.impl.index.schema.config;

import org.neo4j.configuration.Config;
import org.neo4j.gis.spatial.index.curves.PartialOverlapConfiguration;
import org.neo4j.gis.spatial.index.curves.SpaceFillingCurveConfiguration;
import org.neo4j.gis.spatial.index.curves.StandardConfiguration;

/**
 * <p>
 * This factory can be used to create new space filling curve settings for use in configuring the curves.
 * These settings can be created either by defaults from the ongdb.conf file (see ConfiguredSpaceFullCurveSettingsCache)
 * or from reading the header of an existing GBPTree based index.
 */
public final class SpaceFillingCurveSettingsFactory
{
    private SpaceFillingCurveSettingsFactory()
    {
    }

    /**
     * This method builds the default index configuration object for the specified CRS and other config options.
     * Currently we only support a SingleSpaceFillingCurveSettings which is the best option for cartesian, but
     * not necessarily the best for geographic coordinate systems.
     */
    static SpaceFillingCurveSettings fromConfig( EnvelopeSettings envelopeSettings )
    {
        // Currently we support only one type of index, but in future we could support different types for different CRS
        return new SpaceFillingCurveSettings( envelopeSettings.getCrs().getDimension(), envelopeSettings.asEnvelope() );
    }

    /**
     * Extracts settings from {@link Config} about how to optimize the 2D (or 3D) to 1D mapping of the space filling curve which will be
     * used when querying geometry ranges.
     *
     * @param config {@link Config} containing space filling curve settings.
     * @return {@link SpaceFillingCurveConfiguration} from the settings found in {@link Config}.
     */
    public static SpaceFillingCurveConfiguration getConfiguredSpaceFillingCurveConfiguration( Config config )
    {
        int extraLevels = config.get( SpatialIndexSettings.space_filling_curve_extra_levels );
        double topThreshold = config.get( SpatialIndexSettings.space_filling_curve_top_threshold );
        double bottomThreshold = config.get( SpatialIndexSettings.space_filling_curve_bottom_threshold );

        if ( topThreshold == 0.0 || bottomThreshold == 0.0 )
        {
            return new StandardConfiguration( extraLevels );
        }
        else
        {
            return new PartialOverlapConfiguration( extraLevels, topThreshold, bottomThreshold );
        }
    }
}
