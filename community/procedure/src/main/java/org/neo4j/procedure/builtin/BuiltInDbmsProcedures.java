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
package org.neo4j.procedure.builtin;

import java.security.NoSuchAlgorithmException;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.neo4j.capabilities.CapabilitiesService;
import org.neo4j.collection.Dependencies;
import org.neo4j.common.DependencyResolver;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.internal.kernel.api.helpers.TransactionDependenciesResolver;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.database.DatabaseContext;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.SystemGraphComponent;
import org.neo4j.dbms.database.SystemGraphComponents;
import org.neo4j.fabric.executor.FabricExecutor;
import org.neo4j.fabric.executor.FabricStatementLifecycles;
import org.neo4j.fabric.transaction.FabricTransaction;
import org.neo4j.fabric.transaction.TransactionManager;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.internal.kernel.api.procs.ProcedureCallContext;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.UserFunctionSignature;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource.DatabaseScope;
import org.neo4j.internal.kernel.api.security.SecurityContext;
import org.neo4j.internal.kernel.api.security.UserSegment;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.api.KernelTransactionHandle;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.kernel.api.net.NetworkConnectionTracker;
import org.neo4j.kernel.api.net.TrackedNetworkConnection;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.kernel.api.procedure.SystemProcedure;
import org.neo4j.kernel.api.query.ExecutingQuery;
import org.neo4j.kernel.api.query.QuerySnapshot;
import org.neo4j.kernel.database.DatabaseIdRepository;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.api.KernelTransactions;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.kernel.impl.query.FunctionInformation;
import org.neo4j.kernel.impl.query.QueryExecutionEngine;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.logging.Log;
import org.neo4j.procedure.Admin;
import org.neo4j.procedure.Context;
import org.neo4j.procedure.Description;
import org.neo4j.procedure.Internal;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.Procedure;
import org.neo4j.storageengine.api.StoreIdProvider;

import static java.lang.String.format;
import static java.util.Collections.singletonList;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;
import static org.neo4j.configuration.GraphDatabaseSettings.SYSTEM_DATABASE_NAME;
import static org.neo4j.dbms.database.SystemGraphComponent.Status.REQUIRES_UPGRADE;
import static org.neo4j.dbms.database.SystemGraphComponent.Status.UNINITIALIZED;
import static org.neo4j.internal.kernel.api.security.AdminActionOnResource.DatabaseScope.ALL;
import static org.neo4j.internal.kernel.api.security.PrivilegeAction.SHOW_TRANSACTION;
import static org.neo4j.internal.kernel.api.security.PrivilegeAction.TERMINATE_TRANSACTION;
import static org.neo4j.kernel.api.exceptions.Status.Procedure.ProcedureCallFailed;
import static org.neo4j.procedure.Mode.DBMS;
import static org.neo4j.procedure.Mode.READ;
import static org.neo4j.procedure.Mode.WRITE;
import static org.neo4j.procedure.builtin.ProceduresTimeFormatHelper.formatTime;
import static org.neo4j.storageengine.util.StoreIdDecodeUtils.decodeId;

@SuppressWarnings( "unused" )
public class BuiltInDbmsProcedures
{
    private static final int HARD_CHAR_LIMIT = 2048;

    @Context
    public Log log;

    @Context
    public DependencyResolver resolver;

    @Context
    public GraphDatabaseAPI graph;

    @Context
    public Transaction transaction;

    @Context
    public KernelTransaction kernelTransaction;

    @Context
    public SecurityContext securityContext;

    @Context
    public ProcedureCallContext callContext;

    @Context
    public SystemGraphComponents systemGraphComponents;

    @SystemProcedure
    @Description( "Provides information regarding the DBMS." )
    @Procedure( name = "dbms.info", mode = DBMS )
    public Stream<SystemInfo> databaseInfo() throws NoSuchAlgorithmException
    {
        var systemGraph = getSystemDatabase();
        return dbmsInfo( systemGraph );
    }

    public static Stream<SystemInfo> dbmsInfo( GraphDatabaseAPI system ) throws NoSuchAlgorithmException
    {
        Config config = system.getDependencyResolver().resolveDependency( Config.class );
        var storeIdProvider = getSystemDatabaseStoreIdProvider( system );
        var creationTime = formatTime( storeIdProvider.getStoreId().getCreationTime(), config.get( GraphDatabaseSettings.db_timezone ).getZoneId() );
        return Stream.of( new SystemInfo( decodeId( storeIdProvider ), system.databaseName(), creationTime ) );
    }

