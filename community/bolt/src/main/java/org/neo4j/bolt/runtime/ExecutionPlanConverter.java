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
package org.neo4j.bolt.runtime;

import org.neo4j.graphdb.ExecutionPlanDescription;
import org.neo4j.kernel.impl.util.ValueUtils;
import org.neo4j.values.virtual.ListValue;
import org.neo4j.values.virtual.ListValueBuilder;
import org.neo4j.values.virtual.MapValue;
import org.neo4j.values.virtual.MapValueBuilder;

import static org.neo4j.values.storable.Values.doubleValue;
import static org.neo4j.values.storable.Values.longValue;
import static org.neo4j.values.storable.Values.utf8Value;

/** Takes execution plans and converts them to the subset of types used in the Neo4j type system */
class ExecutionPlanConverter
{
    private ExecutionPlanConverter()
    {
    }

    public static MapValue convert( ExecutionPlanDescription plan )
    {
        boolean hasProfilerStatistics = plan.hasProfilerStatistics();
        int size = hasProfilerStatistics ? 10 : 4;
        MapValueBuilder out = new MapValueBuilder( size );
        out.add( "operatorType", utf8Value( plan.getName() ) );
        out.add( "args", ValueUtils.asMapValue( plan.getArguments() ) );
        out.add( "identifiers", ValueUtils.asListValue( plan.getIdentifiers() ) );
        out.add( "children", children( plan ) );
        if ( hasProfilerStatistics )
        {
            ExecutionPlanDescription.ProfilerStatistics profile = plan.getProfilerStatistics();
            if ( profile.hasDbHits() )
            {
                out.add( "dbHits", longValue( profile.getDbHits() ) );
            }
            if ( profile.hasPageCacheStats() )
            {
                out.add( "pageCacheHits", longValue( profile.getPageCacheHits() ) );
                out.add( "pageCacheMisses", longValue( profile.getPageCacheMisses() ) );
                out.add( "pageCacheHitRatio", doubleValue( profile.getPageCacheHitRatio() ) );
            }
            if ( profile.hasRows() )
            {
                out.add( "rows", longValue( profile.getRows() ) );
            }
            if ( profile.hasTime() )
            {
                out.add( "time", longValue( profile.getTime() ) );
            }
        }
        return out.build();
    }

    private static ListValue children( ExecutionPlanDescription plan )
    {
        ListValueBuilder builder = ListValueBuilder.newListBuilder();
        for ( ExecutionPlanDescription child : plan.getChildren() )
        {
            builder.add( convert( child ) );
        }
        return builder.build();
    }
}
