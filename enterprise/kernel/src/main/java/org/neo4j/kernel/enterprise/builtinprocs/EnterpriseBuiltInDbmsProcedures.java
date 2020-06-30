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
package org.neo4j.kernel.enterprise.builtinprocs;

import org.apache.commons.lang3.StringUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.neo4j.common.DependencyResolver;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.security.AuthorizationViolationException;
import org.neo4j.internal.helpers.TimeUtil;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.UserFunctionSignature;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.api.KernelTransactionHandle;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.kernel.api.net.NetworkConnectionTracker;
import org.neo4j.kernel.api.net.TrackedNetworkConnection;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.kernel.api.procedure.SystemProcedure;
import org.neo4j.kernel.api.query.ExecutingQuery;
import org.neo4j.kernel.api.query.QuerySnapshot;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.enterprise.builtinprocs.dbms.DbmsSettingsWhitelist;
import org.neo4j.kernel.enterprise.builtinprocs.dbms.QueryId;
import org.neo4j.kernel.enterprise.builtinprocs.dbms.TransactionId;
import org.neo4j.kernel.impl.api.KernelTransactions;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.kernel.impl.query.FunctionInformation;
import org.neo4j.kernel.impl.query.QueryExecutionEngine;
import org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointer;
import org.neo4j.kernel.impl.transaction.log.checkpoint.SimpleTriggerInfo;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogTimeZone;
import org.neo4j.procedure.Admin;
import org.neo4j.procedure.Context;
import org.neo4j.procedure.Description;
import org.neo4j.procedure.Mode;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.Procedure;
import org.neo4j.resources.Profiler;
import org.neo4j.scheduler.ActiveGroup;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobScheduler;

@SuppressWarnings( "unused" )
public class EnterpriseBuiltInDbmsProcedures
{

    @Context
    public Log log;
    @Context
    public DependencyResolver resolver;
    @Context
    public Transaction transaction;
    @Context
    public SecurityContext securityContext;
    @Context
    public KernelTransaction kernelTransaction;

    private static Set<KernelTransactionHandle> getExecutingTransactions(
            DatabaseContext databaseContext )
    {
        return ((KernelTransactions) databaseContext.dependencies()
                                                    .resolveDependency( KernelTransactions.class )).executingTransactions();
    }

    @SystemProcedure
    @Description( "List all accepted network connections at this instance that are visible to the user." )
    @Procedure( name = "dbms.listConnections", mode = Mode.DBMS )
    public Stream<ListConnectionResult> listConnections()
    {
        this.securityContext.assertCredentialsNotExpired();
        NetworkConnectionTracker connectionTracker = this.getConnectionTracker();
        ZoneId timeZone = this.getConfiguredTimeZone();
        return connectionTracker.activeConnections().stream().filter( ( connection ) ->
                                                                      {
                                                                          return this.isAdminOrSelf( connection.username() );
                                                                      } ).map( ( connection ) ->
                                                                               {
                                                                                   return new ListConnectionResult( connection, timeZone );
                                                                               } );
    }

    @SystemProcedure
    @Description( "Kill network connection with the given connection id." )
    @Procedure( name = "dbms.killConnection", mode = Mode.DBMS )
    public Stream<ConnectionTerminationResult> killConnection( @Name( "id" ) String id )
    {
        return this.killConnections( Collections.singletonList( id ) );
    }

    @SystemProcedure
    @Description( "Kill all network connections with the given connection ids." )
    @Procedure( name = "dbms.killConnections", mode = Mode.DBMS )
    public Stream<ConnectionTerminationResult> killConnections( @Name( "ids" ) List<String> ids )
    {
        this.securityContext.assertCredentialsNotExpired();
        NetworkConnectionTracker connectionTracker = this.getConnectionTracker();
        return ids.stream().map( ( id ) ->
                                 {
                                     return this.killConnection( id, connectionTracker );
                                 } );
    }

    private NetworkConnectionTracker getConnectionTracker()
    {
        return (NetworkConnectionTracker) this.resolver
                .resolveDependency( NetworkConnectionTracker.class );
    }

