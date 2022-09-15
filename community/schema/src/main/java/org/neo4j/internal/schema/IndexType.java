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
package org.neo4j.internal.schema;

/**
 * This is the internal equivalent of {@link org.neo4j.graphdb.schema.IndexType}.
 * <p>
 * NOTE: The ordinal is used in the hash function for the auto-generated SchemaRule names, so avoid changing the ordinals when modifying this enum.
 */
public enum IndexType
{
    /**
     * @see org.neo4j.graphdb.schema.IndexType#BTREE
     */
    BTREE,
    /**
     * @see org.neo4j.graphdb.schema.IndexType#FULLTEXT
     */
    FULLTEXT,
    /**
     * @see org.neo4j.graphdb.schema.IndexType#LOOKUP
     */
    LOOKUP,
    /**
     * @see org.neo4j.graphdb.schema.IndexType#TEXT
     */
    TEXT,
    /**
     * @see org.neo4j.graphdb.schema.IndexType#RANGE
     */
    RANGE,
    /**
     * @see org.neo4j.graphdb.schema.IndexType#POINT
     */
    POINT;

    public static IndexType fromPublicApi( org.neo4j.graphdb.schema.IndexType type )
    {
        if ( type == null )
        {
            return null;
        }
        switch ( type )
        {
        case BTREE:
            return BTREE;
        case FULLTEXT:
            return FULLTEXT;
        case LOOKUP:
            return LOOKUP;
        case TEXT:
            return TEXT;
        case RANGE:
            return RANGE;
        case POINT:
            return POINT;
        default:
            throw new IllegalArgumentException( "Unknown index type: " + type );
        }
    }

    public org.neo4j.graphdb.schema.IndexType toPublicApi()
    {
        switch ( this )
        {
        case BTREE:
            return org.neo4j.graphdb.schema.IndexType.BTREE;
        case FULLTEXT:
            return org.neo4j.graphdb.schema.IndexType.FULLTEXT;
        case LOOKUP:
            return org.neo4j.graphdb.schema.IndexType.LOOKUP;
        case TEXT:
            return org.neo4j.graphdb.schema.IndexType.TEXT;
        case RANGE:
            return org.neo4j.graphdb.schema.IndexType.RANGE;
        case POINT:
            return org.neo4j.graphdb.schema.IndexType.POINT;
        default:
            throw new IllegalStateException( "Missing index type variant in IndexType.toPublicApi: " + this );
        }
    }

    public boolean isLookup()
    {
        return this == LOOKUP;
    }
}
