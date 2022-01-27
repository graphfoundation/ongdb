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
package org.neo4j.shell.terminal;

import java.io.File;
import java.io.PrintStream;

import org.neo4j.shell.Historian;

/**
 * Fallback implementation of CypherShellTerminal that only supports writing.
 */
public class WriteOnlyCypherShellTerminal implements CypherShellTerminal
{
    private final PrintStream out;
    private final Writer writer;

    public WriteOnlyCypherShellTerminal( PrintStream out )
    {
        this.out = out;
        this.writer = new ReadOnlyWriter();
    }

    @Override
    public Reader read()
    {
        throw new UnsupportedOperationException( "Could not read input" );
    }

    @Override
    public Writer write()
    {
        return writer;
    }

    @Override
    public boolean isInteractive()
    {
        return false;
    }

    @Override
    public Historian getHistory()
    {
        return Historian.empty;
    }

    @Override
    public void setHistoryFile( File file )
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void bindUserInterruptHandler( UserInterruptHandler handler )
    {
        throw new UnsupportedOperationException();
    }

    private class ReadOnlyWriter implements Writer
    {
        @Override
        public void println( String line )
        {
            out.println( line );
        }
    }
}