    private ConnectionTerminationResult killConnection( String id,
                                                        NetworkConnectionTracker connectionTracker )
    {
        TrackedNetworkConnection connection = connectionTracker.get( id );
        if ( connection != null )
        {
            if ( this.isAdminOrSelf( connection.username() ) )
            {
                connection.close();
                return new ConnectionTerminationResult( id, connection.username() );
            }
            else
            {
                throw new AuthorizationViolationException( "Permission denied." );
            }
        }
        else
        {
            return new ConnectionTerminationFailedResult( id );
        }
    }

    @SystemProcedure
    @Description( "List all functions in the DBMS." )
    @Procedure( name = "dbms.functions", mode = Mode.DBMS )
    public Stream<EnterpriseBuiltInDbmsProcedures.FunctionResult> listFunctions()
    {
        this.securityContext.assertCredentialsNotExpired();
        QueryExecutionEngine queryExecutionEngine = this.resolver
                .resolveDependency( QueryExecutionEngine.class );
        List<FunctionInformation> providedLanguageFunctions = queryExecutionEngine
                .getProvidedLanguageFunctions();
        Stream<EnterpriseBuiltInDbmsProcedures.FunctionResult> languageFunctions = providedLanguageFunctions
                .stream().map( ( f ) ->
                               {
                                   return new EnterpriseBuiltInDbmsProcedures.FunctionResult(
                                           f );
                               } );
        Stream<EnterpriseBuiltInDbmsProcedures.FunctionResult> loadedFunctions =
                ((GlobalProcedures) this.resolver.resolveDependency( GlobalProcedures.class ))
                        .getAllNonAggregatingFunctions().map( ( f ) ->
                                                              {
                                                                  return new EnterpriseBuiltInDbmsProcedures.FunctionResult(
                                                                          f, false );
                                                              } );
        Stream<EnterpriseBuiltInDbmsProcedures.FunctionResult> loadedAggregationFunctions =
                ((GlobalProcedures) this.resolver.resolveDependency( GlobalProcedures.class ))
                        .getAllAggregatingFunctions().map( ( f ) ->
                                                           {
                                                               return new EnterpriseBuiltInDbmsProcedures.FunctionResult(
                                                                       f, true );
                                                           } );
        return Stream
                .concat( Stream.concat( languageFunctions, loadedFunctions ), loadedAggregationFunctions )
                .sorted( Comparator.comparing( ( a ) ->
                                               {
                                                   return a.name;
                                               } ) );
    }

    @SystemProcedure
    @Description( "List all procedures in the DBMS." )
    @Procedure( name = "dbms.procedures", mode = Mode.DBMS )
    public Stream<EnterpriseBuiltInDbmsProcedures.ProcedureResult> listProcedures()
    {
        this.securityContext.assertCredentialsNotExpired();
        GlobalProcedures globalProcedures = (GlobalProcedures) this.resolver
                .resolveDependency( GlobalProcedures.class );
        return globalProcedures.getAllProcedures().stream().sorted( Comparator.comparing( ( a ) ->
                                                                                          {
                                                                                              return a.name().toString();
                                                                                          } ) ).map( EnterpriseBuiltInDbmsProcedures.ProcedureResult::new );
    }

    @Admin
    @SystemProcedure
    @Description( "Updates a given setting value. Passing an empty value will result in removing the configured value and falling back to the default value. Changes will not persist and will be lost if the server is restarted." )
    @Procedure( name = "dbms.setConfigValue", mode = Mode.DBMS )
    public void setConfigValue( @Name( "setting" ) String setting, @Name( "value" ) String value )
    {
        Config config = (Config) this.resolver.resolveDependency( Config.class );
        SettingImpl<Object> settingObj = (SettingImpl) config.getSetting( setting );
        DbmsSettingsWhitelist dbmsSettingsWhiteList = (DbmsSettingsWhitelist) this.resolver
                .resolveDependency( DbmsSettingsWhitelist.class );
        if ( dbmsSettingsWhiteList.isWhiteListed( setting ) )
        {
            config.setDynamic( settingObj, settingObj.parse( StringUtils.isNotEmpty( value ) ? value : null ),
                               "dbms.setConfigValue" );
        }
        else
        {
            throw new AuthorizationViolationException( "Failed to set value for `" + setting
                                                       + "` using procedure `dbms.setConfigValue`: access denied." );
        }
    }

