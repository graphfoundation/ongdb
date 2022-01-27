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
package org.neo4j.kernel.impl.index.schema;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;

import org.neo4j.common.TokenNameLookup;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.gis.spatial.index.curves.SpaceFillingCurveConfiguration;
import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector;
import org.neo4j.internal.kernel.api.PropertyIndexQuery;
import org.neo4j.internal.schema.IndexBehaviour;
import org.neo4j.internal.schema.IndexCapability;
import org.neo4j.internal.schema.IndexConfig;
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
import org.neo4j.kernel.impl.index.schema.config.ConfiguredSpaceFillingCurveSettingsCache;
import org.neo4j.kernel.impl.index.schema.config.IndexSpecificSpaceFillingCurveSettings;
import org.neo4j.kernel.impl.index.schema.config.SpaceFillingCurveSettings;
import org.neo4j.memory.MemoryTracker;
import org.neo4j.util.Preconditions;
import org.neo4j.values.storable.CoordinateReferenceSystem;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.ValueCategory;
import org.neo4j.values.storable.ValueGroup;

import static org.neo4j.configuration.GraphDatabaseSettings.SchemaIndex.NATIVE_BTREE10;
import static org.neo4j.kernel.impl.index.schema.config.SpaceFillingCurveSettingsFactory.getConfiguredSpaceFillingCurveConfiguration;

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
public class GenericNativeIndexProvider extends NativeIndexProvider<BtreeKey,GenericLayout>
{
    public static final String KEY = NATIVE_BTREE10.providerKey();
    public static final IndexProviderDescriptor DESCRIPTOR = new IndexProviderDescriptor( KEY, NATIVE_BTREE10.providerVersion() );
    public static final IndexCapability CAPABILITY = new GenericIndexCapability();

    /**
     * Cache of all setting for various specific CRS's found in the config at instantiation of this provider.
     * The config is read once and all relevant CRS configs cached here.
     */
    private final ConfiguredSpaceFillingCurveSettingsCache configuredSettings;

    /**
     * A space filling curve configuration used when reading spatial index values.
     */
    private final SpaceFillingCurveConfiguration configuration;
    private final boolean archiveFailedIndex;
    private final Config config;

    public GenericNativeIndexProvider( DatabaseIndexContext databaseIndexContext, IndexDirectoryStructure.Factory directoryStructureFactory,
            RecoveryCleanupWorkCollector recoveryCleanupWorkCollector, Config config )
    {
        super( databaseIndexContext, DESCRIPTOR, directoryStructureFactory, recoveryCleanupWorkCollector );

        this.configuredSettings = new ConfiguredSpaceFillingCurveSettingsCache( config );
        this.configuration = getConfiguredSpaceFillingCurveConfiguration( config );
        this.archiveFailedIndex = config.get( GraphDatabaseInternalSettings.archive_failed_index );
        this.config = config;
    }

    @Override
    public IndexDescriptor completeConfiguration( IndexDescriptor index )
    {
        IndexConfig indexConfig = index.getIndexConfig();
        indexConfig = completeSpatialConfiguration( indexConfig );
        index = index.withIndexConfig( indexConfig );
        if ( index.getCapability().equals( IndexCapability.NO_CAPABILITY ) )
        {
            index = index.withIndexCapability( CAPABILITY );
        }
        return index;
    }

    private IndexConfig completeSpatialConfiguration( IndexConfig indexConfig )
    {
        for ( CoordinateReferenceSystem crs : CoordinateReferenceSystem.all() )
        {
            SpaceFillingCurveSettings spaceFillingCurveSettings = configuredSettings.forCRS( crs );
            indexConfig = SpatialIndexConfig.addSpatialConfig( indexConfig, crs, spaceFillingCurveSettings );
        }
        return indexConfig;
    }

    @Override
    GenericLayout layout( IndexDescriptor descriptor, Path storeFile )
    {
        int numberOfSlots = descriptor.schema().getPropertyIds().length;
        IndexConfig indexConfig = descriptor.getIndexConfig();
        Map<CoordinateReferenceSystem,SpaceFillingCurveSettings> settings = SpatialIndexConfig.extractSpatialConfig( indexConfig );
        return new GenericLayout( numberOfSlots, new IndexSpecificSpaceFillingCurveSettings( settings ) );
    }

