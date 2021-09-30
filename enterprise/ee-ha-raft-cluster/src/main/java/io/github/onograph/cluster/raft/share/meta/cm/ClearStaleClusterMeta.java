package io.github.onograph.cluster.raft.share.meta.cm;

import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import org.apache.commons.lang3.ArrayUtils;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.logging.Log;


public class ClearStaleClusterMeta implements MetaUpgradeFlowAction {


  private boolean _isNmrisoForClPaSt(ClusterMetaTopologyInfo _lscClusterMetaTopologyInfo,
      Path _ppPath, String title) {

    Path _pscPath = _lscClusterMetaTopologyInfo.getPscPath();

    String _strDim = _lscClusterMetaTopologyInfo.olmmidsefPath().getParent().getFileName()
        .toString();
    return !_ppPath.equals(_pscPath) || !title.equals(_strDim);
  }


  private void _mitwnctsavriaeForUp(UpgradeMetaEnv _cUpgradeMetaEnv) {

    FileSystemAbstraction _fFileSystemAbstraction = _cUpgradeMetaEnv.getFFileSystemAbstraction();

    ClusterMetaTopologyInfo _lscClusterMetaTopologyInfo = _cUpgradeMetaEnv.getLscClusterMetaTopologyInfo();

    Log _log = _cUpgradeMetaEnv.getLog();

    try {
      if (_fFileSystemAbstraction.fileExists(_lscClusterMetaTopologyInfo.getPscPath())) {

        Path[] _pscoPathArray = _fFileSystemAbstraction.listFiles(
            _lscClusterMetaTopologyInfo.getPscPath(), (path) ->
            {
              return this._isNmrisoForClPaSt(_lscClusterMetaTopologyInfo, path.getParent(),
                  path.getFileName().toString());
            });
        if (ArrayUtils.isNotEmpty(_pscoPathArray)) {

          Path[] _vaPathArray = _pscoPathArray;

          int _iVar = _pscoPathArray.length;

          for (

              int _iV = 0; _iV < _iVar; ++_iV) {

            Path _pscoPath = _vaPathArray[_iV];
            _fFileSystemAbstraction.deleteRecursively(_pscoPath);
          }


        }
      }
    } catch (

        IOException _iOException) {

      throw new UncheckedIOException("*** Error:  9dbe98c2-9b44-42d5-805f-76190c8f7a1e",
          _iOException);
    }
  }

  @Override
  public void pefmseForUp(UpgradeMetaEnv _cUpgradeMetaEnv) {
    this._mitwnctsavriaeForUp(_cUpgradeMetaEnv);
  }
}
