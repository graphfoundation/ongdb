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
package org.neo4j.server.http.cypher.consumer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.ArgumentCaptor;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import org.neo4j.bolt.runtime.BoltResult;
import org.neo4j.kernel.impl.util.DefaultValueMapper;
import org.neo4j.server.http.cypher.CachingWriter;
import org.neo4j.server.http.cypher.OutputEventStream;
import org.neo4j.server.http.cypher.TransactionIndependentValueMapper;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.Values;
import org.neo4j.values.virtual.NodeValue;
import org.neo4j.values.virtual.PathValue;
import org.neo4j.values.virtual.RelationshipValue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

class OutputEventStreamRecordConsumerTest
{
    private CachingWriter cachingWriter;
    private BoltResult boltResult;
    private OutputEventStream outputEventStream;
    private TransactionIndependentValueMapper transactionIndependentValueMapper;
    private OutputEventStreamRecordConsumer subject;
    private Map<String,Object> results;

    @BeforeEach
    void setup()
    {
        boltResult = mock( BoltResult.class );
        outputEventStream = mock( OutputEventStream.class );
        cachingWriter = new CachingWriter( new DefaultValueMapper( null ) );
        transactionIndependentValueMapper = spy( new TransactionIndependentValueMapper( cachingWriter ) );
        results = new HashMap<>();
        subject = new OutputEventStreamRecordConsumer( boltResult, outputEventStream, transactionIndependentValueMapper, () -> results );
    }

    @ParameterizedTest
    @MethodSource( "addMetadataValues" )
    void addMetadata_shouldReflectValuesInto_metadataMap( Map<String,AnyValue> values )
    {
        // pre-condition
        assertTrue( subject.metadataMap().isEmpty() );

        // act
        values.forEach( subject::addMetadata );

        // verify
        assertEquals( values, subject.metadataMap() );
    }

    @ParameterizedTest
    @MethodSource( "recordConsumptionValues" )
    void beginRecord_consumeFiled_endRecord_shouldWriteRecordsToTheOutputStream( List<String> fieldNames, List<AnyValue> fields ) throws Exception
    {
        ArgumentCaptor<Function<String,Object>> supplierCaptor = ArgumentCaptor.forClass( Function.class );
        doReturn( fieldNames.toArray( new String[0] ) ).when( boltResult ).fieldNames();

        subject.beginRecord( fieldNames.size() );
        fields.forEach( field ->
                        {
                            try
                            {
                                subject.consumeField( field );
                            }
                            catch ( IOException ex )
                            {
                                throw new UncheckedIOException( ex );
                            }
                        } );
        subject.endRecord();

        verify( outputEventStream ).writeRecord( eq( fieldNames ), supplierCaptor.capture() );

        var values = supplierCaptor.getAllValues();
        assertEquals( 1, values.size() );
        var supplier = values.get( 0 );
        fieldNames.forEach( fieldName -> assertEquals( results.get( fieldName ), supplier.apply( fieldName ) ) );
    }

    @Test
    void onError_shouldThrowsIOException()
    {
        assertThrows( IOException.class, () -> subject.onError() );
    }

    private static Stream<Map<String,AnyValue>> addMetadataValues()
    {
        return Stream.of(
                Map.of( "noValue", Values.NO_VALUE, "", Values.booleanValue( true ) ),
                Map.of( "int", Values.intValue( 124 ) ),
                Map.of( "floatList", Values.floatArray( new float[]{3, 4.0f, 5.4f} ), "stringList", Values.stringArray( "a", "b" ) )
        );
    }

    private static Stream<Arguments> recordConsumptionValues()
    {
        return Stream.of(
                arguments( List.of( "one" ), List.of( Values.intValue( 134 ) ) ),
                arguments( List.of( "one", "two", "three" ),
                           List.of( Values.intValue( 134 ), Values.booleanArray( new boolean[]{true, false} ), Values.charValue( '2' ) ) ),
                arguments( List.of( "node" ), List.of( mock( NodeValue.class ) ) ),
                arguments( List.of( "relationship" ), List.of( mock( RelationshipValue.class ) ) ),
                arguments( List.of( "path" ), List.of( mock( PathValue.class ) ) )
        );
    }
}
