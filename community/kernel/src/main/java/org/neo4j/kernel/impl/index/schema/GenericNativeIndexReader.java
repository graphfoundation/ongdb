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

import java.util.List;

import org.neo4j.gis.spatial.index.curves.SpaceFillingCurve;
import org.neo4j.gis.spatial.index.curves.SpaceFillingCurveConfiguration;
import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.internal.kernel.api.IndexQueryConstraints;
import org.neo4j.internal.kernel.api.PropertyIndexQuery;
import org.neo4j.internal.kernel.api.PropertyIndexQuery.ExactPredicate;
import org.neo4j.internal.kernel.api.PropertyIndexQuery.RangePredicate;
import org.neo4j.internal.kernel.api.PropertyIndexQuery.StringPrefixPredicate;
import org.neo4j.internal.kernel.api.QueryContext;
import org.neo4j.internal.kernel.api.security.AccessMode;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexQuery.IndexQueryType;
import org.neo4j.kernel.api.index.BridgingIndexProgressor;
import org.neo4j.kernel.api.index.IndexProgressor;
import org.neo4j.kernel.impl.index.schema.config.IndexSpecificSpaceFillingCurveSettings;
import org.neo4j.values.storable.CoordinateReferenceSystem;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.ValueGroup;
import org.neo4j.values.storable.Values;

import static org.neo4j.kernel.impl.index.schema.NativeIndexKey.Inclusion.HIGH;
import static org.neo4j.kernel.impl.index.schema.NativeIndexKey.Inclusion.LOW;
import static org.neo4j.kernel.impl.index.schema.NativeIndexKey.Inclusion.NEUTRAL;

class GenericNativeIndexReader extends NativeIndexReader<BtreeKey>
{
    private final IndexSpecificSpaceFillingCurveSettings spaceFillingCurveSettings;
    private final SpaceFillingCurveConfiguration configuration;

    GenericNativeIndexReader( GBPTree<BtreeKey,NullValue> tree, IndexLayout<BtreeKey> layout,
            IndexDescriptor descriptor, IndexSpecificSpaceFillingCurveSettings spaceFillingCurveSettings,
            SpaceFillingCurveConfiguration configuration )
    {
        super( tree, layout, descriptor );
        this.spaceFillingCurveSettings = spaceFillingCurveSettings;
        this.configuration = configuration;
    }

    @Override
    void validateQuery( IndexQueryConstraints constraints, PropertyIndexQuery[] predicates )
    {
        QueryValidator.validateOrder( GenericNativeIndexProvider.CAPABILITY, constraints.order(), predicates );
        QueryValidator.validateCompositeQuery( predicates );
    }

    @Override
    public void query( IndexProgressor.EntityValueClient client, QueryContext context, AccessMode accessMode,
                       IndexQueryConstraints constraints, PropertyIndexQuery... query )
    {
        PropertyIndexQuery.GeometryRangePredicate geometryRangePredicate = getGeometryRangePredicateIfAny( query );
        if ( geometryRangePredicate != null )
        {
            context.monitor().queried( descriptor );
            validateQuery( constraints, query );
            try
            {
                // If there's a GeometryRangeQuery among the predicates then this query changes from a straight-forward: build from/to and seek...
                // into a query that is split into multiple sub-queries. Predicates both before and after will have to be accompanied each sub-query.
                BridgingIndexProgressor multiProgressor = new BridgingIndexProgressor( client, descriptor.schema().getPropertyIds() );
                client.initialize( descriptor, multiProgressor, accessMode, false, constraints, query );
                double[] from = geometryRangePredicate.from() == null ? null : geometryRangePredicate.from().coordinate();
                double[] to = geometryRangePredicate.to() == null ? null : geometryRangePredicate.to().coordinate();
                CoordinateReferenceSystem crs = geometryRangePredicate.crs();
                SpaceFillingCurve curve = spaceFillingCurveSettings.forCrs( crs );
                List<SpaceFillingCurve.LongRange> ranges = curve.getTilesIntersectingEnvelope( from, to, configuration );
                for ( SpaceFillingCurve.LongRange range : ranges )
                {
                    // Here's a sub-query that we'll have to do for this geometry range. Build this query from all predicates
                    // and when getting to the geometry range predicate that sparked these sub-query shenanigans, swap in this sub-query in its place.
                    BtreeKey treeKeyFrom = layout.newKey();
                    BtreeKey treeKeyTo = layout.newKey();
                    initializeFromToKeys( treeKeyFrom, treeKeyTo );
                    boolean needFiltering = initializeRangeForGeometrySubQuery( treeKeyFrom, treeKeyTo, query, crs, range );
                    startSeekForInitializedRange( multiProgressor, treeKeyFrom, treeKeyTo, context.cursorContext(), accessMode,
                                                  needFiltering, constraints, query );
                }
            }
            catch ( IllegalArgumentException e )
            {
                // Invalid query ranges will cause this state (eg. min>max)
                client.initialize( descriptor, IndexProgressor.EMPTY, accessMode, false, constraints, query );
            }
        }
        else
        {
            super.query( client, context, accessMode, constraints, query );
        }
    }

