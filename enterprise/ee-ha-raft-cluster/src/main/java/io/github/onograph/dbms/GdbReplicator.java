package io.github.onograph.dbms;

import org.neo4j.kernel.database.NamedDatabaseId;


public interface GdbReplicator {


  io.github.onograph.dbms.GdbReplicator.FireEvents NO_EVX_DIPC = new io.github.onograph.dbms.GdbReplicator.FireEvents() {
    @Override
    public void fitrcct(long transIdx) {
    }

    @Override
    public void ftree(long transIdx) {
    }
  };


  io.github.onograph.dbms.GdbReplicator.FireEvents gedteetdaGdbReplicatorFireEvents(
      NamedDatabaseId _namedDatabaseId);


  void retlsrForNaGd(io.github.onograph.dbms.GdbReplicator.ListenEvents _listenEvents,
      NamedDatabaseId _namedDatabaseId);


  void unilnForNaGd(io.github.onograph.dbms.GdbReplicator.ListenEvents _listenEvents,
      NamedDatabaseId _namedDatabaseId);


  interface FireEvents {


    void fitrcct(long _lgV);


    void ftree(long _lgV);
  }


  interface ListenEvents {


    void strread(long _lgVa);


    void tranci(long _lgVa);
  }
}
