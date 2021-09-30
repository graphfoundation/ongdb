package io.github.onograph.cluster.raft.share.sync;

import io.github.onograph.cluster.raft.share.meta.fsm.DefaultSDEmptyReq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.logging.Log;
import org.neo4j.procedure.Admin;
import org.neo4j.procedure.Context;
import org.neo4j.procedure.Description;
import org.neo4j.procedure.Mode;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.Procedure;


public class DataSyncRunnerStatsManager {


  private static final Map<String, GdbPerfTracker> mapBecassd = new HashMap();


  @Context
  public DatabaseManager<?> databaseManagerDaamnObject;


  @Context
  public Log log;


  @Context
  public SecurityContext securityContext;


  private Syncerator _gerptfrSyncerator(String gdbName) {
    return this.databaseManagerDaamnObject.getDatabaseContext(gdbName).orElseThrow(() ->
        {
          return new IllegalStateException(
              "*** Error: 5d115b87-271d-4234-894b-aa2a0723b103");
        }).dependencies()
        .resolveDependency(Syncerator.class);
  }


  @Admin
  @Description(io.github.onograph.TokenConstants.DATA_SYNC_RUNNER_STATS_MANAGER___DESCRIPTION__GDB_NAME)
  @Procedure(
      name = io.github.onograph.TokenConstants.DATA_SYNC_RUNNER_STATS_MANAGER___PROCEDURE__GDB_NAME__NAME,
      mode = Mode.DBMS
  )
  public synchronized Stream<PerformanceStatsMeta> stoStream(
      @Name(io.github.onograph.TokenConstants.DATA_SYNC_RUNNER_STATS_MANAGER___NAME__GDB_NAME) String gdbName)
      throws InterruptedException {
    if (!mapBecassd.containsKey(gdbName)) {

      throw new IllegalStateException("*** Error: 9aeae0f0-7ab8-4ac1-a41b-fd4e671a1870");
    } else {

      GdbPerfTracker _bnhakGdbPerfTracker = mapBecassd.remove(gdbName);

      PerformanceStatsMeta _rbPerformanceStatsMeta = _bnhakGdbPerfTracker.stoPerformanceStatsMeta();
      return Stream.of(_rbPerformanceStatsMeta);
    }
  }


  @Admin
  @Description(io.github.onograph.TokenConstants.DATA_SYNC_RUNNER_STATS_MANAGER___DESCRIPTION)
  @Procedure(
      name = io.github.onograph.TokenConstants.DATA_SYNC_RUNNER_STATS_MANAGER___PROCEDURE__NAME,
      mode = Mode.DBMS
  )
  public synchronized void strForStLoLo(
      @Name(io.github.onograph.TokenConstants.DATA_SYNC_RUNNER_STATS_MANAGER___NAME__GDB_NAME) String gdbName,
      @Name(io.github.onograph.TokenConstants.DATA_SYNC_RUNNER_STATS_MANAGER___NAME___LG_SBL) Long _lgSbl,
      @Name(io.github.onograph.TokenConstants.DATA_SYNC_RUNNER_STATS_MANAGER___NAME___LG_TNL) Long _lgTnl) {
    if (mapBecassd.containsKey(gdbName)) {

      throw new IllegalStateException("*** Error:  ee531ad6-b06d-4458-8846-9594dc7b15ed");
    } else {

      int _iSb = StrictMath.toIntExact(_lgSbl);

      int _iTn = StrictMath.toIntExact(_lgTnl);

      Syncerator _rdSyncerator = this._gerptfrSyncerator(gdbName);

      GdbPerfTracker _bnhakGdbPerfTracker = GdbPerfTracker.strDataSyncRunnerStatsManagerGdbPerfTracker(
          gdbName, _iTn, (id) ->
          {
            return new io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager.SyncRunner(
                id, _iSb, _rdSyncerator);
          });
      mapBecassd.put(gdbName, _bnhakGdbPerfTracker);
    }
  }


  private static class GdbPerfTracker {


    private final String gdbName;


    private final long lgTs;


