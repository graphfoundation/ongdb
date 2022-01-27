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
package org.neo4j.shell.cli;

import static org.neo4j.shell.ShellRunner.isInputInteractive;
import static org.neo4j.shell.ShellRunner.isOutputInteractive;

public enum Format
{
    // Will select depending based on STDOUT and STDIN redirection
    AUTO,
    // Intended for human consumption
    VERBOSE,
    // Intended for machine consumption (nothing except data is printed
    PLAIN;
    // TODO JSON, strictly intended for machine consumption with data formatted in JSON

    public static Format parse( String format )
    {
        if ( format.equalsIgnoreCase( PLAIN.name() ) )
        {
            return PLAIN;
        }
        else if ( format.equalsIgnoreCase( VERBOSE.name() ) )
        {
            return VERBOSE;
        }
        else
        {
            return isInputInteractive() && isOutputInteractive() ? VERBOSE : PLAIN;
        }
    }
}
