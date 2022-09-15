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
package org.neo4j.server.rest.repr;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import org.neo4j.server.http.cypher.entity.HttpRelationship;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.server.rest.repr.RepresentationTestAccess.serialize;
import static org.neo4j.server.rest.repr.RepresentationTestBase.NODE_URI_PATTERN;
import static org.neo4j.server.rest.repr.RepresentationTestBase.RELATIONSHIP_URI_PATTERN;
import static org.neo4j.server.rest.repr.RepresentationTestBase.assertUriMatches;

class RelationshipRepresentationTest
{
    @Test
    void shouldHaveSelfLink()
    {
        assertUriMatches( RELATIONSHIP_URI_PATTERN, relrep( 1234 ).selfUri() );
    }

    @Test
    void shouldHaveType()
    {
        assertNotNull( relrep( 1234 ).getType() );
    }

    @Test
    void shouldHaveStartNodeLink()
    {
        assertUriMatches( NODE_URI_PATTERN, relrep( 1234 ).startNodeUri() );
    }

    @Test
    void shouldHaveEndNodeLink()
    {
        assertUriMatches( NODE_URI_PATTERN, relrep( 1234 ).endNodeUri() );
    }

    @Test
    void shouldHavePropertiesLink()
    {
        assertUriMatches( RELATIONSHIP_URI_PATTERN + "/properties", relrep( 1234 ).propertiesUri() );
    }

    @Test
    void shouldHavePropertyLinkTemplate()
    {
        assertUriMatches( RELATIONSHIP_URI_PATTERN + "/properties/\\{key\\}", relrep( 1234 ).propertyUriTemplate() );
    }

    @Test
    void shouldSerialiseToMap()
    {
        Map<String, Object> repr = serialize( relrep( 1234 ) );
        assertNotNull( repr );
        verifySerialisation( repr );
    }

    private static RelationshipRepresentation relrep( long id )
    {
        return new RelationshipRepresentation(
                new HttpRelationship( 0, 0, 1, "LOVES", Collections.emptyMap(), false, ( ignoredA, ignoredB ) -> Optional.empty() ) );
    }

    static void verifySerialisation( Map<String,Object> relrep )
    {
        assertUriMatches( RELATIONSHIP_URI_PATTERN, relrep.get( "self" )
                .toString() );
        assertUriMatches( NODE_URI_PATTERN, relrep.get( "start" )
                .toString() );
        assertUriMatches( NODE_URI_PATTERN, relrep.get( "end" )
                .toString() );
        assertNotNull( relrep.get( "type" ) );
        assertUriMatches( RELATIONSHIP_URI_PATTERN + "/properties", relrep.get( "properties" )
                .toString() );
        assertUriMatches( RELATIONSHIP_URI_PATTERN + "/properties/\\{key\\}", (String) relrep.get( "property" ) );
        assertNotNull( relrep.get( "data" ) );
        assertNotNull( relrep.get( "metadata" ) );
        Map metadata = (Map) relrep.get( "metadata" );
        assertNotNull( metadata.get("type") );
        assertTrue( ( (Number) metadata.get("id") ).longValue() >= 0 );
    }
}
