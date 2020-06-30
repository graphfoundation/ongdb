/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.dbms;

import org.eclipse.collections.api.multimap.set.MutableSetMultimap;
import org.eclipse.collections.impl.factory.Multimaps;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import org.neo4j.kernel.availability.AvailabilityGuard;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.DatabaseStartupController;
import org.neo4j.kernel.database.NamedDatabaseId;

public class GraphDbStartAborter implements DatabaseStartupController
{
    private final Duration ttl;
    private final Map<NamedDatabaseId,GraphDbStartAborter.CachedDesiredState> cachedDesiredStates = new ConcurrentHashMap();
    private final MutableSetMultimap<NamedDatabaseId,GraphDbStartAborter.PreventReason> abortPreventionSets;
    private final AvailabilityGuard globalAvailabilityGuard;
    private final EnterpriseSystemGraphDbmsModel dbmsModel;
    private final Clock clock;

    public GraphDbStartAborter( AvailabilityGuard globalAvailabilityGuard, EnterpriseSystemGraphDbmsModel dbmsModel, Clock clock, Duration ttl )
    {
        this.abortPreventionSets = Multimaps.mutable.set.empty();//.asSynchronized();
        this.globalAvailabilityGuard = globalAvailabilityGuard;
        this.dbmsModel = dbmsModel;
        this.clock = clock;
        this.ttl = ttl;
    }

    public void setAbortable( NamedDatabaseId databaseId, GraphDbStartAborter.PreventReason reason, boolean abortable )
    {
        if ( abortable )
        {
            this.abortPreventionSets.remove( databaseId, reason );
        }
        else
        {
            this.abortPreventionSets.put( databaseId, reason );
        }
    }

    private boolean isAbortable( NamedDatabaseId databaseId )
    {
        return !this.abortPreventionSets.containsKey( databaseId );
    }

    public boolean shouldAbort( NamedDatabaseId namedDatabaseId )
    {
        if ( !this.isAbortable( namedDatabaseId ) )
        {
            return false;
        }
        else if ( this.globalAvailabilityGuard.isShutdown() )
        {
            return true;
        }
        else if ( Objects.equals( namedDatabaseId, DatabaseIdRepository.NAMED_SYSTEM_DATABASE_ID ) )
        {
            return false;
        }
        else
        {
            GraphDbStartAborter.CachedDesiredState desiredState =
                    (GraphDbStartAborter.CachedDesiredState) this.cachedDesiredStates.compute( namedDatabaseId, ( id, cachedState ) ->
                    {
                        return cachedState != null && !cachedState.isTimeToDie() ? cachedState : this.getFreshDesiredState( namedDatabaseId );
                    } );
            return desiredState.state() == EnterpriseOperatorState.STOPPED || desiredState.state() == EnterpriseOperatorState.DROPPED;
        }
    }

    public void started( NamedDatabaseId namedDatabaseId )
    {
        this.cachedDesiredStates.remove( namedDatabaseId );
    }

    private GraphDbStartAborter.CachedDesiredState getFreshDesiredState( NamedDatabaseId namedDatabaseId )
    {
        String message = String.format( "Failed to check if starting %s should abort as it doesn't exist in the system db!", namedDatabaseId );
        OperatorState state = (OperatorState) this.dbmsModel.getStatus( namedDatabaseId ).orElseThrow( () ->
                                                                                                       {
                                                                                                           return new IllegalStateException( message );
                                                                                                       } );
        return new GraphDbStartAborter.CachedDesiredState( this.clock.instant(), state );
    }

    public static enum PreventReason
    {
        STORE_COPY;
    }

    private class CachedDesiredState
    {
        private final OperatorState state;
        private final Instant createdAt;

        private CachedDesiredState( Instant createdAt, OperatorState state )
        {
            this.state = state;
            this.createdAt = createdAt;
        }

        OperatorState state()
        {
            return this.state;
        }

        boolean isTimeToDie()
        {
            Duration elapsed = Duration.between( this.createdAt, GraphDbStartAborter.this.clock.instant() );
            return elapsed.compareTo( GraphDbStartAborter.this.ttl ) >= 0;
        }
    }
}
