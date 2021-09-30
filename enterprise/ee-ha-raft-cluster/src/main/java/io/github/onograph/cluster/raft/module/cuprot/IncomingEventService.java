package io.github.onograph.cluster.raft.module.cuprot;

import io.github.onograph.cluster.raft.akkamsg.AbstractCatchupManagementMessageWrapper;
import io.github.onograph.cluster.raft.module.cuprot.current.rtx.RequestTransactionSync;
import java.net.SocketAddress;


public interface IncomingEventService {


  IncomingEventService NOO_INCOMING_EVENT_SERVICE = new IncomingEventService() {
    @Override
    public void onccpromsForSoAb(AbstractCatchupManagementMessageWrapper m,
        SocketAddress _arSocketAddress) {
    }

    @Override
    public void onotrmsgForSoOb(Object m, SocketAddress _arSocketAddress) {
    }
  };


  void onccpromsForSoAb(
      AbstractCatchupManagementMessageWrapper _abstractCatchupManagementMessageWrapper,
      SocketAddress _socketAddress);


  void onotrmsgForSoOb(Object _obVa, SocketAddress _socketAddress);


  default void ontpurqForSoRe(SocketAddress _arSocketAddress, RequestTransactionSync m) {
    this.onccpromsForSoAb(m, _arSocketAddress);
  }
}
