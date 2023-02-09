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

import org.neo4j.common.EntityType;
import org.neo4j.token.api.TokenConstants;

import static org.neo4j.common.EntityType.NODE;
import static org.neo4j.common.EntityType.RELATIONSHIP;
import static org.neo4j.internal.schema.PropertySchemaType.COMPLETE_ALL_TOKENS;
import static org.neo4j.internal.schema.PropertySchemaType.ENTITY_TOKENS;
import static org.neo4j.internal.schema.PropertySchemaType.PARTIAL_ANY_TOKEN;

/**
 * Static methods to create different types of Schema Descriptors
 */
public class SchemaDescriptors
{
    public static SchemaDescriptor noSchema()
    {
        return NoSchemaDescriptor.NO_SCHEMA;
    }

    public static FulltextSchemaDescriptor fulltext( EntityType entityType, int[] entityTokenIds, int[] propertyKeyIds )
    {
        return new SchemaDescriptorImplementation( entityType, PARTIAL_ANY_TOKEN, entityTokenIds, propertyKeyIds );
    }

    public static LabelSchemaDescriptor forLabel( int labelId, int... propertyIds )
    {
        validateLabelIds( labelId );
        validatePropertyIds( propertyIds );
        return new SchemaDescriptorImplementation( NODE, COMPLETE_ALL_TOKENS, new int[]{labelId}, propertyIds );
    }

    public static RelationTypeSchemaDescriptor forRelType( int relTypeId, int... propertyIds )
    {
        validateRelationshipTypeIds( relTypeId );
        validatePropertyIds( propertyIds );
        return new SchemaDescriptorImplementation( RELATIONSHIP, COMPLETE_ALL_TOKENS, new int[]{relTypeId}, propertyIds );
    }

    public static AnyTokenSchemaDescriptor forAnyEntityTokens( EntityType entityType )
    {
        return new SchemaDescriptorImplementation( entityType, ENTITY_TOKENS, new int[0], new int[0] );
    }

    /**
     * Create a predicate that checks whether a schema descriptor Supplier supplies the given schema descriptor.
     * @param descriptor The schema descriptor to check equality with.
     * @return A predicate that returns {@code true} if it is given a schema descriptor supplier that supplies the
     * same schema descriptor as the given schema descriptor.
     */
    public static <T extends SchemaDescriptorSupplier> Predicate<T> equalTo( SchemaDescriptor descriptor )
    {
        return supplier -> descriptor.equals( supplier.schema() );
    }

    private static void validatePropertyIds( int[] propertyIds )
    {
        for ( int propertyId : propertyIds )
        {
            if ( TokenConstants.ANY_PROPERTY_KEY == propertyId )
            {
                throw new IllegalArgumentException(
                        "Index schema descriptor can't be created for non existent property." );
            }
        }
    }

    private static void validateRelationshipTypeIds( int... relTypes )
    {
        for ( int relType : relTypes )
        {
            if ( TokenConstants.ANY_RELATIONSHIP_TYPE == relType )
            {
                throw new IllegalArgumentException( "Index schema descriptor can't be created for non existent relationship type." );
            }
        }
    }

    private static void validateLabelIds( int... labelIds )
    {
        for ( int labelId : labelIds )
        {
            if ( TokenConstants.ANY_LABEL == labelId )
            {
                throw new IllegalArgumentException( "Index schema descriptor can't be created for non existent label." );
            }
        }
    }
}
