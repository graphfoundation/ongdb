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
package org.neo4j.kernel.impl.newapi;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.neo4j.internal.kernel.api.exceptions.schema.IndexNotFoundKernelException;
import org.neo4j.internal.kernel.api.helpers.StubPropertyCursor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.PropertySchemaType;
import org.neo4j.internal.schema.SchemaDescriptor;
import org.neo4j.kernel.api.txstate.TransactionState;
import org.neo4j.kernel.impl.api.index.IndexProxy;
import org.neo4j.kernel.impl.api.index.IndexingService;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.storageengine.api.StorageReader;
import org.neo4j.values.storable.ValueTuple;

import static org.apache.commons.lang3.ArrayUtils.contains;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class IndexTxStateUpdaterTestBase
{
    static final int PROP_ID_1 = 20;
    static final int PROP_ID_2 = 21;
    static final int PROP_ID_3 = 22;
    static final int NEW_PROP_ID = 23;
    static final int UN_INDEXED_PROP_ID = 24;
    static final int[] PROPS = {PROP_ID_1, PROP_ID_2, PROP_ID_3};

    TransactionState txState;
    IndexTxStateUpdater indexTxUpdater;

    StubPropertyCursor propertyCursor = new StubPropertyCursor();
    StorageReader storageReader = mock( StorageReader.class );

    void setUp( List<IndexDescriptor> indexes ) throws IndexNotFoundKernelException
    {
        txState = mock( TransactionState.class );
        when( txState.memoryTracker() ).thenReturn( EmptyMemoryTracker.INSTANCE );

        when( storageReader.valueIndexesGetRelated( any(), anyInt(), any() ) ).thenAnswer( invocationOnMock ->
        {
            long[] tokens = invocationOnMock.getArgument( 0 );
            int propertyKeyId = invocationOnMock.getArgument( 1 );
            Set<IndexDescriptor> descriptors = new HashSet<>();
            for ( IndexDescriptor index : indexes )
            {
                SchemaDescriptor schema = index.schema();
                if ( schema.isAffected( tokens ) && contains( schema.getPropertyIds(), propertyKeyId ) )
                {
                    if ( schema.propertySchemaType() == PropertySchemaType.COMPLETE_ALL_TOKENS )
                    {
                        descriptors.add( index );
                    }
                }
            }
            return descriptors;
        } );
        when( storageReader.valueIndexesGetRelated( any(), any( int[].class ), any() ) ).thenAnswer( invocationOnMock ->
        {
            long[] tokens = invocationOnMock.getArgument( 0 );
            int[] propertyKeyIds = invocationOnMock.getArgument( 1 );
            Set<IndexDescriptor> descriptors = new HashSet<>();
            for ( IndexDescriptor index : indexes )
            {
                if ( index.schema().isAffected( tokens ) )
                {
                    boolean containsAll = true;
                    for ( int propertyId : index.schema().getPropertyIds() )
                    {
                        containsAll &= contains( propertyKeyIds, propertyId );
                    }
                    if ( containsAll )
                    {
                        descriptors.add( index );
                    }
                }
            }
            return descriptors;
        } );

        Read readOps = mock( Read.class );
        when( readOps.txState() ).thenReturn( txState );

        IndexingService indexingService = mock( IndexingService.class );
        IndexProxy indexProxy = mock( IndexProxy.class );
        when( indexingService.getIndexProxy( any( IndexDescriptor.class ) ) ).thenReturn( indexProxy );

        indexTxUpdater = new IndexTxStateUpdater( storageReader, readOps, indexingService );
    }

    static ValueTuple values( Object... values )
    {
        return ValueTuple.of( values );
    }

    void verifyIndexUpdate( SchemaDescriptor schema, long entityId, ValueTuple before, ValueTuple after )
    {
        verify( txState ).indexDoUpdateEntry( eq( schema ), eq( entityId ), eq( before ), eq( after ) );
    }
}
