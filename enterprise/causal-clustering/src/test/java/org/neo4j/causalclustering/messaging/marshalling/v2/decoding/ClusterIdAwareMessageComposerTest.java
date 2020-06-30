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
package org.neo4j.causalclustering.messaging.marshalling.v2.decoding;

import org.junit.Test;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.neo4j.causalclustering.core.consensus.RaftMessages;
import org.neo4j.causalclustering.core.state.machines.tx.ReplicatedTransaction;
import org.neo4j.causalclustering.identity.ClusterId;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

public class ClusterIdAwareMessageComposerTest
{
    @Test
    public void shouldThrowExceptionOnConflictingMessageHeaders()
    {
        try
        {
            RaftMessageComposer raftMessageComposer = new RaftMessageComposer( Clock.systemUTC() );

            raftMessageComposer.decode( null, messageCreator( ( a, b ) -> Optional.empty() ), null );
            raftMessageComposer.decode( null, messageCreator( ( a, b ) -> Optional.empty() ), null );
        }
        catch ( IllegalStateException e )
        {
            assertThat( e.getMessage(), containsString( "Pipeline already contains message header waiting to build." ) );
            return;
        }
        fail();
    }

    @Test
    public void shouldThrowExceptionIfNotAllResourcesAreUsed()
    {
        try
        {
            RaftMessageComposer raftMessageComposer = new RaftMessageComposer( Clock.systemUTC() );

            ReplicatedTransaction replicatedTransaction = ReplicatedTransaction.from( new byte[0] );
            raftMessageComposer.decode( null, replicatedTransaction, null );
            List<Object> out = new ArrayList<>();
            raftMessageComposer.decode( null, messageCreator( ( a, b ) -> Optional.of( dummyRequest() ) ), out );
        }
        catch ( IllegalStateException e )
        {
            assertThat( e.getMessage(),
                        containsString( "was composed without using all resources in the pipeline. Pipeline still contains Replicated contents" ) );
            return;
        }
        fail();
    }

    @Test
    public void shouldThrowExceptionIfUnrecognizedObjectIsFound()
    {
        try
        {
            RaftMessageComposer raftMessageComposer = new RaftMessageComposer( Clock.systemUTC() );

            raftMessageComposer.decode( null, "a string", null );
        }
        catch ( IllegalStateException e )
        {
            assertThat( e.getMessage(), equalTo( "Unexpected object in the pipeline: a string" ) );
            return;
        }
        fail();
    }

    private RaftMessages.PruneRequest dummyRequest()
    {
        return new RaftMessages.PruneRequest( 1 );
    }

    private RaftMessageDecoder.ClusterIdAwareMessageComposer messageCreator( RaftMessageDecoder.LazyComposer composer )
    {
        return new RaftMessageDecoder.ClusterIdAwareMessageComposer( composer, new ClusterId( UUID.randomUUID() ) );
    }
}
