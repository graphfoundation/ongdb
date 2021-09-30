package io.github.onograph.cluster.raft.share.meta.cm;

import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.cluster.raft.share.meta.fsm.ClusterMetaFormat;
import io.github.onograph.cluster.raft.shared.ClusterSimpleStorageFacade;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.TreeMap;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.state.SimpleStorage;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;


public class ClusterMetaSyncManager extends LifecycleAdapter {


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final Log log;


  private final ClusterMetaTopologyInfo lscClusterMetaTopologyInfo;


  private final ClusterSimpleStorageFacade sfClusterSimpleStorageFacade;


  private final DataVersioningFlowManager smDataVersioningFlowManager;


  private final ClusterMetaFormat vtClusterMetaFormat;


  ClusterMetaSyncManager(FileSystemAbstraction _fFileSystemAbstraction,
      ClusterSimpleStorageFacade _fsClusterSimpleStorageFacade, LogProvider _logProvider,
      ClusterMetaTopologyInfo _lscClusterMetaTopologyInfo,
      DataVersioningFlowManager _msDataVersioningFlowManager,
      ClusterMetaFormat _vtClusterMetaFormat) {
    this.lscClusterMetaTopologyInfo = _lscClusterMetaTopologyInfo;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.log = _logProvider.getLog(this.getClass());
    this.smDataVersioningFlowManager = _msDataVersioningFlowManager;
    this.vtClusterMetaFormat = _vtClusterMetaFormat;
    this.sfClusterSimpleStorageFacade = _fsClusterSimpleStorageFacade;
  }


  public static RequiresComponents bulClusterMetaSyncManagerRequiresComponents() {
    return new Factory();
  }


  private void _fihmaForSiCl(SimpleStorage<ClusterMetaFormat> _simpleStorageSvscClusterMetaFormat,
      ClusterMetaFormat _vfClusterMetaFormat) throws IOException {
    _simpleStorageSvscClusterMetaFormat.writeState(_vfClusterMetaFormat);


  }


  private Optional<ClusterMetaFormat> _reclrseviOptional(
      SimpleStorage<ClusterMetaFormat> _simpleStorageSvscClusterMetaFormat)
      throws ClusterSyncerException {
    if (_simpleStorageSvscClusterMetaFormat.exists()) {
      try {
        return Optional.ofNullable(_simpleStorageSvscClusterMetaFormat.readState());
      } catch (

          IOException _iOException) {

        throw new ClusterSyncerException("*** Error: de340a0c-43e6-4728-a25a-1582b07f1987");
      }
    } else {
      return Optional.empty();
    }
  }

  @Override
  public void init() {

    SimpleStorage<ClusterMetaFormat> _simpleStorageSvscClusterMetaFormat = this.sfClusterSimpleStorageFacade.crectsavrsgSimpleStorage();

    ClusterMetaFormat _vpClusterMetaFormat =
        this._reclrseviOptional(_simpleStorageSvscClusterMetaFormat)
            .orElse(ClusterMetaFormat.INTL_CLUSTER_META_FORMAT);

    if (!Objects.equals(_vpClusterMetaFormat, this.vtClusterMetaFormat)) {
      if (!this.smDataVersioningFlowManager.isCauretForClCl(_vpClusterMetaFormat,
          this.vtClusterMetaFormat)) {

        throw new ClusterSyncerException("*** Error: 3240c2fb-50d2-41cc-96a3-35340358f419");
      } else {

        List<MetaUpgradeFlowAction> _listSmnMetaUpgradeFlowAction =
            this.smDataVersioningFlowManager.stfmgoList(_vpClusterMetaFormat,
                this.vtClusterMetaFormat);

        UpgradeMetaEnv _cUpgradeMetaEnv =
            new UpgradeMetaEnv(this.fFileSystemAbstraction, this.sfClusterSimpleStorageFacade,
                this.log, this.lscClusterMetaTopologyInfo,
                this.vtClusterMetaFormat);

        try {

          Iterator _iterator = _listSmnMetaUpgradeFlowAction.iterator();

          while (_iterator.hasNext()) {

            MetaUpgradeFlowAction _steMetaUpgradeFlowAction = (MetaUpgradeFlowAction) _iterator.next();
            _steMetaUpgradeFlowAction.pefmseForUp(_cUpgradeMetaEnv);
          }

          this._fihmaForSiCl(_simpleStorageSvscClusterMetaFormat, this.vtClusterMetaFormat);
        } catch (

            Exception _exception) {

          throw new ClusterSyncerException(_exception,
              "*** Error: 0d098086-ec5c-4635-b19e-b9821cd4cda0");
        }
      }
    }
  }


