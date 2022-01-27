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
package org.neo4j.kernel.impl.newapi;

import java.util.Arrays;

import org.neo4j.common.EntityType;
import org.neo4j.exceptions.KernelException;
import org.neo4j.internal.kernel.api.Cursor;
import org.neo4j.internal.kernel.api.CursorFactory;
import org.neo4j.internal.kernel.api.IndexQueryConstraints;
import org.neo4j.internal.kernel.api.IndexReadSession;
import org.neo4j.internal.kernel.api.InternalIndexState;
import org.neo4j.internal.kernel.api.NodeCursor;
import org.neo4j.internal.kernel.api.NodeLabelIndexCursor;
import org.neo4j.internal.kernel.api.NodeValueIndexCursor;
import org.neo4j.internal.kernel.api.PartitionedScan;
import org.neo4j.internal.kernel.api.PropertyCursor;
import org.neo4j.internal.kernel.api.PropertyIndexQuery;
import org.neo4j.internal.kernel.api.QueryContext;
import org.neo4j.internal.kernel.api.RelationshipScanCursor;
import org.neo4j.internal.kernel.api.RelationshipTraversalCursor;
import org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor;
import org.neo4j.internal.kernel.api.RelationshipValueIndexCursor;
import org.neo4j.internal.kernel.api.Scan;
import org.neo4j.internal.kernel.api.TokenPredicate;
import org.neo4j.internal.kernel.api.TokenReadSession;
import org.neo4j.internal.kernel.api.exceptions.schema.IndexNotApplicableKernelException;
import org.neo4j.internal.kernel.api.exceptions.schema.IndexNotFoundKernelException;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.internal.schema.IndexValueCapability;
import org.neo4j.internal.schema.SchemaDescriptor;
import org.neo4j.internal.schema.SchemaDescriptorSupplier;
import org.neo4j.internal.schema.SchemaDescriptors;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.AssertOpen;
import org.neo4j.kernel.api.exceptions.schema.IndexBrokenKernelException;
import org.neo4j.kernel.api.index.ValueIndexReader;
import org.neo4j.kernel.api.txstate.TransactionState;
import org.neo4j.kernel.api.txstate.TxStateHolder;
import org.neo4j.kernel.impl.api.KernelTransactionImplementation;
import org.neo4j.kernel.impl.index.schema.TokenScan;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.lock.LockTracer;
import org.neo4j.lock.ResourceType;
import org.neo4j.lock.ResourceTypes;
import org.neo4j.storageengine.api.PropertySelection;
import org.neo4j.storageengine.api.Reference;
import org.neo4j.storageengine.api.RelationshipSelection;
import org.neo4j.storageengine.api.StorageLocks;
import org.neo4j.storageengine.api.StorageReader;
import org.neo4j.storageengine.api.txstate.ReadableTransactionState;

import static java.lang.String.format;
import static org.neo4j.internal.kernel.api.IndexQueryConstraints.unconstrained;

