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
package org.neo4j.kernel.impl.enterprise.lock.forseti;

import java.util.Set;

import org.neo4j.kernel.impl.util.collection.SimpleBitSet;

class ExclusiveLock implements ForsetiLockManager.Lock
{
    private final ForsetiClient owner;

    ExclusiveLock( ForsetiClient owner )
    {
        this.owner = owner;
    }

    @Override
    public void copyHolderWaitListsInto( SimpleBitSet waitList )
    {
        owner.copyWaitListTo( waitList );
    }

    @Override
    public int detectDeadlock( int client )
    {
        return owner.isWaitingFor( client ) ? owner.id() : -1;
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
    public String toString()
    {
        return "ExclusiveLock{" +
               "owner=" + owner +
               '}';
    }
}
