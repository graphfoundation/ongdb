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
package org.neo4j.causalclustering.core.consensus.term;

import org.junit.Test;

import static org.junit.Assert.fail;

public class TermStateTest
{
    @Test
    public void shouldStoreCurrentTerm()
    {
        // given
        TermState termState = new TermState();

        // when
        termState.update( 21 );

        // then
        assertEquals( 21, termState.currentTerm() );
    }

    @Test
    public void rejectLowerTerm()
    {
        // given
        TermState termState = new TermState();
        termState.update( 21 );

        // when
        try
        {
            termState.update( 20 );
            fail( "Should have thrown exception" );
        }
        catch ( IllegalArgumentException e )
        {
            // expected
        }
    }
}
