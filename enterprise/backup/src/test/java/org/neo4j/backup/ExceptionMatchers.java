/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
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
package org.neo4j.backup;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.format;

public class ExceptionMatchers
{
    public static TypeSafeMatcher<Throwable> exceptionContainsSuppressedThrowable( Throwable expectedSuppressed )
    {
        return new TypeSafeMatcher<Throwable>()
        {
            @Override
            protected boolean matchesSafely( Throwable item )
            {
                List<Throwable> suppress = Arrays.asList( item.getSuppressed() );
                return suppress.contains( expectedSuppressed );
            }

            @Override
            public void describeTo( Description description )
            {
                description.appendText( "contains suppressed exception " ).appendValue( expectedSuppressed );
            }

            @Override
            protected void describeMismatchSafely( Throwable item, Description mismatchDescription )
            {
                List<String> suppressedExceptionStrings = Stream
                        .of( item.getSuppressed() )
                        .map( ExceptionMatchers::exceptionWithMessageToString )
                        .collect( Collectors.toList() );
                mismatchDescription
                        .appendText( "exception " )
                        .appendValue( item )
                        .appendText( " with suppressed " )
                        .appendValueList( "[", ", ", "]", suppressedExceptionStrings )
                        .appendText( " does not contain " )
                        .appendValue( exceptionWithMessageToString( expectedSuppressed ) );
            }
        };
    }

    private static String exceptionWithMessageToString( Throwable throwable )
    {
        return format( "<%s:%s>", throwable.getClass(), throwable.getMessage() );
    }
}
