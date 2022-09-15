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
package org.neo4j.shell.prettyprint;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.neo4j.driver.Value;
import org.neo4j.driver.internal.value.FloatValue;
import org.neo4j.driver.internal.value.StringValue;
import org.neo4j.driver.summary.Plan;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.neo4j.shell.prettyprint.OutputFormatter.NEWLINE;

class TablePlanFormatterTest
{
    private final TablePlanFormatter tablePlanFormatter = new TablePlanFormatter();

    @Test
    void withNoDetails()
    {
        Plan plan = mock( Plan.class );
        Map<String, Value> args = Collections.singletonMap( "EstimatedRows", new FloatValue( 55 ) );
        when( plan.arguments() ).thenReturn( args );
        when( plan.operatorType() ).thenReturn( "Projection" );

        assertThat( tablePlanFormatter.formatPlan( plan ), is( String.join( NEWLINE,
                                                                            "+-------------+----------------+",
                                                                            "| Operator    | Estimated Rows |",
                                                                            "+-------------+----------------+",
                                                                            "| +Projection |             55 |",
                                                                            "+-------------+----------------+", "" ) ) );
    }

    @Test
    void withEmptyDetails()
    {
        Plan plan = mock( Plan.class );
        Map<String, Value> args = new HashMap<>( 2 )
        {{
            put( "EstimatedRows", new FloatValue( 55 ) );
            put( "Details", new StringValue( "" ) );
        }};
        when( plan.arguments() ).thenReturn( args );
        when( plan.operatorType() ).thenReturn( "Projection" );

        assertThat( tablePlanFormatter.formatPlan( plan ), is( String.join( NEWLINE,
                                                                            "+-------------+---------+----------------+",
                                                                            "| Operator    | Details | Estimated Rows |",
                                                                            "+-------------+---------+----------------+",
                                                                            "| +Projection |         |             55 |",
                                                                            "+-------------+---------+----------------+", "" ) ) );
    }

    @Test
    void renderShortDetails()
    {
        Plan plan = mock( Plan.class );
        Map<String, Value> args = Collections.singletonMap( "Details", new StringValue( "x.prop AS prop" ) );
        when( plan.arguments() ).thenReturn( args );
        when( plan.operatorType() ).thenReturn( "Projection" );

        assertThat( tablePlanFormatter.formatPlan( plan ), is( String.join( NEWLINE,
                                                                            "+-------------+----------------+",
                                                                            "| Operator    | Details        |",
                                                                            "+-------------+----------------+",
                                                                            "| +Projection | x.prop AS prop |",
                                                                            "+-------------+----------------+", "" ) ) );
    }

    @Test
    void renderExactMaxLengthDetails()
    {
        Plan plan = mock( Plan.class );
        String details = stringOfLength( TablePlanFormatter.MAX_DETAILS_COLUMN_WIDTH );
        Map<String, Value> args = Collections.singletonMap( "Details", new StringValue( details ) );
        when( plan.arguments() ).thenReturn( args );
        when( plan.operatorType() ).thenReturn( "Projection" );

        assertThat( tablePlanFormatter.formatPlan( plan ), containsString( "| +Projection | " + details + " |" ) );
    }

    @Test
    void multiLineDetails()
    {
        Plan argumentPlan = mock( Plan.class );
        when( argumentPlan.arguments() ).thenReturn( Collections.emptyMap() );
        when( argumentPlan.operatorType() ).thenReturn( "Argument" );

        Plan childPlan = mock( Plan.class );
        Map<String, Value> args = Collections.singletonMap( "Details", new StringValue( stringOfLength( TablePlanFormatter.MAX_DETAILS_COLUMN_WIDTH + 5 ) ) );
        when( childPlan.arguments() ).thenReturn( args );
        when( childPlan.operatorType() ).thenReturn( "Expand" );
        doReturn( new ArrayList<Plan>()
        {{
            add( argumentPlan );
            add( argumentPlan );
        }} ).when( childPlan ).children();

        Plan plan = mock( Plan.class );
        String details = stringOfLength( TablePlanFormatter.MAX_DETAILS_COLUMN_WIDTH + 1 );
        args = Collections.singletonMap( "Details", new StringValue( details ) );
        when( plan.arguments() ).thenReturn( args );
        when( plan.operatorType() ).thenReturn( "Projection" );
        doReturn( new ArrayList<Plan>()
        {{
            add( childPlan );
            add( childPlan );
        }} ).when( plan ).children();

        assertThat( tablePlanFormatter.formatPlan( plan ), is( String.join(
                NEWLINE,
                "+---------------+------------------------------------------------------------------------------------------------------+",
                "| Operator      | Details                                                                                              |",
                "+---------------+------------------------------------------------------------------------------------------------------+",
                "| +Projection   | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |",
                "| |             | a                                                                                                    |",
                "| |\\            +------------------------------------------------------------------------------------------------------+",
                "| | +Expand     | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |",
                "| | |           | aaaaa                                                                                                |",
                "| | |\\          +------------------------------------------------------------------------------------------------------+",
                "| | | +Argument |                                                                                                      |",
                "| | |           +------------------------------------------------------------------------------------------------------+",
                "| | +Argument   |                                                                                                      |",
                "| |             +------------------------------------------------------------------------------------------------------+",
                "| +Expand       | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |",
                "| |             | aaaaa                                                                                                |",
                "| |\\            +------------------------------------------------------------------------------------------------------+",
                "| | +Argument   |                                                                                                      |",
                "| |             +------------------------------------------------------------------------------------------------------+",
                "| +Argument     |                                                                                                      |",
                "+---------------+------------------------------------------------------------------------------------------------------+",
                "" ) ) );
    }

    private static String stringOfLength( int length )
    {
        return "a".repeat( Math.max( 0, length ) );
    }
}
