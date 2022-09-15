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
package org.neo4j.internal.recordstorage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.neo4j.internal.kernel.api.exceptions.schema.MalformedSchemaRuleException;
import org.neo4j.internal.schema.SchemaRule;
import org.neo4j.internal.schema.SchemaRuleMapifier;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.store.PropertyType;
import org.neo4j.kernel.impl.store.record.AbstractBaseRecord;
import org.neo4j.kernel.impl.store.record.DynamicRecord;
import org.neo4j.kernel.impl.store.record.LabelTokenRecord;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.PropertyBlock;
import org.neo4j.kernel.impl.store.record.PropertyKeyTokenRecord;
import org.neo4j.kernel.impl.store.record.PropertyRecord;
import org.neo4j.kernel.impl.store.record.Record;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;
import org.neo4j.kernel.impl.store.record.RelationshipRecord;
import org.neo4j.kernel.impl.store.record.RelationshipTypeTokenRecord;
import org.neo4j.kernel.impl.store.record.SchemaRecord;
import org.neo4j.string.UTF8;
import org.neo4j.values.storable.CoordinateReferenceSystem;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.ValueWriter;
import org.neo4j.values.storable.Values;

import static org.neo4j.internal.helpers.Numbers.unsignedByteToInt;
import static org.neo4j.internal.helpers.Numbers.unsignedShortToInt;
import static org.neo4j.internal.recordstorage.CommandReading.COLLECTION_DYNAMIC_RECORD_ADDER;
import static org.neo4j.internal.recordstorage.CommandReading.PROPERTY_BLOCK_DYNAMIC_RECORD_ADDER;
import static org.neo4j.internal.recordstorage.CommandReading.PROPERTY_DELETED_DYNAMIC_RECORD_ADDER;
import static org.neo4j.internal.recordstorage.CommandReading.PROPERTY_INDEX_DYNAMIC_RECORD_ADDER;
import static org.neo4j.internal.schema.SchemaRuleMapifier.unmapifySchemaRule;
import static org.neo4j.util.Bits.bitFlag;
import static org.neo4j.util.Bits.bitFlags;

class LogCommandSerializationV4_0 extends LogCommandSerialization
{
    static final LogCommandSerializationV4_0 INSTANCE = new LogCommandSerializationV4_0();

    @Override
    KernelVersion version()
    {
        return KernelVersion.V4_0;
    }

    @Override
    protected Command readNodeCommand( ReadableChannel channel ) throws IOException
    {
        long id = channel.getLong();
        NodeRecord before = readNodeRecord( id, channel );
        NodeRecord after = readNodeRecord( id, channel );

        markAfterRecordAsCreatedIfCommandLooksCreated( before, after );
        // DynamicRecord has the created flag stored inside them because it's much harder to tell by looking at the command whether or not they are created
        return new Command.NodeCommand( this, before, after );
    }

    @Override
    protected Command readRelationshipCommand( ReadableChannel channel ) throws IOException
    {
        long id = channel.getLong();

        RelationshipRecord before = readRelationshipRecord( id, channel );
        RelationshipRecord after = readRelationshipRecord( id, channel );

        markAfterRecordAsCreatedIfCommandLooksCreated( before, after );
        return new Command.RelationshipCommand( this, before, after );
    }

    @Override
    protected Command readPropertyCommand( ReadableChannel channel ) throws IOException
    {
        // ID
        long id = channel.getLong(); // 8
        // BEFORE
        PropertyRecord before = readPropertyRecord( id, channel );
        if ( before == null )
        {
            return null;
        }
        // AFTER
        PropertyRecord after = readPropertyRecord( id, channel );
        if ( after == null )
        {
            return null;
        }

        markAfterRecordAsCreatedIfCommandLooksCreated( before, after );
        // DynamicRecord has the created flag stored inside them because it's much harder to tell by looking at the command whether or not they are created
        return new Command.PropertyCommand( this, before, after );
    }

    @Override
    protected Command readRelationshipGroupCommand( ReadableChannel channel ) throws IOException
    {
        long id = channel.getLong();
        RelationshipGroupRecord before = readRelationshipGroupRecord( id, channel );
        RelationshipGroupRecord after = readRelationshipGroupRecord( id, channel );

        markAfterRecordAsCreatedIfCommandLooksCreated( before, after );
        return new Command.RelationshipGroupCommand( this, before, after );
    }

    private static RelationshipGroupRecord readRelationshipGroupRecord( long id, ReadableChannel channel )
            throws IOException
    {
        byte flags = channel.get();
        boolean inUse = bitFlag( flags, Record.IN_USE.byteValue() );
        boolean requireSecondaryUnit = bitFlag( flags, Record.REQUIRE_SECONDARY_UNIT );
        boolean hasSecondaryUnit = bitFlag( flags, Record.HAS_SECONDARY_UNIT );
        boolean usesFixedReferenceFormat = bitFlag( flags, Record.USES_FIXED_REFERENCE_FORMAT );

        int type = unsignedShortToInt( channel.getShort() );
        long next = channel.getLong();
        long firstOut = channel.getLong();
        long firstIn = channel.getLong();
        long firstLoop = channel.getLong();
        long owningNode = channel.getLong();
        RelationshipGroupRecord record = new RelationshipGroupRecord( id ).initialize( inUse, type, firstOut, firstIn, firstLoop, owningNode, next );
        record.setRequiresSecondaryUnit( requireSecondaryUnit );
        if ( hasSecondaryUnit )
        {
            record.setSecondaryUnitIdOnLoad( channel.getLong() );
        }
        record.setUseFixedReferences( usesFixedReferenceFormat );
        return record;
    }

    @Override
    protected Command readRelationshipGroupExtendedCommand( ReadableChannel channel ) throws IOException
    {
        long id = channel.getLong();
        RelationshipGroupRecord before = readRelationshipGroupExtendedRecord( id, channel );
        RelationshipGroupRecord after = readRelationshipGroupExtendedRecord( id, channel );

        markAfterRecordAsCreatedIfCommandLooksCreated( before, after );
        return new Command.RelationshipGroupCommand( before, after );
    }

    private RelationshipGroupRecord readRelationshipGroupExtendedRecord( long id, ReadableChannel channel )
            throws IOException
    {
        byte flags = channel.get();
        boolean inUse = bitFlag( flags, Record.IN_USE.byteValue() );
        boolean requireSecondaryUnit = bitFlag( flags, Record.REQUIRE_SECONDARY_UNIT );
        boolean hasSecondaryUnit = bitFlag( flags, Record.HAS_SECONDARY_UNIT );
        boolean usesFixedReferenceFormat = bitFlag( flags, Record.USES_FIXED_REFERENCE_FORMAT );

        int type = unsignedShortToInt( channel.getShort() );
        type |= unsignedByteToInt( channel.get() ) << Short.SIZE;
        long next = channel.getLong();
        long firstOut = channel.getLong();
        long firstIn = channel.getLong();
        long firstLoop = channel.getLong();
        long owningNode = channel.getLong();
        RelationshipGroupRecord record = new RelationshipGroupRecord( id ).initialize( inUse, type, firstOut, firstIn, firstLoop, owningNode, next );
        record.setRequiresSecondaryUnit( requireSecondaryUnit );
        if ( hasSecondaryUnit )
        {
            record.setSecondaryUnitIdOnLoad( channel.getLong() );
        }
        record.setUseFixedReferences( usesFixedReferenceFormat );
        return record;
    }