    @SystemProcedure
    @Description( "List all queries currently executing at this instance that are visible to the user." )
    @Procedure( name = "dbms.listQueries", mode = Mode.DBMS )
    public Stream<QueryStatusResult> listQueries() throws InvalidArgumentsException
    {
        this.securityContext.assertCredentialsNotExpired();
        ZoneId zoneId = this.getConfiguredTimeZone();


        /*
        try
        {
            return getKernelTransactions().activeTransactions().stream()
                .flatMap( KernelTransactionHandle::executingQueries )
                    .filter( query -> isAdminOrSelf( query.username() ) )
                    .map( catchThrown( InvalidArgumentsException.class,
                            query -> new QueryStatusResult( query, nodeManager, zoneId ) ) );
        }
        catch ( UncaughtCheckedException uncaught )
        {
            throwIfPresent( uncaught.getCauseIfOfType( InvalidArgumentsException.class ) );
            throw uncaught;
        }
         */
        // TODO: Use stream
        List<QueryStatusResult> result = new ArrayList();
        Iterator iterator = this.getDatabaseManager().registeredDatabases().values().iterator();

        while ( iterator.hasNext() )
        {
            DatabaseContext databaseContext = (DatabaseContext) iterator.next();
            Iterator executingTransactionsIterator = getExecutingTransactions( databaseContext ).iterator();

            while ( executingTransactionsIterator.hasNext() )
            {
                KernelTransactionHandle tx = (KernelTransactionHandle) executingTransactionsIterator.next();
                if ( tx.executingQuery().isPresent() )
                {
                    ExecutingQuery query = (ExecutingQuery) tx.executingQuery().get();
                    if ( this.isAdminOrSelf( query.username() ) )
                    {
                        result.add( new QueryStatusResult( query, (InternalTransaction) this.transaction, zoneId,
                                                           databaseContext.databaseFacade().databaseName() ) );
                    }
                }
            }
        }

        return result.stream();
    }

    @SystemProcedure
    @Description( "List all transactions currently executing at this instance that are visible to the user." )
    @Procedure( name = "dbms.listTransactions", mode = Mode.DBMS )
    public Stream<TransactionStatusResult> listTransactions() throws InvalidArgumentsException
    {
        this.securityContext.assertCredentialsNotExpired();
        ZoneId zoneId = this.getConfiguredTimeZone();
        List<TransactionStatusResult> result = new ArrayList();
        Iterator iterator = this.getDatabaseManager().registeredDatabases().values().iterator();

        while ( iterator.hasNext() )
        {
            DatabaseContext databaseContext = (DatabaseContext) iterator.next();
            Map<KernelTransactionHandle,Optional<QuerySnapshot>> handleQuerySnapshotsMap = new HashMap();
            Iterator executingTransactionsIterator = getExecutingTransactions( databaseContext ).iterator();

            while ( executingTransactionsIterator.hasNext() )
            {
                KernelTransactionHandle tx = (KernelTransactionHandle) executingTransactionsIterator.next();
                if ( this.isAdminOrSelf( tx.subject().username() ) )
                {
                    handleQuerySnapshotsMap.put( tx, tx.executingQuery().map( ExecutingQuery::snapshot ) );
                }
            }

            TransactionDependenciesResolver transactionBlockerResolvers = new TransactionDependenciesResolver(
                    handleQuerySnapshotsMap );
            Iterator qIterator = handleQuerySnapshotsMap.keySet().iterator();

            while ( qIterator.hasNext() )
            {
                KernelTransactionHandle tx = (KernelTransactionHandle) qIterator.next();
                result.add(
                        new TransactionStatusResult( databaseContext.databaseFacade().databaseName(), tx,
                                                     transactionBlockerResolvers, handleQuerySnapshotsMap,
                                                     zoneId ) );
            }
        }

        return result.stream();
    }