    /**
     * Initializes {@code treeKeyFrom} and {@code treeKeyTo} from the {@link PropertyIndexQuery query}.
     * Geometry range queries makes an otherwise straight-forward key construction complex in that a geometry range internally is performed
     * by executing multiple sub-range queries to the index. Each of those sub-range queries still needs to construct the full composite key -
     * in the case of a composite index. Therefore this method can be called either with null or non-null {@code crs} and {@code range} and
     * constructing a key when coming across a {@link PropertyIndexQuery.GeometryRangePredicate} will use the provided crs/range instead
     * of the predicate, where the specific range is one out of many sub-ranges calculated from the {@link PropertyIndexQuery.GeometryRangePredicate}
     * by the caller.
     *
     * @param treeKeyFrom the "from" key to construct from the query.
     * @param treeKeyTo the "to" key to construct from the query.
     * @param query the query to construct keys from to later send to {@link GBPTree} when reading.
     * @param crs {@link CoordinateReferenceSystem} for the specific {@code range}, if range is specified too.
     * @param range sub-range of a larger {@link PropertyIndexQuery.GeometryRangePredicate} to use instead of {@link PropertyIndexQuery.GeometryRangePredicate}
     * in the query.
     * @return {@code true} if filtering is needed for the results from the reader, otherwise {@code false}.
     */
    private static boolean initializeRangeForGeometrySubQuery( BtreeKey treeKeyFrom, BtreeKey treeKeyTo, PropertyIndexQuery[] query,
                                                               CoordinateReferenceSystem crs, SpaceFillingCurve.LongRange range )
    {
        if ( isAllQuery( query ) )
        {
            initializeAllSlotsForFullRange( treeKeyFrom, treeKeyTo );
            return false;
        }

        boolean needsFiltering = false;
        for ( int i = 0; i < query.length; i++ )
        {
            PropertyIndexQuery predicate = query[i];
            switch ( predicate.type() )
            {
            case EXISTS:
                treeKeyFrom.initValueAsLowest( i, ValueGroup.UNKNOWN );
                treeKeyTo.initValueAsHighest( i, ValueGroup.UNKNOWN );
                break;
            case EXACT:
                ExactPredicate exactPredicate = (ExactPredicate) predicate;
                treeKeyFrom.initFromValue( i, exactPredicate.value(), NEUTRAL );
                treeKeyTo.initFromValue( i, exactPredicate.value(), NEUTRAL );
                break;
            case RANGE:
                if ( isGeometryRangeQuery( predicate ) )
                {
                    // Use the supplied SpaceFillingCurve range instead of the GeometryRangePredicate because at the time of calling this method
                    // the original geometry range have been split up into multiple sub-ranges and this invocation is for one of those sub-ranges.
                    // We can not take query inclusion / exclusion into consideration here because then we risk missing border values. Always use
                    // Inclusion.LOW / HIGH respectively and filter out points later on.
                    treeKeyFrom.stateSlot( i ).writePointDerived( crs, range.min, LOW );
                    treeKeyTo.stateSlot( i ).writePointDerived( crs, range.max + 1, HIGH );
                    needsFiltering = true;
                }
                else if ( predicate.valueGroup() == ValueGroup.GEOMETRY_ARRAY )
                {
                    treeKeyFrom.initValueAsLowest( i, ValueGroup.GEOMETRY_ARRAY );
                    treeKeyTo.initValueAsHighest( i, ValueGroup.GEOMETRY_ARRAY );
                    needsFiltering = true;
                }
                else
                {
                    RangePredicate<?> rangePredicate = (RangePredicate<?>) predicate;
                    initFromForRange( i, rangePredicate, treeKeyFrom );
                    initToForRange( i, rangePredicate, treeKeyTo );
                }
                break;
            case STRING_PREFIX:
                StringPrefixPredicate prefixPredicate = (StringPrefixPredicate) predicate;
                treeKeyFrom.stateSlot( i ).initAsPrefixLow( prefixPredicate.prefix() );
                treeKeyTo.stateSlot( i ).initAsPrefixHigh( prefixPredicate.prefix() );
                break;
            case STRING_SUFFIX:
            case STRING_CONTAINS:
                treeKeyFrom.initValueAsLowest( i, ValueGroup.TEXT );
                treeKeyTo.initValueAsHighest( i, ValueGroup.TEXT );
                needsFiltering = true;
                break;
            default:
                throw new IllegalArgumentException( "IndexQuery of type " + predicate.type() + " is not supported." );
            }
        }
        return needsFiltering;
    }

