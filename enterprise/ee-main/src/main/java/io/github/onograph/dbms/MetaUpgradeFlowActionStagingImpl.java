package io.github.onograph.dbms;

import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.cluster.raft.share.meta.cm.MetaUpgradeFlowAction;
import io.github.onograph.cluster.raft.share.meta.cm.UpgradeMetaEnv;
import io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat;
import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.CopyOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.LogProvider;


public class MetaUpgradeFlowActionStagingImpl implements MetaUpgradeFlowAction {


  private final Neo4jLayout neo4jLayout;

  public MetaUpgradeFlowActionStagingImpl(Neo4jLayout _neo4jLayout) {
    this.neo4jLayout = _neo4jLayout;
  }

  @Override
  public void pefmseForUp(UpgradeMetaEnv _cUpgradeMetaEnv) {

    List<String> _listDnString = _cUpgradeMetaEnv.getLscClusterMetaTopologyInfo().alrtgosList();

    Iterator _iterator = _listDnString.iterator();

    while (_iterator.hasNext()) {

      String gdbName = (String) _iterator.next();

      Path _pmoPath = _cUpgradeMetaEnv.getLscClusterMetaTopologyInfo().qunmrsefPath(gdbName);
      if (_cUpgradeMetaEnv.getFFileSystemAbstraction().fileExists(_pmoPath)) {

        Path _pdPath = this.neo4jLayout.databaseLayout(gdbName).databaseDirectory();

        try {
          if (_cUpgradeMetaEnv.getFFileSystemAbstraction().isDirectory(_pdPath)) {

            Path _pmnPath = this.neo4jLayout.databaseLayout(gdbName).quarantineMarkerFile();
            _cUpgradeMetaEnv.getFFileSystemAbstraction()
                .renameFile(_pmoPath, _pmnPath, new CopyOption[0]);
          } else {

            _cUpgradeMetaEnv.getFFileSystemAbstraction().deleteFile(_pmoPath);
          }
        } catch (

            IOException _iOException) {
          throw new UncheckedIOException(_iOException);
        }
      }
    }
  }


  public static class LifecycleAdapterDefaultImpl extends LifecycleAdapter {


    private final UpgradeMetaEnv cUpgradeMetaEnv;


    private final MetaUpgradeFlowActionStagingImpl metaUpgradeFlowActionStagingImpl;


    public LifecycleAdapterDefaultImpl(FileSystemAbstraction _fileSystemAbstraction,
        LogProvider _logProvider, ClusterMetaTopologyInfo _lscClusterMetaTopologyInfo,
        Neo4jLayout _neo4jLayout) {
      this.cUpgradeMetaEnv = new UpgradeMetaEnv(_fileSystemAbstraction,
          (ClusterSimpleStorageFacade) null,
          _logProvider.getLog(this.getClass()), _lscClusterMetaTopologyInfo,
          (ClusterMetaFormat) null);
      this.metaUpgradeFlowActionStagingImpl = new MetaUpgradeFlowActionStagingImpl(_neo4jLayout);
    }

    @Override
    public void init() throws Exception {
      this.metaUpgradeFlowActionStagingImpl.pefmseForUp(this.cUpgradeMetaEnv);
    }
  }
}
