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
package org.neo4j.kernel.enterprise.api.security.provider;

import org.neo4j.kernel.api.security.AuthManager;
import org.neo4j.kernel.api.security.UserManagerSupplier;
import org.neo4j.kernel.api.security.provider.SecurityProvider;
import org.neo4j.kernel.enterprise.api.security.EnterpriseAuthManager;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;

public class EnterpriseNoAuthSecurityProvider extends LifecycleAdapter implements SecurityProvider
{
    public static final EnterpriseNoAuthSecurityProvider INSTANCE = new EnterpriseNoAuthSecurityProvider();

    private EnterpriseNoAuthSecurityProvider()
    {
    }

    @Override
    public AuthManager authManager()
    {
        return EnterpriseAuthManager.NO_AUTH;
    }

    @Override
    public UserManagerSupplier userManagerSupplier()
    {
        return UserManagerSupplier.NO_AUTH;
    }
}
