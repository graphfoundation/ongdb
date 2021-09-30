package io.github.onograph.cluster.raft.share.calg.cle;

import java.io.IOException;
import org.neo4j.cursor.RawCursor;


public interface ConsensusLogEntryRawCursor extends RawCursor<ConsensusLogEntry, Exception> {


  static ConsensusLogEntryRawCursor emtConsensusLogEntryRawCursor() {
    return new ConsensusLogEntryRawCursor() {
      @Override
      public void close() {
      }

      @Override
      public ConsensusLogEntry get() {
        throw new IllegalStateException();
      }

      @Override
      public long ine() {
        return -1L;
      }

      @Override
      public boolean next() {
        return false;
      }
    };
  }

  @Override
  void close() throws IOException;


  long ine();

  @Override
  boolean next() throws IOException;
}
