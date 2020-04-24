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

import org.junit.Test;

import org.neo4j.logging.Log;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class LoggingResourcePoolMonitorTest
{
    @Test
    public void testUpdatedCurrentPeakSizeLogsOnlyOnChange()
    {
        Log log = mock( Log.class );
        LoggingResourcePoolMonitor monitor = new LoggingResourcePoolMonitor( log );

        monitor.updatedCurrentPeakSize( 10 );
        verify( log, times( 1 ) ).debug( anyString() );

        monitor.updatedCurrentPeakSize( 10 );
        verify( log, times( 1 ) ).debug( anyString() );

        monitor.updatedCurrentPeakSize( 11 );
        verify( log, times( 2 ) ).debug( anyString() );
    }

    @Test
    public void testUpdatedTargetSizeOnlyOnChange()
    {
        Log log = mock( Log.class );
        LoggingResourcePoolMonitor monitor = new LoggingResourcePoolMonitor( log );

        monitor.updatedTargetSize( 10 );
        verify( log, times( 1 ) ).debug( anyString() );

        monitor.updatedTargetSize( 10 );
        verify( log, times( 1 ) ).debug( anyString() );

        monitor.updatedTargetSize( 11 );
        verify( log, times( 2 ) ).debug( anyString() );
    }
}
