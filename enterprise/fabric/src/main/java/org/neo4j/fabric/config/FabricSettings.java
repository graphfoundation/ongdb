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

import java.net.URI;
import java.time.Duration;
import java.util.List;

import org.neo4j.annotations.service.ServiceProvider;
import org.neo4j.configuration.Description;
import org.neo4j.configuration.DocumentedDefaultValue;
import org.neo4j.configuration.GroupSetting;
import org.neo4j.configuration.Internal;
import org.neo4j.configuration.SettingConstraints;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.configuration.helpers.NormalizedGraphName;
import org.neo4j.configuration.helpers.SocketAddress;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.logging.Level;

import static org.neo4j.configuration.SettingConstraints.min;
import static org.neo4j.configuration.SettingImpl.newBuilder;
import static org.neo4j.configuration.SettingValueParsers.INT;

@ServiceProvider
public class FabricSettings implements SettingsDeclaration
{
    @Description( "Batch size used when requesting records from local Cypher engine." )
    @Internal
    public static final Setting<Integer> batch_size_setting = newBuilder( "fabric.stream.batch_size", INT, 50 ).addConstraint( min( 1 ) ).build();

    private static final String DRIVER_LOGGING_LEVEL = "driver.logging.level";
    private static final String DRIVER_LOG_LEAKED_SESSIONS = "driver.logging.leaked_sessions";
    private static final String DRIVER_MAX_CONNECTION_POOL_SIZE = "driver.connection.pool.max_size";
    private static final String DRIVER_IDLE_TIME_BEFORE_CONNECTION_TEST = "driver.connection.pool.idle_test";
    private static final String DRIVER_CONNECTION_ACQUISITION_TIMEOUT = "driver.connection.pool.acquisition_timeout";
    private static final String DRIVER_MAX_CONNECTION_LIFETIME = "driver.connection.max_lifetime";
    private static final String DRIVER_CONNECT_TIMEOUT = "driver.connection.connect_timeout";
    private static final String DRIVER_API = "driver.api";

    // See GraphDatabaseSettings in 4.2 change dbms.routing.driver to fabric.driver for convention.  View Javadocs to see all options.

