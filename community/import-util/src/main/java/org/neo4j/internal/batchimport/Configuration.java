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
package org.neo4j.internal.batchimport;

import java.nio.file.Path;

import org.neo4j.configuration.Config;
import org.neo4j.io.ByteUnit;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.io.os.OsBeanUtil;

import static java.lang.Math.min;
import static java.lang.Math.round;
import static org.neo4j.configuration.GraphDatabaseSettings.pagecache_memory;
import static org.neo4j.configuration.GraphDatabaseSettings.upgrade_processors;
import static org.neo4j.io.ByteUnit.gibiBytes;
import static org.neo4j.util.FeatureToggles.getInteger;

/**
 * Configuration for a an importer, mostly how and how much resources are used.
 */
public interface Configuration
{
    int DEFAULT_BATCH_SIZE = getInteger( Configuration.class, "DEFAULT_BATCH_SIZE", 10_000 );

    /**
     * File name in which bad entries from the import will end up. This file will be created in the
     * database directory of the imported database, i.e. <into>/bad.log.
     */
    long MAX_PAGE_CACHE_MEMORY = gibiBytes( 1 );
    int DEFAULT_MAX_MEMORY_PERCENT = 90;

    /**
     * Size of batches that are being sent through pipelines for processing.
     */
    default int batchSize()
    {
        return DEFAULT_BATCH_SIZE;
    }

    /**
     * For statistics the average processing time is based on total processing time divided by
     * number of batches processed. A total average is probably not that interesting so this configuration
     * option specifies how many of the latest processed batches counts in the equation above.
     */
    default int movingAverageSize()
    {
        return 100;
    }

    /**
     * Rough max number of processors (CPU cores) simultaneously used in total by importer at any given time.
     * This value should be set while taking the necessary IO threads into account; the page cache and the operating
     * system will require a couple of threads between them, to handle the IO workload the importer generates.
     * Defaults to the value provided by the {@link Runtime#availableProcessors() jvm}. There's a discrete
     * number of threads that needs to be used just to get the very basics of the import working,
     * so for that reason there's no lower bound to this value.
     *   "Processor" in the context of the batch importer is different from "thread" since when discovering
     * how many processors are fully in use there's a calculation where one thread takes up 0 < fraction <= 1
     * of a processor.
     */
    default int maxNumberOfProcessors()
    {
        return allAvailableProcessors();
    }

    /**
     * The maximum number of batches that will be queued in processor steps. The total number of "alive" batches
     * will roughly be this value + number of processors assigned to the step that has the most processors assigned.
     */
    default int maxQueueSize()
    {
        return maxNumberOfProcessors();
    }

    static int allAvailableProcessors()
    {
        return Runtime.getRuntime().availableProcessors();
    }

    /**
     * @return amount of memory to reserve for the page cache. This should just be "enough" for it to be able
     * to sequentially read and write a couple of stores at a time. If configured too high then there will
     * be less memory available for other caches which are critical during the import. Optimal size is
     * estimated to be 100-200 MiB. The importer will figure out an optimal page size from this value,
     * with slightly bigger page size than "normal" random access use cases.
     */
    default long pageCacheMemory()
    {
        // Get the upper bound of what we can get from the default config calculation
        // We even want to limit amount of memory a bit more since we don't need very much during import
        long maxFreeMemory = OsBeanUtil.getFreePhysicalMemory();
        if ( 0 < maxFreeMemory && maxFreeMemory < Long.MAX_VALUE )
        {
            // We got a reading of amount of free memory from the OS, use this to potentially reduce the page cache
            // size if the amount of free memory is very small.
            return min( MAX_PAGE_CACHE_MEMORY, maxFreeMemory );
        }
        // We couldn't get a proper reading from the OS, just allocate the default page cache size,
        // which is quite small and optimal in terms of performance.
        return MAX_PAGE_CACHE_MEMORY;
    }

    /**
     * @return max memory to use for import cache data structures while importing.
     * This should exclude the memory acquired by this JVM. By default this returns total physical
     * memory on the machine it's running on minus the max memory of this JVM.
     * {@value #DEFAULT_MAX_MEMORY_PERCENT}% of that figure.
     * @throws UnsupportedOperationException if available memory couldn't be determined.
     */
    default long maxMemoryUsage()
    {
        return calculateMaxMemoryFromPercent( DEFAULT_MAX_MEMORY_PERCENT );
    }

    /**
     * @return whether or not to do sequential flushing of the page cache in the during stages which
     * import nodes and relationships. Having this {@code true} will reduce random I/O and make most
     * writes happen in this single background thread and will greatly benefit hardware which generally
     * benefits from single sequential writer.
     */
    default boolean sequentialBackgroundFlushing()
    {
        return true;
    }

    /**
     * Controls whether or not to write records in parallel. Multiple threads writing records in parallel
     * doesn't necessarily mean concurrent I/O because writing is separate from page cache eviction/flushing.
     */
    default boolean parallelRecordWrites()
    {
        // Defaults to true since this benefits virtually all environments
        return true;
    }

    /**
     * Controls whether or not to read records in parallel in stages where there's no record writing.
     * Enabling this may result in multiple pages being read from underlying storage concurrently.
     */
    default boolean parallelRecordReads()
    {
        // Defaults to true since this benefits most environments
        return true;
    }

