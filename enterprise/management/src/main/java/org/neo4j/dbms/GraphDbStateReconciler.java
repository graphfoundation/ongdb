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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseStartAbortedException;
import org.neo4j.dbms.database.MultiDatabaseManager;
import org.neo4j.internal.helpers.Exceptions;
import org.neo4j.internal.helpers.ExponentialBackoffStrategy;
import org.neo4j.internal.helpers.TimeoutStrategy.Timeout;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;

public class GraphDbStateReconciler implements DatabaseStateService
{
    protected final Map<String,EnterpriseGraphDbState> currentStates;
    private final ExponentialBackoffStrategy backoffStrategy;
    private final Executor executor;
    private final Map<String,CompletableFuture<GraphDbReconcilerStepResult>> reconcilerJobCache;
    private final Set<String> reconciling;
    private final MultiDatabaseManager<? extends DatabaseContext> databaseManager;
    private final BinaryOperator<EnterpriseGraphDbState> precedence;
    private final Log log;
    private final boolean canRetry;
    private final GraphDbStateTransitions graphDbStateTransitions;
    private final List<GraphDbStateChangedListener> listeners;

    GraphDbStateReconciler( MultiDatabaseManager<? extends DatabaseContext> databaseManager, Config config, LogProvider logProvider, JobScheduler scheduler )
    {
        this.databaseManager = databaseManager;
        this.canRetry = (Boolean) config.get( GraphDatabaseSettings.reconciler_may_retry );
        this.backoffStrategy = new ExponentialBackoffStrategy( config.get( GraphDatabaseSettings.reconciler_minimum_backoff ),
                                                               config.get( GraphDatabaseSettings.reconciler_maximum_backoff ) );
        if ( config.isExplicitlySet( GraphDatabaseSettings.reconciler_maximum_parallelism ) )
        {
            int parallelism = config.get( GraphDatabaseSettings.reconciler_maximum_parallelism );
            parallelism = parallelism == 0 ? Runtime.getRuntime().availableProcessors() : parallelism;
            scheduler.setParallelism( Group.DATABASE_RECONCILER, parallelism );
        }

        this.executor = scheduler.executor( Group.DATABASE_RECONCILER );
        this.reconciling = new HashSet<>();
        this.currentStates = new ConcurrentHashMap<>();
        this.reconcilerJobCache = new ConcurrentHashMap<>();
        this.log = logProvider.getLog( this.getClass() );
        this.precedence = EnterpriseOperatorState.minByOperatorState( EnterpriseGraphDbState::operatorState );
        this.graphDbStateTransitions = this.prepareLifecycleTransitionSteps();
        this.listeners = new CopyOnWriteArrayList<>();
    }

    private static Map<String,EnterpriseGraphDbState> combineDesiredStates( Map<String,EnterpriseGraphDbState> combined,
                                                                            Map<String,EnterpriseGraphDbState> operator,
                                                                            BinaryOperator<EnterpriseGraphDbState> precedence )
    {
        return Stream.concat( combined.entrySet().stream(), operator.entrySet().stream() ).collect(
                Collectors.toMap( Entry::getKey, Entry::getValue, precedence ) );
    }

    private static Map<String,EnterpriseGraphDbState> desiredStates( List<GraphDbOperator> operators, BinaryOperator<EnterpriseGraphDbState> precedence )
    {
        return operators.stream().map( GraphDbOperator::desiredState ).reduce( new HashMap<>(), ( l, r ) ->
                combineDesiredStates( l, r, precedence ) );
    }

    private static GraphDbReconcilerStepResult handleGraphDbStateTransitions( EnterpriseGraphDbState currentState,
                                                                              Stream<GraphDbStateTransitions.Transition> steps,
                                                                              EnterpriseGraphDbState desiredState )
    {
        String oldThreadName = Thread.currentThread().getName();

        GraphDbReconcilerStepResult graphDbReconcilerStepResult;
        try
        {
            Thread.currentThread().setName( oldThreadName + "-" + desiredState.databaseId().name() );
            graphDbReconcilerStepResult = doTransitionStep( steps.iterator(), new GraphDbReconcilerStepResult( currentState, (Throwable) null, desiredState ) );
        }
        finally
        {
            Thread.currentThread().setName( oldThreadName );
        }

        return graphDbReconcilerStepResult;
    }

    private static GraphDbReconcilerStepResult doTransitionStep( Iterator<GraphDbStateTransitions.Transition> steps, GraphDbReconcilerStepResult result )
    {
        if ( !steps.hasNext() )
        {
            return result;
        }
        else
        {
            try
            {
                EnterpriseGraphDbState nextState = ((GraphDbStateTransitions.Transition) steps.next()).doTransition();
                return doTransitionStep( steps, result.withState( nextState ) );
            }
            catch ( Throwable e )
            {
                return result.withError( e );
            }
        }
    }

