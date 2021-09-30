package io.github.onograph.cluster.raft.share.calg.scholder;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;


public class ScHolderBuilder {


  public static ScHolder fietioScHolder(long _lgMid, TimeUnit _timeUnit) {
    return new FixedScHolder(_lgMid, _timeUnit);
  }


  public static MultiScHolder muttioMultiScHolder(Supplier<Enum> _supplierSpleEnum) {
    return new MultiScHolder(_supplierSpleEnum);
  }


  public static ScHolder unrrdtmScHolder(long _lgMidm, long _lgMidm2, TimeUnit _timeUnit) {
    return new ScHolderStandardImpl(_lgMidm, _lgMidm2, _timeUnit);
  }
}
