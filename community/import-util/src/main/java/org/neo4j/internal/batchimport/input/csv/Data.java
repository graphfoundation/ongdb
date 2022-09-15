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
package org.neo4j.internal.batchimport.input.csv;

import java.io.IOException;
import java.util.function.Supplier;

import org.neo4j.collection.RawIterator;
import org.neo4j.csv.reader.CharReadable;
import org.neo4j.csv.reader.CharSeeker;

import static org.neo4j.internal.batchimport.input.InputEntityDecorators.NO_DECORATOR;

/**
 * Produces a {@link CharSeeker} that can seek and extract values from a csv/tsv style data stream.
 * A decorator also comes with it which can specify global overrides/defaults of extracted input entities.
 */
public interface Data
{
    RawIterator<CharReadable,IOException> stream();

    Decorator decorator();

    abstract class Undecorated implements Data
    {
        @Override
        public Decorator decorator()
        {
            return NO_DECORATOR;
        }
    }

    static Data undecorated( Supplier<RawIterator<CharReadable,IOException>> streamSupplier )
    {
        return new Undecorated()
        {
            @Override
            public RawIterator<CharReadable,IOException> stream()
            {
                return streamSupplier.get();
            }
        };
    }
}
