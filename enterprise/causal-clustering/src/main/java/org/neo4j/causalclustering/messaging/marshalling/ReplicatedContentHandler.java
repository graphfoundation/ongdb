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
package org.neo4j.causalclustering.messaging.marshalling;

import java.io.IOException;

import org.neo4j.causalclustering.core.consensus.NewLeaderBarrier;
import org.neo4j.causalclustering.core.consensus.membership.MemberIdSet;
import org.neo4j.causalclustering.core.replication.DistributedOperation;
import org.neo4j.causalclustering.core.state.machines.dummy.DummyRequest;
import org.neo4j.causalclustering.core.state.machines.id.ReplicatedIdAllocationRequest;
import org.neo4j.causalclustering.core.state.machines.locks.ReplicatedLockTokenRequest;
import org.neo4j.causalclustering.core.state.machines.token.ReplicatedTokenRequest;
import org.neo4j.causalclustering.core.state.machines.tx.ReplicatedTransaction;

public interface ReplicatedContentHandler
{
    void handle( ReplicatedTransaction replicatedTransaction ) throws IOException;

    void handle( MemberIdSet memberIdSet ) throws IOException;

    void handle( ReplicatedIdAllocationRequest replicatedIdAllocationRequest ) throws IOException;

    void handle( ReplicatedTokenRequest replicatedTokenRequest ) throws IOException;

    void handle( NewLeaderBarrier newLeaderBarrier ) throws IOException;

    void handle( ReplicatedLockTokenRequest replicatedLockTokenRequest ) throws IOException;

    void handle( DistributedOperation distributedOperation ) throws IOException;

    void handle( DummyRequest dummyRequest ) throws IOException;
}
