package io.github.onograph.kernel.srv.store.format.highlimit.v320;

import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.format.RecordFormats.Factory;


public class FactoryHighLimitDefaultImpl implements Factory {

  @Override
  public String getName() {
    return io.github.onograph.TokenConstants.HIGH_LIMIT_V3_2_0;
  }

  @Override
  public RecordFormats newInstance() {
    return V320.RCD_FMXS;
  }
}
