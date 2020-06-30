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

import java.time.ZoneId;
import java.util.Map;
import java.util.Optional;

import org.neo4j.internal.kernel.api.connectioninfo.ClientConnectionInfo;
import org.neo4j.kernel.api.KernelTransactionHandle;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.kernel.api.query.QuerySnapshot;
import org.neo4j.kernel.enterprise.builtinprocs.dbms.QueryId;
import org.neo4j.kernel.enterprise.builtinprocs.dbms.TransactionId;
import org.neo4j.kernel.impl.api.TransactionExecutionStatistic;
import org.neo4j.procedure.builtin.ProceduresTimeFormatHelper;

@SuppressWarnings( "WeakerAccess" )
public class TransactionStatusResult
{

    private static final String RUNNING_STATE = "Running";
    private static final String CLOSING_STATE = "Closing";
    private static final String BLOCKED_STATE = "Blocked by: ";
    private static final String TERMINATED_STATE = "Terminated with reason: %s";

    public final String transactionId;
    public final String username;
    public final Map<String,Object> metaData;
    public final String startTime;
    public final String protocol;
    public final String clientAddress;
    public final String requestUri;
    public final String currentQueryId;
    public final String currentQuery;
    public final long activeLockCount;
    public final String status;
    public final long elapsedTimeMillis;
    public final Long cpuTimeMillis;
    public final long waitTimeMillis;
    public final Long idleTimeMillis;
    public final Long allocatedBytes;
    public final Long allocatedDirectBytes;
    public final long pageHits;
    public final long pageFaults;
    /**
     * @since Neo4j 3.5
     */
    public final String connectionId;
    public final String initializationStackTrace;
    public final String database;
    public Map<String,Object> resourceInformation;

    public TransactionStatusResult( String database, KernelTransactionHandle transaction,
                                    TransactionDependenciesResolver transactionDependenciesResolver,
                                    Map<KernelTransactionHandle,Optional<QuerySnapshot>> handleSnapshotsMap, ZoneId zoneId )
            throws InvalidArgumentsException
    {
        this.database = database;
        this.transactionId = (new TransactionId( database, transaction.getUserTransactionId() ))
                .toString();
        this.username = transaction.subject().username();
        this.startTime = ProceduresTimeFormatHelper.formatTime( transaction.startTime(), zoneId );
        this.activeLockCount = transaction.activeLocks().count();
        Optional<QuerySnapshot> querySnapshot = (Optional) handleSnapshotsMap.get( transaction );
        TransactionExecutionStatistic statistic = transaction.transactionStatistic();
        this.elapsedTimeMillis = statistic.getElapsedTimeMillis();
        this.cpuTimeMillis = statistic.getCpuTimeMillis();
        this.allocatedBytes = statistic.getHeapAllocatedBytes();
        this.allocatedDirectBytes = statistic.getDirectAllocatedBytes();
        this.waitTimeMillis = statistic.getWaitTimeMillis();
        this.idleTimeMillis = statistic.getIdleTimeMillis();
        this.pageHits = statistic.getPageHits();
        this.pageFaults = statistic.getPageFaults();
        if ( querySnapshot.isPresent() )
        {
            QuerySnapshot snapshot = (QuerySnapshot) querySnapshot.get();
            this.currentQueryId = (new QueryId( database, snapshot.internalQueryId() )).toString();
            this.currentQuery = snapshot.queryText();
        }
        else
        {
            this.currentQueryId = "";
            this.currentQuery = "";
        }

        ClientConnectionInfo clientInfo = transaction.clientInfo();
        this.protocol = clientInfo.protocol();
        this.clientAddress = clientInfo.clientAddress();
        this.requestUri = clientInfo.requestURI();
        this.connectionId = clientInfo.connectionId();
        this.resourceInformation = transactionDependenciesResolver.describeBlockingLocks( transaction );
        this.status = getStatus( transaction, transactionDependenciesResolver );
        this.metaData = transaction.getMetaData();
        this.initializationStackTrace = transaction.transactionInitialisationTrace().getTrace();
    }

    private static String getStatus( KernelTransactionHandle handle,
                                     TransactionDependenciesResolver transactionDependenciesResolver )
    {
        return handle.terminationReason().map( ( reason ) ->
                                               {
                                                   return String.format( "Terminated with reason: %s", reason.code() );
                                               } ).orElseGet( () ->
                                                              {
                                                                  return getExecutingStatus( handle, transactionDependenciesResolver );
                                                              } );
    }

    private static String getExecutingStatus( KernelTransactionHandle handle,
                                              TransactionDependenciesResolver transactionDependenciesResolver )
    {
        if ( transactionDependenciesResolver.isBlocked( handle ) )
        {
            String blockingTransaction = transactionDependenciesResolver
                    .describeBlockingTransactions( handle );
            return "Blocked by: " + blockingTransaction;
        }
        else
        {
            return handle.isClosing() ? "Closing" : "Running";
        }
    }
}
