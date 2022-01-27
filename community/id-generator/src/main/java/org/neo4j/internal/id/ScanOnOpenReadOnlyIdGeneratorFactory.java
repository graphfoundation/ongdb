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

import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.LongSupplier;

import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;

/**
 * {@link IdGeneratorFactory} that ignores the underlying id file and only uses the provided highIdScanner in
 * {@link IdGeneratorFactory#open(PageCache, Path, IdType, LongSupplier, long, DatabaseReadOnlyChecker, Config, CursorContext, ImmutableSet,
 * IdSlotDistribution)}, instantiating {@link IdGenerator} that will return that highId and do nothing else.
 * This is of great convenience when migrating between id file formats.
 */
public class ScanOnOpenReadOnlyIdGeneratorFactory implements IdGeneratorFactory
{
    private final Map<IdType,ReadOnlyHighIdGenerator> idGenerators = new HashMap<>();

    @Override
    public IdGenerator open( PageCache pageCache, Path filename, IdType idType, LongSupplier highIdScanner, long maxId, DatabaseReadOnlyChecker readOnlyChecker,
            Config config, CursorContext cursorContext, ImmutableSet<OpenOption> openOptions, IdSlotDistribution slotDistribution )
    {
        long highId = highIdScanner.getAsLong();
        ReadOnlyHighIdGenerator idGenerator = new ReadOnlyHighIdGenerator( highId );
        idGenerators.put( idType, idGenerator );
        return idGenerator;
    }

    @Override
    public IdGenerator create( PageCache pageCache, Path filename, IdType idType, long highId, boolean throwIfFileExists, long maxId,
            DatabaseReadOnlyChecker readOnlyChecker, Config config, CursorContext cursorContext, ImmutableSet<OpenOption> openOptions,
            IdSlotDistribution slotDistribution )
    {
        return open( pageCache, filename, idType, () -> highId, maxId, readOnlyChecker, config, cursorContext, openOptions, slotDistribution );
    }

    @Override
    public IdGenerator get( IdType idType )
    {
        ReadOnlyHighIdGenerator idGenerator = idGenerators.get( idType );
        if ( idGenerator == null )
        {
            throw new IllegalStateException( "IdGenerator for " + idType + " not opened" );
        }
        return idGenerator;
    }

    @Override
    public void visit( Consumer<IdGenerator> visitor )
    {
        idGenerators.values().forEach( visitor );
    }

    @Override
    public void clearCache( CursorContext cursorContext )
    {
        idGenerators.values().forEach( idGenerator -> idGenerator.clearCache( cursorContext ) );
    }

    @Override
    public Collection<Path> listIdFiles()
    {
        return Collections.emptyList();
    }
}
