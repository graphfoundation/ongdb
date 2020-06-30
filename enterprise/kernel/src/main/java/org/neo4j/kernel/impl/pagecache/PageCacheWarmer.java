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
package org.neo4j.kernel.impl.pagecache;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.graphdb.Resource;
import org.neo4j.io.fs.FileHandle;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.PagedFile;
import org.neo4j.io.pagecache.impl.FileIsNotMappedException;
import org.neo4j.kernel.impl.transaction.state.DatabaseFileListing.StoreFileProvider;
import org.neo4j.logging.Log;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.StoreFileMetadata;

import static java.util.Comparator.naturalOrder;
import static org.neo4j.io.pagecache.PagedFile.PF_NO_FAULT;
import static org.neo4j.io.pagecache.PagedFile.PF_SHARED_READ_LOCK;

/**
 * The page cache warmer profiles the page cache to figure out what data is in memory and what is not, and uses those profiles to load probably-desirable data
 * into the page cache during startup.
 * <p>
 * The profiling data is stored in a "profiles" directory in the same directory the mapped files. The profile files have the same name as their corresponding
 * mapped file, except they end with a dot-hexadecimal sequence number, and ".cacheprof".
 * <p>
 * The profiles are collected in the "profiles" directory, so it is easy to get rid of all of them, on the off chance that something is wrong with them.
 * <p>
 * These cacheprof files are compressed bitmaps where each raised bit indicates that the page identified by the bit-index was in memory.
 */
public class PageCacheWarmer implements StoreFileProvider
{

    public static final String SUFFIX_CACHEPROF = ".cacheprof";

    private static final int IO_PARALLELISM = Runtime.getRuntime().availableProcessors();

    private final FileSystemAbstraction fs;
    private final PageCache pageCache;
    private final JobScheduler scheduler;
    private final File databaseDirectory;
    private final File profilesDirectory;
    private final Log log;
    private final ProfileRefCounts refCounts;
    private final Config config;
    private volatile boolean stopped;
    private ExecutorService executor;
    private PageLoaderFactory pageLoaderFactory;

    PageCacheWarmer( FileSystemAbstraction fs, PageCache pageCache, JobScheduler scheduler,
                     File databaseDirectory, Config config, Log log )
    {
        this.fs = fs;
        this.pageCache = pageCache;
        this.scheduler = scheduler;
        this.databaseDirectory = databaseDirectory;
        this.profilesDirectory = new File( databaseDirectory, "profiles" );
        this.log = log;
        this.refCounts = new ProfileRefCounts();
        this.config = config;
    }

    private static ExecutorService buildExecutorService( JobScheduler scheduler )
    {
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue( IO_PARALLELISM * 4 );
        RejectedExecutionHandler rejectionPolicy = new CallerRunsPolicy();
        ThreadFactory threadFactory = scheduler.threadFactory( Group.FILE_IO_HELPER );
        return new ThreadPoolExecutor( 0, IO_PARALLELISM, 10L, TimeUnit.SECONDS, workQueue,
                                       threadFactory, rejectionPolicy );
    }

    private static Stream<Profile> filterRelevant( Profile[] profiles, PagedFile pagedFile )
    {
        return Stream.of( profiles ).filter( Profile.relevantTo( pagedFile ) );
    }

    @Override
    public synchronized Resource addFilesTo( Collection<StoreFileMetadata> coll ) throws IOException
    {
        if ( this.stopped )
        {
            return Resource.EMPTY;
        }
        else
        {
            List<PagedFile> files = this.pageCache.listExistingMappings();
            Profile[] existingProfiles = this.findExistingProfiles( files );
            for ( Profile profile : existingProfiles )
            {
                coll.add( new StoreFileMetadata( profile.file(), 1, false ) );
            }

            this.refCounts.incrementRefCounts( existingProfiles );
            return () -> refCounts.decrementRefCounts( existingProfiles );
        }
    }

    public synchronized void start()
    {
        this.stopped = false;
        this.executor = buildExecutorService( this.scheduler );
        this.pageLoaderFactory = new PageLoaderFactory( this.executor, this.pageCache );
    }

    public void stop()
    {
        this.stopped = true;
        this.stopWarmer();
    }

    /**
     * Stopping warmer process, needs to be synchronised to prevent racing with profiling and heating
     */
    private synchronized void stopWarmer()
    {
        if ( this.executor != null )
        {
            this.executor.shutdown();
        }
    }

