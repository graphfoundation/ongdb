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

import java.util.NoSuchElementException;

import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

class SecurityResourcePrivilegeBuilder
{
    private static final String DATABASE_QUALIFIER = "DatabaseQualifier";
    private static final String LABEL_QUALIFIER = "LabelQualifier";
    private static final String LABEL_QUALIFIER_ALL = "LabelQualifierAll";
    private static final String RELATIONSHIP_QUALIFIER = "RelationshipQualifier";
    private static final String RELATIONSHIP_QUALIFIER_ALL = "RelationshipQualifierAll";

    private static final String LABEL = "label";
    private static final String TYPE = "type";

    private final SecurityResourcePrivilege.GrantOrDeny privilegeType;
    private final PrivilegeAction action;
    private SecurityPart securityPart;
    private SecurityResource securityResource;
    private String dbName = "";
    private boolean allDatabases;

    SecurityResourcePrivilegeBuilder( SecurityResourcePrivilege.GrantOrDeny privilegeType, String action )
    {
        this.privilegeType = privilegeType;
        this.action = PrivilegeAction.valueOf( action.toUpperCase() );
    }

    SecurityResourcePrivilegeBuilder forDatabases()
    {
        this.allDatabases = true;
        return this;
    }

    /**
     * @param databaseName
     * @return
     */
    SecurityResourcePrivilegeBuilder forDatabaseName( String databaseName )
    {
        this.dbName = databaseName;
        return this;
    }

    SecurityResourcePrivilegeBuilder forScope( Node qualifierNode )
    {
        Label qualifierType;
        try
        {
            qualifierType = Iterables.single( qualifierNode.getLabels() );
        }
        catch ( NoSuchElementException e )
        {
            throw new IllegalStateException( "Privilege segments require qualifier nodes with exactly one label. " + e.getMessage() );
        }

        switch ( qualifierType.name() )
        {
        case DATABASE_QUALIFIER:
            this.securityPart = DatabaseSecurityPart.ALL;
            break;
        case LABEL_QUALIFIER:
            String label = qualifierNode.getProperty( LABEL ).toString();
            this.securityPart = new LabelSecurityPart( label );
            break;
        case LABEL_QUALIFIER_ALL:
            this.securityPart = LabelSecurityPart.ALL;
            break;
        case RELATIONSHIP_QUALIFIER:
            String relType = qualifierNode.getProperty( LABEL ).toString();
            this.securityPart = new RelTypeSecurityPart( relType );
            break;
        case RELATIONSHIP_QUALIFIER_ALL:
            this.securityPart = RelTypeSecurityPart.ALL;
            break;
        default:
            throw new IllegalArgumentException( "Unknown privilege qualifier type: " + qualifierType.name() );
        }

        return this;
    }

    /**
     * @param resourceNode
     * @return
     * @throws InvalidArgumentsException
     */
    SecurityResourcePrivilegeBuilder forSecurityResource( Node resourceNode ) throws InvalidArgumentsException
    {
        String type = resourceNode.getProperty( TYPE ).toString();
        SecurityResource.Type resourceType = this.toSecurityResourceType( type );
        switch ( resourceType )
        {
        case DATABASE:
            this.securityResource = new SecurityResource.DatabaseSecurityResource();
            break;
        case GRAPH:
            this.securityResource = new SecurityResource.GraphSecurityResource();
            break;
        case PROPERTY:
            String propertyKey = resourceNode.getProperty( "arg1" ).toString();
            this.securityResource = new SecurityResource.PropertySecurityResource( propertyKey );
            break;
        case ALL_PROPERTIES:
            this.securityResource = new SecurityResource.AllPropertiesSecurityResource();
            break;
        case PROCEDURE:
            String namespace = resourceNode.getProperty( "arg1" ).toString();
            String procedureName = resourceNode.getProperty( "arg2" ).toString();
            this.securityResource = new SecurityResource.ProcedureSecurityResource( namespace, procedureName );
            break;
        default:
            throw new IllegalArgumentException( "Unknown resourceType: " + resourceType );
        }

        return this;
    }

    /**
     * @param typeString
     * @return
     * @throws InvalidArgumentsException
     */
    private SecurityResource.Type toSecurityResourceType( String typeString ) throws InvalidArgumentsException
    {
        try
        {
            return SecurityResource.Type.valueOf( typeString.toUpperCase() );
        }
        catch ( IllegalArgumentException e )
        {
            throw new InvalidArgumentsException( String.format( "Found not valid securityResource (%s) in the system graph.", typeString ) );
        }
    }

    SecurityResourcePrivilege build() throws InvalidArgumentsException
    {
        return this.allDatabases ? new SecurityResourcePrivilege( this.privilegeType, this.action, this.securityResource, this.securityPart )
                                 : new SecurityResourcePrivilege( this.privilegeType, this.action, this.securityResource, this.securityPart, this.dbName );
    }
}
