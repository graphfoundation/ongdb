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
package org.neo4j.kernel.impl.transaction.log.pruning;

import org.neo4j.internal.helpers.collection.LongRange;
import org.neo4j.kernel.impl.transaction.log.files.LogFile;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogFileInformation;

import static java.lang.Math.min;
import static org.neo4j.storageengine.api.LogVersionRepository.INITIAL_LOG_VERSION;
import static org.neo4j.util.Preconditions.requireNonNegative;

public class ThresholdBasedPruneStrategy implements LogPruneStrategy
{
    private final LogFile logFile;
    private final Threshold threshold;
    private final TransactionLogFileInformation logFileInformation;

    ThresholdBasedPruneStrategy( LogFile logFile, Threshold threshold )
    {
        this.logFile = logFile;
        this.logFileInformation = logFile.getLogFileInformation();
        this.threshold = threshold;
    }

    @Override
    public String toString()
    {
        return threshold.toString();
    }

    @Override
    public synchronized LongRange findLogVersionsToDelete( long upToVersion )
    {
        if ( upToVersion == INITIAL_LOG_VERSION )
        {
            return LongRange.EMPTY_RANGE;
        }

        threshold.init();
        long lowestLogVersion = logFile.getLowestLogVersion();
        ThresholdEvaluationResult thresholdResult = pruneThresholdReached( upToVersion, lowestLogVersion );
        if ( !thresholdResult.reached() )
        {
            return LongRange.EMPTY_RANGE;
        }

        /*
         * We subtract 2 from upToVersion we make sure that at least one historical log remains behind, in addition of course to the
         * current one. This is in order to make sure that at least one transaction remains always available for
         * serving to whomever asks for it.
         * To illustrate, imagine that there is a threshold in place configured so that it enforces pruning of the
         * log file that was just rotated out (for example, a file size threshold that is mis-configured to be smaller
         * than the smallest log). In such a case, until the database commits a transaction there will be no
         * transactions present on disk, making impossible to serve any to whichever client might ask, leading to
         * errors on both sides of the conversation.
         * This if statement does nothing more complicated than checking if the next-to-last log would be pruned
         * and simply skipping it if so.
         */
        return LongRange.range( lowestLogVersion, min( thresholdResult.logVersion(), upToVersion - 2 ) );
    }

    private ThresholdEvaluationResult pruneThresholdReached( long upToVersion, long lowestLogVersion )
    {
        for ( long version = upToVersion - 1; version >= lowestLogVersion; version-- )
        {
            if ( threshold.reached( logFile.getLogFileForVersion( version ), version, logFileInformation ) )
            {
                return ThresholdEvaluationResult.reached( version );
            }
        }
        return ThresholdEvaluationResult.notReached();
    }

    private static class ThresholdEvaluationResult
    {
        private static final int NON_EXISTING_LOG_VERSION = -1;

        private static ThresholdEvaluationResult notReached()
        {
            return new ThresholdEvaluationResult();
        }

        private static ThresholdEvaluationResult reached( long version )
        {
            requireNonNegative( version );
            return new ThresholdEvaluationResult( version );
        }

        private final long logVersion;

        private ThresholdEvaluationResult()
        {
            this( NON_EXISTING_LOG_VERSION );
        }

        private ThresholdEvaluationResult( long logVersion )
        {
            this.logVersion = logVersion;
        }

        boolean reached()
        {
            return logVersion != NON_EXISTING_LOG_VERSION;
        }

        long logVersion()
        {
            return logVersion;
        }
    }
}
