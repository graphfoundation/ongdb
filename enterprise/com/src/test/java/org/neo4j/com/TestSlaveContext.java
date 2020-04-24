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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestSlaveContext
{
    @Test
    public void assertSimilarity()
    {
        // Different machine ids
        assertNotEquals( new RequestContext( 1234, 1, 2, 0, 0 ), new RequestContext( 1234, 2, 2, 0, 0 ) );

        // Different event identifiers
        assertNotEquals( new RequestContext( 1234, 1, 10, 0, 0 ), new RequestContext( 1234, 1, 20, 0, 0 ) );

        // Different session ids
        assertNotEquals( new RequestContext( 1001, 1, 5, 0, 0 ), new RequestContext( 1101, 1, 5, 0, 0 ) );

        // Same everything
        assertEquals( new RequestContext( 12345, 4, 9, 0, 0 ), new RequestContext( 12345, 4, 9, 0, 0 ) );
    }
}
