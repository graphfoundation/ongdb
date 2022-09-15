/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypher.internal.javacompat;

import java.time.Clock;
import java.util.List;

import org.neo4j.common.DependencyResolver;
import org.neo4j.configuration.Config;
import org.neo4j.cypher.internal.CompilerFactory;
import org.neo4j.cypher.internal.CompilerLibrary;
import org.neo4j.cypher.internal.ExecutionEngineQueryCacheMonitor;
import org.neo4j.cypher.internal.FullyParsedQuery;
import org.neo4j.cypher.internal.cache.CaffeineCacheFactory;
import org.neo4j.cypher.internal.config.CypherConfiguration;
import org.neo4j.cypher.internal.runtime.InputDataStream;
import org.neo4j.cypher.internal.tracing.CompilationTracer;
import org.neo4j.cypher.internal.tracing.TimingCompilationTracer;
import org.neo4j.exceptions.Neo4jException;
import org.neo4j.graphdb.Result;
import org.neo4j.kernel.GraphDatabaseQueryService;
import org.neo4j.kernel.impl.query.FunctionInformation;
import org.neo4j.kernel.impl.query.QueryExecution;
import org.neo4j.kernel.impl.query.QueryExecutionEngine;
import org.neo4j.kernel.impl.query.QueryExecutionKernelException;
import org.neo4j.kernel.impl.query.QueryExecutionMonitor;
import org.neo4j.kernel.impl.query.QuerySubscriber;
import org.neo4j.kernel.impl.query.TransactionalContext;
import org.neo4j.kernel.impl.util.WrappingEntity;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;
import org.neo4j.values.virtual.MapValue;

/**
 * To run a Cypher query, use this class.
 *
 * This class construct and initialize both the cypher compiler and the cypher runtime, which is a very expensive
 * operation so please make sure this will be constructed only once and properly reused.
 *
 */
public class ExecutionEngine implements QueryExecutionEngine
{
    protected org.neo4j.cypher.internal.ExecutionEngine cypherExecutionEngine;

    /**
     * Creates an execution engine around the given graph database
     */
    public ExecutionEngine( GraphDatabaseQueryService queryService, CaffeineCacheFactory cacheFactory, LogProvider logProvider,
                            CompilerFactory compilerFactory )
    {
        cypherExecutionEngine =
                makeExecutionEngine( queryService, cacheFactory, logProvider, new CompilerLibrary( compilerFactory, this::getCypherExecutionEngine ) );
    }

    /**
     * Creates an execution engine from the inner engine of a system execution engine
     */
    public ExecutionEngine( SystemExecutionEngine inner )
    {
        cypherExecutionEngine = inner.normalExecutionEngine();
    }

    protected ExecutionEngine()
    {
    }

    public org.neo4j.cypher.internal.ExecutionEngine getCypherExecutionEngine()
    {
        return cypherExecutionEngine;
    }

    protected static org.neo4j.cypher.internal.ExecutionEngine makeExecutionEngine( GraphDatabaseQueryService queryService, CaffeineCacheFactory cacheFactory,
            LogProvider logProvider, CompilerLibrary compilerLibrary )
    {
        DependencyResolver resolver = queryService.getDependencyResolver();
        Monitors monitors = resolver.resolveDependency( Monitors.class );
        MonitoringCacheTracer cacheTracer = new MonitoringCacheTracer( monitors.newMonitor( ExecutionEngineQueryCacheMonitor.class ) );
        Config config = resolver.resolveDependency( Config.class );
        CypherConfiguration cypherConfiguration = CypherConfiguration.fromConfig( config );
        CompilationTracer tracer =
                new TimingCompilationTracer( monitors.newMonitor( TimingCompilationTracer.EventListener.class ) );
        return new org.neo4j.cypher.internal.ExecutionEngine( queryService,
                monitors,
                tracer,
                cacheTracer,
                cypherConfiguration,
                compilerLibrary,
                cacheFactory,
                logProvider,
                Clock.systemUTC() );
    }

    @Override
    public Result executeQuery( String query, MapValue parameters, TransactionalContext context, boolean prePopulate )
            throws QueryExecutionKernelException
    {
            ResultSubscriber subscriber = new ResultSubscriber( context );
            QueryExecution queryExecution = executeQuery( query, parameters, context, false, subscriber );
            subscriber.init( queryExecution );
            return subscriber;
    }

    @Override
    public QueryExecution executeQuery( String query, MapValue parameters, TransactionalContext context,
            boolean prePopulate, QuerySubscriber subscriber ) throws QueryExecutionKernelException
    {
        try
        {
            checkParams( context, parameters );
            return cypherExecutionEngine.execute( query, parameters, context, false, prePopulate, subscriber );
        }
        catch ( Neo4jException e )
        {
            throw new QueryExecutionKernelException( e );
        }
    }

    public QueryExecution executeQuery( FullyParsedQuery query, MapValue parameters, TransactionalContext context,
            boolean prePopulate, InputDataStream input, QueryExecutionMonitor queryMonitor, QuerySubscriber subscriber ) throws QueryExecutionKernelException
    {
        try
        {
            checkParams( context, parameters );
            return cypherExecutionEngine.execute( query, parameters, context, prePopulate, input, queryMonitor, subscriber );
        }
        catch ( Neo4jException e )
        {
            throw new QueryExecutionKernelException( e );
        }
    }

    private static void checkParams( TransactionalContext context, MapValue parameters )
    {
        parameters.foreach(
                ( s, n ) ->
                {
                    if ( n instanceof WrappingEntity )
                    {
                        context.transaction().validateSameDB( ((WrappingEntity<?>) n).getEntity() );
                    }
                } );
    }

    @Override
    public boolean isPeriodicCommit( String query )
    {
        return cypherExecutionEngine.isPeriodicCommit( query );
    }

    @Override
    public long clearQueryCaches()
    {
        return cypherExecutionEngine.clearQueryCaches();
    }

    @Override
    public List<FunctionInformation> getProvidedLanguageFunctions()
    {
        return cypherExecutionEngine.getCypherFunctions();
    }
}
