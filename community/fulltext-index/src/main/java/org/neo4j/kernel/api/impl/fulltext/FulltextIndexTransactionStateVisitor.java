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
package org.neo4j.kernel.api.impl.fulltext;

import org.eclipse.collections.api.IntIterable;
import org.eclipse.collections.api.set.primitive.LongSet;
import org.eclipse.collections.api.set.primitive.MutableLongSet;
import org.eclipse.collections.impl.map.mutable.primitive.IntIntHashMap;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Arrays;

import org.neo4j.common.EntityType;
import org.neo4j.internal.kernel.api.NodeCursor;
import org.neo4j.internal.kernel.api.PropertyCursor;
import org.neo4j.internal.kernel.api.Read;
import org.neo4j.internal.kernel.api.RelationshipScanCursor;
import org.neo4j.internal.kernel.api.TokenSet;
import org.neo4j.internal.schema.FulltextSchemaDescriptor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.SchemaDescriptor;
import org.neo4j.storageengine.api.PropertySelection;
import org.neo4j.storageengine.api.StorageProperty;
import org.neo4j.storageengine.api.txstate.RelationshipModifications;
import org.neo4j.storageengine.api.txstate.TxStateVisitor;
import org.neo4j.values.storable.Value;

import static org.neo4j.kernel.api.impl.fulltext.LuceneFulltextDocumentStructure.documentRepresentingProperties;

/**
 * A {@link TxStateVisitor} that adds all entities to a {@link TransactionStateLuceneIndexWriter}, that matches the index according to the
 * {@link FulltextSchemaDescriptor}.
 */
class FulltextIndexTransactionStateVisitor extends TxStateVisitor.Adapter
{
    private final String[] propertyNames;
    private final SchemaDescriptor schema;
    private final boolean visitingNodes;
    private final int[] entityTokenIds;
    private final Value[] propertyValues;
    private final IntIntHashMap propKeyToIndex;
    private final MutableLongSet modifiedEntityIdsInThisTransaction;
    private final TransactionStateLuceneIndexWriter writer;
    private final PropertySelection indexedPropertySelection;
    private Read read;
    private NodeCursor nodeCursor;
    private PropertyCursor propertyCursor;
    private RelationshipScanCursor relationshipCursor;

    FulltextIndexTransactionStateVisitor( IndexDescriptor descriptor, String[] propertyNames, MutableLongSet modifiedEntityIdsInThisTransaction,
            TransactionStateLuceneIndexWriter writer )
    {
        this.propertyNames = propertyNames;
        this.schema = descriptor.schema();
        this.modifiedEntityIdsInThisTransaction = modifiedEntityIdsInThisTransaction;
        this.writer = writer;
        this.visitingNodes = schema.entityType() == EntityType.NODE;
        entityTokenIds = schema.getEntityTokenIds();
        int[] propertyIds = schema.getPropertyIds();
        propertyValues = new Value[propertyIds.length];
        propKeyToIndex = new IntIntHashMap();
        for ( int i = 0; i < propertyIds.length; i++ )
        {
            propKeyToIndex.put( propertyIds[i], i );
        }
        this.indexedPropertySelection = PropertySelection.selection( propertyIds );
    }

    FulltextIndexTransactionStateVisitor init( Read read, NodeCursor nodeCursor, RelationshipScanCursor relationshipCursor,
            PropertyCursor propertyCursor )
    {
        this.read = read;
        this.nodeCursor = nodeCursor;
        this.relationshipCursor = relationshipCursor;
        this.propertyCursor = propertyCursor;
        return this;
    }

    @Override
    public void visitCreatedNode( long id )
    {
        indexNode( id );
    }

    @Override
    public void visitNodePropertyChanges( long id, Iterable<StorageProperty> added, Iterable<StorageProperty> changed, IntIterable removed )
    {
        indexNode( id );
    }

    @Override
    public void visitRelPropertyChanges( long id, int type, long startNode, long endNode, Iterable<StorageProperty> added, Iterable<StorageProperty> changed,
            IntIterable removed )
    {
        indexRelationship( id );
    }

    @Override
    public void visitDeletedNode( long id )
    {
        modifiedEntityIdsInThisTransaction.add( id );
    }

    @Override
    public void visitRelationshipModifications( RelationshipModifications modifications )
    {
        modifications.creations().forEach( ( id, type, startNode, endNode, addedProperties ) -> indexRelationship( id ) );
        modifications.deletions().forEach( ( id, type, startNode, endNode, noProperties ) -> modifiedEntityIdsInThisTransaction.add( id ) );
    }

    @Override
    public void visitNodeLabelChanges( long id, LongSet added, LongSet removed )
    {
        indexNode( id );
        if ( visitingNodes )
        {
            // Nodes that have had their indexed labels removed will not have their properties indexed, so 'indexNode' would skip them.
            // However, we still need to make sure that they are not included in the result from the base index reader.
            for ( int entityTokenId : entityTokenIds )
            {
                if ( removed.contains( entityTokenId ) )
                {
                    modifiedEntityIdsInThisTransaction.add( id );
                    break;
                }
            }
        }
    }

    private void indexNode( long id )
    {
        if ( visitingNodes )
        {
            read.singleNode( id, nodeCursor );
            if ( nodeCursor.next() )
            {
                TokenSet labels = nodeCursor.labels();
                if ( schema.isAffected( labels.all() ) )
                {
                    nodeCursor.properties( propertyCursor, indexedPropertySelection );
                    indexProperties( id );
                }
            }
        }
    }

    private void indexRelationship( long id )
    {
        if ( !visitingNodes )
        {
            read.singleRelationship( id, relationshipCursor );
            if ( relationshipCursor.next() && schema.isAffected( new long[]{relationshipCursor.type()} ) )
            {
                relationshipCursor.properties( propertyCursor, indexedPropertySelection );
                indexProperties( id );
            }
        }
    }

    private void indexProperties( long id )
    {
        while ( propertyCursor.next() )
        {
            int propertyKey = propertyCursor.propertyKey();
            int index = propKeyToIndex.get( propertyKey );
            propertyValues[index] = propertyCursor.propertyValue();
        }
        if ( modifiedEntityIdsInThisTransaction.add( id ) )
        {
            try
            {
                writer.nullableAddDocument( documentRepresentingProperties( id, propertyNames, propertyValues ) );
            }
            catch ( IOException e )
            {
                throw new UncheckedIOException( e );
            }
        }
        Arrays.fill( propertyValues, null );
    }
}
