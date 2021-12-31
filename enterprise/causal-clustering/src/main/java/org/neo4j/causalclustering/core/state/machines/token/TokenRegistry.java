/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.causalclustering.core.state.machines.token;

import java.util.List;

import org.neo4j.kernel.impl.core.InMemoryTokenCache;
import org.neo4j.storageengine.api.Token;

public class TokenRegistry<TOKEN extends Token>
{
    private final InMemoryTokenCache<TOKEN> tokenCache;
    private final String tokenType;

    public TokenRegistry( String tokenType )
    {
        this.tokenType = tokenType;
        this.tokenCache = new InMemoryTokenCache<>( tokenType );
    }

    void setInitialTokens( List<TOKEN> tokens )
    {
        tokenCache.clear();
        tokenCache.putAll( tokens );
    }

    public String getTokenType()
    {
        return tokenType;
    }

    public int size()
    {
        return tokenCache.size();
    }

    Iterable<TOKEN> allTokens()
    {
        return tokenCache.allTokens();
    }

    Integer getId( String name )
    {
        return tokenCache.getId( name );
    }

    TOKEN getToken( int id )
    {
        return tokenCache.getToken( id );
    }

    void addToken( TOKEN token )
    {
        tokenCache.put( token );
    }
}
