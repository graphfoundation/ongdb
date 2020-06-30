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

package org.neo4j.fabric;

import java.util.Collections;
import java.util.List;

import org.neo4j.fabric.config.FabricConfig;
import org.neo4j.internal.kernel.api.procs.FieldSignature;
import org.neo4j.internal.kernel.api.procs.Neo4jTypes;
import org.neo4j.internal.kernel.api.procs.Neo4jTypes.ListType;
import org.neo4j.internal.kernel.api.procs.QualifiedName;
import org.neo4j.internal.kernel.api.procs.UserFunctionSignature;
import org.neo4j.kernel.api.procedure.CallableUserFunction;
import org.neo4j.kernel.api.procedure.Context;
import org.neo4j.values.AnyValue;
import org.neo4j.values.storable.Values;

public class GraphIdProc implements CallableUserFunction
{
    private static final String NAME = "graphIdProc";
    private static final String DESCRIPTION = "List all graph ids in fabric.";
    private static final List<FieldSignature> ARGUMENT_TYPES = Collections.emptyList();
    private static final ListType RESULT_TYPE = Neo4jTypes.NTList( Neo4jTypes.NTInteger );

    private static final boolean isCaseSensitive = true;

    private final UserFunctionSignature signature;
    private final FabricConfig fabricConfig;

    public GraphIdProc( FabricConfig fabricConfig )
    {
        this.fabricConfig = fabricConfig;
        String namespace = fabricConfig.getDatabase().getName().name();
        this.signature =
                new UserFunctionSignature( new QualifiedName( new String[]{namespace}, NAME ), ARGUMENT_TYPES, RESULT_TYPE, null, new String[0],
                                           DESCRIPTION, isCaseSensitive );
    }

    @Override
    public UserFunctionSignature signature()
    {
        return this.signature;
    }

    @Override
    public boolean threadSafe()
    {
        return true;
    }

    @Override
    public AnyValue apply( Context ctx, AnyValue[] input )
    {
        return Values.longArray( this.fabricConfig.getDatabase().getGraphs().stream().mapToLong( FabricConfig.Graph::getId ).toArray() );
    }
}

