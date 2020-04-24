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
package org.neo4j.com.storecopy;

import org.neo4j.com.Response;

public interface ResponseUnpacker
{
    /**
     * @param txHandler for getting an insight into which transactions gets applied.
     */
    void unpackResponse( Response<?> response, TxHandler txHandler ) throws Exception;

    ResponseUnpacker NO_OP_RESPONSE_UNPACKER = ( response, txHandler ) ->
    {
        /* Do nothing */
    };

    interface TxHandler
    {
        TxHandler NO_OP_TX_HANDLER = transactionId ->
        {
            /* Do nothing */
        };

        void accept( long transactionId );
    }
}