    @Override
    protected Command readRelationshipTypeTokenCommand( ReadableChannel channel ) throws IOException
    {
        int id = channel.getInt();
        RelationshipTypeTokenRecord before = readRelationshipTypeTokenRecord( id, channel );
        RelationshipTypeTokenRecord after = readRelationshipTypeTokenRecord( id, channel );

        markAfterRecordAsCreatedIfCommandLooksCreated( before, after );
        // DynamicRecord has the created flag stored inside them because it's much harder to tell by looking at the command whether or not they are created
        return new Command.RelationshipTypeTokenCommand( this, before, after );
    }

    private static RelationshipTypeTokenRecord readRelationshipTypeTokenRecord( int id, ReadableChannel channel )
            throws IOException
    {
        // in_use(byte)+type_blockId(int)+nr_type_records(int)
        byte headerByte = channel.get();
        boolean inUse = false;
        boolean internal = false;
        if ( (headerByte & Record.IN_USE.byteValue()) == Record.IN_USE.byteValue() )
        {
            inUse = true;
            internal = (headerByte & Record.ADDITIONAL_FLAG_1) == Record.ADDITIONAL_FLAG_1;
        }
        else if ( headerByte != Record.NOT_IN_USE.byteValue() )
        {
            throw new IOException( "Illegal in use flag: " + headerByte );
        }
        RelationshipTypeTokenRecord record = new RelationshipTypeTokenRecord( id );
        record.setInUse( inUse );
        record.setNameId( channel.getInt() );
        record.setInternal( internal );
        int nrTypeRecords = channel.getInt();
        for ( int i = 0; i < nrTypeRecords; i++ )
        {
            DynamicRecord dr = readDynamicRecord( channel );
            record.addNameRecord( dr );
        }
        return record;
    }

    @Override
    protected Command readLabelTokenCommand( ReadableChannel channel ) throws IOException
    {
        int id = channel.getInt();
        LabelTokenRecord before = readLabelTokenRecord( id, channel );
        LabelTokenRecord after = readLabelTokenRecord( id, channel );

        markAfterRecordAsCreatedIfCommandLooksCreated( before, after );
        // DynamicRecord has the created flag stored inside them because it's much harder to tell by looking at the command whether or not they are created
        return new Command.LabelTokenCommand( this, before, after );
    }

    private static LabelTokenRecord readLabelTokenRecord( int id, ReadableChannel channel ) throws IOException
    {
        // in_use(byte)+type_blockId(int)+nr_type_records(int)
        byte headerByte = channel.get();
        boolean inUse = false;
        boolean internal = false;
        if ( (headerByte & Record.IN_USE.byteValue()) == Record.IN_USE.byteValue() )
        {
            inUse = true;
            internal = (headerByte & Record.ADDITIONAL_FLAG_1) == Record.ADDITIONAL_FLAG_1;
        }
        else if ( headerByte != Record.NOT_IN_USE.byteValue() )
        {
            throw new IOException( "Illegal in use flag: " + headerByte );
        }
        LabelTokenRecord record = new LabelTokenRecord( id );
        record.setInUse( inUse );
        record.setNameId( channel.getInt() );
        record.setInternal( internal );
        int nrTypeRecords = channel.getInt();
        for ( int i = 0; i < nrTypeRecords; i++ )
        {
            DynamicRecord dr = readDynamicRecord( channel );
            record.addNameRecord( dr );
        }
        return record;
    }

    @Override
    protected Command readPropertyKeyTokenCommand( ReadableChannel channel ) throws IOException
    {
        int id = channel.getInt();
        PropertyKeyTokenRecord before = readPropertyKeyTokenRecord( id, channel );
        if ( before == null )
        {
            return null;
        }

        PropertyKeyTokenRecord after = readPropertyKeyTokenRecord( id, channel );
        if ( after == null )
        {
            return null;
        }

        markAfterRecordAsCreatedIfCommandLooksCreated( before, after );
        // DynamicRecord has the created flag stored inside them because it's much harder to tell by looking at the command whether or not they are created
        return new Command.PropertyKeyTokenCommand( this, before, after );
    }

    private static PropertyKeyTokenRecord readPropertyKeyTokenRecord( int id, ReadableChannel channel ) throws IOException
    {
        // in_use(byte)+count(int)+key_blockId(int)
        byte headerByte = channel.get();
        boolean inUse = false;
        boolean internal = false;
        if ( (headerByte & Record.IN_USE.byteValue()) == Record.IN_USE.byteValue() )
        {
            inUse = true;
            internal = (headerByte & Record.ADDITIONAL_FLAG_1) == Record.ADDITIONAL_FLAG_1;
        }
        else if ( headerByte != Record.NOT_IN_USE.byteValue() )
        {
            throw new IOException( "Illegal in use flag: " + headerByte );
        }
        PropertyKeyTokenRecord record = new PropertyKeyTokenRecord( id );
        record.setInUse( inUse );
        record.setPropertyCount( channel.getInt() );
        record.setNameId( channel.getInt() );
        record.setInternal( internal );
        if ( readDynamicRecords( channel, record, PROPERTY_INDEX_DYNAMIC_RECORD_ADDER ) == -1 )
        {
            return null;
        }
        return record;
    }

    @Override
    protected Command readSchemaRuleCommand( ReadableChannel channel ) throws IOException
    {
        long id = channel.getLong();
        byte schemaRulePresence = channel.get();
        boolean hasSchemaRule = schemaRulePresence == SchemaRecord.COMMAND_HAS_SCHEMA_RULE;
        SchemaRecord before = readSchemaRecord( id, channel );
        SchemaRecord after = readSchemaRecord( id, channel );
        markAfterRecordAsCreatedIfCommandLooksCreated( before, after );

        SchemaRule schemaRule = null;
        if ( hasSchemaRule )
        {
            schemaRule = readSchemaRule( id, channel );
        }
        return new Command.SchemaRuleCommand( this, before, after, schemaRule );
    }

