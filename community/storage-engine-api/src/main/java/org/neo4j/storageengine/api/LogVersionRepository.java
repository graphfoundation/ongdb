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
package org.neo4j.storageengine.api;

import org.neo4j.io.pagecache.context.CursorContext;

public interface LogVersionRepository
{
    long INITIAL_LOG_VERSION = 0;
    long BASE_TX_LOG_VERSION = 0;
    int BASE_TX_LOG_BYTE_OFFSET = 64;

    /**
     * Returns the current log version. It is non blocking.
     */
    long getCurrentLogVersion();

    /**
     * Set current log version
     * @param version new current log version
     */
    void setCurrentLogVersion( long version, CursorContext cursorContext );

    /**
     * Increments (making sure it is persisted on disk) and returns the latest log version for this repository.
     * It does so atomically and can potentially block.
     * @param cursorContext underlying page cursor context.
     * @return the latest log version for this repository.
     */
    long incrementAndGetVersion( CursorContext cursorContext );

    /*
     * Returns the current checkpoint log version.
     */
    long getCheckpointLogVersion();

    /**
     * Set checkpoint log version
     * @param version new current log version
     */
    void setCheckpointLogVersion( long version, CursorContext cursorContext );

    /**
     * Increments (making sure it is persisted on disk) and returns the latest checkpoint log version for this repository.
     * It does so atomically and can potentially block.
     * @param cursorContext underlying page cursor context.
     * @return the latest checkpoint log version for this repository.
     */
    long incrementAndGetCheckpointLogVersion( CursorContext cursorContext );
}
