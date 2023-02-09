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
package org.neo4j.kernel.api.index;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Set;

import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.TokenWrite;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.internal.schema.SchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.kernel.impl.coreapi.TransactionImpl;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.test.extension.ImpermanentDbmsExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.values.storable.ValueCategory;

import static java.util.Arrays.stream;
import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.stream.Collectors.toSet;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.graphdb.Label.label;
import static org.neo4j.internal.schema.IndexOrderCapability.NONE;
import static org.neo4j.internal.schema.IndexValueCapability.NO;

@ImpermanentDbmsExtension
public class TextIndexCreationTest
{
    @Inject
    private GraphDatabaseAPI db;
    private int labelId;
    private int relTypeId;
    private int[] propertyIds;
    private int[] compositeKey;

    @BeforeEach
    void setup() throws Exception
    {
        try ( Transaction tx = db.beginTx() )
        {
            KernelTransaction ktx = ((InternalTransaction) tx).kernelTransaction();
            TokenWrite tokenWrite = ktx.tokenWrite();
            labelId = tokenWrite.labelGetOrCreateForName( label( "PERSON" ).name() );
            relTypeId = tokenWrite.relationshipTypeGetOrCreateForName( RelationshipType.withName( "FRIEND" ).name() );
            propertyIds = new int[]{tokenWrite.propertyKeyGetOrCreateForName( "name" )};
            compositeKey = new int[]{
                    tokenWrite.propertyKeyGetOrCreateForName( "address" ), tokenWrite.propertyKeyGetOrCreateForName( "age" )};
            tx.commit();
        }
    }

    @Test
    void shouldRejectCompositeKeys()
    {
        assertUnsupported( () -> createTextIndex( "nti", SchemaDescriptors.forLabel( labelId, compositeKey ) ) );
        assertUnsupported( () -> createTextIndex( "rti", SchemaDescriptors.forRelType( relTypeId, compositeKey ) ) );
    }

    private void assertUnsupported( Executable executable )
    {
        var message = assertThrows( UnsupportedOperationException.class, executable ).getMessage();
        assertThat( message ).isEqualTo( "Composite indexes are not supported for TEXT index type." );
    }

    @Test
    void shouldCreateIndexes() throws Exception
    {
        //When
        createTextIndex( "node_text_index", SchemaDescriptors.forLabel( labelId, propertyIds ) );
        createTextIndex( "rel_text_index", SchemaDescriptors.forRelType( relTypeId, propertyIds ) );

        //Then
        awaitIndexesOnline();
        try ( var transaction = db.beginTx() )
        {
            var ktx = ((TransactionImpl) transaction).kernelTransaction();
            assertValidTextIndex( ktx.schemaRead().indexGetForName( "node_text_index" ), propertyIds );
            assertValidTextIndex( ktx.schemaRead().indexGetForName( "rel_text_index" ), propertyIds );
        }
    }

    private void awaitIndexesOnline()
    {
        try ( var tx = db.beginTx() )
        {
            tx.schema().awaitIndexesOnline( 5, MINUTES );
        }
    }

    private void assertValidTextIndex( IndexDescriptor index, int[] propertyIds )
    {
        assertThat( index.getIndexType() ).isEqualTo( IndexType.TEXT );
        assertThat( index.getCapability().behaviours() ).isEmpty();
        assertThat( index.schema().getPropertyIds() ).isEqualTo( propertyIds );
        assertThat( stream( ValueCategory.values() ).map(
                value -> index.getCapability().orderCapability( value ) ).collect( toSet() ) ).isEqualTo( Set.of( NONE ) );
        assertThat( stream( ValueCategory.values() ).map(
                value -> index.getCapability().valueCapability( value ) ).collect( toSet() ) ).isEqualTo( Set.of( NO ) );
    }

    private void createTextIndex( String name, SchemaDescriptor schema ) throws Exception
    {
        try ( Transaction tx = db.beginTx() )
        {
            var prototype = IndexPrototype.forSchema( schema ).withIndexType( IndexType.TEXT ).withName( name );
            var kernelTransaction = ((InternalTransaction) tx).kernelTransaction();
            kernelTransaction.schemaWrite().indexCreate( prototype );
            tx.commit();
        }
    }
}
