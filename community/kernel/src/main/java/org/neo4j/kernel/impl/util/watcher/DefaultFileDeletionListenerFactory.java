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
package org.neo4j.kernel.impl.util.watcher;

import java.util.Set;
import java.util.function.Predicate;

import org.neo4j.io.fs.watcher.FileWatchEventListenerFactory;
import org.neo4j.io.fs.watcher.resource.WatchedResource;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.logging.internal.LogService;

public class DefaultFileDeletionListenerFactory implements FileWatchEventListenerFactory<DefaultFileDeletionEventListener>
{
    private final DatabaseLayout databaseLayout;
    private final LogService logService;
    private final Predicate<String> fileNameFilter;

    public DefaultFileDeletionListenerFactory( DatabaseLayout databaseLayout, LogService logService, Predicate<String> fileNameFilter )
    {
        this.databaseLayout = databaseLayout;
        this.logService = logService;
        this.fileNameFilter = fileNameFilter;
    }

    @Override
    public DefaultFileDeletionEventListener createListener( Set<WatchedResource> watchedResources )
    {
        return new DefaultFileDeletionEventListener( databaseLayout, watchedResources, logService, fileNameFilter );
    }
}
