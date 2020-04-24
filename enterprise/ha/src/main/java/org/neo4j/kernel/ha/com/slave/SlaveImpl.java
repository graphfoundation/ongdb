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
package org.neo4j.kernel.ha.com.slave;

import org.neo4j.com.Response;
import org.neo4j.com.storecopy.TransactionObligationFulfiller;
import org.neo4j.kernel.ha.com.master.Slave;

public class SlaveImpl implements Slave
{
    private final TransactionObligationFulfiller fulfiller;

    public SlaveImpl( TransactionObligationFulfiller fulfiller )
    {
        this.fulfiller = fulfiller;
    }

    @Override
    public Response<Void> pullUpdates( long upToAndIncludingTxId )
    {
        try
        {
            fulfiller.fulfill( upToAndIncludingTxId );
        }
        catch ( InterruptedException e )
        {
            throw new RuntimeException( e );
        }
        return Response.empty();
    }

    @Override
    public int getServerId()
    {
        throw new UnsupportedOperationException( "This should not be called. Knowing the server id is only needed " +
                "on the client side, we're now on the server side." );
    }
}
