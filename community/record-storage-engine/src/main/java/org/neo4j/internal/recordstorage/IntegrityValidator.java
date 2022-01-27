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
package org.neo4j.internal.recordstorage;

import org.neo4j.exceptions.KernelException;
import org.neo4j.internal.kernel.api.exceptions.DeletedNodeStillHasRelationshipsException;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.internal.schema.SchemaRule;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.Record;
import org.neo4j.storageengine.api.IndexUpdateListener;
import org.neo4j.util.Preconditions;

import static org.neo4j.kernel.KernelVersion.VERSION_IN_WHICH_TOKEN_INDEXES_ARE_INTRODUCED;
import static org.neo4j.kernel.KernelVersion.VERSION_RANGE_POINT_TEXT_INDEX_TYPES_ARE_INTRODUCED;

/**
 * Validates data integrity during the prepare phase of {@link TransactionRecordState}.
 */
class IntegrityValidator
{
    private final NeoStores neoStores;
    private IndexUpdateListener indexValidator;

    IntegrityValidator( NeoStores neoStores )
    {
        this.neoStores = neoStores;
    }

    void setIndexValidator( IndexUpdateListener validator )
    {
        Preconditions.checkState( this.indexValidator == null,
                "Only supports a single validator. Tried to add " + validator + ", but " + this.indexValidator + " has already been added" );
        this.indexValidator = validator;
    }

    static void validateNodeRecord( NodeRecord record ) throws TransactionFailureException
    {
        if ( !record.inUse() && record.getNextRel() != Record.NO_NEXT_RELATIONSHIP.intValue() )
        {
            throw new DeletedNodeStillHasRelationshipsException( record.getId() );
        }
    }

    void validateTransactionStartKnowledge( long lastCommittedTxWhenTransactionStarted )
            throws TransactionFailureException
    {
        long latestConstraintIntroducingTx = neoStores.getMetaDataStore().getLatestConstraintIntroducingTx();
        if ( lastCommittedTxWhenTransactionStarted < latestConstraintIntroducingTx )
        {
            // Constraints have changed since the transaction begun

            // This should be a relatively uncommon case, window for this happening is a few milliseconds when an admin
            // explicitly creates a constraint, after the index has been populated. We can improve this later on by
            // replicating the constraint validation logic down here, or rethinking where we validate constraints.
            // For now, we just kill these transactions.
            throw new TransactionFailureException( Status.Transaction.ConstraintsChanged,
                            "Database constraints have changed (txId=%d) after this transaction (txId=%d) started, " +
                            "which is not yet supported. Please retry your transaction to ensure all " +
                            "constraints are executed.", latestConstraintIntroducingTx,
                            lastCommittedTxWhenTransactionStarted );
        }
    }

    void validateSchemaRule( SchemaRule schemaRule ) throws TransactionFailureException
    {
        Preconditions.checkState( indexValidator != null, "No index validator installed" );
        KernelVersion currentVersion = neoStores.getMetaDataStore().kernelVersion();
        if ( currentVersion.isLessThan( VERSION_IN_WHICH_TOKEN_INDEXES_ARE_INTRODUCED ) )
        {
            if ( schemaRule instanceof IndexDescriptor )
            {
                IndexDescriptor index = (IndexDescriptor) schemaRule;
                if ( index.isTokenIndex() || isBtreeRelationshipPropertyIndex( index ) )
                {
                    throw new TransactionFailureException( Status.General.UpgradeRequired,
                            "Index operation on index '%s' not allowed. " +
                            "Required kernel version for this transaction is %s, but actual version was %s.",
                            index, VERSION_IN_WHICH_TOKEN_INDEXES_ARE_INTRODUCED.name(), currentVersion.name() );
                }
            }
        }
        else if ( currentVersion.isLessThan( VERSION_RANGE_POINT_TEXT_INDEX_TYPES_ARE_INTRODUCED ) )
        {
            if ( schemaRule instanceof IndexDescriptor )
            {
                IndexDescriptor index = (IndexDescriptor) schemaRule;
                IndexType indexType = index.getIndexType();
                if ( isRangePointOrTextIndex( indexType ) )
                {
                    throw new TransactionFailureException( Status.General.UpgradeRequired,
                            "Index operation on index '%s' not allowed. " +
                            "Required kernel version for this transaction is %s, but actual version was %s.",
                            index, VERSION_RANGE_POINT_TEXT_INDEX_TYPES_ARE_INTRODUCED.name(), currentVersion.name() );
                }
            }
            else if ( schemaRule instanceof ConstraintDescriptor )
            {
                ConstraintDescriptor constraint = (ConstraintDescriptor)schemaRule;
                if ( constraint.isIndexBackedConstraint() && isRangePointOrTextIndex( constraint.asIndexBackedConstraint().indexType() ) )
                {
                    throw new TransactionFailureException( Status.General.UpgradeRequired,
                            "Constraint operation on constraint '%s' not allowed. " +
                            "Required kernel version for this transaction is %s, but actual version was %s.",
                            constraint, VERSION_RANGE_POINT_TEXT_INDEX_TYPES_ARE_INTRODUCED.name(), currentVersion.name() );
                }
            }
        }

        if ( schemaRule instanceof ConstraintDescriptor )
        {
            ConstraintDescriptor constraint = (ConstraintDescriptor) schemaRule;
            if ( constraint.isIndexBackedConstraint() )
            {
                long ownedIndex = constraint.asIndexBackedConstraint().ownedIndexId();
                try
                {
                    indexValidator.validateIndex( ownedIndex );
                }
                catch ( KernelException e )
                {
                    // This could occur if there were concurrent violating transactions since the index population completed
                    // but before being activated, e.g. transaction executed on another instance with a dated view of the world.
                    //
                    // The other alternative is that this is an unexpected exception and means we're in a very bad state - out of
                    // disk or index corruption, or similar. This will kill the database such that it can be shut down
                    // and have recovery performed. It's the safest bet to avoid loosing data.
                    throw new TransactionFailureException( Status.Transaction.TransactionValidationFailed, e,
                            "Index validation of " + schemaRule + " failed, specifically for its owned index " + ownedIndex, e );
                }
            }
        }
    }

    private boolean isBtreeRelationshipPropertyIndex( IndexDescriptor index )
    {
        return index.getIndexType() == IndexType.BTREE && index.schema().isRelationshipTypeSchemaDescriptor();
    }

    private boolean isRangePointOrTextIndex( IndexType indexType )
    {
        return indexType == IndexType.RANGE || indexType == IndexType.POINT || indexType == IndexType.TEXT;
    }
}
