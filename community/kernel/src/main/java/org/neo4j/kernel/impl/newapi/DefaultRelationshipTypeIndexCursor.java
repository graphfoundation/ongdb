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

import org.eclipse.collections.api.set.primitive.LongSet;

import org.neo4j.internal.kernel.api.KernelReadTracer;
import org.neo4j.internal.kernel.api.NodeCursor;
import org.neo4j.internal.kernel.api.RelationshipScanCursor;
import org.neo4j.internal.kernel.api.RelationshipTypeIndexCursor;
import org.neo4j.internal.kernel.api.TokenSet;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.kernel.api.txstate.TransactionState;

public class DefaultRelationshipTypeIndexCursor extends DefaultEntityTokenIndexCursor<DefaultRelationshipTypeIndexCursor> implements RelationshipTypeIndexCursor
{

    private final DefaultRelationshipScanCursor relationshipSecurityCursor;

    DefaultRelationshipTypeIndexCursor( CursorPool<DefaultRelationshipTypeIndexCursor> pool, DefaultRelationshipScanCursor relationshipSecurityCursor )
    {
        super( pool );
        this.relationshipSecurityCursor = relationshipSecurityCursor;
    }

    @Override
    LongSet createAddedInTxState( TransactionState txState, int token )
    {
        return txState.relationshipsWithTypeChanged( token ).getAdded().freeze();
    }

    @Override
    LongSet createDeletedInTxState( TransactionState txState, int token )
    {
        return txState.addedAndRemovedRelationships().getRemoved().freeze();
    }

    @Override
    void traceScan( KernelReadTracer tracer, int token )
    {
        tracer.onRelationshipTypeScan( token );
    }

    @Override
    void traceNext( KernelReadTracer tracer, long entity )
    {
        tracer.onRelationship( entity );
    }

    @Override
    boolean allowedToSeeAllEntitiesWithToken( AccessMode accessMode, int token )
    {
        return accessMode.allowsTraverseRelType( token ) && accessMode.allowsTraverseAllLabels();
    }

    @Override
    boolean allowedToSeeEntity( AccessMode accessMode, long entityReference, TokenSet tokens )
    {
        readEntity( read -> read.singleRelationship( entityReference, relationshipSecurityCursor ) );
        return relationshipSecurityCursor.next();
    }

    @Override
    public void relationship( RelationshipScanCursor cursor )
    {
        readEntity( read -> read.singleRelationship( entityReference(), cursor ) );
    }

    @Override
    public void sourceNode( NodeCursor cursor )
    {
        throw new UnsupportedOperationException( "We have not yet implemented tracking of the relationship end nodes in the relationship type index cursor." );
    }

    @Override
    public void targetNode( NodeCursor cursor )
    {
        throw new UnsupportedOperationException( "We have not yet implemented tracking of the relationship end nodes in the relationship type index cursor." );
    }

    @Override
    public int type()
    {
        throw new UnsupportedOperationException( "We have not yet implemented tracking of the type in the relationship type index cursor." );
    }

    @Override
    public long sourceNodeReference()
    {
        throw new UnsupportedOperationException( "We have not yet implemented tracking of the relationship end nodes in the relationship type index cursor." );
    }

    @Override
    public long targetNodeReference()
    {
        throw new UnsupportedOperationException( "We have not yet implemented tracking of the relationship end nodes in the relationship type index cursor." );
    }

    @Override
    public long relationshipReference()
    {
        return entityReference();
    }

    @Override
    public float score()
    {
        return Float.NaN;
    }

    public void release()
    {
        if ( relationshipSecurityCursor != null )
        {
            relationshipSecurityCursor.close();
            relationshipSecurityCursor.release();
        }
    }

    @Override
    public String toString()
    {
        if ( isClosed() )
        {
            return "RelationshipTypeIndexCursor[closed state]";
        }
        else
        {
            return "RelationshipTypeIndexCursor[relationship=" + entityReference() + "]";
        }
    }
}
