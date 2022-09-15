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
package org.neo4j.internal.batchimport;

import org.neo4j.internal.batchimport.cache.idmapping.string.EncodingIdMapper;
import org.neo4j.kernel.impl.store.PropertyStore;
import org.neo4j.kernel.impl.store.record.PropertyRecord;
import org.neo4j.storageengine.api.cursor.StoreCursors;

import static org.neo4j.internal.recordstorage.RecordCursorTypes.PROPERTY_CURSOR;
import static org.neo4j.kernel.impl.store.record.RecordLoad.CHECK;

/**
 * Looks up "input id" from a node. This is used when importing nodes and where the input data specifies ids
 * using its own id name space, such as arbitrary strings. Those ids are called input ids and are converted
 * into actual record ids during import. However there may be duplicate such input ids in the input data
 * and the {@link EncodingIdMapper} may need to double check some input ids since it's only caching a hash
 * of the input id in memory. The input ids are stored as properties on the nodes to be able to retrieve
 * them for such an event. This class can look up those input id properties for arbitrary nodes.
 */
class NodeInputIdPropertyLookup implements PropertyValueLookup
{
    private final PropertyStore propertyStore;
    private final PropertyRecord propertyRecord;
    private final StoreCursors storeCursors;

    NodeInputIdPropertyLookup( PropertyStore propertyStore, StoreCursors storeCursors )
    {
        this.propertyStore = propertyStore;
        this.propertyRecord = propertyStore.newRecord();
        this.storeCursors = storeCursors;
    }

    @Override
    public Object lookupProperty( long nodeId )
    {
        propertyStore.getRecordByCursor( nodeId, propertyRecord, CHECK, storeCursors.readCursor( PROPERTY_CURSOR ) );
        if ( !propertyRecord.inUse() )
        {
            return null;
        }
        return propertyRecord.iterator().next().newPropertyValue( propertyStore, storeCursors ).asObject();
    }
}
