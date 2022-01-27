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
package org.neo4j.values.storable;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.function.Function;

import org.neo4j.values.virtual.ListValue;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.values.storable.Values.stringArray;
import static org.neo4j.values.storable.Values.utf8Value;

class TextValueTest
{
    private static Collection<Function<String, TextValue>> functions()
    {
        return asList( Values::stringValue, s -> utf8Value( s.getBytes( StandardCharsets.UTF_8 ) ) );
    }

    @ParameterizedTest
    @MethodSource( "functions" )
    void replace( Function<String, TextValue> value )
    {
        assertThat( value.apply( "hello" ).replace( "l", "w" ) ).isEqualTo( value.apply( "hewwo" ) );
        assertThat( value.apply( "hello" ).replace( "ell", "ipp" ) ).isEqualTo( value.apply( "hippo" ) );
        assertThat( value.apply( "hello" ).replace( "a", "x" ) ).isEqualTo( value.apply( "hello" ) );
        assertThat( value.apply( "hello" ).replace( "e", "" ) ).isEqualTo( value.apply( "hllo" ) );
        assertThat( value.apply( "" ).replace( "", "⁻" ) ).isEqualTo( value.apply( "⁻" ) );
    }

    @ParameterizedTest
    @MethodSource( "functions" )
    void substring( Function<String, TextValue> value )
    {
        assertThat( value.apply( "hello" ).substring( 2, 5 ) ).isEqualTo( value.apply( "llo" ) );
        assertThat( value.apply( "hello" ).substring( 4, 5 ) ).isEqualTo( value.apply( "o" ) );
        assertThat( value.apply( "hello" ).substring( 1, 3 ) ).isEqualTo( value.apply( "ell" ) );
        assertThat( value.apply( "hello" ).substring( 8, 5 ) ).isEqualTo( StringValue.EMPTY );
        assertThat( value.apply( "0123456789" ).substring( 1 ) ).isEqualTo( value.apply( "123456789" ) );
        assertThat( value.apply( "0123456789" ).substring( 5 ) ).isEqualTo( value.apply( "56789" ) );
        assertThat( value.apply( "0123456789" ).substring( 15 ) ).isEqualTo( StringValue.EMPTY );
        assertThat( value.apply( "\uD83D\uDE21\uD83D\uDCA9\uD83D\uDC7B" ).substring( 1, 1 ) ).isEqualTo( value.apply( "\uD83D\uDCA9" ) );
        assertThat( value.apply( "\uD83D\uDE21\uD83D\uDCA9\uD83D\uDC7B" ).substring( 1, 2 ) ).isEqualTo( value.apply( "\uD83D\uDCA9\uD83D\uDC7B" ) );

        assertThrows( IndexOutOfBoundsException.class, () -> value.apply( "hello" ).substring( -4, 2 ) );
    }

    @ParameterizedTest
    @MethodSource( "functions" )
    void toLower( Function<String, TextValue> value )
    {
        assertThat( value.apply( "HELLO" ).toLower() ).isEqualTo( value.apply( "hello" ) );
        assertThat( value.apply( "Hello" ).toLower() ).isEqualTo( value.apply( "hello" ) );
        assertThat( value.apply( "hello" ).toLower() ).isEqualTo( value.apply( "hello" ) );
        assertThat( value.apply( "" ).toLower() ).isEqualTo( value.apply( "" ) );
    }

    @ParameterizedTest
    @MethodSource( "functions" )
    void toUpper( Function<String, TextValue> value )
    {
        assertThat( value.apply( "HELLO" ).toUpper() ).isEqualTo( value.apply( "HELLO" ) );
        assertThat( value.apply( "Hello" ).toUpper() ).isEqualTo( value.apply( "HELLO" ) );
        assertThat( value.apply( "hello" ).toUpper() ).isEqualTo( value.apply( "HELLO" ) );
        assertThat( value.apply( "" ).toUpper() ).isEqualTo( value.apply( "" ) );
    }

    @ParameterizedTest
    @MethodSource( "functions" )
    void ltrim( Function<String, TextValue> value )
    {
        assertThat( value.apply( "  HELLO" ).ltrim() ).isEqualTo( value.apply( "HELLO" ) );
        assertThat( value.apply( " Hello" ).ltrim() ).isEqualTo( value.apply( "Hello" ) );
        assertThat( value.apply( "  hello  " ).ltrim() ).isEqualTo( value.apply( "hello  " ) );
        assertThat( value.apply( "\u2009㺂࿝鋦毠\u2009" ).ltrim() ).isEqualTo( value.apply( "㺂࿝鋦毠\u2009" ) );
    }

