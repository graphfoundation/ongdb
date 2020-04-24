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
package org.neo4j.com;

import org.neo4j.com.storecopy.ResponseUnpacker;
import org.neo4j.storageengine.api.StoreId;

/**
 * {@link Response} that carries {@link TransactionStream transaction data} as a side-effect, to be applied
 * before accessing the response value.
 *
 * @see ResponseUnpacker
 */
public class TransactionStreamResponse<T> extends Response<T>
{
    private final TransactionStream transactions;

    public TransactionStreamResponse( T response, StoreId storeId, TransactionStream transactions,
            ResourceReleaser releaser )
    {
        super( response, storeId, releaser );
        this.transactions = transactions;
    }

    @Override
    public void accept( Response.Handler handler ) throws Exception
    {
        transactions.accept( handler.transactions() );
    }

    @Override
    public boolean hasTransactionsToBeApplied()
    {
        return true;
    }
}
