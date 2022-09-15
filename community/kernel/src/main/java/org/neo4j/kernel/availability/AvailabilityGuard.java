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
package org.neo4j.kernel.availability;

/**
 * The availability guard ensures that the database will only take calls when it is in an ok state.
 * It tracks a set of requirements (added via {@link #require(AvailabilityRequirement)}) that must all be marked
 * as fulfilled (using {@link #fulfill(AvailabilityRequirement)}) before the database is considered available again.
 * Consumers determine if it is ok to call the database using {@link #isAvailable()},
 * or await availability using {@link #isAvailable(long)}.
 */
public interface AvailabilityGuard
{
    /**
     * Indicate a requirement that must be fulfilled before the database is considered available.
     *
     * @param requirement the requirement object
     */
    void require( AvailabilityRequirement requirement );

    /**
     * Indicate that a requirement has been fulfilled.
     *
     * @param requirement the requirement object
     */
    void fulfill( AvailabilityRequirement requirement );

    /**
     * Check if the database is available for transactions to use.
     *
     * @return true if there are no requirements waiting to be fulfilled and the guard has not been shutdown
     */
    boolean isAvailable();

    /**
     * Check if the database has been shut down.
     */
    boolean isShutdown();

    /**
     * Check if the database is available for transactions to use.
     *
     * @param millis to wait for availability
     * @return true if there are no requirements waiting to be fulfilled and the guard has not been shutdown
     */
    boolean isAvailable( long millis );

    /**
     * Await the database becoming available.
     *
     * @param millis to wait for availability
     * @throws UnavailableException thrown when the timeout has been exceeded or the guard has been shutdown
     */
    void await( long millis ) throws UnavailableException;

    /**
     * Add a listener for changes to availability.
     *
     * @param listener the listener to receive callbacks when availability changes
     */
    void addListener( AvailabilityListener listener );

    /**
     * Remove a listener for changes to availability.
     *
     * @param listener the listener to remove
     */
    void removeListener( AvailabilityListener listener );

    /**
     * @return a textual representation of what components, if any, are blocking
     */
    String describe();
}
