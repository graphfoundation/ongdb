/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
package org.neo4j.server.security.enterprise.auth;

import org.apache.shiro.authc.AuthenticationToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.neo4j.kernel.api.security.AuthToken;
import org.neo4j.kernel.api.security.exception.InvalidAuthTokenException;

import static java.util.stream.Collectors.joining;

public class ShiroAuthToken implements AuthenticationToken
{
    private static final String VALUE_DELIMITER = "'";
    private static final String PAIR_DELIMITER = ", ";
    private static final String KEY_VALUE_DELIMITER = "=";

    private final Map<String,Object> authToken;

    public ShiroAuthToken( Map<String,Object> authToken )
    {
        this.authToken = authToken;
    }

    @Override
    public Object getPrincipal()
    {
        return authToken.get( AuthToken.PRINCIPAL );
    }

    @Override
    public Object getCredentials()
    {
        return authToken.get( AuthToken.CREDENTIALS );
    }

    public String getScheme() throws InvalidAuthTokenException
    {
        return AuthToken.safeCast( AuthToken.SCHEME_KEY, authToken );
    }

    public String getSchemeSilently()
    {
        Object scheme = authToken.get( AuthToken.SCHEME_KEY );
        return scheme == null ? null : scheme.toString();
    }

    public Map<String,Object> getAuthTokenMap()
    {
        return authToken;
    }

    /** returns true if token map does not specify a realm, or if it specifies the requested realm */
    public boolean supportsRealm( String realm )
    {
        Object providedRealm = authToken.get( AuthToken.REALM_KEY );

        return providedRealm == null ||
               providedRealm.equals( "*" ) ||
               providedRealm.equals( realm ) ||
               providedRealm.toString().isEmpty();
    }

    @Override
    public String toString()
    {
        if ( authToken.isEmpty() )
        {
            return "{}";
        }

        List<String> keys = new ArrayList<>( authToken.keySet() );
        int schemeIndex = keys.indexOf( AuthToken.SCHEME_KEY );
        if ( schemeIndex > 0 )
        {
            keys.set( schemeIndex, keys.get( 0 ) );
            keys.set( 0, AuthToken.SCHEME_KEY );
        }

        return keys.stream()
                .map( this::keyValueString )
                .collect( joining( PAIR_DELIMITER, "{ ", " }" ) );
    }

    private String keyValueString( String key )
    {
        String valueString = key.equals( AuthToken.CREDENTIALS ) ? "******" : String.valueOf( authToken.get( key ) );
        return key + KEY_VALUE_DELIMITER + VALUE_DELIMITER + valueString + VALUE_DELIMITER;
    }
}
