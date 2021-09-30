package io.github.onograph.dbms.gdb;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Clock;
import java.time.Instant;
import java.util.Arrays;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.dbms.archive.CompressionFormat;
import org.neo4j.dbms.archive.Dumper;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.util.Id;


class LifecycleAdapterGdbFlushingImpl extends LifecycleAdapter {


  private final Clock clock;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final Path rdPath;


  private volatile boolean isSatd;

  LifecycleAdapterGdbFlushingImpl(Clock _clock, Config _config,
      FileSystemAbstraction _fFileSystemAbstraction) {
    this.clock = _clock;
    this.rdPath = _config.get(GraphDatabaseSettings.database_dumps_root_path);
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.isSatd = false;
  }


  private static boolean _isOnoForPaSt(Path _path, String... _strNmsArray) {
    return Arrays.asList(_strNmsArray).contains(_path.getFileName().toString());
  }


  private Path _daadmlaPath(NamedDatabaseId _namedDatabaseId) {

    String _strIds = (new Id(_namedDatabaseId.databaseId().uuid())).toString();

    long _lgSe = Instant.now(this.clock).getEpochSecond();

    String _strNdd = String.format("%s-%s-%s.dump", _namedDatabaseId.name(), _strIds, _lgSe);
    return this.rdPath.resolve(_strNdd);
  }


  void dumForDa(DatabaseContext _cDatabaseContext) {
    if (this.isSatd) {

      NamedDatabaseId _namedDatabaseId = _cDatabaseContext.database().getNamedDatabaseId();

      try {

        DatabaseLayout _ldDatabaseLayout = _cDatabaseContext.databaseFacade().databaseLayout();

        Path _dpPath = _ldDatabaseLayout.databaseDirectory();

        Path _ptPath = _ldDatabaseLayout.getTransactionLogsDirectory();

        String _strFl = _ldDatabaseLayout.databaseLockFile().getFileName().toString();

        String _strFmq = _ldDatabaseLayout.quarantineMarkerFile().getFileName().toString();

        Dumper _dumper = new Dumper();

        Path _oPath = this._daadmlaPath(_namedDatabaseId);
        _dumper.dump(_dpPath, _ptPath, _oPath, CompressionFormat.selectCompressionFormat(),
            (path) ->
            {
              return _isOnoForPaSt(path, _strFl, _strFmq);
            });
      } catch (

          IOException _iOException) {

        throw new DatabaseManagementException("*** Error: 86190fe8-98cb-413a-a143-aec17c61c9d9",
            _iOException);
      }
    }
  }

  @Override
  public void start() throws Exception {
    this.fFileSystemAbstraction.mkdirs(this.rdPath);
    this.isSatd = true;
  }

  @Override
  public void stop() {
    this.isSatd = false;
  }
}
