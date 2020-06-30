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
package org.neo4j.cypher.internal.runtime.compiled.expressions;

import org.neo4j.cypher.internal.runtime.DbAccess;
import org.neo4j.cypher.internal.runtime.ExecutionContext;
import org.neo4j.cypher.internal.runtime.ExpressionCursors;
import org.neo4j.values.AnyValue;

/**
 * Interface implemented by compiled projection.
 */
public interface CompiledProjection
{
    /**
     * Performs a projection
     *
     * @param context
     * @param dbAccess
     * @param params
     * @param cursors
     * @param expressionParms
     */
    void project( ExecutionContext context, DbAccess dbAccess, AnyValue[] params, ExpressionCursors cursors, AnyValue[] expressionParms );
}
