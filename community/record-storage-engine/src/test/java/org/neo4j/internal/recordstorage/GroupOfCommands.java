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

import java.io.IOException;
import java.util.Iterator;

import org.neo4j.common.Subject;
import org.neo4j.internal.helpers.collection.Iterators;
import org.neo4j.internal.helpers.collection.Visitor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.storageengine.api.CommandsToApply;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.storageengine.api.TransactionIdStore;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static org.neo4j.io.pagecache.context.CursorContext.NULL;

public class GroupOfCommands implements CommandsToApply
{
    private final long transactionId;
    private final StoreCursors storeCursors;
    private final StorageCommand[] commands;
    GroupOfCommands next;

    public GroupOfCommands( StoreCursors storeCursors, StorageCommand... commands )
    {
        this( TransactionIdStore.BASE_TX_ID, storeCursors, commands );
    }

    public GroupOfCommands( long transactionId, StoreCursors storeCursors, StorageCommand... commands )
    {
        this.transactionId = transactionId;
        this.storeCursors = storeCursors;
        this.commands = commands;
    }

    @Override
    public long transactionId()
    {
        return transactionId;
    }

    @Override
    public Subject subject()
    {
        return Subject.SYSTEM;
    }

    @Override
    public CursorContext cursorContext()
    {
        return NULL;
    }

    @Override
    public StoreCursors storeCursors()
    {
        return storeCursors;
    }

    @Override
    public CommandsToApply next()
    {
        return next;
    }

    @Override
    public boolean accept( Visitor<StorageCommand,IOException> visitor ) throws IOException
    {
        for ( StorageCommand command : commands )
        {
            if ( visitor.visit( command ) )
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<StorageCommand> iterator()
    {
        return Iterators.iterator( commands );
    }
}