    /**
     * Reheat the page cache based on existing profiling data, or do nothing if no profiling data is available.
     *
     * @return An {@link OptionalLong} of the number of pages loaded in, or {@link OptionalLong#empty()} if the reheating was stopped early via {@link #stop()}.
     * @throws IOException if anything goes wrong while reading the profiled data back in.
     */
    synchronized OptionalLong reheat() throws IOException
    {
        if ( this.stopped )
        {
            return OptionalLong.empty();
        }
        else
        {
            return this.config.get( GraphDatabaseSettings.pagecache_warmup_prefetch ) ? OptionalLong
                    .of( this.loadAll() )
                                                                                      : OptionalLong.of( this.loadEverythingFromProfile() );
        }
    }

    private long loadAll()
    {
        try
        {
            Pattern whitelist = Pattern.compile(
                    this.config.get( GraphDatabaseSettings.pagecache_warmup_prefetch_whitelist ) );
            this.log.info( "Warming up page cache by pre-fetching files matching regex: %s",
                           new Object[]{whitelist.pattern()} );
            List<JobHandle> handles = new ArrayList();
            LongAdder totalPageCounter = new LongAdder();
            Iterator iterator = this.pageCache.listExistingMappings().iterator();

            while ( iterator.hasNext() )
            {
                PagedFile pagedFile = (PagedFile) iterator.next();
                if ( whitelist.matcher( pagedFile.file().toString() ).find() )
                {
                    handles.add( this.scheduler.schedule( Group.FILE_IO_HELPER, () ->
                    {
                        totalPageCounter.add( this.touchAllPages( pagedFile ) );
                    } ) );
                }
            }

            iterator = handles.iterator();

            while ( iterator.hasNext() )
            {
                JobHandle handle = (JobHandle) iterator.next();
                handle.waitTermination();
            }

            this.log.info( "Warming of page cache completed" );
            return totalPageCounter.sum();
        }
        catch ( IOException e )
        {
            throw new RuntimeException( "Could not list existing mappings in page cache", e );
        }
        catch ( InterruptedException | ExecutionException e )
        {
            throw new RuntimeException( "Got interrupted while warming up page cache", e );
        }
    }

    private long touchAllPages( PagedFile pagedFile )
    {
        this.log.debug( "Pre-fetching %s", new Object[]{pagedFile.file().getName()} );

        try
        {
            PageCursor cursor = pagedFile.io( 0L, 9 );

            long p;
            try
            {
                long pages = 0L;

                while ( true )
                {
                    if ( this.stopped || !cursor.next() )
                    {
                        this.pageCache.reportEvents();
                        p = pages;
                        break;
                    }

                    ++pages;
                }
            }
            catch ( Throwable e )
            {
                if ( cursor != null )
                {
                    try
                    {
                        cursor.close();
                    }
                    catch ( Throwable e2 )
                    {
                        e.addSuppressed( e2 );
                    }
                }

                throw e;
            }

            if ( cursor != null )
            {
                cursor.close();
            }

            return p;
        }
        catch ( IOException e )
        {
            throw new RuntimeException( "Could not prefetch all pages into page cache", e );
        }
    }

    private long loadEverythingFromProfile() throws IOException
    {
        long pagesLoaded = 0L;
        List<PagedFile> pagedFilesInDatabase = this.pageCache.listExistingMappings();
        Profile[] existingProfiles = this.findExistingProfiles( pagedFilesInDatabase );
        Iterator iterator = pagedFilesInDatabase.iterator();

        while ( iterator.hasNext() )
        {
            PagedFile file = (PagedFile) iterator.next();

            try
            {
                pagesLoaded += this.reheat( file, existingProfiles );
            }
            catch ( FileIsNotMappedException e )
            {
            }
        }

        return pagesLoaded;
    }

    public synchronized OptionalLong profile() throws IOException
    {
        if ( this.stopped )
        {
            return OptionalLong.empty();
        }
        else
        {
            long pagesInMemory = 0L;
            List<PagedFile> pagedFilesInDatabase = this.pageCache.listExistingMappings();
            Profile[] existingProfiles = this.findExistingProfiles( pagedFilesInDatabase );
            Iterator iterator = pagedFilesInDatabase.iterator();

            while ( iterator.hasNext() )
            {
                PagedFile file = (PagedFile) iterator.next();

                try
                {
                    pagesInMemory += this.profile( file, existingProfiles );
                }
                catch ( FileIsNotMappedException e )
                {
                }

                if ( this.stopped )
                {
                    this.pageCache.reportEvents();
                    return OptionalLong.empty();
                }
            }

            this.pageCache.reportEvents();
            return OptionalLong.of( pagesInMemory );
        }
    }

