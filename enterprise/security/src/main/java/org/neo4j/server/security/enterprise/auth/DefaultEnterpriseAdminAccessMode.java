/*
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
package org.neo4j.server.security.enterprise.auth;

import java.util.HashSet;
import java.util.Iterator;

import org.neo4j.internal.kernel.api.security.AdminActionOnResource;
import org.neo4j.internal.kernel.api.security.AdminActionOnResource.DatabaseScope;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.kernel.enterprise.api.security.EnterpriseAdminAccessMode;

public class DefaultEnterpriseAdminAccessMode implements EnterpriseAdminAccessMode
{
    private final HashSet<AdminActionOnResource> whitelist;
    private final HashSet<AdminActionOnResource> blacklist;

    DefaultEnterpriseAdminAccessMode( HashSet<AdminActionOnResource> whitelist, HashSet<AdminActionOnResource> blacklist )
    {
        this.whitelist = whitelist;
        this.blacklist = blacklist;
    }
    public static boolean matches( HashSet<AdminActionOnResource> actions, AdminActionOnResource action )
    {
        Iterator<AdminActionOnResource> actionsIterator = actions.iterator();

        AdminActionOnResource rule;
        do
        {
            if ( !actionsIterator.hasNext() )
            {
                return false;
            }

            rule = actionsIterator.next();
        }
        while ( !rule.matches( action ) );

        return true;
    }
    
    public boolean allows( AdminActionOnResource action )
    {
        return matches( this.whitelist, action ) && !matches( this.blacklist, action );
    }

    public static class Builder
    {
        HashSet<AdminActionOnResource> whitelist = new HashSet();
        HashSet<AdminActionOnResource> blacklist = new HashSet();

        public DefaultEnterpriseAdminAccessMode.Builder full()
        {
            for ( PrivilegeAction action : PrivilegeAction.values() )
            {
                this.whitelist.add( new AdminActionOnResource( action, DatabaseScope.ALL ) );
            }

            return this;
        }

        public DefaultEnterpriseAdminAccessMode.Builder allow( AdminActionOnResource action )
        {
            this.whitelist.add( action );
            return this;
        }

        public DefaultEnterpriseAdminAccessMode.Builder deny( AdminActionOnResource action )
        {
            this.blacklist.add( action );
            return this;
        }

        public DefaultEnterpriseAdminAccessMode build()
        {
            return new DefaultEnterpriseAdminAccessMode( this.whitelist, this.blacklist );
        }
    }
}
