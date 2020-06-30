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

public class LabelSecurityPart implements SecurityPart
{
    public static final LabelSecurityPart ALL = new LabelSecurityPart( null );
    private final String label;

    public LabelSecurityPart( String label )
    {
        this.label = label;
    }

    public String getLabel()
    {
        return this.label;
    }

    @Override
    public int hashCode()
    {
        return this.label.hashCode();
    }

    @Override
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }
        else if ( obj instanceof LabelSecurityPart )
        {
            LabelSecurityPart other = (LabelSecurityPart) obj;
            if ( this.label == null )
            {
                return other.label == null;
            }
            else
            {
                return this.label.equals( other.getLabel() );
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
        return this.label == null ? "All labels" : "label: '" + this.label + "'";
    }
}
