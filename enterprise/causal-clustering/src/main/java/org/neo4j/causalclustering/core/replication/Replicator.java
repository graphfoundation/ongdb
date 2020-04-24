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
package org.neo4j.causalclustering.core.replication;

import java.util.concurrent.Future;

/**
 * Replicate content across a cluster of servers.
  */
public interface Replicator
{
    /**
     * Submit content for replication. This method does not guarantee that the content
     * actually gets replicated, it merely makes an attempt at replication. Other
     * mechanisms must be used to achieve required delivery semantics.
     *
     * @param content      The content to replicated.
     * @param trackResult  Whether to track the result for this operation.
     *
     * @return A future that will receive the result when available. Only valid if trackResult is set.
     */
    Future<Object> replicate( ReplicatedContent content, boolean trackResult ) throws ReplicationFailureException;
}
