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
package org.neo4j.server.http.cypher;

import com.fasterxml.jackson.core.JsonGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.neo4j.graphdb.Entity;
import org.neo4j.graphdb.Path;
import org.neo4j.graphdb.spatial.CRS;
import org.neo4j.graphdb.spatial.Coordinate;
import org.neo4j.graphdb.spatial.Geometry;
import org.neo4j.graphdb.spatial.Point;
import org.neo4j.kernel.impl.api.KernelTransactionImplementation;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.server.http.cypher.entity.HttpNode;
import org.neo4j.server.http.cypher.entity.HttpRelationship;
import org.neo4j.server.http.cypher.format.common.Neo4jJsonCodec;
import org.neo4j.test.mockito.mock.SpatialMocks;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.neo4j.test.mockito.mock.SpatialMocks.mockCartesian;
import static org.neo4j.test.mockito.mock.SpatialMocks.mockCartesian_3D;
import static org.neo4j.test.mockito.mock.SpatialMocks.mockWGS84;
import static org.neo4j.test.mockito.mock.SpatialMocks.mockWGS84_3D;

class Neo4jJsonCodecTest
{
    private Neo4jJsonCodec jsonCodec;
    private JsonGenerator jsonGenerator;

    @BeforeEach
    void init()
    {
        var context = mock( TransitionalTxManagementKernelTransaction.class );
        var internalTransaction = mock( InternalTransaction.class );
        var kernelTransaction = mock( KernelTransactionImplementation.class );

        when( internalTransaction.kernelTransaction() ).thenReturn( kernelTransaction );
        when( context.getInternalTransaction() ).thenReturn( internalTransaction );
        jsonCodec = new Neo4jJsonCodec();
        jsonGenerator = mock( JsonGenerator.class );
    }

    @Test
    void testEntityWriting() throws IOException
    {
        //Given
        Entity entity = mock( Entity.class );
        when( entity.getAllProperties() ).thenThrow( RuntimeException.class );

        var e = assertThrows( IllegalArgumentException.class, () -> jsonCodec.writeValue( jsonGenerator, entity ) );
        verify( jsonGenerator, never() ).writeEndObject();
    }

    @Test
    void testNodeWriting() throws IOException
    {
        //Given
        Entity node = mock( HttpNode.class );
        when( node.getAllProperties() ).thenThrow( RuntimeException.class );

        //When
        assertThrows( RuntimeException.class, () -> jsonCodec.writeValue( jsonGenerator, node ) );

        //Then
        verify( jsonGenerator ).writeEndObject();
    }

    @Test
    void testRelationshipWriting() throws IOException
    {
        //Given
        HttpRelationship relationship = mock( HttpRelationship.class );
        when( relationship.isDeleted() ).thenReturn( false );
        when( relationship.getAllProperties() ).thenThrow( RuntimeException.class );

        //When
        assertThrows( RuntimeException.class, () -> jsonCodec.writeValue( jsonGenerator, relationship ) );

        //Then
        verify( jsonGenerator ).writeEndObject();
    }

    @Test
    void testPathWriting() throws IOException
    {
        //Given
        Path path = mock( Path.class );
        Entity entity = mock( Entity.class );
        when( entity.getAllProperties() ).thenThrow( RuntimeException.class );
        when( path.iterator() ).thenReturn( Arrays.asList(entity).listIterator() );

        //When
        assertThrows( Exception.class, () -> jsonCodec.writeValue( jsonGenerator, path ) );

        //Then
        verify( jsonGenerator ).writeEndArray();
    }

    @Test
    void testIteratorWriting() throws IOException
    {
        //Given
        Entity entity = mock( Entity.class );
        when( entity.getAllProperties() ).thenThrow( RuntimeException.class );

        //When
        assertThrows( Exception.class, () -> jsonCodec.writeValue( jsonGenerator, Collections.singletonList( entity ) ) );

        //Then
        verify( jsonGenerator ).writeEndArray();
    }

    @Test
    void testByteArrayWriting() throws IOException
    {
        //Given
        doThrow( new RuntimeException() ).when( jsonGenerator ).writeNumber( anyInt() );
        byte[] byteArray = new byte[]{ 1, 2, 3};

        //When
        jsonCodec.writeValue( jsonGenerator, byteArray );

        //Then
        verify( jsonGenerator ).writeEndArray();
    }

