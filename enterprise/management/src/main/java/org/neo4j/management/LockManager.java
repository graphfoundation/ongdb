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
package org.neo4j.management;

import java.util.List;

import org.neo4j.jmx.Description;
import org.neo4j.jmx.ManagementInterface;
import org.neo4j.kernel.info.LockInfo;

@ManagementInterface( name = LockManager.NAME )
@Description( "Information about the Neo4j lock status" )
public interface LockManager
{
    String NAME = "Locking";

    @Description( "The number of lock sequences that would have lead to a deadlock situation that "
                  + "Neo4j has detected and averted (by throwing DeadlockDetectedException)." )
    long getNumberOfAvertedDeadlocks();

    @Description( "Information about all locks held by Neo4j" )
    List<LockInfo> getLocks();

    @Description( "Information about contended locks (locks where at least one thread is waiting) held by Neo4j. "
                  + "The parameter is used to get locks where threads have waited for at least the specified number "
                  + "of milliseconds, a value of 0 retrieves all contended locks." )
    List<LockInfo> getContendedLocks( long minWaitTime );
}
