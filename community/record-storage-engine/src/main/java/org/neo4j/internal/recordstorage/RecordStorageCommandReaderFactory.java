/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.internal.recordstorage;

import org.neo4j.kernel.KernelVersion;
import org.neo4j.storageengine.api.CommandReaderFactory;

public class RecordStorageCommandReaderFactory implements CommandReaderFactory
{
    public static final RecordStorageCommandReaderFactory INSTANCE = new RecordStorageCommandReaderFactory();
    public static final LogCommandSerialization LATEST_LOG_SERIALIZATION = INSTANCE.get( KernelVersion.LATEST );

    @Override
    public LogCommandSerialization get( KernelVersion version )
    {
        switch ( version )
        {
        case V2_3:
            return LogCommandSerializationV3_0_10.INSTANCE;
        case V4_0:
            return LogCommandSerializationV4_0.INSTANCE;
        case V4_2:
            return LogCommandSerializationV4_2.INSTANCE;
        case V4_3_D4:
            return LogCommandSerializationV4_3_D3.INSTANCE;
        case V4_4:
            return LogCommandSerializationV4_4.INSTANCE;
        default:
            throw new IllegalArgumentException( "Unsupported kernel version " + version );
        }
    }
}
