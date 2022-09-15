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
package org.neo4j.cypher.operations;

import java.util.HashMap;
import java.util.Map;

import org.neo4j.cypher.internal.runtime.DbAccess;
import org.neo4j.cypher.internal.runtime.ExpressionCursors;
import org.neo4j.cypher.internal.runtime.makeValueNeoSafe;
import org.neo4j.exceptions.CypherTypeException;
import org.neo4j.internal.kernel.api.NodeCursor;
import org.neo4j.internal.kernel.api.PropertyCursor;
import org.neo4j.internal.kernel.api.RelationshipScanCursor;
import org.neo4j.internal.kernel.api.procs.Neo4jTypes;
import org.neo4j.values.AnyValue;
import org.neo4j.values.SequenceValue;
import org.neo4j.values.ValueMapper;
import org.neo4j.values.storable.ArrayValue;
import org.neo4j.values.storable.BooleanValue;
import org.neo4j.values.storable.DateTimeValue;
import org.neo4j.values.storable.DateValue;
import org.neo4j.values.storable.DurationValue;
import org.neo4j.values.storable.FloatingPointValue;
import org.neo4j.values.storable.IntegralValue;
import org.neo4j.values.storable.LocalDateTimeValue;
import org.neo4j.values.storable.LocalTimeValue;
import org.neo4j.values.storable.NumberValue;
import org.neo4j.values.storable.PointValue;
import org.neo4j.values.storable.TextValue;
import org.neo4j.values.storable.TimeValue;
import org.neo4j.values.storable.Value;
import org.neo4j.values.storable.Values;
import org.neo4j.values.virtual.ListValue;
import org.neo4j.values.virtual.ListValueBuilder;
import org.neo4j.values.virtual.MapValue;
import org.neo4j.values.virtual.VirtualNodeValue;
import org.neo4j.values.virtual.VirtualPathValue;
import org.neo4j.values.virtual.VirtualRelationshipValue;
import org.neo4j.values.virtual.VirtualValues;

import static java.lang.String.format;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTAny;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTBoolean;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTDate;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTDateTime;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTDuration;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTFloat;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTGeometry;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTInteger;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTLocalDateTime;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTLocalTime;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTMap;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTNode;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTNumber;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTPath;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTPoint;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTRelationship;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTString;
import static org.neo4j.internal.kernel.api.procs.Neo4jTypes.NTTime;
import static org.neo4j.values.SequenceValue.IterationPreference.RANDOM_ACCESS;
import static org.neo4j.values.storable.Values.NO_VALUE;

@SuppressWarnings( {"WeakerAccess"} )
public final class CypherCoercions
{
    private CypherCoercions()
    {
        throw new UnsupportedOperationException( "do not instantiate" );
    }

    /**
     * This indirection is here because it is really inconvenient to generate code for calling object methods in scala
     * from scala because it hides the generated classes.
     *
     * TODO: makeValueNeoSafe is not fast, rewrite it here and use this method instead.
     */
    public static Value asStorableValue( AnyValue value )
    {
        return makeValueNeoSafe.apply( value );
    }