    private static SchemaRecord readSchemaRecord( long id, ReadableChannel channel ) throws IOException
    {
        SchemaRecord schemaRecord = new SchemaRecord( id );
        byte flags = channel.get();
        boolean inUse = bitFlag( flags, Record.IN_USE.byteValue() );
        if ( inUse )
        {
            schemaRecord.setInUse( inUse );
            if ( bitFlag( flags, Record.CREATED_IN_TX ) )
            {
                schemaRecord.setCreated();
            }
            schemaRecord.setUseFixedReferences( bitFlag( flags, Record.USES_FIXED_REFERENCE_FORMAT ) );

            byte schemaFlags = channel.get();
            schemaRecord.setConstraint( bitFlag( schemaFlags, SchemaRecord.SCHEMA_FLAG_IS_CONSTRAINT ) );
            schemaRecord.setNextProp( channel.getLong() );
            if ( bitFlag( flags, Record.HAS_SECONDARY_UNIT ) )
            {
                schemaRecord.setSecondaryUnitIdOnLoad( channel.getLong() );
            }
        }
        else
        {
            schemaRecord.clear();
        }
        return schemaRecord;
    }

    private static SchemaRule readSchemaRule( long id, ReadableChannel channel ) throws IOException
    {
        Map<String,Value> ruleMap = readStringValueMap( channel );
        try
        {
            return unmapifySchemaRule( id, ruleMap );
        }
        catch ( MalformedSchemaRuleException e )
        {
            throw new IOException( "Failed to create a schema rule from string-value map: " + ruleMap, e );
        }
    }

    static Map<String,Value> readStringValueMap( ReadableChannel channel ) throws IOException
    {
        Map<String,Value> map = new HashMap<>();
        int size = channel.getInt();
        for ( int i = 0; i < size; i++ )
        {
            byte[] keyBytes = readMapKeyByteArray( channel );
            String key = UTF8.decode( keyBytes );
            Value value = readMapValue( channel );
            map.put( key, value );
        }
        return map;
    }

    private static byte[] readMapKeyByteArray( ReadableChannel channel ) throws IOException
    {
        int size = channel.getInt();
        byte[] bytes = new byte[size];
        channel.get( bytes, size );
        return bytes;
    }

    private static Value readMapValue( ReadableChannel channel ) throws IOException
    {
        SchemaMapValueType type = SchemaMapValueType.map( channel.get() );
        switch ( type )
        {
        case BOOL_LITERAL_TRUE:
            return Values.booleanValue( true );
        case BOOL_LITERAL_FALSE:
            return Values.booleanValue( false );
        case BOOL_ARRAY_ELEMENT:
            throw new IOException( "Cannot read schema rule map value of type boolean array element as a top-level type." );
        case BYTE:
            return Values.byteValue( channel.get() );
        case SHORT:
            return Values.shortValue( channel.getShort() );
        case INT:
            return Values.intValue( channel.getInt() );
        case LONG:
            return Values.longValue( channel.getLong() );
        case FLOAT:
            return Values.floatValue( channel.getFloat() );
        case DOUBLE:
            return Values.doubleValue( channel.getDouble() );
        case STRING:
        {
            int size = channel.getInt();
            byte[] bytes = new byte[size];
            channel.get( bytes, size );
            return Values.utf8Value( bytes );
        }
        case CHAR:
            return Values.charValue( (char) channel.getInt() );
        case ARRAY:
        {
            int arraySize = channel.getInt();
            SchemaMapValueType elementType = SchemaMapValueType.map( channel.get() );
            switch ( elementType )
            {
            case BOOL_LITERAL_TRUE:
                throw new IOException( "BOOL_LITERAL_TRUE cannot be a schema rule map value array element type." );
            case BOOL_LITERAL_FALSE:
                throw new IOException( "BOOL_LITERAL_FALSE cannot be a schema rule map value array element type." );
            case BOOL_ARRAY_ELEMENT:
            {
                boolean[] array = new boolean[arraySize];
                for ( int i = 0; i < arraySize; i++ )
                {
                    array[i] = channel.get() == SchemaMapValueType.BOOL_LITERAL_TRUE.type();
                }
                return Values.booleanArray( array );
            }
            case BYTE:
            {
                byte[] array = new byte[arraySize];
                for ( int i = 0; i < arraySize; i++ )
                {
                    array[i] = channel.get();
                }
                return Values.byteArray( array );
            }
            case SHORT:
            {
                short[] array = new short[arraySize];
                for ( int i = 0; i < arraySize; i++ )
                {
                    array[i] = channel.getShort();
                }
                return Values.shortArray( array );
            }
            case INT:
            {
                int[] array = new int[arraySize];
                for ( int i = 0; i < arraySize; i++ )
                {
                    array[i] = channel.getInt();
                }
                return Values.intArray( array );
            }
            case LONG:
            {
                long[] array = new long[arraySize];
                for ( int i = 0; i < arraySize; i++ )
                {
                    array[i] = channel.getLong();
                }
                return Values.longArray( array );
            }
            case FLOAT:
            {
                float[] array = new float[arraySize];
                for ( int i = 0; i < arraySize; i++ )
                {
                    array[i] = channel.getFloat();
                }
                return Values.floatArray( array );
            }
            case DOUBLE:
            {
                double[] array = new double[arraySize];
                for ( int i = 0; i < arraySize; i++ )
                {
                    array[i] = channel.getDouble();
                }
                return Values.doubleArray( array );
            }
            case STRING:
            {
                String[] array = new String[arraySize];
                for ( int i = 0; i < arraySize; i++ )
                {
                    int size = channel.getInt();
                    byte[] bytes = new byte[size];
                    channel.get( bytes, size );
                    array[i] = UTF8.decode( bytes );
                }
                return Values.stringArray( array );
            }
            case CHAR:
            {
                char[] array = new char[arraySize];
                for ( int i = 0; i < arraySize; i++ )
                {
                    array[i] = (char) channel.getInt();
                }
                return Values.charArray( array );
            }
            case ARRAY:
                throw new IOException( "Nested arrays are not support for schema rule map values." );
            default:
                throw new IOException( "Unknown array element type: " + elementType );
            }
        } // array case
        default:
            throw new IOException( "Unknown schema map value type: " + type );
        } // switch clause
    }

    private static NodeRecord readNodeRecord( long id, ReadableChannel channel ) throws IOException
    {
        byte flags = channel.get();
        boolean inUse = bitFlag( flags, Record.IN_USE.byteValue() );
        boolean isCreated = bitFlag( flags, Record.CREATED_IN_TX );
        boolean requiresSecondaryUnit = bitFlag( flags, Record.REQUIRE_SECONDARY_UNIT );
        boolean hasSecondaryUnit = bitFlag( flags, Record.HAS_SECONDARY_UNIT );
        boolean usesFixedReferenceFormat = bitFlag( flags, Record.USES_FIXED_REFERENCE_FORMAT );

        NodeRecord record;
        List<DynamicRecord> dynamicLabelRecords = new ArrayList<>();
        long labelField = Record.NO_LABELS_FIELD.intValue();
        if ( inUse )
        {
            boolean dense = channel.get() == 1;
            long nextRel = channel.getLong();
            long nextProp = channel.getLong();
            record = new NodeRecord( id ).initialize( false, nextProp, dense, nextRel, 0 );
            // labels
            labelField = channel.getLong();
            record.setRequiresSecondaryUnit( requiresSecondaryUnit );
            if ( hasSecondaryUnit )
            {
                record.setSecondaryUnitIdOnLoad( channel.getLong() );
            }
            record.setUseFixedReferences( usesFixedReferenceFormat );
        }
        else
        {
            record = new NodeRecord( id );
        }
        readDynamicRecords( channel, dynamicLabelRecords, COLLECTION_DYNAMIC_RECORD_ADDER );
        record.setLabelField( labelField, dynamicLabelRecords );
        record.setInUse( inUse );
        if ( isCreated )
        {
            record.setCreated();
        }
        return record;
    }

