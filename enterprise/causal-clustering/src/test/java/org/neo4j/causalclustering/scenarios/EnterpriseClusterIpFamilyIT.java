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
package org.neo4j.causalclustering.scenarios;

import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.neo4j.causalclustering.discovery.IpFamily;

import static org.neo4j.causalclustering.discovery.IpFamily.IPV4;
import static org.neo4j.causalclustering.discovery.IpFamily.IPV6;
import static org.neo4j.causalclustering.scenarios.EnterpriseDiscoveryServiceType.HAZELCAST;
import static org.neo4j.causalclustering.scenarios.EnterpriseDiscoveryServiceType.SHARED;

public class EnterpriseClusterIpFamilyIT extends BaseClusterIpFamilyIT
{
    public EnterpriseClusterIpFamilyIT( DiscoveryServiceType discoveryServiceFactory, IpFamily ipFamily, boolean useWildcard )
    {
        super( discoveryServiceFactory, ipFamily, useWildcard );
    }

    @Parameterized.Parameters( name = "{0} {1} useWildcard={2}" )
    public static Collection<Object[]> data()
    {
        return Arrays.asList( new Object[][]{
                {SHARED, IPV4, false},
                {SHARED, IPV6, true},

                {HAZELCAST, IPV4, false},
                {HAZELCAST, IPV6, false},

                {HAZELCAST, IPV4, true},
                {HAZELCAST, IPV6, true},
                } );
    }
}