    /**
     * @param namedDatabaseId
     * @param currentState
     * @param request
     * @return
     */
    private static Optional<Throwable> shouldFailDatabaseReconciler( NamedDatabaseId namedDatabaseId,
                                                                     EnterpriseGraphDbState currentState,
                                                                     GraphDbReconcilerRequest request )
    {
        if ( request.forceReconciliation() )
        {
            return Optional.empty();
        }
        else
        {
            return currentState != null && currentState.hasFailed() ? currentState.failure() : request.causeOfPanic( namedDatabaseId );
        }
    }

    /**
     * @param id
     * @return
     */
    private EnterpriseGraphDbState getStateForNamedDatabaseId( NamedDatabaseId id )
    {
        return this.currentStates.getOrDefault( id.name(), EnterpriseGraphDbState.unknown( id ) );
    }

    @Override
    public OperatorState stateOfDatabase( NamedDatabaseId namedDatabaseId )
    {
        return (this.currentStates.getOrDefault( namedDatabaseId.name(),
                                                 EnterpriseGraphDbState.unknown( namedDatabaseId ) )).operatorState();
    }

    @Override
    public Optional<Throwable> causeOfFailure( NamedDatabaseId namedDatabaseId )
    {
        return this.currentStates.getOrDefault( namedDatabaseId.name(),
                                                EnterpriseGraphDbState.unknown( namedDatabaseId ) ).failure();
    }

    /**
     * @return
     */
    Collection<EnterpriseGraphDbState> getStatesSnapshot()
    {
        return Collections.unmodifiableCollection( this.currentStates.values() );
    }

    public void registerListener( GraphDbStateChangedListener listener )
    {
        this.listeners.add( listener );
    }

    /**
     * @param previousState
     * @param newState
     */
    private void stateChangedUpdater( EnterpriseGraphDbState previousState, EnterpriseGraphDbState newState )
    {
        EnterpriseGraphDbState initialState = new EnterpriseGraphDbState( newState.databaseId(), EnterpriseOperatorState.INITIAL );
        if ( previousState != null && !Objects.equals( previousState.databaseId(), newState.databaseId() ) )
        {
            EnterpriseGraphDbState droppedPrevious = new EnterpriseGraphDbState( previousState.databaseId(), EnterpriseOperatorState.DROPPED );
            this.listeners.forEach( ( listener ) ->
                                    {
                                        listener.stateChange( previousState, droppedPrevious );
                                    } );
            this.listeners.forEach( ( listener ) ->
                                    {
                                        listener.stateChange( initialState, newState );
                                    } );
        }
        else
        {
            this.listeners.forEach( ( listener ) ->
                                    {
                                        listener.stateChange( previousState == null ? initialState : previousState, newState );
                                    } );
        }
    }

    /**
     * @param operators
     * @param request
     * @return
     */
    GraphDbReconcilerResult reconcileGrapbDbs( List<GraphDbOperator> operators, GraphDbReconcilerRequest request )
    {
        Stream<String> namesOfDbsToReconcile = operators.stream().flatMap( ( op ) ->
                                                                           {
                                                                               return op.desiredState().keySet().stream();
                                                                           } ).distinct();
        Map<String,CompletableFuture<GraphDbReconcilerStepResult>> reconciliation = namesOfDbsToReconcile.map( ( dbName ) ->
                                                                                                               {
                                                                                                                   return Pair.of( dbName,
                                                                                                                                   this.scheduleReconsilerRequestJob(
                                                                                                                                           dbName, request,
                                                                                                                                           operators ) );
                                                                                                               } ).collect(
                Collectors.toMap( Pair::first, Pair::other ) );
        return new GraphDbReconcilerResult( reconciliation );
    }

    /**
     * @param namedDatabaseId
     * @return
     */
    protected EnterpriseGraphDbState getEnterpriseGraphDbStateForNamedDatabaseId( NamedDatabaseId namedDatabaseId )
    {
        return this.currentStates.getOrDefault( namedDatabaseId.name(), EnterpriseGraphDbState.initial( namedDatabaseId ) );
    }

