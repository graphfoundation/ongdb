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
package org.neo4j.server.http.cypher.format.output.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.Map;

import org.neo4j.server.http.cypher.format.api.RecordEvent;
import org.neo4j.server.http.cypher.format.common.Neo4jJsonCodec;
import org.neo4j.server.rest.domain.JsonParseException;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.internal.helpers.collection.MapUtil.map;
import static org.neo4j.server.rest.domain.JsonHelper.jsonNode;

class RestRepresentationWriterTest
{
    @Test
    void shouldWriteNestedMaps() throws Exception
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        JsonGenerator json = new Neo4jJsonCodec().createGenerator( out );

        JsonNode rest = serialize( out, json, new RestRepresentationWriter( URI.create( "localhost" ) ) );

        assertThat( rest.size() ).isEqualTo( 1 );

        JsonNode firstCell = rest.get( 0 );
        assertThat( firstCell.get( "one" ).get( "two" ).size() ).isEqualTo( 2 );
        assertThat( firstCell.get( "one" ).get( "two" ).get( 0 ).asBoolean() ).isEqualTo( true );
        assertThat( firstCell.get( "one" ).get( "two" ).get( 1 ).get( "three" ).asInt() ).isEqualTo( 42 );
    }

    private static JsonNode serialize( ByteArrayOutputStream out, JsonGenerator json, ResultDataContentWriter
            resultDataContentWriter ) throws IOException, JsonParseException
    {
        Map<String, Object> data = map( "the column", map( "one", map( "two", asList( true, map( "three", 42 ) ) ) ) );
        RecordEvent recordEvent = new RecordEvent( Collections.singletonList( "the column" ), data::get );

        json.writeStartObject();
        // RETURN {one:{two:[true, {three: 42}]}}
        resultDataContentWriter.write( json, recordEvent );
        json.writeEndObject();
        json.flush();
        json.close();

        String jsonAsString = out.toString();
        return jsonNode( jsonAsString ).get( "rest" );
    }
}
