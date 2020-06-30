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
package org.neo4j.causalclustering.catchup.storecopy;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class CloseablesListenerTest
{
    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldCloseAllReourcesBeforeException() throws Exception
    {
        // given
        CloseablesListener closeablesListener = new CloseablesListener();
        RuntimeException exception = new RuntimeException( "fail" );
        CloseTrackingCloseable kindCloseable1 = new CloseTrackingCloseable();
        CloseTrackingCloseable unkindCloseable = new CloseTrackingCloseable( exception );
        CloseTrackingCloseable kindCloseable2 = new CloseTrackingCloseable();
        closeablesListener.add( kindCloseable1 );
        closeablesListener.add( unkindCloseable );
        closeablesListener.add( kindCloseable2 );

        //then we expect an exception
        expectedException.expect( exception.getClass() );

        // when
        closeablesListener.close();

        //then we expect all have closed
        assertTrue( kindCloseable1.wasClosed );
        assertTrue( unkindCloseable.wasClosed );
        assertTrue( kindCloseable2.wasClosed );
    }

    class CloseTrackingCloseable implements AutoCloseable
    {
        private final Exception throwOnClose;
        boolean wasClosed;

        private CloseTrackingCloseable()
        {
            this( null );
        }

        CloseTrackingCloseable( Exception throwOnClose )
        {
            this.throwOnClose = throwOnClose;
        }

        @Override
        public void close() throws Exception
        {
            wasClosed = true;
            if ( throwOnClose != null )
            {
                throw throwOnClose;
            }
        }
    }
}
