/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.com;

import org.neo4j.logging.Log;

public class LoggingResourcePoolMonitor extends ResourcePool.Monitor.Adapter<ChannelContext>
{
    private final Log msgLog;
    private int lastCurrentPeakSize = -1;
    private int lastTargetSize = -1;

    public LoggingResourcePoolMonitor( Log msgLog )
    {
        this.msgLog = msgLog;
    }

    @Override
    public void updatedCurrentPeakSize( int currentPeakSize )
    {
        if ( lastCurrentPeakSize != currentPeakSize )
        {
            msgLog.debug( "ResourcePool updated currentPeakSize to " + currentPeakSize );
            lastCurrentPeakSize = currentPeakSize;
        }
    }

    @Override
    public void created( ChannelContext resource )
    {
        msgLog.debug( "ResourcePool create resource " + resource );
    }

    @Override
    public void updatedTargetSize( int targetSize )
    {
        if ( lastTargetSize != targetSize )
        {
            msgLog.debug( "ResourcePool updated targetSize to " + targetSize );
            lastTargetSize = targetSize;
        }
    }
}
