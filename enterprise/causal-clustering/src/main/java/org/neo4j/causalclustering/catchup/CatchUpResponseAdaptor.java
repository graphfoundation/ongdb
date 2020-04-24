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
package org.neo4j.causalclustering.catchup;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import org.neo4j.causalclustering.catchup.storecopy.FileChunk;
import org.neo4j.causalclustering.catchup.storecopy.FileHeader;
import org.neo4j.causalclustering.catchup.storecopy.GetStoreIdResponse;
import org.neo4j.causalclustering.catchup.storecopy.StoreCopyFinishedResponse;
import org.neo4j.causalclustering.catchup.storecopy.PrepareStoreCopyResponse;
import org.neo4j.causalclustering.catchup.tx.TxPullResponse;
import org.neo4j.causalclustering.catchup.tx.TxStreamFinishedResponse;
import org.neo4j.causalclustering.core.state.snapshot.CoreSnapshot;

public class CatchUpResponseAdaptor<T> implements CatchUpResponseCallback<T>
{
    @Override
    public void onFileHeader( CompletableFuture<T> signal, FileHeader response )
    {
        unimplementedMethod( signal, response );
    }

    @Override
    public boolean onFileContent( CompletableFuture<T> signal, FileChunk response )
    {
        unimplementedMethod( signal, response );
        return false;
    }

    @Override
    public void onFileStreamingComplete( CompletableFuture<T> signal, StoreCopyFinishedResponse response )
    {
        unimplementedMethod( signal, response );
    }

    @Override
    public void onTxPullResponse( CompletableFuture<T> signal, TxPullResponse response )
    {
        unimplementedMethod( signal, response );
    }

    @Override
    public void onTxStreamFinishedResponse( CompletableFuture<T> signal, TxStreamFinishedResponse response )
    {
        unimplementedMethod( signal, response );
    }

    @Override
    public void onGetStoreIdResponse( CompletableFuture<T> signal, GetStoreIdResponse response )
    {
        unimplementedMethod( signal, response );
    }

    @Override
    public void onCoreSnapshot( CompletableFuture<T> signal, CoreSnapshot response )
    {
        unimplementedMethod( signal, response );
    }

    @Override
    public void onStoreListingResponse( CompletableFuture<T> signal, PrepareStoreCopyResponse response )
    {
        unimplementedMethod( signal, response );
    }

    private <U> void unimplementedMethod( CompletableFuture<T> signal, U response )
    {
        signal.completeExceptionally( new CatchUpProtocolViolationException( "This Adaptor has unimplemented methods for: %s", response ) );
    }
}
