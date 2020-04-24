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
public final class WindowPoolInfo implements Serializable
{
    private static final long serialVersionUID = 7743724554758487292L;

    private String name;
    private long memAvail;
    private long memUsed;
    private int windowCount;
    private int windowSize;
    private int hitCount;
    private int missCount;
    private int oomCount;

    @ConstructorProperties( { "windowPoolName", "availableMemory",
            "usedMemory", "numberOfWindows", "windowSize", "windowHitCount",
            "windowMissCount", "numberOfOutOfMemory" } )
    public WindowPoolInfo( String name, long memAvail, long memUsed,
            int windowCount, int windowSize, int hitCount, int missCount,
            int oomCount )
    {
        this.name = name;
        this.memAvail = memAvail;
        this.memUsed = memUsed;
        this.windowCount = windowCount;
        this.windowSize = windowSize;
        this.hitCount = hitCount;
        this.missCount = missCount;
        this.oomCount = oomCount;
    }

    public String getWindowPoolName()
    {
        return name;
    }

    public long getAvailableMemory()
    {
        return memAvail;
    }

    public long getUsedMemory()
    {
        return memUsed;
    }

    public int getNumberOfWindows()
    {
        return windowCount;
    }

    public int getWindowSize()
    {
        return windowSize;
    }

    public int getWindowHitCount()
    {
        return hitCount;
    }

    public int getWindowMissCount()
    {
        return missCount;
    }

    public int getNumberOfOutOfMemory()
    {
        return oomCount;
    }
}
