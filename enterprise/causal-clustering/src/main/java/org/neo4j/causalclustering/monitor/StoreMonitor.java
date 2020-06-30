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

package org.neo4j.causalclustering.monitor;

/**
 * From com/StoreCopyClientMonitor
 */
public interface StoreMonitor
{
    void start();

    void startReceivingStoreFiles();

    void finishReceivingStoreFiles();

    void startReceivingStoreFile( String file );

    void finishReceivingStoreFile( String file );

    void startReceivingTransactions( long tId );

    void finishReceivingTransactions( long tId );

    void startRecoveringStore();

    void finishRecoveringStore();

    void startReceivingIndexSnapshots();

    void startReceivingIndexSnapshot( long indexId );

    void finishReceivingIndexSnapshot( long indexId );

    void finishReceivingIndexSnapshots();

    void finish();

    public static class Adapter implements StoreMonitor
    {
        public void start()
        {
        }

        public void startReceivingStoreFiles()
        {
        }

        public void finishReceivingStoreFiles()
        {
        }

        public void startReceivingStoreFile( String file )
        {
        }

        public void finishReceivingStoreFile( String file )
        {
        }

        public void startReceivingTransactions( long startTxId )
        {
        }

        public void finishReceivingTransactions( long endTxId )
        {
        }

        public void startRecoveringStore()
        {
        }

        public void finishRecoveringStore()
        {
        }

        public void startReceivingIndexSnapshots()
        {
        }

        public void startReceivingIndexSnapshot( long indexId )
        {
        }

        public void finishReceivingIndexSnapshot( long indexId )
        {
        }

        public void finishReceivingIndexSnapshots()
        {
        }

        public void finish()
        {
        }
    }
}
