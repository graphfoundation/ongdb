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
package org.neo4j.internal.batchimport.input;

import java.util.function.BiConsumer;

import org.neo4j.internal.batchimport.ImportLogic;
import org.neo4j.kernel.impl.store.format.RecordFormats;

public class EstimationSanityChecker
{
    private final RecordFormats formats;
    private final ImportLogic.Monitor monitor;

    public EstimationSanityChecker( RecordFormats formats, ImportLogic.Monitor monitor )
    {
        this.formats = formats;
        this.monitor = monitor;
    }

    public void sanityCheck( Input.Estimates estimates )
    {
        sanityCheckEstimateWithMaxId( estimates.numberOfNodes(), formats.node().getMaxId(),
                monitor::mayExceedNodeIdCapacity );
        sanityCheckEstimateWithMaxId( estimates.numberOfRelationships(), formats.relationship().getMaxId(),
                monitor::mayExceedRelationshipIdCapacity );
    }

    private static void sanityCheckEstimateWithMaxId( long estimate, long max, BiConsumer<Long,Long> reporter )
    {
        if ( estimate > max * 0.8 )
        {
            reporter.accept( max, estimate );
        }
    }
}