    @SystemProcedure
    @Description( "Kill transaction with provided id." )
    @Procedure( name = "dbms.killTransaction", mode = Mode.DBMS )
    public Stream<TransactionMarkedForTerminationResult> killTransaction(
            @Name( "id" ) String transactionId ) throws InvalidArgumentsException
    {
        Objects.requireNonNull( transactionId );
        return this.killTransactions( Collections.singletonList( transactionId ) );
    }

    @SystemProcedure
    @Description( "Kill transactions with provided ids." )
    @Procedure( name = "dbms.killTransactions", mode = Mode.DBMS )
    public Stream<TransactionMarkedForTerminationResult> killTransactions(
            @Name( "ids" ) List<String> transactionIds ) throws InvalidArgumentsException
    {
        Objects.requireNonNull( transactionIds );
        this.securityContext.assertCredentialsNotExpired();
        this.log.warn( "User %s trying to kill transactions: %s.",
                       new Object[]{this.securityContext.subject().username(), transactionIds.toString()} );
        DatabaseManager<DatabaseContext> databaseManager = this.getDatabaseManager();
        DatabaseIdRepository databaseIdRepository = databaseManager.databaseIdRepository();
        Map<NamedDatabaseId,Set<TransactionId>> byDatabase = new HashMap();
        Iterator transactionIdIterator = transactionIds.iterator();

        while ( transactionIdIterator.hasNext() )
        {
            String idText = (String) transactionIdIterator.next();
            TransactionId id = new TransactionId( idText );
            Optional<NamedDatabaseId> namedDatabaseId = databaseIdRepository.getByName( id.getDatabase() );
            namedDatabaseId.ifPresent( ( databaseIdx ) ->
                                       {
                                           ((Set) byDatabase.computeIfAbsent( databaseIdx, ( ignore ) ->
                                           {
                                               return new HashSet();
                                           } )).add( id );
                                       } );
        }

        Map<String,KernelTransactionHandle> handles = new HashMap( transactionIds.size() );
        Iterator iterator = byDatabase.entrySet().iterator();

        while ( true )
        {
            Optional maybeDatabaseContext;
            Entry entry;
            NamedDatabaseId databaseId;
            do
            {
                if ( !iterator.hasNext() )
                {
                    return transactionIds.stream().map( ( idx ) ->
                                                        {
                                                            return this.terminateTransaction( handles, idx );
                                                        } );
                }

                entry = (Entry) iterator.next();
                databaseId = (NamedDatabaseId) entry.getKey();
                maybeDatabaseContext = databaseManager.getDatabaseContext( databaseId );
            }
            while ( !maybeDatabaseContext.isPresent() );

            Set<TransactionId> txIds = (Set) entry.getValue();
            DatabaseContext databaseContext = (DatabaseContext) maybeDatabaseContext.get();
            Iterator etIterator = getExecutingTransactions( databaseContext ).iterator();

            while ( etIterator.hasNext() )
            {
                KernelTransactionHandle tx = (KernelTransactionHandle) etIterator.next();
                if ( this.isAdminOrSelf( tx.subject().username() ) )
                {
                    TransactionId txIdRepresentation = new TransactionId( databaseId.name(),
                                                                          tx.getUserTransactionId() );
                    if ( txIds.contains( txIdRepresentation ) )
                    {
                        handles.put( txIdRepresentation.toString(), tx );
                    }
                }
            }
        }
    }

    private TransactionMarkedForTerminationResult terminateTransaction(
            Map<String,KernelTransactionHandle> handles, String transactionId )
    {
        KernelTransactionHandle handle = (KernelTransactionHandle) handles.get( transactionId );
        String currentUser = this.securityContext.subject().username();
        if ( handle == null )
        {
            return new TransactionMarkedForTerminationFailedResult( transactionId, currentUser );
        }
        else if ( handle.isClosing() )
        {
            return new TransactionMarkedForTerminationFailedResult( transactionId, currentUser,
                                                                    "Unable to kill closing transactions." );
        }
        else
        {
            this.log
                    .debug( "User %s terminated transaction %d.", new Object[]{currentUser, transactionId} );
            handle.markForTermination( org.neo4j.kernel.api.exceptions.Status.Transaction.Terminated );
            return new TransactionMarkedForTerminationResult( transactionId, handle.subject().username() );
        }
    }

