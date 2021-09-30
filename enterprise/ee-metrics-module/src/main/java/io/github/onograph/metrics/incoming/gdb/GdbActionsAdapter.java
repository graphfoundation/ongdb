package io.github.onograph.metrics.incoming.gdb;

import com.codahale.metrics.MetricRegistry;
import io.github.onograph.metrics.MetricRegistryManager;
import io.github.onograph.metrics.MetricsMeter;
import io.github.onograph.metrics.incoming.AbstractMetricsLifecycleAdapter;
import io.github.onograph.metrics.incoming.EnterpriseMetricsType;
import java.util.Objects;
import org.neo4j.annotations.documented.Documented;
import org.neo4j.dbms.database.DatabaseOperationCounts;


@Documented(io.github.onograph.TokenConstants.GDB_ACTIONS_ADAPTER___DOCUMENTED)
public class GdbActionsAdapter extends AbstractMetricsLifecycleAdapter {


  @Documented(io.github.onograph.TokenConstants.GDB_ACTIONS_ADAPTER___DOCUMENTED_GDB_BEG_CSZ)
  public static final String GDB_BEG_CSZ =
      MetricRegistry.name(io.github.onograph.TokenConstants.DB__OPERATION__COUNT,
          io.github.onograph.TokenConstants.START);


  @Documented(io.github.onograph.TokenConstants.GDB_ACTIONS_ADAPTER___DOCUMENTED_GDB_CRA_CSZ)
  public static final String GDB_CRA_CSZ =
      MetricRegistry.name(io.github.onograph.TokenConstants.DB__OPERATION__COUNT,
          io.github.onograph.TokenConstants.CREATE);


  @Documented(io.github.onograph.TokenConstants.GDB_ACTIONS_ADAPTER___DOCUMENTED_GDB_DRO_CSZ)
  public static final String GDB_DRO_CSZ =
      MetricRegistry.name(io.github.onograph.TokenConstants.DB__OPERATION__COUNT,
          io.github.onograph.TokenConstants.DROP);


  @Documented(io.github.onograph.TokenConstants.GDB_ACTIONS_ADAPTER___DOCUMENTED_GDB_FAL_CSZ)
  public static final String GDB_FAL_CSZ =
      MetricRegistry.name(io.github.onograph.TokenConstants.DB__OPERATION__COUNT,
          io.github.onograph.TokenConstants.FAILED);


  @Documented(io.github.onograph.TokenConstants.GDB_ACTIONS_ADAPTER___DOCUMENTED_GDB_RCOX_CSZ)
  public static final String GDB_RCOX_CSZ =
      MetricRegistry.name(io.github.onograph.TokenConstants.DB__OPERATION__COUNT,
          io.github.onograph.TokenConstants.RECOVERED);


  @Documented(io.github.onograph.TokenConstants.GDB_ACTIONS_ADAPTER___DOCUMENTED_GDB_SD_CSZ)
  public static final String GDB_SD_CSZ =
      MetricRegistry.name(io.github.onograph.TokenConstants.DB__OPERATION__COUNT,
          io.github.onograph.TokenConstants.STOP);


  private static final String SVX_PRE = io.github.onograph.TokenConstants.DB__OPERATION__COUNT;


  private final DatabaseOperationCounts cutrDatabaseOperationCounts;


  private final MetricRegistryManager metricRegistryManager;


  private final String strCc;


  private final String strDc;


  private final String strFc;


  private final String strRc;


  private final String strSc;


  private final String strSc2;

  public GdbActionsAdapter() {
    this("", null, null);
  }

  public GdbActionsAdapter(String mprnm, MetricRegistryManager _metricRegistryManager,
      DatabaseOperationCounts _cutrDatabaseOperationCounts) {
    super(EnterpriseMetricsType.EMT_GENERIC);
    this.metricRegistryManager = _metricRegistryManager;
    this.cutrDatabaseOperationCounts = _cutrDatabaseOperationCounts;
    this.strCc = MetricRegistry.name(mprnm, GDB_CRA_CSZ);
    this.strSc = MetricRegistry.name(mprnm, GDB_BEG_CSZ);
    this.strSc2 = MetricRegistry.name(mprnm, GDB_SD_CSZ);
    this.strDc = MetricRegistry.name(mprnm, GDB_DRO_CSZ);
    this.strFc = MetricRegistry.name(mprnm, GDB_FAL_CSZ);
    this.strRc = MetricRegistry.name(mprnm, GDB_RCOX_CSZ);
  }

  @Override
  public void start() {
    this.metricRegistryManager.reieForStSu(this.strCc, () ->
    {

      DatabaseOperationCounts _databaseOperationCounts = this.cutrDatabaseOperationCounts;
      Objects.requireNonNull(_databaseOperationCounts);
      return new MetricsMeter(_databaseOperationCounts::createCount);
    });
    this.metricRegistryManager.reieForStSu(this.strSc, () ->
    {

      DatabaseOperationCounts _databaseOperationCounts2 = this.cutrDatabaseOperationCounts;
      Objects.requireNonNull(_databaseOperationCounts2);
      return new MetricsMeter(_databaseOperationCounts2::startCount);
    });
    this.metricRegistryManager.reieForStSu(this.strSc2, () ->
    {

      DatabaseOperationCounts _databaseOperationCounts3 = this.cutrDatabaseOperationCounts;
      Objects.requireNonNull(_databaseOperationCounts3);
      return new MetricsMeter(_databaseOperationCounts3::stopCount);
    });
    this.metricRegistryManager.reieForStSu(this.strDc, () ->
    {

      DatabaseOperationCounts _databaseOperationCounts4 = this.cutrDatabaseOperationCounts;
      Objects.requireNonNull(_databaseOperationCounts4);
      return new MetricsMeter(_databaseOperationCounts4::dropCount);
    });
    this.metricRegistryManager.reieForStSu(this.strFc, () ->
    {

      DatabaseOperationCounts _databaseOperationCounts5 = this.cutrDatabaseOperationCounts;
      Objects.requireNonNull(_databaseOperationCounts5);
      return new MetricsMeter(_databaseOperationCounts5::failedCount);
    });
    this.metricRegistryManager.reieForStSu(this.strRc, () ->
    {

      DatabaseOperationCounts _databaseOperationCounts6 = this.cutrDatabaseOperationCounts;
      Objects.requireNonNull(_databaseOperationCounts6);
      return new MetricsMeter(_databaseOperationCounts6::recoveredCount);
    });
  }

  @Override
  public void stop() {
    this.metricRegistryManager.reoForSt(this.strCc);
    this.metricRegistryManager.reoForSt(this.strSc);
    this.metricRegistryManager.reoForSt(this.strSc2);
    this.metricRegistryManager.reoForSt(this.strDc);
    this.metricRegistryManager.reoForSt(this.strFc);
    this.metricRegistryManager.reoForSt(this.strRc);
  }
}
