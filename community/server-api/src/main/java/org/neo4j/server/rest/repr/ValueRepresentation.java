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
package org.neo4j.server.rest.repr;

import java.net.URI;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;

import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.spatial.Point;
import org.neo4j.internal.helpers.collection.IterableWrapper;
import org.neo4j.server.helpers.PropertyTypeDispatcher;

public class ValueRepresentation extends Representation
{
    private final Object value;

    private ValueRepresentation( RepresentationType type, Object value )
    {
        super( type );
        this.value = value;
    }

    @Override
    String serialize( RepresentationFormat format, URI baseUri )
    {
        final String result = format.serializeValue(type, value);
        format.complete();
        return result;
    }

    @Override
    void addTo( ListSerializer serializer )
    {
        serializer.writer.writeValue( type, value );
    }

    @Override
    void putTo( MappingSerializer serializer, String key )
    {
        serializer.writer.writeValue( type, key, value );
    }

    public static ValueRepresentation ofNull()
    {
        return new ValueRepresentation( RepresentationType.NULL, null );
    }

    public static ValueRepresentation string( String value )
    {
        return new ValueRepresentation( RepresentationType.STRING, value );
    }

    public static ValueRepresentation point( Point value )
    {
        return new ValueRepresentation( RepresentationType.POINT, value );
    }

    public static ValueRepresentation temporal( Temporal value )
    {
        return new ValueRepresentation( RepresentationType.TEMPORAL, value.toString() );
    }

    public static ValueRepresentation temporalAmount( TemporalAmount value )
    {
        return new ValueRepresentation( RepresentationType.TEMPORAL_AMOUNT, value.toString() );
    }

    @SuppressWarnings( "boxing" )
    public static ValueRepresentation number( int value )
    {
        return new ValueRepresentation( RepresentationType.INTEGER, value );
    }

    @SuppressWarnings( "boxing" )
    public static ValueRepresentation number( long value )
    {
        return new ValueRepresentation( RepresentationType.LONG, value );
    }

    @SuppressWarnings( "boxing" )
    public static ValueRepresentation number( double value )
    {
        return new ValueRepresentation( RepresentationType.DOUBLE, value );
    }

    public static ValueRepresentation bool( boolean value )
    {
        return new ValueRepresentation( RepresentationType.BOOLEAN, value );
    }

    public static ValueRepresentation relationshipType( RelationshipType type )
    {
        return new ValueRepresentation( RepresentationType.RELATIONSHIP_TYPE, type.name() );
    }

    public static ValueRepresentation uri( final String path )
    {
        return new ValueRepresentation( RepresentationType.URI, null )
        {
            @Override
            String serialize( RepresentationFormat format, URI baseUri )
            {
                return Serializer.joinBaseWithRelativePath( baseUri, path );
            }

            @Override
            void addTo( ListSerializer serializer )
            {
                serializer.addUri( path );
            }

            @Override
            void putTo( MappingSerializer serializer, String key )
            {
                serializer.putRelativeUri( key, path );
            }
        };
    }

    public static ValueRepresentation template( final String path )
    {
        return new ValueRepresentation( RepresentationType.TEMPLATE, null )
        {
            @Override
            String serialize( RepresentationFormat format, URI baseUri )
            {
                return Serializer.joinBaseWithRelativePath( baseUri, path );
            }

            @Override
            void addTo( ListSerializer serializer )
            {
                serializer.addUriTemplate( path );
            }

            @Override
            void putTo( MappingSerializer serializer, String key )
            {
                serializer.putRelativeUriTemplate( key, path );
            }
        };
    }

    static Representation property( Object property )
    {
        return PROPERTY_REPRESENTATION.dispatch( property, null );
    }