    private final List<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager.SyncRunner> listWresSyncRunner;


    private GdbPerfTracker(String gdbName, long _lgTs,
        List<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager.SyncRunner> _listWresSyncRunner) {
      this.gdbName = gdbName;
      this.lgTs = _lgTs;
      this.listWresSyncRunner = _listWresSyncRunner;
    }


    static GdbPerfTracker strDataSyncRunnerStatsManagerGdbPerfTracker(String gdbName, int _iNt,
        IntFunction<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager.SyncRunner> _intFunctionWfSyncRunner) {

      List<io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager.SyncRunner> _listWresSyncRunner =
          IntStream.range(0, _iNt).mapToObj(_intFunctionWfSyncRunner).collect(Collectors.toList());
      _listWresSyncRunner.forEach(
          io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager.SyncRunner::str);
      return new GdbPerfTracker(gdbName, System.currentTimeMillis(), _listWresSyncRunner);
    }


    PerformanceStatsMeta stoPerformanceStatsMeta() throws InterruptedException {

      Iterator _iterator = this.listWresSyncRunner.iterator();

      io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager.SyncRunner _wdSyncRunner;
      while (_iterator.hasNext()) {
        _wdSyncRunner = (io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager.SyncRunner) _iterator.next();
        _wdSyncRunner.setNotRunning();
      }

      _iterator = this.listWresSyncRunner.iterator();

      while (_iterator.hasNext()) {
        _wdSyncRunner = (io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager.SyncRunner) _iterator.next();
        _wdSyncRunner.joinThread();
      }

      long _lgTr = System.currentTimeMillis() - this.lgTs;

      long _lgRt = 0L;

      long sizeCnt = 0L;

      io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager.SyncRunner _wreSyncRunner;
      for (

          Iterator _iterator2 = this.listWresSyncRunner.iterator(); _iterator2.hasNext();
          sizeCnt += _wreSyncRunner.sizeCnt) {
        _wreSyncRunner = (io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager.SyncRunner) _iterator2.next();
        _lgRt += _wreSyncRunner.toarees;
      }

      return new PerformanceStatsMeta(this.gdbName, _lgTr, _lgRt, sizeCnt);
    }
  }


  private class SyncRunner implements Runnable {


    private final int iI;


    private final int iSb;


    private final Syncerator rpiaoSyncerator;


    long sizeCnt;


    long toarees;


    private volatile boolean notRunning;


    private Thread thread;


    SyncRunner(int _iI, int _iSb, Syncerator _rpiaoSyncerator) {
      this.iI = _iI;
      this.iSb = _iSb;
      this.rpiaoSyncerator = _rpiaoSyncerator;
    }


    void joinThread() throws InterruptedException {
      this.thread.join();
    }

    @Override
    public void run() {
      while (true) {
        try {
          if (!this.notRunning) {

            SyncMeta _rrSyncMeta = this.rpiaoSyncerator.relaSyncMeta(
                new DefaultSDEmptyReq(new byte[this.iSb]));
            if (_rrSyncMeta.getReslt()
                != io.github.onograph.cluster.raft.share.sync.SyncMeta.SyncMetaType.SMT_COM_OK) {

              throw new RuntimeException("*** Error:  7b53b565-1e3d-485c-94f1-3e229f538bec",
                  _rrSyncMeta.getFiueThrowable());
            }

            DefaultSDEmptyReq _rqetDefaultSDEmptyReq = _rrSyncMeta.getSmrFSMData().cose();
            ++this.toarees;
            this.sizeCnt += _rqetDefaultSDEmptyReq.byecu();
            continue;
          }
        } catch (

            Throwable _throwable) {

        }

        return;
      }
    }


    void setNotRunning() {
      this.notRunning = true;
    }


    void str() {
      this.thread = new Thread(this, io.github.onograph.I18N.format(
          "io.github.onograph.cluster.raft.share.sync.DataSyncRunnerStatsManager.SyncRunner.rpiaoSyncerator",
          this.iI));
      this.thread.start();
    }
  }
}
