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
import java.util.function.LongSupplier;

import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;

import static org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector.immediate;

/**
 * A {@link DefaultIdGeneratorFactory} that ignores any existing id file on open and instead replaces it with an id file
 * of the current format with the highId it got from scanning the store on open. I.e. it treats the store as source of truth
 * w/ regards to highId.
 *
 * This is very useful in various id-file migration scenarios, both when migrating from an old format, but also when migrating
 * from a store that has no id files (once upon a time this was accepted).
 */
public class ScanOnOpenOverwritingIdGeneratorFactory extends DefaultIdGeneratorFactory
{
    public ScanOnOpenOverwritingIdGeneratorFactory( FileSystemAbstraction fs, String databaseName )
    {
        super( fs, immediate(), databaseName );
    }

    @Override
    public IdGenerator open( PageCache pageCache, Path filename, IdType idType, LongSupplier highIdScanner, long maxId, DatabaseReadOnlyChecker readOnlyChecker,
            Config config, CursorContext cursorContext, ImmutableSet<OpenOption> openOptions, IdSlotDistribution slotDistribution ) throws IOException
    {
        long highId = highIdScanner.getAsLong();
        return create( pageCache, filename, idType, highId, true, maxId, readOnlyChecker, config, cursorContext, openOptions, slotDistribution );
    }
}
