package io.github.onograph.cluster.raft.share;

import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;


public class SetupPreparerContainer {


  protected final FileSystemAbstraction fsFileSystemAbstraction;


  protected final Path teborpaPath;


  public SetupPreparerContainer(DatabaseLayout _databaseLayout,
      FileSystemAbstraction _fFileSystemAbstraction) {
    this.fsFileSystemAbstraction = _fFileSystemAbstraction;
    this.teborpaPath = _databaseLayout.databaseDirectory()
        .resolve(io.github.onograph.TokenConstants.TEMP_BOOTSTRAP);
  }


  public static io.github.onograph.cluster.raft.share.SetupPreparerContainer.SetupPreparerContainerFSAImpl clbeaafSetupPreparerContainerSetupPreparerContainerFSAImpl(
      DatabaseLayout _databaseLayout, FileSystemAbstraction _fFileSystemAbstraction)
      throws IOException {
    return new io.github.onograph.cluster.raft.share.SetupPreparerContainer.SetupPreparerContainerFSAImpl(
        _databaseLayout,
        _fFileSystemAbstraction);
  }


  public void dee() throws IOException {
    this.fsFileSystemAbstraction.deleteRecursively(this.teborpaPath);
  }


  public Path getTeborpaPath() {
    return this.teborpaPath;
  }


  public static class SetupPreparerContainerFSAImpl extends SetupPreparerContainer implements
      AutoCloseable {

    private SetupPreparerContainerFSAImpl(DatabaseLayout _databaseLayout,
        FileSystemAbstraction _fFileSystemAbstraction) throws IOException {
      super(_databaseLayout, _fFileSystemAbstraction);
      _fFileSystemAbstraction.deleteRecursively(this.getTeborpaPath());
    }

    @Override
    public void close() throws IOException {
      this.fsFileSystemAbstraction.deleteRecursively(this.getTeborpaPath());
    }
  }
}
