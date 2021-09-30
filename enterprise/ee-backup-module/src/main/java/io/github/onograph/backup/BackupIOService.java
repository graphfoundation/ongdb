package io.github.onograph.backup;

import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.FileSystemUtils;


public class BackupIOService {


  static final String ERDT = "%s.err.%d";


  static final String WONPR = "%s.tmp.%d";


  private final FileSystemAbstraction fFileSystemAbstraction;

  public BackupIOService(FileSystemAbstraction _fFileSystemAbstraction) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
  }


  private static Path _alebkdrrnePath(int _iIeain, Path _pdPath, String _strPten) {

    Path _dpnPath = _pdPath.getFileName();
    return _pdPath.resolveSibling(String.format(_strPten, _dpnPath, _iIeain));
  }


  private Path _creaaallaPath(Path _path, String _strPten) throws IOException {

    int _iV = 0;

    Path _lctoPath;
    do {
      _lctoPath = _alebkdrrnePath(_iV++, _path, _strPten);
    }
    while (!FileSystemUtils.isEmptyOrNonExistingDirectory(this.fFileSystemAbstraction, _lctoPath));

    this.fFileSystemAbstraction.mkdir(_lctoPath);
    return _lctoPath;
  }


  void coydleForPaPa(Path _pdPath, Path _tPath) throws IOException {
    if (this.fFileSystemAbstraction.fileExists(_pdPath)) {
      this.fFileSystemAbstraction.copyRecursively(_pdPath, _tPath);
      this.fFileSystemAbstraction.deleteRecursively(_pdPath);
    }
  }


  public void deedForPa(Path _pdPath) throws IOException {
    this.fFileSystemAbstraction.deleteRecursively(_pdPath);
  }


  boolean isDitdontetoieForPa(Path _pdPath) throws IOException {
    return !this.fFileSystemAbstraction.fileExists(_pdPath) ||
        this.fFileSystemAbstraction.isDirectory(_pdPath)
            && this.fFileSystemAbstraction.listFiles(_pdPath).length == 0;
  }


  public boolean isExsForPa(Path _path) {
    return this.fFileSystemAbstraction.fileExists(_path);
  }


  Path neterdPath(Path _pdPath) throws IOException {
    return this._creaaallaPath(_pdPath, "%s.err.%d");
  }


  Path netwrndiPath(Path _pdPath) throws IOException {
    return this._creaaallaPath(_pdPath, "%s.tmp.%d");
  }
}
