package io.github.onograph.cluster.raft.module.dprot;

import java.util.Map;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.DatabaseId;


public interface ClusterStructure<T extends GdbDiscoveryMeta> {


  DatabaseId daasidDatabaseId();


  Map<ServerId, T> sevsMap();
}
