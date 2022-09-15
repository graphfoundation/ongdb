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
package org.neo4j.kernel.impl.transaction.log.checkpoint;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.neo4j.configuration.Config;
import org.neo4j.kernel.impl.transaction.log.LogPosition;
import org.neo4j.kernel.impl.transaction.log.pruning.LogPruning;
import org.neo4j.logging.LogProvider;
import org.neo4j.time.SystemNanoClock;

import static org.neo4j.configuration.GraphDatabaseSettings.check_point_policy;


/**
 * A check point threshold provides information if a check point is required or not.
 */
public interface CheckPointThreshold
{
    long DEFAULT_CHECKING_FREQUENCY_MILLIS = TimeUnit.SECONDS.toMillis( 10 );

    /**
     * This method initialize the threshold by providing the initial transaction id
     *
     * @param transactionId the latest transaction committed id
     * @param logPosition the latest committed transaction log position
     */
    void initialize( long transactionId, LogPosition logPosition );

    /**
     * This method can be used for querying the threshold about the necessity of a check point.
     *
     * @param lastCommittedTransactionId the latest transaction committed id
     * @param logPosition the latest closed transaction log position
     * @param consumer will be called with the description about this threshold only if the return value is true
     * @return true is a check point is needed, false otherwise.
     */
    boolean isCheckPointingNeeded( long lastCommittedTransactionId, LogPosition logPosition, Consumer<String> consumer );

    /**
     * This method notifies the threshold that a check point has happened. This must be called every time a check point
     * has been written in the transaction log in order to make sure that the threshold updates its condition.
     * <p>
     * This is important since we might have multiple thresholds or forced check points.
     *
     * @param transactionId the latest transaction committed id used by the check point
     * @param logPosition the latest committed transaction log position
     */
    void checkPointHappened( long transactionId, LogPosition logPosition );

    /**
     * Return a desired checking frequency, as a number of milliseconds between calls to
     * {@link #isCheckPointingNeeded(long, LogPosition, Consumer)}.
     *
     * @return A desired scheduling frequency in milliseconds.
     */
    long checkFrequencyMillis();

    /**
     * Create and configure a {@link CheckPointThreshold} based on the given configurations.
     */
    static CheckPointThreshold createThreshold(
            Config config, SystemNanoClock clock, LogPruning logPruning, LogProvider logProvider )
    {
        String policyName = config.get( check_point_policy ).name().toLowerCase();
        CheckPointThresholdPolicy policy;
        try
        {
            policy = CheckPointThresholdPolicy.loadPolicy( policyName );
        }
        catch ( NoSuchElementException e )
        {
            logProvider.getLog( CheckPointThreshold.class ).warn(
                    "Could not load check point policy '" + check_point_policy.name() + "=" + policyName + "'. " +
                    "Using default policy instead.", e );
            policy = new PeriodicThresholdPolicy();
        }
        return policy.createThreshold( config, clock, logPruning, logProvider );
    }

    /**
     * Create a new {@link CheckPointThreshold} which will trigger if any of the given thresholds triggers.
     */
    static CheckPointThreshold or( final CheckPointThreshold... thresholds )
    {
        return new CheckPointThreshold()
        {
            @Override
            public void initialize( long transactionId, LogPosition logPosition )
            {
                for ( CheckPointThreshold threshold : thresholds )
                {
                    threshold.initialize( transactionId, logPosition );
                }
            }

            @Override
            public boolean isCheckPointingNeeded( long transactionId, LogPosition logPosition, Consumer<String> consumer )
            {
                for ( CheckPointThreshold threshold : thresholds )
                {
                    if ( threshold.isCheckPointingNeeded( transactionId, logPosition, consumer ) )
                    {
                        return true;
                    }
                }

                return false;
            }

            @Override
            public void checkPointHappened( long transactionId, LogPosition logPosition )
            {
                for ( CheckPointThreshold threshold : thresholds )
                {
                    threshold.checkPointHappened( transactionId, logPosition );
                }
            }

            @Override
            public long checkFrequencyMillis()
            {
                return Stream.of( thresholds )
                             .mapToLong( CheckPointThreshold::checkFrequencyMillis )
                             .min().orElse( DEFAULT_CHECKING_FREQUENCY_MILLIS );
            }
        };
    }
}