    @Admin
    @SystemProcedure
    @Description( "List the currently active config of ONgDB." )
    @Procedure( name = "dbms.listConfig", mode = DBMS )
    public Stream<ConfigResult> listConfig( @Name( value = "searchString", defaultValue = "" ) String searchString )
    {
        String lowerCasedSearchString = searchString.toLowerCase();
        List<ConfigResult> results = new ArrayList<>();

        Config config = graph.getDependencyResolver().resolveDependency( Config.class );

        config.getValues().forEach( ( setting, value ) ->
                                    {
                                        if ( !setting.internal() && setting.name().toLowerCase().contains( lowerCasedSearchString ) )
                                        {
                                            results.add( new ConfigResult( setting, value ) );
                                        }
                                    } );
        return results.stream().sorted( Comparator.comparing( c -> c.name ) );
    }

    @Internal
    @SystemProcedure
    @Description( "Return config settings interesting to clients (e.g. ONgDB Browser)" )
    @Procedure( name = "dbms.clientConfig", mode = DBMS )
    public Stream<ConfigResult> listClientConfig()
    {
        List<ConfigResult> results = new ArrayList<>();
        Set<String> browserSettings = Stream.of( "browser.allow_outgoing_connections",
                                                 "browser.credential_timeout",
                                                 "browser.retain_connection_credentials",
                                                 "browser.retain_editor_history",
                                                 "dbms.security.auth_enabled",
                                                 "browser.remote_content_hostname_whitelist",
                                                 "browser.post_connect_cmd",
                                                 "clients.allow_telemetry",
                                                 "metrics.prefix",
                                                 "metrics.namespaces.enabled",
                                                 "dbms.default_database" ).collect( Collectors.toCollection( HashSet::new ) );

        Config config = graph.getDependencyResolver().resolveDependency( Config.class );
        config.getValues().forEach( ( setting, value ) ->
                                    {
                                        if ( browserSettings.contains( setting.name().toLowerCase() ) )
                                        {
                                            results.add( new ConfigResult( setting, value ) );
                                        }
                                    } );
        return results.stream().sorted( Comparator.comparing( c -> c.name ) );
    }

    @Description( "Attaches a map of data to the transaction. The data will be printed when listing queries, and " +
                  "inserted into the query log." )
    @Procedure( name = "tx.setMetaData", mode = DBMS )
    public void setTXMetaData( @Name( value = "data" ) Map<String,Object> data )
    {
        int totalCharSize = data.entrySet()
                                .stream()
                                .mapToInt( e -> e.getKey().length() + ((e.getValue() != null) ? e.getValue().toString().length() : 0) )
                                .sum();

        if ( totalCharSize >= HARD_CHAR_LIMIT )
        {
            throw new IllegalArgumentException(
                    format( "Invalid transaction meta-data, expected the total number of chars for " +
                            "keys and values to be less than %d, got %d", HARD_CHAR_LIMIT, totalCharSize ) );
        }

        InternalTransaction internalTransaction = (InternalTransaction) this.transaction;

        graph.getDependencyResolver().resolveDependency( TransactionManager.class )
             .findTransactionContaining( internalTransaction )
             .ifPresentOrElse(
                     parent -> parent.setMetaData( data ),
                     () -> internalTransaction.setMetaData( data )
             );
    }

    @SystemProcedure
    @Description( "Provides attached transaction metadata." )
    @Procedure( name = "tx.getMetaData", mode = DBMS )
    public Stream<MetadataResult> getTXMetaData()
    {
        return Stream.of( ((InternalTransaction) transaction).kernelTransaction().getMetaData() ).map( MetadataResult::new );
    }

    @Deprecated( since = "4.3.0", forRemoval = true )
    @SystemProcedure
    @Description( "List all procedures in the DBMS." )
    @Procedure( name = "dbms.procedures", mode = DBMS, deprecatedBy = "SHOW PROCEDURES command" )
    public Stream<ProcedureResult> listProcedures()
    {
        return graph.getDependencyResolver().resolveDependency( GlobalProcedures.class ).getAllProcedures().stream()
                    .filter( proc -> !proc.internal() )
                    .sorted( Comparator.comparing( a -> a.name().toString() ) )
                    .map( ProcedureResult::new );
    }

