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
package org.neo4j.io.fs;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.io.fs.watcher.FileWatchEventListener;
import org.neo4j.io.fs.watcher.FileWatcher;
import org.neo4j.io.fs.watcher.resource.WatchedResource;

/**
 * File watcher that will perform watching activities using specific file watcher in case if
 * requested resource will match to provided {@link SelectiveFileWatcher#specialPath}.
 */
public class SelectiveFileWatcher implements FileWatcher
{
    private final Path specialPath;
    private final FileWatcher defaultFileWatcher;
    private final FileWatcher specificFileWatcher;

    SelectiveFileWatcher( Path specialPath, FileWatcher defaultFileWatcher, FileWatcher specificFileWatcher )
    {
        this.specialPath = specialPath;
        this.defaultFileWatcher = defaultFileWatcher;
        this.specificFileWatcher = specificFileWatcher;
    }

    @Override
    public WatchedResource watch( Path path ) throws IOException
    {
        return chooseFileWatcher( path ).watch( path );
    }

    @Override
    public void addFileWatchEventListener( FileWatchEventListener listener )
    {
        defaultFileWatcher.addFileWatchEventListener( listener );
        specificFileWatcher.addFileWatchEventListener( listener );
    }

    @Override
    public void removeFileWatchEventListener( FileWatchEventListener listener )
    {
        defaultFileWatcher.removeFileWatchEventListener( listener );
        specificFileWatcher.removeFileWatchEventListener( listener );
    }

    @Override
    public void stopWatching()
    {
        defaultFileWatcher.stopWatching();
        specificFileWatcher.stopWatching();
    }

    @Override
    public void startWatching() throws InterruptedException
    {
        defaultFileWatcher.startWatching();
        specificFileWatcher.startWatching();
    }

    @Override
    public void close() throws IOException
    {
        defaultFileWatcher.close();
        specificFileWatcher.close();
    }

    private FileWatcher chooseFileWatcher( Path path )
    {
        return path.equals( specialPath ) ? specificFileWatcher : defaultFileWatcher;
    }
}
