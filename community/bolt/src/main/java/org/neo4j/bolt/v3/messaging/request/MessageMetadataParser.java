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
package org.neo4j.bolt.v3.messaging.request;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.neo4j.bolt.messaging.BoltIOException;
import org.neo4j.bolt.runtime.AccessMode;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.spatial.Point;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.kernel.impl.util.BaseToObjectValueWriter;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.CoordinateReferenceSystem;
import org.neo4j.values.storable.LongValue;
import org.neo4j.values.storable.StringValue;
import org.neo4j.values.storable.Values;
import org.neo4j.values.virtual.MapValue;

/**
 * The parsing methods in this class returns null if the specified key is not found in the input message metadata map.
 */
public final class MessageMetadataParser
{
    private static final String TX_TIMEOUT_KEY = "tx_timeout";
    private static final String TX_META_DATA_KEY = "tx_metadata";
    private static final String ACCESS_MODE_KEY = "mode";

    private MessageMetadataParser()
    {
    }

    public static Duration parseTransactionTimeout( MapValue meta ) throws BoltIOException
    {
        AnyValue anyValue = meta.get( TX_TIMEOUT_KEY );
        if ( anyValue == Values.NO_VALUE )
        {
            return null;
        }
        else if ( anyValue instanceof LongValue )
        {
            return Duration.ofMillis( ((LongValue) anyValue).longValue() );
        }
        else
        {
            throw new BoltIOException( Status.Request.Invalid, "Expecting transaction timeout value to be a Long value, but got: " + anyValue );
        }
    }

    public static AccessMode parseAccessMode( MapValue meta ) throws BoltIOException
    {
        AnyValue anyValue = meta.get( ACCESS_MODE_KEY );
        if ( anyValue == Values.NO_VALUE )
        {
            return AccessMode.WRITE;
        }
        else if ( anyValue instanceof StringValue )
        {
            String value = ((StringValue) anyValue).stringValue();
            if ( value.equals( "r" ) )
            {
                return AccessMode.READ;
            }

            if ( value.equals( "w" ) )
            {
                return AccessMode.WRITE;
            }

            throw new BoltIOException( Status.Request.Invalid, "Expecting access mode value to be 'r' or 'w', but got: " + anyValue );
        }
        else
        {
            throw new BoltIOException( Status.Request.Invalid, "Expecting access mode value to be a String value, but got: " + anyValue );
        }
    }

    public static Map<String,Object> parseTransactionMetadata( MapValue meta ) throws BoltIOException
    {
        AnyValue anyValue = meta.get( TX_META_DATA_KEY );
        if ( anyValue == Values.NO_VALUE )
        {
            return null;
        }
        else if ( anyValue instanceof MapValue )
        {
            MapValue mapValue = (MapValue) anyValue;
            TransactionMetadataWriter writer = new TransactionMetadataWriter();
            Map<String,Object> txMeta = new HashMap<>( mapValue.size() );
            mapValue.foreach( ( key, value ) -> txMeta.put( key, writer.valueAsObject( value ) ) );
            return txMeta;
        }
        else
        {
            throw new BoltIOException( Status.Request.Invalid, "Expecting transaction metadata value to be a Map value, but got: " + anyValue );
        }
    }

    private static class TransactionMetadataWriter extends BaseToObjectValueWriter<RuntimeException>
    {
        @Override
        protected Node newNodeEntityById( long id )
        {
            throw new UnsupportedOperationException( "Transaction metadata should not contain nodes" );
        }

        @Override
        protected Relationship newRelationshipEntityById( long id )
        {
            throw new UnsupportedOperationException( "Transaction metadata should not contain relationships" );
        }

        @Override
        protected Point newPoint( CoordinateReferenceSystem crs, double[] coordinate )
        {
            return Values.pointValue( crs, coordinate );
        }

        Object valueAsObject( AnyValue value )
        {
            value.writeTo( this );
            return value();
        }
    }
}