    @Deprecated( since = "4.3.0", forRemoval = true )
    @SystemProcedure
    @Description( "List all functions in the DBMS." )
    @Procedure( name = "dbms.functions", mode = DBMS, deprecatedBy = "SHOW FUNCTIONS command" )
    public Stream<FunctionResult> listFunctions()
    {
        DependencyResolver resolver = graph.getDependencyResolver();
        QueryExecutionEngine queryExecutionEngine = resolver.resolveDependency( QueryExecutionEngine.class );
        List<FunctionInformation> providedLanguageFunctions = queryExecutionEngine.getProvidedLanguageFunctions();
        var globalProcedures = resolver.resolveDependency( GlobalProcedures.class );

        // gets you all functions provided by the query language
        Stream<FunctionResult> languageFunctions =
                providedLanguageFunctions.stream().map( FunctionResult::new );

        // gets you all non-aggregating functions that are registered in the db (incl. those from libs like apoc)
        Stream<FunctionResult> loadedFunctions = globalProcedures.getAllNonAggregatingFunctions()
                                                                 .map( f -> new FunctionResult( f, false ) );

        // gets you all aggregation functions that are registered in the db (incl. those from libs like apoc)
        Stream<FunctionResult> loadedAggregationFunctions = globalProcedures.getAllAggregatingFunctions()
                                                                            .map( f -> new FunctionResult( f, true ) );

        return Stream.concat( Stream.concat( languageFunctions, loadedFunctions ), loadedAggregationFunctions )
                     .sorted( Comparator.comparing( a -> a.name ) );
    }

    @Admin
    @SystemProcedure
    @Description( "Clears all query caches." )
    @Procedure( name = "db.clearQueryCaches", mode = DBMS )
    public Stream<StringResult> clearAllQueryCaches()
    {
        QueryExecutionEngine queryExecutionEngine =
                graph.getDependencyResolver().resolveDependency(QueryExecutionEngine.class);
        FabricExecutor fabricExecutor = graph.getDependencyResolver().resolveDependency(FabricExecutor.class);

        // we subtract 1 because the query "CALL db.queryClearCaches()" is compiled and thus populates the caches by 1
        long numberOfClearedQueries = Math.max(
                        queryExecutionEngine.clearQueryCaches(),
                        fabricExecutor.clearQueryCachesForDatabase(graph.databaseName()))
                - 1;

        String result = numberOfClearedQueries == 0 ? "Query cache already empty."
                                                    : "Query caches successfully cleared of " + numberOfClearedQueries + " queries.";
        log.info( "Called db.clearQueryCaches(): " + result );
        return Stream.of( new StringResult( result ) );
    }

    @Admin
    @SystemProcedure
    @Description( "Report the current status of the system database sub-graph schema." )
    @Procedure( name = "dbms.upgradeStatus", mode = READ )
    public Stream<SystemGraphComponentStatusResult> upgradeStatus() throws ProcedureException
    {
        if ( !callContext.isSystemDatabase() )
        {
            throw new ProcedureException( ProcedureCallFailed,
                                          "This is an administration command and it should be executed against the system database: dbms.upgradeStatus" );
        }
        return Stream.of( new SystemGraphComponentStatusResult( systemGraphComponents.detect( transaction ) ) );
    }

    @Admin
    @SystemProcedure
    @Description( "Upgrade the system database schema if it is not the current schema." )
    @Procedure( name = "dbms.upgrade", mode = WRITE )
    public Stream<SystemGraphComponentUpgradeResult> upgrade() throws ProcedureException
    {
        if ( !callContext.isSystemDatabase() )
        {
            throw new ProcedureException( ProcedureCallFailed,
                                          "This is an administration command and it should be executed against the system database: dbms.upgrade" );
        }
        SystemGraphComponents versions = systemGraphComponents;
        SystemGraphComponent.Status status = versions.detect( graph );

        // New components are not currently initialised in cluster deployment when new binaries are booted on top of an existing database.
        // This is a known shortcoming of the lifecycle and a state transfer from UNINITIALIZED to CURRENT must be supported
        // as a workaround until it is fixed.
        var upgradableStatuses = List.of( REQUIRES_UPGRADE, UNINITIALIZED );

        if ( upgradableStatuses.contains( status ) )
        {
            ArrayList<String> failed = new ArrayList<>();
            versions.forEach( component ->
                              {
                                  SystemGraphComponent.Status initialStatus = component.detect( graph );
                                  if ( upgradableStatuses.contains( initialStatus ) )
                                  {
                                      try
                                      {
                                          component.upgradeToCurrent( graph );
                                      }
                                      catch ( Exception e )
                                      {
                                          failed.add( String.format( "[%s] %s", component.componentName(), e.getMessage() ) );
                                      }
                                  }
                              } );
            String upgradeResult = failed.isEmpty() ? "Success" : "Failed: " + String.join( ", ", failed );
            return Stream.of( new SystemGraphComponentUpgradeResult( versions.detect( transaction ).name(), upgradeResult ) );
        }
        else
        {
            return Stream.of( new SystemGraphComponentUpgradeResult( status.name(), status.resolution() ) );
        }
    }

