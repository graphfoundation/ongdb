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
package org.neo4j.consistency.report;

import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.neo4j.consistency.RecordType;

public class ConsistencySummaryStatistics
{
    private final Map<RecordType, AtomicInteger> inconsistentRecordCount = new EnumMap<>( RecordType.class );
    private final AtomicLong totalInconsistencyCount = new AtomicLong();
    private final AtomicLong errorCount = new AtomicLong();
    private final AtomicLong warningCount = new AtomicLong();
    private final List<String> genericErrors = new CopyOnWriteArrayList<>();

    public ConsistencySummaryStatistics()
    {
        for ( RecordType recordType : RecordType.values() )
        {
            inconsistentRecordCount.put( recordType, new AtomicInteger() );
        }
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder( getClass().getSimpleName() ).append( '{' );
        result.append( "\n\tNumber of errors: " ).append( errorCount );
        result.append( "\n\tNumber of warnings: " ).append( warningCount );
        for ( Map.Entry<RecordType, AtomicInteger> entry : inconsistentRecordCount.entrySet() )
        {
            if ( entry.getValue().get() != 0 )
            {
                result.append( "\n\tNumber of inconsistent " )
                      .append( entry.getKey() ).append( " records: " ).append( entry.getValue() );
            }
        }
        if ( !genericErrors.isEmpty() )
        {
            result.append( "\n\tGeneric errors: " );
            genericErrors.forEach( message -> result.append( "\n\t\t" ).append( message ) );
        }
        return result.append( "\n}" ).toString();
    }

    public boolean isConsistent()
    {
        return totalInconsistencyCount.get() == 0;
    }

    public int getInconsistencyCountForRecordType( RecordType recordType )
    {
        return inconsistentRecordCount.get( recordType ).get();
    }

    public long getTotalInconsistencyCount()
    {
        return totalInconsistencyCount.get();
    }

    public long getTotalWarningCount()
    {
        return warningCount.get();
    }

    public List<String> getGenericErrors()
    {
        return Collections.unmodifiableList( genericErrors );
    }

    public void update( RecordType recordType, int errors, int warnings )
    {
        if ( errors > 0 )
        {
            inconsistentRecordCount.get( recordType ).addAndGet( errors );
            totalInconsistencyCount.addAndGet( errors );
            errorCount.addAndGet( errors );
        }
        if ( warnings > 0 )
        {
            warningCount.addAndGet( warnings );
        }
    }

    public void genericError( String message )
    {
        errorCount.addAndGet( 1 );
        genericErrors.add( message );
    }
}