    @SystemProcedure
    @Description( "List the active lock requests granted for the transaction executing the query with the given query id." )
    @Procedure( name = "dbms.listActiveLocks", mode = Mode.DBMS )
    public Stream<ActiveLocksResult> listActiveLocks( @Name( "queryId" ) String queryIdText )
            throws InvalidArgumentsException
    {
        this.securityContext.assertCredentialsNotExpired();
        QueryId dbmsQueryId = new QueryId( queryIdText );
        DatabaseManager<DatabaseContext> databaseManager = this.getDatabaseManager();
        DatabaseIdRepository databaseIdRepository = databaseManager.databaseIdRepository();
        Optional<NamedDatabaseId> maybeNamedDatabaseId = databaseIdRepository
                .getByName( dbmsQueryId.getDatabase() );
        if ( maybeNamedDatabaseId.isPresent() )
        {
            NamedDatabaseId namedDatabaseId = (NamedDatabaseId) maybeNamedDatabaseId.get();
            Optional<DatabaseContext> maybeDatabaseContext = databaseManager
                    .getDatabaseContext( namedDatabaseId );
            if ( maybeDatabaseContext.isPresent() )
            {
                DatabaseContext databaseContext = (DatabaseContext) maybeDatabaseContext.get();
                Iterator iterator = getExecutingTransactions( databaseContext ).iterator();

                while ( iterator.hasNext() )
                {
                    KernelTransactionHandle tx = (KernelTransactionHandle) iterator.next();
                    if ( tx.executingQuery().isPresent() )
                    {
                        ExecutingQuery query = (ExecutingQuery) tx.executingQuery().get();
                        if ( query.internalQueryId() == dbmsQueryId.getInternalId() )
                        {
                            if ( this.isAdminOrSelf( query.username() ) )
                            {
                                return tx.activeLocks().map( ActiveLocksResult::new );
                            }

                            throw new AuthorizationViolationException( "Permission denied." );
                        }
                    }
                }
            }
        }

        return Stream.empty();
    }

    @SystemProcedure
    @Description( "Kill all transactions executing the query with the given query id." )
    @Procedure( name = "dbms.killQuery", mode = Mode.DBMS )
    public Stream<EnterpriseBuiltInDbmsProcedures.QueryTerminationResult> killQuery(
            @Name( "id" ) String idText ) throws InvalidArgumentsException
    {
        return this.killQueries( Collections.singletonList( idText ) );
    }

