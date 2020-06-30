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
package org.neo4j.kernel.impl.enterprise.settings.metrics;

import java.nio.file.Path;
import java.time.Duration;

import org.neo4j.configuration.Description;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.configuration.SettingConstraints;
import org.neo4j.configuration.SettingImpl;
import org.neo4j.configuration.SettingValueParsers;
import org.neo4j.configuration.SettingsDeclaration;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.internal.helpers.HostnamePort;
import org.neo4j.io.ByteUnit;

/**
 * Settings for the Neo4j Enterprise metrics reporting.
 */
@Description( "Metrics settings" )
public class MetricsSettings implements SettingsDeclaration
{

    // Common settings
    @Description( "A common prefix for the reported metrics field names." )
    public static final Setting<String> metricsPrefix;

    // The below settings define what metrics to gather
    // By default everything is on
    @Description( "Enable metrics. Setting this to `false` will to turn off all metrics." )
    public static final Setting<Boolean> metricsEnabled;
    @Description( "Enable reporting metrics about transactions; number of transactions started, committed, etc." )
    public static final Setting<Boolean> neoTxEnabled;
    @Description( "Enable reporting metrics about the Neo4j page cache; page faults, evictions, flushes, exceptions, etc." )
    public static final Setting<Boolean> neoPageCacheEnabled;
    @Description( "Enable reporting metrics about approximately how many entities are in the db; nodes, relationships, properties, etc." )
    public static final Setting<Boolean> neoCountsEnabled;
    @Description( "Enable reporting metrics about the store size of each db" )
    public static final Setting<Boolean> neoStoreSizeEnabled;
    @Description( "Enable reporting metrics about number of entities in the db." )
    public static final Setting<Boolean> databaseCountsEnabled;
    @Description( "Enable reporting metrics about Causal Clustering mode." )
    public static final Setting<Boolean> causalClusteringEnabled;
    @Description( "Enable reporting metrics for Neo4j dbms operations; e.g. how many databases have been created or dropped, and how many attempted operations have failed." )
    public static final Setting<Boolean> databaseOperationCountEnabled;
    @Description( "Enable reporting metrics about Neo4j check pointing; when it occurs and how much time it takes to complete." )
    public static final Setting<Boolean> neoCheckPointingEnabled;
    @Description( "Enable reporting metrics about the Neo4j transaction logs" )
    public static final Setting<Boolean> neoTransactionLogsEnabled;
    @Description( "Enable reporting metrics about Server threading info." )
    public static final Setting<Boolean> neoServerEnabled;
    @Description( "Enable reporting metrics about the duration of garbage collections" )
    public static final Setting<Boolean> jvmGcEnabled;
    @Description( "Enable reporting metrics about the heap memory usage." )
    public static final Setting<Boolean> jvmHeapEnabled;
    @Description( "Enable reporting metrics about the memory usage." )
    public static final Setting<Boolean> jvmMemoryEnabled;
    @Description( "Enable reporting metrics about the buffer pools." )
    public static final Setting<Boolean> jvmBuffersEnabled;
    @Description( "Enable reporting metrics about the current number of threads running." )
    public static final Setting<Boolean> jvmThreadsEnabled;
    @Description( "Enable reporting metrics about the number of open file descriptors." )
    public static final Setting<Boolean> jvmFileDescriptorsEnabled;
    @Description( "Enable reporting metrics about number of occurred replanning events." )
    public static final Setting<Boolean> cypherPlanningEnabled;
    @Description( "Enable reporting metrics about Bolt Protocol message processing." )
    public static final Setting<Boolean> boltMessagesEnabled;

    // CSV settings
    @Description( "Set to `true` to enable exporting metrics to CSV files" )
    public static final Setting<Boolean> csvEnabled;
    @Description( "The target location of the CSV files: a path to a directory wherein a CSV file per reported field  will be written." )
    public static final Setting<Path> csvPath;
    @Description( "The reporting interval for the CSV files. That is, how often new rows with numbers are appended to the CSV files." )
    public static final Setting<Duration> csvInterval;
    @Description( "The file size in bytes at which the csv files will auto-rotate. If set to zero then no rotation will occur. Accepts a binary suffix `k`, `m` or `g`." )
    public static final Setting<Long> csvRotationThreshold;
    @Description( "Maximum number of history files for the csv files." )
    public static final Setting<Integer> csvMaxArchives;

    // Graphite settings
    @Description( "Set to `true` to enable exporting metrics to Graphite." )
    public static final Setting<Boolean> graphiteEnabled;
    @Description( "The hostname or IP address of the Graphite server" )
    public static final Setting<HostnamePort> graphiteServer;
    @Description( "The reporting interval for Graphite. That is, how often to send updated metrics to Graphite." )
    public static final Setting<Duration> graphiteInterval;

    // Prometheus settings
    @Description( "Set to `true` to enable the Prometheus endpoint" )
    public static final Setting<Boolean> prometheusEnabled;
    @Description( "The hostname and port to use as Prometheus endpoint" )
    public static final Setting<HostnamePort> prometheusEndpoint;
    @Description( "Set to `true` to enable the JMX metrics endpoint" )
    public static final Setting<Boolean> jmxEnabled;

