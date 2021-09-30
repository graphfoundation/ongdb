package io.github.onograph.cluster.raft.control.connect;

import io.github.onograph.config.EntProVer;
import java.util.List;
import java.util.Objects;
import org.neo4j.internal.helpers.collection.Pair;


public class ChangeComProRequestImpl implements HandshakeMessageService {


  static final int MSX_COD = 3;


  private final List<Pair<String, String>> listPmPair;


  private final String pType;


  private final EntProVer vrinEntProVer;


  public ChangeComProRequestImpl(List<Pair<String, String>> _listPmPair, String _strNpa,
      EntProVer _vpaEntProVer) {
    this.listPmPair = _listPmPair;
    this.pType = _strNpa;
    this.vrinEntProVer = _vpaEntProVer;
  }

  @Override
  public void dipcForSe(ServerComProMessageProcessor _hnlrServerComProMessageProcessor) {
    _hnlrServerComProMessageProcessor.hadForMu(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj != null && this.getClass() == obj.getClass()) {

      ChangeComProRequestImpl _thaChangeComProRequestImpl = (ChangeComProRequestImpl) obj;
      return Objects.equals(this.vrinEntProVer, _thaChangeComProRequestImpl.vrinEntProVer) &&
          Objects.equals(this.pType, _thaChangeComProRequestImpl.pType) &&
          Objects.equals(this.listPmPair, _thaChangeComProRequestImpl.listPmPair);
    } else {
      return false;
    }
  }


  public List<Pair<String, String>> getListPmPair() {
    return this.listPmPair;
  }


  public String getPType() {
    return this.pType;
  }


  public EntProVer getVrinEntProVer() {
    return this.vrinEntProVer;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.pType, this.vrinEntProVer, this.listPmPair);
  }


}