    @SystemProcedure
    @Description( "Kill all transactions executing a query with any of the given query ids." )
    @Procedure( name = "dbms.killQueries", mode = Mode.DBMS )
    public Stream<EnterpriseBuiltInDbmsProcedures.QueryTerminationResult> killQueries(
            @Name( "ids" ) List<String> idTexts ) throws InvalidArgumentsException
    {
        this.securityContext.assertCredentialsNotExpired();
        DatabaseManager<DatabaseContext> databaseManager = this.getDatabaseManager();
        DatabaseIdRepository databaseIdRepository = databaseManager.databaseIdRepository();
        Set<NamedDatabaseId> affectedDatabases = new HashSet();
        Set<QueryId> dbmsQueryIds = new HashSet( idTexts.size() );
        Iterator iterator = idTexts.iterator();

        QueryId dbmsQueryId;
        while ( iterator.hasNext() )
        {
            String idText = (String) iterator.next();
            dbmsQueryId = new QueryId( idText );
            dbmsQueryIds.add( dbmsQueryId );
            Optional<NamedDatabaseId> namedDatabaseId = databaseIdRepository
                    .getByName( dbmsQueryId.getDatabase() );
            Objects.requireNonNull( affectedDatabases );
            namedDatabaseId.ifPresent( affectedDatabases::add );
        }

        List<EnterpriseBuiltInDbmsProcedures.QueryTerminationResult> result = new ArrayList(
                dbmsQueryIds.size() );
        Iterator adIterator = affectedDatabases.iterator();

        while ( true )
        {
            Optional maybeDatabaseContext;
            do
            {
                if ( !adIterator.hasNext() )
                {
                    adIterator = dbmsQueryIds.iterator();

                    while ( adIterator.hasNext() )
                    {
                        dbmsQueryId = (QueryId) adIterator.next();
                        result.add(
                                new EnterpriseBuiltInDbmsProcedures.QueryFailedTerminationResult( dbmsQueryId, "n/a",
                                                                                                  "No Query found with this id" ) );
                    }

                    return result.stream();
                }

                NamedDatabaseId databaseId = (NamedDatabaseId) adIterator.next();
                maybeDatabaseContext = databaseManager.getDatabaseContext( databaseId );
            }
            while ( !maybeDatabaseContext.isPresent() );

            DatabaseContext databaseContext = (DatabaseContext) maybeDatabaseContext.get();
            Iterator etIterator = getExecutingTransactions( databaseContext ).iterator();

            while ( etIterator.hasNext() )
            {
                KernelTransactionHandle tx = (KernelTransactionHandle) etIterator.next();
                QueryId internalDbmsQueryId = new QueryId( databaseContext.databaseFacade().databaseName(),
                                                           (Long) tx.executingQuery().map( ExecutingQuery::internalQueryId ).orElse( -1L ) );
                if ( dbmsQueryIds.remove( internalDbmsQueryId ) )
                {
                    result.add( this.killQueryTransaction( internalDbmsQueryId, tx ) );
                }
            }
        }
    }

    @Admin
    @SystemProcedure
    @Description( "List the job groups that are active in the db internal job scheduler." )
    @Procedure( name = "dbms.scheduler.groups", mode = Mode.DBMS )
    public Stream<EnterpriseBuiltInDbmsProcedures.ActiveSchedulingGroup> schedulerActiveGroups()
    {
        JobScheduler scheduler = (JobScheduler) this.resolver.resolveDependency( JobScheduler.class );
        return scheduler.activeGroups().map( EnterpriseBuiltInDbmsProcedures.ActiveSchedulingGroup::new );
    }

    @Admin
    @SystemProcedure
    @Description( "Begin profiling all threads within the given job group, for the specified duration. Note that profiling incurs overhead to a system, and will slow it down." )
    @Procedure( name = "dbms.scheduler.profile", mode = Mode.DBMS )
    public Stream<EnterpriseBuiltInDbmsProcedures.ProfileResult> schedulerProfileGroup(
            @Name( "method" ) String method, @Name( "group" ) String groupName,
            @Name( "duration" ) String duration ) throws InterruptedException
    {
        if ( !"sample".equals( method ) )
        {
            throw new IllegalArgumentException(
                    "No such profiling method: '" + method + "'. Valid methods are: 'sample'." );
        }
        else
        {
            Profiler profiler = Profiler.profiler();
            Group group = null;
            Group[] groupValues = Group.values();

            for ( int i = 0; i < groupValues.length; ++i )
            {
                Group value = groupValues[i];
                if ( value.groupName().equals( groupName ) )
                {
                    group = value;
                    break;
                }
            }

            if ( group == null )
            {
                throw new IllegalArgumentException( "No such scheduling group: '" + groupName + "'." );
            }
            else
            {
                long durationNanos = TimeUnit.MILLISECONDS
                        .toNanos( (Long) TimeUtil.parseTimeMillis.apply( duration ) );
                JobScheduler scheduler = (JobScheduler) this.resolver.resolveDependency( JobScheduler.class );
                long deadline = System.nanoTime() + durationNanos;

                try
                {
                    scheduler.profileGroup( group, profiler );

                    while ( System.nanoTime() < deadline )
                    {
                        this.kernelTransaction.assertOpen();
                        Thread.sleep( 100L );
                    }
                }
                finally
                {
                    profiler.finish();
                }

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                PrintStream out = new PrintStream( baos );
                profiler.printProfile( out, "Profiled group '" + group + "'." );
                out.flush();
                return Stream.of( new EnterpriseBuiltInDbmsProcedures.ProfileResult( baos.toString() ) );
            }
        }
    }

