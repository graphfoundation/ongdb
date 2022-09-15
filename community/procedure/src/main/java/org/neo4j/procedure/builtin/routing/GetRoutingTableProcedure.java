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
package org.neo4j.procedure.builtin.routing;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.neo4j.collection.RawIterator;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.connectors.BoltConnector;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.internal.kernel.api.procs.Neo4jTypes;
import org.neo4j.internal.kernel.api.procs.ProcedureSignature;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.kernel.api.ResourceTracker;
import org.neo4j.kernel.api.procedure.CallableProcedure;
import org.neo4j.kernel.api.procedure.Context;
import org.neo4j.kernel.database.DatabaseReference;
import org.neo4j.kernel.database.DatabaseReferenceRepository;
import org.neo4j.kernel.database.DefaultDatabaseResolver;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.procedure.Mode;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.TextValue;
import org.neo4j.values.storable.Values;
import org.neo4j.values.virtual.MapValue;

import static org.neo4j.configuration.GraphDatabaseSettings.default_database;
import static org.neo4j.internal.kernel.api.procs.DefaultParameterValue.nullValue;
import static org.neo4j.internal.kernel.api.procs.ProcedureSignature.procedureSignature;
import static org.neo4j.kernel.api.exceptions.Status.Database.DatabaseUnavailable;
import static org.neo4j.kernel.api.exceptions.Status.Database.IllegalAliasChain;
import static org.neo4j.kernel.api.exceptions.Status.Procedure.ProcedureCallFailed;
import static org.neo4j.procedure.builtin.routing.ParameterNames.CONTEXT;
import static org.neo4j.procedure.builtin.routing.ParameterNames.DATABASE;
import static org.neo4j.procedure.builtin.routing.ParameterNames.SERVERS;
import static org.neo4j.procedure.builtin.routing.ParameterNames.TTL;
import static org.neo4j.values.storable.Values.NO_VALUE;

public final class GetRoutingTableProcedure implements CallableProcedure
{
    private static final String NAME = "getRoutingTable";
    public static final String ADDRESS_CONTEXT_KEY = "address";
    public static final String FROM_ALIAS_KEY = "alias";

    private final ProcedureSignature signature;
    private final DatabaseReferenceRepository databaseReferenceRepo;

    private final Log log;
    private final RoutingTableProcedureValidator validator;
    private final ClientSideRoutingTableProvider clientSideRoutingTableProvider;
    private final ServerSideRoutingTableProvider serverSideRoutingTableProvider;
    private final ClientRoutingDomainChecker clientRoutingDomainChecker;
    private final Supplier<GraphDatabaseSettings.RoutingMode> defaultRouterSupplier;
    private final Supplier<Boolean> boltEnabled;
    private final DefaultDatabaseResolver defaultDatabaseResolver;

    public GetRoutingTableProcedure( List<String> namespace, String description, DatabaseReferenceRepository databaseReferenceRepo,
            RoutingTableProcedureValidator validator, SingleAddressRoutingTableProvider routingTableProvider,
            ClientRoutingDomainChecker clientRoutingDomainChecker, Config config, LogProvider logProvider, DefaultDatabaseResolver defaultDatabaseResolver )
    {
        this( namespace, description, databaseReferenceRepo, validator, routingTableProvider,
              routingTableProvider, clientRoutingDomainChecker, config, logProvider, defaultDatabaseResolver );
    }

    public GetRoutingTableProcedure( List<String> namespace, String description, DatabaseReferenceRepository databaseReferenceRepo,
            RoutingTableProcedureValidator validator, ClientSideRoutingTableProvider clientSideRoutingTableProvider,
            ServerSideRoutingTableProvider serverSideRoutingTableProvider, ClientRoutingDomainChecker clientRoutingDomainChecker,
            Config config, LogProvider logProvider, DefaultDatabaseResolver defaultDatabaseResolver )
    {
        this.signature = buildSignature( namespace, description );
        this.databaseReferenceRepo = databaseReferenceRepo;
        this.log = logProvider.getLog( getClass() );
        this.validator = validator;
        this.clientSideRoutingTableProvider = clientSideRoutingTableProvider;
        this.serverSideRoutingTableProvider = serverSideRoutingTableProvider;
        this.clientRoutingDomainChecker = clientRoutingDomainChecker;
        this.defaultRouterSupplier = () -> config.get( GraphDatabaseSettings.routing_default_router );
        this.boltEnabled = () -> config.get( BoltConnector.enabled );
        this.defaultDatabaseResolver = defaultDatabaseResolver;
    }

    @Override
    public ProcedureSignature signature()
    {
        return signature;
    }

    @Override
    public RawIterator<AnyValue[],ProcedureException> apply( Context ctx, AnyValue[] input, ResourceTracker resourceTracker ) throws ProcedureException
    {
        var user = ctx.securityContext().subject().executingUser();
        var databaseReference = extractDatabaseReference( input, user );
        var routingContext = extractRoutingContext( input );

        assertBoltConnectorEnabled( databaseReference );
        assertNotIllegalAliasChain( databaseReference, routingContext );
        try
        {
            var result = invoke( databaseReference, routingContext );
            log.debug( "Routing result for database %s and routing context %s is %s", databaseReference, routingContext, result );
            assertRoutingResultNotEmpty( result, databaseReference );
            return RawIterator.<AnyValue[],ProcedureException>of( RoutingResultFormat.build( result ) );
        }
        catch ( ProcedureException ex )
        {
            // Check that the cause of the exception wasn't the database being removed while this procedure was running.
            assertDatabaseExists( databaseReference );
            // otherwise re-throw
            throw ex;
        }
    }

