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
package org.neo4j.management;

import java.beans.ConstructorProperties;
import java.io.Serializable;

@Deprecated
public final class BranchedStoreInfo implements Serializable
{
    private static final long serialVersionUID = -3519343870927764106L;

    private String directory;

    private long largestTxId;
    private long creationTime;
    private long branchedStoreSize;

    @ConstructorProperties( {"directory", "largestTxId", "creationTime"} )
    public BranchedStoreInfo( String directory, long largestTxId, long creationTime )
    {
        this( directory, largestTxId, creationTime, 0 );
    }

    @ConstructorProperties( {"directory", "largestTxId", "creationTime", "storeSize"} )
    public BranchedStoreInfo( String directory, long largestTxId, long creationTime, long branchedStoreSize )
    {
        this.directory = directory;
        this.largestTxId = largestTxId;
        this.creationTime = creationTime;
        this.branchedStoreSize = branchedStoreSize;
    }

    public String getDirectory()
    {
        return directory;
    }

    public long getLargestTxId()
    {
        return largestTxId;
    }

    public long getCreationTime()
    {
        return creationTime;
    }

    public long getBranchedStoreSize()
    {
        return branchedStoreSize;
    }
}
