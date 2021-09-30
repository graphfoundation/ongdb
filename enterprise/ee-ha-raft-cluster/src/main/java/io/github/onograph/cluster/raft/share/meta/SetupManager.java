package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.module.cuprot.scmeta.StoreResources;
import java.io.IOException;
import java.nio.file.Path;
import java.util.UUID;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class SetupManager {


  private final FileSystemAbstraction fileSystemAbstraction;


  private final Log log;

  public SetupManager(FileSystemAbstraction _fileSystemAbstraction, LogProvider _logProvider) {
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.log = _logProvider.getLog(this.getClass());
  }


  private void _astetaeForPa(Path _pdPath) throws IOException {

    Path[] _dfnPathArray = this.fileSystemAbstraction.listFiles(_pdPath,
        StoreResources.FILTER_EXDPY_PATH);
    if (_dfnPathArray.length != 0) {

      throw new IllegalStateException("*** Error: 0209d941-e6d4-4c00-a4f4-3c2b206f02f6");
    }
  }


  public void _claForPa(DatabaseLayout _databaseLayout) throws IOException {
    this._claForPa(_databaseLayout.databaseDirectory());
    this._claForPa(_databaseLayout.getTransactionLogsDirectory());
  }


  private void _claForPa(Path _pdPath) throws IOException {

    Path _pstPath = _pdPath.resolve(io.github.onograph.TokenConstants.TEMP_SAVE);

    this.fileSystemAbstraction.deleteRecursively(_pstPath);
  }


  private boolean _isHafeForPa(Path _pdPath) throws IOException {
    if (!this.fileSystemAbstraction.fileExists(_pdPath)) {
      return false;
    } else {

      Path[] _nfdPathArray = this.fileSystemAbstraction.listFiles(_pdPath,
          StoreResources.FILTER_EXDPY_PATH);
      return _nfdPathArray.length > 0;
    }
  }


  private void _rerfmsForPa(Path _pdPath) throws IOException {

    Path _prtPath = this._teprnedrPath(_pdPath);

    Path _pstPath = _pdPath.resolve(io.github.onograph.TokenConstants.TEMP_SAVE);
    this.fileSystemAbstraction.renameFile(_pstPath, _prtPath);

    Path[] _nfPathArray = this.fileSystemAbstraction.listFiles(_pdPath,
        StoreResources.FILTER_EXDPY_PATH);
    if (_nfPathArray.length != 0) {

      throw new IllegalStateException("*** Error: d5ededa1-e383-4341-be67-115043ec929d");
    } else {
      this.fileSystemAbstraction.deleteRecursively(_pdPath);
      this.fileSystemAbstraction.renameFile(_prtPath, _pdPath);
    }
  }


  private void _reteflForPa(Path _pdPath) throws IOException {

    Path _pstPath = _pdPath.resolve(io.github.onograph.TokenConstants.TEMP_SAVE);
    if (this.fileSystemAbstraction.fileExists(_pstPath)) {

      Path[] _nfdPathArray = this.fileSystemAbstraction.listFiles(_pdPath,
          StoreResources.FILTER_EXDPY_PATH);
      if (_nfdPathArray.length > 0) {

        throw new IllegalStateException("*** Error: 523b42d4-37a1-4970-a9dc-ee00f4377ce0");
      } else {

        this._rerfmsForPa(_pdPath);
      }
    }
  }


  private void _saefForPa(Path _bpPath) throws IOException {

    Path _pstPath = _bpPath.resolve(io.github.onograph.TokenConstants.TEMP_SAVE);
    if (this.fileSystemAbstraction.fileExists(_pstPath)) {

      throw new IllegalStateException("*** Error: e9a7d0c7-aaae-4ee5-be0c-7a43267747c7");
    } else {

      Path _prtPath = this._teprnedrPath(_bpPath);
      this.fileSystemAbstraction.renameFile(_bpPath, _prtPath);
      this.fileSystemAbstraction.mkdir(_bpPath);
      this.fileSystemAbstraction.renameFile(_prtPath, _pstPath);
    }
  }


  private void _saeflForPa(Path _pdPath) throws IOException {
    if (this._isHafeForPa(_pdPath)) {

      this._saefForPa(_pdPath);
      this._astetaeForPa(_pdPath);
    }
  }


  private Path _teprnedrPath(Path _pbPath) {

    Path _vr00Path = _pbPath.getFileName();

    Path _prtPath = _pbPath.resolveSibling(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.meta.SetupManager.resolveSibling", _vr00Path,
            UUID.randomUUID().toString().substring(0, 8)));
    if (this.fileSystemAbstraction.fileExists(_prtPath)) {

      throw new IllegalStateException("*** Error: 056111ce-35e2-48a0-abc6-433a8cd71de9");
    } else {
      return _prtPath;
    }
  }


  public void reteForDa(DatabaseLayout _databaseLayout) throws IOException {
    this._reteflForPa(_databaseLayout.databaseDirectory());
    this._reteflForPa(_databaseLayout.getTransactionLogsDirectory());
  }


  public void savForDa(DatabaseLayout _databaseLayout) throws IOException {
    this._saeflForPa(_databaseLayout.databaseDirectory());
    this._saeflForPa(_databaseLayout.getTransactionLogsDirectory());
  }
}
