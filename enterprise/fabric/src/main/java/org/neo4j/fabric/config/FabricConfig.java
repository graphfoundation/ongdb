/*
 * Copyright (c) 2002-2020 "Neo4j,"
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
package org.neo4j.fabric.config;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.api.multimap.set.MutableSetMultimap;
import org.eclipse.collections.impl.factory.Multimaps;

import java.net.URI;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.helpers.NormalizedDatabaseName;
import org.neo4j.configuration.helpers.NormalizedGraphName;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.configuration.helpers.SocketAddressParser;
import org.neo4j.logging.Level;

public class FabricConfig
{
    private final boolean enabled;
    private final FabricConfig.Database database;
    private final Duration routingTtl;
    private final Duration transactionTimeout;
    private final FabricConfig.GlobalDriverConfig globalDriverConfig;
    private final FabricConfig.DataStream dataStream;
    private volatile List<SocketAddress> fabricServers;

    public FabricConfig( boolean enabled, FabricConfig.Database database, List<SocketAddress> fabricServers, Duration routingTtl, Duration transactionTimeout,
                         FabricConfig.GlobalDriverConfig globalDriverConfig, FabricConfig.DataStream dataStream )
    {
        this.enabled = enabled;
        this.database = database;
        this.fabricServers = fabricServers;
        this.routingTtl = routingTtl;
        this.transactionTimeout = transactionTimeout;
        this.globalDriverConfig = globalDriverConfig;
        this.dataStream = dataStream;
    }

    private static String join( String... parts )
    {
        return Stream.of( parts ).flatMap( ( p ) ->
                                           {
                                               return Stream.of( ".", p );
                                           } ).skip( 1L ).collect( Collectors.joining() );
    }

    public static FabricConfig from( Config config )
    {
        Optional<FabricConfig.Database> database = parseDatabase( config );
        if ( database.isEmpty() )
        {
            return new FabricConfig( false, null, null, null, null, null,
                                     null );
        }
        else
        {
            List<SocketAddress> serverAddresses = config.get( FabricSettings.fabricServersSetting );
            Duration routingTtl = config.get( FabricSettings.routingTtlSetting );
            Duration transactionTimeout = config.get( GraphDatabaseSettings.transaction_timeout );
            Duration driverIdleTimeout = config.get( FabricSettings.driverIdleTimeout );
            Duration driverIdleCheckInterval = config.get( FabricSettings.driverIdleCheckInterval );
            Integer driverEventLoopCount = config.get( FabricSettings.driverEventLoopCount );
            FabricConfig.DriverConfig driverConfig = new FabricConfig.DriverConfig( config.get( FabricSettings.driverLoggingLevel ),
                                                                                    config.get( FabricSettings.driverLogLeakedSessions ),
                                                                                    config.get( FabricSettings.driverMaxConnectionPoolSize ),
                                                                                    config.get( FabricSettings.driverIdleTimeBeforeConnectionTest ),
                                                                                    config.get( FabricSettings.driverMaxConnectionLifetime ),
                                                                                    config.get( FabricSettings.driverConnectionAcquisitionTimeout ),
                                                                                    config.get( FabricSettings.driverConnectTimeout ),
                                                                                    config.get( FabricSettings.driverApi ) );
            FabricConfig.GlobalDriverConfig remoteGraphDriver =
                    new FabricConfig.GlobalDriverConfig( driverIdleTimeout, driverIdleCheckInterval, driverEventLoopCount, driverConfig );
            Integer bufferLowWatermark = config.get( FabricSettings.bufferLowWatermarkSetting );
            Integer bufferSize = config.get( FabricSettings.bufferSizeSetting );
            Integer syncBatchSize = config.get( FabricSettings.batchSizeSetting );
            Integer concurrency = config.get( FabricSettings.concurrency );
            if ( concurrency == null )
            {
                concurrency = database.get().graphs.size();
            }

            FabricConfig.DataStream dataStream = new FabricConfig.DataStream( bufferLowWatermark, bufferSize, syncBatchSize, concurrency );
            FabricConfig fabricConfig =
                    new FabricConfig( true, database.get(), serverAddresses, routingTtl, transactionTimeout, remoteGraphDriver,
                                      dataStream );
            config.addListener( FabricSettings.fabricServersSetting, ( oldValue, newValue ) ->
            {
                fabricConfig.setFabricServers( newValue );
            } );
            return fabricConfig;
        }
    }

    private static Optional<FabricConfig.Database> parseDatabase( Config config )
    {
        String databaseNameRaw = config.get( FabricSettings.databaseName );
        if ( databaseNameRaw == null )
        {
            return Optional.empty();
        }
        else
        {
            NormalizedDatabaseName databaseName = new NormalizedDatabaseName( databaseNameRaw );
            Set<FabricConfig.Graph> graphSettings = config.getGroups( FabricSettings.GraphSetting.class ).entrySet().stream().map( ( entry ) ->
                                                                                                                                   {
                                                                                                                                       int graphId =
                                                                                                                                               parseGraphId(
                                                                                                                                                       entry
                                                                                                                                                               .getKey() );
                                                                                                                                       FabricSettings.GraphSetting
                                                                                                                                               graphSetting =
                                                                                                                                               entry
                                                                                                                                                       .getValue();
                                                                                                                                       GraphDriverConfig
                                                                                                                                               driverConfig =
                                                                                                                                               new GraphDriverConfig(
                                                                                                                                                       config
                                                                                                                                                               .get( graphSetting.driverLoggingLevel ),
                                                                                                                                                       config
                                                                                                                                                               .get( graphSetting.driverLogLeakedSessions ),
                                                                                                                                                       config
                                                                                                                                                               .get( graphSetting.driverMaxConnectionPoolSize ),
                                                                                                                                                       config
                                                                                                                                                               .get( graphSetting.driverIdleTimeBeforeConnectionTest ),
                                                                                                                                                       config
                                                                                                                                                               .get( graphSetting.driverMaxConnectionLifetime ),
                                                                                                                                                       config
                                                                                                                                                               .get( graphSetting.driverConnectionAcquisitionTimeout ),
                                                                                                                                                       config
                                                                                                                                                               .get( graphSetting.driverConnectTimeout ),
                                                                                                                                                       config
                                                                                                                                                               .get( graphSetting.driverApi ),
                                                                                                                                                       config
                                                                                                                                                               .get( graphSetting.sslEnabled ) );
                                                                                                                                       RemoteUri
                                                                                                                                               remoteUri =
                                                                                                                                               new RemoteUri(
                                                                                                                                                       config
                                                                                                                                                               .get( graphSetting.uris ) );
                                                                                                                                       return new Graph(
                                                                                                                                               graphId,
                                                                                                                                               remoteUri,
                                                                                                                                               config
                                                                                                                                                       .get( graphSetting.database ),
                                                                                                                                               config
                                                                                                                                                       .get( graphSetting.name ),
                                                                                                                                               driverConfig );
                                                                                                                                   } )
                                                          .collect( Collectors.toSet() );
            validateGraphNames( graphSettings );
            return Optional.of( new FabricConfig.Database( databaseName, graphSettings ) );
        }
    }

    private static int parseGraphId( String graphKey )
    {
        try
        {
            return Integer.parseInt( graphKey );
        }
        catch ( NumberFormatException e )
        {
            throw new IllegalArgumentException( "Graph key must be a number, found: " + graphKey );
        }
    }

    private static void validateGraphNames( Set<FabricConfig.Graph> graphSettings )
    {
        MutableSetMultimap<NormalizedGraphName,FabricConfig.Graph> graphsByName = Multimaps.mutable.set.empty();
        graphSettings.stream().filter( ( g ) ->
                                       {
                                           return g.name != null;
                                       } ).forEach( ( g ) ->
                                                    {
                                                        graphsByName.put( g.name, g );
                                                    } );
        graphsByName.multiValuesView().forEach( ( graphs ) ->
                                                {
                                                    if ( graphs.size() > 1 )
                                                    {
                                                        MutableList<FabricConfig.Graph> sortedGraphs =
                                                                graphs.toSortedList( Comparator.comparingLong( FabricConfig.Graph::getId ) );
                                                        String ids = sortedGraphs.collect( FabricConfig.Graph::getId ).distinct().makeString( ", " );
                                                        throw new IllegalArgumentException( "Graphs with ids: " + ids + ", have conflicting names" );
                                                    }
                                                } );
    }

    public boolean isEnabled()
    {
        return this.enabled;
    }

    public List<SocketAddress> getFabricServers()
    {
        return this.fabricServers;
    }

    public void setFabricServers( List<SocketAddress> fabricServers )
    {
        this.fabricServers = fabricServers;
    }

    public Duration getRoutingTtl()
    {
        return this.routingTtl;
    }

    public Duration getTransactionTimeout()
    {
        return this.transactionTimeout;
    }

    public FabricConfig.GlobalDriverConfig getGlobalDriverConfig()
    {
        return this.globalDriverConfig;
    }

    public FabricConfig.DataStream getDataStream()
    {
        return this.dataStream;
    }

    public FabricConfig.Database getDatabase()
    {
        return this.database;
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString( this );
    }

    public boolean equals( Object o )
    {
        if ( this == o )
        {
            return true;
        }
        else if ( o != null && this.getClass() == o.getClass() )
        {
            FabricConfig that = (FabricConfig) o;
            return this.routingTtl == that.routingTtl && this.database.equals( that.database ) && this.fabricServers.equals( that.fabricServers ) &&
                   this.transactionTimeout.equals( that.transactionTimeout ) && this.globalDriverConfig.equals( that.globalDriverConfig ) &&
                   this.dataStream.equals( that.dataStream );
        }
        else
        {
            return false;
        }
    }

    public Optional<NormalizedDatabaseName> getFabricDatabaseName()
    {
        return Optional.empty();
    }

    public int hashCode()
    {
        return Objects.hash(
                this.database, this.fabricServers, this.routingTtl, this.transactionTimeout, this.globalDriverConfig, this.dataStream );
    }

    public static class RemoteUri
    {
        private final String scheme;
        private final List<SocketAddress> addresses;
        private final String query;

        public RemoteUri( List<URI> uris )
        {
            if ( uris != null && !uris.isEmpty() )
            {
                URI mainUri = uris.get( 0 );
                if ( mainUri.getScheme() == null )
                {
                    throw new IllegalArgumentException( "Scheme must be provided: " + uris );
                }
                else
                {
                    this.scheme = mainUri.getScheme();
                    this.query = mainUri.getQuery();
                    boolean sameScheme = uris.stream().skip( 1L ).allMatch( ( uri ) ->
                                                                            {
                                                                                return Objects.equals( this.scheme, uri.getScheme() );
                                                                            } );
                    if ( !sameScheme )
                    {
                        throw new IllegalArgumentException( "URIs must have the same scheme: " + uris );
                    }
                    else
                    {
                        boolean sameQuery = uris.stream().skip( 1L ).allMatch( ( uri ) ->
                                                                               {
                                                                                   return Objects.equals( this.query, uri.getQuery() );
                                                                               } );
                        if ( !sameQuery )
                        {
                            throw new IllegalArgumentException( "URIs must have the same query: " + uris );
                        }
                        else
                        {
                            this.addresses = uris.stream().peek( ( uri ) ->
                                                                 {
                                                                     if ( uri.getHost() == null || uri.getPort() == -1 )
                                                                     {
                                                                         throw new IllegalArgumentException(
                                                                                 "Host name and port must be provided: " + uris );
                                                                     }
                                                                 } ).map( ( uri ) ->
                                                                          {
                                                                              return SocketAddressParser
                                                                                      .socketAddress( uri.getHost() + ":" + uri.getPort(),
                                                                                                      SocketAddress::new );
                                                                          } ).collect( Collectors.toList() );
                        }
                    }
                }
            }
            else
            {
                throw new IllegalArgumentException( "Remote graph URI must be provided" );
            }
        }

        public static FabricConfig.RemoteUri create( String uri )
        {
            return new FabricConfig.RemoteUri( List.of( URI.create( uri ) ) );
        }

        public static FabricConfig.RemoteUri create( URI uri )
        {
            return new FabricConfig.RemoteUri( List.of( uri ) );
        }

        public String getScheme()
        {
            return this.scheme;
        }

        public List<SocketAddress> getAddresses()
        {
            return this.addresses;
        }

        public String getQuery()
        {
            return this.query;
        }

        public boolean equals( Object o )
        {
            if ( this == o )
            {
                return true;
            }
            else if ( o != null && this.getClass() == o.getClass() )
            {
                FabricConfig.RemoteUri remoteUri = (FabricConfig.RemoteUri) o;
                return this.scheme.equals( remoteUri.scheme ) && this.addresses.equals( remoteUri.addresses ) && Objects.equals( this.query, remoteUri.query );
            }
            else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return Objects.hash( this.scheme, this.addresses, this.query );
        }
    }

    public static class DataStream
    {
        private final int bufferLowWatermark;
        private final int bufferSize;
        private final int batchSize;
        private final int concurrency;

        public DataStream( int bufferLowWatermark, int bufferSize, int batchSize, int concurrency )
        {
            if ( bufferLowWatermark > bufferSize )
            {
                this.bufferLowWatermark = bufferSize;
            }
            else
            {
                this.bufferLowWatermark = bufferLowWatermark;
            }

            this.bufferSize = bufferSize;
            this.batchSize = batchSize;
            this.concurrency = concurrency;
        }

        public int getBufferLowWatermark()
        {
            return this.bufferLowWatermark;
        }

        public int getBufferSize()
        {
            return this.bufferSize;
        }

        public int getBatchSize()
        {
            return this.batchSize;
        }

        public int getConcurrency()
        {
            return this.concurrency;
        }
    }

    public static class GlobalDriverConfig
    {
        private final Duration idleTimeout;
        private final Duration driverIdleCheckInterval;
        private final int eventLoopCount;
        private final FabricConfig.DriverConfig driverConfig;

        public GlobalDriverConfig( Duration idleTimeout, Duration driverTimoutCheckInterval, int eventLoopCount, FabricConfig.DriverConfig driverConfig )
        {
            this.idleTimeout = idleTimeout;
            this.driverIdleCheckInterval = driverTimoutCheckInterval;
            this.eventLoopCount = eventLoopCount;
            this.driverConfig = driverConfig;
        }

        public Duration getIdleTimeout()
        {
            return this.idleTimeout;
        }

        public Duration getDriverIdleCheckInterval()
        {
            return this.driverIdleCheckInterval;
        }

        public int getEventLoopCount()
        {
            return this.eventLoopCount;
        }

        public FabricConfig.DriverConfig getDriverConfig()
        {
            return this.driverConfig;
        }
    }

    public static class GraphDriverConfig extends FabricConfig.DriverConfig
    {
        private final boolean sslEnabled;

        public GraphDriverConfig( Level loggingLevel, Boolean logLeakedSessions, Integer maxConnectionPoolSize, Duration idleTimeBeforeConnectionTest,
                                  Duration maxConnectionLifetime, Duration connectionAcquisitionTimeout, Duration connectTimeout,
                                  FabricSettings.DriverApi driverApi,
                                  boolean sslEnabled )
        {
            super( loggingLevel, logLeakedSessions, maxConnectionPoolSize, idleTimeBeforeConnectionTest, maxConnectionLifetime, connectionAcquisitionTimeout,
                   connectTimeout, driverApi );
            this.sslEnabled = sslEnabled;
        }

        public boolean isSslEnabled()
        {
            return this.sslEnabled;
        }
    }

    public static class DriverConfig
    {
        private final Level loggingLevel;
        private final Boolean logLeakedSessions;
        private final Integer maxConnectionPoolSize;
        private final Duration idleTimeBeforeConnectionTest;
        private final Duration maxConnectionLifetime;
        private final Duration connectionAcquisitionTimeout;
        private final Duration connectTimeout;
        private final FabricSettings.DriverApi driverApi;

        public DriverConfig( Level loggingLevel, Boolean logLeakedSessions, Integer maxConnectionPoolSize, Duration idleTimeBeforeConnectionTest,
                             Duration maxConnectionLifetime, Duration connectionAcquisitionTimeout, Duration connectTimeout,
                             FabricSettings.DriverApi driverApi )
        {
            this.loggingLevel = loggingLevel;
            this.logLeakedSessions = logLeakedSessions;
            this.maxConnectionPoolSize = maxConnectionPoolSize;
            this.idleTimeBeforeConnectionTest = idleTimeBeforeConnectionTest;
            this.maxConnectionLifetime = maxConnectionLifetime;
            this.connectionAcquisitionTimeout = connectionAcquisitionTimeout;
            this.connectTimeout = connectTimeout;
            this.driverApi = driverApi;
        }

        public Level getLoggingLevel()
        {
            return this.loggingLevel;
        }

        public Boolean getLogLeakedSessions()
        {
            return this.logLeakedSessions;
        }

        public Integer getMaxConnectionPoolSize()
        {
            return this.maxConnectionPoolSize;
        }

        public Duration getIdleTimeBeforeConnectionTest()
        {
            return this.idleTimeBeforeConnectionTest;
        }

        public Duration getMaxConnectionLifetime()
        {
            return this.maxConnectionLifetime;
        }

        public Duration getConnectionAcquisitionTimeout()
        {
            return this.connectionAcquisitionTimeout;
        }

        public Duration getConnectTimeout()
        {
            return this.connectTimeout;
        }

        public FabricSettings.DriverApi getDriverApi()
        {
            return this.driverApi;
        }

        public boolean equals( Object that )
        {
            return EqualsBuilder.reflectionEquals( this, that );
        }

        public int hashCode()
        {
            return HashCodeBuilder.reflectionHashCode( this );
        }
    }

    public static class Graph
    {
        private final long id;
        private final FabricConfig.RemoteUri uri;
        private final String database;
        private final NormalizedGraphName name;
        private final FabricConfig.GraphDriverConfig driverConfig;

        public Graph( long id, FabricConfig.RemoteUri uri, String database, NormalizedGraphName name, FabricConfig.GraphDriverConfig driverConfig )
        {
            if ( uri == null )
            {
                throw new IllegalArgumentException( "Remote graph URI must be provided" );
            }
            else
            {
                this.id = id;
                this.uri = uri;
                this.database = database;
                this.name = name;
                this.driverConfig = driverConfig;
            }
        }

        public long getId()
        {
            return this.id;
        }

        public FabricConfig.RemoteUri getUri()
        {
            return this.uri;
        }

        public String getDatabase()
        {
            return this.database;
        }

        public NormalizedGraphName getName()
        {
            return this.name;
        }

        public FabricConfig.GraphDriverConfig getDriverConfig()
        {
            return this.driverConfig;
        }

        public String toString()
        {
            return String.format( "graph %s named %s", this.id, this.name );
        }

        public boolean equals( Object that )
        {
            return EqualsBuilder.reflectionEquals( this, that );
        }

        public int hashCode()
        {
            return HashCodeBuilder.reflectionHashCode( this );
        }
    }

    public static class Database
    {
        private final NormalizedDatabaseName name;
        private final Set<FabricConfig.Graph> graphs;

        public Database( NormalizedDatabaseName name, Set<FabricConfig.Graph> graphs )
        {
            this.name = name;
            this.graphs = graphs;
        }

        public NormalizedDatabaseName getName()
        {
            return this.name;
        }

        public Set<FabricConfig.Graph> getGraphs()
        {
            return this.graphs;
        }

        public String toString()
        {
            return ToStringBuilder.reflectionToString( this );
        }

        public boolean equals( Object that )
        {
            return EqualsBuilder.reflectionEquals( this, that );
        }

        public int hashCode()
        {
            return HashCodeBuilder.reflectionHashCode( this );
        }
    }
}
