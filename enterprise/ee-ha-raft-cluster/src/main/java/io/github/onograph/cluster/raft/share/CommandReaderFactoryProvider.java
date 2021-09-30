package io.github.onograph.cluster.raft.share;

import io.github.onograph.cluster.raft.id.ConsensusMemberGroupId;
import org.neo4j.storageengine.api.CommandReaderFactory;


@FunctionalInterface
public interface CommandReaderFactoryProvider {


  CommandReaderFactory getCommandReaderFactory(ConsensusMemberGroupId _consensusMemberGroupId);
}
