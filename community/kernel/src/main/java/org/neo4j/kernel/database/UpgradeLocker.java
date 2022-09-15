/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.database;

import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.impl.api.KernelTransactionImplementation;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.lock.Lock;
import org.neo4j.lock.LockTracer;
import org.neo4j.lock.ResourceTypes;

interface UpgradeLocker
{
    Lock acquireWriteLock( KernelTransaction tx );

    Lock acquireReadLock( KernelTransaction tx );

    UpgradeLocker DEFAULT = new UpgradeLocker()
    {
        private static final long ID = Long.MAX_VALUE;
        private final ResourceTypes type = ResourceTypes.NODE;

        @Override
        public Lock acquireWriteLock( KernelTransaction tx )
        {
            Locks.Client lockClient = getLockClient( tx );
            lockClient.acquireExclusive( LockTracer.NONE, type, ID );
            return new Lock()
            {
                @Override
                public void release()
                {
                    lockClient.releaseExclusive( type, ID );
                }
            };
        }

        @Override
        public Lock acquireReadLock( KernelTransaction tx )
        {
            Locks.Client lockClient = getLockClient( tx );
            lockClient.acquireShared( LockTracer.NONE, type, ID );
            return new Lock()
            {
                @Override
                public void release()
                {
                    lockClient.releaseShared( type, ID );
                }
            };
        }

        private Locks.Client getLockClient( KernelTransaction tx )
        {
            return ((KernelTransactionImplementation) tx).lockClient(); //Only one KernelTransaction implementation exists
        }
    };
}
