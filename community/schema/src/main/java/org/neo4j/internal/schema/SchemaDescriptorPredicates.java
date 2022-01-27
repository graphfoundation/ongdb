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
package org.neo4j.internal.schema;

import java.util.function.Predicate;
import java.util.stream.LongStream;

import org.neo4j.common.EntityType;

import static org.apache.commons.lang3.ArrayUtils.contains;

public class SchemaDescriptorPredicates
{
    private SchemaDescriptorPredicates()
    {
    }

    public static <T extends SchemaDescriptorSupplier> Predicate<T> hasLabel( int labelId )
    {
        return supplier ->
        {
            SchemaDescriptor schema = supplier.schema();
            return schema.entityType() == EntityType.NODE && contains( schema.getEntityTokenIds(), labelId );
        };
    }

    public static <T extends SchemaDescriptorSupplier> Predicate<T> hasEntityToken( long[] entityTokens, EntityType entityType )
    {
        return supplier ->
        {
            SchemaDescriptor schema = supplier.schema();
            return schema.entityType() == entityType && LongStream.of( entityTokens )
                    .anyMatch( entityToken -> contains( schema.getEntityTokenIds(), (int) entityToken ) );
        };
    }

    public static <T extends SchemaDescriptorSupplier> Predicate<T> hasRelType( int relTypeId )
    {
        return supplier ->
        {
            SchemaDescriptor schema = supplier.schema();
            return schema.entityType() == EntityType.RELATIONSHIP && contains( schema.getEntityTokenIds(), relTypeId );
        };
    }

    public static <T extends SchemaDescriptorSupplier> Predicate<T> hasProperty( int propertyId )
    {
        return supplier -> hasProperty( supplier, propertyId );
    }

    public static boolean hasLabel( SchemaDescriptorSupplier supplier, int labelId )
    {
        SchemaDescriptor schema = supplier.schema();
        return schema.entityType() == EntityType.NODE && contains( schema.getEntityTokenIds(), labelId );
    }

    public static boolean hasRelType( SchemaDescriptorSupplier supplier, int relTypeId )
    {
        SchemaDescriptor schema = supplier.schema();
        return schema.entityType() == EntityType.RELATIONSHIP && contains( schema.getEntityTokenIds(), relTypeId );
    }

    public static boolean hasProperty( SchemaDescriptorSupplier supplier, int propertyId )
    {
        int[] schemaProperties = supplier.schema().getPropertyIds();
        for ( int schemaProp : schemaProperties )
        {
            if ( schemaProp == propertyId )
            {
                return true;
            }
        }
        return false;
    }
}
