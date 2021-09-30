package io.github.onograph.server.security;

import io.github.onograph.config.Security;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.diagnostics.DiagnosticsOfflineReportProvider;
import org.neo4j.kernel.diagnostics.DiagnosticsReportSource;
import org.neo4j.kernel.diagnostics.DiagnosticsReportSources;


public class DiagnosticsOfflineReportProviderEnterpriseImpl extends
    DiagnosticsOfflineReportProvider {


  private Config config;


  private FileSystemAbstraction fFileSystemAbstraction;

  public DiagnosticsOfflineReportProviderEnterpriseImpl() {
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

      Path _lsPath = this.config.get(Security.settingSeignPath);
      if (this.fFileSystemAbstraction.fileExists(_lsPath)) {
        return DiagnosticsReportSources.newDiagnosticsRotatingFile(
            io.github.onograph.TokenConstants.P_LOGS__, this.fFileSystemAbstraction,
            _lsPath);
      }
    }

    return Collections.emptyList();
  }
}
