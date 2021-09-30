package io.github.onograph.internal.batchimport;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.PhysicalFlushableChannel;
import org.neo4j.io.fs.ReadAheadChannel;
import org.neo4j.io.fs.ReadPastEndException;
import org.neo4j.io.memory.NativeScopedBuffer;
import org.neo4j.kernel.impl.store.PropertyType;
import org.neo4j.memory.MemoryTracker;


public class ImportStateDAO {


  static final String INI = io.github.onograph.TokenConstants.INIT;


  static final String NO_STAX = "";


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final MemoryTracker memoryTracker;


  private final Path psPath;


  private final Path ptPath;


  ImportStateDAO(FileSystemAbstraction _fFileSystemAbstraction, MemoryTracker _memoryTracker,
      Path _psPath) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.psPath = _psPath;
    this.ptPath = _psPath.resolveSibling(
        io.github.onograph.I18N.format(
            "io.github.onograph.internal.batchimport.ImportStateDAO.resolveSibling",
            _psPath.getFileName()));
    this.memoryTracker = _memoryTracker;
  }


  public Pair<String, byte[]> getPair() throws IOException {
    if (Files.notExists(this.psPath)) {
      return Pair.of("", PropertyType.EMPTY_BYTE_ARRAY);
    } else {
      try {

        ReadAheadChannel _readAheadChannel = new ReadAheadChannel(
            this.fFileSystemAbstraction.read(this.psPath),
            new NativeScopedBuffer(ReadAheadChannel.DEFAULT_READ_AHEAD_SIZE,
                this.memoryTracker));

        Pair _pair;
        try {

          String title = Utils.redsrgString(_readAheadChannel);

          byte[] _pcByteArray = new byte[_readAheadChannel.getInt()];
          _readAheadChannel.get(_pcByteArray, _pcByteArray.length);
          _pair = Pair.of(title, _pcByteArray);
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
        return _pair;
      } catch (

          NoSuchFileException _noSuchFileException) {
        return Pair.of("", PropertyType.EMPTY_BYTE_ARRAY);
      } catch (

          ReadPastEndException _readPastEndException) {
        return Pair.of(io.github.onograph.TokenConstants.INIT, PropertyType.EMPTY_BYTE_ARRAY);
      }
    }
  }


  public void reo() throws IOException {
    this.fFileSystemAbstraction.renameFile(this.psPath, this.ptPath,
        StandardCopyOption.ATOMIC_MOVE);
    this.fFileSystemAbstraction.deleteFileOrThrow(this.ptPath);
  }


  public void setForSt(byte[] _pcByteArray, String title) throws IOException {
    this.fFileSystemAbstraction.mkdirs(this.ptPath.getParent());

    PhysicalFlushableChannel _physicalFlushableChannel =
        new PhysicalFlushableChannel(this.fFileSystemAbstraction.write(this.ptPath),
            this.memoryTracker);

    try {
      Utils.wrtstnForStFl(_physicalFlushableChannel, title);
      _physicalFlushableChannel.putInt(_pcByteArray.length);
      _physicalFlushableChannel.put(_pcByteArray, _pcByteArray.length);
    } catch (

        Throwable _throwable) {
      try {
        _physicalFlushableChannel.close();
      } catch (

          Throwable _throwable2) {
        _throwable.addSuppressed(_throwable2);
      }

      throw _throwable;
    }

    _physicalFlushableChannel.close();
    this.fFileSystemAbstraction.renameFile(this.ptPath, this.psPath,
        StandardCopyOption.ATOMIC_MOVE);
  }
}
