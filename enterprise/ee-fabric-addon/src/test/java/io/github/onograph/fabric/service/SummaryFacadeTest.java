package io.github.onograph.fabric.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.neo4j.driver.Query;
import org.neo4j.driver.internal.summary.InternalResultSummary;
import org.neo4j.driver.internal.summary.InternalSummaryCounters;
import org.neo4j.driver.summary.DatabaseInfo;
import org.neo4j.driver.summary.Notification;
import org.neo4j.driver.summary.Plan;
import org.neo4j.driver.summary.ProfiledPlan;
import org.neo4j.driver.summary.QueryType;

class SummaryFacadeTest {

  @Test
  void testConstructor() {
    Query query = new Query("Text");
    DatabaseInfo databaseInfo = mock(DatabaseInfo.class);
    InternalSummaryCounters counters = new InternalSummaryCounters(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1);

    ArrayList<org.neo4j.driver.summary.Notification> notificationList = new ArrayList<org.neo4j.driver.summary.Notification>();
    assertEquals(notificationList,
        (new SummaryFacade(new InternalResultSummary(query, null, databaseInfo,
            QueryType.READ_ONLY, counters, null, null, notificationList, 1L,
            1L))).getNotifications());
  }

  @Test
  void testExecutionPlanDescription() {
    Query query = new Query("Text");
    DatabaseInfo databaseInfo = mock(DatabaseInfo.class);
    InternalSummaryCounters counters = new InternalSummaryCounters(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1);

    assertTrue((new SummaryFacade(
        new InternalResultSummary(query, null, databaseInfo, QueryType.READ_ONLY, counters,
            null, null, new ArrayList<Notification>(), 1L, 1L)))
        .executionPlanDescription() instanceof org.neo4j.fabric.stream.summary.EmptyExecutionPlanDescription);
  }

  @Test
  void testExecutionPlanDescription2() {

    Query query = new Query("Text");
    DatabaseInfo databaseInfo = mock(DatabaseInfo.class);
    InternalSummaryCounters counters = new InternalSummaryCounters(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1);

    Plan plan = mock(Plan.class);
    (new SummaryFacade(
        new InternalResultSummary(query, null, databaseInfo, QueryType.READ_ONLY, counters, plan,
            null,
            new ArrayList<Notification>(), 1L, 1L))).executionPlanDescription();
  }

  @Test
  void testExecutionPlanDescription3() {

    Query query = new Query("Text");
    DatabaseInfo databaseInfo = mock(DatabaseInfo.class);
    InternalSummaryCounters counters = new InternalSummaryCounters(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1);

    ProfiledPlan profile = mock(ProfiledPlan.class);
    (new SummaryFacade(
        new InternalResultSummary(query, null, databaseInfo, QueryType.READ_ONLY, counters, null,
            profile, new ArrayList<Notification>(), 1L, 1L))).executionPlanDescription();
  }
}

