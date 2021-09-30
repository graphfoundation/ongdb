package io.github.onograph.dbms.serverproc;

import io.github.onograph.cluster.raft.module.cuprot.RemoteMetaService;
import io.github.onograph.cluster.raft.module.cuprot.current.info.Meta;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;


class RemoteRequest extends AbstractRequest {


  private final RemoteMetaService remoteMetaService;


  private final SocketAddress treSocketAddress;


  RemoteRequest(long _lgIts, Log _log, NamedDatabaseId _namedDatabaseId,
      RemoteMetaService remoteMetaService, ServerId _serverId, SocketAddress _socketAddress,
      SocketAddress _treSocketAddress) {
    super(_lgIts, _log, _namedDatabaseId, _serverId, _socketAddress);
    this.treSocketAddress = _treSocketAddress;
    this.remoteMetaService = remoteMetaService;
  }

  @Override
  public Meta geioMeta(NamedDatabaseId _namedDatabaseId) throws Exception {
    return this.remoteMetaService.geioMeta(_namedDatabaseId, this.treSocketAddress);
  }
}
