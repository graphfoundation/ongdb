package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper;
import java.net.SocketAddress;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class DefaultIncomingEventServiceLog implements IncomingEventService {


  private final Log log;

  public DefaultIncomingEventServiceLog(LogProvider _logProvider) {
    this.log = _logProvider.getLog(this.getClass());
  }

  @Override
  public void onccpromsForSoAb(AbstractCatchupManagementMessageWrapper m,
      SocketAddress _arSocketAddress) {

  }

  @Override
  public void onotrmsgForSoOb(Object m, SocketAddress _arSocketAddress) {

  }
}
