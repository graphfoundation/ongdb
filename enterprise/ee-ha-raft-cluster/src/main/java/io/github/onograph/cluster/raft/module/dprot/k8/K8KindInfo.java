package io.github.onograph.cluster.raft.module.dprot.k8;


public class K8KindInfo extends K8Kind {


  private int iC;


  private String m;


  private String stat;


  private String strRao;


  public int getIC() {
    return this.iC;
  }


  public String getM() {
    return this.m;
  }


  public String getStat() {
    return this.stat;
  }


  public String getStrRao() {
    return this.strRao;
  }

  @Override
  public <T> T had(
      io.github.onograph.cluster.raft.module.dprot.k8.K8Kind.K8KindProcessor<T> _k8KindProcessorVstrT) {
    return _k8KindProcessorVstrT.vii(this);
  }


  public void sece(int _iCo) {
    this.iC = _iCo;
  }


  public void semseForSt(String m) {
    this.m = m;
  }


  public void sersForSt(String _strRao) {
    this.strRao = _strRao;
  }


  public void sestForSt(String stat) {
    this.stat = stat;
  }


}
