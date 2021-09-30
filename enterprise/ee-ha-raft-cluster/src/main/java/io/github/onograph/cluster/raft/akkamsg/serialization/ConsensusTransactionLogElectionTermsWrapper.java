package io.github.onograph.cluster.raft.akkamsg.serialization;


public class ConsensusTransactionLogElectionTermsWrapper {


  private final long[] lgTerArray;

  ConsensusTransactionLogElectionTermsWrapper(long[] _lgTerArray) {
    this.lgTerArray = _lgTerArray;
  }


  public long[] getLgTerArray() {
    return this.lgTerArray;
  }
}
