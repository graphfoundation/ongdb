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

public class CatchupClientProtocol extends Protocol<CatchupClientProtocol.State>
{
    public CatchupClientProtocol()
    {
        super( State.MESSAGE_TYPE );
    }

    public enum State
    {
        MESSAGE_TYPE,
        STORE_ID,
        CORE_SNAPSHOT,
        TX_PULL_RESPONSE,
        STORE_COPY_FINISHED,
        TX_STREAM_FINISHED,
        FILE_HEADER,
        FILE_CONTENTS,
        PREPARE_STORE_COPY_RESPONSE,
        INDEX_SNAPSHOT_RESPONSE
    }
}
