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
package org.neo4j.kernel.ha.com.master;


import java.util.concurrent.locks.ReentrantLock;

import org.neo4j.kernel.impl.locking.Locks;

/**
 * Abstraction to hold all client related info on master side.
 */
public class Conversation implements AutoCloseable
{
    private Locks.Client locks;
    private volatile boolean active = true;
    // since some client locks use pooling we need to be sure that
    // there is no race between client close and stop
    private ReentrantLock lockClientCleanupLock = new ReentrantLock();

    public Conversation( Locks.Client locks )
    {
        this.locks = locks;
    }

    public Locks.Client getLocks()
    {
        return locks;
    }

    @Override
    public void close()
    {
        lockClientCleanupLock.lock();
        try
        {
            if ( locks != null )
            {
                locks.close();
                locks = null;
                active = false;
            }
        }
        finally
        {
            lockClientCleanupLock.unlock();
        }
    }

    public boolean isActive()
    {
        return active;
    }

    public void stop()
    {
        lockClientCleanupLock.lock();
        try
        {
            if ( locks != null )
            {
                locks.stop();
            }
        }
        finally
        {
            lockClientCleanupLock.unlock();
        }
    }

    @Override
    public String toString()
    {
        String locks = this.locks.toString();
        return "Conversation[lockClient: " + locks + "].";
    }
}
