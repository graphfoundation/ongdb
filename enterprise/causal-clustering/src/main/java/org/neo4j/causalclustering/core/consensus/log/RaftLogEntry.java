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
package org.neo4j.causalclustering.core.consensus.log;

import java.util.Objects;

import org.neo4j.causalclustering.core.replication.ReplicatedContent;

import static java.lang.String.format;

public class RaftLogEntry
{
    public static final RaftLogEntry[] empty = new RaftLogEntry[0];

    private final long term;
    private final ReplicatedContent content;

    public RaftLogEntry( long term, ReplicatedContent content )
    {
        Objects.requireNonNull( content );
        this.term = term;
        this.content = content;
    }

    public long term()
    {
        return this.term;
    }

    public ReplicatedContent content()
    {
        return this.content;
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

        RaftLogEntry that = (RaftLogEntry) o;

        return term == that.term && content.equals( that.content );
    }

    @Override
    public int hashCode()
    {
        int result = (int) (term ^ (term >>> 32));
        result = 31 * result + content.hashCode();
        return result;
    }

    @Override
    public String toString()
    {
        return format( "{term=%d, content=%s}", term, content );
    }

}