    @Override
    protected IndexPopulator newIndexPopulator( IndexFiles indexFiles, GenericLayout layout, IndexDescriptor descriptor, ByteBufferFactory bufferFactory,
            MemoryTracker memoryTracker, TokenNameLookup tokenNameLookup )
    {
        return new GenericBlockBasedIndexPopulator( databaseIndexContext, indexFiles, layout, descriptor, layout.getSpaceFillingCurveSettings(),
                configuration, archiveFailedIndex, bufferFactory, config, memoryTracker, tokenNameLookup );
    }

    @Override
    protected IndexAccessor newIndexAccessor( IndexFiles indexFiles, GenericLayout layout, IndexDescriptor descriptor, TokenNameLookup tokenNameLookup )
    {
        return new GenericNativeIndexAccessor( databaseIndexContext, indexFiles, layout, recoveryCleanupWorkCollector, descriptor,
                layout.getSpaceFillingCurveSettings(), configuration, tokenNameLookup );
    }

    @Override
    public void validatePrototype( IndexPrototype prototype )
    {
        IndexType indexType = prototype.getIndexType();
        if ( indexType != IndexType.BTREE )
        {
            String providerName = getProviderDescriptor().name();
            throw new IllegalArgumentException( "The '" + providerName + "' index provider does not support " + indexType + " indexes: " + prototype );
        }
        if (  !( prototype.schema().isLabelSchemaDescriptor() || prototype.schema().isRelationshipTypeSchemaDescriptor() ) )
        {
            throw new IllegalArgumentException(
                    "The " + prototype.schema() + " index schema is not a btree index schema, which it is required to be for the '" +
                    getProviderDescriptor().name() + "' index provider to be able to create an index." );
        }

        IndexConfig indexConfig = prototype.getIndexConfig();
        indexConfig = completeSpatialConfiguration( indexConfig );
        try
        {
            SpatialIndexConfig.validateSpatialConfig( indexConfig );
        }
        catch ( IllegalArgumentException e )
        {
            throw new IllegalArgumentException( "Invalid spatial index settings.", e );
        }
    }

    private static class GenericIndexCapability implements IndexCapability
    {
        private final IndexBehaviour[] behaviours = {IndexBehaviour.SLOW_CONTAINS};

        @Override
        public IndexOrderCapability orderCapability( ValueCategory... valueCategories )
        {
            var seenUnknown = false;
            for ( ValueCategory valueCategory : valueCategories )
            {
                if ( valueCategory == ValueCategory.GEOMETRY ||
                     valueCategory == ValueCategory.GEOMETRY_ARRAY )
                {
                    return IndexOrderCapability.NONE;
                }
                else if ( valueCategory == ValueCategory.UNKNOWN )
                {
                    seenUnknown = true;
                }
            }
            return seenUnknown ? IndexOrderCapability.BOTH_PARTIALLY_SORTED : IndexOrderCapability.BOTH_FULLY_SORTED;
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
            return queryType != IndexQueryType.FULLTEXT_SEARCH
                   && queryType != IndexQueryType.TOKEN_LOOKUP
                   && areValueCategoriesAccepted( valueCategory );
        }

        @Override
        public double getCostMultiplier( IndexQueryType... queryTypes )
        {
            // for now, just make the operations which are more efficiently supported by
            // lucene-based indexes slightly more expensive so the planner would choose a
            // lucene-based index instead of btree-based index if there is a choice
            if ( Arrays.stream( queryTypes ).anyMatch( EnumSet.of( IndexQueryType.STRING_SUFFIX, IndexQueryType.STRING_CONTAINS )::contains ) )
            {
                return 1.1;
            }
            return 1.0;
        }

        @Override
        public boolean supportPartitionedScan( IndexQuery... queries )
        {
            Preconditions.requireNonEmpty( queries );
            Preconditions.requireNoNullElements( queries );
            if ( Arrays.stream( queries ).anyMatch( query ->
                    (query.type() == IndexQueryType.TOKEN_LOOKUP)
                    || (query.type() == IndexQueryType.RANGE
                        && EnumSet.of( ValueGroup.GEOMETRY, ValueGroup.GEOMETRY_ARRAY ).contains( ((PropertyIndexQuery) query).valueGroup() )) )
                 || (queries.length > 1
                     && Arrays.stream( queries )
                              .map( IndexQuery::type )
                              .anyMatch( EnumSet.of( IndexQueryType.ALL_ENTRIES, IndexQueryType.STRING_SUFFIX, IndexQueryType.STRING_CONTAINS )::contains )) )
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

        @Override
        public IndexBehaviour[] behaviours()
        {
            return behaviours;
        }
    }
}
