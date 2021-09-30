package org.neo4j.cypher.internal.executionplan;

import org.neo4j.cypher.result.QueryResult.QueryResultVisitor;


public interface PlanQueryRunner {


  String[] getFields();


  <E extends Exception> void handle(QueryResultVisitor<E> _queryResultVisitorVaE) throws E;
}