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

public class RelTypeSecurityPart implements SecurityPart
{
    public static final RelTypeSecurityPart ALL = new RelTypeSecurityPart( null );
    private final String relType;

    public RelTypeSecurityPart( String relType )
    {
        this.relType = relType;
    }

    public String getRelType()
    {
        return this.relType;
    }

    @Override
    public int hashCode()
    {
        return this.relType.hashCode();
    }

    @Override
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }
        else if ( obj instanceof RelTypeSecurityPart )
        {
            RelTypeSecurityPart other = (RelTypeSecurityPart) obj;
            if ( this.relType == null )
            {
                return other.relType == null;
            }
            else
            {
                return this.relType.equals( other.getRelType() );
            }
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString()
    {
        return this.relType == null ? "All relationships" : "relType: '" + this.relType + "'";
    }
}
