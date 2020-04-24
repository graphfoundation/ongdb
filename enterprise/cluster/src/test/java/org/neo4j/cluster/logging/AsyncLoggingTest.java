/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.cluster.logging;

import org.junit.Test;

import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.async.AsyncLogProvider;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.neo4j.logging.AssertableLogProvider.inLog;

public class AsyncLoggingTest
{
    @Test
    public void shouldLogMessages()
    {
        // given
        AssertableLogProvider logs = new AssertableLogProvider();
        AsyncLogging logging = new AsyncLogging( logs.getLog( "meta" ) );

        // when
        logging.start();
        try
        {
            new AsyncLogProvider( logging.eventSender(), logs ).getLog( "test" ).info( "hello" );
        }
        finally
        {
            logging.stop();
        }
        // then
        logs.assertExactly( inLog( "test" ).info( endsWith( "hello" ) ) );
    }

    @Test
    public void shouldLogWhenLoggingThreadStarts()
    {
        // given
        AssertableLogProvider logs = new AssertableLogProvider();
        AsyncLogging logging = new AsyncLogging( logs.getLog( "meta" ) );

        // when
        new AsyncLogProvider( logging.eventSender(), logs ).getLog( "test" ).info( "hello" );

        // then
        logs.assertNoLoggingOccurred();

        // when
        logging.start();
        logging.stop();

        // then
        logs.assertExactly( inLog( "test" ).info( endsWith( "hello" ) ) );
    }
}
