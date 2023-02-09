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
package org.neo4j.kernel.impl.storemigration;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.common.ProgressReporter;
import org.neo4j.configuration.Config;
import org.neo4j.exceptions.KernelException;
import org.neo4j.internal.batchimport.IndexImporterFactory;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexProviderDescriptor;
import org.neo4j.internal.schema.SchemaRule;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.logging.internal.LogService;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.StorageEngineFactory;
import org.neo4j.storageengine.api.StoreVersion;
import org.neo4j.storageengine.api.format.CapabilityType;
import org.neo4j.storageengine.migration.AbstractStoreMigrationParticipant;

public class IndexProviderMigrator extends AbstractStoreMigrationParticipant
{
    private static final String INDEX_PROVIDER_MIGRATION_TAG = "indexProviderMigration";
    private final FileSystemAbstraction fs;
    private final Config config;
    private final PageCache pageCache;
    private final LogService logService;
    private final StorageEngineFactory storageEngineFactory;
    private final PageCacheTracer cacheTracer;
    private final MemoryTracker memoryTracker;

    IndexProviderMigrator( FileSystemAbstraction fs, Config config, PageCache pageCache, LogService logService, StorageEngineFactory storageEngineFactory,
            PageCacheTracer cacheTracer, MemoryTracker memoryTracker )
    {
        super( "Index providers" );
        this.fs = fs;
        this.config = config;
        this.pageCache = pageCache;
        this.logService = logService;
        this.storageEngineFactory = storageEngineFactory;
        this.cacheTracer = cacheTracer;
        this.memoryTracker = memoryTracker;
    }

    @Override
    public void migrate( DatabaseLayout directoryLayout, DatabaseLayout migrationLayout, ProgressReporter progress, String versionToMigrateFrom,
            String versionToMigrateTo, IndexImporterFactory indexImporterFactory ) throws KernelException, IOException
    {
        if ( needProviderMigration( versionToMigrateFrom, versionToMigrateTo ) )
        {
            migrateIndexProviders( migrationLayout, versionToMigrateTo );
        }
    }

    private void migrateIndexProviders( DatabaseLayout migrationLayout, String versionToMigrateTo ) throws IOException, KernelException
    {
        try ( var cursorContext = new CursorContext( cacheTracer.createPageCursorTracer( INDEX_PROVIDER_MIGRATION_TAG ) );
              var ruleAccess = storageEngineFactory.schemaRuleMigrationAccess( fs, pageCache, config, migrationLayout, logService,
                        versionToMigrateTo, cacheTracer, cursorContext, memoryTracker ) )
        {
            for ( SchemaRule rule : ruleAccess.getAll() )
            {
                SchemaRule upgraded = upgradeIndexProvider( rule );

                if ( upgraded != rule )
                {
                    ruleAccess.writeSchemaRule( upgraded );
                }
            }
        }
    }

    @Override
    public void moveMigratedFiles( DatabaseLayout migrationLayout, DatabaseLayout directoryLayout, String versionToMigrateFrom, String versionToMigrateTo )
            throws IOException
    {
        if ( needProviderMigration( versionToMigrateFrom, versionToMigrateTo ) )
        {
            // All retired indexes need to be deleted because they have had there provider migrated.
            for ( IndexMigration indexMigration : IndexMigration.retired() )
            {
                for ( Path retiredRootDirectory : indexMigration.providerRootDirectories( directoryLayout ) )
                {
                    fs.deleteRecursively( retiredRootDirectory );
                }
            }
        }
    }

    @Override
    public void cleanup( DatabaseLayout migrationLayout )
    {
        // Nothing to clean up.
    }

    public static SchemaRule upgradeIndexProvider( SchemaRule rule )
    {
        if ( rule instanceof IndexDescriptor )
        {
            IndexDescriptor old = (IndexDescriptor) rule;
            IndexProviderDescriptor provider = old.getIndexProvider();

            String currentKey = provider.getKey();
            String currentVersion = provider.getVersion();

            for ( IndexMigration retired : IndexMigration.retired() )
            {
                if ( currentKey.equals( retired.providerKey ) && currentVersion.equals( retired.providerVersion ) )
                {
                    IndexProviderDescriptor replacement = retired.desiredAlternativeProvider;
                    return old.withIndexProvider( replacement);
                }
            }
        }
        return rule;
    }

    private boolean needProviderMigration( String versionToMigrateFrom, String versionToMigrateTo )
    {
        StoreVersion fromVersionInformation = storageEngineFactory.versionInformation( versionToMigrateFrom );
        StoreVersion toVersionInformation = storageEngineFactory.versionInformation( versionToMigrateTo );
        return !fromVersionInformation.hasCompatibleCapabilities( toVersionInformation, CapabilityType.INDEX_PROVIDER );
    }
}
