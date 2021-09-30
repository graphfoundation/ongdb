package io.github.onograph.cluster.raft.share.meta.fsm;

import io.github.onograph.cluster.raft.share.meta.CoreMetaManagementService;
import io.github.onograph.cluster.raft.share.meta.MetaWrapper;
import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.io.ByteUnit;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.PhysicalFlushableChannel;
import org.neo4j.io.marshal.StateMarshal;
import org.neo4j.io.memory.HeapScopedBuffer;
import org.neo4j.io.state.StateStorage;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryTracker;


public class StateStorageLifecycleAdapter<STATE> extends LifecycleAdapter implements
    StateStorage<STATE> {


  private final Path apfPath;


  private final Path bpfPath;


  private final CoreMetaManagementService<STATE> coreMetaManagementServiceMrSTATE;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final int iRbeon;


  private final Log log;


  private final MemoryTracker memoryTracker;


  private final MetaWrapper<STATE> metaWrapperFtSTATE;


  private final StateMarshal<STATE> stateMarshalMrhlSTATE;


  private PhysicalFlushableChannel cscPhysicalFlushableChannel;


  private int iFaiweon;


  private Path pscPath;


  private STATE saeSi;


  public StateStorageLifecycleAdapter(FileSystemAbstraction _fFileSystemAbstraction, int _iNoebr,
      LogProvider _logProvider, MemoryTracker _memoryTracker,
      MetaWrapper<STATE> _metaWrapperTfSTATE, Path _pbPath) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.metaWrapperFtSTATE = _metaWrapperTfSTATE;
    this.stateMarshalMrhlSTATE = _metaWrapperTfSTATE.maslSafeStateMarshal();
    this.iRbeon = _iNoebr;
    this.log = _logProvider.getLog(this.getClass());
    this.memoryTracker = _memoryTracker;
    this.coreMetaManagementServiceMrSTATE = new CoreMetaManagementService(_fFileSystemAbstraction,
        _memoryTracker, this.stateMarshalMrhlSTATE);
    this.apfPath = _pbPath.resolve(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.meta.fsm.StateStorageLifecycleAdapter.resolve",
            _metaWrapperTfSTATE.name()));
    this.bpfPath = _pbPath.resolve(
        io.github.onograph.I18N.format(
            "io.github.onograph.cluster.raft.share.meta.fsm.StateStorageLifecycleAdapter.resolve2",
            _metaWrapperTfSTATE.name()));
  }


  private PhysicalFlushableChannel _chnlfrflPhysicalFlushableChannel(Path _path)
      throws IOException {
    return new PhysicalFlushableChannel(this.fFileSystemAbstraction.write(_path),
        new HeapScopedBuffer(Math.toIntExact(ByteUnit.kibiBytes(512L)), this.memoryTracker));
  }


  private void _cra() throws IOException {
    this._enuesForPa(this.apfPath);
    this._enuesForPa(this.bpfPath);
  }


  private void _enuesForPa(Path _path) throws IOException {
    if (!this.fFileSystemAbstraction.fileExists(_path)) {
      this.fFileSystemAbstraction.mkdirs(_path.getParent());

      PhysicalFlushableChannel _physicalFlushableChannel = this._chnlfrflPhysicalFlushableChannel(
          _path);

      try {
        this.stateMarshalMrhlSTATE.marshal(this.stateMarshalMrhlSTATE.startState(),
            _physicalFlushableChannel);
      } catch (

          Throwable _throwable) {
        if (_physicalFlushableChannel != null) {
          try {
            _physicalFlushableChannel.close();
          } catch (

              Throwable _throwable2) {
            _throwable.addSuppressed(_throwable2);
          }
        }

        throw _throwable;
      }

      if (_physicalFlushableChannel != null) {
        _physicalFlushableChannel.close();
      }
    }
  }


  private PhysicalFlushableChannel _reesteflPhysicalFlushableChannel(Path _snPath)
      throws IOException {
    this.fFileSystemAbstraction.truncate(_snPath, 0L);
    return this._chnlfrflPhysicalFlushableChannel(_snPath);
  }


  private void _reor() throws IOException {

    io.github.onograph.cluster.raft.share.meta.CoreMetaManagementService.CoreMetaRecoveryInfo<STATE> _coreMetaRecoveryInfoRsSTATE =
        this.coreMetaManagementServiceMrSTATE.reorCoreMetaManagementServiceCoreMetaRecoveryInfo(
            this.bpfPath, this.apfPath);
    this.pscPath = _coreMetaRecoveryInfoRsSTATE.getPaPath();
    this.cscPhysicalFlushableChannel = this._reesteflPhysicalFlushableChannel(this.pscPath);
    this.saeSi = _coreMetaRecoveryInfoRsSTATE.getSaeSr();


  }


  private void _swhsef() throws IOException {
    this.cscPhysicalFlushableChannel.close();
    if (this.pscPath.equals(this.apfPath)) {
      this.cscPhysicalFlushableChannel = this._reesteflPhysicalFlushableChannel(this.bpfPath);
      this.pscPath = this.bpfPath;
    } else {
      this.cscPhysicalFlushableChannel = this._reesteflPhysicalFlushableChannel(this.apfPath);
      this.pscPath = this.apfPath;
    }
  }

  @Override
  public boolean exists() {
    return this.fFileSystemAbstraction.fileExists(this.apfPath)
        && this.fFileSystemAbstraction.fileExists(this.bpfPath);
  }

  @Override
  public STATE getInitialState() {
    assert this.saeSi != null;

    return this.saeSi;
  }

  @Override
  public void init() throws IOException {
    this._cra();
    this._reor();
  }

  @Override
  public synchronized void shutdown() throws IOException {
    this.cscPhysicalFlushableChannel.close();
    this.cscPhysicalFlushableChannel = null;
  }

  @Override
  public synchronized void writeState(STATE _saeSae) throws IOException {
    if (this.iFaiweon >= this.iRbeon) {
      this._swhsef();
      this.iFaiweon = 0;
    }

    this.stateMarshalMrhlSTATE.marshal(_saeSae, this.cscPhysicalFlushableChannel);
    this.cscPhysicalFlushableChannel.prepareForFlush().flush();
    ++this.iFaiweon;
  }


}
