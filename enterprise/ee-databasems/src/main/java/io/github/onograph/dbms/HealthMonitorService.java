package io.github.onograph.dbms;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.Neo4jLayout;
import org.neo4j.io.marshal.StringChannelMarshal;
import org.neo4j.io.state.SimpleFileStorage;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.memory.MemoryTracker;


public class HealthMonitorService {


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final Log log;


  private final Map<NamedDatabaseId, String> mapMqsns;


  private final MemoryTracker memoryTracker;


  private final Neo4jLayout neo4jLayout;


  public HealthMonitorService(FileSystemAbstraction _fFileSystemAbstraction,
      LogProvider _logProvider, MemoryTracker _memoryTracker, Neo4jLayout _neo4jLayout) {
    this.log = _logProvider.getLog(this.getClass());
    this.neo4jLayout = _neo4jLayout;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.memoryTracker = _memoryTracker;
    this.mapMqsns = new ConcurrentHashMap();
  }


  private SimpleFileStorage<String> _gemkSimpleFileStorage(NamedDatabaseId _namedDatabaseId) {

    Path _pmPath = this.neo4jLayout.databaseLayout(_namedDatabaseId.name()).quarantineMarkerFile();
    return new SimpleFileStorage(this.fFileSystemAbstraction, _pmPath, new StringChannelMarshal(),
        this.memoryTracker);
  }


  private Optional<String> _redmrrOptional(NamedDatabaseId _namedDatabaseId) {

    SimpleFileStorage<String> _simpleFileStorageSoaeString = this._gemkSimpleFileStorage(
        _namedDatabaseId);
    if (!_simpleFileStorageSoaeString.exists()) {
      return Optional.empty();
    } else {
      try {

        String m = _simpleFileStorageSoaeString.readState();
        if (m.isEmpty()) {

          return Optional.of(
              io.github.onograph.I18N.format("io.github.onograph.dbms.HealthMonitorService.of"));
        } else {
          return Optional.of(m);
        }
      } catch (

          IOException _iOException) {

        return Optional.of(
            io.github.onograph.I18N.format("io.github.onograph.dbms.HealthMonitorService.of2"));
      }
    }
  }


  private void _reomkForNa(NamedDatabaseId _namedDatabaseId) {

    SimpleFileStorage<String> _simpleFileStorageSoaeString = this._gemkSimpleFileStorage(
        _namedDatabaseId);
    if (_simpleFileStorageSoaeString.exists()) {
      try {
        _simpleFileStorageSoaeString.removeState();
      } catch (

          IOException _iOException) {

        String _strErr = String.format(
            io.github.onograph.I18N.format("io.github.onograph.dbms.HealthMonitorService.format2"),
            _namedDatabaseId);

        throw new UncheckedIOException("*** Error: 3ba1a45d-6bc2-481b-a602-8a01ccf4532c",
            _iOException);
      }
    }
  }


  private void _wrtmaeForNaSt(String m, NamedDatabaseId _namedDatabaseId) {

    SimpleFileStorage _simpleFileStorage = this._gemkSimpleFileStorage(_namedDatabaseId);

    try {
      _simpleFileStorage.writeState(m);
    } catch (

        IOException _iOException) {

      String _strErr =
          String.format(
              io.github.onograph.I18N.format("io.github.onograph.dbms.HealthMonitorService.format"),
              _namedDatabaseId);

      throw new UncheckedIOException("*** Error: 2a6e47fe-c450-4b31-9be5-7c52794ed560",
          _iOException);
    }
  }


  Map<NamedDatabaseId, String> chqnmrMap(Collection<NamedDatabaseId> _collectionIdNamedDatabaseId) {
    return _collectionIdNamedDatabaseId.stream().filter((databaseId) ->
    {
      return !DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID.equals(databaseId);
    }).flatMap((databaseId) ->
    {
      return this._redmrrOptional(databaseId).map((msg) ->
      {
        return Map.entry(databaseId,
            msg);
      }).stream();
    }).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
  }


  public void reeqaemeForNa(NamedDatabaseId _namedDatabaseId) {
    this.mapMqsns.remove(_namedDatabaseId);
    this._reomkForNa(_namedDatabaseId);
  }


  public void seqaimrForNa(NamedDatabaseId _namedDatabaseId) {
    if (DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID.equals(_namedDatabaseId)) {

    } else {

      String m = this.mapMqsns.get(_namedDatabaseId);
      if (m == null) {

        throw new IllegalStateException("*** Error:  91efab23-9012-494c-a56d-e05026d80378");
      } else {
        this._wrtmaeForNaSt(m, _namedDatabaseId);
      }
    }
  }


  void stqnmgForNaSt(String m, NamedDatabaseId _namedDatabaseId) {
    if (DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID.equals(_namedDatabaseId)) {

    } else {
      this.mapMqsns.put(_namedDatabaseId, m);
    }
  }
}
