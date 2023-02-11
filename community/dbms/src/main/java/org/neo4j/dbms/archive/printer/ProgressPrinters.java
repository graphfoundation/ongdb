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
package org.neo4j.dbms.archive.printer;

import java.io.PrintStream;

import org.neo4j.logging.Log;

import static java.util.Objects.requireNonNull;

public class ProgressPrinters
{
    private ProgressPrinters()
    {
    }

    public static OutputProgressPrinter printStreamPrinter( PrintStream printStream )
    {
        requireNonNull( printStream );
        return new PrintStreamOutputProgressPrinter( printStream );
    }

    public static OutputProgressPrinter emptyPrinter()
    {
        return new EmptyOutputProgressPrinter();
    }

    public static OutputProgressPrinter logProviderPrinter( Log log )
    {
        requireNonNull( log );
        return new LogOutputProgressPrinter( log );
    }

    private static class EmptyOutputProgressPrinter implements OutputProgressPrinter
    {
        @Override
        public void print( String message )
        {
        }
    }

    private static class PrintStreamOutputProgressPrinter implements OutputProgressPrinter
    {
        private final PrintStream printStream;
        private final boolean interactive;

        PrintStreamOutputProgressPrinter( PrintStream printStream )
        {
            this.printStream = printStream;
            this.interactive = System.console() != null;
        }

        @Override
        public void print( String message )
        {
            printStream.print( lineSeparator() + message );
        }

        @Override
        public void complete()
        {
            printStream.print( System.lineSeparator() );
        }

        private char lineSeparator()
        {
            return interactive ? '\r' : '\n';
        }
    }

    private static class LogOutputProgressPrinter implements OutputProgressPrinter
    {
        private final Log log;

        LogOutputProgressPrinter( Log log )
        {
            this.log = log;
        }

        @Override
        public void print( String message )
        {
            log.info( message );
        }
    }
}
