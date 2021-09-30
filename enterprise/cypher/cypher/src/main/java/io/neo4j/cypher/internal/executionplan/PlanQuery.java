package org.neo4j.cypher.internal.executionplan;

import org.neo4j.cypher.internal.profiling.QueryProfiler;
import org.neo4j.cypher.internal.runtime.QueryContext;
import org.neo4j.values.virtual.MapValue;


public interface PlanQuery {


  PlanQueryRunner excePlanQueryRunner(QueryContext _queryContext, QueryProfiler _queryProfiler,
      MapValue _mapValue);
}