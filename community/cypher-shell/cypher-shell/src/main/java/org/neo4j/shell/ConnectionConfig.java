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

import org.neo4j.shell.cli.Encryption;

public class ConnectionConfig
{
    public static final String USERNAME_ENV_VAR = "ONGDB_USERNAME";
    public static final String PASSWORD_ENV_VAR = "ONGDB_PASSWORD";
    public static final String DATABASE_ENV_VAR = "ONGDB_DATABASE";

    private final String scheme;
    private final String host;
    private final int port;
    private final Encryption encryption;
    private String username;
    private String password;
    private String database;

    public ConnectionConfig( String scheme,
                             String host,
                             int port,
                             String username,
                             String password,
                             Encryption encryption,
                             String database )
    {
        this.host = host;
        this.port = port;
        this.username = fallbackToEnvVariable( username, USERNAME_ENV_VAR );
        this.password = fallbackToEnvVariable( password, PASSWORD_ENV_VAR );
        this.encryption = encryption;
        this.scheme = scheme;
        this.database = fallbackToEnvVariable( database, DATABASE_ENV_VAR );
    }

    /**
     * @return preferredValue if not empty, else the contents of the fallback environment variable
     */
    private static String fallbackToEnvVariable( String preferredValue, String fallbackEnvVar )
    {
        String result = System.getenv( fallbackEnvVar );
        if ( result == null || !preferredValue.isEmpty() )
        {
            result = preferredValue;
        }
        return result;
    }

    public String scheme()
    {
        return scheme;
    }

    public String host()
    {
        return host;
    }

    public int port()
    {
        return port;
    }

    public String username()
    {
        return username;
    }

    public String password()
    {
        return password;
    }

    public String driverUrl()
    {
        return String.format( "%s://%s:%d", scheme(), host(), port() );
    }

    public Encryption encryption()
    {
        return encryption;
    }

    public String database()
    {
        return database;
    }

    public void setUsername( String username )
    {
        this.username = username;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    public void setDatabase( String database )
    {
        this.database = fallbackToEnvVariable( database, DATABASE_ENV_VAR );
    }
}
