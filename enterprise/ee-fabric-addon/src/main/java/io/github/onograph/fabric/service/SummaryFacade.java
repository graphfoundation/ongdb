package io.github.onograph.fabric.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.neo4j.driver.summary.Plan;
import org.neo4j.driver.summary.ProfiledPlan;
import org.neo4j.driver.summary.ResultSummary;
import org.neo4j.driver.summary.SummaryCounters;
import org.neo4j.fabric.stream.summary.EmptyExecutionPlanDescription;
import org.neo4j.fabric.stream.summary.Summary;
import org.neo4j.graphdb.ExecutionPlanDescription;
import org.neo4j.graphdb.ExecutionPlanDescription.ProfilerStatistics;
import org.neo4j.graphdb.InputPosition;
import org.neo4j.graphdb.Notification;
import org.neo4j.graphdb.QueryStatistics;
import org.neo4j.graphdb.SeverityLevel;


public class SummaryFacade implements Summary {


  private final List<Notification> listNtfctNotification;


  private final QueryStatistics queryStatistics;


  private final ResultSummary resultSummary;

  public SummaryFacade(ResultSummary _resultSummary) {
    this.queryStatistics = new QueryStatisticsImpl(_resultSummary.counters());
    this.listNtfctNotification = _resultSummary.notifications().stream().map(NotificationImpl::new)
        .collect(Collectors.toList());
    this.resultSummary = _resultSummary;
  }

  @Override
  public ExecutionPlanDescription executionPlanDescription() {
    if (this.resultSummary.hasProfile()) {
      return new PlanDescriptionDefaultImpl(this.resultSummary.profile());
    } else {
      return this.resultSummary.hasPlan() ? new ExecutionPlanDescriptionImpl(
          this.resultSummary.plan())
          : new EmptyExecutionPlanDescription();
    }
  }

  @Override
  public Collection<Notification> getNotifications() {
    return this.listNtfctNotification;
  }

  @Override
  public QueryStatistics getQueryStatistics() {
    return this.queryStatistics;
  }


  private static class ExecutionPlanDescriptionImpl implements ExecutionPlanDescription {


    private final Plan diePlan;

    ExecutionPlanDescriptionImpl(Plan _diePlan) {
      this.diePlan = _diePlan;
    }

    @Override
    public Map<String, Object> getArguments() {

      RecordUtils _rcRecordUtils = new RecordUtils();

      Map<String, Object> _mapAcso = new HashMap();
      this.diePlan.arguments().forEach((key, value) ->
      {
        _mapAcso.put(key, _rcRecordUtils._covtvlAnyValue(value));
      });
      return _mapAcso;
    }

    @Override
    public List<ExecutionPlanDescription> getChildren() {
      return this.diePlan.children().stream().map(ExecutionPlanDescriptionImpl::new)
          .collect(Collectors.toList());
    }

    @Override
    public Set<String> getIdentifiers() {
      return new HashSet(this.diePlan.identifiers());
    }

    @Override
    public String getName() {
      return this.diePlan.operatorType();
    }

    @Override
    public ProfilerStatistics getProfilerStatistics() {
      return null;
    }

    @Override
    public boolean hasProfilerStatistics() {
      return false;
    }
  }


  private static class NotificationImpl implements Notification {


    private final org.neo4j.driver.summary.Notification notification;

    NotificationImpl(org.neo4j.driver.summary.Notification _notification) {
      this.notification = _notification;
    }

    @Override
    public String getCode() {
      return this.notification.code();
    }

    @Override
    public String getDescription() {
      return this.notification.description();
    }

    @Override
    public InputPosition getPosition() {

      org.neo4j.driver.summary.InputPosition _inputPosition = this.notification.position();
      return new InputPosition(_inputPosition.offset(), _inputPosition.line(),
          _inputPosition.column());
    }

    @Override
    public SeverityLevel getSeverity() {
      return SeverityLevel.valueOf(this.notification.severity());
    }