    @Deprecated( since = "4.4.0", forRemoval = true )
    @SystemProcedure
    @Description( "List all transactions currently executing at this instance that are visible to the user." )
    @Procedure( name = "dbms.listTransactions", mode = DBMS, deprecatedBy = "SHOW TRANSACTIONS command" )
    public Stream<TransactionStatusResult> listTransactions() throws InvalidArgumentsException
    {
        ZoneId zoneId = getConfiguredTimeZone();
        List<TransactionStatusResult> result = new ArrayList<>();
        for ( DatabaseContext databaseContext : getDatabaseManager().registeredDatabases().values() )
        {
            if ( databaseContext.database().isStarted() )
            {
                DatabaseScope dbScope = new DatabaseScope( databaseContext.database().getNamedDatabaseId().name() );
                Map<KernelTransactionHandle,Optional<QuerySnapshot>> handleQuerySnapshotsMap = new HashMap<>();
                for ( KernelTransactionHandle tx : getExecutingTransactions( databaseContext ) )
                {
                    String username = tx.subject().executingUser();
                    var action = new AdminActionOnResource( SHOW_TRANSACTION, dbScope, new UserSegment( username ) );
                    if ( isSelfOrAllows( username, action ) )
                    {
                        handleQuerySnapshotsMap.put( tx, tx.executingQuery().map( ExecutingQuery::snapshot ) );
                    }
                }
                TransactionDependenciesResolver transactionBlockerResolvers = new TransactionDependenciesResolver( handleQuerySnapshotsMap );

                for ( KernelTransactionHandle tx : handleQuerySnapshotsMap.keySet() )
                {
                    result.add( new TransactionStatusResult( databaseContext.databaseFacade().databaseName(), tx, transactionBlockerResolvers,
                                                             handleQuerySnapshotsMap, zoneId ) );
                }
            }
        }

        return result.stream();
    }

    @Deprecated( since = "4.4.0", forRemoval = true )
    @SystemProcedure
    @Description( "Kill transaction with provided id." )
    @Procedure( name = "dbms.killTransaction", mode = DBMS, deprecatedBy = "TERMINATE TRANSACTIONS command" )
    public Stream<TransactionMarkForTerminationResult> killTransaction( @Name( "id" ) String transactionId ) throws InvalidArgumentsException
    {
        requireNonNull( transactionId );
        return killTransactions( singletonList( transactionId ) );
    }

    @Deprecated( since = "4.4.0", forRemoval = true )
    @SystemProcedure
    @Description( "Kill transactions with provided ids." )
    @Procedure( name = "dbms.killTransactions", mode = DBMS, deprecatedBy = "TERMINATE TRANSACTIONS command" )
    public Stream<TransactionMarkForTerminationResult> killTransactions( @Name( "ids" ) List<String> transactionIds ) throws InvalidArgumentsException
    {
        requireNonNull( transactionIds );
        log.warn( "User %s trying to kill transactions: %s.", securityContext.subject().executingUser(), transactionIds.toString() );

        DatabaseManager<DatabaseContext> databaseManager = getDatabaseManager();
        DatabaseIdRepository databaseIdRepository = databaseManager.databaseIdRepository();

        Map<NamedDatabaseId,Set<TransactionId>> byDatabase = new HashMap<>();
        for ( String idText : transactionIds )
        {
            TransactionId id = TransactionId.parse( idText );
            Optional<NamedDatabaseId> namedDatabaseId = databaseIdRepository.getByName( id.database() );
            namedDatabaseId.ifPresent( databaseId -> byDatabase.computeIfAbsent( databaseId, ignore -> new HashSet<>() ).add( id ) );
        }

        Map<String,KernelTransactionHandle> handles = new HashMap<>( transactionIds.size() );
        for ( Map.Entry<NamedDatabaseId,Set<TransactionId>> entry : byDatabase.entrySet() )
        {
            NamedDatabaseId databaseId = entry.getKey();
            var dbScope = new DatabaseScope( databaseId.name() );
            Optional<DatabaseContext> maybeDatabaseContext = databaseManager.getDatabaseContext( databaseId );
            if ( maybeDatabaseContext.isPresent() )
            {
                Set<TransactionId> txIds = entry.getValue();
                DatabaseContext databaseContext = maybeDatabaseContext.get();
                for ( KernelTransactionHandle tx : getExecutingTransactions( databaseContext ) )
                {
                    String username = tx.subject().executingUser();
                    var action = new AdminActionOnResource( TERMINATE_TRANSACTION, dbScope, new UserSegment( username ) );
                    if ( !isSelfOrAllows( username, action ) )
                    {
                        continue;
                    }
                    TransactionId txIdRepresentation = new TransactionId( databaseId.name(), tx.getUserTransactionId() );
                    if ( txIds.contains( txIdRepresentation ) )
                    {
                        handles.put( txIdRepresentation.toString(), tx );
                    }
                }
            }
        }

        return transactionIds.stream().map( id -> terminateTransaction( handles, id ) );
    }