    /**
     * Controls whether or not to read records in parallel in stages where there's concurrent record writing.
     * Enabling will probably increase concurrent I/O to a point which reduces performance if underlying storage
     * isn't great at concurrent I/O, especially if also {@link #parallelRecordWrites()} is enabled.
     */
    default boolean highIO()
    {
        // Defaults to false since some environments sees less performance with this enabled
        return false;
    }

    /**
     * Whether or not to allocate memory for holding the cache on heap. The first alternative is to allocate
     * off-heap, but if there's no more available memory, but there might be in the heap the importer will
     * try to allocate chunks of the cache on heap instead. This config control whether or not to allow
     * this allocation to happen on heap.
     */
    default boolean allowCacheAllocationOnHeap()
    {
        return false;
    }

    /**
     * @return index related configurations.
     */
    default IndexConfig indexConfig()
    {
        return IndexConfig.DEFAULT;
    }

    Configuration DEFAULT = new Configuration()
    {
    };

    /**
     * {@link #DEFAULT} configuration additionally specialized for the given {@code pathOnDevice}.
     * @param pathOnDevice {@link Path} to look for clues how to fine tune the configuration even more.
     * @return a {@link Configuration} instance with {@link #DEFAULT defaults} and additionally further specialized for the given device.
     */
    static Configuration defaultConfiguration( Path pathOnDevice )
    {
        boolean highIoForDevice = FileUtils.highIODevice( pathOnDevice );
        return new Overridden( Configuration.DEFAULT )
        {
            @Override
            public boolean highIO()
            {
                return highIoForDevice;
            }
        };
    }

    class Overridden implements Configuration
    {
        private final Configuration defaults;
        private final Config config;

        public Overridden( Configuration defaults )
        {
            this( defaults, Config.defaults() );
        }

        public Overridden( Configuration defaults, Config config )
        {
            this.defaults = defaults;
            this.config = config;
        }

        public Overridden( Config config )
        {
            this( Configuration.DEFAULT, config );
        }

        @Override
        public long pageCacheMemory()
        {
            String pageCacheMemory = config.get( pagecache_memory );
            if ( pageCacheMemory == null )
            {
                return defaults.pageCacheMemory();
            }
            return min( MAX_PAGE_CACHE_MEMORY, ByteUnit.parse( pageCacheMemory ) );
        }

        @Override
        public int movingAverageSize()
        {
            return defaults.movingAverageSize();
        }

        @Override
        public boolean sequentialBackgroundFlushing()
        {
            return defaults.sequentialBackgroundFlushing();
        }

        @Override
        public int batchSize()
        {
            return defaults.batchSize();
        }

        @Override
        public int maxNumberOfProcessors()
        {
            Integer upgradeProcessors = config.get( upgrade_processors );
            if ( upgradeProcessors == 0 )
            {
                return defaults.maxNumberOfProcessors();
            }
            return upgradeProcessors;
        }

        @Override
        public boolean parallelRecordWrites()
        {
            return defaults.parallelRecordWrites();
        }

        @Override
        public boolean parallelRecordReads()
        {
            return defaults.parallelRecordReads();
        }

        @Override
        public boolean highIO()
        {
            return defaults.highIO();
        }

        @Override
        public long maxMemoryUsage()
        {
            return defaults.maxMemoryUsage();
        }

        @Override
        public boolean allowCacheAllocationOnHeap()
        {
            return defaults.allowCacheAllocationOnHeap();
        }
    }

    static Configuration withBatchSize( Configuration config, int batchSize )
    {
        return new Overridden( config )
        {
            @Override
            public int batchSize()
            {
                return batchSize;
            }
        };
    }

    static boolean canDetectFreeMemory()
    {
        return OsBeanUtil.getFreePhysicalMemory() != OsBeanUtil.VALUE_UNAVAILABLE;
    }

    static long calculateMaxMemoryFromPercent( int percent )
    {
        if ( percent < 1 )
        {
            throw new IllegalArgumentException( "Expected percentage to be > 0, was " + percent );
        }
        if ( percent > 100 )
        {
            throw new IllegalArgumentException( "Expected percentage to be < 100, was " + percent );
        }
        long totalPhysicalMemory = OsBeanUtil.getTotalPhysicalMemory();
        if ( totalPhysicalMemory == OsBeanUtil.VALUE_UNAVAILABLE )
        {
            // Unable to detect amount of free memory, so rather max memory should be explicitly set
            // in order to get best performance. However let's just go with a default of 2G in this case.
            return gibiBytes( 2 );
        }

        double factor = percent / 100D;
        long jvmMaxMemory = Runtime.getRuntime().maxMemory();
        long halfPhysicalMemory = totalPhysicalMemory / 2;
        if ( jvmMaxMemory > halfPhysicalMemory )
        {
            // The JVM max heap size (-Xmx) have been configured to use a significant portion of the machine memory.
            // This isn't reasonable, at the very least not desirable for an import since the majority of memory lives off-heap.
            // So if this is the case then assume only half the memory is assigned to the JVM, otherwise the importer
            // performance could be massively crippled.
            jvmMaxMemory = halfPhysicalMemory;
        }
        long availableMemory = totalPhysicalMemory - jvmMaxMemory;
        return round( availableMemory * factor );
    }
}
