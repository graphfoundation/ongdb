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
package org.neo4j.storageengine.api.txstate;

import org.eclipse.collections.api.set.primitive.LongSet;

import java.util.function.LongConsumer;

import org.neo4j.exceptions.KernelException;
import org.neo4j.internal.kernel.api.exceptions.schema.ConstraintValidationException;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.storageengine.api.CountsDelta;
import org.neo4j.storageengine.api.StorageNodeCursor;
import org.neo4j.storageengine.api.StorageReader;
import org.neo4j.storageengine.api.StorageRelationshipScanCursor;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.storageengine.util.EagerDegrees;

import static org.neo4j.io.IOUtils.closeAllUnchecked;
import static org.neo4j.storageengine.api.RelationshipSelection.ALL_RELATIONSHIPS;
import static org.neo4j.token.api.TokenConstants.ANY_LABEL;
import static org.neo4j.token.api.TokenConstants.ANY_RELATIONSHIP_TYPE;

public class TransactionCountingStateVisitor extends TxStateVisitor.Delegator
{
    private final CountsDelta counts;
    private final ReadableTransactionState txState;
    private final StorageNodeCursor nodeCursor;
    private final StorageRelationshipScanCursor relationshipCursor;

    public TransactionCountingStateVisitor( TxStateVisitor next, StorageReader storageReader,
            ReadableTransactionState txState, CountsDelta counts, CursorContext cursorContext, StoreCursors storeCursors )
    {
        super( next );
        this.txState = txState;
        this.counts = counts;
        this.nodeCursor = storageReader.allocateNodeCursor( cursorContext, storeCursors );
        this.relationshipCursor = storageReader.allocateRelationshipScanCursor( cursorContext, storeCursors );
    }

    @Override
    public void visitCreatedNode( long id )
    {
        counts.incrementNodeCount( ANY_LABEL, 1 );
        super.visitCreatedNode( id );
    }

    @Override
    public void visitDeletedNode( long id )
    {
        counts.incrementNodeCount( ANY_LABEL, -1 );
        nodeCursor.single( id );
        if ( nodeCursor.next() )
        {
            decrementCountForLabelsAndRelationships( nodeCursor );
        }
        super.visitDeletedNode( id );
    }

    private void decrementCountForLabelsAndRelationships( StorageNodeCursor node )
    {
        final long[] labelIds = node.labels();
        for ( long labelId : labelIds )
        {
            counts.incrementNodeCount( labelId, -1 );
        }

        visitDegrees( node, ( type, out, in ) -> updateRelationshipsCountsFromDegrees( labelIds, type, -out, -in ) );
    }

    private static void visitDegrees( StorageNodeCursor node, DegreeVisitor visitor )
    {
        EagerDegrees degrees = new EagerDegrees();
        node.degrees( ALL_RELATIONSHIPS, degrees );
        for ( int type : degrees.types() )
        {
            visitor.visitDegree( type, degrees.outgoingDegree( type ), degrees.incomingDegree( type ) );
        }
    }

    @Override
    public void visitRelationshipModifications( RelationshipModifications ids ) throws ConstraintValidationException
    {
        ids.creations().forEach( ( id, type, startNode, endNode, addedProperties ) -> updateRelationshipCount( startNode, type, endNode, 1 ) );
        ids.deletions().forEach( ( id, type, startNode, endNode, noProperties ) ->
        {
            if ( type == ANY_RELATIONSHIP_TYPE )
            {
                // Indication that no meta data for deleted relationships is kept, we have to look it up here instead
                relationshipCursor.single( id );
                if ( !relationshipCursor.next() )
                {
                    throw new IllegalStateException( "Relationship being deleted should exist along with its nodes. Relationship[" + id + "]" );
                }
                updateRelationshipCount( relationshipCursor.sourceNodeReference(), relationshipCursor.type(), relationshipCursor.targetNodeReference(), -1 );
            }
            else
            {
                // All meta data about this deleted relationship is available, just use it
                updateRelationshipCount( startNode, type, endNode, -1 );
            }
        } );
        super.visitRelationshipModifications( ids );
    }

    @Override
    public void visitNodeLabelChanges( long id, final LongSet added, final LongSet removed )
            throws ConstraintValidationException
    {
        // update counts
        if ( !(added.isEmpty() && removed.isEmpty()) )
        {
            added.each( label -> counts.incrementNodeCount( label, 1 ) );
            removed.each( label -> counts.incrementNodeCount( label, -1 ) );
            // get the relationship counts from *before* this transaction,
            // the relationship changes will compensate for what happens during the transaction

            nodeCursor.single( id );
            if ( nodeCursor.next() )
            {
                visitDegrees( nodeCursor, ( type, out, in ) ->
                {
                    added.forEach( label -> updateRelationshipsCountsFromDegrees( type, label, out, in ) );
                    removed.forEach( label -> updateRelationshipsCountsFromDegrees( type, label, -out, -in ) );
                } );
            }
        }
        super.visitNodeLabelChanges( id, added, removed );
    }

    private void updateRelationshipsCountsFromDegrees( long[] labels, int type, long outgoing, long incoming )
    {
        for ( long label : labels )
        {
            updateRelationshipsCountsFromDegrees( type, label, outgoing, incoming );
        }
    }

    private void updateRelationshipsCountsFromDegrees( int type, long label, long outgoing, long incoming )
    {
        // untyped
        counts.incrementRelationshipCount( label, ANY_RELATIONSHIP_TYPE, ANY_LABEL, outgoing );
        counts.incrementRelationshipCount( ANY_LABEL, ANY_RELATIONSHIP_TYPE, label, incoming );
        // typed
        counts.incrementRelationshipCount( label, type, ANY_LABEL, outgoing );
        counts.incrementRelationshipCount( ANY_LABEL, type, label, incoming );
    }

    private void updateRelationshipCount( long startNode, int type, long endNode, int delta )
    {
        updateRelationshipsCountsFromDegrees( type, ANY_LABEL, delta, 0 );
        visitLabels( startNode, labelId -> updateRelationshipsCountsFromDegrees( type, labelId, delta, 0 ) );
        visitLabels( endNode, labelId -> updateRelationshipsCountsFromDegrees( type, labelId, 0, delta ) );
    }

    private void visitLabels( long nodeId, LongConsumer visitor )
    {
        // This transaction state visitor doesn't have access to higher level cursors that combine store- and tx-state,
        // but however has access to the two individually, and so does this combining here directly.
        if ( txState.nodeIsDeletedInThisTx( nodeId ) )
        {
            return;
        }

        if ( txState.nodeIsAddedInThisTx( nodeId ) )
        {
            txState.getNodeState( nodeId ).labelDiffSets().getAdded().forEach( visitor::accept );
        }
        else
        {
            nodeCursor.single( nodeId );
            if ( nodeCursor.next() )
            {
                long[] labels = nodeCursor.labels();
                LongDiffSets labelDiff = txState.getNodeState( nodeId ).labelDiffSets();
                labelDiff.getAdded().forEach( visitor::accept );
                for ( long label : labels )
                {
                    if ( !labelDiff.isRemoved( label ) )
                    {
                        visitor.accept( label );
                    }
                }
            }
        }
    }

    @Override
    public void close() throws KernelException
    {
        super.close();
        closeAllUnchecked( nodeCursor, relationshipCursor );
    }
}