    @Deprecated( since = "4.4.0", forRemoval = true )
    @SystemProcedure
    @Description( "List all queries currently executing at this instance that are visible to the user." )
    @Procedure( name = "dbms.listQueries", mode = DBMS, deprecatedBy = "SHOW TRANSACTIONS command" )
    public Stream<QueryStatusResult> listQueries() throws InvalidArgumentsException
    {
        ZoneId zoneId = getConfiguredTimeZone();
        Stream.Builder<QueryStatusResult> result = Stream.builder();

        for ( FabricTransaction tx : getFabricTransactions() )
        {
            for ( ExecutingQuery query : getActiveFabricQueries( tx ) )
            {
                String username = query.executingUsername();
                var action = new AdminActionOnResource( SHOW_TRANSACTION, ALL, new UserSegment( username ) );
                if ( isSelfOrAllows( username, action ) )
                {
                    result.add( new QueryStatusResult( query, (InternalTransaction) transaction, zoneId, "none" ) );
                }
            }
        }

        for ( DatabaseContext databaseContext : getDatabaseManager().registeredDatabases().values() )
        {
            if ( databaseContext.database().isStarted() )
            {
                DatabaseScope dbScope = new DatabaseScope( databaseContext.database().getNamedDatabaseId().name() );
                Iterator<ExecutingQuery> distinctQueries = getExecutingTransactions( databaseContext ).stream()
                                                                                                      .map( KernelTransactionHandle::executingQuery )
                                                                                                      .flatMap( Optional::stream )
                                                                                                      .distinct()
                                                                                                      .iterator();

                while ( distinctQueries.hasNext() )
                {
                    var query = distinctQueries.next();
                    addQueryStatusesToResult( zoneId, result, databaseContext, dbScope, query );
                }
            }
        }
        return result.build();
    }

    private void addQueryStatusesToResult( ZoneId zoneId,
                                           Stream.Builder<QueryStatusResult> result,
                                           DatabaseContext databaseContext,
                                           DatabaseScope dbScope,
                                           ExecutingQuery query ) throws InvalidArgumentsException
    {
        // Include both the executing query and any previous queries (parent queries of nested query) in the result.
        while ( query != null )
        {
            String username = query.executingUsername();
            var action = new AdminActionOnResource( SHOW_TRANSACTION,
                                                    dbScope,
                                                    new UserSegment( username ) );
            if ( isSelfOrAllows( username, action ) )
            {
                result.add(
                        new QueryStatusResult( query,
                                               (InternalTransaction) transaction,
                                               zoneId,
                                               databaseContext.databaseFacade().databaseName() ) );
            }

            query = query.getPreviousQuery();
        }
    }

    @Deprecated( since = "4.4.0", forRemoval = true )
    @SystemProcedure
    @Description( "Kill all transactions executing the query with the given query id." )
    @Procedure( name = "dbms.killQuery", mode = DBMS, deprecatedBy = "TERMINATE TRANSACTIONS command" )
    public Stream<QueryTerminationResult> killQuery( @Name( "id" ) String idText ) throws InvalidArgumentsException
    {
        return killQueries( singletonList( idText ) );
    }

    @Deprecated( since = "4.4.0", forRemoval = true )
    @SystemProcedure
    @Description( "Kill all transactions executing a query with any of the given query ids." )
    @Procedure( name = "dbms.killQueries", mode = DBMS, deprecatedBy = "TERMINATE TRANSACTIONS command" )
    public Stream<QueryTerminationResult> killQueries( @Name( "ids" ) List<String> idTexts ) throws InvalidArgumentsException
    {
        DatabaseManager<DatabaseContext> databaseManager = getDatabaseManager();
        DatabaseIdRepository databaseIdRepository = databaseManager.databaseIdRepository();

        Map<Long,QueryId> queryIds = new HashMap<>( idTexts.size() );
        for ( String idText : idTexts )
        {
            QueryId id = QueryId.parse( idText );
            queryIds.put( id.internalId(), id );
        }

        List<QueryTerminationResult> result = new ArrayList<>( queryIds.size() );

        killFabricTransactions( queryIds, result );

        killNonFabricTransactions( databaseManager, queryIds, result );

        // Add error about the rest
        for ( QueryId queryId : queryIds.values() )
        {
            result.add( new QueryFailedTerminationResult( queryId, "n/a", "No Query found with this id" ) );
        }

        return result.stream();
    }

