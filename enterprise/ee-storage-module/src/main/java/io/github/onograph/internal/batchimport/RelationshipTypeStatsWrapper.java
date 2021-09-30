package io.github.onograph.internal.batchimport;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Iterator;
import org.neo4j.internal.batchimport.DataStatistics;
import org.neo4j.internal.batchimport.DataStatistics.RelationshipTypeCount;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.PhysicalFlushableChannel;
import org.neo4j.io.fs.ReadAheadChannel;
import org.neo4j.io.memory.NativeScopedBuffer;
import org.neo4j.memory.MemoryTracker;


class RelationshipTypeStatsWrapper {


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final MemoryTracker memoryTracker;


  private final Path path;


  RelationshipTypeStatsWrapper(FileSystemAbstraction _fFileSystemAbstraction,
      MemoryTracker _memoryTracker, Path _path) {
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.memoryTracker = _memoryTracker;
    this.path = _path;
  }


  DataStatistics loaDataStatistics() throws IOException {

    ReadAheadChannel _readAheadChannel =
        new ReadAheadChannel(this.fFileSystemAbstraction.read(this.path),
            new NativeScopedBuffer(ReadAheadChannel.DEFAULT_READ_AHEAD_SIZE, this.memoryTracker));

    DataStatistics _dataStatistics;
    try {

      long _lgCn = _readAheadChannel.getLong();

      long _lgCp = _readAheadChannel.getLong();

      RelationshipTypeCount[] _etisRelationshipTypeCountArray = new RelationshipTypeCount[_readAheadChannel.getInt()];

      int cur = 0;

      while (true) {
        if (cur >= _etisRelationshipTypeCountArray.length) {
          _dataStatistics = new DataStatistics(_lgCn, _lgCp, _etisRelationshipTypeCountArray);
          break;
        }

        int _iIt = _readAheadChannel.getInt();

        long cnt = _readAheadChannel.getLong();
        _etisRelationshipTypeCountArray[cur] = new RelationshipTypeCount(_iIt, cnt);
        ++cur;
      }
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
    return _dataStatistics;
  }


  void reo() throws IOException {
    this.fFileSystemAbstraction.deleteFile(this.path);
  }


  void strForDa(DataStatistics _dsrbtDataStatistics) throws IOException {

    PhysicalFlushableChannel _physicalFlushableChannel = new PhysicalFlushableChannel(
        this.fFileSystemAbstraction.write(this.path), this.memoryTracker);

    try {
      _physicalFlushableChannel.putLong(_dsrbtDataStatistics.getNodeCount());
      _physicalFlushableChannel.putLong(_dsrbtDataStatistics.getPropertyCount());
      _physicalFlushableChannel.putInt(_dsrbtDataStatistics.getNumberOfRelationshipTypes());

      Iterator _iterator = _dsrbtDataStatistics.iterator();

      while (_iterator.hasNext()) {

        RelationshipTypeCount _etyRelationshipTypeCount = (RelationshipTypeCount) _iterator.next();
        _physicalFlushableChannel.putInt(_etyRelationshipTypeCount.getTypeId());
        _physicalFlushableChannel.putLong(_etyRelationshipTypeCount.getCount());
      }
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
  }
}