    private static final PropertyTypeDispatcher<Void,Representation> PROPERTY_REPRESENTATION =
            new PropertyTypeDispatcher<>()
            {
                @Override
                protected Representation dispatchBooleanProperty( boolean property, Void param )
                {
                    return bool( property );
                }

                @Override
                protected Representation dispatchPointProperty( Point point, Void param )
                {
                    return new ValueRepresentation( RepresentationType.POINT, point );
                }

                @Override
                protected Representation dispatchTemporalProperty( Temporal temporal, Void param )
                {
                    return new ValueRepresentation( RepresentationType.TEMPORAL, temporal );
                }

                @Override
                protected Representation dispatchTemporalAmountProperty( TemporalAmount temporalAmount, Void param )
                {
                    return new ValueRepresentation( RepresentationType.TEMPORAL_AMOUNT, temporalAmount );
                }

                @Override
                protected Representation dispatchByteProperty( byte property, Void param )
                {
                    return new ValueRepresentation( RepresentationType.BYTE, property );
                }

                @Override
                protected Representation dispatchCharacterProperty( char property, Void param )
                {
                    return new ValueRepresentation( RepresentationType.CHAR, property );
                }

                @Override
                protected Representation dispatchDoubleProperty( double property, Void param )
                {
                    return new ValueRepresentation( RepresentationType.DOUBLE, property );
                }

                @Override
                protected Representation dispatchFloatProperty( float property, Void param )
                {
                    return new ValueRepresentation( RepresentationType.FLOAT, property );
                }

                @Override
                protected Representation dispatchIntegerProperty( int property, Void param )
                {
                    return new ValueRepresentation( RepresentationType.INTEGER, property );
                }

                @Override
                protected Representation dispatchLongProperty( long property, Void param )
                {
                    return new ValueRepresentation( RepresentationType.LONG, property );
                }

                @Override
                protected Representation dispatchShortProperty( short property, Void param )
                {
                    return new ValueRepresentation( RepresentationType.SHORT, property );
                }

                @Override
                protected Representation dispatchStringProperty( String property, Void param )
                {
                    return string( property );
                }

                @Override
                protected Representation dispatchStringArrayProperty( String[] property, Void param )
                {
                    return ListRepresentation.strings( property );
                }

                @Override
                protected Representation dispatchPointArrayProperty( Point[] property, Void param )
                {
                    return ListRepresentation.points( property );
                }

                @Override
                protected Representation dispatchTemporalArrayProperty( Temporal[] property, Void param )
                {
                    return ListRepresentation.temporals( property );
                }

                @Override
                protected Representation dispatchTemporalAmountArrayProperty( TemporalAmount[] property, Void param )
                {
                    return ListRepresentation.temporalAmounts( property );
                }

                @SuppressWarnings( "unchecked" )
                private Iterable<Representation> dispatch( PropertyArray<?> array )
                {
                    return new IterableWrapper<>( (Iterable<Object>) array )
                    {
                        @Override
                        protected Representation underlyingObjectToObject( Object object )
                        {
                            return property( object );
                        }
                    };
                }

                @Override
                @SuppressWarnings( "boxing" )
                protected Representation dispatchByteArrayProperty( PropertyArray<Byte> array, Void param )
                {
                    return toListRepresentation( RepresentationType.BYTE, array );
                }

                @Override
                @SuppressWarnings( "boxing" )
                protected Representation dispatchShortArrayProperty( PropertyArray<Short> array, Void param )
                {
                    return toListRepresentation( RepresentationType.SHORT, array );
                }

                private ListRepresentation toListRepresentation( RepresentationType type, PropertyArray<?> array )
                {
                    return new ListRepresentation( type, dispatch( array ) );
                }

                @Override
                @SuppressWarnings( "boxing" )
                protected Representation dispatchCharacterArrayProperty( PropertyArray<Character> array, Void param )
                {
                    return toListRepresentation( RepresentationType.CHAR, array );
                }

                @Override
                @SuppressWarnings( "boxing" )
                protected Representation dispatchIntegerArrayProperty( PropertyArray<Integer> array, Void param )
                {
                    return toListRepresentation( RepresentationType.INTEGER, array );
                }

                @Override
                @SuppressWarnings( "boxing" )
                protected Representation dispatchLongArrayProperty( PropertyArray<Long> array, Void param )
                {
                    return toListRepresentation( RepresentationType.LONG, array );
                }

                @Override
                @SuppressWarnings( "boxing" )
                protected Representation dispatchFloatArrayProperty( PropertyArray<Float> array, Void param )
                {
                    return toListRepresentation( RepresentationType.FLOAT, array );
                }

                @Override
                @SuppressWarnings( "boxing" )
                protected Representation dispatchDoubleArrayProperty( PropertyArray<Double> array, Void param )
                {
                    return toListRepresentation( RepresentationType.DOUBLE, array );
                }

                @Override
                @SuppressWarnings( "boxing" )
                protected Representation dispatchBooleanArrayProperty( PropertyArray<Boolean> array, Void param )
                {
                    return toListRepresentation( RepresentationType.BOOLEAN, array );
                }
            };
}
