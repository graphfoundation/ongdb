package io.github.onograph.cluster.raft.share;

import org.neo4j.logging.LogProvider;
import org.neo4j.logging.internal.AbstractLogService;
import org.neo4j.logging.internal.LogService;
import org.neo4j.logging.internal.PrefixedLogProvider;
import org.neo4j.logging.internal.SimpleLogService;


public class NodeServerInfoLogService extends AbstractLogService {


  private final LogService dlgtLogService;


  private final String strNs;

  public NodeServerInfoLogService(LogService _dlgtLogService, String _strSn) {
    this.dlgtLogService = _dlgtLogService;
    this.strNs = _strSn;
  }


  public NodeServerInfoLogService(LogProvider _dbgLogProvider, String _strNs,
      LogProvider _uLogProvider) {
    this(_dbgLogProvider == _uLogProvider ? new SimpleLogService(_dbgLogProvider)
            : new SimpleLogService(_uLogProvider, _dbgLogProvider),
        _strNs);
  }

  @Override
  public LogProvider getInternalLogProvider() {
    return new PrefixedLogProvider(this.dlgtLogService.getInternalLogProvider(), this.strNs);
  }


  public String getStrNs() {
    return this.strNs;
  }

  @Override
  public LogProvider getUserLogProvider() {
    return new PrefixedLogProvider(this.dlgtLogService.getUserLogProvider(), this.strNs);
  }
}
