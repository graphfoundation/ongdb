/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.dbms;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * See community/neo4j/src/main/java/org/neo4j/dbms/
 */
public enum EnterpriseOperatorState implements OperatorState
{
    STOPPED( "offline", 100 ),
    STORE_COPYING( "store copying", 200 ),
    STARTED( "online", 300 ),
    DROPPED( "dropped", 0 ),
    UNKNOWN( "unknown", 400 ),
    INITIAL( "initial", 500 );

    private final String description;
    private final int precedence;

    private EnterpriseOperatorState( String description, int precedence )
    {
        this.description = description;
        this.precedence = precedence;
    }

    static EnterpriseOperatorState minByPrecedence( EnterpriseOperatorState left, EnterpriseOperatorState right )
    {
        Comparator<EnterpriseOperatorState> precedenceCompare = Comparator.nullsLast( Comparator.comparingInt( EnterpriseOperatorState::precedence ) );
        return precedenceCompare.compare( left, right ) <= 0 ? left : right;
    }

    static <T> BinaryOperator<T> minByOperatorState( Function<T,EnterpriseOperatorState> toOperatorState )
    {
        return ( left, right ) ->
        {
            EnterpriseOperatorState leftState = toOperatorState.apply( left );
            EnterpriseOperatorState rightState = toOperatorState.apply( right );
            EnterpriseOperatorState min = minByPrecedence( leftState, rightState );
            return min == leftState ? left : right;
        };
    }

    public String description()
    {
        return this.description;
    }

    int precedence()
    {
        return this.precedence;
    }
}