    /**
     * @param databaseName
     * @param request
     * @param operators
     * @return
     */
    private synchronized CompletableFuture<GraphDbReconcilerStepResult> scheduleReconsilerRequestJob( String databaseName, GraphDbReconcilerRequest request,
                                                                                                      List<GraphDbOperator> operators )
    {
        CompletableFuture<GraphDbReconcilerStepResult> cachedJob = this.reconcilerJobCache.get( databaseName );
        if ( cachedJob != null && request.isSimple() )
        {
            return cachedJob;
        }
        else
        {
            CompletableFuture<Void> reconcilerJobHandle = new CompletableFuture<>();
            CompletableFuture<GraphDbReconcilerStepResult> job = reconcilerJobHandle.thenCompose( ( ignored ) ->
                                                                                                  {
                                                                                                      return this
                                                                                                              .preReconcile( databaseName, operators, request );
                                                                                                  } ).thenCompose( ( desiredState ) ->
                                                                                                                   {
                                                                                                                       return this
                                                                                                                               .handleGraphDbStateTransitions(
                                                                                                                                       databaseName,
                                                                                                                                       desiredState,
                                                                                                                                       request );
                                                                                                                   } ).whenComplete( ( result, throwable ) ->
                                                                                                                                     {
                                                                                                                                         this.postReconcile(
                                                                                                                                                 databaseName,
                                                                                                                                                 request,
                                                                                                                                                 result,
                                                                                                                                                 throwable );
                                                                                                                                     } );
            if ( request.isSimple() )
            {
                this.reconcilerJobCache.put( databaseName, job );
            }

            reconcilerJobHandle.complete( null );
            return job;
        }
    }

    private CompletableFuture<EnterpriseGraphDbState> preReconcile( String databaseName, List<GraphDbOperator> operators, GraphDbReconcilerRequest request )
    {
        return CompletableFuture.supplyAsync( () ->
                                              {
                                                  try
                                                  {
                                                      this.log.debug( "Attempting to acquire lock before reconciling state of db `%s`.",
                                                                      databaseName );
                                                      this.acquireLockOn( databaseName );
                                                      if ( request.isSimple() )
                                                      {
                                                          this.reconcilerJobCache.remove( databaseName );
                                                      }

                                                      EnterpriseGraphDbState desiredState =
                                                              desiredStates( operators, this.precedence ).get( databaseName );
                                                      if ( desiredState == null )
                                                      {
                                                          throw new IllegalStateException(
                                                                  String.format( "No operator desires a state for db %s any more. This is likely an error!",
                                                                                 databaseName ) );
                                                      }
                                                      else if ( !Objects.equals( databaseName, desiredState.databaseId().name() ) )
                                                      {
                                                          throw new IllegalStateException(
                                                                  String.format( "The supplied db name %s does not match that stored in its desired state %s!",
                                                                                 databaseName,
                                                                                 desiredState.databaseId().name() ) );
                                                      }
                                                      else
                                                      {
                                                          return desiredState;
                                                      }
                                                  }
                                                  catch ( InterruptedException e )
                                                  {
                                                      Thread.currentThread().interrupt();
                                                      throw new CompletionException( e );
                                                  }
                                              }, this.executor );
    }

    private CompletableFuture<GraphDbReconcilerStepResult> handleGraphDbStateTransitions( String databaseName, EnterpriseGraphDbState desiredState,
                                                                                          GraphDbReconcilerRequest request )
    {
        EnterpriseGraphDbState currentState = this.getEnterpriseGraphDbStateForNamedDatabaseId( desiredState.databaseId() );
        GraphDbReconcilerStepResult initialResult = new GraphDbReconcilerStepResult( currentState, (Throwable) null, desiredState );
        if ( currentState.equals( desiredState ) )
        {
            return CompletableFuture.completedFuture( initialResult );
        }
        else
        {
            this.log.info( "Database %s is requested to transition from %s to %s", databaseName, currentState, desiredState );
            if ( currentState.hasFailed() && !request.forceReconciliation() )
            {
                String message =
                        String.format( "Attempting to reconcile db %s to state '%s' but has previously failed. Manual force is required to retry.",
                                       databaseName, desiredState.operatorState().description() );
                this.log.warn( message );
                Throwable previousError = (Throwable) currentState.failure().orElseThrow( IllegalStateException::new );
                return CompletableFuture.completedFuture( initialResult.withError( DatabaseManagementException.wrap( previousError ) ) );
            }
            else
            {
                Timeout backoff = this.backoffStrategy.newTimeout();
                Stream<GraphDbStateTransitions.Transition> steps = this.getLifecycleTransitionSteps( currentState, desiredState );
                NamedDatabaseId namedDatabaseId = desiredState.databaseId();
                return CompletableFuture.supplyAsync( () ->
                                                      {
                                                          return handleGraphDbStateTransitions( initialResult.state(), steps, desiredState );
                                                      }, this.executor ).thenCompose( ( result ) ->
                                                                                      {
                                                                                          return this
                                                                                                  .handleGraphDbReconcileResult( namedDatabaseId, desiredState,
                                                                                                                                 result,
                                                                                                                                 this.executor, backoff, 0 );
                                                                                      } );
            }
        }
    }

