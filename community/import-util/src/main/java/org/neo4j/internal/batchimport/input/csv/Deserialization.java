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

/**
 * Manages deserialization of one or more entry values, together forming some sort of entity.
 * It has mutable state and the usage pattern should be:
 *
 * <ol>
 * <li>One or more calls to {@link #handle(Header.Entry, Object)}</li>
 * <li>{@link #materialize()} to materialize the entity from the handled values</li>
 * <li>{@link #clear()} to prepare for the next entity</li>
 * </ol>
 */
public interface Deserialization<ENTITY>
{
    /**
     * Handles one value of a type described by the {@code entry}. One or more values will be able to
     * {@link #materialize()} into an entity later on.
     */
    void handle( Header.Entry entry, Object value );

    /**
     * Takes values received in {@link #handle(Header.Entry, Object)}
     * and materializes an entity from them.
     */
    ENTITY materialize();

    /**
     * Clears the mutable state, preparing for the next entity.
     */
    void clear();
}