    public static TextValue asTextValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof TextValue) )
        {
            throw cantCoerce( value, "String" );
        }
        return (TextValue) value;
    }

    public static VirtualNodeValue asNodeValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof VirtualNodeValue) )
        {
            throw cantCoerce( value, "Node" );
        }
        return (VirtualNodeValue) value;
    }

    public static VirtualRelationshipValue asRelationshipValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof VirtualRelationshipValue) )
        {
            throw cantCoerce( value, "Relationship" );
        }
        return (VirtualRelationshipValue) value;
    }

    public static VirtualPathValue asPathValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof VirtualPathValue) )
        {
            throw cantCoerce( value, "Path" );
        }
        return (VirtualPathValue) value;
    }

    public static IntegralValue asIntegralValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof NumberValue) )
        {
            throw cantCoerce( value, "Integer" );
        }
        return Values.longValue( ((NumberValue) value).longValue() );
    }

    public static FloatingPointValue asFloatingPointValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof NumberValue) )
        {
            throw cantCoerce( value, "Float" );
        }
        return Values.doubleValue( ((NumberValue) value).doubleValue() );
    }

    public static BooleanValue asBooleanValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof BooleanValue) )
        {
            throw cantCoerce( value, "Boolean" );
        }
        return (BooleanValue) value;
    }

    public static NumberValue asNumberValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof NumberValue) )
        {
            throw cantCoerce( value, "Number" );
        }
        return (NumberValue) value;
    }

    public static PointValue asPointValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof PointValue) )
        {
            throw cantCoerce( value, "Point" );
        }
        return (PointValue) value;
    }

    public static DateValue asDateValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof DateValue) )
        {
            throw cantCoerce( value, "Date" );
        }
        return (DateValue) value;
    }

    public static TimeValue asTimeValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof TimeValue) )
        {
            throw cantCoerce( value, "Time" );
        }
        return (TimeValue) value;
    }

    public static LocalTimeValue asLocalTimeValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof LocalTimeValue) )
        {
            throw cantCoerce( value, "LocalTime" );
        }
        return (LocalTimeValue) value;
    }

    public static LocalDateTimeValue asLocalDateTimeValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof LocalDateTimeValue) )
        {
            throw cantCoerce( value, "LocalDateTime" );
        }
        return (LocalDateTimeValue) value;
    }

    public static DateTimeValue asDateTimeValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof DateTimeValue) )
        {
            throw cantCoerce( value, "DateTime" );
        }
        return (DateTimeValue) value;
    }

    public static DurationValue asDurationValue( AnyValue value )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( !(value instanceof DurationValue) )
        {
            throw cantCoerce( value, "Duration" );
        }
        return (DurationValue) value;
    }

    public static MapValue asMapValue( AnyValue value,
                                       DbAccess access,
                                       NodeCursor nodeCursor,
                                       RelationshipScanCursor relationshipCursor,
                                       PropertyCursor propertyCursor )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        if ( value instanceof MapValue )
        {
            return (MapValue) value;
        }
        else if ( value instanceof VirtualNodeValue )
        {
            return access.nodeAsMap( ((VirtualNodeValue) value).id(), nodeCursor, propertyCursor );
        }
        else if ( value instanceof VirtualRelationshipValue )
        {
            return access.relationshipAsMap( ((VirtualRelationshipValue) value).id(), relationshipCursor, propertyCursor );
        }
        else
        {
            throw cantCoerce( value, "Map" );
        }
    }

    public static ListValue asList( AnyValue value,
                                    Neo4jTypes.AnyType innerType,
                                    DbAccess access,
                                    ExpressionCursors cursors )
    {
        assert value != NO_VALUE : "NO_VALUE checks need to happen outside this call";
        return new ListCoercer().apply( value, innerType, access, cursors );
    }

    private static CypherTypeException cantCoerce( AnyValue value, String type )
    {
        return new CypherTypeException( format( "Can't coerce `%s` to %s", value, type ) );
    }

    private static class ListMapper implements ValueMapper<ListValue>
    {

        @Override
        public ListValue mapPath( VirtualPathValue value )
        {
            return null;
        }

        @Override
        public ListValue mapNode( VirtualNodeValue value )
        {
            return null;
        }

        @Override
        public ListValue mapRelationship( VirtualRelationshipValue value )
        {
            return null;
        }

        @Override
        public ListValue mapMap( MapValue value )
        {
            return null;
        }

        @Override
        public ListValue mapNoValue()
        {
            return null;
        }

        @Override
        public ListValue mapSequence( SequenceValue value )
        {
            return null;
        }

        @Override
        public ListValue mapText( TextValue value )
        {
            return null;
        }

        @Override
        public ListValue mapBoolean( BooleanValue value )
        {
            return null;
        }

        @Override
        public ListValue mapNumber( NumberValue value )
        {
            return null;
        }

        @Override
        public ListValue mapDateTime( DateTimeValue value )
        {
            return null;
        }

        @Override
        public ListValue mapLocalDateTime( LocalDateTimeValue value )
        {
            return null;
        }

        @Override
        public ListValue mapDate( DateValue value )
        {
            return null;
        }

        @Override
        public ListValue mapTime( TimeValue value )
        {
            return null;
        }

        @Override
        public ListValue mapLocalTime( LocalTimeValue value )
        {
            return null;
        }

        @Override
        public ListValue mapDuration( DurationValue value )
        {
            return null;
        }

        @Override
        public ListValue mapPoint( PointValue value )
        {
            return null;
        }
    }

    @FunctionalInterface
    interface Coercer
    {
        AnyValue apply( AnyValue value, Neo4jTypes.AnyType coerceTo, DbAccess access, ExpressionCursors cursors );
    }

    private static final Map<Class<? extends Neo4jTypes.AnyType>,Coercer> CONVERTERS = new HashMap<>();

    private static class ListCoercer implements Coercer
    {
        @Override
        public ListValue apply( AnyValue value, Neo4jTypes.AnyType innerType, DbAccess access, ExpressionCursors cursors )
        {
            //Fast route
            if ( innerType == NTAny )
            {
                return fastListConversion( value );
            }

            //slow route, recursively convert the list
            if ( !(value instanceof SequenceValue) )
            {
                throw cantCoerce( value, "List" );
            }
            SequenceValue listValue = (SequenceValue) value;
            Coercer innerCoercer = CONVERTERS.get( innerType.getClass() );
            Neo4jTypes.AnyType nextInner = nextInner( innerType );
            if ( listValue.iterationPreference() == RANDOM_ACCESS )
            {
                int length = listValue.length();
                ListValueBuilder builder = ListValueBuilder.newListBuilder( length );
                for ( int i = 0; i < length; i++ )
                {
                    AnyValue nextItem = listValue.value( i );
                    builder.add( nextItem == NO_VALUE ? NO_VALUE : innerCoercer.apply( nextItem, nextInner, access, cursors ) );
                }
                return builder.build();
            }
            else
            {
                ListValueBuilder builder = ListValueBuilder.newListBuilder();
                int i = 0;
                for ( AnyValue anyValue : listValue )
                {
                    AnyValue nextItem = listValue.value( i );
                    builder.add( nextItem == NO_VALUE ? NO_VALUE : innerCoercer.apply( anyValue, nextInner, access, cursors ) );
                }
                return builder.build();
            }
        }
    }

    private static Neo4jTypes.AnyType nextInner( Neo4jTypes.AnyType type )
    {
        if ( type instanceof Neo4jTypes.ListType )
        {
            return ((Neo4jTypes.ListType) type).innerType();
        }
        else
        {
            return type;
        }
    }

    private static ListValue fastListConversion( AnyValue value )
    {
        if ( value instanceof ListValue )
        {
            return (ListValue) value;
        }
        else if ( value instanceof ArrayValue )
        {
            return VirtualValues.fromArray( (ArrayValue) value );
        }
        else if ( value instanceof VirtualPathValue )
        {
            return ((VirtualPathValue) value).asList();
        }
        throw cantCoerce( value, "List" );
    }

    static
    {
        CONVERTERS.put( NTAny.getClass(), ( a, ignore1, ignore2, cursors ) -> a );
        CONVERTERS.put( NTString.getClass(), ( a, ignore1, ignore2, cursors ) -> asTextValue( a ) );
        CONVERTERS.put( NTNumber.getClass(), ( a, ignore1, ignore2, cursors ) -> asNumberValue( a ) );
        CONVERTERS.put( NTInteger.getClass(), ( a, ignore1, ignore2, cursors ) -> asIntegralValue( a ) );
        CONVERTERS.put( NTFloat.getClass(), ( a, ignore1, ignore2, cursors ) -> asFloatingPointValue( a ) );
        CONVERTERS.put( NTBoolean.getClass(), ( a, ignore1, ignore2, cursors ) -> asBooleanValue( a ) );
        CONVERTERS.put( NTMap.getClass(), ( a, ignore, c, cursors ) -> asMapValue( a,
                                                                                   c,
                                                                                   cursors.nodeCursor(),
                                                                                   cursors.relationshipScanCursor(),
                                                                                   cursors.propertyCursor() ) );
        CONVERTERS.put( NTNode.getClass(), ( a, ignore1, ignore2, cursors ) -> asNodeValue( a ) );
        CONVERTERS.put( NTRelationship.getClass(), ( a, ignore1, ignore2, cursors ) -> asRelationshipValue( a ) );
        CONVERTERS.put( NTPath.getClass(), ( a, ignore1, ignore2, cursors ) -> asPathValue( a ) );
        CONVERTERS.put( NTGeometry.getClass(), ( a, ignore1, ignore2, cursors ) -> asPointValue( a ) );
        CONVERTERS.put( NTPoint.getClass(), ( a, ignore1, ignore2, cursors ) -> asPointValue( a ) );
        CONVERTERS.put( NTDateTime.getClass(), ( a, ignore1, ignore2, cursors ) -> asDateTimeValue( a ) );
        CONVERTERS.put( NTLocalDateTime.getClass(), ( a, ignore1, ignore2, cursors ) -> asLocalDateTimeValue( a ) );
        CONVERTERS.put( NTDate.getClass(), ( a, ignore1, ignore2, cursors ) -> asDateValue( a ) );
        CONVERTERS.put( NTTime.getClass(), ( a, ignore1, ignore2, cursors ) -> asTimeValue( a ) );
        CONVERTERS.put( NTLocalTime.getClass(), ( a, ignore1, ignore2, cursors ) -> asLocalTimeValue( a ) );
        CONVERTERS.put( NTDuration.getClass(), ( a, ignore1, ignore2, cursors ) -> asDurationValue( a ) );
        CONVERTERS.put( Neo4jTypes.ListType.class, new ListCoercer() );
    }
}
