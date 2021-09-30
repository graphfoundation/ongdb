package io.github.onograph.cluster.raft.share.meta;

import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.util.Optional;
import org.neo4j.configuration.Config;
import org.neo4j.io.fs.DefaultFileSystemAbstraction;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.state.SimpleStorage;
import org.neo4j.io.state.StateStorage;
import org.neo4j.kernel.lifecycle.LifeSupport;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.logging.internal.DatabaseLogProvider;
import org.neo4j.memory.EmptyMemoryTracker;


public class ClusterMetaFlushRunner {


  private final ClusterSimpleStorageFacade fsClusterSimpleStorageFacade;


  private final PrintStream oPrintStream;


  private final String strDtd;


  ClusterMetaFlushRunner(FileSystemAbstraction _fFileSystemAbstraction, PrintStream _oPrintStream,
      Path _pdPath, String _strDtd) {
    this.fsClusterSimpleStorageFacade = _necrstsrseeClusterSimpleStorageFacade(
        _fFileSystemAbstraction, _pdPath);
    this.oPrintStream = _oPrintStream;
    this.strDtd = _strDtd;
  }


  private static ClusterSimpleStorageFacade _necrstsrseeClusterSimpleStorageFacade(
      FileSystemAbstraction _fFileSystemAbstraction, Path _pdPath) {

    ClusterMetaTopologyInfo _lyuClusterMetaTopologyInfo =
        ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
            _pdPath.resolve(io.github.onograph.TokenConstants.CLUSTER_STATE));
    return new ClusterSimpleStorageFacade(Config.defaults(), _fFileSystemAbstraction,
        NullLogProvider.getInstance(), _lyuClusterMetaTopologyInfo,
        EmptyMemoryTracker.INSTANCE);
  }


  public static void main(String[] _strAArray) {

    Path _pdPath;

    Optional _odtdOptional;

    Optional _ondOptional;
    if (_strAArray.length == 1) {
      _pdPath = Path.of(_strAArray[0]);
      _odtdOptional = Optional.empty();
      _ondOptional = Optional.empty();
    } else if (_strAArray.length == 2) {
      _pdPath = Path.of(_strAArray[0]);
      _odtdOptional = Optional.ofNullable(_strAArray[1]);
      _ondOptional = Optional.empty();
    } else {
      if (_strAArray.length != 3) {

        System.out.println(
            io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.share.meta.ClusterMetaFlushRunner.println"));
        System.exit(1);
        return;
      }

      _pdPath = Path.of(_strAArray[0]);
      _odtdOptional = Optional.ofNullable(_strAArray[1]);
      _ondOptional = Optional.ofNullable(_strAArray[2]);
    }

    try {

      DefaultFileSystemAbstraction _defaultFileSystemAbstraction = new DefaultFileSystemAbstraction();

      try {

        String gdbName = (String) _ondOptional.orElse(io.github.onograph.TokenConstants.NEO4J);

        String _strDtd = (String) _odtdOptional.orElse(gdbName);

        ClusterMetaFlushRunner _tdClusterMetaFlushRunner = new ClusterMetaFlushRunner(
            _defaultFileSystemAbstraction, System.out, _pdPath, _strDtd);
        _tdClusterMetaFlushRunner.flushAndShutdown();
      } catch (

          Throwable _throwable) {
        try {
          _defaultFileSystemAbstraction.close();
        } catch (

            Throwable _throwable2) {
          _throwable.addSuppressed(_throwable2);
        }

        throw _throwable;
      }

      _defaultFileSystemAbstraction.close();
    } catch (

        Exception _exception) {

    }
  }


  private <E> void _dupsaForMeSt(MetaWrapper<E> _metaWrapperFtE,
      StateStorage<E> _stateStorageSoaeE) {

  }


  private <E> void _dusForMeSi(MetaWrapper<E> _metaWrapperFtE,
      SimpleStorage<E> _simpleStorageSoaeE) {
    if (_simpleStorageSoaeE.exists()) {

      String _strSs;
      try {
        _strSs = _simpleStorageSoaeE.readState().toString();
      } catch (

          IOException _iOException) {
        _strSs = String.format(
            io.github.onograph.I18N.format(
                "io.github.onograph.cluster.raft.share.meta.ClusterMetaFlushRunner.format"),
            _iOException.getMessage());
      }

    }
  }


  void flushAndShutdown() {

    LifeSupport _lifeSupport = new LifeSupport();
    _lifeSupport.start();

    try {
      this._dusForMeSi(MetaWrapper.CONS_MB_UID,
          this.fsClusterSimpleStorageFacade.crermroSimpleStorage(this.strDtd));
      this._dusForMeSi(MetaWrapper.CONS_GRP_UID,
          this.fsClusterSimpleStorageFacade.crergrSimpleStorage(
              DatabaseLogProvider.nullDatabaseLogProvider(), this.strDtd));
      this._dupsaForMeSt(MetaWrapper.FIN_FLSD,
          this.fsClusterSimpleStorageFacade.crelfesrStateStorage(
              DatabaseLogProvider.nullDatabaseLogProvider(), this.strDtd,
              _lifeSupport));
      this._dupsaForMeSt(MetaWrapper.META_WRAPPER_LES_LEASABLE_META,
          this.fsClusterSimpleStorageFacade.crelesaStateStorage(
              DatabaseLogProvider.nullDatabaseLogProvider(), this.strDtd,
              _lifeSupport));
      this._dupsaForMeSt(MetaWrapper.META_WRAPPER_SESNAE_REPLICATION_SESSION_MANAGER_META,
          this.fsClusterSimpleStorageFacade.cresitasgStateStorage(
              DatabaseLogProvider.nullDatabaseLogProvider(), this.strDtd,
              _lifeSupport));
      this._dupsaForMeSt(MetaWrapper.CONS_MBX,
          this.fsClusterSimpleStorageFacade.crermrsgStateStorage(
              DatabaseLogProvider.nullDatabaseLogProvider(), this.strDtd,
              _lifeSupport));
      this._dupsaForMeSt(MetaWrapper.CONS_TER,
          this.fsClusterSimpleStorageFacade.crertsteStateStorage(
              DatabaseLogProvider.nullDatabaseLogProvider(), this.strDtd,
              _lifeSupport));
      this._dupsaForMeSt(MetaWrapper.CONS_VOT,
          this.fsClusterSimpleStorageFacade.crervsteStateStorage(
              DatabaseLogProvider.nullDatabaseLogProvider(), this.strDtd,
              _lifeSupport));
    } finally {
      _lifeSupport.shutdown();
    }
  }
}
