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
package org.neo4j.kernel.impl.transaction.log;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.neo4j.internal.helpers.collection.Visitor;
import org.neo4j.internal.kernel.api.security.AuthSubject;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.transaction.TransactionRepresentation;
import org.neo4j.storageengine.api.StorageCommand;

import static java.lang.String.format;

public class PhysicalTransactionRepresentation implements TransactionRepresentation
{
    private final List<StorageCommand> commands;
    private byte[] additionalHeader;
    private long timeStarted;
    private long latestCommittedTxWhenStarted;
    private long timeCommitted;
    private AuthSubject subject;

    /**
     * This is a bit of a smell since it's only used for coordinating transactions in a cluster.
     * We may want to refactor this design later on.
     */
    private int leaseId;

    public PhysicalTransactionRepresentation( List<StorageCommand> commands )
    {
        this.commands = commands;
    }

    public PhysicalTransactionRepresentation( List<StorageCommand> commands, byte[] additionalHeader, long timeStarted, long latestCommittedTxWhenStarted,
            long timeCommitted, int leaseId, AuthSubject subject )
    {
        this( commands );
        setHeader( additionalHeader, timeStarted, latestCommittedTxWhenStarted, timeCommitted, leaseId, subject );
    }

    public void setAdditionalHeader( byte[] additionalHeader )
    {
        this.additionalHeader = additionalHeader;
    }

    public void setHeader( byte[] additionalHeader, long timeStarted, long latestCommittedTxWhenStarted, long timeCommitted, int leaseId, AuthSubject subject )
    {
        this.additionalHeader = additionalHeader;
        this.timeStarted = timeStarted;
        this.latestCommittedTxWhenStarted = latestCommittedTxWhenStarted;
        this.timeCommitted = timeCommitted;
        this.leaseId = leaseId;
        this.subject = subject;
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
    public byte[] additionalHeader()
    {
        return additionalHeader;
    }

    @Override
    public long getTimeStarted()
    {
        return timeStarted;
    }

    @Override
    public long getLatestCommittedTxWhenStarted()
    {
        return latestCommittedTxWhenStarted;
    }

    @Override
    public long getTimeCommitted()
    {
        return timeCommitted;
    }

    @Override
    public int getLeaseId()
    {
        return leaseId;
    }

    @Override
    public AuthSubject getAuthSubject()
    {
        return subject;
    }

    @Override
    public KernelVersion version()
    {
        return commands.isEmpty() ? null : commands.get( 0 ).version();
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }

        PhysicalTransactionRepresentation that = (PhysicalTransactionRepresentation) o;
        return latestCommittedTxWhenStarted == that.latestCommittedTxWhenStarted
               && timeStarted == that.timeStarted
               && Arrays.equals( additionalHeader, that.additionalHeader )
               && commands.equals( that.commands );
    }

    @Override
    public int hashCode()
    {
        int result = commands.hashCode();
        result = 31 * result + (additionalHeader != null ? Arrays.hashCode( additionalHeader ) : 0);
        result = 31 * result + (int) (timeStarted ^ (timeStarted >>> 32));
        result = 31 * result + (int) (latestCommittedTxWhenStarted ^ (latestCommittedTxWhenStarted >>> 32));
        return result;
    }

    @Override
    public String toString()
    {
        return toString( false );
    }

    public String toString( boolean includeCommands )
    {
        String basic = format( "%s[timeStarted:%d, latestCommittedTxWhenStarted:%d, timeCommitted:%d, lease:%d, additionalHeader:%s, commands.length:%d",
                getClass().getSimpleName(), timeStarted, latestCommittedTxWhenStarted, timeCommitted, leaseId, Arrays.toString( additionalHeader ),
                commands.size() );
        if ( !includeCommands )
        {
            return basic;
        }

        StringBuilder builder = new StringBuilder( basic );
        for ( StorageCommand command : commands )
        {
            builder.append( format( "%n%s", command.toString() ) );
        }
        return builder.toString();
    }

    @Override
    public Iterator<StorageCommand> iterator()
    {
        return commands.iterator();
    }

    public int commandCount()
    {
        return commands.size();
    }
}
