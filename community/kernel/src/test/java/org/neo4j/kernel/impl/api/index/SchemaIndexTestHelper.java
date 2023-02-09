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
package org.neo4j.kernel.impl.api.index;

import java.util.concurrent.CountDownLatch;

import org.neo4j.configuration.Config;
import org.neo4j.internal.kernel.api.InternalIndexState;
import org.neo4j.internal.kernel.api.SchemaRead;
import org.neo4j.internal.kernel.api.exceptions.schema.IndexNotFoundKernelException;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.api.index.IndexProvider;
import org.neo4j.kernel.extension.ExtensionFactory;
import org.neo4j.kernel.extension.ExtensionType;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.recovery.RecoveryExtension;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.mockito.Mockito.mock;

public class SchemaIndexTestHelper
{
    private SchemaIndexTestHelper()
    {
    }

    public static ExtensionFactory<SingleInstanceIndexProviderFactoryDependencies> singleInstanceIndexProviderFactory(
            String key, final IndexProvider provider )
    {
        return new SingleInstanceIndexProviderFactory( key, provider );
    }

    public interface SingleInstanceIndexProviderFactoryDependencies
    {
        Config config();
    }

    @RecoveryExtension
    private static class SingleInstanceIndexProviderFactory
        extends ExtensionFactory<SingleInstanceIndexProviderFactoryDependencies>
    {
        private final IndexProvider provider;

        private SingleInstanceIndexProviderFactory( String key, IndexProvider provider )
        {
            super( ExtensionType.DATABASE, key );
            this.provider = provider;
        }

        @Override
        public Lifecycle newInstance( ExtensionContext context,
                SingleInstanceIndexProviderFactoryDependencies dependencies )
        {
            return provider;
        }
    }

    public static IndexProxy mockIndexProxy()
    {
        return mock( IndexProxy.class );
    }

    public static boolean awaitLatch( CountDownLatch latch )
    {
        try
        {
            return latch.await( 10, SECONDS );
        }
        catch ( InterruptedException e )
        {
            Thread.interrupted();
            throw new RuntimeException( e );
        }
    }

    public static void awaitIndexOnline( SchemaRead schemaRead, IndexDescriptor index )
            throws IndexNotFoundKernelException
    {
        long start = System.currentTimeMillis();
        while ( schemaRead.indexGetState( index ) != InternalIndexState.ONLINE )
        {

            if ( start + 1000 * 10 < System.currentTimeMillis() )
            {
                throw new RuntimeException( "Index didn't come online within a reasonable time." );
            }
        }
    }
}
