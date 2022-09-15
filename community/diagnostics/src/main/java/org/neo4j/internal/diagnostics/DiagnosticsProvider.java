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
package org.neo4j.internal.diagnostics;

public interface DiagnosticsProvider
{
    /**
     * Return an identifier for this {@link DiagnosticsProvider}. The result of
     * this method must be stable, i.e. invoking this method multiple times on
     * the same object should return {@link Object#equals(Object) equal}
     * {@link String strings}.
     *
     * For {@link DiagnosticsProvider}s where there is only one instance of that
     * {@link DiagnosticsProvider}, an implementation like this is would be a
     * sane default, given that the implementing class has a sensible name:
     *
     * <code><pre>
     * public String getDiagnosticsName()
     * {
     *     return getClass().getName();
     * }
     * </pre></code>
     *
     * @return the identifier of this diagnostics provider.
     */
    String getDiagnosticsName();

    /**
     * Dump the diagnostic information of this {@link DiagnosticsProvider} to sink.
     *
     * @param logger to dump messages to.
     */
    void dump( DiagnosticsLogger logger );
}
