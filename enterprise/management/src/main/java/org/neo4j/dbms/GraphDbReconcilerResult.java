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

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.internal.helpers.Exceptions;
import org.neo4j.kernel.database.NamedDatabaseId;

public final class GraphDbReconcilerResult
{
    public static final GraphDbReconcilerResult EMPTY = new GraphDbReconcilerResult( Collections.emptyMap() );
    private final Map<String,CompletableFuture<GraphDbReconcilerStepResult>> reconciliationFutures;
    private final CompletableFuture<Void> combinedFuture;

    GraphDbReconcilerResult( Map<String,CompletableFuture<GraphDbReconcilerStepResult>> reconciliationFutures )
    {
        this.reconciliationFutures = reconciliationFutures;
        this.combinedFuture = combineFutures( reconciliationFutures );
    }

    private static CompletableFuture<Void> combineFutures( Map<String,CompletableFuture<GraphDbReconcilerStepResult>> reconciliationFutures )
    {
        CompletableFuture<?>[] allFutures = reconciliationFutures.values().toArray( ( a ) ->
                                                                                    {
                                                                                        return new CompletableFuture[a];
                                                                                    } );
        return CompletableFuture.allOf( allFutures );
    }

    public void join( NamedDatabaseId namedDatabaseId ) throws DatabaseManagementException
    {
        CompletableFuture<GraphDbReconcilerStepResult> future = this.reconciliationFutures.get( namedDatabaseId.name() );
        if ( future != null )
        {
            GraphDbReconcilerStepResult result = (GraphDbReconcilerStepResult) future.join();
            if ( result.error() != null )
            {
                throw new DatabaseManagementException( "A triggered GraphDbStateReconciler job failed with the following cause", result.error() );
            }
        }
    }

    public void join( Collection<NamedDatabaseId> namedDatabaseIds ) throws DatabaseManagementException
    {
        this.collectAndThrowErrors( this.getFutures( namedDatabaseIds ) );
    }

    public void joinAll() throws DatabaseManagementException
    {
        this.collectAndThrowErrors( this.reconciliationFutures.values() );
    }

    private void collectAndThrowErrors( Collection<CompletableFuture<GraphDbReconcilerStepResult>> futures ) throws DatabaseManagementException
    {
        Map<NamedDatabaseId,Throwable> errors = futures.stream().map( CompletableFuture::join ).filter( ( result ) ->
                                                                                                        {
                                                                                                            return result.error() != null;
                                                                                                        } ).collect( Collectors.toMap( ( result ) ->
                                                                                                                                       {
                                                                                                                                           return result
                                                                                                                                                   .desiredState()
                                                                                                                                                   .databaseId();
                                                                                                                                       },
                                                                                                                                       GraphDbReconcilerStepResult::error ) );
        if ( !errors.isEmpty() )
        {
            String databases = errors.keySet().stream().map( NamedDatabaseId::name ).collect( Collectors.joining( ",", "[", "]" ) );
            Throwable cause = errors.values().stream().reduce( null, Exceptions::chain );
            throw new DatabaseManagementException( String.format( "Reconciliation failed for databases %s", databases ), cause );
        }
    }

    public void await( NamedDatabaseId namedDatabaseId )
    {
        CompletableFuture<GraphDbReconcilerStepResult> future = this.reconciliationFutures.get( namedDatabaseId.name() );
        if ( future != null )
        {
            future.join();
        }
    }

    public void await( Collection<NamedDatabaseId> namedDatabaseIds )
    {
        CompletableFuture<?>[] futuresArray = this.getFutures( namedDatabaseIds ).toArray( ( a ) ->
                                                                                           {
                                                                                               return new CompletableFuture[a];
                                                                                           } );
        CompletableFuture.allOf( futuresArray ).join();
    }

    void awaitAll()
    {
        this.combinedFuture.join();
    }

    void whenComplete( Runnable action )
    {
        this.combinedFuture.whenComplete( ( ignore, error ) ->
                                          {
                                              action.run();
                                          } );
    }

    private List<CompletableFuture<GraphDbReconcilerStepResult>> getFutures( Collection<NamedDatabaseId> namedDatabaseIds )
    {
        return namedDatabaseIds.stream().map( ( id ) ->
                                              {
                                                  return this.reconciliationFutures.get( id.name() );
                                              } ).flatMap( Stream::ofNullable ).collect( Collectors.toList() );
    }

    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        else if ( o != null && this.getClass() == o.getClass() )
        {
            GraphDbReconcilerResult that = (GraphDbReconcilerResult) o;
            return Objects.equals( this.reconciliationFutures, that.reconciliationFutures );
        }
        else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return Objects.hash( this.reconciliationFutures );
    }

    public String toString()
    {
        return "GraphDbReconcilerResult{reconciliationFutures=" + this.reconciliationFutures + "}";
    }
}