    @SystemProcedure
    @Description( "Initiate and wait for a new check point, or wait any already on-going check point to complete. Note that this temporarily disables the `dbms.checkpoint.iops.limit` setting in order to make the check point complete faster. This might cause transaction throughput to degrade slightly, due to increased IO load." )
    @Procedure( name = "db.checkpoint", mode = Mode.DBMS )
    public Stream<EnterpriseBuiltInDbmsProcedures.CheckpointResult> checkpoint() throws IOException
    {
        CheckPointer checkPointer = (CheckPointer) this.resolver.resolveDependency( CheckPointer.class );

        Objects.requireNonNull( kernelTransaction );
        BooleanSupplier timeoutPredicate = kernelTransaction::isTerminated;
        long transactionId = checkPointer
                .tryCheckPoint( new SimpleTriggerInfo( "Call to db.checkpoint() procedure" ),
                                timeoutPredicate );
        return Stream.of(
                transactionId == -1L ? EnterpriseBuiltInDbmsProcedures.CheckpointResult.TERMINATED
                                     : EnterpriseBuiltInDbmsProcedures.CheckpointResult.SUCCESS );
    }

    private DatabaseManager<DatabaseContext> getDatabaseManager()
    {
        return (DatabaseManager) this.resolver.resolveDependency( DatabaseManager.class );
    }

    private EnterpriseBuiltInDbmsProcedures.QueryTerminationResult killQueryTransaction(
            QueryId dbmsQueryId, KernelTransactionHandle handle )
    {
        Optional<ExecutingQuery> query = handle.executingQuery();
        ExecutingQuery executingQuery = (ExecutingQuery) query.orElseThrow( () ->
                                                                            {
                                                                                return new IllegalStateException(
                                                                                        "Query should exist since we filtered based on query ids" );
                                                                            } );
        if ( this.isAdminOrSelf( executingQuery.username() ) )
        {
            if ( handle.isClosing() )
            {
                return new EnterpriseBuiltInDbmsProcedures.QueryFailedTerminationResult( dbmsQueryId,
                                                                                         executingQuery.username(),
                                                                                         "Unable to kill queries when underlying transaction is closing." );
            }
            else
            {
                handle.markForTermination( org.neo4j.kernel.api.exceptions.Status.Transaction.Terminated );
                return new EnterpriseBuiltInDbmsProcedures.QueryTerminationResult( dbmsQueryId,
                                                                                   executingQuery.username(), "Query found" );
            }
        }
        else
        {
            throw new AuthorizationViolationException( "Permission denied." );
        }
    }

    private ZoneId getConfiguredTimeZone()
    {
        Config config = (Config) this.resolver.resolveDependency( Config.class );
        return ((LogTimeZone) config.get( GraphDatabaseSettings.db_timezone )).getZoneId();
    }

    private boolean isAdminOrSelf( String username )
    {
        return this.securityContext.isAdmin() || this.securityContext.subject().hasUsername( username );
    }

    public static enum CheckpointResult
    {
        SUCCESS( true, "Checkpoint completed." ),
        TERMINATED( false,
                    "Transaction terminated while waiting for the requested checkpoint operation to finish." );

        public final boolean success;
        public final String message;

        private CheckpointResult( boolean success, String message )
        {
            this.success = success;
            this.message = message;
        }
    }

    public static class ProfileResult
    {

        public final String profile;

        public ProfileResult( String profile )
        {
            this.profile = profile;
        }
    }

    public static class ActiveSchedulingGroup
    {

        public final String group;
        public final long threads;