    private long reheat( PagedFile file, Profile[] existingProfiles ) throws IOException
    {
        Optional<Profile> savedProfile = filterRelevant( existingProfiles, file )
                .sorted( Comparator.reverseOrder() ) // Try most recent profile first.
                .filter( this::verifyChecksum )
                .findFirst();

        if ( !savedProfile.isPresent() )
        {
            return 0;
        }

        // The file contents checks out. Let's load it in.
        long pagesLoaded = 0;
        try ( InputStream input = savedProfile.get().read( fs );
              PageLoader loader = pageLoaderFactory.getLoader( file ) )
        {
            long pageId = 0;
            int b;
            while ( (b = input.read()) != -1 )
            {
                for ( int i = 0; i < 8; i++ )
                {
                    if ( stopped )
                    {
                        pageCache.reportEvents();
                        return pagesLoaded;
                    }
                    if ( (b & 1) == 1 )
                    {
                        loader.load( pageId );
                        pagesLoaded++;
                    }
                    b >>= 1;
                    pageId++;
                }
            }
        }
        pageCache.reportEvents();
        return pagesLoaded;
    }

    private boolean verifyChecksum( Profile profile )
    {
        // Successfully reading through and closing the compressed file implies verifying the gzip checksum.
        try ( InputStream input = profile.read( fs ) )
        {
            int b;
            do
            {
                b = input.read();
            }
            while ( b != -1 );
        }
        catch ( IOException ignore )
        {
            return false;
        }
        return true;
    }

    private long profile( PagedFile file, Profile[] existingProfiles ) throws IOException
    {
        long pagesInMemory = 0;
        Profile nextProfile = filterRelevant( existingProfiles, file )
                .max( naturalOrder() )
                .map( Profile::next )
                .orElse( Profile.first( this.databaseDirectory, file.file() ) );

        try ( OutputStream output = nextProfile.write( fs );
              PageCursor cursor = file.io( 0, PF_SHARED_READ_LOCK | PF_NO_FAULT ) )
        {
            int stepper = 0;
            int b = 0;
            while ( cursor.next() )
            {
                if ( cursor.getCurrentPageId() != PageCursor.UNBOUND_PAGE_ID )
                {
                    pagesInMemory++;
                    b |= 1 << stepper;
                }
                stepper++;
                if ( stepper == 8 )
                {
                    output.write( b );
                    b = 0;
                    stepper = 0;
                }
            }
            output.write( b );
            output.flush();
        }

        // Delete previous profile files.
        filterRelevant( existingProfiles, file )
                .filter( profile -> !refCounts.contains( profile ) )
                .forEach( profile -> profile.delete( fs ) );

        return pagesInMemory;
    }

    private Profile[] findExistingProfiles( List<PagedFile> pagedFilesInDatabase ) throws IOException
    {
        List<Path> allProfilePaths =
                this.fs.streamFilesRecursive( this.profilesDirectory ).map( FileHandle::getFile )
                       .map( File::toPath ).collect( Collectors.toList() );
        return pagedFilesInDatabase.stream().map( ( pagedFile ) ->
                                                  {
                                                      return pagedFile.file().toPath();
                                                  } ).flatMap( ( pagedFilePath ) ->
                                                               {
                                                                   return this.extractRelevantProfiles( allProfilePaths, pagedFilePath );
                                                               } ).toArray( ( n ) ->
                                                                            {
                                                                                return new Profile[n];
                                                                            } );
    }

    private Stream<? extends Profile> extractRelevantProfiles( List<Path> allProfilePaths,
                                                               Path pagedFilePath )
    {
        Path databasePath = this.databaseDirectory.toPath();
        Path profilesPath = this.profilesDirectory.toPath();
        return allProfilePaths.stream().filter( ( profilePath ) ->
                                                {
                                                    return this.sameRelativePath( databasePath, pagedFilePath, profilesPath, profilePath );
                                                } ).flatMap( ( profilePath ) ->
                                                             {
                                                                 return Profile.parseProfileName( databasePath, profilePath, pagedFilePath );
                                                             } );
    }

    private boolean sameRelativePath( Path databasePath, Path pagedFilePath, Path profilesPath,
                                      Path profilePath )
    {
        Path profileRelativeDir = profilesPath.relativize( profilePath ).getParent();
        Path pagedFileRelativeDir = databasePath.relativize( pagedFilePath ).getParent();
        if ( profileRelativeDir != null )
        {
            return profileRelativeDir.equals( pagedFileRelativeDir );
        }
        else
        {
            return pagedFileRelativeDir == null;
        }
    }
}
