package io.github.onograph.kernel.srv.pagecache;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.neo4j.dbms.archive.CompressionFormat;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.FileUtils;
import org.neo4j.io.pagecache.PagedFile;


final class PageShape implements Comparable<PageShape> {


  static final String PRFER = io.github.onograph.TokenConstants.PROFILES;


  private final long lgPsi;


  private final Path pbPath;


  private final Path ppPath;


  private final Path pppPath;


  private PageShape(long _lgIsp, Path _pbPath, Path _ppPath, Path _pppPath) {
    Objects.requireNonNull(_pppPath);
    Objects.requireNonNull(_ppPath);
    Objects.requireNonNull(_pbPath);
    this.pbPath = _pbPath;
    this.pppPath = _pppPath;
    this.ppPath = _ppPath;
    this.lgPsi = _lgIsp;
  }


  private static Path _prfenmPath(long cnt, Path _pbPath, Path _pmPath) {

    Path _pppPath = _pbPath.resolve(io.github.onograph.TokenConstants.PROFILES);

    Path _ppppPath = FileUtils.pathToFileAfterMove(_pbPath, _pppPath, _pmPath).getParent();

    String title = _pmPath.getFileName().toString();
    return _ppppPath.resolve(
        io.github.onograph.I18N.format("io.github.onograph.kernel.srv.pagecache.PageShape.resolve",
            title, cnt));
  }


  static PageShape fPageShape(Path _pdPath, Path _pfPath) {

    long _lgIsp = 0L;
    return new PageShape(_lgIsp, _pdPath, _pfPath, _prfenmPath(_lgIsp, _pdPath, _pfPath));
  }


  static Stream<PageShape> paplneStream(Path _bpPath, Path _ppmPath, Path _pppPath) {

    String title = _pppPath.getFileName().toString();
    if (!title.endsWith(io.github.onograph.TokenConstants.__CACHEPROF)) {
      return Stream.empty();
    } else {

      int _iDl = title.lastIndexOf(46);

      int _iDls = title.lastIndexOf(46, _iDl - 1);

      String _strSc = title.substring(_iDls + 1, _iDl);

      try {

        long _lgIs = Long.parseLong(_strSc, 10);

        String _strNfmt = title.substring(0, _iDls);
        return _strNfmt.equals(_ppmPath.getFileName().toString()) ? Stream
            .of(new PageShape(_lgIs, _bpPath, _ppmPath, _pppPath)) : Stream.empty();
      } catch (

          NumberFormatException _numberFormatException) {
        return Stream.empty();
      }
    }
  }


  static Predicate<PageShape> reentoPredicate(PagedFile _pagedFile) {
    return (p) ->
    {
      return p.ppPath.equals(_pagedFile.path());
    };
  }

  @Override
  public int compareTo(PageShape _thPageShape) {

    int _iCmae = this.ppPath.compareTo(_thPageShape.ppPath);
    return _iCmae == 0 ? Long.compare(this.lgPsi, _thPageShape.lgPsi) : _iCmae;
  }


  void deeForFi(FileSystemAbstraction _fFileSystemAbstraction) throws IOException {
    _fFileSystemAbstraction.deleteFile(this.pppPath);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof PageShape) {

      PageShape _poiePageShape = (PageShape) obj;
      return this.pppPath.equals(_poiePageShape.pppPath);
    } else {
      return false;
    }
  }


  Path getPppPath() {
    return this.pppPath;
  }

  @Override
  public int hashCode() {
    return this.pppPath.hashCode();
  }


  PageShape nexPageShape() {

    long _lgNe = this.lgPsi + 1L;
    return new PageShape(_lgNe, this.pbPath, this.ppPath,
        _prfenmPath(_lgNe, this.pbPath, this.ppPath));
  }


  InputStream reaInputStream(FileSystemAbstraction _fFileSystemAbstraction) throws IOException {
    try {
      return CompressionFormat.decompress(() ->
      {
        return _fFileSystemAbstraction.openAsInputStream(this.pppPath);
      });
    } catch (

        IOException _iOException) {

      throw new IOException("*** Error:  4335b09e-bf9c-4b7f-9a62-4362877aec08", _iOException);
    }
  }

  @Override
  public String toString() {
    return io.github.onograph.I18N.format(
        "io.github.onograph.kernel.srv.pagecache.PageShape.toString", this.lgPsi, this.ppPath);
  }


  OutputStream wrtOutputStream(FileSystemAbstraction _fFileSystemAbstraction) throws IOException {
    _fFileSystemAbstraction.mkdirs(this.pppPath.getParent());

    try {
      return CompressionFormat.compress(() ->
      {
        return _fFileSystemAbstraction.openAsOutputStream(this.pppPath, true);
      }, CompressionFormat.GZIP);
    } catch (

        IOException _iOException) {

      throw new IOException("*** Error:  f4839924-1f0c-4380-876c-c6c4ec9f045d", _iOException);
    }
  }
}
