package io.github.onograph.kernel.srv.store.format.highlimit.v400;

import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.format.RecordFormats.Factory;


public class HighLimitFactoryDefaultImpl implements Factory {

  @Override
  public String getName() {
    return io.github.onograph.TokenConstants.HIGH_LIMIT_V4_0_0;
  }

  @Override
  public RecordFormats newInstance() {
    return V400.RCD_FMXS;
  }
}