    @Description( "A comma-separated list of Fabric instances that form a routing group. A driver will route transactions to available routing group members.\nA Fabric instance is represented by its Bolt connector address." )
    public static Setting<List<SocketAddress>> fabricServersSetting =
            newBuilder( "fabric.routing.servers", SettingValueParsers.listOf( SettingValueParsers.SOCKET_ADDRESS ),
                        List.of( new SocketAddress( "localhost", 7687 ) ) ).dynamic().build();
    @Description( "Name of the Fabric db. Only one Fabric db is currently supported per Neo4j instance." )
    public static Setting<String> databaseName = newBuilder( "fabric.db.name", SettingValueParsers.DATABASENAME, null ).build();
    @Description( "The time to live (TTL) of a routing table for fabric routing group." )
    public static Setting<Duration> routingTtlSetting = newBuilder( "fabric.routing.ttl", SettingValueParsers.DURATION, Duration.ofMinutes( 1L ) ).build();
    @Description( "Time interval of inactivity after which a driver will be closed." )
    @Internal
    public static Setting<Duration> driverIdleTimeout = newBuilder( "fabric.driver.timeout", SettingValueParsers.DURATION, Duration.ofMinutes( 1L ) ).build();
    @Description( "Time interval between driver idleness check." )
    @Internal
    public static Setting<Duration> driverIdleCheckInterval =
            newBuilder( "fabric.driver.idle_check_interval", SettingValueParsers.DURATION, Duration.ofMinutes( 1L ) ).build();
    @Description( " Number of event loops used by drivers. Event loops are shard between drivers, so this is the total number of event loops created." )
    @DocumentedDefaultValue( "Number of available processors" )
    @Internal
    public static Setting<Integer> driverEventLoopCount =
            newBuilder( "fabric.driver.event_loop_count", SettingValueParsers.INT, Runtime.getRuntime().availableProcessors() ).build();
    @Description( "Sets level for driver internal logging." )
    @DocumentedDefaultValue( "Value of dbms.logs.debug.level" )
    public static Setting<Level> driverLoggingLevel = newBuilder( "fabric.driver.logging.level", SettingValueParsers.ofEnum( Level.class ), null ).build();
    @Description( "Enables logging of leaked driver session" )
    @Internal
    public static Setting<Boolean> driverLogLeakedSessions = newBuilder( "fabric.driver.logging.leaked_sessions", SettingValueParsers.BOOL, false ).build();
    @Description( "Maximum total number of connections to be managed by a connection pool.\nThe limit is enforced for a combination of a host and user. Negative values are allowed and result in unlimited pool. Value of 0is not allowed." )
    @DocumentedDefaultValue( "Unlimited" )
    public static Setting<Integer> driverMaxConnectionPoolSize = newBuilder( "fabric.driver.connection.pool.max_size", SettingValueParsers.INT, -1 ).build();
    @Description( "Pooled connections that have been idle in the pool for longer than this timeout will be tested before they are used again, to ensure they are still alive.\nIf this option is set too low, an additional network call will be incurred when acquiring a connection, which causes a performance hit.\nIf this is set high, no longer live connections might be used which might lead to errors.\nHence, this parameter tunes a balance between the likelihood of experiencing connection problems and performance\nNormally, this parameter should not need tuning.\nValue 0 means connections will always be tested for validity" )
    @DocumentedDefaultValue( "No connection liveliness check is done by default." )
    public static Setting<Duration> driverIdleTimeBeforeConnectionTest =
            newBuilder( "fabric.driver.connection.pool.idle_test", SettingValueParsers.DURATION, null ).build();
    @Description( "Pooled connections older than this threshold will be closed and removed from the pool.\nSetting this option to a low value will cause a high connection churn and might result in a performance hit.\nIt is recommended to set maximum lifetime to a slightly smaller value than the one configured in network\nequipment (load balancer, proxy, firewall, etc. can also limit maximum connection lifetime).\nZero and negative values result in lifetime not being checked." )
    public static Setting<Duration> driverMaxConnectionLifetime =
            newBuilder( "fabric.driver.connection.max_lifetime", SettingValueParsers.DURATION, Duration.ofHours( 1L ) ).build();
    @Description( "Maximum amount of time spent attempting to acquire a connection from the connection pool.\nThis timeout only kicks in when all existing connections are being used and no new connections can be created because maximum connection pool size has been reached.\nError is raised when connection can't be acquired within configured time.\nNegative values are allowed and result in unlimited acquisition timeout. Value of 0 is allowed and results in no timeout and immediate failure when connection is unavailable" )
    public static Setting<Duration> driverConnectionAcquisitionTimeout =
            newBuilder( "fabric.driver.connection.pool.acquisition_timeout", SettingValueParsers.DURATION, Duration.ofSeconds( 60L ) ).build();
    @Description( "Socket connection timeout.\nA timeout of zero is treated as an infinite timeout and will be bound by the timeout configured on the\noperating system level." )
    public static Setting<Duration> driverConnectTimeout =
            newBuilder( "fabric.driver.connection.connect_timeout", SettingValueParsers.DURATION, Duration.ofSeconds( 5L ) ).build();
    @Description( "Maximal size of a buffer used for pre-fetching result records of remote queries.\nTo compensate for latency to remote databases, the Fabric execution engine pre-fetches records needed for local executions.\nThis limit is enforced per fabric query. If a fabric query uses multiple remote stream at the same time, this setting represents the maximal number of pre-fetched records counted together for all such remote streams" )
    public static Setting<Integer> bufferSizeSetting =
            newBuilder( "fabric.stream.buffer.size", SettingValueParsers.INT, 1000 ).addConstraint( SettingConstraints.min( 1 ) ).build();
    @Description( "Number of records in prefetching buffer that will trigger prefetching again. This is strongly related to fabric.stream.buffer.size" )
    public static Setting<Integer> bufferLowWatermarkSetting =
            newBuilder( "fabric.stream.buffer.low_watermark", SettingValueParsers.INT, 300 ).addConstraint( SettingConstraints.min( 0 ) ).build();
    @Description( "Batch size used when requesting records from local Cypher engine." )
    @Internal
    public static Setting<Integer> batchSizeSetting =
            newBuilder( "fabric.stream.batch_size", SettingValueParsers.INT, 50 ).addConstraint( SettingConstraints.min( 1 ) ).build();
    @Description( "Maximal concurrency within Fabric queries.\nLimits the number of iterations of each subquery that are executed concurrently. Higher concurrency may consume more memory and network resources simultaneously, while lower concurrency may force sequential execution, requiring more time." )
    @DocumentedDefaultValue( "The number of remote graphs" )
    public static Setting<Integer> concurrency =
            newBuilder( "fabric.stream.concurrency", SettingValueParsers.INT, null ).addConstraint( SettingConstraints.min( 1 ) ).build();
    @Description( "Determines which driver API will be used. ASYNC must be used when the remote instance is 3.5" )
    public static Setting<FabricSettings.DriverApi> driverApi =
            newBuilder( "fabric.driver.api", SettingValueParsers.ofEnum( FabricSettings.DriverApi.class ), FabricSettings.DriverApi.RX ).build();

    public enum DriverApi
    {
        RX,
        ASYNC
    }

