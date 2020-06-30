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

package org.neo4j.metrics.source.jvm;

import com.codahale.metrics.Gauge;
import com.codahale.metrics.MetricRegistry;
import org.apache.commons.lang3.SystemUtils;

import org.neo4j.annotations.documented.Documented;
import org.neo4j.io.os.OsBeanUtil;
import org.neo4j.metrics.meter.MeterCounter;

@Documented( ".JVM file descriptor metrics." )
public class FileDescriptorMetrics extends JvmMetrics
{
    @Documented( "The current number of open file descriptors." )
    private static final String FILE_COUNT_TEMPLATE = MetricRegistry.name( JvmMetrics.NAME_PREFIX, "file.descriptors.count" );
    @Documented( "The maximum number of open file descriptors." )
    private static final String FILE_MAXIMUM_TEMPLATE = MetricRegistry.name( JvmMetrics.NAME_PREFIX, "file.descriptors.maximum" );
    private final String fileCount;
    private final String fileMaximum;
    private final MetricRegistry registry;

    public FileDescriptorMetrics( String metricsPrefix, MetricRegistry registry )
    {
        this.registry = registry;
        this.fileCount = MetricRegistry.name( metricsPrefix, FILE_COUNT_TEMPLATE );
        this.fileMaximum = MetricRegistry.name( metricsPrefix, FILE_MAXIMUM_TEMPLATE );
    }

    @Override
    public void start()
    {
        if ( SystemUtils.IS_OS_UNIX )
        {
            this.registry.register( fileCount, new MeterCounter( OsBeanUtil::getOpenFileDescriptors ) );
            this.registry.register( fileMaximum, new MeterCounter( OsBeanUtil::getMaxFileDescriptors ) );
        }
        else
        {
            // TODO: Check if correct.
            this.registry.register( fileCount, (Gauge<Long>) () ->
            {
                return -1L;
            } );
            this.registry.register( fileMaximum, (Gauge<Long>) () ->
            {
                return -1L;
            } );
        }
    }

    @Override
    public void stop()
    {
        this.registry.remove( fileCount );
        this.registry.remove( fileMaximum );
    }
}
