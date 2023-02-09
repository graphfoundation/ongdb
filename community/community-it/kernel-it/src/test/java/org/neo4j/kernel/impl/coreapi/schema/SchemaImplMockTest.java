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
package org.neo4j.kernel.impl.coreapi.schema;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import org.neo4j.internal.helpers.Exceptions;
import org.neo4j.internal.kernel.api.InternalIndexState;
import org.neo4j.internal.kernel.api.SchemaRead;
import org.neo4j.internal.kernel.api.TokenRead;
import org.neo4j.internal.kernel.api.exceptions.schema.IndexNotFoundKernelException;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.api.KernelTransaction;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.neo4j.internal.schema.IndexPrototype.forSchema;
import static org.neo4j.internal.schema.SchemaDescriptors.forLabel;

class SchemaImplMockTest
{
    private static final Exception cause = new Exception( "Kilroy made it" );

    @Test
    void includeCauseOfFailure() throws IndexNotFoundKernelException
    {
        // given
        IndexDefinitionImpl indexDefinition = mockIndexDefinition();
        when( indexDefinition.toString() ).thenReturn( "IndexDefinition( of-some-sort )" );
        KernelTransaction kernelTransaction = mockKernelTransaction();
        SchemaImpl schema = new SchemaImpl( kernelTransaction );

        // when
        IllegalStateException e = assertThrows( IllegalStateException.class, () -> schema.awaitIndexOnline( indexDefinition, 1, TimeUnit.MINUTES ) );

        // then
        assertThat( e.getMessage() ).contains( Exceptions.stringify( cause ) );
    }

    private static IndexDefinitionImpl mockIndexDefinition()
    {
        IndexDefinitionImpl indexDefinition = mock( IndexDefinitionImpl.class );
        when( indexDefinition.getIndexReference() ).thenReturn( forSchema( forLabel( 1, 1 ) ).withName( "index" ).materialise( 13 ) );
        return indexDefinition;
    }

    private static KernelTransaction mockKernelTransaction() throws IndexNotFoundKernelException
    {
        SchemaRead schemaRead = mock( SchemaRead.class );
        when( schemaRead.indexGetState( any( IndexDescriptor.class ) ) ).thenReturn( InternalIndexState.FAILED );
        when( schemaRead.indexGetFailure( any( IndexDescriptor.class ) ) ).thenReturn( Exceptions.stringify( cause ) );

        KernelTransaction kt = mock( KernelTransaction.class );
        when( kt.tokenRead() ).thenReturn( mock( TokenRead.class ) );
        when( kt.schemaRead() ).thenReturn( schemaRead );
        when( kt.isTerminated() ).thenReturn( false );
        return kt;
    }
}