    private CompletableFuture<GraphDbReconcilerStepResult> handleGraphDbReconcileResult( NamedDatabaseId namedDatabaseId, EnterpriseGraphDbState desiredState,
                                                                                         GraphDbReconcilerStepResult result, Executor executor, Timeout backoff,
                                                                                         int retries )
    {
        boolean isFatalError = result.error() != null && this.isFatalError( result.error() );
        if ( result.error() != null && !isFatalError )
        {
            int attempt = retries + 1;
            this.log.warn( "Retrying reconciliation of db %s to state '%s'. This is attempt %d.",
                           namedDatabaseId.name(), desiredState.operatorState().description(), attempt );
            Stream<GraphDbStateTransitions.Transition> remainingSteps = this.getLifecycleTransitionSteps( result.state(), desiredState );
            return CompletableFuture.supplyAsync( () ->
                                                  {
                                                      return handleGraphDbStateTransitions( result.state(), remainingSteps, desiredState );
                                                  }, CompletableFuture.delayedExecutor( backoff.getAndIncrement(), TimeUnit.MILLISECONDS, executor ) )
                                    .thenCompose( ( retryResult ) ->
                                                  {
                                                      return this.handleGraphDbReconcileResult( namedDatabaseId, desiredState, retryResult, executor, backoff,
                                                                                                attempt );
                                                  } );
        }
        else
        {
            return CompletableFuture.completedFuture( result );
        }
    }

    private void postReconcile( String databaseName, GraphDbReconcilerRequest request, GraphDbReconcilerStepResult result, Throwable throwable )
    {
        boolean lck = true;

        try
        {

            this.currentStates.compute( databaseName, ( name, previousState ) ->
            {
                Optional<EnterpriseGraphDbState> failedState = this.handleReconciliationErrors( throwable, request, result, databaseName, previousState );
                EnterpriseGraphDbState nextState = failedState.orElseGet( result::state );
                this.stateChangedUpdater( previousState, nextState );
                return nextState;
            } );
            lck = false;
        }
        finally
        {
            if ( lck )
            {
                this.releaseLockOn( databaseName );
                boolean errorExists = throwable != null || result.error() != null;
                String outcome = errorExists ? "failed" : "succeeded";
                this.log.debug( "Released lock having %s to reconcile db `%s` to state %s.",
                                outcome, databaseName, result.desiredState().operatorState().description() );
            }
        }

        this.releaseLockOn( databaseName );
        boolean errorExists = throwable != null || result.error() != null;
        String outcome = errorExists ? "failed" : "succeeded";
        this.log.debug( "Released lock having %s to reconcile db `%s` to state %s.",
                        outcome, databaseName, result.desiredState().operatorState().description() );
    }

    private Optional<EnterpriseGraphDbState> handleReconciliationErrors( Throwable throwable, GraphDbReconcilerRequest request,
                                                                         GraphDbReconcilerStepResult result,
                                                                         String databaseName, EnterpriseGraphDbState previousState )
    {
        String message;
        if ( throwable != null )
        {
            message = String.format( "Encountered unexpected error when attempting to reconcile db %s", databaseName );
            if ( previousState == null )
            {
                this.log.error( message, throwable );
                return Optional.of( EnterpriseGraphDbState.failedUnknownId( throwable ) );
            }
            else
            {
                this.reportErrorAndPanicDatabase( previousState.databaseId(), message, throwable );
                return Optional.of( previousState.failed( throwable ) );
            }
        }
        else if ( result.error() != null && Exceptions.contains( result.error(), ( e ) ->
        {
            return e instanceof DatabaseStartAbortedException;
        } ) )
        {
            message = String.format( "Attempt to reconcile db %s from %s to %s was aborted, likely due to %s being stopped or dropped meanwhile.",
                                     databaseName, result.state(), result.desiredState().operatorState().description(), databaseName );
            this.log.warn( message );
            return Optional.of( result.state() );
        }
        else if ( result.error() != null )
        {
            message = String.format( "Encountered error when attempting to reconcile db %s from state '%s' to state '%s'", databaseName, result.state(),
                                     result.desiredState().operatorState().description() );
            this.reportErrorAndPanicDatabase( result.state().databaseId(), message, result.error() );
            return Optional.of( result.state().failed( result.error() ) );
        }
        else
        {
            EnterpriseGraphDbState nextState = result.state();
            Optional<Throwable> failure = shouldFailDatabaseReconciler( nextState.databaseId(), previousState, request );
            Objects.requireNonNull( nextState );
            return failure.map( nextState::failed );
        }
    }

