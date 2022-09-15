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
package org.neo4j.kernel.impl.locking.forseti;

import org.eclipse.collections.api.set.primitive.LongSet;
import org.eclipse.collections.impl.factory.primitive.LongSets;

import java.util.Set;

import org.neo4j.lock.LockType;

import static org.neo4j.lock.LockType.EXCLUSIVE;

class ExclusiveLock implements ForsetiLockManager.Lock
{
    private final ForsetiClient owner;
    private volatile boolean closed;

    ExclusiveLock( ForsetiClient owner )
    {
        this.owner = owner;
    }

    @Override
    public void copyHolderWaitListsInto( Set<ForsetiClient> waitList )
    {
        owner.copyWaitListTo( waitList );
    }

    @Override
    public ForsetiClient detectDeadlock( ForsetiClient client )
    {
        return !this.closed && owner.isWaitingFor( client ) ? owner : null;
    }

    @Override
    public String describeWaitList()
    {
        return "ExclusiveLock[" + owner.describeWaitList() + "]";
    }

    @Override
    public void collectOwners( Set<ForsetiClient> owners )
    {
        owners.add( owner );
    }

    @Override
    public boolean isOwnedBy( ForsetiClient client )
    {
        return owner.equals( client );
    }

    @Override
    public LockType type()
    {
        return EXCLUSIVE;
    }

    @Override
    public LongSet transactionIds()
    {
        return LongSets.immutable.of( owner.transactionId() );
    }

    @Override
    public boolean isClosed()
    {
        return closed;
    }

    @Override
    public String toString()
    {
        return "ExclusiveLock{" +
               "owner=" + owner +
               '}';
    }

    void close()
    {
        closed = true;
    }

}
