/**
 * See https://github.com/neo4j/neo4j/blob/3.2/enterprise/server-enterprise/src/main/java/org/neo4j/server/enterprise/EnterpriseEntryPoint.java
 */

package org.neo4j.server.enterprise;

import org.neo4j.server.BlockingBootstrapper;
import org.neo4j.server.Bootstrapper;
import org.neo4j.server.ServerBootstrapper;

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
