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

import java.util.Arrays;

import org.neo4j.index.internal.gbptree.GBPTree;
import org.neo4j.internal.kernel.api.IndexQueryConstraints;
import org.neo4j.internal.kernel.api.PropertyIndexQuery;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexQuery.IndexQueryType;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.ValueGroup;
import org.neo4j.values.storable.Values;

import static java.lang.String.format;
import static org.neo4j.kernel.impl.index.schema.NativeIndexKey.Inclusion.HIGH;
import static org.neo4j.kernel.impl.index.schema.NativeIndexKey.Inclusion.LOW;
import static org.neo4j.kernel.impl.index.schema.NativeIndexKey.Inclusion.NEUTRAL;

public class RangeIndexReader extends NativeIndexReader<RangeKey>
{
    RangeIndexReader( GBPTree<RangeKey,NullValue> tree,
            IndexLayout<RangeKey> layout, IndexDescriptor descriptor )
    {
        super( tree, layout, descriptor );
    }

    @Override
    void validateQuery( IndexQueryConstraints constraints, PropertyIndexQuery[] predicates )
    {
        validateNoUnsupportedPredicates( predicates );
        QueryValidator.validateOrder( RangeIndexProvider.CAPABILITY, constraints.order(), predicates );
        QueryValidator.validateCompositeQuery( predicates );
    }

    @Override
    boolean initializeRangeForQuery( RangeKey treeKeyFrom, RangeKey treeKeyTo, PropertyIndexQuery[] predicates )
    {
        if ( isAllQuery( predicates ) )
        {
            initializeAllSlotsForFullRange( treeKeyFrom, treeKeyTo );
            return false;
        }

        for ( int i = 0; i < predicates.length; i++ )
        {
            PropertyIndexQuery predicate = predicates[i];
            switch ( predicate.type() )
            {
            case EXISTS:
                treeKeyFrom.initValueAsLowest( i, ValueGroup.UNKNOWN );
                treeKeyTo.initValueAsHighest( i, ValueGroup.UNKNOWN );
                break;
            case EXACT:
                PropertyIndexQuery.ExactPredicate exactPredicate = (PropertyIndexQuery.ExactPredicate) predicate;
                treeKeyFrom.initFromValue( i, exactPredicate.value(), NEUTRAL );
                treeKeyTo.initFromValue( i, exactPredicate.value(), NEUTRAL );
                break;
            case RANGE:
                throwIfGeometryRangeQuery( predicates, predicate );

                PropertyIndexQuery.RangePredicate<?> rangePredicate = (PropertyIndexQuery.RangePredicate<?>) predicate;
                initFromForRange( i, rangePredicate, treeKeyFrom );
                initToForRange( i, rangePredicate, treeKeyTo );
                break;
            case STRING_PREFIX:
                PropertyIndexQuery.StringPrefixPredicate prefixPredicate = (PropertyIndexQuery.StringPrefixPredicate) predicate;
                treeKeyFrom.stateSlot( i ).initAsPrefixLow( prefixPredicate.prefix() );
                treeKeyTo.stateSlot( i ).initAsPrefixHigh( prefixPredicate.prefix() );
                break;
            default:
                throw new IllegalArgumentException( "IndexQuery of type " + predicate.type() + " is not supported." );
            }
        }
        return false;
    }

    // all slots are required to be initialized such that the keys can be copied when scanning in parallel
    private static boolean isAllQuery( PropertyIndexQuery[] predicates )
    {
        return predicates.length == 1 && predicates[0].type() == IndexQueryType.ALL_ENTRIES;
    }

    private static void initializeAllSlotsForFullRange( RangeKey treeKeyFrom, RangeKey treeKeyTo )
    {
        assert treeKeyFrom.numberOfStateSlots() == treeKeyTo.numberOfStateSlots();
        for ( int i = 0; i < treeKeyFrom.numberOfStateSlots(); i++ )
        {
            treeKeyFrom.initValueAsLowest( i, ValueGroup.UNKNOWN );
            treeKeyTo.initValueAsHighest( i, ValueGroup.UNKNOWN );
        }
    }

    private static void initFromForRange( int stateSlot, PropertyIndexQuery.RangePredicate<?> rangePredicate, RangeKey treeKeyFrom )
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

    private static void initToForRange( int stateSlot, PropertyIndexQuery.RangePredicate<?> rangePredicate, RangeKey treeKeyTo )
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

    private static NativeIndexKey.Inclusion fromInclusion( PropertyIndexQuery.RangePredicate<?> rangePredicate )
    {
        return rangePredicate.fromInclusive() ? LOW : HIGH;
    }

    private static NativeIndexKey.Inclusion toInclusion( PropertyIndexQuery.RangePredicate<?> rangePredicate )
    {
        return rangePredicate.toInclusive() ? HIGH : LOW;
    }

    private static void validateNoUnsupportedPredicates( PropertyIndexQuery[] predicates )
    {
        for ( PropertyIndexQuery predicate : predicates )
        {
            throwIfGeometryRangeQuery( predicates, predicate );
            throwIfStringSuffixOrContains( predicates, predicate );
        }
    }

    private static void throwIfGeometryRangeQuery( PropertyIndexQuery[] predicates, PropertyIndexQuery predicate )
    {
        if ( predicate.type() == IndexQueryType.RANGE && predicate.valueGroup() == ValueGroup.GEOMETRY )
        {
            throw new IllegalArgumentException( format( "Tried to query index with illegal query. Geometry range predicate is not allowed " +
                                                "for RANGE index. Query was: %s ", Arrays.toString( predicates ) ) );
        }
    }

    private static void throwIfStringSuffixOrContains( PropertyIndexQuery[] predicates, PropertyIndexQuery predicate )
    {
        IndexQueryType type = predicate.type();
        if ( type == IndexQueryType.STRING_SUFFIX || type == IndexQueryType.STRING_CONTAINS )
        {
            throw new IllegalArgumentException( format( "Tried to query index with illegal query. %s predicate is not allowed " +
                                                        "for RANGE index. Query was: %s ", type, Arrays.toString( predicates ) ) );
        }
    }
}
