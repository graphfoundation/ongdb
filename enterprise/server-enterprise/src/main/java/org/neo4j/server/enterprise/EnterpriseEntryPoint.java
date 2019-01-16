/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * Modifications Copyright (c) 2018-2019 "GraphFoundation" [https://graphfoundation.org]
 *
 * The included source code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html)
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 */

package org.neo4j.server.enterprise;

import org.neo4j.server.BlockingBootstrapper;
import org.neo4j.server.Bootstrapper;
import org.neo4j.server.ServerBootstrapper;
// See https://github.com/neo4j/neo4j/blob/3.2/enterprise/server-enterprise/src/main/java/org/neo4j/server/enterprise/EnterpriseEntryPoint.java

public class EnterpriseEntryPoint
{
    private static Bootstrapper bootstrapper;

    /**
     *
     */
    private EnterpriseEntryPoint()
    {
    }

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        int status = ServerBootstrapper.start( new EnterpriseBootstrapper(), args );
        if ( status != 0 )
        {
            System.exit( status );
        }
    }

    /**
     * @param args
     */
    public static void start( String[] args )
    {
        bootstrapper = new BlockingBootstrapper( new EnterpriseBootstrapper() );
        System.exit( ServerBootstrapper.start( bootstrapper, args ) );
    }

    /**
     * @param args
     */
    public static void stop( String[] args )
    {
        if ( bootstrapper != null )
        {
            bootstrapper.stop();
        }
    }
}
