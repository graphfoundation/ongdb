/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.causalclustering.core.consensus.membership;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.neo4j.causalclustering.identity.MemberId;

import static java.lang.String.format;
import static org.neo4j.causalclustering.identity.RaftTestMember.member;

public class RaftTestGroup implements RaftGroup<MemberId>
{
    private final Set<MemberId> members = new HashSet<>();

    public RaftTestGroup( Set<MemberId> members )
    {
        this.members.addAll( members );
    }

    public RaftTestGroup( int... memberIds )
    {
        for ( int memberId : memberIds )
        {
            this.members.add( member( memberId ) );
        }
    }

    public RaftTestGroup( MemberId... memberIds )
    {
        this.members.addAll( Arrays.asList( memberIds ) );
    }

    @Override
    public Set<MemberId> getMembers()
    {
        return members;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }

        RaftTestGroup that = (RaftTestGroup) o;

        return members.equals( that.members );

    }

    @Override
    public int hashCode()
    {
        return members.hashCode();
    }

    @Override
    public String toString()
    {
        return format( "RaftTestGroup{members=%s}", members );
    }
}
