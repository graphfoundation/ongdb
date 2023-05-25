/*
 * Copyright (c) "Graph Foundation,"
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
package org.neo4j.configuration;

import java.nio.file.Path;

import org.neo4j.annotations.service.ServiceProvider;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.io.ByteUnit;

import static org.neo4j.configuration.GraphDatabaseSettings.ongdb_home;
import static org.neo4j.configuration.SettingImpl.newBuilder;
import static org.neo4j.configuration.SettingValueParsers.BOOL;
import static org.neo4j.configuration.SettingValueParsers.BYTES;
import static org.neo4j.configuration.SettingValueParsers.INT;
import static org.neo4j.configuration.SettingValueParsers.PATH;
import static org.neo4j.configuration.SettingValueParsers.STRING;
import static org.neo4j.configuration.SettingValueParsers.JVM_ADDITIONAL;

@ServiceProvider
public class BootloaderSettings implements SettingsDeclaration
{
    @Description( "Name of the Windows Service managing ONgDB when installed using `ongdb install-service`. Only applicable on Windows OS." +
            " Note: This must be unique for each individual installation." )
    public static final Setting<String> windows_service_name = newBuilder( "dbms.windows_service_name", STRING, "ongdb" ).build();

    @Internal
    @Description( "Path of the lib directory" )
    public static final Setting<Path> windows_tools_directory =
            newBuilder( "unsupported.dbms.directories.windows_tools", PATH, Path.of( "bin", "tools" ) ).setDependency( ongdb_home ).immutable().build();

    @Description( "Additional JVM arguments. Argument order can be significant. To use a Java commercial feature, the argument to unlock " +
            "commercial features must precede the argument to enable the specific feature in the config value string. For example, " +
            "to use Flight Recorder, `-XX:+UnlockCommercialFeatures` must come before `-XX:+FlightRecorder`." )
    public static final Setting<String> additional_jvm = newBuilder( "dbms.jvm.additional", JVM_ADDITIONAL, null ).build();

    @Description( "Initial heap size. By default it is calculated based on available system resources." )
    public static final Setting<Long> initial_heap_size = newBuilder( "dbms.memory.heap.initial_size", BYTES , null ).build();

    @Description( "Maximum heap size. By default it is calculated based on available system resources." )
    public static final Setting<Long> max_heap_size = newBuilder( "dbms.memory.heap.max_size", BYTES, null ).build();

    @Description( "GC Logging Options" )
    public static final Setting<String> gc_logging_options = newBuilder("dbms.logs.gc.options", STRING, "-Xlog:gc*,safepoint,age*=trace" ).build();

    @Description( "Number of GC logs to keep." )
    public static final Setting<Integer> gc_logging_rotation_keep_number =
            newBuilder( "dbms.logs.gc.rotation.keep_number", INT, 5 ).build();

    @Description( "Size of each GC log that is kept." )
    public static final Setting<Long> gc_logging_rotation_size = newBuilder( "dbms.logs.gc.rotation.size", BYTES, ByteUnit.mebiBytes( 20 ) ).build();

    @Description( "Enable GC Logging" )
    public static final Setting<Boolean> gc_logging_enabled = newBuilder( "dbms.logs.gc.enabled", BOOL, false ).build();

    @Description( "Path of the run directory. This directory holds ONgDB's runtime state, such as a pidfile when it " +
            "is running in the background. The pidfile is created when starting ONgDB and removed when stopping it." +
            " It may be placed on an in-memory filesystem such as tmpfs." )
    public static final Setting<Path> run_directory =
            newBuilder( "dbms.directories.run", PATH, Path.of( "run" ) ).setDependency( ongdb_home ).immutable().build();

    @Internal
    @Description( "Path of the pid file." )
    public static final Setting<Path> pid_file =
            newBuilder( "unsupported.dbms.directories.pid_file", PATH, Path.of( "ongdb.pid" ) ).setDependency( run_directory ).immutable().build();

    @Description( "Path of the lib directory" )
    public static final Setting<Path> lib_directory =
            newBuilder( "dbms.directories.lib", PATH, Path.of( "lib" ) ).setDependency( ongdb_home ).immutable().build();
}
