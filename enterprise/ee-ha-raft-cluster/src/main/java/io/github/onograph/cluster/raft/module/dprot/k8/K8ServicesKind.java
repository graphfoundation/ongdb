package io.github.onograph.cluster.raft.module.dprot.k8;

import java.util.List;


public class K8ServicesKind extends K8Kind {


  private List<io.github.onograph.cluster.raft.module.dprot.k8.K8ServicesKind.K8Service> listIesK8Service;


  public List<io.github.onograph.cluster.raft.module.dprot.k8.K8ServicesKind.K8Service> getListIesK8Service() {
    return this.listIesK8Service;
  }

  @Override
  public <T> T had(
      io.github.onograph.cluster.raft.module.dprot.k8.K8Kind.K8KindProcessor<T> _k8KindProcessorVstrT) {
    return _k8KindProcessorVstrT.vii(this);
  }


  public void seimForLi(
      List<io.github.onograph.cluster.raft.module.dprot.k8.K8ServicesKind.K8Service> _listIesK8Service) {
    this.listIesK8Service = _listIesK8Service;
  }


  public static class K8Service {


    private K8NameRemTimestampWrapper mtdtK8NameRemTimestampWrapper;


    private Spec spec;


    public K8NameRemTimestampWrapper getMtdtK8NameRemTimestampWrapper() {
      return this.mtdtK8NameRemTimestampWrapper;
    }


    public Spec getSpec() {
      return this.spec;
    }


    public void sematForK8(K8NameRemTimestampWrapper _mtdtK8NameRemTimestampWrapper) {
      this.mtdtK8NameRemTimestampWrapper = _mtdtK8NameRemTimestampWrapper;
    }


    public void sescForK8(Spec _spec) {
      this.spec = _spec;
    }


    public static class Spec {


      private List<PortInfo> listPrsPortInfo;


      public List<PortInfo> getListPrsPortInfo() {
        return this.listPrsPortInfo;
      }


      public void septForLi(List<PortInfo> _listPrsPortInfo) {
        this.listPrsPortInfo = _listPrsPortInfo;
      }


      public static class PortInfo {


        private int portNumber;


        private String strPooo;


        private String title;


        public int getPortNumber() {
          return this.portNumber;
        }


        public String getStrPooo() {
          return this.strPooo;
        }


        public String name() {
          return this.title;
        }


        public void seneForSt(String title) {
          this.title = title;
        }


        public void sept(int portNumber) {
          this.portNumber = portNumber;
        }


        public void septoForSt(String _strPooo) {
          this.strPooo = _strPooo;
        }
      }
    }
  }
}
