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
package org.neo4j.kernel.api.index;

import org.neo4j.internal.kernel.api.PropertyIndexQuery;
import org.neo4j.internal.schema.SchemaDescriptorSupplier;
import org.neo4j.storageengine.api.IndexEntryUpdate;
import org.neo4j.storageengine.api.ValueIndexEntryUpdate;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;

public final class IndexQueryHelper
{
    private IndexQueryHelper()
    {
    }

    public static PropertyIndexQuery exact( int propertyKeyId, Object value )
    {
        return exact( propertyKeyId, Values.of( value ) );
    }

    public static PropertyIndexQuery exact( int propertyKeyId, Value value )
    {
        return PropertyIndexQuery.exact( propertyKeyId, value );
    }

    public static ValueIndexEntryUpdate<SchemaDescriptorSupplier> add(
            long nodeId, SchemaDescriptorSupplier schema, Object... objects )
    {
        return IndexEntryUpdate.add( nodeId, schema, toValues( objects ) );
    }

    public static ValueIndexEntryUpdate<SchemaDescriptorSupplier> remove(
            long nodeId, SchemaDescriptorSupplier schema, Object... objects )
    {
        return IndexEntryUpdate.remove( nodeId, schema, toValues( objects ) );
    }

    public static ValueIndexEntryUpdate<SchemaDescriptorSupplier> change(
            long nodeId, SchemaDescriptorSupplier schema, Object o1, Object o2 )
    {
        return IndexEntryUpdate.change( nodeId, schema, Values.of( o1 ), Values.of( o2 ) );
    }

    public static ValueIndexEntryUpdate<SchemaDescriptorSupplier> change(
            long nodeId, SchemaDescriptorSupplier schema, Object[] o1, Object[] o2 )
    {
        return IndexEntryUpdate.change( nodeId, schema, toValues( o1 ), toValues( o2 ) );
    }

    private static Value[] toValues( Object[] objects )
    {
        Value[] values = new Value[objects.length];
        for ( int i = 0; i < objects.length; i++ )
        {
            Object object = objects[i];
            values[i] = object instanceof Value ? (Value)object : Values.of( object );
        }
        return values;
    }
}
