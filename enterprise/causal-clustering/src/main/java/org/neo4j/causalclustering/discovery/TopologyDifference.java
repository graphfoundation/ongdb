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
package org.neo4j.causalclustering.discovery;

import java.util.Set;

public class TopologyDifference
{
    private Set<Difference> added;
    private Set<Difference> removed;

    TopologyDifference( Set<Difference> added, Set<Difference> removed )
    {
        this.added = added;
        this.removed = removed;
    }

    Set<Difference> added()
    {
        return added;
    }

    Set<Difference> removed()
    {
        return removed;
    }

    public boolean hasChanges()
    {
        return added.size() > 0 || removed.size() > 0;
    }

    @Override
    public String toString()
    {
        return String.format( "{added=%s, removed=%s}", added, removed );
    }
}
