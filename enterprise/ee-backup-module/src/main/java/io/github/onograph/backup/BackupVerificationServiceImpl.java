package io.github.onograph.backup;

import java.nio.file.Path;
import org.neo4j.configuration.Config;
import org.neo4j.consistency.ConsistencyCheckService;
import org.neo4j.consistency.ConsistencyCheckService.Result;
import org.neo4j.consistency.checking.full.ConsistencyFlags;
import org.neo4j.internal.helpers.progress.ProgressMonitorFactory;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.logging.LogProvider;


public class BackupVerificationServiceImpl implements BackupVerificationService {


  private final Config config;


  private final ConsistencyCheckService consistencyCheckService;


  private final ConsistencyFlags consistencyFlags;


  private final FileSystemAbstraction fFileSystemAbstraction;


  private final LogProvider logProvider;


  private final Path prPath;


  private final ProgressMonitorFactory progressMonitorFactory;


  public BackupVerificationServiceImpl(Config _config, ConsistencyFlags _consistencyFlags,
      FileSystemAbstraction _fFileSystemAbstraction, LogProvider _logProvider, Path _prPath,
      ProgressMonitorFactory _progressMonitorFactory) {
    this.config = _config;
    this.consistencyFlags = _consistencyFlags;
    this.prPath = _prPath;
    this.progressMonitorFactory = _progressMonitorFactory;
    this.fFileSystemAbstraction = _fFileSystemAbstraction;
    this.logProvider = _logProvider;
    this.consistencyCheckService = new ConsistencyCheckService();
  }

  @Override
  public void chcsyForDa(DatabaseLayout _databaseLayout) throws BackupVerificationErrorException {

    Result _cResult;
    try {
      _cResult = this.consistencyCheckService
          .runFullConsistencyCheck(_databaseLayout,
              Config.newBuilder().fromConfig(this.config).build(), this.progressMonitorFactory,
              this.logProvider, this.fFileSystemAbstraction, false, this.prPath,
              this.consistencyFlags);
    } catch (

        Exception _exception) {

      throw new BackupVerificationErrorException(_exception, true,
          "*** Error:  2915f124-983c-439d-b1ae-a9c5ad06642b");
    }

    if (!_cResult.isSuccessful()) {

      throw new BackupVerificationErrorException(
          false, "*** Error: 7742809e-e412-46a4-8026-52ddc3a1d9f1");
    }
  }
}
