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
package org.neo4j.kernel.impl.store;

import org.eclipse.collections.api.set.ImmutableSet;

import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;

import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.internal.helpers.Exceptions;
import org.neo4j.internal.id.IdGeneratorFactory;
import org.neo4j.internal.recordstorage.RecordIdType;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.PageCursor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.record.DynamicRecord;
import org.neo4j.kernel.impl.store.record.NodeRecord;
import org.neo4j.kernel.impl.store.record.RecordLoad;
import org.neo4j.logging.LogProvider;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.storageengine.util.IdUpdateListener;
import org.neo4j.util.Bits;

import static java.lang.String.format;
import static org.neo4j.internal.recordstorage.RecordCursorTypes.DYNAMIC_LABEL_STORE_CURSOR;
import static org.neo4j.kernel.impl.store.NoStoreHeaderFormat.NO_STORE_HEADER_FORMAT;

/**
 * Implementation of the node store.
 */
public class NodeStore extends CommonAbstractStore<NodeRecord,NoStoreHeader>
{
    public static final String TYPE_DESCRIPTOR = "NodeStore";
    private final DynamicArrayStore dynamicLabelStore;

    public static Long readOwnerFromDynamicLabelsRecord( DynamicRecord record )
    {
        byte[] data = record.getData();
        byte[] header = PropertyType.ARRAY.readDynamicRecordHeader( data );
        byte[] array = Arrays.copyOfRange( data, header.length, data.length );

        int requiredBits = header[2];
        if ( requiredBits == 0 )
        {
            return null;
        }
        Bits bits = Bits.bitsFromBytes( array );
        return bits.getLong( requiredBits );
    }

    public NodeStore(
            Path path,
            Path idFile,
            Config config,
            IdGeneratorFactory idGeneratorFactory,
            PageCache pageCache,
            LogProvider logProvider,
            DynamicArrayStore dynamicLabelStore,
            RecordFormats recordFormats,
            DatabaseReadOnlyChecker readOnlyChecker,
            String databaseName,
            ImmutableSet<OpenOption> openOptions )
    {
        super( path, idFile, config, RecordIdType.NODE, idGeneratorFactory, pageCache, logProvider, TYPE_DESCRIPTOR, recordFormats.node(),
                NO_STORE_HEADER_FORMAT, recordFormats.storeVersion(), readOnlyChecker, databaseName, openOptions );
        this.dynamicLabelStore = dynamicLabelStore;
    }

    @Override
    public void ensureHeavy( NodeRecord node, StoreCursors storeCursors )
    {
        if ( NodeLabelsField.fieldPointsToDynamicRecordOfLabels( node.getLabelField() ) )
        {
            ensureHeavy( node, NodeLabelsField.firstDynamicLabelRecordId( node.getLabelField() ), storeCursors );
        }
    }

    public void ensureHeavy( NodeRecord node, long firstDynamicLabelRecord, StoreCursors storeCursors )
    {
        if ( !node.isLight() )
        {
            return;
        }

        // Load any dynamic labels and populate the node record
        try
        {
            node.setLabelField( node.getLabelField(),
                    dynamicLabelStore.getRecords( firstDynamicLabelRecord, RecordLoad.NORMAL, false, storeCursors.readCursor( DYNAMIC_LABEL_STORE_CURSOR ) ) );
        }
        catch ( InvalidRecordException e )
        {
            throw Exceptions.withMessage( e, format( "Error loading dynamic label records for %s | %s", node, e.getMessage() ) );
        }
    }

    @Override
    public void updateRecord( NodeRecord record, IdUpdateListener idUpdateListener, PageCursor cursor, CursorContext cursorContext, StoreCursors storeCursors )
    {
        super.updateRecord( record, idUpdateListener, cursor, cursorContext, storeCursors );
        updateDynamicLabelRecords( record.getDynamicLabelRecords(), idUpdateListener, cursorContext, storeCursors );
    }

    public DynamicArrayStore getDynamicLabelStore()
    {
        return dynamicLabelStore;
    }

    public void updateDynamicLabelRecords( Iterable<DynamicRecord> dynamicLabelRecords, IdUpdateListener idUpdateListener, CursorContext cursorContext,
            StoreCursors storeCursors )
    {
        try ( var cursor = storeCursors.writeCursor( DYNAMIC_LABEL_STORE_CURSOR ) )
        {
            for ( DynamicRecord record : dynamicLabelRecords )
            {
                dynamicLabelStore.updateRecord( record, idUpdateListener, cursor, cursorContext, storeCursors );
            }
        }
    }
}
