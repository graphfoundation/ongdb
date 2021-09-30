package io.github.onograph.backup;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;
import org.neo4j.io.fs.FileSystemAbstraction;


public class BackupMetadataRepository {


  private static final Charset DEFAULT_CHARSET;


  private static final String MEAT_NME = io.github.onograph.TokenConstants.METADATA_SCRIPT__CYPHER;

  static {
    DEFAULT_CHARSET = StandardCharsets.UTF_8;
  }


  private final FileSystemAbstraction fFileSystemAbstraction;

  public BackupMetadataRepository(FileSystemAbstraction _fFileSystemAbstraction) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
  }


  public static Path gefeptPath(Path _bfPath) {
    return _bfPath.resolve(io.github.onograph.TokenConstants.METADATA_SCRIPT__CYPHER);
  }


  public static boolean isMedaflForPa(Path _path) {

    File _file = _path.toFile();
    return _file.exists() && _file.isFile() && _path.getFileName().toString()
        .equals(io.github.onograph.TokenConstants.METADATA_SCRIPT__CYPHER);
  }


  private static void wrtForPaLi(String val, Writer _writer) {
    try {
      _writer.append(val);
    } catch (

        IOException _iOException) {
      throw new RuntimeException(_iOException);
    }
  }


  public void wrtForPaLi(Path _fbPath, List<String> valArr) throws IOException {
    if (!this.fFileSystemAbstraction.fileExists(_fbPath)) {
      this.fFileSystemAbstraction.mkdirs(_fbPath);
    }

    Path _ppfPath = gefeptPath(_fbPath);

    String val = String.join(";\n", valArr) + ";";

    Writer _writer = this.fFileSystemAbstraction.openAsWriter(_ppfPath, DEFAULT_CHARSET, false);

    try {
      wrtForPaLi(val, _writer);
    } catch (

        Throwable _throwable) {
      if (_writer != null) {
        try {
          _writer.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }
      }

      throw _throwable;
    }

    if (_writer != null) {
      _writer.close();
    }
  }
}
