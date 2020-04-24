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
package org.neo4j.causalclustering.core.replication.session;

/** Context for operation. Used for acquirement and release. */
public class OperationContext
{
    private final GlobalSession globalSession;
    private final LocalOperationId localOperationId;

    private final LocalSession localSession;

    public OperationContext( GlobalSession globalSession, LocalOperationId localOperationId, LocalSession localSession )
    {
        this.globalSession = globalSession;
        this.localOperationId = localOperationId;
        this.localSession = localSession;
    }

    public GlobalSession globalSession()
    {
        return globalSession;
    }

    public LocalOperationId localOperationId()
    {
        return localOperationId;
    }

    protected LocalSession localSession()
    {
        return localSession;
    }

    @Override
    public String toString()
    {
        return "OperationContext{" +
               "globalSession=" + globalSession +
               ", localOperationId=" + localOperationId +
               '}';
    }
}