    private void reportErrorAndPanicDatabase( NamedDatabaseId namedDatabaseId, String message, Throwable error )
    {
        this.log.error( message, error );
        IllegalStateException panicCause = new IllegalStateException( message, error );
        this.panicDatabase( namedDatabaseId, panicCause );
    }

    private void releaseLockOn( String databaseName )
    {
        synchronized ( this.reconciling )
        {
            this.reconciling.remove( databaseName );
            this.reconciling.notifyAll();
        }
    }

    private void acquireLockOn( String databaseName ) throws InterruptedException
    {
        synchronized ( this.reconciling )
        {
            while ( this.reconciling.contains( databaseName ) )
            {
                this.reconciling.wait();
            }

            this.reconciling.add( databaseName );
        }
    }

    private boolean isFatalError( Throwable t )
    {
        return !this.canRetry || t instanceof Error || t instanceof DatabaseStartAbortedException;
    }

    protected GraphDbStateTransitions prepareLifecycleTransitionSteps()
    {
        return GraphDbStateTransitions.builder().from( EnterpriseOperatorState.INITIAL ).to( EnterpriseOperatorState.DROPPED ).doNothing().from(
                EnterpriseOperatorState.INITIAL ).to( EnterpriseOperatorState.STOPPED ).doTransitions( this::create ).from(
                EnterpriseOperatorState.INITIAL ).to( EnterpriseOperatorState.STARTED ).doTransitions( this::create, this::start ).from(
                EnterpriseOperatorState.STOPPED ).to( EnterpriseOperatorState.STARTED ).doTransitions( this::start ).from( EnterpriseOperatorState.STARTED ).to(
                EnterpriseOperatorState.STOPPED ).doTransitions( this::stop ).from( EnterpriseOperatorState.STOPPED ).to(
                EnterpriseOperatorState.DROPPED ).doTransitions( this::drop ).from( EnterpriseOperatorState.STARTED ).to(
                EnterpriseOperatorState.DROPPED ).doTransitions( this::prepareDrop, this::stop, this::drop ).build();
    }

    private Stream<GraphDbStateTransitions.Transition> getLifecycleTransitionSteps( EnterpriseGraphDbState currentState, EnterpriseGraphDbState desiredState )
    {
        return this.graphDbStateTransitions.fromCurrent( currentState ).toDesired( desiredState );
    }

    protected void panicDatabase( NamedDatabaseId namedDatabaseId, Throwable error )
    {
        this.databaseManager.getDatabaseContext( namedDatabaseId ).map( ( ctx ) ->
                                                                        {
                                                                            return ctx.database().getDatabaseHealth();
                                                                        } ).ifPresent( ( health ) ->
                                                                                       {
                                                                                           health.panic( error );
                                                                                       } );
    }

    protected final EnterpriseGraphDbState stop( NamedDatabaseId namedDatabaseId )
    {
        this.databaseManager.stopDatabase( namedDatabaseId );
        return new EnterpriseGraphDbState( namedDatabaseId, EnterpriseOperatorState.STOPPED );
    }

    private EnterpriseGraphDbState prepareDrop( NamedDatabaseId namedDatabaseId )
    {
        this.databaseManager.getDatabaseContext( namedDatabaseId ).map( DatabaseContext::database ).ifPresent( Database::prepareToDrop );
        return new EnterpriseGraphDbState( namedDatabaseId, EnterpriseOperatorState.STARTED );
    }

    protected final EnterpriseGraphDbState drop( NamedDatabaseId namedDatabaseId )
    {
        this.databaseManager.dropDatabase( namedDatabaseId );
        return new EnterpriseGraphDbState( namedDatabaseId, EnterpriseOperatorState.DROPPED );
    }

    protected final EnterpriseGraphDbState start( NamedDatabaseId namedDatabaseId )
    {
        this.databaseManager.startDatabase( namedDatabaseId );
        return new EnterpriseGraphDbState( namedDatabaseId, EnterpriseOperatorState.STARTED );
    }

    protected final EnterpriseGraphDbState create( NamedDatabaseId namedDatabaseId )
    {
        this.databaseManager.createDatabase( namedDatabaseId );
        return new EnterpriseGraphDbState( namedDatabaseId, EnterpriseOperatorState.STOPPED );
    }
}