    public static class GraphSetting extends GroupSetting
    {
        @Description( "URI of the Neo4j DBMS hosting the db associated to the Fabric graph. Example: neo4j://somewhere:7687 \nA comma separated list of URIs is acceptable. This is useful when the Fabric graph is hosted on a clusterand more that one bootstrap address needs to be provided in order to avoid a single point of failure.The provided addresses will be considered as an initial source of a routing table.Example: neo4j://core-1:1111,neo4j://core-2:2222" )
        public final Setting<List<URI>> uris;
        @Description( "Name of the db associated to the Fabric graph." )
        @DocumentedDefaultValue( "The default db on the target DBMS. Typically 'Neo4j'" )
        public final Setting<String> database;
        @Description( "Name assigned to the Fabric graph. The name can be used in Fabric queries." )
        public final Setting<NormalizedGraphName> name;
        public final Setting<Level> driverLoggingLevel;
        public final Setting<Boolean> driverLogLeakedSessions;
        public final Setting<Integer> driverMaxConnectionPoolSize;
        public final Setting<Duration> driverIdleTimeBeforeConnectionTest;
        public final Setting<Duration> driverMaxConnectionLifetime;
        public final Setting<Duration> driverConnectionAcquisitionTimeout;
        public final Setting<Duration> driverConnectTimeout;
        public final Setting<FabricSettings.DriverApi> driverApi;
        @Description( "SSL for Fabric drivers is configured using 'fabric' SSL policy.This setting can be used to instruct the driver not to use SSL even though 'fabric' SSL policy is configured.The driver will use SSL if 'fabric' SSL policy is configured and this setting is set to 'true'" )
        public final Setting<Boolean> sslEnabled;

        protected GraphSetting( String name )
        {
            super( name );
            this.uris = getBuilder( "uri", SettingValueParsers.listOf( SettingValueParsers.URI ), null ).build();
            this.database = getBuilder( "db", SettingValueParsers.STRING, null ).build();
            this.name = getBuilder( "name", SettingValueParsers.GRAPHNAME, null ).build();
            this.driverLoggingLevel = getBuilder( "driver.logging.level", SettingValueParsers.ofEnum( Level.class ), null ).build();
            this.driverLogLeakedSessions = getBuilder( "driver.logging.leaked_sessions", SettingValueParsers.BOOL, null ).build();
            this.driverMaxConnectionPoolSize = getBuilder( "driver.connection.pool.max_size", SettingValueParsers.INT, null ).build();
            this.driverIdleTimeBeforeConnectionTest = getBuilder( "driver.connection.pool.idle_test", SettingValueParsers.DURATION, null ).build();
            this.driverMaxConnectionLifetime = getBuilder( "driver.connection.max_lifetime", SettingValueParsers.DURATION, null ).build();
            this.driverConnectionAcquisitionTimeout =
                    getBuilder( "driver.connection.pool.acquisition_timeout", SettingValueParsers.DURATION, null ).build();
            this.driverConnectTimeout = getBuilder( "driver.connection.connect_timeout", SettingValueParsers.DURATION, null ).build();
            this.driverApi = getBuilder( "driver.api", SettingValueParsers.ofEnum( FabricSettings.DriverApi.class ), null ).build();
            this.sslEnabled = getBuilder( "driver.ssl_enabled", SettingValueParsers.BOOL, true ).build();
        }

        public GraphSetting()
        {
            super( null );
            this.uris = getBuilder( "uri", SettingValueParsers.listOf( SettingValueParsers.URI ), null ).build();
            this.database = getBuilder( "db", SettingValueParsers.STRING, null ).build();
            this.name = getBuilder( "name", SettingValueParsers.GRAPHNAME, null ).build();
            this.driverLoggingLevel = getBuilder( "driver.logging.level", SettingValueParsers.ofEnum( Level.class ), null ).build();
            this.driverLogLeakedSessions = getBuilder( "driver.logging.leaked_sessions", SettingValueParsers.BOOL, null ).build();
            this.driverMaxConnectionPoolSize = getBuilder( "driver.connection.pool.max_size", SettingValueParsers.INT, null ).build();
            this.driverIdleTimeBeforeConnectionTest = getBuilder( "driver.connection.pool.idle_test", SettingValueParsers.DURATION, null ).build();
            this.driverMaxConnectionLifetime = getBuilder( "driver.connection.max_lifetime", SettingValueParsers.DURATION, null ).build();
            this.driverConnectionAcquisitionTimeout =
                    getBuilder( "driver.connection.pool.acquisition_timeout", SettingValueParsers.DURATION, null ).build();
            this.driverConnectTimeout = getBuilder( "driver.connection.connect_timeout", SettingValueParsers.DURATION, null ).build();
            this.driverApi = getBuilder( "driver.api", SettingValueParsers.ofEnum( FabricSettings.DriverApi.class ), null ).build();
            this.sslEnabled = getBuilder( "driver.ssl_enabled", SettingValueParsers.BOOL, true ).build();
        }

        public static FabricSettings.GraphSetting of( String name )
        {
            return new FabricSettings.GraphSetting( name );
        }

        public String getPrefix()
        {
            return "fabric.graph";
        }
    }
}