    // all slots are required to be initialized such that the keys can be copied when scanning in parallel
    private static boolean isAllQuery( PropertyIndexQuery[] predicates )
    {
        return predicates.length == 1 && predicates[0].type() == IndexQueryType.ALL_ENTRIES;
    }

    private static void initializeAllSlotsForFullRange( BtreeKey treeKeyFrom, BtreeKey treeKeyTo )
    {
        assert treeKeyFrom.numberOfStateSlots() == treeKeyTo.numberOfStateSlots();
        for ( int i = 0; i < treeKeyFrom.numberOfStateSlots(); i++ )
        {
            treeKeyFrom.initValueAsLowest( i, ValueGroup.UNKNOWN );
            treeKeyTo.initValueAsHighest( i, ValueGroup.UNKNOWN );
        }
    }

    @Override
    boolean initializeRangeForQuery( BtreeKey treeKeyFrom, BtreeKey treeKeyTo, PropertyIndexQuery[] query )
    {
        return initializeRangeForGeometrySubQuery( treeKeyFrom, treeKeyTo, query, null, null );
    }

    private static void initFromForRange( int stateSlot, RangePredicate<?> rangePredicate, BtreeKey treeKeyFrom )
    {
        Value fromValue = rangePredicate.fromValue();
        if ( fromValue == Values.NO_VALUE )
        {
            treeKeyFrom.initValueAsLowest( stateSlot, rangePredicate.valueGroup() );
        }
        else
        {
            treeKeyFrom.initFromValue( stateSlot, fromValue, fromInclusion( rangePredicate ) );
            treeKeyFrom.setCompareId( true );
        }
    }

    private static void initToForRange( int stateSlot, RangePredicate<?> rangePredicate, BtreeKey treeKeyTo )
    {
        Value toValue = rangePredicate.toValue();
        if ( toValue == Values.NO_VALUE )
        {
            treeKeyTo.initValueAsHighest( stateSlot, rangePredicate.valueGroup() );
        }
        else
        {
            treeKeyTo.initFromValue( stateSlot, toValue, toInclusion( rangePredicate ) );
            treeKeyTo.setCompareId( true );
        }
    }

    private static NativeIndexKey.Inclusion fromInclusion( RangePredicate<?> rangePredicate )
    {
        return rangePredicate.fromInclusive() ? LOW : HIGH;
    }

    private static NativeIndexKey.Inclusion toInclusion( RangePredicate<?> rangePredicate )
    {
        return rangePredicate.toInclusive() ? HIGH : LOW;
    }

    private static PropertyIndexQuery.GeometryRangePredicate getGeometryRangePredicateIfAny( PropertyIndexQuery[] predicates )
    {
        for ( PropertyIndexQuery predicate : predicates )
        {
            if ( isGeometryRangeQuery( predicate ) )
            {
                return (PropertyIndexQuery.GeometryRangePredicate) predicate;
            }
        }
        return null;
    }

    private static boolean isGeometryRangeQuery( PropertyIndexQuery predicate )
    {
        return predicate.type() == IndexQueryType.RANGE && predicate.valueGroup() == ValueGroup.GEOMETRY;
    }
}
