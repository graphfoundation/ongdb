/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
package org.neo4j.kernel.impl.query;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.GraphDatabaseSettings.LogQueryLevel;
import org.neo4j.kernel.api.query.ExecutingQuery;
import org.neo4j.kernel.api.query.QuerySnapshot;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;

import static java.util.concurrent.TimeUnit.NANOSECONDS;

class ConfiguredQueryLogger implements QueryLogger
{
    private final Log log;
    private final long thresholdMillis;
    private final boolean logQueryParameters;
    private final boolean logDetailedTime;
    private final boolean logAllocatedBytes;
    private final boolean logPageDetails;
    private final boolean logRuntime;
    private final boolean verboseLogging;

    ConfiguredQueryLogger( Log log, Config config )
    {
        this.log = log;
        this.thresholdMillis = ((Duration) config.get( GraphDatabaseSettings.log_queries_threshold )).toMillis();
        this.logQueryParameters = (Boolean) config.get( GraphDatabaseSettings.log_queries_parameter_logging_enabled );
        this.logDetailedTime = (Boolean) config.get( GraphDatabaseSettings.log_queries_detailed_time_logging_enabled );
        this.logAllocatedBytes = (Boolean) config.get( GraphDatabaseSettings.log_queries_allocation_logging_enabled );
        this.logPageDetails = (Boolean) config.get( GraphDatabaseSettings.log_queries_page_detail_logging_enabled );
        this.logRuntime = (Boolean) config.get( GraphDatabaseSettings.log_queries_runtime_logging_enabled );
        this.verboseLogging = config.get( GraphDatabaseSettings.log_queries ) == LogQueryLevel.VERBOSE;
    }

    @Override
    public void start( ExecutingQuery query )
    {
        if ( this.verboseLogging )
        {
            log.info( "Query started: " + logItem( query.snapshot() ) );
        }
    }

    @Override
    public void failure( ExecutingQuery query, Throwable failure )
    {
        log.error( logItem( query.snapshot() ), failure );
    }

    @Override
    public void failure( ExecutingQuery query, String reason )
    {
        log.error( logItem( query.snapshot() ), reason );
    }

    @Override
    public void success( ExecutingQuery query )
    {
        if ( NANOSECONDS.toMillis( query.elapsedNanos() ) >= thresholdMillis )
        {
            QuerySnapshot snapshot = query.snapshot();
            log.info( logItem( snapshot ) );
        }
    }

    private String logItem( QuerySnapshot query )
    {
        String sourceString = query.clientConnection().asConnectionDetails();
        String username = query.username();
        NamedDatabaseId namedDatabaseId = query.databaseId();
        String queryText = query.queryText();
        StringBuilder result = new StringBuilder();
        if ( this.verboseLogging )
        {
            result.append( "id:" ).append( query.id() ).append( " - " );
        }

        result.append( TimeUnit.MICROSECONDS.toMillis( query.elapsedTimeMicros() ) ).append( " ms: " );
        if ( this.logDetailedTime )
        {
            QueryLogFormatter.formatDetailedTime( result, query );
        }

        if ( this.logAllocatedBytes )
        {
            QueryLogFormatter.formatAllocatedBytes( result, query );
        }

        if ( this.logPageDetails )
        {
            QueryLogFormatter.formatPageDetails( result, query );
        }

        result.append( sourceString ).append( "\t" ).append( namedDatabaseId.name() ).append( " - " ).append( username ).append( " - " ).append( queryText );
        if ( this.logQueryParameters )
        {
            QueryLogFormatter.formatMapValue( result.append( " - " ), query.queryParameters() );
        }

        if ( this.logRuntime )
        {
            result.append( " - runtime=" ).append( query.runtime() );
        }

        QueryLogFormatter.formatMap( result.append( " - " ), query.transactionAnnotationData() );
        return result.toString();
    }
}