    @ParameterizedTest
    @MethodSource( "functions" )
    void rtrim( Function<String, TextValue> value )
    {
        assertThat( value.apply( "HELLO  " ).rtrim() ).isEqualTo( value.apply( "HELLO" ) );
        assertThat( value.apply( "Hello  " ).rtrim() ).isEqualTo( value.apply( "Hello" ) );
        assertThat( value.apply( "  hello  " ).rtrim() ).isEqualTo( value.apply( "  hello" ) );
        assertThat( value.apply( "\u2009㺂࿝鋦毠\u2009" ).rtrim() ).isEqualTo( value.apply( "\u2009㺂࿝鋦毠" ) );
    }

    @ParameterizedTest
    @MethodSource( "functions" )
    void trim( Function<String, TextValue> value )
    {
        assertThat( value.apply( "  hello  " ).trim() ).isEqualTo( value.apply( "hello" ) );
        assertThat( value.apply( "  hello " ).trim() ).isEqualTo( value.apply( "hello" ) );
        assertThat( value.apply( "hello " ).trim() ).isEqualTo( value.apply( "hello" ) );
        assertThat( value.apply( "  hello" ).trim() ).isEqualTo( value.apply( "hello" ) );
        assertThat( value.apply( "\u2009㺂࿝鋦毠\u2009" ).trim() ).isEqualTo( value.apply( "㺂࿝鋦毠" ) );
    }

    @ParameterizedTest
    @MethodSource( "functions" )
    void reverse( Function<String, TextValue> value )
    {
        assertThat( value.apply( "Foo" ).reverse() ).isEqualTo( value.apply( "ooF" ) );
        assertThat( value.apply( "" ).reverse() ).isEqualTo( StringValue.EMPTY );
        assertThat( value.apply( " L" ).reverse() ).isEqualTo( value.apply( "L " ) );
        assertThat( value.apply( "\r\n" ).reverse() ).isEqualTo( value.apply( "\n\r" ) );
        assertThat( value.apply( "\uD801\uDC37" ).reverse() ).isEqualTo( value.apply( "\uD801\uDC37" ) );
        assertThat( value.apply( "This is literally a pile of crap \uD83D\uDCA9, it is fantastic" ).reverse() ).isEqualTo(
                value.apply( "citsatnaf si ti ,\uD83D\uDCA9 parc fo elip a yllaretil si sihT" ) );
        assertThat( value.apply( "\uD83D\uDE21\uD83D\uDCA9\uD83D\uDC7B" ).reverse() ).isEqualTo( value.apply( "\uD83D\uDC7B\uD83D\uDCA9\uD83D\uDE21" ) );
    }

    @ParameterizedTest
    @MethodSource( "functions" )
    void split( Function<String, TextValue> value )
    {
        assertThat( value.apply( "HELLO" ).split( "LL" ) ).isEqualTo( stringArray( "HE", "O" ) );
        assertThat( value.apply( "Separating,by,comma,is,a,common,use,case" ).split( "," ) ).isEqualTo(
                stringArray( "Separating", "by", "comma", "is", "a", "common", "use", "case" ) );
        assertThat( value.apply( "HELLO" ).split( "HELLO" ) ).isEqualTo( stringArray( "", "" ) );

        // splitting on empty separator
        ListValue helloSplitOnEmpty = value.apply( "HELLO" ).split( "" );
        assertThat( helloSplitOnEmpty ).isEqualTo( Values.stringArray( "H", "E", "L", "L", "O" ) );
        ArrayValue helloSplitOnEmptyStorable = helloSplitOnEmpty.toStorableArray();
        assertThat( helloSplitOnEmptyStorable ).isInstanceOf( StringArray.class ); // is not CharArray
        assertThat( helloSplitOnEmptyStorable.asObject() ).isEqualTo( new String[]{"H", "E", "L", "L", "O"} ); // is not char[]
    }

    @ParameterizedTest
    @MethodSource( "functions" )
    void isEmpty( Function<String, TextValue> value )
    {
        assertThat( value.apply( "" ).isEmpty() ).isTrue();
        assertThat( value.apply( "non-empty" ).isEmpty() ).isFalse();
        assertThat( value.apply( " " ).isEmpty() ).isFalse();
        assertThat( value.apply( "\u00A0" ).isEmpty() ).isFalse();
        assertThat( value.apply( "\u2009㺂࿝鋦毠\u2009" ).isEmpty() ).isFalse();
    }
}
