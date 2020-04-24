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
package org.neo4j.causalclustering.scenarios;

import java.util.function.Supplier;

import org.neo4j.causalclustering.discovery.DiscoveryServiceFactory;
import org.neo4j.causalclustering.discovery.HazelcastDiscoveryServiceFactory;
import org.neo4j.causalclustering.discovery.SharedDiscoveryServiceFactory;

public enum EnterpriseDiscoveryServiceType implements DiscoveryServiceType
{
    SHARED( SharedDiscoveryServiceFactory::new ),
    HAZELCAST( HazelcastDiscoveryServiceFactory::new );

    private final Supplier<DiscoveryServiceFactory> supplier;

    EnterpriseDiscoveryServiceType( Supplier<DiscoveryServiceFactory> supplier )
    {
        this.supplier = supplier;
    }

    @Override
    public DiscoveryServiceFactory createFactory()
    {
        return supplier.get();
    }
}
