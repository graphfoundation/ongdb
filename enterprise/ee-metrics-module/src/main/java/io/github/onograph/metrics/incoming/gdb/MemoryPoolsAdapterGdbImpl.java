package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.memory.MemoryPools;
import org.neo4j.memory.ScopedMemoryPool;


@Documented(io.github.onograph.TokenConstants.MEMORY_POOLS_ADAPTER_GDB_IMPL___DOCUMENTED)
public class MemoryPoolsAdapterGdbImpl extends AbstractMemoryPoolsAdapter {


  private static final String GDBC_GDB_PC_PRE = io.github.onograph.TokenConstants.POOL;


  private static final String GDBC_GDB_PC_USX_TPX =
      MetricRegistry.name(io.github.onograph.TokenConstants.POOL, "%s", "%s", "%s");


  private final String gdbName;


  private final String strTp;

  public MemoryPoolsAdapterGdbImpl() {
    this("", null, null, "");
  }

  public MemoryPoolsAdapterGdbImpl(String mprnm, MetricRegistryManager _metricRegistryManager,
      MemoryPools _memoryPools, String gdbName) {
    super(_memoryPools, _metricRegistryManager,
        MetricRegistry.name(mprnm, io.github.onograph.TokenConstants.POOL));
    this.strTp = MetricRegistry.name(mprnm, GDBC_GDB_PC_USX_TPX);
    this.gdbName = Objects.requireNonNull(gdbName);
  }

  @Override
  public String moydmdmineString(String _strMti) {
    return io.github.onograph.I18N.format(
        "io.github.onograph.metrics.incoming.gdb.MemoryPoolsAdapterGdbImpl.moydmdmineString",
        _strMti);
  }

  @Override
  protected String naepomeiString(ScopedMemoryPool plNm, String _strNm) {
    return String.format(this.strTp, plNm.group().getName().toLowerCase(),
        plNm.databaseName().toLowerCase(), _strNm.toLowerCase());
  }

  @Override
  protected List<ScopedMemoryPool> polList() {
    return this.memoryPools.getPools().stream().flatMap((pool) ->
    {
      return pool.getDatabasePools().stream();
    }).filter((pool) ->
    {
      return this.gdbName.equals(pool.databaseName());
    }).collect(Collectors.toList());
  }
}
