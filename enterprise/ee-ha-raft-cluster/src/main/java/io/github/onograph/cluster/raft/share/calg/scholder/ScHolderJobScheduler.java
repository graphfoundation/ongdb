package io.github.onograph.cluster.raft.share.calg.scholder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;


public class ScHolderJobScheduler {


  protected final JobScheduler jobScheduler;


  private final Collection<ScHolderJobSchedulerWatcher> collectionTmrScHolderJobSchedulerWatcher = new ArrayList();


  private final Log log;

  public ScHolderJobScheduler(JobScheduler _jobScheduler, LogProvider _logProvider) {
    this.jobScheduler = _jobScheduler;
    this.log = _logProvider.getLog(this.getClass());
  }


  public synchronized ScHolderJobSchedulerWatcher craScHolderJobSchedulerWatcher(Group grp,
      ScHolderManager _hnlrScHolderManager, SchedulerTypeService title) {

    ScHolderJobSchedulerWatcher _tmrScHolderJobSchedulerWatcher =
        new ScHolderJobSchedulerWatcher(grp, _hnlrScHolderManager, this.jobScheduler, this.log,
            title);
    this.collectionTmrScHolderJobSchedulerWatcher.add(_tmrScHolderJobSchedulerWatcher);
    return _tmrScHolderJobSchedulerWatcher;
  }


  public synchronized Collection<ScHolderJobSchedulerWatcher> geteCollection(
      SchedulerTypeService title) {
    return this.collectionTmrScHolderJobSchedulerWatcher.stream().filter((timer) ->
    {
      return timer.name().equals(title);
    }).collect(Collectors.toList());
  }


  public synchronized void inoForSc(SchedulerTypeService title) {
    this.geteCollection(title).forEach(ScHolderJobSchedulerWatcher::ino);
  }


  public interface SchedulerTypeService {


    String name(); // For Enums
  }
}
