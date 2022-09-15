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
package org.neo4j.internal.recordstorage;

import java.io.IOException;

import org.neo4j.internal.helpers.Numbers;
import org.neo4j.internal.recordstorage.Command.BaseCommand;
import org.neo4j.internal.schema.SchemaRule;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.impl.store.CommonAbstractStore;
import org.neo4j.kernel.impl.store.MetaDataStore;
import org.neo4j.kernel.impl.store.NeoStores;
import org.neo4j.kernel.impl.store.record.AbstractBaseRecord;
import org.neo4j.lock.LockGroup;
import org.neo4j.lock.LockService;
import org.neo4j.lock.LockType;
import org.neo4j.storageengine.api.CommandVersion;
import org.neo4j.storageengine.api.cursor.CursorType;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.storageengine.util.IdUpdateListener;

import static org.neo4j.internal.recordstorage.RecordCursorTypes.GROUP_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.LABEL_TOKEN_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.NODE_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.PROPERTY_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.PROPERTY_KEY_TOKEN_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.RELATIONSHIP_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.REL_TYPE_TOKEN_CURSOR;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.SCHEMA_CURSOR;

/**
 * Visits commands targeted towards the {@link NeoStores} and update corresponding stores.
 * What happens in here is what will happen in a "internal" transaction, i.e. a transaction that has been
 * forged in this database, with transaction state, a KernelTransaction and all that and is now committing.
 * <p>
 * For other modes of application, like recovery or external there are other, added functionality, decorated
 * outside this applier.
 */
public class NeoStoreTransactionApplier extends TransactionApplier.Adapter
{
    private final CommandVersion version;
    private final LockGroup lockGroup;
    private final long transactionId;
    private final NeoStores neoStores;
    private final CacheAccessBackDoor cacheAccess;
    private final LockService lockService;
    private final IdUpdateListener idUpdateListener;
    private final CursorContext cursorContext;
    private final StoreCursors storeCursors;

    public NeoStoreTransactionApplier( CommandVersion version, NeoStores neoStores, CacheAccessBackDoor cacheAccess, LockService lockService,
            long transactionId, BatchContext batchContext, CursorContext cursorContext, StoreCursors storeCursors )
    {
        this.version = version;
        this.lockGroup = batchContext.getLockGroup();
        this.transactionId = transactionId;
        this.lockService = lockService;
        this.neoStores = neoStores;
        this.cacheAccess = cacheAccess;
        this.idUpdateListener = batchContext.getIdUpdateListener();
        this.cursorContext = cursorContext;
        this.storeCursors = storeCursors;
    }

    @Override
    public boolean visitNodeCommand( Command.NodeCommand command )
    {
        // acquire lock
        lockGroup.add( lockService.acquireNodeLock( command.getKey(), LockType.EXCLUSIVE ) );

        // update store
        updateStore( neoStores.getNodeStore(), command, NODE_CURSOR );
        return false;
    }

    @Override
    public boolean visitRelationshipCommand( Command.RelationshipCommand command )
    {
        lockGroup.add( lockService.acquireRelationshipLock( command.getKey(), LockType.EXCLUSIVE ) );

        updateStore( neoStores.getRelationshipStore(), command, RELATIONSHIP_CURSOR );
        return false;
    }

    @Override
    public boolean visitPropertyCommand( Command.PropertyCommand command )
    {
        // acquire lock
        if ( command.after.isNodeSet() )
        {
            lockGroup.add( lockService.acquireNodeLock( command.getNodeId(), LockType.EXCLUSIVE ) );
        }
        else
        {
            lockGroup.add( lockService.acquireRelationshipLock( command.getRelId(), LockType.EXCLUSIVE ) );
        }

        updateStore( neoStores.getPropertyStore(), command, PROPERTY_CURSOR );
        return false;
    }

