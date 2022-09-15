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
package org.neo4j.kernel.impl.index.schema;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.EnumSet;

import org.neo4j.common.TokenNameLookup;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector;
import org.neo4j.internal.kernel.api.PropertyIndexQuery;
import org.neo4j.internal.schema.IndexCapability;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexOrderCapability;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.IndexProviderDescriptor;
import org.neo4j.internal.schema.IndexQuery;
import org.neo4j.internal.schema.IndexQuery.IndexQueryType;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.internal.schema.IndexValueCapability;
import org.neo4j.io.memory.ByteBufferFactory;
import org.neo4j.kernel.api.index.IndexAccessor;
import org.neo4j.kernel.api.index.IndexDirectoryStructure;
import org.neo4j.kernel.api.index.IndexPopulator;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.util.Preconditions;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.ValueCategory;
import org.neo4j.values.storable.ValueGroup;

import static org.neo4j.internal.schema.IndexCapability.NO_CAPABILITY;

/**
 * Native index able to handle all value types in a single {@link GBPTree}. Single-key as well as composite-key is supported.
 *
 * A composite index query have one predicate per slot / column.
 * The predicate comes in the form of an index query. Any of "exact", "range", "exist", or "allEntries".
 * Other index providers have support for exact predicate on all columns or Exists predicate on all columns (full scan).
 * This index provider have some additional capabilities. It can combine the slot predicates under the following rules:
 * a. Exact can only follow another Exact or be in first slot.
 * b. Range can only follow Exact or be in first slot.
 *
 * We use the following notation for the predicates:
 * x: Exact predicate
 * -: Exists predicate
 * a: AllEntries predicate
 * >: Range predicate (this could be ranges with zero or one open end)
 * ?: any predicate
 * .: blank
 *
 * With an index on 5 slots as en example we can build several composite queries:
 *     p1 p2 p3 p4 p5 (order is important)
 *  1: x  x  x  x  x
 *  2: -  -  -  -  -
 *  3: x  -  -  -  -
 *  4: x  x  x  x  -
 *  5: >  -  -  -  -
 *  6: x  >  -  -  -
 *  7: x  x  x  x  >
 *  8: a  .  .  .  .
 *  9: >  x  -  -  - (not allowed!)
 * 10: >  >  -  -  - (not allowed!)
 * 11: -  x  -  -  - (not allowed!)
 * 12: -  >  -  -  - (not allowed!)
 * 13: ?  a  ?  ?  ? (not allowed!)
 *
 *  1: Exact match on all slots. Supported by all index providers.
 *  2: Exists scan on all slots. Supported by all index providers.
 *  3: Exact match on first column and Exists on the rest.
 *  4: Exact match on all columns but the last.
 *  5: Range on first column and Exists on rest.
 *  6: Exact on first, Range on second and Exists on rest.
 *  7: Exact on all but last column. Range on last.
 *  8: AllEntries predicate being the only predicate.
 *  9: Not allowed because Exact can only follow another Exact.
 * 10: Not allowed because Range can only follow Exact.
 * 11: Not allowed because Exact can only follow another Exact.
 * 12: Not allowed because Range can only follow Exact.
 * 13: Not allowed because AllEntries can only be used alone.
 *
 * WHY?
 * In short, we only allow "restrictive" predicates (Exact or Range) if they help us restrict the scan range.
 * Let's take query 12 as example
 * p1 p2 p3 p4 p5
 * -  >  -  -  -
 * Index is sorted first by p1, then p2, etc.
 * Because we have a complete scan on p1 the Range predicate on p2 can not restrict the range of the index we need to scan.
 * We COULD allow this query and do filter during scan instead and take the extra cost into account when planning queries.
 * As of writing this, there is no such filtering implementation.
 */
public class RangeIndexProvider extends NativeIndexProvider<RangeKey,RangeLayout>
{
    public static final IndexProviderDescriptor DESCRIPTOR = new IndexProviderDescriptor( "range", "1.0" );
    public static final RangeIndexCapability CAPABILITY = new RangeIndexCapability();

    private final boolean archiveFailedIndex;
    private final Config config;

    public RangeIndexProvider( DatabaseIndexContext databaseIndexContext, IndexDirectoryStructure.Factory directoryStructureFactory,
            RecoveryCleanupWorkCollector recoveryCleanupWorkCollector, Config config )
    {
        super( databaseIndexContext, DESCRIPTOR, directoryStructureFactory, recoveryCleanupWorkCollector );

        this.archiveFailedIndex = config.get( GraphDatabaseInternalSettings.archive_failed_index );
        this.config = config;
    }

    @Override
    public IndexDescriptor completeConfiguration( IndexDescriptor index )
    {
        return index.getCapability().equals( NO_CAPABILITY ) ? index.withIndexCapability( CAPABILITY ) : index;
    }

