package io.github.onograph.backup;

import io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions;
import io.github.onograph.config.Backup;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseInternalSettings;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.helpers.DatabaseNamePattern;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.consistency.checking.full.ConsistencyFlags;
import org.neo4j.memory.EmptyMemoryTracker;
import org.neo4j.memory.MemoryTracker;


public class BackupEnvironment {


  private final Config config;


  private final ConsistencyFlags consistencyFlags;


  private final DatabaseNamePattern databaseNamePattern;


  private final boolean isBftf;


  private final boolean isCc;


  private final boolean isRp;


  private final boolean isRp2;


  private final MemoryTracker memoryTracker;


  private final AuthMetaOptions miAuthMetaOptions;


  private final Path pbPath;


  private final Path rpPath;


  private final SocketAddress socketAddress;


  private BackupEnvironment(Config _config, ConsistencyFlags _consistencyFlags,
      DatabaseNamePattern _databaseNamePattern, AuthMetaOptions _imAuthMetaOptions, boolean _isBftf,
      boolean _isCc, boolean _isRp, boolean _isRp2, MemoryTracker _memoryTracker, Path _pbPath,
      Path _prPath, SocketAddress _socketAddress) {
    this.config = _config;
    this.consistencyFlags = _consistencyFlags;
    this.databaseNamePattern = _databaseNamePattern;
    this.isBftf = _isBftf;
    this.isCc = _isCc;
    this.isRp = _isRp;
    this.isRp2 = _isRp2;
    this.memoryTracker = _memoryTracker;
    this.miAuthMetaOptions = _imAuthMetaOptions;
    this.pbPath = _pbPath;
    this.rpPath = _prPath;
    this.socketAddress = _socketAddress;
  }


  public static Factory bulrBackupEnvironmentFactory() {
    return new Factory();
  }


  public Optional<AuthMetaOptions> geicmaOptional() {
    return Optional.ofNullable(this.miAuthMetaOptions);
  }


  Config getConfig() {
    return this.config;
  }


  ConsistencyFlags getConsistencyFlags() {
    return this.consistencyFlags;
  }


  public DatabaseNamePattern getDatabaseNamePattern() {
    return this.databaseNamePattern;
  }


  public boolean getIsBftf() {
    return this.isBftf;
  }


  public boolean getIsCc() {
    return this.isCc;
  }


  public boolean getIsRp() {
    return this.isRp;
  }


  public MemoryTracker getMemoryTracker() {
    return this.memoryTracker;
  }


  public Path getPbPath() {
    return this.pbPath;
  }


  public Path getRpPath() {
    return this.rpPath;
  }


  public SocketAddress getSocketAddress() {
    return this.socketAddress;
  }


  public static final class Factory {


    private Config config;


    private DatabaseNamePattern databaseNamePattern;


    private boolean isBftf = true;


    private boolean isCc = true;


    private boolean isCci = true;


    private boolean isGcc = true;


    private boolean isRp = true;


    private boolean isRp2;


    private boolean isSicc = true;


    private AuthMetaOptions miAuthMetaOptions;


    private Path pbPath;


    private Path prPath;


    private SocketAddress socketAddress;

    private Factory() {
    }


    private ConsistencyFlags _bucsyfsConsistencyFlags() {
      return new ConsistencyFlags(this.isGcc, this.isCci, this.isSicc);
    }


    private SocketAddress _buladeSocketAddress() {
      if (this.socketAddress == null) {

        SocketAddress _aldSocketAddress = this.config.get(Backup.settingOneutdSocketAddress);
        this.socketAddress = new SocketAddress(_aldSocketAddress.getHostname(),
            _aldSocketAddress.getPort());
      }

      return this.socketAddress;
    }


    public BackupEnvironment bulBackupEnvironment() {
      this.config = this.gecfConfig();
      this.config.set(GraphDatabaseInternalSettings.do_parallel_recovery, this.isRp2);
      this.databaseNamePattern = this.gedtenprDatabaseNamePattern();
      if (this.pbPath == null) {
        this.pbPath = Paths.get(".");
      }

      if (this.prPath == null) {
        this.prPath = Paths.get(".");
      }

      SocketAddress _socketAddress = this._buladeSocketAddress();

      Path _pbdPath = this.pbPath;

      ConsistencyFlags _consistencyFlags = this._bucsyfsConsistencyFlags();

      EmptyMemoryTracker _emptyMemoryTracker = EmptyMemoryTracker.INSTANCE;
      return new BackupEnvironment(this.config, _consistencyFlags, this.databaseNamePattern,
          this.miAuthMetaOptions, this.isBftf,
          this.isCc, this.isRp,
          this.isRp2, _emptyMemoryTracker, _pbdPath, this.prPath, _socketAddress);
    }


    public Factory config(Config _config) {
      this.config = _config;
      return this;
    }


    public Factory databaseNamePattern(String gdbName) {
      this.databaseNamePattern = new DatabaseNamePattern(gdbName);
      return this;
    }


    public Factory databaseNamePattern(DatabaseNamePattern _databaseNamePattern) {
      this.databaseNamePattern = _databaseNamePattern;
      return this;
    }


    public Config gecfConfig() {
      return this.config == null ? Config.defaults()
          : Config.newBuilder().fromConfig(this.config).build();
    }


    public DatabaseNamePattern gedtenprDatabaseNamePattern() {
      return this.databaseNamePattern != null ? this.databaseNamePattern
          : new DatabaseNamePattern(this.gecfConfig().get(GraphDatabaseSettings.default_database));
    }


    public SocketAddress getSocketAddress() {
      return this.socketAddress;
    }


    public Factory isCc(boolean _isCc) {
      this.isCc = _isCc;
      return this;
    }


    public Factory isFtfb(boolean _isFtfb) {
      this.isBftf = _isFtfb;
      return this;
    }


    public Factory isGcc(Boolean _isGcc) {
      this.isGcc = _isGcc;
      return this;
    }


    public Factory isIcc(Boolean _isIcc) {
      this.isCci = _isIcc;
      return this;
    }


    public Factory isRp(boolean _isRp) {
      this.isRp2 = _isRp;
      return this;
    }


    public Factory isSicc(Boolean _isSicc) {
      this.isSicc = _isSicc;
      return this;
    }


    public Factory miAuthMetaOptions(AuthMetaOptions _miAuthMetaOptions) {
      this.miAuthMetaOptions = _miAuthMetaOptions;
      return this;
    }


    public Factory pbPath(Path _pbPath) {
      this.pbPath = _pbPath;
      return this;
    }


    public Factory prPath(Path _prPath) {
      this.prPath = _prPath;
      return this;
    }


    public Factory shouldPrep(boolean _isRp) {
      this.isRp = _isRp;
      return this;
    }


    public Factory wihadsBackupEnvironmentFactory(int portNumber, String _strHsnm) {
      return this.wihadsBackupEnvironmentFactory(new SocketAddress(_strHsnm, portNumber));
    }


    public Factory wihadsBackupEnvironmentFactory(SocketAddress _socketAddress) {
      this.socketAddress = _socketAddress;
      return this;
    }
  }
}
