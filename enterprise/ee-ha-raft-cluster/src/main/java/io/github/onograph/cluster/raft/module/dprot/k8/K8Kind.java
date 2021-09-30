package io.github.onograph.cluster.raft.module.dprot.k8;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;


@JsonTypeInfo(
    use = Id.NAME,
    property = io.github.onograph.TokenConstants.K8_KIND___JSON_TYPE_INFO__PROPERTY
)
@JsonSubTypes({@Type(
    value = K8ServicesKind.class,
    name = io.github.onograph.TokenConstants.K8_KIND___TYPE__NAME
), @Type(
    value = K8KindInfo.class,
    name = io.github.onograph.TokenConstants.K8_KIND___TYPE__NAME2
)})
public abstract class K8Kind {


  private String strK;


  public String getStrK() {
    return this.strK;
  }


  public abstract <T> T had(
      io.github.onograph.cluster.raft.module.dprot.k8.K8Kind.K8KindProcessor<T> _k8KindProcessorVT);


  public void sekdForSt(String _strKi) {
    this.strK = _strKi;
  }


  public interface K8KindProcessor<T> {


    T vii(K8KindInfo _k8KindInfo);


    T vii(K8ServicesKind _k8ServicesKind);
  }
}
