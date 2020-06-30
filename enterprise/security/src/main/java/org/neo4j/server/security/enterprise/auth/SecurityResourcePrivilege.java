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

import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

public class SecurityResourcePrivilege
{
    private final SecurityResourcePrivilege.GrantOrDeny privilegeType;
    private final PrivilegeAction action;
    private final SecurityResource securityResource;
    private final SecurityPart securityPart;
    private final String dbName;
    private final boolean allDatabases;

    public SecurityResourcePrivilege( SecurityResourcePrivilege.GrantOrDeny privilegeType, PrivilegeAction action, SecurityResource securityResource,
                                      SecurityPart securityPart )
            throws InvalidArgumentsException
    {
        this.privilegeType = privilegeType;
        this.action = action;
        this.securityResource = securityResource;
        this.securityPart = securityPart;
        this.dbName = "";
        this.allDatabases = true;
        securityResource.assertValidCombination( action );
    }

    public SecurityResourcePrivilege( SecurityResourcePrivilege.GrantOrDeny privilegeType, PrivilegeAction action, SecurityResource securityResource,
                                      SecurityPart securityPart, String dbName )
            throws InvalidArgumentsException
    {
        this.privilegeType = privilegeType;
        this.action = action;
        this.securityResource = securityResource;
        this.securityPart = securityPart;
        this.dbName = dbName;
        this.allDatabases = false;
        securityResource.assertValidCombination( action );
    }

    boolean appliesTo( String database )
    {
        if ( database.equals( GraphDatabaseSettings.SYSTEM_DATABASE_NAME ) && PrivilegeAction.ADMIN.satisfies( this.action ) )
        {
            return true;
        }
        else
        {
            return this.allDatabases || database.equals( this.dbName );
        }
    }

    SecurityResourcePrivilege.GrantOrDeny getPrivilegeType()
    {
        return this.privilegeType;
    }

    public SecurityResource getSecurityResource()
    {
        return this.securityResource;
    }

    public PrivilegeAction getAction()
    {
        return this.action;
    }

    public SecurityPart getSecurityPart()
    {
        return this.securityPart;
    }

    public String getDbName()
    {
        return this.dbName;
    }

    public boolean isAllDatabases()
    {
        return this.allDatabases;
    }

    public String toString()
    {
        return String.format( "(%s, %s, %s, %s)", this.privilegeType.prefix, this.getAction(), this.getSecurityResource(), this.getSecurityPart() );
    }

    public int hashCode()
    {
        return this.action.hashCode() + 31 * this.securityResource.hashCode();
    }

    public boolean equals( Object obj )
    {
        if ( !(obj instanceof SecurityResourcePrivilege) )
        {
            return false;
        }
        else
        {
            SecurityResourcePrivilege other = (SecurityResourcePrivilege) obj;
            return other.action.equals( this.action ) && other.securityResource.equals( this.securityResource ) &&
                   other.securityPart.equals( this.securityPart ) &&
                   other.dbName.equals( this.dbName ) && other.privilegeType == this.privilegeType && other.allDatabases == this.allDatabases;
        }
    }

    public enum GrantOrDeny
    {
        GRANT( "GRANTED" ),
        DENY( "DENIED" );

        public final String name = super.toString().toLowerCase();
        public final String prefix = super.toString().toUpperCase();
        public final String relType;

        GrantOrDeny( String relType )
        {
            this.relType = relType;
        }

        public static SecurityResourcePrivilege.GrantOrDeny fromRelType( String relType )
        {

            for ( SecurityResourcePrivilege.GrantOrDeny priv : values() )
            {
                if ( priv.relType.equals( relType ) )
                {
                    return priv;
                }
            }

            throw new IllegalArgumentException( "Unknown privilege type: " + relType );
        }

        public boolean isGrant()
        {
            return this == GRANT;
        }

        public boolean isDeny()
        {
            return this == DENY;
        }

        public String toString()
        {
            return this.name;
        }
    }
}
