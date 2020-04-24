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
package org.neo4j.causalclustering.core.state.machines.tx;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.neo4j.causalclustering.core.state.machines.tx.LogIndexTxHeaderEncoding.decodeLogIndexFromTxHeader;
import static org.neo4j.causalclustering.core.state.machines.tx.LogIndexTxHeaderEncoding.encodeLogIndexAsTxHeader;

public class LogIndexTxHeaderEncodingTest
{
    @Test
    public void shouldEncodeIndexAsBytes()
    {
        long index = 123_456_789_012_567L;
        byte[] bytes = encodeLogIndexAsTxHeader( index );
        assertEquals( index, decodeLogIndexFromTxHeader( bytes ) );
    }

    @Test
    public void shouldThrowExceptionForAnEmptyByteArray()
    {
        // given
        try
        {
            // when
            decodeLogIndexFromTxHeader( new byte[0] );
            fail( "Should have thrown an exception because there's no way to decode this " );
        }
        catch ( IllegalArgumentException e )
        {
            // expected
            assertEquals( "Unable to decode RAFT log index from transaction header", e.getMessage() );
        }
    }
}
