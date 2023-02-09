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
package org.neo4j.internal.id;

import org.eclipse.collections.api.set.ImmutableSet;

import java.io.IOException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.stream.Collectors;

import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector;
import org.neo4j.internal.id.indexed.IndexedIdGenerator;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;

import static org.neo4j.internal.id.indexed.LoggingIndexedIdGeneratorMonitor.defaultIdMonitor;

public class DefaultIdGeneratorFactory implements IdGeneratorFactory
{
    private final Map<IdType, IndexedIdGenerator> generators = new HashMap<>();
    protected final FileSystemAbstraction fs;
    private final RecoveryCleanupWorkCollector recoveryCleanupWorkCollector;
    protected final boolean allowLargeIdCaches;
    private final String databaseName;

    /**
     * By default doesn't allow large ID caches.
     *
     * @param fs {@link FileSystemAbstraction} to back the id generators.
     * @param recoveryCleanupWorkCollector {@link RecoveryCleanupWorkCollector} for cleanup on starting the id generators.
     */
    public DefaultIdGeneratorFactory( FileSystemAbstraction fs, RecoveryCleanupWorkCollector recoveryCleanupWorkCollector, String databaseName )
    {
        this( fs, recoveryCleanupWorkCollector, false, databaseName );
    }

    /**
     * @param fs {@link FileSystemAbstraction} to back the id generators.
     * @param recoveryCleanupWorkCollector {@link RecoveryCleanupWorkCollector} for cleanup on starting the id generators.
     * @param allowLargeIdCaches override the "activity" setting from {@link IdType} to always use low activity. This is useful for databases
     * that generally see very low activity so that the id generators won't benefit from having large ID caches and instead use small ID caches.
     * Functionally this makes no difference, it only affects performance (and memory usage which is the main driver for forcing low activity).
     * @param databaseName name of the database this id generator belongs to
     */
    public DefaultIdGeneratorFactory( FileSystemAbstraction fs, RecoveryCleanupWorkCollector recoveryCleanupWorkCollector, boolean allowLargeIdCaches,
            String databaseName )
    {
        this.fs = fs;
        this.recoveryCleanupWorkCollector = recoveryCleanupWorkCollector;
        this.allowLargeIdCaches = allowLargeIdCaches;
        this.databaseName = databaseName;
    }

    @Override
    public IdGenerator open( PageCache pageCache, Path filename, IdType idType, LongSupplier highIdScanner, long maxId, DatabaseReadOnlyChecker readOnlyChecker,
            Config config, CursorContext cursorContext, ImmutableSet<OpenOption> openOptions, IdSlotDistribution slotDistribution ) throws IOException
    {
        IndexedIdGenerator generator =
                instantiate( fs, pageCache, recoveryCleanupWorkCollector, filename, highIdScanner, maxId, idType, readOnlyChecker, config, cursorContext,
                        databaseName, openOptions,
                        slotDistribution );
        generators.put( idType, generator );
        return generator;
    }

    protected IndexedIdGenerator instantiate( FileSystemAbstraction fs, PageCache pageCache, RecoveryCleanupWorkCollector recoveryCleanupWorkCollector,
            Path fileName, LongSupplier highIdSupplier, long maxValue, IdType idType, DatabaseReadOnlyChecker readOnlyChecker, Config config,
            CursorContext cursorContext, String databaseName, ImmutableSet<OpenOption> openOptions, IdSlotDistribution slotDistribution )
    {
        // highId not used when opening an IndexedIdGenerator
        return new IndexedIdGenerator( pageCache, fileName, recoveryCleanupWorkCollector, idType, allowLargeIdCaches, highIdSupplier, maxValue, readOnlyChecker,
                config, databaseName, cursorContext, defaultIdMonitor( fs, fileName, config ), openOptions, slotDistribution );
    }

    @Override
    public IdGenerator get( IdType idType )
    {
        return generators.get( idType );
    }

    @Override
    public IdGenerator create( PageCache pageCache, Path fileName, IdType idType, long highId, boolean throwIfFileExists, long maxId,
            DatabaseReadOnlyChecker readOnlyChecker, Config config, CursorContext cursorContext, ImmutableSet<OpenOption> openOptions,
            IdSlotDistribution slotDistribution ) throws IOException
    {
        // For the potential scenario where there's no store (of course this is where this method will be called),
        // but there's a naked id generator, then delete the id generator so that it too starts from a clean state.
        if ( fs.fileExists( fileName ) )
        {
            fs.deleteFile( fileName );
        }

        IndexedIdGenerator generator =
                new IndexedIdGenerator( pageCache, fileName, recoveryCleanupWorkCollector, idType, allowLargeIdCaches, () -> highId, maxId, readOnlyChecker,
                        config, databaseName, cursorContext, defaultIdMonitor( fs, fileName, config ), openOptions, slotDistribution );
        generator.checkpoint( cursorContext );
        generators.put( idType, generator );
        return generator;
    }

    @Override
    public void visit( Consumer<IdGenerator> visitor )
    {
        generators.values().forEach( visitor );
    }

    @Override
    public void clearCache( CursorContext cursorContext )
    {
        generators.values().forEach( generator -> generator.clearCache( cursorContext ) );
    }

    @Override
    public Collection<Path> listIdFiles()
    {
        return generators.values().stream().map( IndexedIdGenerator::path ).collect( Collectors.toList() );
    }
}
