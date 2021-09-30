package io.github.onograph.cluster.raft.module.dprot;

import java.util.Set;
import org.neo4j.kernel.database.DatabaseId;


public interface GdbDiscoveryMeta extends CatchupSocketAddressProvider, DiscoveryAddressesProvider,
    NodeGroupIdentifiersProvider {


  Set<DatabaseId> stedaiSet();
}
