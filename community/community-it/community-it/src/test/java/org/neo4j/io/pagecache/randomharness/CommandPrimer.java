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
package org.neo4j.io.pagecache.randomharness;

import org.eclipse.collections.api.set.primitive.LongSet;
import org.eclipse.collections.impl.factory.primitive.LongSets;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.TinyLockManager;
import org.neo4j.io.pagecache.impl.muninn.MuninnPageCache;

import static org.assertj.core.api.Assertions.assertThat;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;

class CommandPrimer
{
    private final Random rng;
    private final MuninnPageCache cache;
    private final Path[] files;
    private final Map<Path,PagedFile> fileMap;
    private final Map<Path,List<Integer>> recordsWrittenTo;
    private final List<Path> mappedFiles;
    private final Set<Path> filesTouched;
    private final int filePageCount;
    private final int filePageSize;
    private final RecordFormat recordFormat;
    private final int maxRecordCount;
    private final int recordsPerPage;
    // Entity-locks that protect the individual records, since page write locks are not exclusive.
    private final TinyLockManager recordLocks;

    CommandPrimer( Random rng, MuninnPageCache cache, Path[] files, Map<Path,PagedFile> fileMap, int filePageCount,
            int filePageSize, RecordFormat recordFormat )
    {
        this.rng = rng;
        this.cache = cache;
        this.files = files;
        this.fileMap = fileMap;
        this.filePageCount = filePageCount;
        this.filePageSize = filePageSize;
        this.recordFormat = recordFormat;
        mappedFiles = new ArrayList<>();
        mappedFiles.addAll( fileMap.keySet() );
        filesTouched = new HashSet<>();
        filesTouched.addAll( mappedFiles );
        recordsWrittenTo = new HashMap<>();
        recordsPerPage = cache.pageSize() / recordFormat.getRecordSize();
        maxRecordCount = filePageCount * recordsPerPage;
        recordLocks = new TinyLockManager();

        for ( Path file : files )
        {
            recordsWrittenTo.put( file, new ArrayList<>() );
        }
    }

    public List<Path> getMappedFiles()
    {
        return mappedFiles;
    }

    public Set<Path> getFilesTouched()
    {
        return filesTouched;
    }

    public Action prime( Command command )
    {
        switch ( command )
        {
        case FlushCache: return flushCache();
        case FlushFile: return flushFile();
        case MapFile: return mapFile();
        case UnmapFile: return unmapFile();
        case ReadRecord: return readRecord();
        case WriteRecord: return writeRecord();
        case ReadMulti: return readMulti();
        case WriteMulti: return writeMulti();
        default: throw new IllegalArgumentException( "Unknown command: " + command );
        }
    }

    private Action flushCache()
    {
        return new Action( Command.FlushCache, "" )
        {
            @Override
            public void perform() throws Exception
            {
                cache.flushAndForce();
            }
        };
    }

    private Action flushFile()
    {
        if ( mappedFiles.size() > 0 )
        {
            final Path file = mappedFiles.get( rng.nextInt( mappedFiles.size() ) );
            return new Action( Command.FlushFile, "[file=%s]", file.getFileName() )
            {
                @Override
                public void perform() throws Exception
                {
                    PagedFile pagedFile = fileMap.get( file );
                    if ( pagedFile != null )
                    {
                        pagedFile.flushAndForce();
                    }
                }
            };
        }
        return new Action( Command.FlushFile, "[no files mapped to flush]" )
        {
            @Override
            public void perform()
            {
            }
        };
    }

    private Action mapFile()
    {
        final Path file = files[rng.nextInt( files.length )];
        mappedFiles.add( file );
        filesTouched.add( file );
        return new Action( Command.MapFile, "[file=%s]", file )
        {
            @Override
            public void perform() throws Exception
            {
                fileMap.put( file, cache.map( file, filePageSize, DEFAULT_DATABASE_NAME ) );
            }
        };
    }

    private Action unmapFile()
    {
        if ( mappedFiles.size() > 0 )
        {
            final Path file = mappedFiles.remove( rng.nextInt( mappedFiles.size() ) );
            return new Action( Command.UnmapFile, "[file=%s]", file )
            {
                @Override
                public void perform()
                {
                    fileMap.get( file ).close();
                }
            };
        }
        return null;
    }

    private Action readRecord()
    {
        return buildReadRecord( null );
    }

    private Action writeRecord()
    {
        return buildWriteAction( null, LongSets.immutable.empty() );
    }

    private Action readMulti()
    {
        int count = rng.nextInt( 5 ) + 1;
        Action action = null;
        for ( int i = 0; i < count; i++ )
        {
            action = buildReadRecord( action );
        }
        return action;
    }

    private Action writeMulti()
    {
        int count = rng.nextInt( 5 ) + 1;
        Action action = null;
        for ( int i = 0; i < count; i++ )
        {
            action = buildWriteAction( action, LongSets.immutable.empty() );
        }
        return action;
    }

