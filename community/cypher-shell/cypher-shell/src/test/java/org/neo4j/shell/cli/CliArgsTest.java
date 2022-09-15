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
package org.neo4j.shell.cli;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CliArgsTest
{
    private final CliArgs cliArgs = new CliArgs();

    @Test
    void setHost()
    {
        cliArgs.setHost( "foo", "bar" );
        assertEquals( "foo", cliArgs.getHost() );

        cliArgs.setHost( null, "bar" );
        assertEquals( "bar", cliArgs.getHost() );
    }

    @Test
    void setPort()
    {
        cliArgs.setPort( 999 );
        assertEquals( 999, cliArgs.getPort() );
    }

    @Test
    void setUsername()
    {
        cliArgs.setUsername( "foo", "bar" );
        assertEquals( "foo", cliArgs.getUsername() );

        cliArgs.setUsername( null, "bar" );
        assertEquals( "bar", cliArgs.getUsername() );
    }

    @Test
    void setPassword()
    {
        cliArgs.setPassword( "foo", "bar" );
        assertEquals( "foo", cliArgs.getPassword() );

        cliArgs.setPassword( null, "bar" );
        assertEquals( "bar", cliArgs.getPassword() );
    }

    @Test
    void setFailBehavior()
    {
        // default
        assertEquals( FailBehavior.FAIL_FAST, cliArgs.getFailBehavior() );

        cliArgs.setFailBehavior( FailBehavior.FAIL_AT_END );
        assertEquals( FailBehavior.FAIL_AT_END, cliArgs.getFailBehavior() );
    }

    @Test
    void getNumSampleRows()
    {
        assertEquals( 1000, CliArgs.DEFAULT_NUM_SAMPLE_ROWS );
        assertEquals( CliArgs.DEFAULT_NUM_SAMPLE_ROWS, cliArgs.getNumSampleRows() );

        cliArgs.setNumSampleRows( null );
        assertEquals( CliArgs.DEFAULT_NUM_SAMPLE_ROWS, cliArgs.getNumSampleRows() );

        cliArgs.setNumSampleRows( 0 );
        assertEquals( CliArgs.DEFAULT_NUM_SAMPLE_ROWS, cliArgs.getNumSampleRows() );

        cliArgs.setNumSampleRows( 120 );
        assertEquals( 120, cliArgs.getNumSampleRows() );
    }

    @Test
    void setFormat()
    {
        // default
        assertEquals( Format.AUTO, cliArgs.getFormat() );

        cliArgs.setFormat( Format.PLAIN );
        assertEquals( Format.PLAIN, cliArgs.getFormat() );

        cliArgs.setFormat( Format.VERBOSE );
        assertEquals( Format.VERBOSE, cliArgs.getFormat() );
    }

    @Test
    void setCypher()
    {
        // default
        assertFalse( cliArgs.getCypher().isPresent() );

        cliArgs.setCypher( "foo" );
        assertTrue( cliArgs.getCypher().isPresent() );
        assertEquals( "foo", cliArgs.getCypher().get() );

        cliArgs.setCypher( null );
        assertFalse( cliArgs.getCypher().isPresent() );
    }

    @Test
    void getParameters()
    {
        // Parameters are set only through the Action from the CliArgHelper, bypassing CliArgs
        // so setting them cannot be tested here.
        assertEquals( Collections.EMPTY_MAP, cliArgs.getParameters().allParameterValues() );
    }

    @Test
    void setInputFile()
    {
        cliArgs.setInputFilename( "foo" );
        assertEquals( "foo", cliArgs.getInputFilename() );
    }
}
