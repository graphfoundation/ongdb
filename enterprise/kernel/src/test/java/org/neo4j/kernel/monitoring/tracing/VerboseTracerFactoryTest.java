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
package org.neo4j.kernel.monitoring.tracing;

import org.junit.Test;

import org.neo4j.io.pagecache.tracing.PageCacheTracer;
import org.neo4j.kernel.monitoring.Monitors;
import org.neo4j.logging.BufferingLog;
import org.neo4j.test.OnDemandJobScheduler;
import org.neo4j.time.Clocks;

import static org.junit.Assert.assertEquals;

public class VerboseTracerFactoryTest
{

    @Test
    public void verboseTracerFactoryRegisterTracerWithCodeNameVerbose()
    {
        assertEquals( "verbose", tracerFactory().getImplementationName() );
    }

    @Test
    public void verboseFactoryCreateVerboseTracer()
    {
        BufferingLog msgLog = new BufferingLog();
        PageCacheTracer pageCacheTracer = tracerFactory().createPageCacheTracer( new Monitors(),
                new OnDemandJobScheduler(), Clocks.nanoClock(), msgLog );
        pageCacheTracer.beginCacheFlush();
        assertEquals( "Start whole page cache flush.", msgLog.toString().trim() );
    }

    private VerboseTracerFactory tracerFactory()
    {
        return new VerboseTracerFactory();
    }
}