    private Action buildReadRecord( Action innerAction )
    {
        int mappedFilesCount = mappedFiles.size();
        if ( mappedFilesCount == 0 )
        {
            return innerAction;
        }
        final Path file = mappedFiles.get( rng.nextInt( mappedFilesCount ) );
        List<Integer> recordsWritten = recordsWrittenTo.get( file );
        final int recordId = recordsWritten.isEmpty() ? rng.nextInt( maxRecordCount )
                                                      : recordsWritten.get( rng.nextInt( recordsWritten.size() ) );
        final int pageId = recordId / recordsPerPage;
        final int pageOffset = (recordId % recordsPerPage) * recordFormat.getRecordSize();
        final Record expectedRecord = recordFormat.createRecord( file, recordId, pageId, pageOffset );
        return new ReadAction( file, recordId, pageId, pageOffset, expectedRecord, innerAction );
    }

    private Action buildWriteAction( Action innerAction, LongSet forbiddenRecordIds )
    {
        int mappedFilesCount = mappedFiles.size();
        if ( mappedFilesCount == 0 )
        {
            return innerAction;
        }
        final Path file = mappedFiles.get( rng.nextInt( mappedFilesCount ) );
        filesTouched.add( file );
        int recordId;
        do
        {
            recordId = rng.nextInt( filePageCount * recordsPerPage );
        }
        while ( forbiddenRecordIds.contains( recordId ) );
        recordsWrittenTo.get( file ).add( recordId );
        final int pageId = recordId / recordsPerPage;
        final int pageOffset = (recordId % recordsPerPage) * recordFormat.getRecordSize();
        final Record record = recordFormat.createRecord( file, recordId, pageId, pageOffset );
        return new WriteAction( file, recordId, pageId, pageOffset, record, innerAction );
    }

    private class ReadAction extends Action
    {
        private final Path file;
        private final int pageId;
        private final int pageOffset;
        private final Record expectedRecord;

        ReadAction( Path file, int recordId, int pageId, int pageOffset, Record expectedRecord, Action innerAction )
        {
            super( Command.ReadRecord, innerAction,
                    "[file=%s, recordId=%s, pageId=%s, pageOffset=%s, expectedRecord=%s]", file, recordId, pageId,
                    pageOffset, expectedRecord );
            this.file = file;
            this.pageId = pageId;
            this.pageOffset = pageOffset;
            this.expectedRecord = expectedRecord;
        }

        @Override
        public void perform() throws Exception
        {
            PagedFile pagedFile = fileMap.get( file );
            if ( pagedFile != null )
            {
                try ( PageCursor cursor = pagedFile.io( pageId, PagedFile.PF_SHARED_READ_LOCK, NULL ) )
                {
                    if ( cursor.next() )
                    {
                        cursor.setOffset( pageOffset );
                        Record actualRecord = recordFormat.readRecord( cursor );
                        assertThat( actualRecord ).as( toString() ).isIn( expectedRecord, recordFormat.zeroRecord() );
                        performInnerAction();
                    }
                }
            }
        }
    }

    private class WriteAction extends Action
    {
        private final Path file;
        private final int recordId;
        private final int pageId;
        private final int pageOffset;
        private final Record record;

        WriteAction( Path path, int recordId, int pageId, int pageOffset, Record record, Action innerAction )
        {
            super( Command.WriteRecord, innerAction, "[file=%s, recordId=%s, pageId=%s, pageOffset=%s, record=%s]",
                    path, recordId, pageId, pageOffset, record );
            this.file = path;
            this.recordId = recordId;
            this.pageId = pageId;
            this.pageOffset = pageOffset;
            this.record = record;
        }

        @Override
        public void perform() throws Exception
        {
            PagedFile pagedFile = fileMap.get( file );
            if ( pagedFile != null )
            {
                // We use tryLock to avoid any deadlock scenarios.
                if ( recordLocks.tryLock( recordId ) )
                {
                    try
                    {
                        try ( PageCursor cursor = pagedFile.io( pageId, PagedFile.PF_SHARED_WRITE_LOCK, NULL ) )
                        {
                            if ( cursor.next() )
                            {
                                cursor.setOffset( pageOffset );
                                recordFormat.write( record, cursor );
                                performInnerAction();
                            }
                        }
                    }
                    finally
                    {
                        recordLocks.unlock( recordId );
                    }

                    // check that we wrote everything correctly
                    try
                    {
                        try ( PageCursor cursor = pagedFile.io( pageId, PagedFile.PF_SHARED_WRITE_LOCK, NULL ) )
                        {
                            if ( cursor.next() )
                            {
                                cursor.setOffset( pageOffset );
                                var actualRecord = recordFormat.readRecord( cursor );
                                assertThat( actualRecord ).as( toString() ).isEqualTo( record );
                            }
                        }
                    }
                    finally
                    {
                        recordLocks.unlock( recordId );
                    }
                }
            }
            else
            {
                performInnerAction();
            }
        }
    }
}
