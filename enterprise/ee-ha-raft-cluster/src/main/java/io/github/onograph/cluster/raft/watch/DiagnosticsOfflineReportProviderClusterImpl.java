package io.github.onograph.cluster.raft.watch;

import io.github.onograph.cluster.raft.share.calg.cle.parts.LogFilePathManager;
import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.cluster.raft.share.meta.MetaWrapper;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.diagnostics.DiagnosticsOfflineReportProvider;
import org.neo4j.kernel.diagnostics.DiagnosticsReportSource;
import org.neo4j.kernel.diagnostics.DiagnosticsReportSources;
import org.neo4j.logging.NullLog;


public class DiagnosticsOfflineReportProviderClusterImpl extends DiagnosticsOfflineReportProvider {


  private FileSystemAbstraction fFileSystemAbstraction;


  private ClusterMetaTopologyInfo lscClusterMetaTopologyInfo;


  private String strNdd;

  public DiagnosticsOfflineReportProviderClusterImpl() {
    super(io.github.onograph.TokenConstants.RAFT, io.github.onograph.TokenConstants.CCSTATE);
  }


  private void _addeoForStPaLi(List<DiagnosticsReportSource> _listSucsDiagnosticsReportSource,
      Path _pdPath, String _strP) {

    String _strLc = _strP + _pdPath.getFileSystem().getSeparator() + _pdPath.getFileName();
    if (this.fFileSystemAbstraction.isDirectory(_pdPath)) {
      try {

        Path[] _vPathArray = this.fFileSystemAbstraction.listFiles(_pdPath);

        int _iV = _vPathArray.length;

        for (

            int _iVar = 0; _iVar < _iV; ++_iVar) {

          Path _fpPath = _vPathArray[_iVar];
          this._addeoForStPaLi(_listSucsDiagnosticsReportSource, _fpPath, _strLc);
        }
      } catch (

          IOException _iOException) {

        String _strVr00 =
            "ccstate" + _pdPath.getFileSystem().getSeparator() + _pdPath.getFileName().toString();
        Objects.requireNonNull(_iOException);
        _listSucsDiagnosticsReportSource.add(
            DiagnosticsReportSources.newDiagnosticsString(_strVr00, _iOException::getMessage));
      }
    } else {
      _listSucsDiagnosticsReportSource.add(
          DiagnosticsReportSources.newDiagnosticsFile(_strLc, this.fFileSystemAbstraction,
              _pdPath));
    }
  }


  private void _gecusForLi(List<DiagnosticsReportSource> _listSucsDiagnosticsReportSource) {
    this.lscClusterMetaTopologyInfo.ligladtedceSet(this.strNdd, (type) ->
    {
      return type != MetaWrapper.CONS_LG;
    }).stream().filter((path) ->
    {
      return Files.exists(path);
    }).forEach((dir) ->
    {
      this._addeoForStPaLi(_listSucsDiagnosticsReportSource, dir,
          io.github.onograph.TokenConstants.CCSTATE);
    });
  }


  private void _gertlgForLi(List<DiagnosticsReportSource> _listSucsDiagnosticsReportSource)
      throws IOException {

    Path _rlpPath = this.lscClusterMetaTopologyInfo.ralodeyPath(this.strNdd);

    boolean _isDlrh = Files.exists(_rlpPath) && Files.isDirectory(_rlpPath);
    if (_isDlrh) {

      LogFilePathManager _nfLogFilePathManager = new LogFilePathManager(_rlpPath);

      SortedMap<Long, Path> _sortedMapFalp = _nfLogFilePathManager.geafeSortedMap(
          this.fFileSystemAbstraction, NullLog.getInstance());

      Iterator _iterator = _sortedMapFalp.values().iterator();

      while (_iterator.hasNext()) {

        Path _plPath = (Path) _iterator.next();

        String _strVr00 = _rlpPath.getFileSystem().getSeparator();

        String _strDsiai = "raft" + _strVr00 + _plPath.getFileName().toString();
        _listSucsDiagnosticsReportSource.add(
            DiagnosticsReportSources.newDiagnosticsFile(_strDsiai, this.fFileSystemAbstraction,
                _plPath));
      }
    }
  }

  @Override
  public void init(FileSystemAbstraction _fFileSystemAbstraction, String _strNdd, Config _config,
      Path _psiPath) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.lscClusterMetaTopologyInfo = ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        _config.get(SettingsDeclarationClusterImpl.settingCleteyPath));
    this.strNdd = _strNdd;
  }

  @Override
  protected List<DiagnosticsReportSource> provideSources(Set<String> _setCasfeString) {

    List<DiagnosticsReportSource> _listSucsDiagnosticsReportSource = new ArrayList();
    if (_setCasfeString.contains(io.github.onograph.TokenConstants.RAFT)) {
      try {
        this._gertlgForLi(_listSucsDiagnosticsReportSource);
      } catch (

          IOException _iOException) {
        Objects.requireNonNull(_iOException);
        _listSucsDiagnosticsReportSource.add(
            DiagnosticsReportSources.newDiagnosticsString(io.github.onograph.TokenConstants.RAFT,
                _iOException::getMessage));
      }
    }

    if (_setCasfeString.contains(io.github.onograph.TokenConstants.CCSTATE)) {
      this._gecusForLi(_listSucsDiagnosticsReportSource);
    }

    return _listSucsDiagnosticsReportSource;
  }
}
