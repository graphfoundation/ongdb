package io.github.onograph.kernel.srv.store.format.highlimit;

import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.kernel.impl.store.format.RecordFormats.Factory;


public class FactoryHighLimitRecordFormatsImpl implements Factory {

  @Override
  public String getName() {
    return HighLimitRecordFormats.TITLE;
  }

  @Override
  public RecordFormats newInstance() {
    return HighLimitRecordFormats.RCD_FMXS;
  }
}
