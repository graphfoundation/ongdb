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
package org.neo4j.server.security.enterprise.auth.plugin.spi;

import java.io.Serializable;

import org.neo4j.server.security.enterprise.auth.plugin.api.AuthToken;

/**
 * An object that can be returned as the result of successful authentication by an {@link AuthenticationPlugin}.
 *
 * @see AuthenticationPlugin#authenticate(AuthToken)
 */
public interface AuthenticationInfo extends Serializable
{
    /**
     * Should return a principal that uniquely identifies the authenticated subject within this authentication
     * provider.
     *
     * <p>Typically this is the same as the principal within the auth token map.
     *
     * @return a principal that uniquely identifies the authenticated subject within this authentication provider.
     */
    Object principal();

    static AuthenticationInfo of( Object principal )
    {
        return (AuthenticationInfo) () -> principal;
    }
}