    private static RelationshipRecord readRelationshipRecord( long id, ReadableChannel channel ) throws IOException
    {
        byte flags = channel.get();
        boolean inUse = bitFlag( flags, Record.IN_USE.byteValue() );
        boolean requiresSecondaryUnit = bitFlag( flags, Record.REQUIRE_SECONDARY_UNIT );
        boolean hasSecondaryUnit = bitFlag( flags, Record.HAS_SECONDARY_UNIT );
        boolean usesFixedReferenceFormat = bitFlag( flags, Record.USES_FIXED_REFERENCE_FORMAT );

        RelationshipRecord record;
        if ( inUse )
        {
            record = new RelationshipRecord( id );
            record.setLinks( channel.getLong(), channel.getLong(), channel.getInt() );
            record.setInUse( true );
            record.setRequiresSecondaryUnit( requiresSecondaryUnit );
            record.setFirstPrevRel( channel.getLong() );
            record.setFirstNextRel( channel.getLong() );
            record.setSecondPrevRel( channel.getLong() );
            record.setSecondNextRel( channel.getLong() );
            record.setNextProp( channel.getLong() );
            byte extraByte = channel.get();
            record.setFirstInFirstChain( (extraByte & 0x1) > 0 );
            record.setFirstInSecondChain( (extraByte & 0x2) > 0 );
            if ( hasSecondaryUnit )
            {
                record.setSecondaryUnitIdOnLoad( channel.getLong() );
            }
            record.setUseFixedReferences( usesFixedReferenceFormat );
        }
        else
        {
            record = new RelationshipRecord( id );
            record.setLinks( -1, -1, channel.getInt() );
            record.setInUse( false );
        }
        if ( bitFlag( flags, Record.CREATED_IN_TX ) )
        {
            record.setCreated();
        }

        return record;
    }

    private static DynamicRecord readDynamicRecord( ReadableChannel channel ) throws IOException
    {
        // id+type+in_use(byte)+nr_of_bytes(int)+next_block(long)
        long id = channel.getLong();
        assert id >= 0 && id <= (1L << 36) - 1 : id + " is not a valid dynamic record id";
        int type = channel.getInt();
        byte inUseFlag = channel.get();
        boolean inUse = (inUseFlag & Record.IN_USE.byteValue()) != 0;
        DynamicRecord record = new DynamicRecord( id );
        record.setInUse( inUse, type );
        if ( inUse )
        {
            record.setStartRecord( (inUseFlag & Record.ADDITIONAL_FLAG_1) != 0 );
            if ( (inUseFlag & Record.CREATED_IN_TX) != 0 )
            {
                record.setCreated();
            }
            int nrOfBytes = channel.getInt();
            assert nrOfBytes >= 0 && nrOfBytes < ((1 << 24) - 1) : nrOfBytes
                    + " is not valid for a number of bytes field of " + "a dynamic record";
            long nextBlock = channel.getLong();
            assert (nextBlock >= 0 && nextBlock <= (1L << 36 - 1))
                    || (nextBlock == Record.NO_NEXT_BLOCK.intValue()) : nextBlock
                    + " is not valid for a next record field of " + "a dynamic record";
            record.setNextBlock( nextBlock );
            byte[] data = new byte[nrOfBytes];
            channel.get( data, nrOfBytes );
            record.setData( data );
        }
        return record;
    }

    private static <T> int readDynamicRecords( ReadableChannel channel, T target, CommandReading.DynamicRecordAdder<T> adder )
            throws IOException
    {
        int numberOfRecords = channel.getInt();
        assert numberOfRecords >= 0;
        while ( numberOfRecords > 0 )
        {
            DynamicRecord read = readDynamicRecord( channel );
            adder.add( target, read );
            numberOfRecords--;
        }
        return numberOfRecords;
    }

    private static PropertyRecord readPropertyRecord( long id, ReadableChannel channel ) throws IOException
    {
        // in_use(byte)+type(int)+key_indexId(int)+prop_blockId(long)+
        // prev_prop_id(long)+next_prop_id(long)
        PropertyRecord record = new PropertyRecord( id );
        byte flags = channel.get(); // 1

        boolean inUse = bitFlag( flags, Record.IN_USE.byteValue() );
        boolean nodeProperty = !bitFlag( flags, Record.REL_PROPERTY.byteValue() );
        boolean requireSecondaryUnit = bitFlag( flags, Record.REQUIRE_SECONDARY_UNIT );
        boolean hasSecondaryUnit = bitFlag( flags, Record.HAS_SECONDARY_UNIT );
        boolean usesFixedReferenceFormat = bitFlag( flags, Record.USES_FIXED_REFERENCE_FORMAT );

        record.setRequiresSecondaryUnit( requireSecondaryUnit );
        record.setUseFixedReferences( usesFixedReferenceFormat );

        long nextProp = channel.getLong(); // 8
        long prevProp = channel.getLong(); // 8
        record.setNextProp( nextProp );
        record.setPrevProp( prevProp );

        long primitiveId = channel.getLong(); // 8
        if ( primitiveId != -1 && nodeProperty )
        {
            record.setNodeId( primitiveId );
        }
        else if ( primitiveId != -1 )
        {
            record.setRelId( primitiveId );
        }
        if ( hasSecondaryUnit )
        {
            record.setSecondaryUnitIdOnLoad( channel.getLong() );
        }
        int nrPropBlocks = channel.get();
        assert nrPropBlocks >= 0;
        if ( nrPropBlocks > 0 )
        {
            record.setInUse( true );
        }
        while ( nrPropBlocks-- > 0 )
        {
            PropertyBlock block = readPropertyBlock( channel );
            if ( block == null )
            {
                return null;
            }
            record.addPropertyBlock( block );
        }
        int deletedRecords = readDynamicRecords( channel, record, PROPERTY_DELETED_DYNAMIC_RECORD_ADDER );
        if ( deletedRecords == -1 )
        {
            return null;
        }
        assert deletedRecords >= 0;
        while ( deletedRecords-- > 0 )
        {
            DynamicRecord read = readDynamicRecord( channel );
            record.addDeletedRecord( read );
        }
        if ( (inUse && !record.inUse()) || (!inUse && record.inUse()) )
        {
            throw new IllegalStateException( "Weird, inUse was read in as " + inUse + " but the record is " + record );
        }
        return record;
    }

