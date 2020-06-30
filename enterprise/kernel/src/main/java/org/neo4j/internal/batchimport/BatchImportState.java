/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.internal.batchimport;

import java.io.IOException;

import org.neo4j.kernel.impl.store.StoreType;

/**
 * Using same approach as 3.5 causal clustering. It has CoreState and BatchImportStateStore (org.neo4j.causalclustering.core.state.storage).
 */
class BatchImportState
{

    private final String name;
    private final StoreType[] mainStoreTypes;
    private final StoreType[] tempStoreTypes;

    BatchImportState( String name, StoreType[] mainStoreTypes, StoreType[] tempStoreTypes )
    {
        this.name = name;
        this.mainStoreTypes = mainStoreTypes;
        this.tempStoreTypes = tempStoreTypes;
    }

    /**
     * @return
     */
    String name()
    {
        return this.name;
    }

    StoreType[] getMainStoreTypes()
    {
        return this.mainStoreTypes;
    }

    StoreType[] getTempStoreTypes()
    {
        return this.tempStoreTypes;
    }

    void load() throws IOException
    {
    }

    void run( byte[] fromCheckPoint, CheckPointManager checkPointManager ) throws IOException
    {
    }

    void save() throws IOException
    {
    }

    interface CheckPointManager
    {

        void checkPoint( byte[] bytes ) throws IOException;
    }
}
