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
package org.neo4j.graphdb.facade;

import java.util.Map;

import org.neo4j.annotations.api.IgnoreApiCheck;
import org.neo4j.common.DependencyResolver;
import org.neo4j.graphdb.event.DatabaseEventListener;
import org.neo4j.graphdb.security.URLAccessRule;
import org.neo4j.kernel.extension.ExtensionFactory;
import org.neo4j.logging.LogProvider;
import org.neo4j.monitoring.Monitors;

@IgnoreApiCheck
public interface ExternalDependencies
{
    /**
     * Allowed to be null. Null means that no external {@link Monitors} was created,
     * let the database create its own monitors instance.
     */
    Monitors monitors();

    DependencyResolver dependencies();

    LogProvider userLogProvider();

    Iterable<ExtensionFactory<?>> extensions();

    Map<String,URLAccessRule> urlAccessRules();

    /**
     * Configured default database event listeners
     * @return configured default listeners or empty iterable.
     */
    Iterable<DatabaseEventListener> databaseEventListeners();
}
