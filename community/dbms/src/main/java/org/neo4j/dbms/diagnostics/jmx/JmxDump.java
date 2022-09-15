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
package org.neo4j.dbms.diagnostics.jmx;

import com.sun.management.HotSpotDiagnosticMXBean;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadMXBean;
import java.nio.file.Path;
import java.util.Properties;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanException;
import javax.management.MBeanServerConnection;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.ReflectionException;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import org.neo4j.internal.utils.DumpUtils;
import org.neo4j.kernel.diagnostics.DiagnosticsReportSource;
import org.neo4j.kernel.diagnostics.DiagnosticsReportSources;

import static java.nio.file.Files.createTempFile;
import static java.nio.file.Files.deleteIfExists;

/**
 * Encapsulates remoting functionality for collecting diagnostics information on running instances.
 */
public class JmxDump
{
    private final MBeanServerConnection mBeanServer;
    private Properties systemProperties;

    private JmxDump( MBeanServerConnection mBeanServer )
    {
        this.mBeanServer = mBeanServer;
    }

    public static JmxDump connectTo( String jmxAddress ) throws IOException
    {
        JMXServiceURL url = new JMXServiceURL( jmxAddress );
        JMXConnector connect = JMXConnectorFactory.connect( url );

        return new JmxDump( connect.getMBeanServerConnection() );
    }

    public void attachSystemProperties( Properties systemProperties )
    {
        this.systemProperties = systemProperties;
    }

    /**
     * Captures a thread dump of the running instance.
     *
     * @return a diagnostics source the will emit a thread dump.
     */
    public DiagnosticsReportSource threadDump()
    {
        return DiagnosticsReportSources.newDiagnosticsString( "threaddump.txt", () ->
        {
            String result;
            try
            {
                // Try to invoke real thread dump
                result = (String) mBeanServer
                        .invoke( new ObjectName( "com.sun.management:type=DiagnosticCommand" ), "threadPrint",
                                new Object[]{null}, new String[]{String[].class.getName()} );
            }
            catch ( InstanceNotFoundException | ReflectionException | MBeanException | MalformedObjectNameException | IOException exception )
            {
                // Failed, do a poor mans attempt
                result = getMXThreadDump();
            }

            return result;
        } );
    }

    /**
     * If "DiagnosticCommand" bean isn't available, for reasons unknown, try our best to reproduce the output. For obvious
     * reasons we can't get everything, since it's not exposed in java.
     *
     * @return a thread dump.
     */
    private String getMXThreadDump()
    {
        ThreadMXBean threadMxBean;
        try
        {
            threadMxBean = ManagementFactory.getPlatformMXBean( mBeanServer, ThreadMXBean.class );
        }
        catch ( IOException e )
        {
            return "ERROR: Unable to produce any thread dump";
        }

        return DumpUtils.threadDump( threadMxBean, systemProperties );
    }

    public DiagnosticsReportSource heapDump()
    {
        return new DiagnosticsReportSource()
        {
            @Override
            public String destinationPath()
            {
                return "heapdump.hprof";
            }

            @Override
            public InputStream newInputStream() throws IOException
            {
                final Path heapdumpFile = createTempFile( "neo4j-heapdump", ".hprof" ).toAbsolutePath();
                deleteIfExists( heapdumpFile );
                heapDump( heapdumpFile.toString() );
                return new FileInputStream( heapdumpFile.toFile() )
                {
                    @Override
                    public void close() throws IOException
                    {
                        super.close();
                        deleteIfExists( heapdumpFile );
                    }
                };
            }

            @Override
            public long estimatedSize()
            {
                try
                {
                    final MemoryMXBean bean = ManagementFactory.getPlatformMXBean( mBeanServer, MemoryMXBean.class );
                    final long totalMemory = bean.getHeapMemoryUsage().getCommitted() + bean.getNonHeapMemoryUsage().getCommitted();

                    // We first write raw to disk then write to archive, 5x compression is a reasonable worst case estimation
                    return (long) (totalMemory * 1.2);
                }
                catch ( IOException e )
                {
                    throw new UncheckedIOException( e );
                }
            }
        };
    }

    /**
     * @param destination file path to send heap dump to, has to end with ".hprof"
     */
    private void heapDump( String destination ) throws IOException
    {
        HotSpotDiagnosticMXBean hotSpotDiagnosticMXBean =
                ManagementFactory.getPlatformMXBean( mBeanServer, HotSpotDiagnosticMXBean.class );
        hotSpotDiagnosticMXBean.dumpHeap( destination, false );
    }

    public DiagnosticsReportSource systemProperties()
    {
        return new DiagnosticsReportSource()
        {
            @Override
            public String destinationPath()
            {
                return "vm.prop";
            }

            @Override
            public InputStream newInputStream()
            {
                final ByteArrayOutputStream out = new ByteArrayOutputStream();
                systemProperties.list( new PrintStream( out, true ) );
                return new ByteArrayInputStream( out.toByteArray() );
            }

            @Override
            public long estimatedSize()
            {
                return 0;
            }
        };
    }
}
