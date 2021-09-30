package io.github.onograph.commandline.dbms;

import io.github.onograph.cluster.raft.share.meta.ClusterMetaTopologyInfo;
import io.github.onograph.config.SettingsDeclarationClusterImpl;
import java.io.IOException;
import java.nio.file.Path;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.commandline.dbms.LoadCommand;
import org.neo4j.configuration.Config;
import org.neo4j.dbms.archive.Loader;
import org.neo4j.io.fs.FileSystemAbstraction;


public class ClusterLoadCommand extends LoadCommand {


  private final FileSystemAbstraction fFileSystemAbstraction;

  public ClusterLoadCommand(ExecutionContext _cExecutionContext, Loader _loader) {
    super(_cExecutionContext, _loader);
    this.fFileSystemAbstraction = _cExecutionContext.fs();
  }


  private Path _gerfgudeyPath(Config _config, String gdbName) {
    return ClusterMetaTopologyInfo.ofClusterMetaTopologyInfo(
        _config.get(SettingsDeclarationClusterImpl.settingCleteyPath)).ratgodPath(gdbName);
  }

  @Override
  protected void loadDump() throws IOException {

    Config _config = this.buildConfig();

    Path _rgpPath = this._gerfgudeyPath(_config, this.database.name());
    if (this.fFileSystemAbstraction.fileExists(_rgpPath)) {

      throw new IllegalArgumentException("*** Error: fd4233f7-8961-4b1f-91ca-6e0fe6f1927b");
    } else {
      super.loadDump();
    }
  }
}