abstract class Read implements TxStateHolder,
        org.neo4j.internal.kernel.api.Read,
        org.neo4j.internal.kernel.api.SchemaRead,
        org.neo4j.internal.kernel.api.Procedures,
        org.neo4j.internal.kernel.api.Locks,
        AssertOpen,
        LockingNodeUniqueIndexSeek.UniqueNodeIndexSeeker<DefaultNodeValueIndexCursor>,
        QueryContext
{
    protected final StorageReader storageReader;
    protected final DefaultPooledCursors cursors;
    final KernelTransactionImplementation ktx;
    private final StorageLocks storageLocks;

    Read( StorageReader storageReader, DefaultPooledCursors cursors, KernelTransactionImplementation ktx, StorageLocks storageLocks )
    {
        this.storageReader = storageReader;
        this.cursors = cursors;
        this.ktx = ktx;
        this.storageLocks = storageLocks;
    }

    @Override
    public final void nodeIndexSeek( QueryContext queryContext, IndexReadSession index, NodeValueIndexCursor cursor, IndexQueryConstraints constraints,
            PropertyIndexQuery... query ) throws IndexNotApplicableKernelException
    {
        ktx.assertOpen();
        DefaultIndexReadSession indexSession = (DefaultIndexReadSession) index;
        validateConstraints( constraints, indexSession, query );

        if ( indexSession.reference.schema().entityType() != EntityType.NODE )
        {
            throw new IndexNotApplicableKernelException( "Node index seek can not be performed on index: "
                                                         + index.reference().userDescription( ktx.tokenRead() ) );
        }

        EntityIndexSeekClient client = (EntityIndexSeekClient) cursor;
        client.setRead( this );
        indexSession.reader.query( client, queryContext, ktx.securityContext().mode(), constraints, query );
    }

    @Override
    public PartitionedScan<NodeValueIndexCursor> nodeIndexSeek( IndexReadSession index, int desiredNumberOfPartitions,
                                                                QueryContext queryContext, PropertyIndexQuery... query )
            throws IndexNotApplicableKernelException
    {
        ktx.assertOpen();
        final var descriptor = index.reference();
        if ( descriptor.schema().entityType() != EntityType.NODE )
        {
            throw new IndexNotApplicableKernelException( "Node index seek can not be performed on index: "
                                                         + descriptor.userDescription( ktx.tokenRead() ) );
        }
        return propertyIndexSeek( index, desiredNumberOfPartitions, queryContext, query );
    }

    @Override
    public final void relationshipIndexSeek( QueryContext queryContext, IndexReadSession index, RelationshipValueIndexCursor cursor,
            IndexQueryConstraints constraints, PropertyIndexQuery... query ) throws IndexNotApplicableKernelException
    {
        ktx.assertOpen();
        DefaultIndexReadSession indexSession = (DefaultIndexReadSession) index;
        validateConstraints( constraints, indexSession, query );
        if ( indexSession.reference.schema().entityType() != EntityType.RELATIONSHIP )
        {
            throw new IndexNotApplicableKernelException( "Relationship index seek can not be performed on index: "
                                                         + index.reference().userDescription( ktx.tokenRead() ) );
        }

        EntityIndexSeekClient client = (EntityIndexSeekClient) cursor;
        client.setRead( this );
        indexSession.reader.query( client, queryContext, ktx.securityContext().mode(), constraints, query );
    }

    @Override
    public PartitionedScan<RelationshipValueIndexCursor> relationshipIndexSeek( IndexReadSession index, int desiredNumberOfPartitions,
                                                                                QueryContext queryContext, PropertyIndexQuery... query )
            throws IndexNotApplicableKernelException
    {
        ktx.assertOpen();
        final var descriptor = index.reference();
        if ( descriptor.schema().entityType() != EntityType.RELATIONSHIP )
        {
            throw new IndexNotApplicableKernelException( "Relationship index seek can not be performed on index: "
                                                         + descriptor.userDescription( ktx.tokenRead() ) );
        }
        return propertyIndexSeek( index, desiredNumberOfPartitions, queryContext, query );
    }

    @Override
    public org.neo4j.internal.kernel.api.Read getRead()
    {
        return this;
    }

    @Override
    public CursorFactory cursors()
    {
        return cursors;
    }

    @Override
    public ReadableTransactionState getTransactionStateOrNull()
    {
        return hasTxStateWithChanges() ? txState() : null;
    }

    @Override
    public long lockingNodeUniqueIndexSeek( IndexDescriptor index,
                                            NodeValueIndexCursor cursor,
                                            PropertyIndexQuery.ExactPredicate... predicates )
            throws IndexNotApplicableKernelException, IndexNotFoundKernelException, IndexBrokenKernelException
    {
        assertIndexOnline( index );
        assertPredicatesMatchSchema( index, predicates );

        Locks.Client locks = ktx.lockClient();
        LockTracer lockTracer = ktx.lockTracer();

        return LockingNodeUniqueIndexSeek.apply( locks, lockTracer, (DefaultNodeValueIndexCursor)cursor, this, this, index, predicates );
    }

    @Override // UniqueNodeIndexSeeker
    public void nodeIndexSeekWithFreshIndexReader(
            DefaultNodeValueIndexCursor cursor,
            ValueIndexReader indexReader,
            PropertyIndexQuery.ExactPredicate... query ) throws IndexNotApplicableKernelException
    {
        cursor.setRead( this );
        indexReader.query( cursor, this, ktx.securityContext().mode(), unconstrained(), query );
    }

    @Override
    public final void nodeIndexScan( IndexReadSession index,
                                     NodeValueIndexCursor cursor,
                                     IndexQueryConstraints constraints ) throws KernelException
    {
        ktx.assertOpen();
        DefaultIndexReadSession indexSession = (DefaultIndexReadSession) index;

        if ( indexSession.reference.schema().entityType() != EntityType.NODE )
        {
            throw new IndexNotApplicableKernelException( "Node index scan can not be performed on index: "
                                                         + index.reference().userDescription( ktx.tokenRead() ) );
        }

        scanIndex( indexSession, (EntityIndexSeekClient) cursor, constraints );
    }

    @Override
    public PartitionedScan<NodeValueIndexCursor> nodeIndexScan( IndexReadSession index, int desiredNumberOfPartitions, QueryContext queryContext )
            throws IndexNotApplicableKernelException
    {
        ktx.assertOpen();
        final var descriptor = index.reference();
        if ( descriptor.schema().entityType() != EntityType.NODE )
        {
            throw new IndexNotApplicableKernelException( "Node index scan can not be performed on index: "
                                                         + descriptor.userDescription( ktx.tokenRead() ) );
        }

        return propertyIndexScan( index, desiredNumberOfPartitions, queryContext );
    }

    @Override
    public final void relationshipIndexScan( IndexReadSession index,
            RelationshipValueIndexCursor cursor,
            IndexQueryConstraints constraints ) throws KernelException
    {
        ktx.assertOpen();
        DefaultIndexReadSession indexSession = (DefaultIndexReadSession) index;

        if ( indexSession.reference.schema().entityType() != EntityType.RELATIONSHIP )
        {
            throw new IndexNotApplicableKernelException( "Relationship index scan can not be performed on index: "
                                                         + index.reference().userDescription( ktx.tokenRead() ) );
        }

        scanIndex( indexSession, (EntityIndexSeekClient) cursor, constraints );
    }

    @Override
    public PartitionedScan<RelationshipValueIndexCursor> relationshipIndexScan( IndexReadSession index, int desiredNumberOfPartitions,
                                                                                QueryContext queryContext )
            throws IndexNotApplicableKernelException
    {
        ktx.assertOpen();
        final var descriptor = index.reference();
        if ( descriptor.schema().entityType() != EntityType.RELATIONSHIP )
        {
            throw new IndexNotApplicableKernelException( "Relationship index scan can not be performed on index: "
                                                         + descriptor.userDescription( ktx.tokenRead() ) );
        }

        return propertyIndexScan( index, desiredNumberOfPartitions, queryContext );
    }

    private void scanIndex( DefaultIndexReadSession indexSession, EntityIndexSeekClient indexSeekClient, IndexQueryConstraints constraints )
            throws KernelException
    {
        indexSeekClient.setRead( this );
        indexSession.reader.query( indexSeekClient, this, ktx.securityContext().mode(), constraints, PropertyIndexQuery.allEntries() );
    }

    @Override
    public final Scan<NodeLabelIndexCursor> nodeLabelScan( int label )
    {
        ktx.assertOpen();
        CursorContext cursorContext = ktx.cursorContext();

        TokenScan tokenScan;
        try
        {
            var index = index( SchemaDescriptors.forAnyEntityTokens( EntityType.NODE ), IndexType.LOOKUP );
            if ( index == IndexDescriptor.NO_INDEX )
            {
                throw new IndexNotFoundKernelException( "There is no index that can back a node label scan." );
            }
            DefaultTokenReadSession session = (DefaultTokenReadSession) tokenReadSession( index );
            tokenScan = session.reader.entityTokenScan( label, cursorContext );
        }
        catch ( IndexNotFoundKernelException e )
        {
            throw new RuntimeException( e );
        }
        return new NodeLabelIndexCursorScan( this, label, tokenScan );
    }

    @Override
    public final PartitionedScan<NodeLabelIndexCursor> nodeLabelScan( TokenReadSession session, int desiredNumberOfPartitions,
                                                                      CursorContext cursorContext, TokenPredicate query )
            throws IndexNotApplicableKernelException
    {
        ktx.assertOpen();
        if ( session.reference().schema().entityType() != EntityType.NODE )
        {
            throw new IndexNotApplicableKernelException( "Node label index scan can not be performed on index: "
                                                         + session.reference().userDescription( ktx.tokenRead() ) );
        }
        return tokenIndexScan( session, desiredNumberOfPartitions, cursorContext, query );
    }

    @Override
    public final void nodeLabelScan( TokenReadSession session, NodeLabelIndexCursor cursor, IndexQueryConstraints constraints, TokenPredicate query,
            CursorContext cursorContext ) throws KernelException
    {
        ktx.assertOpen();

        if ( session.reference().schema().entityType() != EntityType.NODE )
        {
            throw new IndexNotApplicableKernelException( "Node label index scan can not be performed on index: "
                                                         + session.reference().userDescription( ktx.tokenRead() ) );
        }

        var tokenSession = (DefaultTokenReadSession) session;

        DefaultNodeLabelIndexCursor indexCursor = (DefaultNodeLabelIndexCursor) cursor;
        indexCursor.setRead( this );
        tokenSession.reader.query( indexCursor, constraints, query, cursorContext );
    }

    @Override
    public final void allNodesScan( NodeCursor cursor )
    {
        ktx.assertOpen();
        ((DefaultNodeCursor) cursor).scan( this );
    }

    @Override
    public final Scan<NodeCursor> allNodesScan()
    {
        ktx.assertOpen();
        return new NodeCursorScan( storageReader.allNodeScan(), this );
    }

    @Override
    public final void singleNode( long reference, NodeCursor cursor )
    {
        ktx.assertOpen();
        ((DefaultNodeCursor) cursor).single( reference, this );
    }

    @Override
    public final void singleRelationship( long reference, RelationshipScanCursor cursor )
    {
        ktx.assertOpen();
        ((DefaultRelationshipScanCursor) cursor).single( reference, this );
    }

    @Override
    public void singleRelationship( long reference, long sourceNodeReference, int type, long targetNodeReference, RelationshipScanCursor cursor )
    {
        ktx.assertOpen();
        ((DefaultRelationshipScanCursor) cursor).single( reference, sourceNodeReference, type, targetNodeReference, this );
    }

    @Override
    public final void allRelationshipsScan( RelationshipScanCursor cursor )
    {
        ktx.assertOpen();
        ((DefaultRelationshipScanCursor) cursor).scan( this );
    }

    @Override
    public final Scan<RelationshipScanCursor> allRelationshipsScan()
    {
        ktx.assertOpen();
        return new RelationshipCursorScan( storageReader.allRelationshipScan(), this );
    }

    @Override
    public final PartitionedScan<RelationshipTypeIndexCursor> relationshipTypeScan( TokenReadSession session, int desiredNumberOfPartitions,
                                                                                    CursorContext cursorContext, TokenPredicate query )
            throws IndexNotApplicableKernelException
    {
        ktx.assertOpen();
        if ( session.reference().schema().entityType() != EntityType.RELATIONSHIP )
        {
            throw new IndexNotApplicableKernelException( "Relationship type index scan can not be performed on index: "
                                                         + session.reference().userDescription( ktx.tokenRead() ) );
        }
        return tokenIndexScan( session, desiredNumberOfPartitions, cursorContext, query );
    }

    @Override
    public final void relationshipTypeScan( TokenReadSession session, RelationshipTypeIndexCursor cursor, IndexQueryConstraints constraints,
                                            TokenPredicate query, CursorContext cursorContext )
            throws KernelException
    {
        ktx.assertOpen();

        if ( session.reference().schema().entityType() != EntityType.RELATIONSHIP )
        {
            throw new IndexNotApplicableKernelException( "Relationship type index scan can not be performed on index: "
                                                         + session.reference().userDescription( ktx.tokenRead() ) );
        }

        var tokenSession = (DefaultTokenReadSession) session;

        var indexCursor = (DefaultRelationshipTypeIndexCursor) cursor;
        indexCursor.setRead( this );
        tokenSession.reader.query( indexCursor, constraints, query, cursorContext );
    }

    @Override
    public void relationships( long nodeReference, long reference, RelationshipSelection selection, RelationshipTraversalCursor cursor )
    {
        ((DefaultRelationshipTraversalCursor) cursor).init( nodeReference, reference, selection, this );
    }

    @Override
    public void nodeProperties( long nodeReference, Reference reference, PropertySelection selection, PropertyCursor cursor )
    {
        ((DefaultPropertyCursor) cursor).initNode( nodeReference, reference, selection, this, ktx );
    }

    @Override
    public void relationshipProperties( long relationshipReference, Reference reference, PropertySelection selection, PropertyCursor cursor )
    {
        ((DefaultPropertyCursor) cursor).initRelationship( relationshipReference, reference, selection, this, ktx );
    }

    private void validateConstraints( IndexQueryConstraints constraints, DefaultIndexReadSession indexSession, PropertyIndexQuery[] query )
    {
        if ( constraints.needsValues() && !supportsValueCapability( indexSession.reference(), query ) )
        {
            throw new UnsupportedOperationException( format( "%s index has no value capability", indexSession.reference().getIndexType() ) );
        }
    }

    private boolean supportsValueCapability( IndexDescriptor index, PropertyIndexQuery[] query )
    {
        final var capability = index.getCapability();
        return Arrays.stream( query )
                     .map( PropertyIndexQuery::valueCategory )
                     .map( capability::valueCapability )
                     .noneMatch( IndexValueCapability.NO::equals );
    }

    private <C extends Cursor> PartitionedScan<C> propertyIndexScan( IndexReadSession index, int desiredNumberOfPartitions, QueryContext queryContext )
            throws IndexNotApplicableKernelException
    {
        ktx.assertOpen();
        return propertyIndexSeek( index, desiredNumberOfPartitions, queryContext, PropertyIndexQuery.allEntries() );
    }

    private <C extends Cursor> PartitionedScan<C> propertyIndexSeek( IndexReadSession index, int desiredNumberOfPartitions,
                                                                     QueryContext queryContext, PropertyIndexQuery... query )
            throws IndexNotApplicableKernelException
    {
        ktx.assertOpen();
        final var descriptor = index.reference();
        if ( !descriptor.getCapability().supportPartitionedScan( query ) )
        {
            throw new IndexNotApplicableKernelException( "This index does not support partitioned scan for this query: "
                                                         + descriptor.userDescription( ktx.tokenRead() ) );
        }

        final var session = (DefaultIndexReadSession) index;
        final var valueSeek = session.reader.valueSeek( desiredNumberOfPartitions, queryContext, query );
        return new PartitionedValueIndexCursorSeek<>( this, descriptor, valueSeek, query );
    }

    private <C extends Cursor> PartitionedScan<C> tokenIndexScan( TokenReadSession session, int desiredNumberOfPartitions,
                                                                  CursorContext cursorContext, TokenPredicate query )
            throws IndexNotApplicableKernelException
    {
        ktx.assertOpen();
        final var descriptor = session.reference();
        if ( !descriptor.getCapability().supportPartitionedScan( query ) )
        {
            throw new IndexNotApplicableKernelException( "This index does not support partitioned scan for this query: "
                                                         + descriptor.userDescription( ktx.tokenRead() ) );
        }

        final var defaultSession = (DefaultTokenReadSession) session;
        final var tokenScan = defaultSession.reader.entityTokenScan( desiredNumberOfPartitions, cursorContext, query );
        return new PartitionedTokenIndexCursorScan<>( this, query, tokenScan );
    }

    public abstract ValueIndexReader newValueIndexReader( IndexDescriptor index ) throws IndexNotFoundKernelException;

    @Override
    public TransactionState txState()
    {
        return ktx.txState();
    }

    @Override
    public boolean hasTxStateWithChanges()
    {
        return ktx.hasTxStateWithChanges();
    }

    @Override
    public void acquireExclusiveNodeLock( long... ids )
    {
        storageLocks.acquireExclusiveNodeLock( ktx.lockTracer(), ids );
        ktx.assertOpen();
    }

    @Override
    public void acquireExclusiveRelationshipLock( long... ids )
    {
        storageLocks.acquireExclusiveRelationshipLock( ktx.lockTracer(), ids );
        ktx.assertOpen();
    }

    @Override
    public void releaseExclusiveNodeLock( long... ids )
    {
        storageLocks.releaseExclusiveNodeLock( ids );
        ktx.assertOpen();
    }

    @Override
    public void releaseExclusiveRelationshipLock( long... ids )
    {
        storageLocks.releaseExclusiveRelationshipLock( ids );
        ktx.assertOpen();
    }

    @Override
    public void acquireSharedNodeLock( long... ids )
    {
        storageLocks.acquireSharedNodeLock( ktx.lockTracer(), ids );
        ktx.assertOpen();
    }

    @Override
    public void acquireSharedRelationshipLock( long... ids )
    {
        storageLocks.acquireSharedRelationshipLock( ktx.lockTracer(), ids );
        ktx.assertOpen();
    }

    @Override
    public void acquireSharedRelationshipTypeLock( long... ids )
    {
        acquireSharedLock( ResourceTypes.RELATIONSHIP_TYPE, ids );
        ktx.assertOpen();
    }

    @Override
    public void acquireSharedLabelLock( long... ids )
    {
        acquireSharedLock( ResourceTypes.LABEL, ids );
        ktx.assertOpen();
    }

    @Override
    public void releaseSharedNodeLock( long... ids )
    {
        storageLocks.releaseSharedNodeLock( ids );
        ktx.assertOpen();
    }

    @Override
    public void releaseSharedRelationshipLock( long... ids )
    {
        storageLocks.releaseSharedRelationshipLock( ids );
        ktx.assertOpen();
    }

    @Override
    public void releaseSharedLabelLock( long... ids )
    {
        releaseSharedLock( ResourceTypes.LABEL, ids );
        ktx.assertOpen();
    }

    @Override
    public void releaseSharedRelationshipTypeLock( long... ids )
    {
        releaseSharedLock( ResourceTypes.RELATIONSHIP_TYPE, ids );
        ktx.assertOpen();
    }

    <T extends SchemaDescriptorSupplier> T acquireSharedSchemaLock( T schemaLike )
    {
        SchemaDescriptor schema = schemaLike.schema();
        long[] lockingKeys = schema.lockingKeys();
        ktx.lockClient().acquireShared( ktx.lockTracer(), schema.keyType(), lockingKeys );
        return schemaLike;
    }

    <T extends SchemaDescriptorSupplier> void releaseSharedSchemaLock( T schemaLike )
    {
        SchemaDescriptor schema = schemaLike.schema();
        long[] lockingKeys = schema.lockingKeys();
        ktx.lockClient().releaseShared( schema.keyType(), lockingKeys );
    }

    void acquireSharedLock( ResourceType resource, long resourceId )
    {
        ktx.lockClient().acquireShared( ktx.lockTracer(), resource, resourceId );
    }

    private void acquireExclusiveLock( ResourceType type, long... ids )
    {
        ktx.lockClient().acquireExclusive( ktx.lockTracer(), type, ids );
    }

    private void releaseExclusiveLock( ResourceType type, long... ids )
    {
        ktx.lockClient().releaseExclusive( type, ids );
    }

    private void acquireSharedLock( ResourceType type, long... ids )
    {
        ktx.lockClient().acquireShared( ktx.lockTracer(), type, ids );
    }

    private void releaseSharedLock( ResourceType types, long... ids )
    {
        ktx.lockClient().releaseShared( types, ids );
    }

    private void assertIndexOnline( IndexDescriptor index )
            throws IndexNotFoundKernelException, IndexBrokenKernelException
    {
        if ( indexGetState( index ) == InternalIndexState.ONLINE )
        {
            return;
        }
        throw new IndexBrokenKernelException( indexGetFailure( index ) );
    }

    private static void assertPredicatesMatchSchema( IndexDescriptor index, PropertyIndexQuery.ExactPredicate[] predicates )
            throws IndexNotApplicableKernelException
    {
        int[] propertyIds = index.schema().getPropertyIds();
        if ( propertyIds.length != predicates.length )
        {
            throw new IndexNotApplicableKernelException(
                    format( "The index specifies %d properties, but only %d lookup predicates were given.",
                            propertyIds.length, predicates.length ) );
        }
        for ( int i = 0; i < predicates.length; i++ )
        {
            if ( predicates[i].propertyKeyId() != propertyIds[i] )
            {
                throw new IndexNotApplicableKernelException(
                        format( "The index has the property id %d in position %d, but the lookup property id was %d.",
                                propertyIds[i], i, predicates[i].propertyKeyId() ) );
            }
        }
    }

    @Override
    public void assertOpen()
    {
        ktx.assertOpen();
    }

    @Override
    public void acquireSharedLookupLock( EntityType entityType )
    {
        acquireSharedSchemaLock( () -> SchemaDescriptors.forAnyEntityTokens( entityType ) );
        ktx.assertOpen();
    }

    @Override
    public void releaseSharedLookupLock( EntityType entityType )
    {
        releaseSharedSchemaLock( () -> SchemaDescriptors.forAnyEntityTokens( entityType ) );
        ktx.assertOpen();
    }
}
