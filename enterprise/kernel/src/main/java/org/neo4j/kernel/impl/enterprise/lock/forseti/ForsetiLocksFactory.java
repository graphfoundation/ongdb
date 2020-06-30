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

import java.time.Clock;

import org.neo4j.annotations.service.Service;
import org.neo4j.configuration.Config;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.kernel.impl.locking.LocksFactory;
import org.neo4j.lock.ResourceType;
import org.neo4j.lock.ResourceTypes;

@Service
public class ForsetiLocksFactory implements LocksFactory
{

    public static final String KEY = "forseti";

    @Override
    public String getName()
    {
        return KEY;
    }

    @Override
    public int getPriority()
    {
        return 10;
    }

    @Override
    public Locks newInstance( Config config, Clock clock, ResourceType[] resourceTypes )
    {
        return new ForsetiLockManager( config, clock, ResourceTypes.values() );
    }
}
