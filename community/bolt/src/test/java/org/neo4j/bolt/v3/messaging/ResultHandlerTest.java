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
package org.neo4j.bolt.v3.messaging;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import org.neo4j.bolt.messaging.BoltResponseMessageRecorder;
import org.neo4j.bolt.messaging.ResponseMessage;
import org.neo4j.bolt.runtime.BoltConnection;
import org.neo4j.bolt.runtime.BoltResult;
import org.neo4j.bolt.v3.messaging.response.RecordMessage;
import org.neo4j.bolt.v3.messaging.response.SuccessMessage;
import org.neo4j.logging.NullLog;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.Value;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.neo4j.bolt.v4.messaging.AbstractStreamingMessage.STREAM_LIMIT_UNLIMITED;
import static org.neo4j.values.storable.Values.values;

class ResultHandlerTest
{
    @Test
    void shouldPullTheResult() throws Throwable
    {
        BoltResponseMessageRecorder messageWriter = new BoltResponseMessageRecorder();
        ResultHandler handler = new ResultHandler( messageWriter, mock( BoltConnection.class ), NullLog.getInstance() );

        Value[] record1 = values( "a", "b", "c" );
        Value[] record2 = values( "1", "2", "3" );
        BoltResult result = new TestBoltResult( record1, record2 );

        handler.onPullRecords( result, STREAM_LIMIT_UNLIMITED );
        handler.onFinish();

        List<ResponseMessage> messages = messageWriter.asList();
        assertThat( messages.size() ).isEqualTo( 3 );
        assertThat( messages.get( 0 ) ).isEqualTo( new RecordMessage( record1 ) );
        assertThat( messages.get( 1 ) ).isEqualTo( new RecordMessage( record2 ) );
        assertThat( messages.get( 2 ) ).isInstanceOf( SuccessMessage.class );
    }

    @Test
    void shouldDiscardTheResult() throws Throwable
    {
        BoltResponseMessageRecorder messageWriter = new BoltResponseMessageRecorder();
        ResultHandler handler = new ResultHandler( messageWriter, mock( BoltConnection.class ), NullLog.getInstance() );

        Value[] record1 = values( "a", "b", "c" );
        Value[] record2 = values( "1", "2", "3" );
        BoltResult result = new TestBoltResult( record1, record2 );

        handler.onDiscardRecords( result, STREAM_LIMIT_UNLIMITED );
        handler.onFinish();

        List<ResponseMessage> messages = messageWriter.asList();
        assertThat( messages.size() ).isEqualTo( 1 );
        assertThat( messages.get( 0 ) ).isInstanceOf( SuccessMessage.class );
    }

    private static class TestBoltResult implements BoltResult
    {
        private final List<AnyValue[]> records;

        private TestBoltResult( AnyValue[]... records )
        {
            this.records = asList( records );
        }

        @Override
        public String[] fieldNames()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean handleRecords( RecordConsumer recordConsumer, long size ) throws IOException
        {
            if ( records.isEmpty() )
            {
                return false;
            }

            for ( AnyValue[] record : records )
            {
                recordConsumer.beginRecord( record.length );
                for ( AnyValue anyValue : record )
                {
                    recordConsumer.consumeField( anyValue );
                }
                recordConsumer.endRecord();
            }
            return false;
        }

        @Override
        public boolean discardRecords( DiscardingRecordConsumer recordConsumer, long size )
        {
            return false;
        }

        @Override
        public void close()
        {
        }

        @Override
        public String toString()
        {
            return "TestBoltResult{" + "records=" + records + '}';
        }
    }
}