    /**
     * Helper class for {@link #killNonFabricTransactions}
     */
    private static class TransactionQueryTriple
    {
        KernelTransactionHandle txnHandle;
        long queryId;
        QueryId queryIdObj;

        TransactionQueryTriple( KernelTransactionHandle transactionHandle, long queryId )
        {
            this.txnHandle = transactionHandle;
            this.queryId = queryId;
        }

        public TransactionQueryTriple withQueryIdObject( QueryId queryIdObject )
        {
            this.queryIdObj = queryIdObject;
            return this;
        }
    }

    public static <K, V> Optional<V> getOptional( Map<K,V> map, K key )
    {
        return Optional.ofNullable( map.get( key ) );
    }

    private void killNonFabricTransactions( DatabaseManager<DatabaseContext> databaseManager, Map<Long,QueryId> queryIds, List<QueryTerminationResult> result )
    {
        for ( Map.Entry<NamedDatabaseId,DatabaseContext> databaseEntry : databaseManager.registeredDatabases().entrySet() )
        {
            NamedDatabaseId databaseId = databaseEntry.getKey();
            DatabaseContext databaseContext = databaseEntry.getValue();
            if ( databaseContext.database().isStarted() )
            {
                getExecutingTransactions( databaseContext )
                        .stream()
                        .flatMap( tx -> tx.executingQuery().stream().map(
                                query -> new TransactionQueryTriple( tx, query.internalQueryId() )
                        ) )
                        .flatMap( triple -> getOptional( queryIds, triple.queryId ).stream().map( triple::withQueryIdObject ) )
                        // We need this to eagerize the stream here. Otherwise, we may have removed the queryId from queryIds before getting to the
                        // second triple for that query.
                        .collect( toList() )
                        .forEach( triple ->
                                  {
                                      result.add( killQueryTransaction( triple.queryIdObj, triple.txnHandle, databaseId ) );
                                      queryIds.remove( triple.queryId );
                                  }
                        );
            }
        }
    }

    private void killFabricTransactions( Map<Long,QueryId> queryIds, List<QueryTerminationResult> result )
    {
        for ( FabricTransaction tx : getFabricTransactions() )
        {
            for ( ExecutingQuery query : getActiveFabricQueries( tx ) )
            {
                QueryId givenQueryId = queryIds.remove( query.internalQueryId() );
                if ( givenQueryId != null )
                {
                    result.add( killFabricQueryTransaction( givenQueryId, tx, query ) );
                }
            }
        }
    }

    @SystemProcedure
    @Description( "List all accepted network connections at this instance that are visible to the user." )
    @Procedure( name = "dbms.listConnections", mode = DBMS )
    public Stream<ListConnectionResult> listConnections()
    {
        NetworkConnectionTracker connectionTracker = getConnectionTracker();
        ZoneId timeZone = getConfiguredTimeZone();

        return connectionTracker.activeConnections()
                                .stream()
                                .filter( connection -> isAdminOrSelf( connection.username() ) )
                                .map( connection -> new ListConnectionResult( connection, timeZone ) );
    }

    @SystemProcedure
    @Description( "Kill network connection with the given connection id." )
    @Procedure( name = "dbms.killConnection", mode = DBMS )
    public Stream<ConnectionTerminationResult> killConnection( @Name( "id" ) String id )
    {
        return killConnections( singletonList( id ) );
    }

    @SystemProcedure
    @Description( "Kill all network connections with the given connection ids." )
    @Procedure( name = "dbms.killConnections", mode = DBMS )
    public Stream<ConnectionTerminationResult> killConnections( @Name( "ids" ) List<String> ids )
    {
        NetworkConnectionTracker connectionTracker = getConnectionTracker();

        return ids.stream().map( id -> killConnection( id, connectionTracker ) );
    }

    @Admin
    @Internal
    @SystemProcedure
    @Description( "List all capabilities including internals" )
    @Procedure( name = "dbms.listAllCapabilities", mode = DBMS )
    public Stream<CapabilityResult> listAllCapabilities()
    {
        var service = resolver.resolveDependency( CapabilitiesService.class );
        var capabilities = service.declaredCapabilities();

        return capabilities.stream().map( c -> new CapabilityResult( c, service.get( c.name() ) ) );
    }