        ActiveSchedulingGroup( ActiveGroup activeGroup )
        {
            this.group = activeGroup.group.groupName();
            this.threads = (long) activeGroup.threads;
        }
    }

    public static class QueryFailedTerminationResult extends
                                                     EnterpriseBuiltInDbmsProcedures.QueryTerminationResult
    {

        public QueryFailedTerminationResult( QueryId dbmsQueryId, String username, String message )
        {
            super( dbmsQueryId, username, message );
        }
    }

    public static class QueryTerminationResult
    {

        public final String queryId;
        public final String username;
        public final String message;

        public QueryTerminationResult( QueryId dbmsQueryId, String username, String message )
        {
            this.queryId = dbmsQueryId.toString();
            this.username = username;
            this.message = message;
        }
    }

    public static class ProcedureResult
    {

        private static final List<String> ADMIN_PROCEDURES = Arrays
                .asList( "changeUserPassword", "listRolesForUser" );
        private static final List<String> NON_EDITOR_PROCEDURES = Arrays
                .asList( "createLabel", "createProperty", "createRelationshipType" );
        public final String name;
        public final String signature;
        public final String description;
        public final String mode;
        public final List<String> defaultBuiltInRoles;
        public final boolean worksOnSystem;

        public ProcedureResult( ProcedureSignature signature )
        {
            this.name = signature.name().toString();
            this.signature = signature.toString();
            this.description = (String) signature.description().orElse( "" );
            this.mode = signature.mode().toString();
            this.worksOnSystem = signature.systemProcedure();
            this.defaultBuiltInRoles = new ArrayList();
            switch ( signature.mode() )
            {
            case DBMS:
                if ( !signature.admin() && !this.isAdminProcedure( signature.name().name() ) )
                {
                    this.defaultBuiltInRoles.add( "reader" );
                    this.defaultBuiltInRoles.add( "editor" );
                    this.defaultBuiltInRoles.add( "publisher" );
                    this.defaultBuiltInRoles.add( "architect" );
                    this.defaultBuiltInRoles.add( "admin" );
                    this.defaultBuiltInRoles.addAll( Arrays.asList( signature.allowed() ) );
                }
                else
                {
                    this.defaultBuiltInRoles.add( "admin" );
                }
                break;
            case DEFAULT:
            case READ:
                this.defaultBuiltInRoles.add( "reader" );
            case WRITE:
                if ( !NON_EDITOR_PROCEDURES.contains( signature.name().name() ) )
                {
                    this.defaultBuiltInRoles.add( "editor" );
                }

                this.defaultBuiltInRoles.add( "publisher" );
            case SCHEMA:
                this.defaultBuiltInRoles.add( "architect" );
            default:
                this.defaultBuiltInRoles.add( "admin" );
                this.defaultBuiltInRoles.addAll( Arrays.asList( signature.allowed() ) );
            }
        }

        private boolean isAdminProcedure( String procedureName )
        {
            return this.name.startsWith( "dbms.security." ) && ADMIN_PROCEDURES.contains( procedureName );
        }
    }

    public static class FunctionResult
    {

        public final String name;
        public final String signature;
        public final String description;
        public final boolean aggregating;
        public final List<String> defaultBuiltInRoles;

        private FunctionResult( UserFunctionSignature signature, boolean isAggregation )
        {
            this.name = signature.name().toString();
            this.signature = signature.toString();
            this.description = (String) signature.description().orElse( "" );
            this.defaultBuiltInRoles = (List) Stream
                    .of( "admin", "reader", "editor", "publisher", "architect" ).collect( Collectors.toList() );
            this.defaultBuiltInRoles.addAll( Arrays.asList( signature.allowed() ) );
            this.aggregating = isAggregation;
        }

        private FunctionResult( FunctionInformation info )
        {
            this.name = info.getFunctionName();
            this.signature = info.getSignature();
            this.description = info.getDescription();
            this.aggregating = info.isAggregationFunction();
            this.defaultBuiltInRoles = (List) Stream
                    .of( "admin", "reader", "editor", "publisher", "architect" ).collect( Collectors.toList() );
        }
    }
}
