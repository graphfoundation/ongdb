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
package org.neo4j.kernel.impl.transaction.log.pruning;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.kernel.impl.transaction.log.LogFileInformation;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;

public final class EntryCountThreshold implements Threshold
{
    private final long maxTransactionCount;
    private final Log log;

    EntryCountThreshold( LogProvider logProvider, long maxTransactionCount )
    {
        this.log = logProvider.getLog( getClass() );
        this.maxTransactionCount = maxTransactionCount;
    }

    @Override
    public void init()
    {
        // nothing to do here
    }

    @Override
    public boolean reached( Path ignored, long version, LogFileInformation source )
    {
        long nextVersion = version + 1;
        try
        {
            // try to ask next version log file which is my last tx
            long lastTx = source.getFirstEntryId( nextVersion );
            if ( lastTx == -1 )
            {
                log.warn( "Fail to get id of the first entry in the next transaction log file. Requested version: " + nextVersion );
                return false;
            }

            long highest = source.getLastEntryId();
            return highest - lastTx >= maxTransactionCount;
        }
        catch ( IOException e )
        {
            log.warn( "Error on attempt to get entry ids from transaction log files. Checked version: " + version, e );
            return false;
        }
    }

    @Override
    public String toString()
    {
        return maxTransactionCount + " entries";
    }
}
