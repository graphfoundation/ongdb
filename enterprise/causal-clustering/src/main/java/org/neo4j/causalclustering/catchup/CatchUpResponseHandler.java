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
package org.neo4j.causalclustering.catchup;

import java.io.IOException;

import org.neo4j.causalclustering.catchup.storecopy.FileChunk;
import org.neo4j.causalclustering.catchup.storecopy.FileHeader;
import org.neo4j.causalclustering.catchup.storecopy.GetStoreIdResponse;
import org.neo4j.causalclustering.catchup.storecopy.StoreCopyFinishedResponse;
import org.neo4j.causalclustering.catchup.storecopy.PrepareStoreCopyResponse;
import org.neo4j.causalclustering.catchup.tx.TxPullResponse;
import org.neo4j.causalclustering.catchup.tx.TxStreamFinishedResponse;
import org.neo4j.causalclustering.core.state.snapshot.CoreSnapshot;

public interface CatchUpResponseHandler
{
    void onFileHeader( FileHeader fileHeader );

    /**
     * @param fileChunk Part of a file.
     * @return <code>true</code> if this is the last part of the file that is currently being transferred.
     */
    boolean onFileContent( FileChunk fileChunk ) throws IOException;

    void onFileStreamingComplete( StoreCopyFinishedResponse response );

    void onTxPullResponse( TxPullResponse tx );

    void onTxStreamFinishedResponse( TxStreamFinishedResponse response );

    void onGetStoreIdResponse( GetStoreIdResponse response );

    void onCoreSnapshot( CoreSnapshot coreSnapshot );

    void onStoreListingResponse( PrepareStoreCopyResponse storeListingRequest );

    void onClose();
}