    @Override
    public String getTitle() {
      return this.notification.title();
    }
  }


  private static class PlanDescriptionDefaultImpl extends ExecutionPlanDescriptionImpl {


    private final ProfiledPlan pdpProfiledPlan;

    PlanDescriptionDefaultImpl(ProfiledPlan _pdpProfiledPlan) {
      super(_pdpProfiledPlan);
      this.pdpProfiledPlan = _pdpProfiledPlan;
    }

    @Override
    public List<ExecutionPlanDescription> getChildren() {
      return this.pdpProfiledPlan.children().stream().map(PlanDescriptionDefaultImpl::new)
          .collect(Collectors.toList());
    }

    @Override
    public ProfilerStatistics getProfilerStatistics() {
      return new SummaryFacade.ProfilerStatisticsImpl(this.pdpProfiledPlan);
    }

    @Override
    public boolean hasProfilerStatistics() {
      return true;
    }
  }


  private static class ProfilerStatisticsImpl implements ProfilerStatistics {


    private final ProfiledPlan pdpProfiledPlan;

    ProfilerStatisticsImpl(ProfiledPlan _pdpProfiledPlan) {
      this.pdpProfiledPlan = _pdpProfiledPlan;
    }

    @Override
    public long getDbHits() {
      return this.pdpProfiledPlan.dbHits();
    }

    @Override
    public long getPageCacheHits() {
      return this.pdpProfiledPlan.pageCacheHits();
    }

    @Override
    public long getPageCacheMisses() {
      return this.pdpProfiledPlan.pageCacheMisses();
    }

    @Override
    public long getRows() {
      return this.pdpProfiledPlan.records();
    }

    @Override
    public long getTime() {
      return this.pdpProfiledPlan.time();
    }

    @Override
    public boolean hasDbHits() {
      return this.pdpProfiledPlan.dbHits() > 0L;
    }

    @Override
    public boolean hasPageCacheStats() {
      return this.pdpProfiledPlan.hasPageCacheStats();
    }

    @Override
    public boolean hasRows() {
      return this.pdpProfiledPlan.records() > 0L;
    }

    @Override
    public boolean hasTime() {
      return this.pdpProfiledPlan.time() > 0L;
    }
  }


  private static class QueryStatisticsImpl implements QueryStatistics {


    private final SummaryCounters summaryCounters;

    QueryStatisticsImpl(SummaryCounters _summaryCounters) {
      this.summaryCounters = _summaryCounters;
    }

    @Override
    public boolean containsSystemUpdates() {
      return this.summaryCounters.containsSystemUpdates();
    }

    @Override
    public boolean containsUpdates() {
      return this.summaryCounters.containsUpdates();
    }

    @Override
    public int getConstraintsAdded() {
      return this.summaryCounters.constraintsAdded();
    }

    @Override
    public int getConstraintsRemoved() {
      return this.summaryCounters.constraintsRemoved();
    }

    @Override
    public int getIndexesAdded() {
      return this.summaryCounters.indexesAdded();
    }

    @Override
    public int getIndexesRemoved() {
      return this.summaryCounters.indexesRemoved();
    }

    @Override
    public int getLabelsAdded() {
      return this.summaryCounters.labelsAdded();
    }

    @Override
    public int getLabelsRemoved() {
      return this.summaryCounters.labelsRemoved();
    }

    @Override
    public int getNodesCreated() {
      return this.summaryCounters.nodesCreated();
    }

    @Override
    public int getNodesDeleted() {
      return this.summaryCounters.nodesDeleted();
    }

    @Override
    public int getPropertiesSet() {
      return this.summaryCounters.propertiesSet();
    }

    @Override
    public int getRelationshipsCreated() {
      return this.summaryCounters.relationshipsCreated();
    }

    @Override
    public int getRelationshipsDeleted() {
      return this.summaryCounters.relationshipsDeleted();
    }

    @Override
    public int getSystemUpdates() {
      return this.summaryCounters.systemUpdates();
    }
  }
}
