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
package org.neo4j.shell;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.neo4j.shell.exception.ParameterException;
import org.neo4j.shell.state.ParamValue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShellParameterMapTest
{
    private final ParameterMap parameterMap = new ShellParameterMap();

    @Test
    void newParamMapShouldBeEmpty()
    {
        assertTrue( parameterMap.allParameterValues().isEmpty() );
    }

    @Test
    void setParamShouldAddParamWithSpecialCharactersAndValue() throws ParameterException
    {
        Object result = parameterMap.setParameter( "`bo``b`", "99" );
        assertEquals( 99L, result );
        assertEquals( 99L, parameterMap.allParameterValues().get( "bo`b" ) );
    }

    @Test
    void setParamShouldAddParam() throws ParameterException
    {
        Object result = parameterMap.setParameter( "`bob`", "99" );
        assertEquals( 99L, result );
        assertEquals( 99L, parameterMap.allParameterValues().get( "bob" ) );
    }

    @Test
    void getUserInput() throws ParameterException
    {
        parameterMap.setParameter( "`bob`", "99" );
        assertEquals( new ParamValue( "99", 99L ), parameterMap.getAllAsUserInput().get( "bob" ) );
    }
}
