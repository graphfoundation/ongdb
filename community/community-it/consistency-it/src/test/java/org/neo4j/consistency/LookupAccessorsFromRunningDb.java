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
package org.neo4j.consistency;

import org.neo4j.consistency.checking.index.IndexAccessors;
import org.neo4j.internal.kernel.api.InternalIndexState;
import org.neo4j.internal.kernel.api.exceptions.schema.IndexNotFoundKernelException;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.api.index.IndexAccessor;
import org.neo4j.kernel.impl.api.index.AbstractDelegatingIndexProxy;
import org.neo4j.kernel.impl.api.index.IndexProxy;
import org.neo4j.kernel.impl.api.index.IndexingService;
import org.neo4j.kernel.impl.api.index.OnlineIndexProxy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LookupAccessorsFromRunningDb implements IndexAccessors.IndexAccessorLookup
{
    private final IndexingService indexingService;

    public LookupAccessorsFromRunningDb( IndexingService indexingService )
    {
        this.indexingService = indexingService;
    }

    @Override
    public IndexAccessor apply( IndexDescriptor indexDescriptor )
    {
        try
        {
            IndexProxy proxy = indexingService.getIndexProxy( indexDescriptor );
            while ( proxy instanceof AbstractDelegatingIndexProxy )
            {
                proxy = ((AbstractDelegatingIndexProxy) proxy).getDelegate();
            }
            assertEquals( InternalIndexState.ONLINE, proxy.getState() );
            return ((OnlineIndexProxy) proxy).accessor();
        }
        catch ( IndexNotFoundKernelException e )
        {
            throw new RuntimeException( e );
        }
    }
}
