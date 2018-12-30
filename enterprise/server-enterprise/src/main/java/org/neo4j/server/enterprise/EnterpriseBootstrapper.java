/**
 * See https://github.com/neo4j/neo4j/blob/3.2/enterprise/server-enterprise/src/main/java/org/neo4j/server/enterprise/EnterpriseBootstrapper.java
 */

package org.neo4j.server.enterprise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nonnull;

import org.neo4j.causalclustering.core.CausalClusterConfigurationValidator;
import org.neo4j.configuration.HaConfigurationValidator;
import org.neo4j.graphdb.facade.GraphDatabaseDependencies;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.configuration.ConfigurationValidator;
import org.neo4j.server.CommunityBootstrapper;
import org.neo4j.server.NeoServer;
import org.neo4j.server.database.GraphFactory;

/**
 *
 */
public class EnterpriseBootstrapper extends CommunityBootstrapper
{
    /**
     *
     * @param config
     * @return
     */
    protected GraphFactory createGraphFactory( Config config )
    {
        return new OpenEnterpriseGraphFactory();
    }

    /**
     *
     * @param graphFactory
     * @param config
     * @param dependencies
     * @return
     */
    protected NeoServer createNeoServer( GraphFactory graphFactory, Config config, GraphDatabaseDependencies dependencies )
    {
        return new EnterpriseNeoServer( config, graphFactory, dependencies );
    }

    /**
     * @return
     */
    @Nonnull
    protected Collection<ConfigurationValidator> configurationValidators()
    {
        List<ConfigurationValidator> validators = new ArrayList( super.configurationValidators() );
        // validators.addAll( super.configurationValidators() );
        validators.add( new HaConfigurationValidator() );
        validators.add( new CausalClusterConfigurationValidator() );
        return validators;
    }
}
