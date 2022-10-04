/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.commandline.admin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Neo4jAdminUsageTest
{
    private Usage usageCmd;

    @Before
    public void setup()
    {
        usageCmd = new Usage( AdminTool.scriptName, CommandLocator.fromServiceLocator() );
    }

    @Test
    public void verifyUsageMatchesExpectedCommands()
    {
        final StringBuilder sb = new StringBuilder();
        usageCmd.print( s -> sb.append( s ).append( "\n" ) );

        assertEquals("usage: ongdb-admin <command>\n" +
                        "\n" +
                        "Manage your ONgDB instance.\n" +
                        "\n" +
                        "environment variables:\n" +
                        "    ONGDB_CONF    Path to directory which contains ongdb.conf.\n" +
                        "    ONGDB_DEBUG   Set to anything to enable debug output.\n" +
                        "    ONGDB_HOME    ONgDB home directory.\n" +
                        "    HEAP_SIZE     Set JVM maximum heap size during command execution.\n" +
                        "                  Takes a number and a unit, for example 512m.\n" +
                        "\n" +
                        "available commands:\n" +
                        "\n" +
                        "General\n" +
                        "    check-consistency\n" +
                        "        Check the consistency of a database.\n" +
                        "    import\n" +
                        "        Import from a collection of CSV files or a pre-3.0 database.\n" +
                        "    memrec\n" +
                        "        Print ONgDB heap and pagecache memory settings recommendations.\n" +
                        "    report\n" +
                        "        Produces a zip/tar of the most common information needed for remote assessments.\n" +
                        "    store-info\n" +
                        "        Prints information about an ONgDB database store.\n" +
                        "\n" +
                        "Authentication\n" +
                        "    set-default-admin\n" +
                        "        Sets the default admin user when no roles are present.\n" +
                        "    set-initial-password\n" +
                        "        Sets the initial password of the initial admin user ('ongdb').\n" +
                        "\n" +
                        "Clustering\n" +
                        "    unbind\n" +
                        "        Removes cluster state data for the specified database.\n" +
                        "\n" +
                        "Offline backup\n" +
                        "    dump\n" +
                        "        Dump a database into a single-file archive.\n" +
                        "    load\n" +
                        "        Load a database from an archive created with the dump command.\n" +
                        "\n" +
                        "Online backup\n" +
                        "    backup\n" +
                        "        Perform an online backup from a running ONgDB Enterprise server.\n" +
                        "    restore\n" +
                        "        Restore a backed up database.\n" +
                        "\n" +
                        "Use ongdb-admin help <command> for more details.\n",
                sb.toString() );
    }
}
