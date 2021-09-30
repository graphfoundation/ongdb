package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobMonitoringParams;
import org.neo4j.scheduler.JobScheduler;


@Documented(io.github.onograph.TokenConstants.GDB_STORE_STATS_ADAPTER___DOCUMENTED)
public class GdbStoreStatsAdapter extends AbstractMetricsLifecycleAdapter {


  public static final Duration UPAIEA_DURATION = Duration.ofMinutes(10L);


  @Documented(io.github.onograph.TokenConstants.GDB_STORE_STATS_ADAPTER___DOCUMENTED_CNT_DST_SIZ)
  private static final String CNT_DST_SIZ =
      MetricRegistry.name(io.github.onograph.TokenConstants.STORE__SIZE,
          io.github.onograph.TokenConstants.TOTAL);


  @Documented(io.github.onograph.TokenConstants.GDB_STORE_STATS_ADAPTER___DOCUMENTED_GDB_SIZ)
  private static final String GDB_SIZ =
      MetricRegistry.name(io.github.onograph.TokenConstants.STORE__SIZE,
          io.github.onograph.TokenConstants.DATABASE);


  private static final String PRF = io.github.onograph.TokenConstants.STORE__SIZE;


  private final DatabaseLayout databaseLayout;


  private final FileSystemAbstraction fileSystemAbstraction;


  private final JobScheduler jobScheduler;


  private final MetricRegistryManager metricRegistryManager;


  private final String strSd;


  private final String strSst;


  private volatile long lgSdc;


  private volatile long lgStsc;


  private volatile JobHandle uvhJobHandle;

  public GdbStoreStatsAdapter() {
    this("", null, null, null, null);
  }

  public GdbStoreStatsAdapter(String mprnm, MetricRegistryManager _metricRegistryManager,
      JobScheduler _jobScheduler, FileSystemAbstraction _fileSystemAbstraction,
      DatabaseLayout _databaseLayout) {
    super(EnterpriseMetricsType.EMT_GENERIC);
    this.lgStsc = -1L;
    this.lgSdc = -1L;
    this.metricRegistryManager = _metricRegistryManager;
    this.strSst = MetricRegistry.name(mprnm, CNT_DST_SIZ);
    this.strSd = MetricRegistry.name(mprnm, GDB_SIZ);
    this.jobScheduler = _jobScheduler;
    this.fileSystemAbstraction = _fileSystemAbstraction;
    this.databaseLayout = _databaseLayout;
  }


  private long _geseForPa(Path... _pfPathArray) {

    Set<Path> _setFvPath = new HashSet();
    return Arrays.stream(_pfPathArray).mapToLong((file) ->
    {
      return this._geszieForPaSe(file, _setFvPath);
    }).sum();
  }


  private long _geszieForPaSe(Path _pfPath, Set<Path> _setFvPath) {
    if (!_setFvPath.add(_pfPath)) {
      return 0L;
    } else {
      try {
        if (Files.isDirectory(_pfPath)) {

          Path[] _pipfPathArray = this.fileSystemAbstraction.listFiles(_pfPath);
          return _pipfPathArray.length == 0 ? 0L
              : Arrays.stream(_pipfPathArray).mapToLong((fileInDir) ->
              {
                return this._geszieForPaSe(fileInDir, _setFvPath);
              }).sum();
        } else {
          return this.fileSystemAbstraction.getFileSize(_pfPath);
        }
      } catch (

          IOException _iOException) {
        return 0L;
      }
    }
  }


  private void _upecevu() {
    this.lgSdc = this._geseForPa(this.databaseLayout.databaseDirectory());
    this.lgStsc = this.lgSdc + this._geseForPa(this.databaseLayout.getTransactionLogsDirectory());
  }

  @Override
  public void start() {
    if (this.uvhJobHandle == null) {

      JobMonitoringParams _jobMonitoringParams =
          JobMonitoringParams.systemJob(this.databaseLayout.getDatabaseName(),
              io.github.onograph.I18N.format(
                  "io.github.onograph.metrics.incoming.gdb.GdbStoreStatsAdapter.systemJob"));
      this.uvhJobHandle = this.jobScheduler
          .scheduleRecurring(Group.FILE_IO_HELPER, _jobMonitoringParams, this::_upecevu,
              UPAIEA_DURATION.toMillis(), TimeUnit.MILLISECONDS);
    }

    this.metricRegistryManager.reieForStSu(this.strSst, () ->
    {

      return new MetricsMeter(() -> this.lgStsc);
    });
    this.metricRegistryManager.reieForStSu(this.strSd, () ->
    {
      return new MetricsMeter(() -> this.lgSdc);
    });
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strSd);
    this.metricRegistryManager.reoForSt(this.strSst);
    if (this.uvhJobHandle != null) {
      this.uvhJobHandle.cancel();
      this.uvhJobHandle = null;
    }
  }
}