    private static PropertyBlock readPropertyBlock( ReadableChannel channel ) throws IOException
    {
        PropertyBlock toReturn = new PropertyBlock();
        byte blockSize = channel.get(); // the size is stored in bytes // 1
        assert blockSize > 0 && blockSize % 8 == 0 : blockSize + " is not a valid block size value";
        // Read in blocks
        long[] blocks = readLongs( channel, blockSize / 8 );
        assert blocks.length == blockSize / 8 : blocks.length
                + " longs were read in while i asked for what corresponds to " + blockSize;

        assert PropertyType.getPropertyTypeOrThrow( blocks[0] ).calculateNumberOfBlocksUsed(
                blocks[0] ) == blocks.length : blocks.length + " is not a valid number of blocks for type "
                + PropertyType.getPropertyTypeOrThrow( blocks[0] );
        /*
         *  Ok, now we may be ready to return, if there are no DynamicRecords. So
         *  we start building the Object
         */
        toReturn.setValueBlocks( blocks );
        /*
         * Read in existence of DynamicRecords. Remember, this has already been
         * read in the buffer with the blocks, above.
         */
        if ( readDynamicRecords( channel, toReturn, PROPERTY_BLOCK_DYNAMIC_RECORD_ADDER ) == -1 )
        {
            return null;
        }
        return toReturn;
    }

    private static long[] readLongs( ReadableChannel channel, int count ) throws IOException
    {
        long[] result = new long[count];
        for ( int i = 0; i < count; i++ )
        {
            result[i] = channel.getLong();
        }
        return result;
    }

    @Override
    protected Command readNodeCountsCommand( ReadableChannel channel ) throws IOException
    {
        int labelId = channel.getInt();
        long delta = channel.getLong();
        return new Command.NodeCountsCommand( this, labelId, delta );
    }

    @Override
    protected Command readRelationshipCountsCommand( ReadableChannel channel ) throws IOException
    {
        int startLabelId = channel.getInt();
        int typeId = channel.getInt();
        int endLabelId = channel.getInt();
        long delta = channel.getLong();
        return new Command.RelationshipCountsCommand( this, startLabelId, typeId, endLabelId, delta );
    }

    @Override
    protected Command readNeoStoreCommand( ReadableChannel channel ) throws IOException
    {
        throw unsupportedInThisVersionException();
    }

    static void markAfterRecordAsCreatedIfCommandLooksCreated( AbstractBaseRecord before, AbstractBaseRecord after )
    {
        if ( !before.inUse() && after.inUse() )
        {
            after.setCreated();
        }
        if ( !before.hasSecondaryUnitId() && after.hasSecondaryUnitId() )
        {
            // Override the "load" of the secondary unit to be a create since the before state didn't have it and the after does
            after.setSecondaryUnitIdOnCreate( after.getSecondaryUnitId() );
        }
    }

    private enum SchemaMapValueType
    {
        // NOTE: Enum order (specifically, the enum ordinal) is part of the binary format!
        BOOL_LITERAL_TRUE,
        BOOL_LITERAL_FALSE,
        BOOL_ARRAY_ELEMENT,
        BYTE,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        STRING,
        CHAR,
        ARRAY;

        private static final SchemaMapValueType[] TYPE_ID_TO_ENUM = values(); // This works because 'type' is equal to ordinal.

        public static SchemaMapValueType map( byte type )
        {
            return TYPE_ID_TO_ENUM[type];
        }

        public static SchemaMapValueType map( ValueWriter.ArrayType arrayType ) throws IOException
        {
            switch ( arrayType )
            {
            case BYTE:
                return BYTE;
            case SHORT:
                return SHORT;
            case INT:
                return INT;
            case LONG:
                return LONG;
            case FLOAT:
                return FLOAT;
            case DOUBLE:
                return DOUBLE;
            case BOOLEAN:
                return BOOL_ARRAY_ELEMENT;
            case STRING:
                return STRING;
            case CHAR:
                return CHAR;
            case POINT:
            case ZONED_DATE_TIME:
            case LOCAL_DATE_TIME:
            case DATE:
            case ZONED_TIME:
            case LOCAL_TIME:
            case DURATION:
            default:
                throw new IOException( "Unsupported schema record map value type: " + arrayType );
            }
        }

        public byte type()
        {
            return (byte) ordinal();
        }
    }

    @Override
    public void writeNodeCommand( WritableChannel channel, Command.NodeCommand command ) throws IOException
    {
        channel.put( NeoCommandType.NODE_COMMAND );
        channel.putLong( command.getAfter().getId() );
        writeNodeRecord( channel, command.getBefore() );
        writeNodeRecord( channel, command.getAfter() );
    }

    private static void writeNodeRecord( WritableChannel channel, NodeRecord record ) throws IOException
    {
        byte flags = bitFlags( bitFlag( record.inUse(), Record.IN_USE.byteValue() ),
                bitFlag( record.isCreated(), Record.CREATED_IN_TX ),
                bitFlag( record.requiresSecondaryUnit(), Record.REQUIRE_SECONDARY_UNIT ),
                bitFlag( record.hasSecondaryUnitId(), Record.HAS_SECONDARY_UNIT ),
                bitFlag( record.isUseFixedReferences(), Record.USES_FIXED_REFERENCE_FORMAT ) );
        channel.put( flags );
        if ( record.inUse() )
        {
            channel.put( record.isDense() ? (byte) 1 : (byte) 0 );
            channel.putLong( record.getNextRel() ).putLong( record.getNextProp() );
            channel.putLong( record.getLabelField() );
            if ( record.hasSecondaryUnitId() )
            {
                channel.putLong( record.getSecondaryUnitId() );
            }
        }
        // Always write dynamic label records because we want to know which ones have been deleted
        // especially if the node has been deleted.
        writeDynamicRecords( channel, record.getDynamicLabelRecords() );
    }

    @Override
    public void writeRelationshipCommand( WritableChannel channel, Command.RelationshipCommand command ) throws IOException
    {
        channel.put( NeoCommandType.REL_COMMAND );
        channel.putLong( command.getAfter().getId() );
        writeRelationshipRecord( channel, command.getBefore() );
        writeRelationshipRecord( channel, command.getAfter() );
    }

