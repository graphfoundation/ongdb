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
package org.neo4j.consistency.checker;

import org.eclipse.collections.api.iterator.LongIterator;
import org.eclipse.collections.api.iterator.MutableIntIterator;
import org.eclipse.collections.api.map.primitive.IntObjectMap;
import org.eclipse.collections.api.map.primitive.MutableIntObjectMap;
import org.eclipse.collections.api.set.primitive.MutableIntSet;
import org.eclipse.collections.impl.set.mutable.primitive.IntHashSet;

import java.util.Arrays;
import java.util.function.Function;

import org.neo4j.consistency.checking.index.IndexAccessors;
import org.neo4j.consistency.report.ConsistencyReport;
import org.neo4j.internal.kernel.api.PropertyIndexQuery;
import org.neo4j.internal.kernel.api.exceptions.schema.IndexNotApplicableKernelException;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.recordstorage.RecordStorageReader;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.internal.schema.SchemaDescriptor;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.api.index.ValueIndexReader;
import org.neo4j.kernel.impl.index.schema.NodeValueIterator;
import org.neo4j.kernel.impl.store.record.PrimitiveRecord;
import org.neo4j.kernel.impl.transaction.state.storeview.DefaultNodePropertyAccessor;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.storageengine.api.cursor.StoreCursors;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.ValueGroup;
import org.neo4j.values.storable.Values;

import static java.lang.Math.toIntExact;
import static java.lang.String.format;
import static org.neo4j.consistency.checker.RecordLoading.lightClear;
import static org.neo4j.internal.kernel.api.IndexQueryConstraints.unconstrained;
import static org.neo4j.internal.kernel.api.QueryContext.NULL_CONTEXT;
import static org.neo4j.io.IOUtils.closeAllUnchecked;

class SchemaComplianceChecker implements AutoCloseable
{
    private final CheckerContext context;
    private final IntObjectMap<MutableIntSet> mandatoryProperties;
    private final MutableIntSet reportedMissingMandatoryPropertyKeys = new IntHashSet();
    private final IndexAccessors.IndexReaders indexReaders;
    private final Iterable<IndexDescriptor> indexes;
    private final CursorContext cursorContext;
    private final StoreCursors storeCursors;
    private final DefaultNodePropertyAccessor propertyAccessor;

    SchemaComplianceChecker( CheckerContext context, MutableIntObjectMap<MutableIntSet> mandatoryProperties, Iterable<IndexDescriptor> indexes,
            CursorContext cursorContext, StoreCursors storeCursors, MemoryTracker memoryTracker )
    {
        this.context = context;
        this.mandatoryProperties = mandatoryProperties;
        this.indexReaders = context.indexAccessors.readers();
        this.indexes = indexes;
        this.cursorContext = cursorContext;
        this.storeCursors = storeCursors;
        this.propertyAccessor = new DefaultNodePropertyAccessor( new RecordStorageReader( context.neoStores ), cursorContext, storeCursors, memoryTracker );
    }

    <ENTITY extends PrimitiveRecord> void checkContainsMandatoryProperties( ENTITY entity, long[] entityTokens, IntObjectMap<Value> values,
            Function<ENTITY,ConsistencyReport.PrimitiveConsistencyReport> reportSupplier )
    {
        if ( entityTokens.length > 0 )
        {
            checkMandatoryProperties( entity, values, entityTokens, reportSupplier );
        }
    }

    <ENTITY extends PrimitiveRecord> void checkCorrectlyIndexed( ENTITY entity, long[] entityTokens, IntObjectMap<Value> values,
            Function<ENTITY,ConsistencyReport.PrimitiveConsistencyReport> reportSupplier )
    {
        for ( IndexDescriptor indexRule : indexes )
        {
            SchemaDescriptor schema = indexRule.schema();
            Value[] valueArray = RecordLoading.entityIntersectionWithSchema( entityTokens, values, schema, indexRule.getIndexType() );
            if ( valueArray == null )
            {
                continue;
            }
            var reader = indexReaders.reader( indexRule );
            if ( indexRule.isUnique() )
            {
                verifyIndexedUniquely( entity, valueArray, indexRule, reader, reportSupplier );
            }
            else
            {
                long count = reader.countIndexedEntities( entity.getId(), cursorContext, schema.getPropertyIds(), valueArray );
                reportIncorrectIndexCount( entity, valueArray, indexRule, count, reportSupplier );
            }
        }
    }

    @Override
    public void close()
    {
        closeAllUnchecked( indexReaders, propertyAccessor );
    }

