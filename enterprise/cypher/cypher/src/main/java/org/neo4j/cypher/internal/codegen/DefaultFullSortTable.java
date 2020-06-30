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
package org.neo4j.cypher.internal.codegen;

import java.util.ArrayList;

/**
 * The default implementation of a table used for a full sort by the generated code
 * <p>
 * It accepts tuples as boxed objects that implements Comparable
 * <p>
 * Implements the following interface: (since the code is generated it does not actually need to declare it with implements)
 * <p>
 * public interface SortTable<T extends Comparable<?>> { boolean add( T e );
 * <p>
 * void sort();
 * <p>
 * Iterator<T> iterator(); }
 * <p>
 * This implementation just adapts Java's standard ArrayList
 */
public class DefaultFullSortTable<T extends Comparable<?>> extends ArrayList<T> // implements SortTable<T>
{
    public DefaultFullSortTable( int initialCapacity )
    {
        super( initialCapacity );
    }

    public void sort()
    {
        // Sort using the default array sort implementation (currently ComparableTimSort)
        sort( null );
    }
}
