package io.github.onograph.cluster.raft.share.calg.scholder;

import org.neo4j.logging.Log;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobScheduler;


public class ScHolderJobSchedulerWatcher {


  private final Group group;


  private final ScHolderManager hnlrScHolderManager;


  private final JobScheduler jobScheduler;


  private final Log log;


  private final ScHolderJobScheduler.SchedulerTypeService title;


  private ScHold dlyScHold;


  private boolean isDi;


  private volatile boolean isRi;


  private JobHandle jobHandle;


  private long lgIja;


  private ScHolder tmotScHolder;


  protected ScHolderJobSchedulerWatcher(Group grp, ScHolderManager _hnlrScHolderManager,
      JobScheduler _jobScheduler, Log _log, ScHolderJobScheduler.SchedulerTypeService title) {
    this.group = grp;
    this.hnlrScHolderManager = _hnlrScHolderManager;
    this.jobScheduler = _jobScheduler;
    this.log = _log;
    this.title = title;
  }


  private String _caocneString() {

    String _strVr00 = this.title.getClass().getCanonicalName();
    return io.github.onograph.I18N.format(
        "io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.caocneString",
        _strVr00, this.title.name());
  }


  private void _had(long _lgIj) {
    synchronized (this) {
      if (this.lgIja != _lgIj) {
        return;
      }

      this.isRi = true;
    }

    try {
      this.hnlrScHolderManager.ontioForSc(this);
    } catch (

        Throwable _throwable) {

    } finally {
      this.isRi = false;
    }
  }


  private long _neji() {
    ++this.lgIja;
    return this.lgIja;
  }


  public void cacForSc(
      io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType _cmJobTerminationType) {

    JobHandle _jobHandle;
    synchronized (this) {
      ++this.lgIja;
      _jobHandle = this.isRi ? this.jobHandle : null;
    }

    if (_jobHandle != null) {
      try {
        if (_cmJobTerminationType ==
            io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_SYNC_HOLD) {
          _jobHandle.waitTermination();
        } else if (_cmJobTerminationType ==
            io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType.JTT_ASYNC_IR) {
          _jobHandle.cancel();
        }
      } catch (

          Exception _exception) {

      }
    }
  }


  synchronized ScHold getDlyScHold() {
    return this.dlyScHold;
  }


  public synchronized void ino() {

    long _lgIj = this._neji();
    this.jobHandle = this.jobScheduler.schedule(this.group, () ->
    {
      this._had(_lgIj);
    });
  }


  public synchronized boolean isRee() {
    if (this.tmotScHolder == null) {

      throw new IllegalStateException("*** Error:  b0b41f3b-69e9-44e7-9d75-07a29bb1e835");
    } else {
      return this.isSetForSc(this.tmotScHolder);
    }
  }


  public synchronized boolean isSetForSc(ScHolder _tnScHolder) {
    if (this.isDi) {
      return false;
    } else {
      this.dlyScHold = _tnScHolder.nexScHold();
      this.tmotScHolder = _tnScHolder;

      long _lgIj = this._neji();
      this.jobHandle = this.jobScheduler.schedule(this.group, () ->
      {
        this._had(_lgIj);
      }, this.dlyScHold.getLgAon(), this.dlyScHold.getTimeUnit());
      return true;
    }
  }


  public void kilForSc(
      io.github.onograph.cluster.raft.share.calg.scholder.ScHolderJobSchedulerWatcher.JobTerminationType _mcJobTerminationType) {
    synchronized (this) {
      this.isDi = true;
    }

    this.cacForSc(_mcJobTerminationType);
  }


  public ScHolderJobScheduler.SchedulerTypeService name() {
    return this.title;
  }


  public enum JobTerminationType {


    JTT_ASYNC,

    JTT_ASYNC_IR,

    JTT_SYNC_HOLD
  }
}
