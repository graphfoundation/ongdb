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

import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

public interface SecurityResource
{
    static final int SALT = 31;

    void assertValidCombination( PrivilegeAction privilegeAction ) throws InvalidArgumentsException;

    default String getArg1()
    {
        return "";
    }

    default String getArg2()
    {
        return "";
    }

    SecurityResource.Type type();

    enum Type
    {
        ALL_PROPERTIES,
        PROPERTY,
        GRAPH,
        DATABASE,
        PROCEDURE;

        @Override
        public String toString()
        {
            return super.toString().toLowerCase();
        }
    }

    class ProcedureSecurityResource implements SecurityResource
    {
        private final String nameSpace;
        private final String procedure;

        public ProcedureSecurityResource( String nameSpace, String procedure )
        {
            this.nameSpace = nameSpace;
            this.procedure = procedure;
        }

        @Override
        public void assertValidCombination( PrivilegeAction action ) throws InvalidArgumentsException
        {
            if ( !action.equals( PrivilegeAction.EXECUTE ) )
            {
                throw new InvalidArgumentsException( String.format( "Procedure resource cannot be combined with action '%s'", action.toString() ) );
            }
        }

        @Override
        public String getArg1()
        {
            return this.nameSpace == null ? "" : this.nameSpace;
        }

        @Override
        public String getArg2()
        {
            return this.procedure == null ? "" : this.procedure;
        }

        @Override
        public SecurityResource.Type type()
        {
            return SecurityResource.Type.PROCEDURE;
        }

        @Override
        public String toString()
        {
            return "library " + this.nameSpace + " procedure " + this.procedure;
        }

        @Override
        public int hashCode()
        {
            int hash = this.nameSpace == null ? 0 : this.nameSpace.hashCode();
            return hash + SALT * (this.procedure == null ? 0 : this.procedure.hashCode());
        }

        @Override
        public boolean equals( Object obj )
        {
            if ( obj == this )
            {
                return true;
            }
            else if ( !(obj instanceof ProcedureSecurityResource) )
            {
                return false;
            }
            else
            {
                ProcedureSecurityResource other = (ProcedureSecurityResource) obj;
                boolean equals = other.nameSpace == null && this.nameSpace == null || other.nameSpace != null && other.nameSpace.equals( this.nameSpace );
                return equals && (other.procedure == null && this.procedure == null || other.procedure != null && other.procedure.equals( this.procedure ));
            }
        }
    }

    class PropertySecurityResource implements SecurityResource
    {
        private final String property;

        public PropertySecurityResource( String property )
        {
            this.property = property;
        }

        @Override
        public void assertValidCombination( PrivilegeAction action ) throws InvalidArgumentsException
        {
            if ( !action.equals( PrivilegeAction.WRITE ) && !action.equals( PrivilegeAction.READ ) )
            {
                throw new InvalidArgumentsException( String.format( "Property resource cannot be combined with action `%s`", action.toString() ) );
            }
        }

        @Override
        public String getArg1()
        {
            return this.property == null ? "" : this.property;
        }

        @Override
        public SecurityResource.Type type()
        {
            return SecurityResource.Type.PROPERTY;
        }

        @Override
        public String toString()
        {
            return "property " + this.property;
        }

        @Override
        public int hashCode()
        {
            return this.property == null ? 0 : this.property.hashCode() + 31 * SecurityResource.Type.PROPERTY.hashCode();
        }

        @Override
        public boolean equals( Object obj )
        {
            if ( obj == this )
            {
                return true;
            }
            else if ( !(obj instanceof PropertySecurityResource) )
            {
                return false;
            }
            else
            {
                PropertySecurityResource other = (PropertySecurityResource) obj;
                return this.property == null && other.property == null || this.property != null && this.property.equals( other.property );
            }
        }
    }

    class AllPropertiesSecurityResource implements SecurityResource
    {
        @Override
        public void assertValidCombination( PrivilegeAction action ) throws InvalidArgumentsException
        {
            if ( !action.equals( PrivilegeAction.WRITE ) && !action.equals( PrivilegeAction.READ ) )
            {
                throw new InvalidArgumentsException( String.format( "Property resource cannot be combined with action `%s`", action.toString() ) );
            }
        }

        @Override
        public SecurityResource.Type type()
        {
            return SecurityResource.Type.ALL_PROPERTIES;
        }

        @Override
        public String toString()
        {
            return "all properties ";
        }

        @Override
        public int hashCode()
        {
            return SecurityResource.Type.ALL_PROPERTIES.hashCode();
        }

        @Override
        public boolean equals( Object obj )
        {
            return obj == this || obj instanceof AllPropertiesSecurityResource;
        }
    }

    class DatabaseSecurityResource implements SecurityResource
    {
        @Override
        public void assertValidCombination( PrivilegeAction action ) throws InvalidArgumentsException
        {
            if ( !action.equals( PrivilegeAction.ACCESS ) && !PrivilegeAction.SCHEMA.satisfies( action ) && !PrivilegeAction.TOKEN.satisfies( action ) &&
                 !PrivilegeAction.ADMIN.satisfies( action ) )
            {
                throw new InvalidArgumentsException( String.format( "Database resource cannot be combined with action '%s'", action.toString() ) );
            }
        }

        @Override
        public SecurityResource.Type type()
        {
            return SecurityResource.Type.DATABASE;
        }

        @Override
        public String toString()
        {
            return this.type().toString() + this.hashCode();
        }

        @Override
        public int hashCode()
        {
            return SecurityResource.Type.DATABASE.hashCode();
        }

        @Override
        public boolean equals( Object obj )
        {
            return obj instanceof DatabaseSecurityResource;
        }
    }

    class GraphSecurityResource implements SecurityResource
    {
        public void assertValidCombination( PrivilegeAction action ) throws InvalidArgumentsException
        {
            if ( !action.equals( PrivilegeAction.WRITE ) && !action.equals( PrivilegeAction.READ ) && !action.equals( PrivilegeAction.TRAVERSE ) )
            {
                throw new InvalidArgumentsException( String.format( "Graph resource cannot be combined with action '%s'", action.toString() ) );
            }
        }

        public SecurityResource.Type type()
        {
            return SecurityResource.Type.GRAPH;
        }

        public String toString()
        {
            return "graph";
        }

        public int hashCode()
        {
            return SecurityResource.Type.GRAPH.hashCode();
        }

        public boolean equals( Object obj )
        {
            return obj instanceof GraphSecurityResource;
        }
    }
}
