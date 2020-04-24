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
package org.neo4j.causalclustering.helper;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ErrorHandlerTest
{
    private static final String FAILMESSAGE = "More fail";

    @Test
    public void shouldExecuteAllFailingOperations()
    {
        AtomicBoolean bool = new AtomicBoolean( false );
        try
        {
            ErrorHandler.runAll( "test", Assert::fail, () ->
            {
                bool.set( true );
                throw new IllegalStateException( FAILMESSAGE );
            } );
            fail();
        }
        catch ( RuntimeException e )
        {
            assertEquals( "test", e.getMessage() );
            Throwable cause = e.getCause();
            assertEquals( AssertionError.class, cause.getClass() );
            Throwable[] suppressed = e.getSuppressed();
            assertEquals( 1, suppressed.length );
            assertEquals( IllegalStateException.class, suppressed[0].getClass() );
            assertEquals( "More fail", suppressed[0].getMessage() );
            assertTrue( bool.get() );
        }
    }
}
