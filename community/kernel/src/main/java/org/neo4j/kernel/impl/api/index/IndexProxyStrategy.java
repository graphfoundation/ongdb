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
package org.neo4j.kernel.impl.api.index;

import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.api.index.IndexSample;

/**
 * Representation of an index used by indexing services in this package.
 * It is a connection between index proxies and index descriptors with the
 * main purpose being the ability to change an index descriptor.
 * A proxy can represent only one index, but there is a special case when
 * two different descriptors represent the same index at a different point in time.
 * <p>
 * This is also a link to index statistics.
 */
interface IndexProxyStrategy
{
    IndexDescriptor getIndexDescriptor();

    void removeStatisticsForIndex();

    void incrementUpdateStatisticsForIndex( long delta );

    void replaceStatisticsForIndex( IndexSample sample );

    void changeIndexDescriptor( IndexDescriptor descriptor );

    String getIndexUserDescription();
}
