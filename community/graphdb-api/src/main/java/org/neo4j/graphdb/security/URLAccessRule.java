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
 * Copyright (c) 2002-2020 "Neo4j,"
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
package org.neo4j.graphdb.security;

import java.net.URL;

import org.neo4j.graphdb.config.Configuration;

/**
 * A rule to evaluate if ONgDB is permitted to reach out to the specified URL (e.g. when using {@code LOAD CSV} in Geequel).
 */
public interface URLAccessRule
{
    /**
     * Validate this rule against the specified URL and configuration, and throw a {@link URLAccessValidationError}
     * if the URL is not permitted for access.
     *
     * @param configuration {@link Configuration} to validate the {@code url} against.
     * @param url the URL being validated
     * @return an updated URL that should be used for accessing the resource
     * @throws URLAccessValidationError thrown if the url does not pass the validation rule
     */
    URL validate( Configuration configuration, URL url ) throws URLAccessValidationError;
}
