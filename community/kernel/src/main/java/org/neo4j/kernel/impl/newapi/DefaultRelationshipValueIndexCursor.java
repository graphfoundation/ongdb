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

import org.eclipse.collections.api.set.primitive.ImmutableLongSet;
import org.eclipse.collections.api.set.primitive.LongSet;

import org.neo4j.internal.kernel.api.KernelReadTracer;
import org.neo4j.internal.kernel.api.NodeCursor;
import org.neo4j.internal.kernel.api.RelationshipScanCursor;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.kernel.api.RelationshipValueIndexCursor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.api.txstate.TransactionState;
import org.neo4j.memory.MemoryTracker;

import static org.neo4j.collection.PrimitiveLongCollections.mergeToSet;

class DefaultRelationshipValueIndexCursor extends DefaultEntityValueIndexCursor<DefaultRelationshipValueIndexCursor> implements RelationshipValueIndexCursor
{
    private final DefaultRelationshipScanCursor securityRelationshipCursor;
    private int[] propertyIds;

    DefaultRelationshipValueIndexCursor( CursorPool<DefaultRelationshipValueIndexCursor> pool,
            DefaultRelationshipScanCursor securityRelationshipCursor,
            MemoryTracker memoryTracker )
    {
        super( pool, memoryTracker );
        this.securityRelationshipCursor = securityRelationshipCursor;
    }

    @Override
    public void relationship( RelationshipScanCursor cursor )
    {
        readEntity( read -> read.singleRelationship( entityReference(), cursor ) );
    }

    @Override
    public void sourceNode( NodeCursor cursor )
    {
        throw new UnsupportedOperationException( "We have not yet implemented tracking of the relationship end nodes in the relationship index cursor." );
    }

    @Override
    public void targetNode( NodeCursor cursor )
    {
        throw new UnsupportedOperationException( "We have not yet implemented tracking of the relationship end nodes in the relationship index cursor." );
    }

    @Override
    public int type()
    {
        throw new UnsupportedOperationException( "We have not yet implemented tracking of the relationship type in the relationship index cursor." );
    }

    @Override
    public long relationshipReference()
    {
        return entityReference();
    }

    @Override
    public long sourceNodeReference()
    {
        throw new UnsupportedOperationException( "We have not yet implemented tracking of the relationship end nodes in the relationship index cursor." );
    }

    @Override
    public long targetNodeReference()
    {
        throw new UnsupportedOperationException( "We have not yet implemented tracking of the relationship end nodes in the relationship index cursor." );
    }

    /**
     * Check that the user is allowed to access all relationships and properties given by the index descriptor.
     * <p>
     * We can skip checking permissions on every relationship we get back if the current user is allowed to:
     * <ul>
     *     <li>traverse all relationships of type the index is defined for</li>
     *     <li>traverse all nodes no matter what label the node has</li>
     *     <li>read all the indexed properties</li>
     * </ul>
     */
    @Override
    protected boolean canAccessAllDescribedEntities( IndexDescriptor descriptor, AccessMode accessMode )
    {
        propertyIds = descriptor.schema().getPropertyIds();

        for ( int relType : descriptor.schema().getEntityTokenIds() )
        {
            if ( !accessMode.allowsTraverseRelType( relType ) )
            {
                return false;
            }
        }
        if ( !accessMode.allowsTraverseAllLabels() )
        {
            return false;
        }
        for ( int propId : propertyIds )
        {
            for ( int relType : descriptor.schema().getEntityTokenIds() )
            {
                if ( !accessMode.allowsReadRelationshipProperty( () -> relType, propId ) )
                {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    protected ImmutableLongSet removed( TransactionState txState, LongSet removedFromIndex )
    {
        return mergeToSet( txState.addedAndRemovedRelationships().getRemoved(), removedFromIndex ).toImmutable();
    }

    @Override
    protected boolean allowed( long reference, AccessMode accessMode )
    {
        readEntity( read -> read.singleRelationship( reference, securityRelationshipCursor ) );
        if ( !securityRelationshipCursor.next() )
        {
            // This relationship is not visible to this security context
            return false;
        }

        int relType = securityRelationshipCursor.type();
        for ( int prop : propertyIds )
        {
            if ( !accessMode.allowsReadRelationshipProperty( () -> relType, prop ) )
            {
                return false;
            }
        }
        return true;
    }

    @Override
    void traceOnEntity( KernelReadTracer tracer, long entity )
    {
        tracer.onRelationship( entity );
    }

    @Override
    String implementationName()
    {
        return "RelationshipValueIndexCursor";
    }

    public void release()
    {
        if ( securityRelationshipCursor != null )
        {
            securityRelationshipCursor.close();
            securityRelationshipCursor.release();
        }
    }
}
