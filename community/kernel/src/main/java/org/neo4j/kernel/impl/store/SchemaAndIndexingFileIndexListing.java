/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.kernel.impl.store;

import org.eclipse.collections.api.set.primitive.LongSet;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.function.Function;

import org.neo4j.graphdb.Resource;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.kernel.impl.api.index.IndexingService;
import org.neo4j.storageengine.api.StoreFileMetadata;

public class SchemaAndIndexingFileIndexListing
{
    private static final Function<Path,StoreFileMetadata> toStoreFileMetadata = path -> new StoreFileMetadata( path, 1 );

    private final IndexingService indexingService;

    SchemaAndIndexingFileIndexListing( IndexingService indexingService )
    {
        this.indexingService = indexingService;
    }

    public LongSet getIndexIds()
    {
        return indexingService.getIndexIds();
    }

    Resource gatherSchemaIndexFiles( Collection<StoreFileMetadata> targetFiles ) throws IOException
    {
        ResourceIterator<Path> snapshot = indexingService.snapshotIndexFiles();
        getSnapshotFilesMetadata( snapshot, targetFiles );
        // Intentionally don't close the snapshot here, return it for closing by the consumer of
        // the targetFiles list.
        return snapshot;
    }

    private static void getSnapshotFilesMetadata( ResourceIterator<Path> snapshot, Collection<StoreFileMetadata> targetFiles )
    {
        snapshot.stream().map( toStoreFileMetadata ).forEach( targetFiles::add );
    }
}