    private static void writeRelationshipRecord( WritableChannel channel, RelationshipRecord record ) throws IOException
    {
        byte flags = bitFlags( bitFlag( record.inUse(), Record.IN_USE.byteValue() ),
                bitFlag( record.isCreated(), Record.CREATED_IN_TX ),
                bitFlag( record.requiresSecondaryUnit(), Record.REQUIRE_SECONDARY_UNIT ),
                bitFlag( record.hasSecondaryUnitId(), Record.HAS_SECONDARY_UNIT ),
                bitFlag( record.isUseFixedReferences(), Record.USES_FIXED_REFERENCE_FORMAT ) );
        channel.put( flags );
        if ( record.inUse() )
        {
            channel.putLong( record.getFirstNode() ).putLong( record.getSecondNode() ).putInt( record.getType() )
                    .putLong( record.getFirstPrevRel() ).putLong( record.getFirstNextRel() )
                    .putLong( record.getSecondPrevRel() ).putLong( record.getSecondNextRel() )
                    .putLong( record.getNextProp() )
                    .put( (byte) ((record.isFirstInFirstChain() ? 1 : 0) | (record.isFirstInSecondChain() ? 2 : 0)) );
            if ( record.hasSecondaryUnitId() )
            {
                channel.putLong( record.getSecondaryUnitId() );
            }
        }
        else
        {
            channel.putInt( record.getType() );
        }
    }

    @Override
    public void writePropertyCommand( WritableChannel channel, Command.PropertyCommand command ) throws IOException
    {
        channel.put( NeoCommandType.PROP_COMMAND );
        channel.putLong( command.getAfter().getId() );
        writePropertyRecord( channel, command.getBefore() );
        writePropertyRecord( channel, command.getAfter() );
    }

    private static void writePropertyRecord( WritableChannel channel, PropertyRecord record ) throws IOException
    {
        byte flags = bitFlags( bitFlag( record.inUse(), Record.IN_USE.byteValue() ),
                bitFlag( record.getRelId() != -1, Record.REL_PROPERTY.byteValue() ),
                bitFlag( record.requiresSecondaryUnit(), Record.REQUIRE_SECONDARY_UNIT ),
                bitFlag( record.hasSecondaryUnitId(), Record.HAS_SECONDARY_UNIT ),
                bitFlag( record.isUseFixedReferences(), Record.USES_FIXED_REFERENCE_FORMAT ) );

        channel.put( flags ); // 1
        channel.putLong( record.getNextProp() ).putLong( record.getPrevProp() ); // 8 + 8
        long nodeId = record.getNodeId();
        long relId = record.getRelId();
        if ( nodeId != -1 )
        {
            channel.putLong( nodeId ); // 8 or
        }
        else if ( relId != -1 )
        {
            channel.putLong( relId ); // 8 or
        }
        else
        {
            // means this records value has not changed, only place in
            // prop chain
            channel.putLong( -1 ); // 8
        }
        if ( record.hasSecondaryUnitId() )
        {
            channel.putLong( record.getSecondaryUnitId() );
        }
        int numberOfProperties = record.numberOfProperties();
        channel.put( (byte) numberOfProperties ); // 1
        PropertyBlock[] blocks = record.getPropertyBlocks();
        for ( int i = 0; i < numberOfProperties; i++ )
        {
            PropertyBlock block = blocks[i];
            assert block.getSize() > 0 : record + " has incorrect size";
            writePropertyBlock( channel, block );
        }
        writeDynamicRecords( channel, record.getDeletedRecords() );
    }

    private static void writePropertyBlock( WritableChannel channel, PropertyBlock block ) throws IOException
    {
        byte blockSize = (byte) block.getSize();
        assert blockSize > 0 : blockSize + " is not a valid block size value";
        channel.put( blockSize ); // 1
        long[] propBlockValues = block.getValueBlocks();
        for ( long propBlockValue : propBlockValues )
        {
            channel.putLong( propBlockValue );
        }
        /*
         * For each block we need to keep its dynamic record chain if
         * it is just created. Deleted dynamic records are in the property
         * record and dynamic records are never modified. Also, they are
         * assigned as a whole, so just checking the first should be enough.
         */
        if ( block.isLight() )
        {
            /*
             *  This has to be int. If this record is not light
             *  then we have the number of DynamicRecords that follow,
             *  which is an int. We do not currently want/have a flag bit so
             *  we simplify by putting an int here always
             */
            channel.putInt( 0 ); // 4 or
        }
        else
        {
            writeDynamicRecords( channel, block.getValueRecords() );
        }
    }

    /**
     * This command can be serialized into two different command types, depending on if the relationship type will fit in 2 or 3 bytes.
     * High-limit format might require more bytes, this was unfortunately not tested properly, so this is an afterthought.
     * This approach was chosen to minimize impact of introducing a new command in a patch release, that could prevent
     * users from upgrading.
     */
    @Override
    public void writeRelationshipGroupCommand( WritableChannel channel, Command.RelationshipGroupCommand command ) throws IOException
    {
        int relType = Math.max( command.getBefore().getType(), command.getAfter().getType() );
        if ( relType == Record.NULL_REFERENCE.intValue() || relType >>> Short.SIZE == 0 )
        {
            // relType will fit in a short
            channel.put( NeoCommandType.REL_GROUP_COMMAND );
            channel.putLong( command.getAfter().getId() );
            writeRelationshipGroupRecord( channel, command.getBefore() );
            writeRelationshipGroupRecord( channel, command.getAfter() );
        }
        else
        {
            // here we need 3 bytes to store the relType
            channel.put( NeoCommandType.REL_GROUP_EXTENDED_COMMAND );
            channel.putLong( command.getAfter().getId() );
            writeRelationshipGroupExtendedRecord( channel, command.getBefore() );
            writeRelationshipGroupExtendedRecord( channel, command.getAfter() );
        }
    }

    private static void writeRelationshipGroupRecord( WritableChannel channel, RelationshipGroupRecord record )
            throws IOException
    {
        byte flags = bitFlags( bitFlag( record.inUse(), Record.IN_USE.byteValue() ),
                bitFlag( record.requiresSecondaryUnit(), Record.REQUIRE_SECONDARY_UNIT ),
                bitFlag( record.hasSecondaryUnitId(), Record.HAS_SECONDARY_UNIT ),
                bitFlag( record.isUseFixedReferences(), Record.USES_FIXED_REFERENCE_FORMAT ) );
        channel.put( flags );
        channel.putShort( (short) record.getType() );
        channel.putLong( record.getNext() );
        channel.putLong( record.getFirstOut() );
        channel.putLong( record.getFirstIn() );
        channel.putLong( record.getFirstLoop() );
        channel.putLong( record.getOwningNode() );
        if ( record.hasSecondaryUnitId() )
        {
            channel.putLong( record.getSecondaryUnitId() );
        }
    }

    private void writeRelationshipGroupExtendedRecord( WritableChannel channel, RelationshipGroupRecord record ) throws IOException
    {
        byte flags = bitFlags( bitFlag( record.inUse(), Record.IN_USE.byteValue() ),
                bitFlag( record.requiresSecondaryUnit(), Record.REQUIRE_SECONDARY_UNIT ),
                bitFlag( record.hasSecondaryUnitId(), Record.HAS_SECONDARY_UNIT ),
                bitFlag( record.isUseFixedReferences(), Record.USES_FIXED_REFERENCE_FORMAT ) );
        channel.put( flags );
        channel.putShort( (short) record.getType() );
        channel.put( (byte) (record.getType() >>> Short.SIZE) );
        channel.putLong( record.getNext() );
        channel.putLong( record.getFirstOut() );
        channel.putLong( record.getFirstIn() );
        channel.putLong( record.getFirstLoop() );
        channel.putLong( record.getOwningNode() );
        if ( record.hasSecondaryUnitId() )
        {
            channel.putLong( record.getSecondaryUnitId() );
        }
    }

