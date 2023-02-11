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
package org.neo4j.io.fs.watcher;

import com.sun.nio.file.SensitivityWatchEventModifier;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import org.neo4j.io.fs.watcher.resource.WatchedFile;
import org.neo4j.io.fs.watcher.resource.WatchedResource;

import static java.lang.String.format;

/**
 * File watcher that monitors registered directories state using possibilities provided by {@link WatchService}.
 *
 * Safe to be used from multiple threads
 */
public class DefaultFileSystemWatcher implements FileWatcher
{
    private static final WatchEvent.Kind[] OBSERVED_EVENTS =
            new WatchEvent.Kind[]{StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY};
    private final WatchService watchService;
    private final List<FileWatchEventListener> listeners = new CopyOnWriteArrayList<>();
    private final Map<Path,SharedWatchedFile> watchedFiles = new ConcurrentHashMap<>();
    private volatile boolean watch;

    public DefaultFileSystemWatcher( WatchService watchService )
    {
        this.watchService = watchService;
    }

    @Override
    public WatchedResource watch( Path path ) throws IOException
    {
        if ( !Files.isDirectory( path ) )
        {
            throw new IllegalArgumentException( format( "File `%s` is not a directory. Only directories can be " +
                    "registered to be monitored.", path.toAbsolutePath().normalize() ) );
        }
        return watchedFiles.compute( path.toAbsolutePath(), ( key, watchedFile ) ->
                watchedFile != null && watchedFile.share() ? watchedFile
                                                           : new SharedWatchedFile( uncheckedRegister( key ), key, () -> watchedFiles.remove( key ) ) );
    }

    @Override
    public void startWatching() throws InterruptedException
    {
        watch = true;
        while ( watch )
        {
            WatchKey key = watchService.take();
            if ( key != null )
            {
                List<WatchEvent<?>> watchEvents = key.pollEvents();
                for ( WatchEvent<?> watchEvent : watchEvents )
                {
                    WatchEvent.Kind<?> kind = watchEvent.kind();
                    if ( StandardWatchEventKinds.ENTRY_MODIFY == kind )
                    {
                        notifyAboutModification( key, watchEvent );
                    }
                    if ( StandardWatchEventKinds.ENTRY_DELETE == kind )
                    {
                        notifyAboutDeletion( key, watchEvent );
                    }
                }
                key.reset();
            }
        }
    }

    @Override
    public void stopWatching()
    {
        watch = false;
    }

    @Override
    public void addFileWatchEventListener( FileWatchEventListener listener )
    {
        listeners.add( listener );
    }

    @Override
    public void removeFileWatchEventListener( FileWatchEventListener listener )
    {
        listeners.remove( listener );
    }

    @Override
    public void close() throws IOException
    {
        stopWatching();
        watchService.close();
    }

    private void notifyAboutModification( WatchKey key, WatchEvent<?> watchEvent )
    {
        String context = getContext( watchEvent );
        if ( StringUtils.isNotEmpty( context ) )
        {
            for ( FileWatchEventListener listener : listeners )
            {
                listener.fileModified( key, context );
            }
        }
    }

    private void notifyAboutDeletion( WatchKey key, WatchEvent<?> watchEvent )
    {
        String context = getContext( watchEvent );
        if ( StringUtils.isNotEmpty( context ) )
        {
            for ( FileWatchEventListener listener : listeners )
            {
                listener.fileDeleted( key, context );
            }
        }
    }

    private WatchKey uncheckedRegister( Path path )
    {
        try
        {
            return path.register( watchService, OBSERVED_EVENTS, SensitivityWatchEventModifier.HIGH );
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    private static String getContext( WatchEvent<?> watchEvent )
    {
        return Objects.toString( watchEvent.context(), StringUtils.EMPTY );
    }

    private static class SharedWatchedFile extends WatchedFile
    {
        private final Runnable closeAction;
        private int refCount = 1;
        private boolean closed;

        private SharedWatchedFile( WatchKey watchKey, Path path, Runnable closeAction )
        {
            super( watchKey, path );
            this.closeAction = closeAction;
        }

        @Override
        public synchronized void close()
        {
            if ( --refCount == 0 )
            {
                super.close();
                closeAction.run();
                closed = true;
            }
        }

        synchronized boolean share()
        {
            if ( !closed )
            {
                refCount++;
            }
            return !closed;
        }
    }
}
