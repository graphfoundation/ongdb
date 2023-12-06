/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.kernel.impl.query;

import org.junit.Test;

import org.neo4j.values.storable.Values;
import org.neo4j.values.virtual.MapValue;
import org.neo4j.values.virtual.MapValueBuilder;

import static java.util.Collections.emptySet;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class QueryLogFormatterTest
{

    @Test
    public void testFormatMapValueProducesEmptyMap()
    {
        StringBuilder result = new StringBuilder();
        QueryLogFormatter.formatMapValue( result, MapValue.EMPTY, emptySet() );
        assertThat( result.toString(), equalTo( "{}" ) );
    }

    @Test
    public void testFormatMapValueProducesSingleKeyValuePair()
    {
        MapValueBuilder build = new MapValueBuilder();
        build.add( "zero", Values.ZERO_INT );

        StringBuilder result = new StringBuilder();
        QueryLogFormatter.formatMapValue( result, build.build(), emptySet() );
        assertThat( result.toString(), equalTo( "{zero: " + Values.ZERO_INT.prettyPrint() + "}" ) );
    }

    @Test
    public void testFormatMapValueProducesManyKeyValuePairs()
    {
        MapValueBuilder build = new MapValueBuilder();
        build.add( "min", Values.MIN_NUMBER );
        build.add( "max", Values.MAX_NUMBER );

        StringBuilder result = new StringBuilder();
        QueryLogFormatter.formatMapValue( result, build.build(), emptySet() );
        assertThat( result.toString(),
                    equalTo( "{" +
                                "min: " + Values.MIN_NUMBER.prettyPrint() + ", " +
                                "max: " + Values.MAX_NUMBER.prettyPrint() +
                             "}" ) );
    }
}
