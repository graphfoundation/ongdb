package io.github.onograph.backup;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.io.IOUtils;
import org.neo4j.io.fs.FileSystemAbstraction;


public class FileMover {


  private final FileSystemAbstraction fFileSystemAbstraction;

  public FileMover(FileSystemAbstraction _fFileSystemAbstraction) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
  }


  private Stream<FileMoverService> _exdtefiStream(Path _pbPath, Path _pdPath)
      throws IOException {

    List<Path> _listLsigPath = this._litflList(_pdPath);
    if (_listLsigPath == null) {
      _listLsigPath = Collections.singletonList(_pdPath);
      _pbPath = _pdPath.getParent();
    }

    Stream<Path> _streamFlsPath = _listLsigPath.stream().filter(this::_isFiForPa);

    Stream<Path> _streamDPath = _listLsigPath.stream().filter(this::_isDicrForPa);

    Path _pbfPath = _pbPath;

    Stream<FileMoverService> _streamFmFileMoverService = _streamFlsPath.map((f) ->
    {
      return FileMoverService.movifeseFileMoverService(f, _pbfPath);
    });

    Stream<FileMoverService> _streamTdFileMoverService = _streamDPath.flatMap((d) ->
    {
      return this._trrfrmnStream(d, _pbfPath);
    });
    return Stream.concat(_streamFmFileMoverService, _streamTdFileMoverService);
  }


  private boolean _isDicrForPa(Path _pfPath) {
    return this.fFileSystemAbstraction.isDirectory(_pfPath);
  }


  private boolean _isFiForPa(Path _pfPath) {
    return !this.fFileSystemAbstraction.isDirectory(_pfPath);
  }


  private List<Path> _litflList(Path _pdPath) throws IOException {
    return Arrays.stream(this.fFileSystemAbstraction.listFiles(_pdPath)).distinct()
        .collect(Collectors.toList());
  }


  public Stream<FileMoverService> _trrfrmnStream(Path _pdPath) {
    return this._trrfrmnStream(_pdPath, _pdPath);
  }


  private Stream<FileMoverService> _trrfrmnStream(Path _dpPath, Path _pbPath) {
    return Stream.of(_dpPath).flatMap(IOUtils.uncheckedFunction((d) ->
    {
      return this._exdtefiStream(_pbPath, d);
    }));
  }
}
