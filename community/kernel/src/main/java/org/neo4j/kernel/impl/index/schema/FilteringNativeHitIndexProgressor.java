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
package org.neo4j.kernel.impl.index.schema;

import org.neo4j.index.internal.gbptree.Seeker;
import org.neo4j.internal.kernel.api.PropertyIndexQuery;
import org.neo4j.values.storable.Value;

class FilteringNativeHitIndexProgressor<KEY extends NativeIndexKey<KEY>> extends NativeHitIndexProgressor<KEY>
{
    private final PropertyIndexQuery[] filter;

    FilteringNativeHitIndexProgressor( Seeker<KEY,NullValue> seeker, EntityValueClient client, PropertyIndexQuery[] filter )
    {
        super( seeker, client );
        this.filter = filter;
    }

    @Override
    protected boolean acceptValue( Value[] values )
    {
        for ( int i = 0; i < values.length; i++ )
        {
            if ( !filter[i].acceptsValue( values[i] ) )
            {
                return false;
            }
        }
        return true;
    }

    // We need to make sure to always deserialize, even if the client doesn't need the value, to be able to filter
    @Override
    Value[] extractValues( KEY key )
    {
        return key.asValues();
    }
}
