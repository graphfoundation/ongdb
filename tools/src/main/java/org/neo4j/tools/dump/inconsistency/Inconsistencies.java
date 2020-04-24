/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.tools.dump.inconsistency;

import org.neo4j.consistency.RecordType;

/**
 * Container for ids of entities that are considered to be inconsistent.
 */
public interface Inconsistencies
{
    void node( long id );

    void relationship( long id );

    void property( long id );

    void relationshipGroup( long id );

    void schemaIndex( long id );

    boolean containsNodeId( long id );

    boolean containsRelationshipId( long id );

    boolean containsPropertyId( long id );

    boolean containsRelationshipGroupId( long id );

    boolean containsSchemaIndexId( long id );

    default void reportInconsistency( RecordType recordType, long recordId )
    {
        if ( recordType == null )
        {
            // Skip records of unknown type.
            return;
        }

        switch ( recordType )
        {
        case NODE:
            node( recordId );
            break;
        case RELATIONSHIP:
            relationship( recordId );
            break;
        case PROPERTY:
            property( recordId );
            break;
        case RELATIONSHIP_GROUP:
            relationshipGroup( recordId );
            break;
        case SCHEMA:
            schemaIndex( recordId );
            break;
        default:
            // Ignore unknown record types.
            break;
        }
    }

    default void reportInconsistency( RecordType recordType, long recordId,
                                      RecordType inconsistentWithRecordType, long inconsistentWithRecordId )
    {
        reportInconsistency( recordType, recordId );
        reportInconsistency( inconsistentWithRecordType, inconsistentWithRecordId );
    }
}
