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
package org.neo4j.test.utils;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;

import org.neo4j.adversaries.Adversary;
import org.neo4j.adversaries.pagecache.AdversarialPageCache;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.mem.MemoryAllocator;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PageSwapperFactory;
import org.neo4j.io.pagecache.checking.AccessCheckingPageCache;
import org.neo4j.io.pagecache.impl.SingleFilePageSwapperFactory;
import org.neo4j.io.pagecache.impl.muninn.MuninnPageCache;
import org.neo4j.io.pagecache.tracing.DefaultPageCacheTracer;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.memory.LocalMemoryTracker;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.test.scheduler.ThreadPoolJobScheduler;
import org.neo4j.time.Clocks;
import org.neo4j.time.SystemNanoClock;

import static java.lang.Boolean.TRUE;
import static org.neo4j.io.ByteUnit.parse;
import static org.neo4j.test.utils.PageCacheConfig.config;

public class PageCacheSupport
{
    protected JobScheduler jobScheduler;
    protected SystemNanoClock clock;
    protected PageCache pageCache;
    private final PageCacheConfig baseConfig;

    public PageCacheSupport()
    {
        this( config() );
    }

    public PageCacheSupport( PageCacheConfig config )
    {
        this.baseConfig = config;
    }

    public PageCache getPageCache( FileSystemAbstraction fs )
    {
        return getPageCache( fs, config() );
    }

    /**
     * Opens a new {@link PageCache} with the provided file system and config.
     *
     * @param fs {@link FileSystemAbstraction} to use for the {@link PageCache}.
     * @param overriddenConfig specific {@link PageCacheConfig} overriding config provided in {@link PageCacheSupport}
     * constructor, if any.
     * @return the opened {@link PageCache}.
     */
    public PageCache getPageCache( FileSystemAbstraction fs, PageCacheConfig overriddenConfig )
    {
        SingleFilePageSwapperFactory factory = new SingleFilePageSwapperFactory( fs, new DefaultPageCacheTracer() );
        return getPageCache( factory, overriddenConfig );
    }

    public PageCache getPageCache( PageSwapperFactory swapperFactory )
    {
        return getPageCache( swapperFactory, config() );
    }

    /**
     * Opens a new {@link PageCache} with the provided file system and config.
     *
     * @param factory {@link PageSwapperFactory} to use for the {@link PageCache}.
     * @param overriddenConfig specific {@link PageCacheConfig} overriding config provided in {@link PageCacheSupport}
     * constructor, if any.
     * @return the opened {@link PageCache}.
     */
    public PageCache getPageCache( PageSwapperFactory factory, PageCacheConfig overriddenConfig )
    {
        closeExistingPageCache();
        var memoryTracker = new LocalMemoryTracker();
        MemoryAllocator mman = MemoryAllocator.createAllocator( parse( selectConfig( baseConfig.memory, overriddenConfig.memory, "8 MiB" ) ),
                memoryTracker );
        if ( clock == null )
        {
            clock = Clocks.nanoClock();
        }
        MuninnPageCache.Configuration configuration = MuninnPageCache.config( mman ).memoryTracker( memoryTracker ).clock( clock );
        Integer pageSize = selectConfig( baseConfig.pageSize, overriddenConfig.pageSize, null );
        configuration = pageSize == null ? configuration : configuration.pageSize( pageSize );
        PageCacheTracer cacheTracer = selectConfig( baseConfig.tracer, overriddenConfig.tracer, PageCacheTracer.NULL );
        configuration = configuration.pageCacheTracer( cacheTracer );
        initializeJobScheduler();
        pageCache = new MuninnPageCache( factory, jobScheduler, configuration );
        pageCachePostConstruct( overriddenConfig );
        return pageCache;
    }

    protected void initializeJobScheduler()
    {
        jobScheduler = new ThreadPoolJobScheduler( "PageCacheRule-" );
    }

    protected static <T> T selectConfig( T base, T overridden, T defaultValue )
    {
        return ObjectUtils.firstNonNull( base, overridden, defaultValue );
    }

    protected void pageCachePostConstruct( PageCacheConfig overriddenConfig )
    {
        if ( selectConfig( baseConfig.inconsistentReads, overriddenConfig.inconsistentReads, TRUE ) )
        {
            AtomicBoolean controller = selectConfig( baseConfig.nextReadIsInconsistent,
                    overriddenConfig.nextReadIsInconsistent, null );
            Adversary adversary = controller != null
                    ? new AtomicBooleanInconsistentReadAdversary( controller )
                    : new RandomInconsistentReadAdversary();
            pageCache = new AdversarialPageCache( pageCache, adversary );
        }
        if ( selectConfig( baseConfig.accessChecks, overriddenConfig.accessChecks, false ) )
        {
            pageCache = new AccessCheckingPageCache( pageCache );
        }
    }

    protected void closeExistingPageCache()
    {
        closePageCache( "Failed to stop existing PageCache prior to creating a new one." );
        closeJobScheduler( "Failed to stop existing job scheduler prior to creating a new one." );
    }

    protected void after( boolean success )
    {
        closePageCache( "Failed to stop PageCache after test." );
        closeJobScheduler( "Failed to stop job scheduler after test." );
    }

    private void closeJobScheduler( String errorMessage )
    {
        if ( jobScheduler != null )
        {
            try
            {
                jobScheduler.close();
            }
            catch ( Exception e )
            {
                throw new RuntimeException( errorMessage, e );
            }
            jobScheduler = null;
        }
    }

    private void closePageCache( String errorMessage )
    {
        if ( pageCache != null )
        {
            try
            {
                pageCache.close();
            }
            catch ( Exception e )
            {
                throw new AssertionError( errorMessage, e );
            }
            pageCache = null;
        }
    }

    public static class AtomicBooleanInconsistentReadAdversary implements Adversary
    {
        final AtomicBoolean nextReadIsInconsistent;

        public AtomicBooleanInconsistentReadAdversary( AtomicBoolean nextReadIsInconsistent )
        {
            this.nextReadIsInconsistent = nextReadIsInconsistent;
        }

        @Override
        @SafeVarargs
        public final void injectFailure( Class<? extends Throwable>... failureTypes )
        {
        }

        @Override
        @SafeVarargs
        public final boolean injectFailureOrMischief( Class<? extends Throwable>... failureTypes )
        {
            return nextReadIsInconsistent.getAndSet( false );
        }

        @Override
        public Optional<Throwable> getLastAdversaryException()
        {
            return Optional.empty();
        }
    }

    private static class RandomInconsistentReadAdversary implements Adversary
    {
        @Override
        @SafeVarargs
        public final void injectFailure( Class<? extends Throwable>... failureTypes )
        {
        }

        @Override
        @SafeVarargs
        public final boolean injectFailureOrMischief( Class<? extends Throwable>... failureTypes )
        {
            return ThreadLocalRandom.current().nextBoolean();
        }

        @Override
        public Optional<Throwable> getLastAdversaryException()
        {
            return Optional.empty();
        }
    }
}
