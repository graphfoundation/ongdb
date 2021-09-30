package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import java.util.List;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.memory.GlobalMemoryGroupTracker;
import org.neo4j.memory.MemoryPools;
import org.neo4j.memory.ScopedMemoryPool;


@Documented(io.github.onograph.TokenConstants.MEMORY_POOLS_ADAPTER_NEO_STACK_IMPL___DOCUMENTED)
public class MemoryPoolsAdapterNeoStackImpl extends AbstractMemoryPoolsAdapter {


  private static final String GDBC_GLB_PC_PRE = io.github.onograph.TokenConstants.DBMS__POOL;


  private static final String GDBC_PC_USX_TPX = MetricRegistry.name(
      io.github.onograph.TokenConstants.DBMS__POOL, "%s", "%s");


  private final String strTp;

  public MemoryPoolsAdapterNeoStackImpl() {
    this("", null, null);
  }

  public MemoryPoolsAdapterNeoStackImpl(String mprnm, MetricRegistryManager _metricRegistryManager,
      MemoryPools _memoryPools) {
    super(_memoryPools, _metricRegistryManager,
        MetricRegistry.name(mprnm, io.github.onograph.TokenConstants.DBMS__POOL));
    this.strTp = MetricRegistry.name(mprnm, GDBC_PC_USX_TPX);
  }

  @Override
  public String moydmdmineString(String _strMti) {
    return io.github.onograph.I18N.format(
        "io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterNeoStackImpl.moydmdmineString",
        _strMti);
  }

  @Override
  protected String naepomeiString(ScopedMemoryPool plNm, String _strNm) {
    return String.format(this.strTp, plNm.group().getName().toLowerCase(), _strNm.toLowerCase());
  }

  @Override
  protected List<GlobalMemoryGroupTracker> polList() {
    return this.memoryPools.getPools();
  }
}
