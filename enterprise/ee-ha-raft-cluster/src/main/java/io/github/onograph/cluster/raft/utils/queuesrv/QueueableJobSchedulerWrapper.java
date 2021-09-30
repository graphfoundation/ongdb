package io.github.onograph.cluster.raft.utils.queuesrv;

import org.neo4j.logging.Log;
import org.neo4j.scheduler.CancelListener;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobScheduler;


public class QueueableJobSchedulerWrapper {


  private final JobScheduler eeuoJobScheduler;


  private final ElementQueue<Runnable> elementQueueQjRunnable;


  private final Group group;


  private final Log log;


  private volatile JobHandle<?> jobHandleHjObject;


  private volatile boolean notRunning;


  private volatile io.github.onograph.cluster.raft.utils.queuesrv.QueueableJobSchedulerWrapper.RunnableCancelableJobSchedulerJob
      runnableCancelableJobSchedulerJob;


  public QueueableJobSchedulerWrapper(JobScheduler _eeuoJobScheduler,
      ElementQueue<Runnable> _elementQueueQjRunnable, Group grp, Log _log) {
    this.eeuoJobScheduler = _eeuoJobScheduler;
    this.elementQueueQjRunnable = _elementQueueQjRunnable;
    this.group = grp;
    this.log = _log;
  }


  private synchronized void _abrjo() {
    if (!this._isEmy()) {

    }

    this.elementQueueQjRunnable.removeAll();

    io.github.onograph.cluster.raft.utils.queuesrv.QueueableJobSchedulerWrapper.RunnableCancelableJobSchedulerJob
        _jcRunnableCancelableJobSchedulerJob = this.runnableCancelableJobSchedulerJob;
    if (_jcRunnableCancelableJobSchedulerJob != null) {
      _jcRunnableCancelableJobSchedulerJob.abr();
    }
  }


  private void _fls() {
    while (!this._isEmy()) {
      this._wateaForJo(this.jobHandleHjObject);
      this._trsel();
    }

    this._wateaForJo(this.jobHandleHjObject);
  }


  private synchronized boolean _isEmy() {
    if (!this.notRunning) {

      throw new IllegalStateException("*** Error:  68995a83-46a0-4dd9-93a6-598f2d6cada2");
    } else {
      return this.elementQueueQjRunnable.isQueueEmpty();
    }
  }


  private synchronized void _sespd() {
    this.notRunning = true;
  }


  private void _thoifsoe() {
    if (this.notRunning) {

      throw new IllegalStateException("*** Error:  f7fe16cc-a6e3-478d-bdcc-75488d8658ff");
    }
  }


  private synchronized void _trsel() {
    if (this.runnableCancelableJobSchedulerJob == null) {

      Runnable _jnRunnable = this.elementQueueQjRunnable.poll();
      if (_jnRunnable != null) {

        io.github.onograph.cluster.raft.utils.queuesrv.QueueableJobSchedulerWrapper.RunnableCancelableJobSchedulerJob
            _cjRunnableCancelableJobSchedulerJob =
            new io.github.onograph.cluster.raft.utils.queuesrv.QueueableJobSchedulerWrapper.RunnableCancelableJobSchedulerJob(
                _jnRunnable);
        this.runnableCancelableJobSchedulerJob = _cjRunnableCancelableJobSchedulerJob;
        this.jobHandleHjObject = this.eeuoJobScheduler.schedule(this.group,
            _cjRunnableCancelableJobSchedulerJob);
      }
    }
  }


  private void _wateaForJo(JobHandle<?> _jobHandleJhObject) {
    if (_jobHandleJhObject != null) {
      try {
        _jobHandleJhObject.waitTermination();
      } catch (

          Exception _exception) {
        this.runnableCancelableJobSchedulerJob = null;


      }
    }
  }


  public void ofejoForRu(Runnable _runnable) {
    this._thoifsoe();
    synchronized (this) {
      this._thoifsoe();
      this.elementQueueQjRunnable.recForTry(_runnable);
      this._trsel();
    }
  }


  public void stpadfu() {
    this._sespd();

    try {
      this._fls();
    } finally {
      this._abrjo();
      this._wateaForJo(this.jobHandleHjObject);
    }
  }


  private class RunnableCancelableJobSchedulerJob implements Runnable, CancelListener {


    private final Runnable runnable;


    private volatile boolean isAotd;

    private RunnableCancelableJobSchedulerJob(Runnable _runnable) {
      this.runnable = _runnable;
    }


    void abr() {
      this.isAotd = true;
    }

    @Override
    public void cancelled() {
      this.abr();
      QueueableJobSchedulerWrapper.this.runnableCancelableJobSchedulerJob = null;
    }

    @Override
    public void run() {
      try {
        if (!this.isAotd) {
          this.runnable.run();
        }
      } finally {
        QueueableJobSchedulerWrapper.this.runnableCancelableJobSchedulerJob = null;
        QueueableJobSchedulerWrapper.this._trsel();
      }
    }
  }
}
