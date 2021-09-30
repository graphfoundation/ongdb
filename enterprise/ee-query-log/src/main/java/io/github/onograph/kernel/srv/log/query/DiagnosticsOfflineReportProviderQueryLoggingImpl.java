package io.github.onograph.kernel.srv.log.query;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.diagnostics.DiagnosticsOfflineReportProvider;
import org.neo4j.kernel.diagnostics.DiagnosticsReportSource;
import org.neo4j.kernel.diagnostics.DiagnosticsReportSources;


public class DiagnosticsOfflineReportProviderQueryLoggingImpl extends
    DiagnosticsOfflineReportProvider {


  private Config config;


  private FileSystemAbstraction fFileSystemAbstraction;

  public DiagnosticsOfflineReportProviderQueryLoggingImpl() {
    super(io.github.onograph.TokenConstants.LOGS);
  }

  @Override
  public void init(FileSystemAbstraction _fFileSystemAbstraction, String _strNdd, Config _config,
      Path _psPath) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.config = _config;
  }

  @Override
  protected List<DiagnosticsReportSource> provideSources(Set<String> _setCasfeString) {
    if (_setCasfeString.contains(io.github.onograph.TokenConstants.LOGS)) {

      Path _qlPath = this.config.get(GraphDatabaseSettings.log_queries_filename);
      if (this.fFileSystemAbstraction.fileExists(_qlPath)) {
        return DiagnosticsReportSources.newDiagnosticsRotatingFile(
            io.github.onograph.TokenConstants.P_LOGS__, this.fFileSystemAbstraction,
            _qlPath);
      }
    }

    return Collections.emptyList();
  }
}
