package io.github.onograph.cluster.raft.module.dprot.impl.structure;

import io.github.onograph.cluster.raft.module.dprot.GdbDiscoveryMetaCoreImpl;
import java.util.Objects;
import org.neo4j.dbms.identity.ServerId;


public class GdbDiscoveryMetaCoreWrapper {


  private final GdbDiscoveryMetaCoreImpl iscGdbDiscoveryMetaCoreImpl;


  private final ServerId serverId;


  public GdbDiscoveryMetaCoreWrapper(GdbDiscoveryMetaCoreImpl _iscGdbDiscoveryMetaCoreImpl,
      ServerId _serverId) {
    this.iscGdbDiscoveryMetaCoreImpl = _iscGdbDiscoveryMetaCoreImpl;
    this.serverId = _serverId;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      GdbDiscoveryMetaCoreWrapper _thaGdbDiscoveryMetaCoreWrapper = (GdbDiscoveryMetaCoreWrapper) obj;
      return Objects.equals(this.serverId, _thaGdbDiscoveryMetaCoreWrapper.serverId) &&
          Objects.equals(this.iscGdbDiscoveryMetaCoreImpl,
              _thaGdbDiscoveryMetaCoreWrapper.iscGdbDiscoveryMetaCoreImpl);
    } else {
      return false;
    }
  }


  public GdbDiscoveryMetaCoreImpl getIscGdbDiscoveryMetaCoreImpl() {
    return this.iscGdbDiscoveryMetaCoreImpl;
  }


  public ServerId getServerId() {
    return this.serverId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.serverId, this.iscGdbDiscoveryMetaCoreImpl);
  }


}
