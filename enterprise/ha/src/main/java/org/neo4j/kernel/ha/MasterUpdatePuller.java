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
package org.neo4j.kernel.ha;

/**
 * Masters implementation of update puller that does nothing since master should not pull updates.
 */
public class MasterUpdatePuller implements UpdatePuller
{

    public static final MasterUpdatePuller INSTANCE = new MasterUpdatePuller();

    private MasterUpdatePuller()
    {
    }

    @Override
    public void start()
    {
        // no-op
    }

    @Override
    public void stop()
    {
        // no-op
    }

    @Override
    public void pullUpdates()
    {
        // no-op
    }

    @Override
    public boolean tryPullUpdates()
    {
        return false;
    }

    @Override
    public void pullUpdates( Condition condition, boolean assertPullerActive )
    {
        // no-op
    }
}
