package io.github.onograph.dbms.crash;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.internal.LogService;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.util.Preconditions;


public class CrashManagerImpl implements CrashManager {


  private final Executor executor;


  private final GdbCrashGenerator gdbCrashGenerator;


  private final Log log;


  private final Map<NamedDatabaseId, GdbCrashEventProcessors> mapDbhnc = new ConcurrentHashMap();


  public CrashManagerImpl(GdbCrashGenerator gdbCrashGenerator, JobScheduler _jobScheduler,
      LogService _logService) {
    this.executor = _jobScheduler.executor(Group.PANIC_SERVICE);
    this.log = _logService.getUserLog(this.getClass());
    this.gdbCrashGenerator = gdbCrashGenerator;
  }


  private void _dopacForCr(CrashSignaler.CrashEvent crashEvent) {
    if (crashEvent instanceof GdbCrashEvent) {
      this._paidabeForGd((GdbCrashEvent) crashEvent);
    } else {
      if (!(crashEvent instanceof SysCrashEvent)) {

        throw new IllegalStateException("*** Error: 136a6d4a-22d2-4666-83e4-ee7424406a36",
            crashEvent.gecsThrowable());
      }

      this._paidbForSy((SysCrashEvent) crashEvent);
    }
  }


  private void _paiascForCr(CrashSignaler.CrashEvent crashEvent) {
    this.executor.execute(() ->
    {
      this._dopacForCr(crashEvent);
    });
  }


  private void _paidabeForGd(GdbCrashEvent _epgGdbCrashEvent) {

    GdbCrashEventProcessors _hnlrGdbCrashEventProcessors =
        this.mapDbhnc.get(_epgGdbCrashEvent.getNamedDatabaseId());
    if (_hnlrGdbCrashEventProcessors != null) {
      _hnlrGdbCrashEventProcessors.haedbpaForGd(_epgGdbCrashEvent);
    }
  }


  private void _paidbForSy(SysCrashEvent _epSysCrashEvent) {

    this.gdbCrashGenerator.paiForSy(_epSysCrashEvent);
  }

  @Override
  public void addtepcethlForNaLi(List<? extends DbmsCrashManager> _listHnlrDbmsCrashManager,
      NamedDatabaseId _namedDatabaseId) {

    GdbCrashEventProcessors _hnGdbCrashEventProcessors = new GdbCrashEventProcessors(
        _listHnlrDbmsCrashManager);

    GdbCrashEventProcessors _hoGdbCrashEventProcessors =
        this.mapDbhnc.putIfAbsent(_namedDatabaseId, _hnGdbCrashEventProcessors);
    Preconditions.checkState(_hoGdbCrashEventProcessors == null,
        io.github.onograph.I18N.format("io.github.onograph.dbms.crash.CrashManagerImpl.checkState"),
        _namedDatabaseId);
  }

  @Override
  public CrashSignaler paieCrashSignaler() {
    return this::_paiascForCr;
  }

  @Override
  public GdbCrashSender paiefoGdbCrashSender(NamedDatabaseId _namedDatabaseId) {
    return (reason, error) ->
    {
      this._paiascForCr(new GdbCrashEvent(error, _namedDatabaseId, reason));
    };
  }

  @Override
  public void reedbpaevharForNa(NamedDatabaseId _namedDatabaseId) {
    this.mapDbhnc.remove(_namedDatabaseId);
  }


  private class GdbCrashEventProcessors {

    final List<? extends DbmsCrashManager> listHadrDbmsCrashManager;

    final AtomicBoolean paieAtomicBoolean;

    GdbCrashEventProcessors(List<? extends DbmsCrashManager> _listHnlrDbmsCrashManager) {
      this.listHadrDbmsCrashManager = _listHnlrDbmsCrashManager;
      this.paieAtomicBoolean = new AtomicBoolean();
    }


    void haedbpaForGd(GdbCrashEvent _ipGdbCrashEvent) {
      if (this.paieAtomicBoolean.compareAndSet(false, true)) {

        Iterator _iterator = this.listHadrDbmsCrashManager.iterator();

        while (_iterator.hasNext()) {

          DbmsCrashManager _hnlrDbmsCrashManager = (DbmsCrashManager) _iterator.next();

          try {
            _hnlrDbmsCrashManager.handleCrash(_ipGdbCrashEvent);
          } catch (

              Throwable _throwable) {

          }
        }
      }
    }
  }
}
