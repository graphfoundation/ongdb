package io.github.onograph.cluster.raft.share.calg.cle.parts;

import java.io.IOException;
import java.nio.file.Path;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.logging.Log;


public class LogFilePathManager {


  static final String BAS_FIL_NME = io.github.onograph.TokenConstants.RAFT__LOG__;


  private static final String VX_MAC = "(0|[1-9]\\d*)";


  private final Pattern flPattern;


  private final Path pbPath;

  public LogFilePathManager(Path _pbPath) {
    this.pbPath = _pbPath;
    this.flPattern = Pattern.compile("raft.log.(0|[1-9]\\d*)");
  }


  public SortedMap<Long, Path> geafeSortedMap(FileSystemAbstraction _fileSystemAbstraction,
      Log _log)
      throws IOException {

    SortedMap<Long, Path> _sortedMapMfvlp = new TreeMap();

    Path[] _vaPathArray = _fileSystemAbstraction.listFiles(this.pbPath);

    int _iVar = _vaPathArray.length;

    for (

        int _iV = 0; _iV < _iVar; ++_iV) {

      Path _pfPath = _vaPathArray[_iV];

      Matcher _matcher = this.flPattern.matcher(_pfPath.getFileName().toString());
      if (!_matcher.matches()) {

      } else {
        _sortedMapMfvlp.put(Long.valueOf(_matcher.group(1)), _pfPath);
      }
    }

    return _sortedMapMfvlp;
  }


  Path gefsmtPath(long _lgVrin) {
    return this.pbPath.resolve(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.calg.cle.parts.LogFilePathManager.resolve",
            _lgVrin));
  }
}
