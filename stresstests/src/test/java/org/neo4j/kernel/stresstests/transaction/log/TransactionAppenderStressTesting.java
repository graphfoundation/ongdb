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
package org.neo4j.kernel.stresstests.transaction.log;

import org.junit.Test;

import java.io.File;
import java.util.concurrent.Callable;

import org.neo4j.io.fs.FileUtils;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.impl.transaction.log.stresstest.TransactionAppenderStressTest.Builder;
import org.neo4j.kernel.impl.transaction.log.stresstest.TransactionAppenderStressTest.TransactionIdChecker;

import static java.lang.Integer.parseInt;
import static java.lang.System.getProperty;
import static java.util.concurrent.TimeUnit.MINUTES;
import static org.junit.Assert.assertEquals;
import static org.neo4j.function.Suppliers.untilTimeExpired;
import static org.neo4j.helper.StressTestingHelper.ensureExistsAndEmpty;
import static org.neo4j.helper.StressTestingHelper.fromEnv;

/**
 * Notice the class name: this is _not_ going to be run as part of the main build.
 */
public class TransactionAppenderStressTesting
{
    private static final String DEFAULT_DURATION_IN_MINUTES = "5";
    private static final String DEFAULT_WORKING_DIR = new File( getProperty( "java.io.tmpdir" ), "working" ).getPath();
    private static final String DEFAULT_NUM_THREADS = "10";

    @Test
    public void shouldBehaveCorrectlyUnderStress() throws Throwable
    {
        int durationInMinutes = parseInt( fromEnv( "TX_APPENDER_STRESS_DURATION", DEFAULT_DURATION_IN_MINUTES ) );
        File workingDirectory = new File( fromEnv( "TX_APPENDER_WORKING_DIRECTORY", DEFAULT_WORKING_DIR ) );
        int threads = parseInt( fromEnv( "TX_APPENDER_NUM_THREADS", DEFAULT_NUM_THREADS ) );

        Callable<Long> runner = new Builder()
                .with( untilTimeExpired( durationInMinutes, MINUTES ) )
                .withWorkingDirectory( DatabaseLayout.of( ensureExistsAndEmpty( workingDirectory ) ) )
                .withNumThreads( threads )
                .build();

        long appendedTxs = runner.call();

        assertEquals( new TransactionIdChecker( workingDirectory ).parseAllTxLogs(), appendedTxs );

        // let's cleanup disk space when everything went well
        FileUtils.deleteRecursively( workingDirectory );
    }
}
