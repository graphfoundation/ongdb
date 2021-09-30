package io.github.onograph.cluster.raft.share.meta;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.neo4j.util.Preconditions;


public class ClusterMetaTopologyInfo {


  private static final String DB_DIEO_NME = io.github.onograph.TokenConstants.DB;


  private static final String STAX_DIEO_SUF = io.github.onograph.TokenConstants._STATE;


  private final Path pscPath;

  private ClusterMetaTopologyInfo(Path _pscPath) {
    this.pscPath = _pscPath;
  }


  private static void _chcsceForMeMe(MetaWrapper<?> _metaWrapperFscObject,
      io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType _soeMetaWrapperType) {
    Preconditions.checkArgument(
        _metaWrapperFscObject.getSoeMetaWrapperType() == _soeMetaWrapperType,
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.checkArgument",
            _metaWrapperFscObject.getSoeMetaWrapperType()));
  }


  private static void _chdtnaForSt(String _strD) {
    if (_strD.matches(".*[\\\\/]+.*")) {

      throw new IllegalArgumentException("*** Error:  0704e769-fce0-405d-8b17-0df65ed599a9");
    }
  }


  private static String _stdtnaString(MetaWrapper<?> _metaWrapperCsfObject) {
    return _metaWrapperCsfObject == MetaWrapper.CONS_LG ? _metaWrapperCsfObject.name()
        : io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo.stdtnaString",
            _metaWrapperCsfObject.name());
  }


  public static ClusterMetaTopologyInfo ofClusterMetaTopologyInfo(Path _pscPath) {
    return new ClusterMetaTopologyInfo(_pscPath);
  }


  private Path _daacusdtPath(String gdbName, MetaWrapper<?> _metaWrapperFscObject) {
    _chcsceForMeMe(_metaWrapperFscObject,
        io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB);
    _chdtnaForSt(gdbName);

    Path _pdPath = this._dbdicrPath().resolve(gdbName);
    return _pdPath.resolve(_stdtnaString(_metaWrapperFscObject));
  }


  private Path _daacusfPath(String gdbName, MetaWrapper<?> _metaWrapperFscObject) {
    _chcsceForMeMe(_metaWrapperFscObject,
        io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB);

    Path _dpPath = this._daacusdtPath(gdbName, _metaWrapperFscObject);
    return _dpPath.resolve(_metaWrapperFscObject.name());
  }


  private Path _dbdicrPath() {
    return this.pscPath.resolve(io.github.onograph.TokenConstants.DB);
  }


  private Path _gllctsadrrPath(MetaWrapper<?> _metaWrapperCsfObject) {
    _chcsceForMeMe(_metaWrapperCsfObject,
        io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_ALL);
    return this.pscPath.resolve(_stdtnaString(_metaWrapperCsfObject));
  }


  private Path _gllctsaflPath(MetaWrapper<?> _metaWrapperFscObject) {
    _chcsceForMeMe(_metaWrapperFscObject,
        io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_ALL);

    Path _pdPath = this._gllctsadrrPath(_metaWrapperFscObject);
    return _pdPath.resolve(_metaWrapperFscObject.name());
  }


  public List<String> alrtgosList() {
    try {

      Stream<Path> _streamLisPath = Files.list(this._dbdicrPath());

      List _list;
      try {
        _list = _streamLisPath.filter((x) ->
        {
          return Files.isDirectory(x);
        }).map((c) ->
        {
          return c.getFileName().toString();
        }).collect(Collectors.toList());
      } catch (

          Throwable _throwable) {
        if (_streamLisPath != null) {
          try {
            _streamLisPath.close();
          } catch (

              Throwable _throwable2) {
            _throwable.addSuppressed(_throwable2);
          }
        }

        throw _throwable;
      }

      if (_streamLisPath != null) {
        _streamLisPath.close();
      }

      return _list;
    } catch (

        NoSuchFileException _noSuchFileException) {
      return List.of();
    } catch (

        IOException _iOException) {
      throw new UncheckedIOException(_iOException);
    }
  }


  public Path clestvsfiPath() {
    return this._gllctsaflPath(MetaWrapper.META_WRAPPER_VESN_CLUSTER_META_FORMAT);
  }


  public Path getPscPath() {
    return this.pscPath;
  }


  public Path lafldsedcPath(String gdbName) {
    return this._daacusdtPath(gdbName, MetaWrapper.FIN_FLSD);
  }


  public Path lesdtPath(String gdbName) {
    return this._daacusdtPath(gdbName, MetaWrapper.META_WRAPPER_LES_LEASABLE_META);
  }


  public Set<Path> ligladtedceSet(String gdbName,
      Predicate<MetaWrapper<?>> _predicateFfsMetaWrapper) {

    Stream<Path> _streamGdPath = MetaWrapper.vauList().stream().filter((type) ->
    {
      return type.getSoeMetaWrapperType() ==
          io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_ALL;
    }).filter(_predicateFfsMetaWrapper).map(this::_gllctsadrrPath);

    Stream<Path> _streamDdPath = MetaWrapper.vauList().stream().filter((type) ->
    {
      return type.getSoeMetaWrapperType() ==
          io.github.onograph.cluster.raft.share.meta.MetaWrapper.MetaWrapperType.MWT_GDB;
    }).filter(_predicateFfsMetaWrapper).map((type) ->
    {
      return this
          ._daacusdtPath(
              gdbName,
              type);
    });
    return Stream.concat(_streamGdPath, _streamDdPath).collect(Collectors.toSet());
  }


  public Path olmmidsefPath() {
    return this._gllctsaflPath(MetaWrapper.OLD_CND_MB_UID);
  }


  public Path qunmrsefPath(String gdbName) {
    return this._daacusfPath(gdbName, MetaWrapper.META_WRAPPER_QUNMR_WATCH_TAG);
  }


  public Path ragridfPath(String gdbName) {
    return this._daacusfPath(gdbName, MetaWrapper.CONS_GRP_UID);
  }


  public Path ralodeyPath(String gdbName) {
    return this._daacusdtPath(gdbName, MetaWrapper.CONS_LG);
  }


  public Path ramesstdioPath(String gdbName) {
    return this._daacusdtPath(gdbName, MetaWrapper.CONS_MBX);
  }


  public Path rametfePath(String gdbName) {
    return this._daacusfPath(gdbName, MetaWrapper.CONS_MB_UID);
  }


  public Path ratesadrrPath(String gdbName) {
    return this._daacusdtPath(gdbName, MetaWrapper.CONS_TER);
  }


  public Path ratgodPath(String gdbName) {
    _chdtnaForSt(gdbName);
    return this._dbdicrPath().resolve(gdbName);
  }


  public Path ravosadrrPath(String gdbName) {
    return this._daacusdtPath(gdbName, MetaWrapper.CONS_VOT);
  }


  public Path seotcdioPath(String gdbName) {
    return this._daacusdtPath(gdbName,
        MetaWrapper.META_WRAPPER_SESNAE_REPLICATION_SESSION_MANAGER_META);
  }
}
