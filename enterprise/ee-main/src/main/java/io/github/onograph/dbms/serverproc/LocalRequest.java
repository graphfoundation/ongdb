package io.github.onograph.dbms.serverproc;

import io.github.onograph.cluster.raft.module.cuprot.current.info.Meta;
import io.github.onograph.cluster.raft.module.cuprot.current.info.MetaService;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;
import org.neo4j.kernel.availability.UnavailableException;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;


class LocalRequest extends AbstractRequest {


  private final MetaService piMetaService;


  LocalRequest(Log _log, ServerId _mslServerId, NamedDatabaseId _namedDatabaseId,
      MetaService _piMetaService, SocketAddress _socketAddress, long transIdx) {
    super(transIdx, _log, _namedDatabaseId, _mslServerId, _socketAddress);
    this.piMetaService = _piMetaService;
  }

  @Override
  public Meta geioMeta(NamedDatabaseId _namedDatabaseId) throws UnavailableException {
    return this.piMetaService.geioMeta(_namedDatabaseId);
  }
}