    @Override
    public void writeRelationshipTypeTokenCommand( WritableChannel channel, Command.RelationshipTypeTokenCommand command ) throws IOException
    {
        channel.put( NeoCommandType.REL_TYPE_COMMAND );
        channel.putInt( command.getAfter().getIntId() );
        writeRelationshipTypeTokenRecord( channel, command.getBefore() );
        writeRelationshipTypeTokenRecord( channel, command.getAfter() );
    }

    private static void writeRelationshipTypeTokenRecord( WritableChannel channel, RelationshipTypeTokenRecord record ) throws IOException
    {
        // id+in_use(byte)+count(int)+key_blockId(int)+nr_key_records(int)
        byte headerByte = record.inUse() ? Record.IN_USE.byteValue() : Record.NOT_IN_USE.byteValue();
        headerByte += record.isInternal() ? Record.ADDITIONAL_FLAG_1 : 0;
        channel.put( headerByte );
        channel.putInt( record.getNameId() );
        if ( record.isLight() )
        {
            channel.putInt( 0 );
        }
        else
        {
            writeDynamicRecords( channel, record.getNameRecords() );
        }
    }

    @Override
    public void writeLabelTokenCommand( WritableChannel channel, Command.LabelTokenCommand command ) throws IOException
    {
        channel.put( NeoCommandType.LABEL_KEY_COMMAND );
        channel.putInt( command.getAfter().getIntId() );
        writeLabelTokenRecord( channel, command.getBefore() );
        writeLabelTokenRecord( channel, command.getAfter() );
    }

    private static void writeLabelTokenRecord( WritableChannel channel, LabelTokenRecord record ) throws IOException
    {
        // id+in_use(byte)+type_blockId(int)+nr_type_records(int)
        byte headerByte = record.inUse() ? Record.IN_USE.byteValue() : Record.NOT_IN_USE.byteValue();
        headerByte += record.isInternal() ? Record.ADDITIONAL_FLAG_1 : 0;
        channel.put( headerByte ).putInt( record.getNameId() );
        writeDynamicRecords( channel, record.getNameRecords() );
    }

    @Override
    public void writePropertyKeyTokenCommand( WritableChannel channel, Command.PropertyKeyTokenCommand command ) throws IOException
    {
        channel.put( NeoCommandType.PROP_INDEX_COMMAND );
        channel.putInt( command.getAfter().getIntId() );
        writePropertyKeyTokenRecord( channel, command.getBefore() );
        writePropertyKeyTokenRecord( channel, command.getAfter() );
    }

    private static void writePropertyKeyTokenRecord( WritableChannel channel, PropertyKeyTokenRecord record ) throws IOException
    {
        // id+in_use(byte)+count(int)+key_blockId(int)+nr_key_records(int)
        byte headerByte = record.inUse() ? Record.IN_USE.byteValue() : Record.NOT_IN_USE.byteValue();
        headerByte += record.isInternal() ? Record.ADDITIONAL_FLAG_1 : 0;
        channel.put( headerByte );
        channel.putInt( record.getPropertyCount() ).putInt( record.getNameId() );
        if ( record.isLight() )
        {
            channel.putInt( 0 );
        }
        else
        {
            writeDynamicRecords( channel, record.getNameRecords() );
        }
    }

    @Override
    public void writeSchemaRuleCommand( WritableChannel channel, Command.SchemaRuleCommand command ) throws IOException
    {
        channel.put( NeoCommandType.SCHEMA_RULE_COMMAND );
        channel.putLong( command.getBefore().getId() );
        SchemaRule schemaRule = command.getSchemaRule();
        boolean hasSchemaRule = schemaRule != null;
        channel.put( hasSchemaRule ? SchemaRecord.COMMAND_HAS_SCHEMA_RULE : SchemaRecord.COMMAND_HAS_NO_SCHEMA_RULE );
        writeSchemaRecord( channel, command.getBefore() );
        writeSchemaRecord( channel, command.getAfter() );
        if ( hasSchemaRule )
        {
            writeSchemaRule( channel, schemaRule );
        }
    }

    private static void writeSchemaRecord( WritableChannel channel, SchemaRecord record ) throws IOException
    {
        byte flags = bitFlags( bitFlag( record.inUse(), Record.IN_USE.byteValue() ),
                bitFlag( record.isCreated(), Record.CREATED_IN_TX ),
                bitFlag( record.isUseFixedReferences(), Record.USES_FIXED_REFERENCE_FORMAT ),
                bitFlag( record.hasSecondaryUnitId(), Record.HAS_SECONDARY_UNIT ) );
        channel.put( flags );
        if ( record.inUse() )
        {
            byte schemaFlags = bitFlag( record.isConstraint(), SchemaRecord.SCHEMA_FLAG_IS_CONSTRAINT );
            channel.put( schemaFlags );
            channel.putLong( record.getNextProp() );
            if ( record.hasSecondaryUnitId() )
            {
                channel.putLong( record.getSecondaryUnitId() );
            }
        }
    }

    private static void writeSchemaRule( WritableChannel channel, SchemaRule schemaRule ) throws IOException
    {
        Map<String,Value> ruleMap = SchemaRuleMapifier.mapifySchemaRule( schemaRule );
        writeStringValueMap( channel, ruleMap );
    }

    /**
     * @see LogCommandSerializationV4_0#readStringValueMap(ReadableChannel)
     */
    static void writeStringValueMap( WritableChannel channel, Map<String,Value> ruleMap ) throws IOException
    {
        channel.putInt( ruleMap.size() );
        for ( Map.Entry<String,Value> entry : ruleMap.entrySet() )
        {
            writeMapKeyByteArray( channel, UTF8.encode( entry.getKey() ) );
            writeMapValue( channel, entry.getValue() );
        }
    }

    private static void writeMapKeyByteArray( WritableChannel channel, byte[] bytes ) throws IOException
    {
        channel.putInt( bytes.length );
        channel.put( bytes, bytes.length );
    }

