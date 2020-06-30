/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.dbms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class GraphDbOperatorConnector
{
    private final GraphDbStateReconciler reconciler;
    private final List<GraphDbOperator> operators = new CopyOnWriteArrayList();

    GraphDbOperatorConnector( GraphDbStateReconciler reconciler )
    {
        this.reconciler = reconciler;
    }

    void register( GraphDbOperator operator )
    {
        this.operators.add( operator );
    }

    public GraphDbReconcilerResult trigger( GraphDbReconcilerRequest request )
    {
        return this.reconciler.reconcileGrapbDbs( new ArrayList( this.operators ), request );
    }
}
