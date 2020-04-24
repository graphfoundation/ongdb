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
package org.neo4j.kernel.ha;

import org.neo4j.com.RequestType;

public interface HaRequestTypes
{
    enum Type
    {
        // Order here is vital since it represents the request type (byte) ordinal which is communicated
        // as part of the HA protocol.
        ALLOCATE_IDS,
        CREATE_RELATIONSHIP_TYPE,
        ACQUIRE_EXCLUSIVE_LOCK,
        ACQUIRE_SHARED_LOCK,
        COMMIT,
        PULL_UPDATES,
        END_LOCK_SESSION,
        HANDSHAKE,
        COPY_STORE,
        COPY_TRANSACTIONS,
        NEW_LOCK_SESSION,
        PUSH_TRANSACTIONS,
        CREATE_PROPERTY_KEY,
        CREATE_LABEL;

        public boolean is( RequestType type )
        {
            return type.id() == ordinal();
        }
    }

    RequestType type( Type type );

    RequestType type( byte id );
}