    static
    {
        metricsPrefix = SettingImpl.newBuilder( "metrics.prefix", SettingValueParsers.STRING, "neo4j" )
                                   .build();
        metricsEnabled = SettingImpl.newBuilder( "metrics.enabled", SettingValueParsers.BOOL, true )
                                    .build();
        neoTxEnabled = SettingImpl
                .newBuilder( "metrics.neo4j.tx.enabled", SettingValueParsers.BOOL, true ).build();
        neoPageCacheEnabled = SettingImpl
                .newBuilder( "metrics.neo4j.pagecache.enabled", SettingValueParsers.BOOL, true ).build();
        neoCountsEnabled = SettingImpl
                .newBuilder( "metrics.neo4j.counts.enabled", SettingValueParsers.BOOL, true ).build();
        neoStoreSizeEnabled = SettingImpl
                .newBuilder( "metrics.neo4j.size.enabled", SettingValueParsers.BOOL, true ).build();
        databaseCountsEnabled = SettingImpl
                .newBuilder( "metrics.neo4j.data.counts.enabled", SettingValueParsers.BOOL, true ).build();
        causalClusteringEnabled = SettingImpl
                .newBuilder( "metrics.neo4j.causal_clustering.enabled", SettingValueParsers.BOOL, true )
                .build();
        databaseOperationCountEnabled = SettingImpl
                .newBuilder( "metrics.neo4j.database_operation_count.enabled", SettingValueParsers.BOOL,
                             true ).build();
        neoCheckPointingEnabled = SettingImpl
                .newBuilder( "metrics.neo4j.checkpointing.enabled", SettingValueParsers.BOOL, true ).build();
        neoTransactionLogsEnabled = SettingImpl
                .newBuilder( "metrics.neo4j.logs.enabled", SettingValueParsers.BOOL, true ).build();
        neoServerEnabled = SettingImpl
                .newBuilder( "metrics.neo4j.server.enabled", SettingValueParsers.BOOL, true ).build();
        jvmGcEnabled = SettingImpl.newBuilder( "metrics.jvm.gc.enabled", SettingValueParsers.BOOL, true )
                                  .build();
        jvmHeapEnabled = SettingImpl
                .newBuilder( "metrics.jvm.heap.enabled", SettingValueParsers.BOOL, true ).build();
        jvmMemoryEnabled = SettingImpl
                .newBuilder( "metrics.jvm.memory.enabled", SettingValueParsers.BOOL, true ).build();
        jvmBuffersEnabled = SettingImpl
                .newBuilder( "metrics.jvm.buffers.enabled", SettingValueParsers.BOOL, true ).build();
        jvmThreadsEnabled = SettingImpl
                .newBuilder( "metrics.jvm.threads.enabled", SettingValueParsers.BOOL, true ).build();
        jvmFileDescriptorsEnabled = SettingImpl
                .newBuilder( "metrics.jvm.file.descriptors.enabled", SettingValueParsers.BOOL, true ).build();
        cypherPlanningEnabled = SettingImpl
                .newBuilder( "metrics.cypher.replanning.enabled", SettingValueParsers.BOOL, true ).build();
        boltMessagesEnabled = SettingImpl
                .newBuilder( "metrics.bolt.messages.enabled", SettingValueParsers.BOOL, true ).build();
        csvEnabled = SettingImpl.newBuilder( "metrics.csv.enabled", SettingValueParsers.BOOL, true )
                                .build();
        csvPath = SettingImpl
                .newBuilder( "dbms.directories.metrics", SettingValueParsers.PATH, Path.of( "metrics" ) )
                .setDependency(
                        GraphDatabaseSettings.neo4j_home ).immutable().build();
        csvInterval = SettingImpl
                .newBuilder( "metrics.csv.interval", SettingValueParsers.DURATION, Duration.ofSeconds( 3L ) )
                .build();
        csvRotationThreshold = SettingImpl
                .newBuilder( "metrics.csv.rotation.size", SettingValueParsers.BYTES, ByteUnit.mebiBytes( 10L ) )
                .addConstraint(
                        SettingConstraints.range( 0L, Long.MAX_VALUE ) ).build();
        csvMaxArchives =
                SettingImpl.newBuilder( "metrics.csv.rotation.keep_number", SettingValueParsers.INT, 7 )
                           .addConstraint( SettingConstraints.min( 1 ) ).build();
        graphiteEnabled = SettingImpl
                .newBuilder( "metrics.graphite.enabled", SettingValueParsers.BOOL, false ).build();
        graphiteServer = SettingImpl
                .newBuilder( "metrics.graphite.server", SettingValueParsers.HOSTNAME_PORT,
                             new HostnamePort( ":2003" ) ).build();
        graphiteInterval = SettingImpl
                .newBuilder( "metrics.graphite.interval", SettingValueParsers.DURATION,
                             Duration.ofSeconds( 3L ) ).build();
        prometheusEnabled = SettingImpl
                .newBuilder( "metrics.prometheus.enabled", SettingValueParsers.BOOL, false ).build();
        prometheusEndpoint =
                SettingImpl.newBuilder( "metrics.prometheus.endpoint", SettingValueParsers.HOSTNAME_PORT,
                                        new HostnamePort( "localhost:2004" ) ).build();
        jmxEnabled = SettingImpl.newBuilder( "metrics.jmx.enabled", SettingValueParsers.BOOL, true )
                                .build();
    }
}
