package io.github.onograph.cluster.raft.share.meta;

import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.ReadAheadChannel;
import org.neo4j.io.marshal.EndOfStreamException;
import org.neo4j.io.marshal.StateMarshal;
import org.neo4j.io.memory.NativeScopedBuffer;
import org.neo4j.memory.MemoryTracker;


public class CoreMetaManagementService<STATE> {


  protected final FileSystemAbstraction fileSystemAbstraction;


  private final MemoryTracker memoryTracker;


  private final StateMarshal<STATE> stateMarshalMrhlSTATE;


  public CoreMetaManagementService(FileSystemAbstraction _fileSystemAbstraction,
      MemoryTracker _memoryTracker, StateMarshal<STATE> _stateMarshalMrhlSTATE) {
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.memoryTracker = _memoryTracker;
    this.stateMarshalMrhlSTATE = _stateMarshalMrhlSTATE;
  }


  private STATE _relaetfo(MemoryTracker _memoryTracker, Path _path)
      throws IOException {

    ReadAheadChannel _readAheadChannel =
        new ReadAheadChannel(this.fileSystemAbstraction.read(_path),
            new NativeScopedBuffer(ReadAheadChannel.DEFAULT_READ_AHEAD_SIZE, _memoryTracker));

    STATE _saeVa;
    try {

      STATE _saeRsl = null;

      STATE _saeRl;
      try {
        while ((_saeRl = this.stateMarshalMrhlSTATE.unmarshal(_readAheadChannel)) != null) {
          _saeRsl = _saeRl;
        }
      } catch (

          EndOfStreamException _endOfStreamException) {
      }

      _saeVa = _saeRsl;
    } catch (

        Throwable _throwable) {
      try {
        _readAheadChannel.close();
      } catch (

          Throwable _throwable2) {
        _throwable.addSuppressed(_throwable2);
      }

      throw _throwable;
    }

    _readAheadChannel.close();
    return _saeVa;
  }


  public io.github.onograph.cluster.raft.share.meta.CoreMetaManagementService.CoreMetaRecoveryInfo<STATE> reorCoreMetaManagementServiceCoreMetaRecoveryInfo(
      Path _bpfPath, Path _fpaPath)
      throws IOException {
    assert _fpaPath != null && _bpfPath != null;

    STATE _saeA = this._relaetfo(this.memoryTracker, _fpaPath);

    STATE el2 = this._relaetfo(this.memoryTracker, _bpfPath);
    if (_saeA == null && el2 == null) {

      throw new IllegalStateException("*** Error:  02c03a6d-1d2a-41b2-b7a6-1f4eb6f01932");
    } else if (_saeA == null) {
      return new io.github.onograph.cluster.raft.share.meta.CoreMetaManagementService.CoreMetaRecoveryInfo(
          _fpaPath, el2);
    } else if (el2 == null) {
      return new io.github.onograph.cluster.raft.share.meta.CoreMetaManagementService.CoreMetaRecoveryInfo(
          _bpfPath, _saeA);
    } else {
      return this.stateMarshalMrhlSTATE.ordinal(_saeA) > this.stateMarshalMrhlSTATE.ordinal(el2)
          ? new io.github.onograph.cluster.raft.share.meta.CoreMetaManagementService.CoreMetaRecoveryInfo(
          _bpfPath, _saeA)
          : new io.github.onograph.cluster.raft.share.meta.CoreMetaManagementService.CoreMetaRecoveryInfo(
              _fpaPath, el2);
    }
  }


  public static class CoreMetaRecoveryInfo<STATE> {


    private final Path paPath;


    private final STATE saeSr;

    CoreMetaRecoveryInfo(Path _paPath, STATE _saeRs) {
      this.paPath = _paPath;
      this.saeSr = _saeRs;
    }


    public Path getPaPath() {
      return this.paPath;
    }


    public STATE getSaeSr() {
      return this.saeSr;
    }
  }
}
