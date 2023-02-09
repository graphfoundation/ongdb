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

import org.neo4j.internal.kernel.api.NodeCursor;
import org.neo4j.internal.kernel.api.PropertyCursor;
import org.neo4j.internal.kernel.api.RelationshipDataAccessor;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.storageengine.api.LongReference;
import org.neo4j.storageengine.api.PropertySelection;
import org.neo4j.storageengine.api.Reference;
import org.neo4j.storageengine.api.RelationshipVisitor;
import org.neo4j.storageengine.api.StorageRelationshipCursor;

import static org.neo4j.kernel.impl.newapi.Read.NO_ID;

abstract class DefaultRelationshipCursor<STORECURSOR extends StorageRelationshipCursor,CURSOR> extends TraceableCursor<CURSOR>
        implements RelationshipDataAccessor
{
    protected boolean hasChanges;
    boolean checkHasChanges;
    AccessMode accessMode;
    Read read;

    final STORECURSOR storeCursor;
    RelationshipVisitor<RuntimeException> relationshipTxStateDataVisitor = new TxStateDataVisitor();
    // The visitor above will update the fields below
    long currentAddedInTx = NO_ID;
    private int txStateTypeId;
    long txStateSourceNodeReference;
    long txStateTargetNodeReference;

    DefaultRelationshipCursor( STORECURSOR storeCursor, CursorPool<CURSOR> pool )
    {
        super( pool );
        this.storeCursor = storeCursor;
    }

    protected void init( Read read )
    {
        this.currentAddedInTx = NO_ID;
        this.read = read;
        this.checkHasChanges = true;
        this.accessMode = read.ktx.securityContext().mode();
    }

    @Override
    public long relationshipReference()
    {
        return currentAddedInTx != NO_ID ? currentAddedInTx : storeCursor.entityReference();
    }

    @Override
    public int type()
    {
        return currentAddedInTx != NO_ID ? txStateTypeId : storeCursor.type();
    }

    @Override
    public void source( NodeCursor cursor )
    {
        read.singleNode( sourceNodeReference(), cursor );
    }

    @Override
    public void target( NodeCursor cursor )
    {
        read.singleNode( targetNodeReference(), cursor );
    }

    @Override
    public void properties( PropertyCursor cursor, PropertySelection selection )
    {
        ((DefaultPropertyCursor) cursor).initRelationship( this, selection, read, read );
    }

    @Override
    public long sourceNodeReference()
    {
        return currentAddedInTx != NO_ID ? txStateSourceNodeReference : storeCursor.sourceNodeReference();
    }

    @Override
    public long targetNodeReference()
    {
        return currentAddedInTx != NO_ID ? txStateTargetNodeReference : storeCursor.targetNodeReference();
    }

    @Override
    public Reference propertiesReference()
    {
        return currentAddedInTx != NO_ID ? LongReference.NULL_REFERENCE : storeCursor.propertiesReference();
    }

    protected abstract void collectAddedTxStateSnapshot();

    protected boolean currentRelationshipIsAddedInTx()
    {
        return currentAddedInTx != NO_ID;
    }

    /**
     * RelationshipCursor should only see changes that are there from the beginning
     * otherwise it will not be stable.
     */
    protected boolean hasChanges()
    {
        if ( checkHasChanges )
        {
            hasChanges = read.hasTxStateWithChanges();
            if ( hasChanges )
            {
                collectAddedTxStateSnapshot();
            }
            checkHasChanges = false;
        }

        return hasChanges;
    }

    private class TxStateDataVisitor implements RelationshipVisitor<RuntimeException>
    {
        @Override
        public void visit( long relationshipId, int typeId, long sourceNodeReference, long targetNodeReference )
        {
            currentAddedInTx = relationshipId;
            txStateTypeId = typeId;
            txStateSourceNodeReference = sourceNodeReference;
            txStateTargetNodeReference = targetNodeReference;
        }
    }
}
