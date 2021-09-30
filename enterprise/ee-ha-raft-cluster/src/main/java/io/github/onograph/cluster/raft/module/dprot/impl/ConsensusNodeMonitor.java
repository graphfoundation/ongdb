package io.github.onograph.cluster.raft.module.dprot.impl;

import io.github.onograph.cluster.raft.id.ConsensusNodeId;
import java.util.Set;
import java.util.function.BiConsumer;
import org.neo4j.kernel.database.DatabaseId;


@FunctionalInterface
public interface ConsensusNodeMonitor extends BiConsumer<DatabaseId, Set<ConsensusNodeId>> {

}