    @SystemProcedure
    @Description( "List capabilities" )
    @Procedure( name = "dbms.listCapabilities", mode = DBMS )
    public Stream<CapabilityResult> listCapabilities()
    {
        var service = resolver.resolveDependency( CapabilitiesService.class );
        var capabilities = service.declaredCapabilities();

        return capabilities.stream().filter( c -> !c.internal() ).map( c -> new CapabilityResult( c, service.get( c.name() ) ) );
    }

    private NetworkConnectionTracker getConnectionTracker()
    {
        return resolver.resolveDependency( NetworkConnectionTracker.class );
    }

    private ConnectionTerminationResult killConnection( String id, NetworkConnectionTracker connectionTracker )
    {
        TrackedNetworkConnection connection = connectionTracker.get( id );
        if ( connection != null )
        {
            if ( isAdminOrSelf( connection.username() ) )
            {
                connection.close();
                return new ConnectionTerminationResult( id, connection.username() );
            }

            throw kernelTransaction.securityAuthorizationHandler()
                                   .logAndGetAuthorizationException( securityContext,
                                                                     format( "Not allowed to terminate connection for user %s.", connection.username() ) );
        }
        return new ConnectionTerminationFailedResult( id );
    }

    private QueryTerminationResult killQueryTransaction( QueryId queryId, KernelTransactionHandle handle, NamedDatabaseId databaseId )
    {
        Optional<ExecutingQuery> query = handle.executingQuery();
        ExecutingQuery executingQuery = query.orElseThrow( () -> new IllegalStateException( "Query should exist since we filtered based on query ids" ) );
        String username = executingQuery.executingUsername();
        var action = new AdminActionOnResource( TERMINATE_TRANSACTION, new DatabaseScope( databaseId.name() ), new UserSegment( username ) );
        if ( isSelfOrAllows( username, action ) )
        {
            if ( handle.isClosing() )
            {
                return new QueryFailedTerminationResult( queryId, username, "Unable to kill queries when underlying transaction is closing." );
            }
            handle.markForTermination( Status.Transaction.Terminated );
            return new QueryTerminationResult( queryId, username, "Query found" );
        }
        else
        {
            throw kernelTransaction.securityAuthorizationHandler().logAndGetAuthorizationException( securityContext,
                                                                                                    format( "Not allowed to terminate %s run by user %s.",
                                                                                                            queryId,
                                                                                                            username ) );
        }
    }

    private QueryTerminationResult killFabricQueryTransaction( QueryId queryId, FabricTransaction tx, ExecutingQuery query )
    {
        String username = query.executingUsername();
        var action = new AdminActionOnResource( TERMINATE_TRANSACTION, ALL, new UserSegment( username ) );
        if ( isSelfOrAllows( username, action ) )
        {
            tx.markForTermination( Status.Transaction.Terminated );
            return new QueryTerminationResult( queryId, username, "Query found" );
        }
        else
        {
            throw kernelTransaction.securityAuthorizationHandler().logAndGetAuthorizationException( securityContext,
                                                                                                    format( "Not allowed to terminate %s run by user %s.",
                                                                                                            queryId,
                                                                                                            username ) );
        }
    }

    private Set<FabricTransaction> getFabricTransactions()
    {
        return getFabricTransactionManager().getOpenTransactions();
    }

    private List<ExecutingQuery> getActiveFabricQueries( FabricTransaction tx )
    {
        return tx.getLastSubmittedStatement().stream()
                 .filter( FabricStatementLifecycles.StatementLifecycle::inFabricPhase )
                 .map( FabricStatementLifecycles.StatementLifecycle::getMonitoredQuery )
                 .collect( toList() );
    }

    private TransactionManager getFabricTransactionManager()
    {
        return resolver.resolveDependency( TransactionManager.class );
    }

    private TransactionMarkForTerminationResult terminateTransaction( Map<String,KernelTransactionHandle> handles, String transactionId )
    {
        KernelTransactionHandle handle = handles.get( transactionId );
        String currentUser = securityContext.subject().executingUser();
        if ( handle == null )
        {
            return new TransactionMarkForTerminationFailedResult( transactionId, currentUser );
        }
        if ( handle.isClosing() )
        {
            return new TransactionMarkForTerminationFailedResult( transactionId, currentUser, "Unable to kill closing transactions." );
        }
        log.debug( "User %s terminated transaction %s.", currentUser, transactionId );
        handle.markForTermination( Status.Transaction.Terminated );
        return new TransactionMarkForTerminationResult( transactionId, handle.subject().executingUser() );
    }

