package io.github.onograph.cluster.raft.share.calg.scholder;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;


public class MultiScHolder implements ScHolder {


  private final Map<Enum, ScHolder> mapTmotes = new HashMap();


  private final Supplier<Enum> supplierSlcoEnum;

  public MultiScHolder(Supplier<Enum> _supplierSlcoEnum) {
    this.supplierSlcoEnum = _supplierSlcoEnum;
  }


  public MultiScHolder adtetMultiScHolder(Enum k, ScHolder _tmotScHolder) {
    this.mapTmotes.put(k, _tmotScHolder);
    return this;
  }

  @Override
  public ScHold nexScHold() {
    return this.mapTmotes.get(this.supplierSlcoEnum.get()).nexScHold();
  }


  public interface Nameable {


    String getNameKey();
  }
}