    @Override
    RangeLayout layout( IndexDescriptor descriptor, Path storeFile )
    {
        int numberOfSlots = descriptor.schema().getPropertyIds().length;
        return new RangeLayout( numberOfSlots );
    }

    @Override
    protected IndexPopulator newIndexPopulator( IndexFiles indexFiles, RangeLayout layout, IndexDescriptor descriptor, ByteBufferFactory bufferFactory,
            MemoryTracker memoryTracker, TokenNameLookup tokenNameLookup )
    {
        return new RangeBlockBasedIndexPopulator( databaseIndexContext, indexFiles, layout, descriptor, archiveFailedIndex,
                bufferFactory, config, memoryTracker, tokenNameLookup );
    }

    @Override
    protected IndexAccessor newIndexAccessor( IndexFiles indexFiles, RangeLayout layout, IndexDescriptor descriptor, TokenNameLookup tokenNameLookup )
    {
        return new RangeIndexAccessor( databaseIndexContext, indexFiles, layout, recoveryCleanupWorkCollector, descriptor, tokenNameLookup );
    }

    @Override
    public void validatePrototype( IndexPrototype prototype )
    {
        IndexType indexType = prototype.getIndexType();
        if ( indexType != IndexType.RANGE )
        {
            String providerName = getProviderDescriptor().name();
            throw new IllegalArgumentException( "The '" + providerName + "' index provider does not support " + indexType + " indexes: " + prototype );
        }

        if (  !( prototype.schema().isLabelSchemaDescriptor() || prototype.schema().isRelationshipTypeSchemaDescriptor() ) )
        {
            throw new IllegalArgumentException(
                    "The " + prototype.schema() + " index schema is not a range index schema, which it is required to be for the '" +
                    getProviderDescriptor().name() + "' index provider to be able to create an index." );
        }
    }

    @Override
    public IndexType getIndexType()
    {
        return IndexType.RANGE;
    }

    private static class RangeIndexCapability implements IndexCapability
    {
        @Override
        public IndexOrderCapability orderCapability( ValueCategory... valueCategories )
        {
            return IndexOrderCapability.BOTH_FULLY_SORTED;
        }

        @Override
        public IndexValueCapability valueCapability( ValueCategory... valueCategories )
        {
            return IndexValueCapability.YES;
        }

        @Override
        public boolean areValueCategoriesAccepted( ValueCategory... valueCategories )
        {
            Preconditions.requireNonEmpty( valueCategories );
            Preconditions.requireNoNullElements( valueCategories );
            return true;
        }

        @Override
        public boolean areValuesAccepted( Value... values )
        {
            Preconditions.requireNonEmpty( values );
            Preconditions.requireNoNullElements( values );
            return true;
        }

        @Override
        public boolean isQuerySupported( IndexQueryType queryType, ValueCategory valueCategory )
        {
            if ( !areValueCategoriesAccepted( valueCategory ) )
            {
                return false;
            }

            switch ( queryType )
            {
            case ALL_ENTRIES:
            case EXISTS:
            case EXACT:
            case STRING_PREFIX:
                return true;
            case RANGE:
                return valueCategory != ValueCategory.UNKNOWN && valueCategory != ValueCategory.GEOMETRY;
            default:
                return false;
            }
        }

        @Override
        public double getCostMultiplier( IndexQueryType... queryTypes )
        {
            return 1.0;
        }

        @Override
        public boolean supportPartitionedScan( IndexQuery... queries )
        {
            Preconditions.requireNonEmpty( queries );
            Preconditions.requireNoNullElements( queries );
            if ( Arrays.stream( queries ).anyMatch( query ->
                    EnumSet.of( IndexQueryType.TOKEN_LOOKUP, IndexQueryType.STRING_SUFFIX, IndexQueryType.STRING_CONTAINS ).contains( query.type() )
                    || (query.type() == IndexQueryType.RANGE
                        && EnumSet.of( ValueGroup.GEOMETRY, ValueGroup.GEOMETRY_ARRAY ).contains( ((PropertyIndexQuery) query).valueGroup() )) )
                 || (queries.length > 1 && Arrays.stream( queries ).map( IndexQuery::type ).anyMatch( IndexQueryType.ALL_ENTRIES::equals )) )
            {
                return false;
            }

            for ( int i = 1; i < queries.length; i++ )
            {
                final var prev = queries[i - 1].type();
                final var curr = queries[i].type();

                if ( prev == IndexQueryType.EXACT )
                {
                    continue;
                }
                if ( (EnumSet.of( IndexQueryType.EXISTS, IndexQueryType.RANGE, IndexQueryType.STRING_PREFIX ).contains( prev ))
                     && !(curr == IndexQueryType.EXISTS) )
                {
                    return false;
                }
            }
            return true;
        }
    }
}