    private static Set<KernelTransactionHandle> getExecutingTransactions( DatabaseContext databaseContext )
    {
        Dependencies dependencies = databaseContext.dependencies();
        if ( dependencies != null )
        {
            return dependencies.resolveDependency( KernelTransactions.class ).executingTransactions();
        }
        else
        {
            return Collections.emptySet();
        }
    }

    private boolean isSelfOrAllows( String username, AdminActionOnResource actionOnResource )
    {
        return securityContext.subject().hasUsername( username ) || securityContext.allowsAdminAction( actionOnResource ).allowsAccess();
    }

    private boolean isAdminOrSelf( String username )
    {
        return securityContext.allowExecuteAdminProcedure( callContext.id() ).allowsAccess() || securityContext.subject().hasUsername( username );
    }

    private GraphDatabaseAPI getSystemDatabase()
    {
        return (GraphDatabaseAPI) graph.getDependencyResolver().resolveDependency( DatabaseManagementService.class ).database( SYSTEM_DATABASE_NAME );
    }

    private static StoreIdProvider getSystemDatabaseStoreIdProvider( GraphDatabaseAPI databaseAPI )
    {
        return databaseAPI.getDependencyResolver().resolveDependency( StoreIdProvider.class );
    }

    private DatabaseManager<DatabaseContext> getDatabaseManager()
    {
        return (DatabaseManager<DatabaseContext>) resolver.resolveDependency( DatabaseManager.class );
    }

    private ZoneId getConfiguredTimeZone()
    {
        Config config = graph.getDependencyResolver().resolveDependency( Config.class );
        return config.get( GraphDatabaseSettings.db_timezone ).getZoneId();
    }

    public static class SystemInfo
    {
        public final String id;
        public final String name;
        public final String creationDate;

        public SystemInfo( String id, String name, String creationDate )
        {
            this.id = id;
            this.name = name;
            this.creationDate = creationDate;
        }
    }

    public static class FunctionResult
    {
        public final String name;
        public final String signature;
        public final String category;
        public final String description;
        public final boolean aggregating;
        public final List<String> defaultBuiltInRoles = null; // this is just so that the community version has the same signature as in enterprise

        private FunctionResult( UserFunctionSignature signature, boolean isAggregation )
        {
            this.name = signature.name().toString();
            this.signature = signature.toString();
            this.category = signature.category().orElse( "" );
            this.description = signature.description().orElse( "" );
            this.aggregating = isAggregation;
        }

        private FunctionResult( FunctionInformation info )
        {
            this.name = info.getFunctionName();
            this.signature = info.getSignature();
            this.category = info.getCategory();
            this.description = info.getDescription();
            this.aggregating = info.isAggregationFunction();
        }
    }

    public static class ProcedureResult
    {
        public final String name;
        public final String signature;
        public final String description;
        public final String mode;
        public final List<String> defaultBuiltInRoles = null; // this is just so that the community version has the same signature as in enterprise
        public final boolean worksOnSystem;

        private ProcedureResult( ProcedureSignature signature )
        {
            this.name = signature.name().toString();
            this.signature = signature.toString();
            this.description = signature.description().orElse( "" );
            this.mode = signature.mode().toString();
            this.worksOnSystem = signature.systemProcedure();
        }
    }

    public static class StringResult
    {
        public final String value;

        StringResult( String value )
        {
            this.value = value;
        }
    }

    public static class MetadataResult
    {
        public final Map<String,Object> metadata;

        MetadataResult( Map<String,Object> metadata )
        {
            this.metadata = metadata;
        }
    }

    public static class SystemGraphComponentStatusResult
    {
        public final String status;
        public final String description;
        public final String resolution;

        SystemGraphComponentStatusResult( SystemGraphComponent.Status status )
        {
            this.status = status.name();
            this.description = status.description();
            this.resolution = status.resolution();
        }
    }

    public static class SystemGraphComponentUpgradeResult
    {
        public final String status;
        public final String upgradeResult;

        SystemGraphComponentUpgradeResult( String status, String upgradeResult )
        {
            this.status = status;
            this.upgradeResult = upgradeResult;
        }
    }

    public static class QueryTerminationResult
    {
        public final String queryId;
        public final String username;
        public final String message;

        public QueryTerminationResult( QueryId queryId, String username, String message )
        {
            this.queryId = queryId.toString();
            this.username = username;
            this.message = message;
        }
    }

    public static class QueryFailedTerminationResult extends QueryTerminationResult
    {
        public QueryFailedTerminationResult( QueryId queryId, String username, String message )
        {
            super( queryId, username, message );
        }
    }
}