  public interface RequiresActionOrInit {


    ClusterMetaSyncManager bulClusterMetaSyncManager();


    RequiresActionOrInit wihseClusterMetaSyncManagerRequiresActionOrInit(
        ClusterMetaFormat _clusterMetaFormat, MetaUpgradeFlowAction _metaUpgradeFlowAction);
  }


  public interface RequiresActions {


    RequiresActionOrInit wihseClusterMetaSyncManagerRequiresActionOrInit(
        ClusterMetaFormat _clusterMetaFormat, MetaUpgradeFlowAction _metaUpgradeFlowAction);
  }


  public interface RequiresComponents {


    Versioning asComponents(ClusterMetaTopologyInfo _clusterMetaTopologyInfo,
        ClusterSimpleStorageFacade _clusterSimpleStorageFacade,
        FileSystemAbstraction _fileSystemAbstraction, LogProvider _logProvider);
  }


  public interface Versioning {


    RequiresActions asVersioned(ClusterMetaFormat _clusterMetaFormat);
  }


  static class Factory implements RequiresComponents, Versioning, RequiresActions,
      RequiresActionOrInit {


    private final Map<ClusterMetaFormat, MetaUpgradeFlowAction> mapSmcm = new HashMap();


    private FileSystemAbstraction fFileSystemAbstraction;


    private LogProvider logProvider;


    private ClusterMetaTopologyInfo lscClusterMetaTopologyInfo;


    private ClusterSimpleStorageFacade sfClusterSimpleStorageFacade;


    private ClusterMetaFormat vtClusterMetaFormat;

    private Factory() {
    }

    @Override
    public Versioning asComponents(ClusterMetaTopologyInfo _lscClusterMetaTopologyInfo,
        ClusterSimpleStorageFacade _fsClusterSimpleStorageFacade,
        FileSystemAbstraction _fFileSystemAbstraction, LogProvider _logProvider) {
      this.fFileSystemAbstraction = _fFileSystemAbstraction;
      this.lscClusterMetaTopologyInfo = _lscClusterMetaTopologyInfo;
      this.sfClusterSimpleStorageFacade = _fsClusterSimpleStorageFacade;
      this.logProvider = _logProvider;
      return this;
    }

    @Override
    public RequiresActions asVersioned(ClusterMetaFormat _vtClusterMetaFormat) {
      this.vtClusterMetaFormat = _vtClusterMetaFormat;
      return this;
    }

    @Override
    public ClusterMetaSyncManager bulClusterMetaSyncManager() {
      this.mapSmcm.put(ClusterMetaFormat.INTL_CLUSTER_META_FORMAT, MetaUpgradeFlowAction.DEFAULT);

      TreeMap<ClusterMetaFormat, MetaUpgradeFlowAction> _treeMapSscm = new TreeMap(this.mapSmcm);

      DataVersioningFlowManager _stvDataVersioningFlowManager = new DataVersioningFlowManager(
          _treeMapSscm);
      return new ClusterMetaSyncManager(this.fFileSystemAbstraction,
          this.sfClusterSimpleStorageFacade, this.logProvider,
          this.lscClusterMetaTopologyInfo, _stvDataVersioningFlowManager, this.vtClusterMetaFormat);
    }

    @Override
    public RequiresActionOrInit wihseClusterMetaSyncManagerRequiresActionOrInit(
        ClusterMetaFormat _savClusterMetaFormat, MetaUpgradeFlowAction _sMetaUpgradeFlowAction) {
      this.mapSmcm.put(_savClusterMetaFormat, _sMetaUpgradeFlowAction);
      return this;
    }
  }
}
