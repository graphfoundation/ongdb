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
package org.neo4j.kernel.ha.id;

import org.neo4j.kernel.impl.store.id.IdRange;

public final class IdAllocation
{
    private final IdRange idRange;
    private final long highestIdInUse;
    private final long defragCount;

    public IdAllocation( IdRange idRange, long highestIdInUse, long defragCount )
    {
        this.idRange = idRange;
        this.highestIdInUse = highestIdInUse;
        this.defragCount = defragCount;
    }

    public long getHighestIdInUse()
    {
        return highestIdInUse;
    }

    public long getDefragCount()
    {
        return defragCount;
    }

    public IdRange getIdRange()
    {
        return this.idRange;
    }

    @Override
    public String toString()
    {
        return "IdAllocation[" + idRange + ", " + highestIdInUse + ", " + defragCount + "]";
    }
}
