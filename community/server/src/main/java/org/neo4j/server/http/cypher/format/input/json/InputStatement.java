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
package org.neo4j.server.http.cypher.format.input.json;

import java.util.List;
import java.util.Map;

import org.neo4j.server.http.cypher.format.api.Statement;
import org.neo4j.server.http.cypher.format.output.json.ResultDataContent;

/**
 * A statement representation specific to this input format.
 * <p>
 * It has some extra format-specific information over {@link Statement}.
 */
public class InputStatement
{
    private final String statement;
    private final Map<String,Object> parameters;
    private final boolean includeStats;
    private final List<ResultDataContent> resultDataContents;

    public InputStatement( String statement, Map<String,Object> parameters, boolean includeStats, List<ResultDataContent> resultDataContents )
    {
        this.statement = statement;
        this.parameters = parameters;
        this.includeStats = includeStats;
        this.resultDataContents = resultDataContents;
    }

    public String statement()
    {
        return statement;
    }

    public Map<String,Object> parameters()
    {
        return parameters;
    }

    public List<ResultDataContent> resultDataContents()
    {
        return resultDataContents;
    }

    public boolean includeStats()
    {
        return includeStats;
    }
}
