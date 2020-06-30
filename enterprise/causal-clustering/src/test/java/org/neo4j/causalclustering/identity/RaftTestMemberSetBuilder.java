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
package org.neo4j.causalclustering.identity;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.causalclustering.core.consensus.membership.RaftGroup;
import org.neo4j.causalclustering.core.consensus.membership.RaftTestGroup;

import static org.neo4j.causalclustering.identity.RaftTestMember.member;

public class RaftTestMemberSetBuilder implements RaftGroup.Builder
{
    public static RaftTestMemberSetBuilder INSTANCE = new RaftTestMemberSetBuilder();

    private RaftTestMemberSetBuilder()
    {
    }

    public static RaftGroup memberSet( int... ids )
    {
        HashSet members = new HashSet<>();
        for ( int id : ids )
        {
            members.add( member( id ) );
        }
        return new RaftTestGroup( members );
    }

    @Override
    public RaftGroup build( Set members )
    {
        return new RaftTestGroup( members );
    }
}
