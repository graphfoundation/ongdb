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
package org.neo4j.kernel.ha.transaction;

import java.util.function.LongSupplier;
import org.neo4j.kernel.impl.core.LastTxIdGetter;
import org.neo4j.kernel.impl.transaction.log.TransactionIdStore;

public class OnDiskLastTxIdGetter implements LastTxIdGetter
{
    private final LongSupplier txIdSupplier;

    public OnDiskLastTxIdGetter( LongSupplier txIdSupplier )
    {
        this.txIdSupplier = txIdSupplier;
    }

    /** This method is used to construct credentials for election process.
      * And can be invoked at any moment of instance lifecycle.
      * It mean that its possible that we will be invoked when neo stores are stopped
      * (for example while we copy store) in that case we will return TransactionIdStore.BASE_TX_ID
      */
    @Override
    public long getLastTxId()
    {
        try
        {
            return txIdSupplier.getAsLong();
        }
        catch ( Throwable e )
        {
            return TransactionIdStore.BASE_TX_ID;
        }
    }
}
