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
package org.neo4j.internal.recordstorage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.kernel.impl.store.record.Record;
import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;
import org.neo4j.storageengine.api.CommandReader;
import org.neo4j.storageengine.api.StorageCommand;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.neo4j.internal.recordstorage.Command.RelationshipGroupCommand;

class PhysicalLogCommandReadersTest
{
    private static final long ID = 42;
    private static final byte IN_USE_FLAG = Record.IN_USE.byteValue();
    private static final short TYPE = (short) (Short.MAX_VALUE + 42);
    private static final int TYPE_AS_INT = TYPE & 0xFFFF;
    private static final long NEXT = 42;
    private static final long FIRST_OUT = 42;
    private static final long FIRST_IN = 42;
    private static final long FIRST_LOOP = 42;
    private static final long OWNING_NODE = 42;

    @ParameterizedTest
    @ValueSource( classes = {LogCommandSerializationV3_0_10.class, LogCommandSerializationV4_0.class} )
    void readRelGroupWithHugeType( Class<CommandReader> readerClass )
            throws IOException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException
    {
        assertCanReadRelGroup( readerClass.getDeclaredConstructor().newInstance() );
    }

    private static void assertCanReadRelGroup( CommandReader reader ) throws IOException
    {
        StorageCommand command = reader.read( channelWithRelGroupRecord() );
        assertValidRelGroupCommand( command );
    }

    private static void assertValidRelGroupCommand( StorageCommand command )
    {
        assertThat( command ).isInstanceOf( RelationshipGroupCommand.class );
        RelationshipGroupCommand relGroupCommand = (RelationshipGroupCommand) command;
        RelationshipGroupRecord record = relGroupCommand.getAfter();

        assertEquals( ID, record.getId() );
        if ( IN_USE_FLAG == Record.IN_USE.byteValue() )
        {
            Assertions.assertTrue( record.inUse() );
        }
        else if ( IN_USE_FLAG == Record.NOT_IN_USE.byteValue() )
        {
            Assertions.assertFalse( record.inUse() );
        }
        else
        {
            throw new IllegalStateException( "Illegal inUse flag: " + IN_USE_FLAG );
        }
        assertEquals( TYPE_AS_INT, record.getType() );
        assertEquals( NEXT, record.getNext() );
        assertEquals( FIRST_OUT, record.getFirstOut() );
        assertEquals( FIRST_IN, record.getFirstIn() );
        assertEquals( FIRST_LOOP, record.getNext() );
        assertEquals( OWNING_NODE, record.getOwningNode() );
    }

    private static ReadableChannel channelWithRelGroupRecord() throws IOException
    {
        return channelWithRelGroupRecord( ID, IN_USE_FLAG, TYPE, NEXT, FIRST_OUT, FIRST_IN, FIRST_LOOP, OWNING_NODE );
    }

    private static ReadableChannel channelWithRelGroupRecord( long id, byte inUse, short type, long next,
            long firstOut, long firstIn, long firstLoop, long owningNode ) throws IOException
    {
        ReadableChannel channel = mock( ReadableChannel.class );

        when( channel.get() ).thenReturn( NeoCommandType.REL_GROUP_COMMAND ).thenReturn( inUse );
        when( channel.getLong() ).thenReturn( id ).thenReturn( next ).thenReturn( firstOut ).thenReturn( firstIn )
                .thenReturn( firstLoop ).thenReturn( owningNode );
        when( channel.getShort() ).thenReturn( type );

        return channel;
    }
}