    private RoutingResult invoke( DatabaseReference databaseReference, MapValue routingContext ) throws ProcedureException
    {
        var clientProvidedAddress = RoutingTableProcedureHelpers.findClientProvidedAddress( routingContext, BoltConnector.DEFAULT_PORT, log );
        var isInternalRef = databaseReference instanceof DatabaseReference.Internal;
        if ( !isInternalRef )
        {
            return serverSideRoutingTableProvider.getServerSideRoutingTable( clientProvidedAddress );
        }

        var defaultRouter = defaultRouterSupplier.get();
        if ( configAllowsForClientSideRouting( defaultRouter, clientProvidedAddress ) )
        {
            validator.isValidForClientSideRouting( (DatabaseReference.Internal) databaseReference );
            return clientSideRoutingTableProvider.getRoutingResultForClientSideRouting( (DatabaseReference.Internal) databaseReference, routingContext );
        }
        else
        {
            validator.isValidForServerSideRouting( (DatabaseReference.Internal) databaseReference );
            return serverSideRoutingTableProvider.getServerSideRoutingTable( clientProvidedAddress );
        }
    }

    private DatabaseReference extractDatabaseReference( AnyValue[] input, String user ) throws ProcedureException
    {
        var arg = input[1];
        final String databaseName;
        if ( arg == NO_VALUE )
        {
            databaseName = defaultDatabaseResolver.defaultDatabase( user );
        }
        else if ( arg instanceof TextValue )
        {
            databaseName = ((TextValue) arg).stringValue();
        }
        else
        {
            throw new IllegalArgumentException( "Illegal database name argument " + arg );
        }

        return databaseReferenceRepo.getByName( databaseName )
                                    .orElseThrow( () -> RoutingTableProcedureHelpers.databaseNotFoundException( databaseName ) );
    }

    private static MapValue extractRoutingContext( AnyValue[] input )
    {
        var arg = input[0];
        if ( arg == NO_VALUE )
        {
            return MapValue.EMPTY;
        }
        else if ( arg instanceof MapValue )
        {
            return (MapValue) arg;
        }
        else
        {
            throw new IllegalArgumentException( "Illegal routing context argument " + arg );
        }
    }

    private static ProcedureSignature buildSignature( List<String> namespace, String description )
    {
        return procedureSignature( new QualifiedName( namespace, NAME ) )
                .in( CONTEXT.parameterName(), Neo4jTypes.NTMap )
                .in( DATABASE.parameterName(), Neo4jTypes.NTString, nullValue( Neo4jTypes.NTString ) )
                .out( TTL.parameterName(), Neo4jTypes.NTInteger )
                .out( SERVERS.parameterName(), Neo4jTypes.NTList( Neo4jTypes.NTMap ) )
                .mode( Mode.DBMS )
                .description( description )
                .systemProcedure()
                .allowExpiredCredentials()
                .build();
    }

    private boolean configAllowsForClientSideRouting( GraphDatabaseSettings.RoutingMode defaultRouter,
            Optional<SocketAddress> clientProvidedAddress )
    {
        switch ( defaultRouter )
        {
        case CLIENT:
            // in client mode everyone gets client routing behaviour all the time
            return true;
        case SERVER:
            // in server mode specific domains can be opted-in to client routing based on server configuration
            return clientProvidedAddress.isEmpty() || clientRoutingDomainChecker.shouldGetClientRouting( clientProvidedAddress.get() );
        default:
            throw new IllegalStateException( "Unexpected value: " + defaultRouter );
        }
    }

    private void assertBoltConnectorEnabled( DatabaseReference databaseReference ) throws ProcedureException
    {
        if ( !boltEnabled.get() )
        {
            throw new ProcedureException( ProcedureCallFailed, "Cannot get routing table for " + databaseReference.alias() +
                                                               " because Bolt is not enabled. Please update your configuration for '" +
                                                               BoltConnector.enabled.name() + "'" );
        }
    }

    private static void assertRoutingResultNotEmpty( RoutingResult result, DatabaseReference databaseReference ) throws ProcedureException
    {
        if ( result.containsNoEndpoints() )
        {
            throw new ProcedureException( DatabaseUnavailable, "Routing table for database " + databaseReference.alias() + " is empty" );
        }
    }

    private void assertDatabaseExists( DatabaseReference databaseReference ) throws ProcedureException
    {
        databaseReferenceRepo.getByName( databaseReference.alias() )
                             .orElseThrow( () -> RoutingTableProcedureHelpers.databaseNotFoundException( databaseReference.alias().name() ) );
    }

    private void assertNotIllegalAliasChain( DatabaseReference databaseReference, MapValue routingContext ) throws ProcedureException
    {
        var refIsRemoteAlias = databaseReference instanceof DatabaseReference.External;

        var sourceAlias = routingContext.get( FROM_ALIAS_KEY );
        var sourceAliasIsPresent = sourceAlias != null && sourceAlias != NO_VALUE;
        if ( refIsRemoteAlias && sourceAliasIsPresent )
        {
            var sourceAliasString = ((TextValue) sourceAlias).stringValue();
            throw new ProcedureException( IllegalAliasChain, "Unable to provide a routing table for the database '" + databaseReference.alias().name() +
                                                             "' because the request came from another alias '" + sourceAliasString + "' and alias chains " +
                                                             "are not permitted." );
        }
    }

}
