package io.github.onograph.metrics;

import io.github.onograph.config.Metrics;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.diagnostics.DiagnosticsOfflineReportProvider;
import org.neo4j.kernel.diagnostics.DiagnosticsReportSource;
import org.neo4j.kernel.diagnostics.DiagnosticsReportSources;


public class MetricsReportProvider extends DiagnosticsOfflineReportProvider {


  private Config config;


  private FileSystemAbstraction fFileSystemAbstraction;

  public MetricsReportProvider() {
    super(io.github.onograph.TokenConstants.METRICS);
  }

  @Override
  public void init(FileSystemAbstraction _fFileSystemAbstraction, String _strNdd, Config _config,
      Path _psPath) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.config = _config;
  }

  @Override
  protected List<DiagnosticsReportSource> provideSources(Set<String> _setCasfeString) {

    Path _pmPath = this.config.get(Metrics.settingCsphPath);
    if (this.fFileSystemAbstraction.fileExists(_pmPath) && this.fFileSystemAbstraction.isDirectory(
        _pmPath)) {

      ArrayList _flsArrayList = new ArrayList();

      try {

        Path[] _vPathArray = this.fFileSystemAbstraction.listFiles(_pmPath);

        int _iV = _vPathArray.length;

        for (

            int _iV2 = 0; _iV2 < _iV; ++_iV2) {

          Path _pfPath = _vPathArray[_iV2];
          _flsArrayList.add(DiagnosticsReportSources.newDiagnosticsFile(
              io.github.onograph.I18N.format(
                  "io.github.onograph.metrics.MetricsReportProvider.newDiagnosticsFile",
                  _pfPath.getFileName()), this.fFileSystemAbstraction, _pfPath));
        }
      } catch (

          IOException _iOException) {
        Objects.requireNonNull(_iOException);
        _flsArrayList.add(
            DiagnosticsReportSources.newDiagnosticsString(io.github.onograph.TokenConstants.METRICS,
                _iOException::getMessage));
      }

      return _flsArrayList;
    } else {
      return Collections.emptyList();
    }
  }
}