    @Override
    public boolean visitRelationshipGroupCommand( Command.RelationshipGroupCommand command )
    {
        updateStore( neoStores.getRelationshipGroupStore(), command, GROUP_CURSOR );
        return false;
    }

    @Override
    public boolean visitRelationshipTypeTokenCommand( Command.RelationshipTypeTokenCommand command )
    {
        updateStore( neoStores.getRelationshipTypeTokenStore(), command, REL_TYPE_TOKEN_CURSOR );
        return false;
    }

    @Override
    public boolean visitLabelTokenCommand( Command.LabelTokenCommand command )
    {
        updateStore( neoStores.getLabelTokenStore(), command, LABEL_TOKEN_CURSOR );
        return false;
    }

    @Override
    public boolean visitPropertyKeyTokenCommand( Command.PropertyKeyTokenCommand command )
    {
        updateStore( neoStores.getPropertyKeyTokenStore(), command, PROPERTY_KEY_TOKEN_CURSOR );
        return false;
    }

    @Override
    public boolean visitSchemaRuleCommand( Command.SchemaRuleCommand command )
    {
        // schema rules. Execute these after generating the property updates so. If executed
        // before and we've got a transaction that sets properties/labels as well as creating an index
        // we might end up with this corner-case:
        // 1) index rule created and index population job started
        // 2) index population job processes some nodes, but doesn't complete
        // 3) we gather up property updates and send those to the indexes. The newly created population
        //    job might get those as updates
        // 4) the population job will apply those updates as added properties, and might end up with duplicate
        //    entries for the same property
        updateStore( neoStores.getSchemaStore(), command, SCHEMA_CURSOR );
        SchemaRule schemaRule = command.getSchemaRule();
        boolean isConstraint = command.getAfter().isConstraint();
        onSchemaRuleChange( command.getMode(), command.getKey(), schemaRule, isConstraint );
        return false;
    }

    @Override
    public boolean visitMetaDataCommand( Command.MetaDataCommand command ) throws IOException
    {
        if ( command.getAfter().getId() == MetaDataStore.Position.KERNEL_VERSION.id() )
        {
            KernelVersion kernelVersion = KernelVersion.getForVersion( Numbers.safeCastLongToByte( command.getAfter().getValue() ) );
            neoStores.getMetaDataStore().setKernelVersion( kernelVersion, cursorContext );
        }
        else
        {
            throw new UnsupportedOperationException( "Unexpected meta data update " + command );
        }
        return false;
    }

    private void onSchemaRuleChange( Command.Mode commandMode, long schemaRuleId, SchemaRule schemaRule, boolean isConstraint )
    {
        if ( isConstraint )
        {
            switch ( commandMode )
            {
            case UPDATE:
            case CREATE:
                neoStores.getMetaDataStore().setLatestConstraintIntroducingTx( transactionId, cursorContext );
                break;
            case DELETE:
                break;
            default:
                throw new IllegalStateException( commandMode.name() );
            }
        }

        if ( commandMode == Command.Mode.DELETE )
        {
            cacheAccess.removeSchemaRuleFromCache( schemaRuleId );
        }
        else
        {
            cacheAccess.addSchemaRule( schemaRule );
        }
    }

    private <RECORD extends AbstractBaseRecord> void updateStore( CommonAbstractStore<RECORD,?> store, BaseCommand<RECORD> command, CursorType cursorType )
    {
        try ( var cursor = storeCursors.writeCursor( cursorType ) )
        {
            store.updateRecord( selectRecordByCommandVersion( command ), idUpdateListener, cursor, cursorContext, storeCursors );
        }
    }

    private <RECORD extends AbstractBaseRecord> RECORD selectRecordByCommandVersion( BaseCommand<RECORD> command )
    {
        switch ( version )
        {
        case BEFORE:
            return command.getBefore();
        case AFTER:
            return command.getAfter();
        default:
            throw new IllegalArgumentException( "Unexpected command version " + version );
        }
    }
}
