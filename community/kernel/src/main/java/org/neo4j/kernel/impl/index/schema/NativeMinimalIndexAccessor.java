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
package org.neo4j.kernel.impl.index.schema;

import java.util.Map;

import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.api.index.MinimalIndexAccessor;
import org.neo4j.values.storable.Value;

public class NativeMinimalIndexAccessor implements MinimalIndexAccessor
{
    private final IndexDescriptor descriptor;
    private final IndexFiles indexFiles;
    private final DatabaseReadOnlyChecker readOnlyChecker;

    public NativeMinimalIndexAccessor( IndexDescriptor descriptor, IndexFiles indexFiles, DatabaseReadOnlyChecker readOnlyChecker )
    {
        this.descriptor = descriptor;
        this.indexFiles = indexFiles;
        this.readOnlyChecker = readOnlyChecker;
    }

    @Override
    public void drop()
    {
        if ( readOnlyChecker.isReadOnly() )
        {
            throw new IllegalStateException( "Cannot drop read-only index." );
        }
        indexFiles.clear();
    }

    @Override
    public Map<String,Value> indexConfig()
    {
        return descriptor.getIndexConfig().asMap();
    }
}