    @Test
    void testMapWriting() throws IOException
    {
        //Given
        doThrow( new RuntimeException() ).when( jsonGenerator ).writeFieldName( anyString() );

        //When
        jsonCodec.writeValue( jsonGenerator, new HashMap<String, String>() );

        //Then
        verify( jsonGenerator ).writeEndObject();
    }

    @Test
    void shouldWriteAMapContainingNullAsKeysAndValues() throws IOException
    {
        // given
        Map<String,String> map = new HashMap<>();
        map.put( null, null );

        // when
        jsonCodec.writeValue( jsonGenerator, map );

        // then
        verify( jsonGenerator ).writeFieldName( "null" );
    }

    @Test
    void testGeographicPointWriting() throws IOException
    {
        //Given
        Point value = SpatialMocks.mockPoint( 12.3, 45.6, mockWGS84() );

        //When
        jsonCodec.writeValue( jsonGenerator, value );

        //Then
        verify( jsonGenerator, times( 3 ) ).writeEndObject();
    }

    @Test
    void testGeographic3DPointWriting() throws IOException
    {
        //Given
        Point value = SpatialMocks.mockPoint( 12.3, 45.6, 78.9, mockWGS84_3D() );

        //When
        jsonCodec.writeValue( jsonGenerator, value );

        //Then
        verify( jsonGenerator, times( 3 ) ).writeEndObject();
    }

    @Test
    void testCartesianPointWriting() throws IOException
    {
        //Given
        Point value = SpatialMocks.mockPoint( 123.0, 456.0, mockCartesian() );

        //When
        jsonCodec.writeValue( jsonGenerator, value );

        //Then
        verify( jsonGenerator, times( 3 ) ).writeEndObject();
    }

    @Test
    void testCartesian3DPointWriting() throws IOException
    {
        //Given
        Point value = SpatialMocks.mockPoint( 123.0, 456.0, 789.0, mockCartesian_3D() );

        //When
        jsonCodec.writeValue( jsonGenerator, value );

        //Then
        verify( jsonGenerator, times( 3 ) ).writeEndObject();
    }

    @Test
    void testGeometryWriting() throws IOException
    {
        //Given
        List<Coordinate> points = new ArrayList<>();
        points.add( new Coordinate( 1, 2 ) );
        points.add( new Coordinate( 2, 3 ) );
        Geometry value = SpatialMocks.mockGeometry( "LineString", points, mockCartesian() );

        //When
        jsonCodec.writeValue( jsonGenerator, value );

        //Then
        verify( jsonGenerator, times( 3 ) ).writeEndObject();
    }

    @Test
    void testGeometryCrsStructureCartesian() throws IOException
    {
        verifyCRSStructure( mockCartesian() );
    }

    @Test
    void testGeometryCrsStructureCartesian_3D() throws IOException
    {
        verifyCRSStructure( mockCartesian_3D() );
    }

    @Test
    void testGeometryCrsStructureWGS84() throws IOException
    {
        verifyCRSStructure( mockWGS84() );
    }

    @Test
    void testGeometryCrsStructureWGS84_3D() throws IOException
    {
        verifyCRSStructure( mockWGS84_3D() );
    }

    private void verifyCRSStructure( CRS crs ) throws IOException
    {
        // When
        jsonCodec.writeValue( jsonGenerator, crs );

        // Then verify in order
        InOrder inOrder = Mockito.inOrder( jsonGenerator );

        // Start CRS object
        inOrder.verify( jsonGenerator ).writeStartObject();
        // Code
        inOrder.verify( jsonGenerator ).writeFieldName( "srid" );
        inOrder.verify( jsonGenerator ).writeNumber( crs.getCode() );
        // Name
        inOrder.verify( jsonGenerator ).writeFieldName( "name" );
        inOrder.verify( jsonGenerator ).writeString( crs.getType() );
        // Type
        inOrder.verify( jsonGenerator ).writeFieldName( "type" );
        inOrder.verify( jsonGenerator ).writeString( "link" );
        // Properties
        inOrder.verify( jsonGenerator ).writeFieldName( "properties" );
        // Properties object
        inOrder.verify( jsonGenerator ).writeStartObject();
        inOrder.verify( jsonGenerator ).writeFieldName( "href" );
        inOrder.verify( jsonGenerator ).writeString( startsWith( crs.getHref() ) );
        inOrder.verify( jsonGenerator ).writeFieldName( "type" );
        inOrder.verify( jsonGenerator ).writeString( "ogcwkt" );
        // Close both properties and CRS objects
        inOrder.verify( jsonGenerator, times( 2 ) ).writeEndObject();
    }
}
