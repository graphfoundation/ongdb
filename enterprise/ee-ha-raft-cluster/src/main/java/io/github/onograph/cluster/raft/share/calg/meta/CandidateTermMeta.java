package io.github.onograph.cluster.raft.share.calg.meta;

import java.io.IOException;
import java.util.Objects;
import org.neo4j.io.fs.ReadableChannel;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.io.marshal.SafeStateMarshal;


public class CandidateTermMeta {


  private volatile long lgT;

  public CandidateTermMeta() {
  }

  private CandidateTermMeta(long _lgTer) {
    this.lgT = _lgTer;
  }


  private void _faliiad(long _lgNt) {
    if (_lgNt < this.lgT) {

      throw new IllegalArgumentException("*** Error:  4ef47053-cb68-4c6a-b400-7837b057e7d6");
    }
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      CandidateTermMeta _stCandidateTermMeta = (CandidateTermMeta) obj;
      return this.lgT == _stCandidateTermMeta.lgT;
    } else {
      return false;
    }
  }


  public long getLgT() {
    return this.lgT;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.lgT);
  }


  public boolean isUpa(long _lgTn) {
    this._faliiad(_lgTn);

    boolean _isCagd = this.lgT != _lgTn;
    this.lgT = _lgTn;
    return _isCagd;
  }


  public static class MarshalChannelImplCMS extends SafeStateMarshal<CandidateTermMeta> {


    public static final CandidateTermMeta.MarshalChannelImplCMS IT = new CandidateTermMeta.MarshalChannelImplCMS();

    private MarshalChannelImplCMS() {
    }

    @Override
    public void marshal(CandidateTermMeta _stCandidateTermMeta, WritableChannel _writableChannel)
        throws IOException {
      _writableChannel.putLong(_stCandidateTermMeta.getLgT());
    }

    @Override
    public long ordinal(CandidateTermMeta _saeCandidateTermMeta) {
      return _saeCandidateTermMeta.getLgT();
    }

    @Override
    public CandidateTermMeta startState() {
      return new CandidateTermMeta();
    }

    @Override
    protected CandidateTermMeta unmarshal0(ReadableChannel _readableChannel) throws IOException {
      return new CandidateTermMeta(_readableChannel.getLong());
    }


  }
}
