package org.neo4j.server.enterprise;

import org.neo4j.causalclustering.discovery.DiscoveryServiceFactorySelector;
import org.neo4j.causalclustering.discovery.SecureDiscoveryServiceFactory;
import org.neo4j.causalclustering.discovery.SecureHazelcastDiscoveryServiceFactory;

/**
 * In order to use the new SecureDiscoveryServiceFactory interface we created, we need to extend DiscoveryServiceFactorySelector.
 * The naming convention we are following is to append OpenEnterprise to the base class.
 */
public class OpenEnterpriseDiscoveryServiceFactorySelector extends DiscoveryServiceFactorySelector
{
    protected SecureDiscoveryServiceFactory select( DiscoveryImplementation middleware )
    {
        switch ( middleware )
        {
        case HAZELCAST:
            return new SecureHazelcastDiscoveryServiceFactory();
        // Add others in the future.
        default:
            throw new IllegalArgumentException(
                    "SecureDiscoveryServiceFactory middleware: " + middleware + " did not match any available options.  Should have been HAZELCAST" );
        }
    }
}
