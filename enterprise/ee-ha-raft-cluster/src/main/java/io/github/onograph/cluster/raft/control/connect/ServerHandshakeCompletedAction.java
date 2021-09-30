package io.github.onograph.cluster.raft.control.connect;

import org.neo4j.configuration.helpers.SocketAddress;


public interface ServerHandshakeCompletedAction {


  class Finished {


    public final SocketAddress adeidSocketAddress;

    public Finished(SocketAddress _avrieSocketAddress) {
      this.adeidSocketAddress = _avrieSocketAddress;
    }
  }


  class Started {


    public final SocketAddress adeidSocketAddress;


    public final ComProFamilyWrapper prtostkComProFamilyWrapper;

    public Started(SocketAddress _avrieSocketAddress, ComProFamilyWrapper _psComProFamilyWrapper) {
      this.adeidSocketAddress = _avrieSocketAddress;
      this.prtostkComProFamilyWrapper = _psComProFamilyWrapper;
    }
  }
}
