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

import static java.lang.String.format;

public enum ResponseMessageType
{
    TX( (byte) 1 ),
    STORE_ID( (byte) 2 ),
    FILE( (byte) 3 ),
    STORE_COPY_FINISHED( (byte) 4 ),
    CORE_SNAPSHOT( (byte) 5 ),
    TX_STREAM_FINISHED( (byte) 6 ),
    PREPARE_STORE_COPY_RESPONSE( (byte) 7 ),
    INDEX_SNAPSHOT_RESPONSE( (byte) 8 ),
    UNKNOWN( (byte) 200 );

    private byte messageType;

    ResponseMessageType( byte messageType )
    {
        this.messageType = messageType;
    }

    public static ResponseMessageType from( byte b )
    {
        for ( ResponseMessageType responseMessageType : values() )
        {
            if ( responseMessageType.messageType == b )
            {
                return responseMessageType;
            }
        }
        return UNKNOWN;
    }

    public byte messageType()
    {
        return messageType;
    }

    @Override
    public String toString()
    {
        return format( "ResponseMessageType{messageType=%s}", messageType );
    }
}
