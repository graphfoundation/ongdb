package io.github.onograph.dbms.serverproc;

import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMeta;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.identity.ServerId;


class ServerEnvWrapper {


  private final SocketAddress abSocketAddress;


  private final SocketAddress acSocketAddress;


  private final ServerId serverId;


  private ServerEnvWrapper(SocketAddress _abSocketAddress, SocketAddress _acSocketAddress,
      ServerId _serverId) {
    this.abSocketAddress = _abSocketAddress;
    this.acSocketAddress = _acSocketAddress;
    this.serverId = _serverId;
  }


  static ServerEnvWrapper loaServerEnvWrapper(SocketAddress _abSocketAddress, ServerId _serverId) {
    return new ServerEnvWrapper(_abSocketAddress, null, _serverId);
  }


  static ServerEnvWrapper reoServerEnvWrapper(GdbDiscoveryMeta _iGdbDiscoveryMeta,
      ServerId _serverId) {
    return new ServerEnvWrapper(_iGdbDiscoveryMeta.botadsSocketAddress(),
        _iGdbDiscoveryMeta.cacpsrrSocketAddress(), _serverId);
  }


  public SocketAddress getAbSocketAddress() {
    return this.abSocketAddress;
  }


  public SocketAddress getAcSocketAddress() {
    return this.acSocketAddress;
  }


  public ServerId getServerId() {
    return this.serverId;
  }
}