    private <ENTITY extends PrimitiveRecord> void verifyIndexedUniquely( ENTITY entity, Value[] propertyValues, IndexDescriptor indexRule,
                                                                         ValueIndexReader reader,
                                                                         Function<ENTITY,ConsistencyReport.PrimitiveConsistencyReport> reportSupplier )
    {
        long nodeId = entity.getId();
        PropertyIndexQuery[] query = seek( indexRule.schema(), propertyValues );
        LongIterator indexedNodeIds = queryIndexOrEmpty( reader, query );
        long count = 0;
        while ( indexedNodeIds.hasNext() )
        {
            long indexedNodeId = indexedNodeIds.next();
            if ( nodeId == indexedNodeId )
            {
                count++;
            }
            else
            {
                reportSupplier.apply( entity ).uniqueIndexNotUnique( indexRule, Values.asObjects( propertyValues ), indexedNodeId );
            }
        }

        reportIncorrectIndexCount( entity, propertyValues, indexRule, count, reportSupplier );
    }

    private static PropertyIndexQuery[] seek( SchemaDescriptor schema, Value[] propertyValues )
    {
        int[] propertyIds = schema.getPropertyIds();
        assert propertyIds.length == propertyValues.length;
        PropertyIndexQuery[] query = new PropertyIndexQuery[propertyValues.length];
        for ( int i = 0; i < query.length; i++ )
        {
            query[i] = PropertyIndexQuery.exact( propertyIds[i], propertyValues[i] );
        }
        return query;
    }

    private static LongIterator queryIndexOrEmpty( ValueIndexReader reader, PropertyIndexQuery[] query )
    {
        try
        {
            NodeValueIterator indexedNodeIds = new NodeValueIterator();
            reader.query( indexedNodeIds, NULL_CONTEXT, AccessMode.Static.READ, unconstrained(), query );
            return indexedNodeIds;
        }
        catch ( IndexNotApplicableKernelException e )
        {
            throw new RuntimeException( format( "Consistency checking error: index provider does not support exact query %s", Arrays.toString( query ) ), e );
        }
    }

    private <ENTITY extends PrimitiveRecord> void reportIncorrectIndexCount( ENTITY entity, Value[] propertyValues, IndexDescriptor indexRule,
            long count, Function<ENTITY,ConsistencyReport.PrimitiveConsistencyReport> reportSupplier )
    {
        if ( count == 0 )
        {
            if ( areValuesSupportedByIndex( indexRule.getIndexType(), propertyValues ) )
            {
                reportSupplier.apply( context.recordLoader.entity( entity, storeCursors ) ).notIndexed( indexRule, Values.asObjects( propertyValues ) );
            }
        }
        else if ( count != 1 )
        {
            reportSupplier.apply( context.recordLoader.entity( entity, storeCursors ) )
                    .indexedMultipleTimes( indexRule, Values.asObjects( propertyValues ), count );
        }
    }

    private <ENTITY extends PrimitiveRecord> void checkMandatoryProperties( ENTITY entity, IntObjectMap<Value> seenProperties, long[] entityTokenIds,
            Function<ENTITY,ConsistencyReport.PrimitiveConsistencyReport> reporter )
    {
        if ( !mandatoryProperties.isEmpty() )
        {
            lightClear( reportedMissingMandatoryPropertyKeys );
            for ( long entityToken : entityTokenIds )
            {
                MutableIntSet mandatoryPropertyKeysForEntityToken = mandatoryProperties.get( toIntExact( entityToken ) );
                if ( mandatoryPropertyKeysForEntityToken != null )
                {
                    MutableIntIterator iterator = mandatoryPropertyKeysForEntityToken.intIterator();
                    while ( iterator.hasNext() )
                    {
                        int mandatoryPropertyKeyForEntityToken = iterator.next();
                        if ( !seenProperties.containsKey( mandatoryPropertyKeyForEntityToken ) &&
                                reportedMissingMandatoryPropertyKeys.add( mandatoryPropertyKeyForEntityToken ) )
                        {
                            reporter.apply( entity ).missingMandatoryProperty( mandatoryPropertyKeyForEntityToken );
                        }
                    }
                }
            }
        }
    }

    static boolean areValuesSupportedByIndex( IndexType indexType, Value... values )
    {
        if ( values == null )
        {
            return false;
        }

        switch ( indexType )
        {
        case BTREE:
        case RANGE:
            return true;
        case FULLTEXT:
            for ( Value value : values )
            {
                if ( isValueSupportedByIndex( indexType, value ) )
                {
                    return true;
                }
            }
            return false;
        case POINT:
        case TEXT:
            // Neither point nor text index can be composite,
            // so this is just a convenient way how to handle the array type
            for ( Value value : values )
            {
                return isValueSupportedByIndex( indexType, value );
            }
        default:
            return false;
        }
    }

    static boolean isValueSupportedByIndex( IndexType indexType, Value value )
    {
        switch ( indexType )
        {
        case BTREE:
        case RANGE:
            return true;
        case TEXT:
        case FULLTEXT:
            return value.valueGroup() == ValueGroup.TEXT;
        case POINT:
            return value.valueGroup() == ValueGroup.GEOMETRY;
        default:
            return false;
        }
    }
}
