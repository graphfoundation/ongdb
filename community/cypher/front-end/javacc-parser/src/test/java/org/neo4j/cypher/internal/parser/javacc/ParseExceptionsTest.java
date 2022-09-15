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
package org.neo4j.cypher.internal.parser.javacc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ParseExceptionsTest
{
    @Test
    void removeSingleIdentifierToken()
    {
        int[][] expectedTokenSequence = {{CypherConstants.IDENTIFIER, CypherConstants.ACCESS}};
        Assertions.assertEquals( ParseExceptions.expected( expectedTokenSequence, CypherConstants.tokenImage ), Arrays.asList( "an identifier" ) );
    }

    @Test
    void removeSingleIdentifierTokenWithParameter()
    {
        int[][] expectedTokenSequence = {{CypherConstants.IDENTIFIER, CypherConstants.ACCESS, CypherConstants.DOLLAR}};
        Assertions
                .assertEquals( ParseExceptions.expected( expectedTokenSequence, CypherConstants.tokenImage ), Arrays.asList( "a parameter", "an identifier" ) );
    }

    @Test
    void keepDoubleIdentifierToken()
    {
        int[][] expectedTokenSequence = {{CypherConstants.IDENTIFIER, CypherConstants.ACCESS}, {CypherConstants.ACCESS}};
        Assertions
                .assertEquals( ParseExceptions.expected( expectedTokenSequence, CypherConstants.tokenImage ), Arrays.asList( "\"ACCESS\"", "an identifier" ) );
    }

    @Test
    void removeSingleIdentifierTokenInExpression()
    {
        int[][] expectedTokenSequence =
                {{CypherConstants.IDENTIFIER, CypherConstants.PLUS}, {CypherConstants.ACCESS, CypherConstants.UNSIGNED_DECIMAL_INTEGER}};
        Assertions.assertEquals( ParseExceptions.expected( expectedTokenSequence, CypherConstants.tokenImage ), Arrays.asList( "an expression" ) );
    }

    @Test
    void removeReduceToDoubleIdentifierTokenInExpression()
    {
        int[][] expectedTokenSequence = {{CypherConstants.IDENTIFIER, CypherConstants.PLUS, CypherConstants.DOLLAR},
                                         {CypherConstants.PLUS, CypherConstants.UNSIGNED_DECIMAL_INTEGER}};
        Assertions.assertEquals( ParseExceptions.expected( expectedTokenSequence, CypherConstants.tokenImage ), Arrays.asList( "\"+\"", "an expression" ) );
    }

    @Test
    void twoExpressions()
    {
        int[][] expectedTokenSequence = {{CypherConstants.IDENTIFIER, CypherConstants.PLUS}, {CypherConstants.IDENTIFIER, CypherConstants.PLUS}};
        Assertions.assertEquals( ParseExceptions.expected( expectedTokenSequence, CypherConstants.tokenImage ), Arrays.asList( "an expression" ) );
    }
}
