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
package org.neo4j.causalclustering.catchup.storecopy;

import java.util.Objects;

public class StoreCopyFinishedResponse
{
    public enum Status
    {
        SUCCESS,
        E_STORE_ID_MISMATCH,
        E_TOO_FAR_BEHIND,
        E_UNKNOWN
    }

    private final Status status;

    public StoreCopyFinishedResponse( Status status )
    {
        this.status = status;
    }

    Status status()
    {
        return status;
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
        StoreCopyFinishedResponse that = (StoreCopyFinishedResponse) o;
        return status == that.status;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( status );
    }
}