    private static void writeMapValue( WritableChannel channel, Value value ) throws IOException
    {
        value.writeTo( new ValueWriter<IOException>()
        {
            private boolean arrayContext;

            @Override
            public void writeNull() throws IOException
            {
                throw new IOException( "Cannot write null entry value in schema record map representation." );
            }

            @Override
            public void writeBoolean( boolean value ) throws IOException
            {
                if ( value )
                {
                    channel.put( SchemaMapValueType.BOOL_LITERAL_TRUE.type() );
                }
                else
                {
                    channel.put( SchemaMapValueType.BOOL_LITERAL_FALSE.type() );
                }
            }

            @Override
            public void writeInteger( byte value ) throws IOException
            {
                if ( !arrayContext )
                {
                    channel.put( SchemaMapValueType.BYTE.type() );
                }
                channel.put( value );
            }

            @Override
            public void writeInteger( short value ) throws IOException
            {
                if ( !arrayContext )
                {
                    channel.put( SchemaMapValueType.SHORT.type() );
                }
                channel.putShort( value );
            }

            @Override
            public void writeInteger( int value ) throws IOException
            {
                if ( !arrayContext )
                {
                    channel.put( SchemaMapValueType.INT.type() );
                }
                channel.putInt( value );
            }

            @Override
            public void writeInteger( long value ) throws IOException
            {
                if ( !arrayContext )
                {
                    channel.put( SchemaMapValueType.LONG.type() );
                }
                channel.putLong( value );
            }

            @Override
            public void writeFloatingPoint( float value ) throws IOException
            {
                if ( !arrayContext )
                {
                    channel.put( SchemaMapValueType.FLOAT.type() );
                }
                channel.putFloat( value );
            }

            @Override
            public void writeFloatingPoint( double value ) throws IOException
            {
                if ( !arrayContext )
                {
                    channel.put( SchemaMapValueType.DOUBLE.type() );
                }
                channel.putDouble( value );
            }

            @Override
            public void writeString( String value ) throws IOException
            {
                if ( !arrayContext )
                {
                    channel.put( SchemaMapValueType.STRING.type() );
                }
                byte[] bytes = UTF8.encode( value );
                channel.putInt( bytes.length );
                channel.put( bytes, bytes.length );
            }

            @Override
            public void writeString( char value ) throws IOException
            {
                if ( !arrayContext )
                {
                    channel.put( SchemaMapValueType.CHAR.type() );
                }
                channel.putInt( value );
            }

            @Override
            public void beginArray( int size, ValueWriter.ArrayType arrayType ) throws IOException
            {
                arrayContext = true;
                channel.put( SchemaMapValueType.ARRAY.type() );
                channel.putInt( size );
                channel.put( SchemaMapValueType.map( arrayType ).type() );
            }

            @Override
            public void endArray()
            {
                arrayContext = false;
            }

            @Override
            public void writeByteArray( byte[] value ) throws IOException
            {
                beginArray( value.length, ArrayType.BYTE );
                for ( byte b : value )
                {
                    writeInteger( b );
                }
                endArray();
            }

            @Override
            public void writePoint( CoordinateReferenceSystem crs, double[] coordinate ) throws IOException
            {
                throw new IOException( "Point is not a supported schema map value type." );
            }

            @Override
            public void writeDuration( long months, long days, long seconds, int nanos ) throws IOException
            {
                throw new IOException( "Duration is not a supported schema map value type." );
            }

            @Override
            public void writeDate( LocalDate localDate ) throws IOException
            {
                throw new IOException( "Date is not a supported schema map value type." );
            }

            @Override
            public void writeLocalTime( LocalTime localTime ) throws IOException
            {
                throw new IOException( "LocalTime is not a supported schema map value type." );
            }

            @Override
            public void writeTime( OffsetTime offsetTime ) throws IOException
            {
                throw new IOException( "OffsetTime is not a supported schema map value type." );
            }

            @Override
            public void writeLocalDateTime( LocalDateTime localDateTime ) throws IOException
            {
                throw new IOException( "LocalDateTime is not a supported schema map value type." );
            }

            @Override
            public void writeDateTime( ZonedDateTime zonedDateTime ) throws IOException
            {
                throw new IOException( "DateTime is not a supported schema map value type." );
            }
        } );
    }

    @Override
    public void writeNodeCountsCommand( WritableChannel channel, Command.NodeCountsCommand command ) throws IOException
    {
        channel.put( NeoCommandType.UPDATE_NODE_COUNTS_COMMAND );
        channel.putInt( command.labelId() )
                .putLong( command.delta() );
    }

    @Override
    public void writeRelationshipCountsCommand( WritableChannel channel, Command.RelationshipCountsCommand command ) throws IOException
    {
        channel.put( NeoCommandType.UPDATE_RELATIONSHIP_COUNTS_COMMAND );
        channel.putInt( command.startLabelId() )
                .putInt( command.typeId() )
                .putInt( command.endLabelId() )
                .putLong( command.delta() );
    }

    static void writeDynamicRecords( WritableChannel channel, List<DynamicRecord> records ) throws IOException
    {
        writeDynamicRecords( channel, records, records.size() );
    }

    static void writeDynamicRecords( WritableChannel channel, List<DynamicRecord> records, int size ) throws IOException
    {
        channel.putInt( size ); // 4
        for ( int i = 0; i < records.size(); i++ )
        {
            writeDynamicRecord( channel, records.get( i ) );
        }
    }

    static void writeDynamicRecord( WritableChannel channel, DynamicRecord record ) throws IOException
    {
        // id+type+in_use(byte)+nr_of_bytes(int)+next_block(long)
        if ( record.inUse() )
        {
            byte inUse = Record.IN_USE.byteValue();
            if ( record.isCreated() )
            {
                inUse |= Record.CREATED_IN_TX;
            }
            if ( record.isStartRecord() )
            {
                inUse |= Record.ADDITIONAL_FLAG_1;
            }
            channel.putLong( record.getId() )
                    .putInt( record.getTypeAsInt() )
                    .put( inUse )
                    .putInt( record.getLength() )
                    .putLong( record.getNextBlock() );
            byte[] data = record.getData();
            assert data != null;
            channel.put( data, data.length );
        }
        else
        {
            byte inUse = Record.NOT_IN_USE.byteValue();
            channel.putLong( record.getId() )
                    .putInt( record.getTypeAsInt() )
                    .put( inUse );
        }
    }

    @Override
    protected Command readLegacySchemaRuleCommand( ReadableChannel channel ) throws IOException
    {
        throw unsupportedInThisVersionException();
    }

    @Override
    protected Command readIndexDefineCommand( ReadableChannel channel ) throws IOException
    {
        throw unsupportedInThisVersionException();
    }

    @Override
    protected Command readIndexAddNodeCommand( ReadableChannel channel ) throws IOException
    {
        throw unsupportedInThisVersionException();
    }

    @Override
    protected Command readIndexAddRelationshipCommand( ReadableChannel channel ) throws IOException
    {
        throw unsupportedInThisVersionException();
    }

    @Override
    protected Command readIndexCreateCommand( ReadableChannel channel ) throws IOException
    {
        throw unsupportedInThisVersionException();
    }

    @Override
    protected Command readIndexDeleteCommand( ReadableChannel channel ) throws IOException
    {
        throw unsupportedInThisVersionException();
    }

    @Override
    protected Command readIndexRemoveCommand( ReadableChannel channel ) throws IOException
    {
        throw unsupportedInThisVersionException();
    }
}
