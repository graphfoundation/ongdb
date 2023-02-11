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
package org.neo4j.kernel.impl.transaction.log.checkpoint;

import java.util.Arrays;
import java.util.function.BooleanSupplier;

import org.neo4j.exceptions.UnderlyingStorageException;
import org.neo4j.function.Predicates;
import org.neo4j.io.pagecache.IOController;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.monitoring.Health;
import org.neo4j.scheduler.Group;
import org.neo4j.scheduler.JobHandle;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.util.FeatureToggles;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.neo4j.scheduler.JobMonitoringParams.systemJob;

public class CheckPointScheduler extends LifecycleAdapter
{
    /**
     * The max number of consecutive check point failures that can be tolerated before treating
     * check point failures more seriously, with a panic.
     */
    static final int MAX_CONSECUTIVE_FAILURES_TOLERANCE =
            FeatureToggles.getInteger( CheckPointScheduler.class, "failure_tolerance", 10 );

    private final CheckPointer checkPointer;
    private final IOController ioController;
    private final JobScheduler scheduler;
    private final long recurringPeriodMillis;
    private final Health health;
    private final String databaseName;
    private final Throwable[] failures = new Throwable[MAX_CONSECUTIVE_FAILURES_TOLERANCE];
    private volatile int consecutiveFailures;
    private final Runnable job = new Runnable()
    {
        @Override
        public void run()
        {
            try
            {
                checkPointing = true;
                if ( stopped )
                {
                    return;
                }
                checkPointer.checkPointIfNeeded( new SimpleTriggerInfo( "Scheduled checkpoint" ) );

                // There were previous unsuccessful attempts, but this attempt was a success
                // so let's clear those previous errors.
                if ( consecutiveFailures > 0 )
                {
                    Arrays.fill( failures, null );
                    consecutiveFailures = 0;
                }
            }
            catch ( Throwable t )
            {
                failures[consecutiveFailures++] = t;

                // We're counting check pointer to log about the failure itself
                if ( consecutiveFailures >= MAX_CONSECUTIVE_FAILURES_TOLERANCE )
                {
                    UnderlyingStorageException combinedFailure = constructCombinedFailure();
                    health.panic( combinedFailure );
                    throw combinedFailure;
                }
            }
            finally
            {
                checkPointing = false;
            }

            // reschedule only if it is not stopped
            if ( !stopped )
            {
                schedule();
            }
        }

        private UnderlyingStorageException constructCombinedFailure()
        {
            UnderlyingStorageException combined = new UnderlyingStorageException( "Error performing check point" );
            for ( int i = 0; i < consecutiveFailures; i++ )
            {
                combined.addSuppressed( failures[i] );
            }
            return combined;
        }
    };

    private volatile JobHandle handle;
    private volatile boolean stopped;
    private volatile boolean checkPointing;
    private final BooleanSupplier checkPointingCondition = () -> !checkPointing;

    public CheckPointScheduler( CheckPointer checkPointer, IOController ioController, JobScheduler scheduler, long recurringPeriodMillis,
            Health health, String databaseName )
    {
        this.checkPointer = checkPointer;
        this.ioController = ioController;
        this.scheduler = scheduler;
        this.recurringPeriodMillis = recurringPeriodMillis;
        this.health = health;
        this.databaseName = databaseName;
    }

    @Override
    public void start()
    {
        schedule();
    }

    @Override
    public void stop()
    {
        stopped = true;
        if ( handle != null )
        {
            handle.cancel();
        }
        waitOngoingCheckpointCompletion();
    }

    private void waitOngoingCheckpointCompletion()
    {
        ioController.disable();
        try
        {
            Predicates.awaitForever( checkPointingCondition, 100, MILLISECONDS );
        }
        finally
        {
            ioController.enable();
        }
    }

    private void schedule()
    {
        handle = scheduler.schedule( Group.CHECKPOINT, systemJob( databaseName, "Scheduled checkpoint" ), job, recurringPeriodMillis, MILLISECONDS );
    }
}
