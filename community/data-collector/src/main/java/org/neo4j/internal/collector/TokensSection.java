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
package org.neo4j.internal.collector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.neo4j.internal.kernel.api.TokenRead;
import org.neo4j.internal.kernel.api.exceptions.TransactionFailureException;
import org.neo4j.internal.kernel.api.security.LoginContext;
import org.neo4j.kernel.api.Kernel;
import org.neo4j.kernel.api.KernelTransaction;

/**
 * Data collector section that simply return all tokens (propertyKeys, labels and relationship types) that
 * are known to the database.
 */
final class TokensSection
{
    private TokensSection()
    { // only static methods
    }

    static Stream<RetrieveResult> retrieve( Kernel kernel ) throws TransactionFailureException
    {
        try ( KernelTransaction tx = kernel.beginTransaction( KernelTransaction.Type.EXPLICIT, LoginContext.AUTH_DISABLED ) )
        {
            TokenRead tokens = tx.tokenRead();

            List<String> labels = new ArrayList<>( tokens.labelCount() );
            tokens.labelsGetAllTokens().forEachRemaining( t -> labels.add( t.name() ) );

            List<String> relationshipTypes = new ArrayList<>( tokens.relationshipTypeCount() );
            tokens.relationshipTypesGetAllTokens().forEachRemaining( t -> relationshipTypes.add( t.name() ) );

            List<String> propertyKeys = new ArrayList<>( tokens.propertyKeyCount() );
            tokens.propertyKeyGetAllTokens().forEachRemaining( t -> propertyKeys.add( t.name() ) );

            Map<String,Object> data = new HashMap<>();
            data.put( "labels", labels );
            data.put( "relationshipTypes", relationshipTypes );
            data.put( "propertyKeys", propertyKeys );
            return Stream.of( new RetrieveResult( Sections.TOKENS, data ) );
        }
    }

    static void putTokenCounts( Map<String,Object> metaData, Kernel kernel ) throws TransactionFailureException
    {
        try ( KernelTransaction tx = kernel.beginTransaction( KernelTransaction.Type.EXPLICIT, LoginContext.AUTH_DISABLED ) )
        {
            TokenRead tokens = tx.tokenRead();
            metaData.put( "labelCount", tokens.labelCount() );
            metaData.put( "relationshipTypeCount", tokens.relationshipTypeCount() );
            metaData.put( "propertyKeyCount", tokens.propertyKeyCount() );
            tx.commit();
        }
    }
}
