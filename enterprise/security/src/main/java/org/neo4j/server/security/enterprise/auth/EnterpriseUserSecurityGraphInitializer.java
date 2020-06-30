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

import org.apache.shiro.authz.SimpleRole;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.dbms.database.SystemGraphInitializer;
import org.neo4j.graphdb.ConstraintViolationException;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.kernel.api.security.PrivilegeAction;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.kernel.impl.security.User;
import org.neo4j.logging.Log;
import org.neo4j.server.security.auth.ListSnapshot;
import org.neo4j.server.security.auth.UserRepository;
import org.neo4j.server.security.enterprise.auth.plugin.api.PredefinedRoles;
import org.neo4j.server.security.systemgraph.BasicSystemGraphRealm;
import org.neo4j.server.security.systemgraph.UserSecurityGraphInitializer;

public class EnterpriseUserSecurityGraphInitializer extends UserSecurityGraphInitializer
{
    public static final String DEFAULT_GRAPH_DB_NAME = "neo4j";
    private final RoleRepository migrationRoleRepository;
    private final UserRepository defaultAdminRepository;
    private final Label ROLE_LABEL = Label.label( "Role" );
    private final Label PRIVILEGE_LABEL = Label.label( "Privilege" );
    private final RelationshipType GRANTED = RelationshipType.withName( "GRANTED" );
    private final RelationshipType USER_TO_ROLE = RelationshipType.withName( "HAS_ROLE" );
    private final RelationshipType SCOPE = RelationshipType.withName( "SCOPE" );
    private final RelationshipType APPLIES_TO = RelationshipType.withName( "APPLIES_TO" );
    private final RelationshipType QUALIFIED = RelationshipType.withName( "QUALIFIED" );
    private final RelationshipType FOR = RelationshipType.withName( "FOR" );
    private List<Node> roleNodes = new ArrayList();
    private Node traverseNodePriv;
    private Node traverserRelPriv;
    private Node readNodePriv;
    private Node readRelPriv;
    private Node writeNodePriv;
    private Node writeRelPriv;
    private Node accessPriv;
    private Node tokenPriv;
    private Node schemaPriv;
    private Node adminPriv;

    public EnterpriseUserSecurityGraphInitializer( DatabaseManager<?> databaseManager, SystemGraphInitializer systemGraphInitializer, Log log,
                                                   UserRepository migrationUserRepository, RoleRepository migrationRoleRepository,
                                                   UserRepository initialUserRepository,
                                                   UserRepository defaultAdminRepository, SecureHasher secureHasher )
    {
        super( databaseManager, systemGraphInitializer, log, migrationUserRepository, initialUserRepository, secureHasher );
        this.migrationRoleRepository = migrationRoleRepository;
        this.defaultAdminRepository = defaultAdminRepository;
    }

    public void initializeSecurityGraph() throws Exception
    {
        this.initializeSecurityGraph( this.getSystemDb() );
    }

    public void initializeSecurityGraph( GraphDatabaseService database ) throws Exception
    {
        this.systemGraphInitializer.initializeSystemGraph( database );
        this.systemDb = database;
        this.doInitializeSecurityGraph();
    }

    private void doInitializeSecurityGraph() throws Exception
    {
        this.setupConstraints();
        Transaction tx = this.systemDb.beginTx();

        try
        {
            this.userNodes = this.findInitialNodes( tx, this.USER_LABEL );
            this.userNodes.forEach( ( node ) ->
                                    {
                                        this.usernames.add( (String) node.getProperty( "name" ) );
                                    } );
            this.roleNodes = this.findInitialNodes( tx, this.ROLE_LABEL );
            if ( this.userNodes.isEmpty() )
            {
                this.migrateFromFlatFileRealm( tx );
            }

            if ( this.roleNodes.stream().anyMatch( ( node ) ->
                                                   {
                                                       return node.getProperty( "name" ).equals( "PUBLIC" );
                                                   } ) )
            {
                throw this.logAndCreateException(
                        "Startup of system graph failed because there exists a role named 'PUBLIC'. Please remove or rename that role and start again." );
            }

            this.ensureDefaultUserAndRoles( tx );
            tx.commit();
        }
        catch ( Throwable throwable )
        {
            if ( tx != null )
            {
                try
                {
                    tx.close();
                }
                catch ( Throwable throwable1 )
                {
                    throwable.addSuppressed( throwable1 );
                }
            }

            throw throwable;
        }

        if ( tx != null )
        {
            tx.close();
        }
    }

    private InvalidArgumentsException logAndCreateException( String message )
    {
        this.log.error( message );
        return new InvalidArgumentsException( message );
    }

    private void setupConstraints()
    {
        Transaction tx = this.systemDb.beginTx();

        try
        {
            try
            {
                tx.schema().constraintFor( this.USER_LABEL ).assertPropertyIsUnique( "name" ).create();
                tx.schema().constraintFor( this.ROLE_LABEL ).assertPropertyIsUnique( "name" ).create();
            }
            catch ( ConstraintViolationException e )
            {
                if ( !e.getMessage().startsWith( "An equivalent constraint already exists" ) )
                {
                    throw e;
                }
            }

            tx.commit();
        }
        catch ( Throwable e )
        {
            if ( tx != null )
            {
                try
                {
                    tx.close();
                }
                catch ( Throwable e2 )
                {
                    e.addSuppressed( e2 );
                }
            }

            throw e;
        }

        tx.close();
    }

    private void ensureDefaultUserAndRoles( Transaction tx ) throws Exception
    {
        if ( this.userNodes.isEmpty() )
        {
            this.addDefaultUser( tx );
            this.ensureDefaultRolesAndPrivileges( tx, DEFAULT_GRAPH_DB_NAME );
        }
        else if ( this.roleNodes.isEmpty() )
        {
            String newAdmin = this.ensureAdmin();
            this.ensureDefaultRolesAndPrivileges( tx, newAdmin );
        }

        this.setInitialPassword();
    }

    private String ensureAdmin() throws Exception
    {
        String newAdmin = null;
        this.startUserRepository( this.defaultAdminRepository );
        int numberOfDefaultAdmins = this.defaultAdminRepository.numberOfUsers();
        if ( numberOfDefaultAdmins > 1 )
        {
            throw this.logAndCreateException(
                    "No roles defined, and multiple users defined as default admin user. Please use `neo4j-admin set-default-admin` to select a valid admin." );
        }
        else
        {
            if ( numberOfDefaultAdmins == 1 )
            {
                newAdmin = this.defaultAdminRepository.getAllUsernames().iterator().next();
            }

            this.stopUserRepository( this.defaultAdminRepository );
            if ( newAdmin != null )
            {
                if ( !this.usernames.contains( newAdmin ) )
                {
                    throw this.logAndCreateException( "No roles defined, and default admin user '" + newAdmin +
                                                      "' does not exist. Please use `neo4j-admin set-default-admin` to select a valid admin." );
                }
                else
                {
                    return newAdmin;
                }
            }
            else if ( this.usernames.size() == 1 )
            {
                return this.usernames.get( 0 );
            }
            else if ( this.usernames.contains( DEFAULT_GRAPH_DB_NAME ) )
            {
                return DEFAULT_GRAPH_DB_NAME;
            }
            else
            {
                throw this.logAndCreateException(
                        "No roles defined, and cannot determine which user should be admin. Please use `neo4j-admin set-default-admin` to select an admin. " );
            }
        }
    }

    private void ensureDefaultRolesAndPrivileges( Transaction tx, String newAdmin ) throws Exception
    {
        if ( this.roleNodes.isEmpty() )
        {
            this.setUpDefaultPrivileges( tx );
            PredefinedRolesBuilder.roles.forEach( ( roleName, simpleRole ) ->
                                                  {
                                                      Node role = this.newRole( tx, roleName );
                                                      this.assignDefaultPrivileges( role, simpleRole );
                                                  } );
        }

        Node admin = tx.findNode( this.ROLE_LABEL, "name", "admin" );
        this.addRoleToUser( tx, admin, newAdmin );
        this.log.info( "Assigned %s role to user '%s'.", "admin", newAdmin );
    }

    private void setUpDefaultPrivileges( Transaction tx )
    {
        ResourceIterator<Node> itr = tx.findNodes( Label.label( "DatabaseAll" ) );
        boolean foundNode = itr.hasNext();
        itr.close();
        if ( !foundNode )
        {
            Node allDb = tx.createNode( Label.label( "DatabaseAll" ) );
            allDb.setProperty( "name", "*" );
            Node labelQualifier = tx.createNode( Label.label( "LabelQualifierAll" ) );
            labelQualifier.setProperty( "type", "node" );
            labelQualifier.setProperty( "label", "*" );
            Node relQualifier = tx.createNode( Label.label( "RelationshipQualifierAll" ) );
            relQualifier.setProperty( "type", "relationship" );
            relQualifier.setProperty( "label", "*" );
            Node dbQualifier = tx.createNode( Label.label( "DatabaseQualifier" ) );
            dbQualifier.setProperty( "type", "db" );
            dbQualifier.setProperty( "label", "" );
            Label segmentLabel = Label.label( "SecurityPart" );
            Node labelSegement = tx.createNode( segmentLabel );
            labelSegement.createRelationshipTo( labelQualifier, this.QUALIFIED );
            labelSegement.createRelationshipTo( allDb, this.FOR );
            Node relSegement = tx.createNode( segmentLabel );
            relSegement.createRelationshipTo( relQualifier, this.QUALIFIED );
            relSegement.createRelationshipTo( allDb, this.FOR );
            Node dbSegement = tx.createNode( segmentLabel );
            dbSegement.createRelationshipTo( dbQualifier, this.QUALIFIED );
            dbSegement.createRelationshipTo( allDb, this.FOR );
            Label resourceLabel = Label.label( "SecurityResource" );
            Node graphResource = tx.createNode( resourceLabel );
            graphResource.setProperty( "type", SecurityResource.Type.GRAPH.toString() );
            graphResource.setProperty( "arg1", "" );
            graphResource.setProperty( "arg2", "" );
            Node allPropResource = tx.createNode( resourceLabel );
            allPropResource.setProperty( "type", SecurityResource.Type.ALL_PROPERTIES.toString() );
            allPropResource.setProperty( "arg1", "" );
            allPropResource.setProperty( "arg2", "" );
            Node dbResource = tx.createNode( resourceLabel );
            dbResource.setProperty( "type", SecurityResource.Type.DATABASE.toString() );
            dbResource.setProperty( "arg1", "" );
            dbResource.setProperty( "arg2", "" );
            this.traverseNodePriv = tx.createNode( this.PRIVILEGE_LABEL );
            this.traverserRelPriv = tx.createNode( this.PRIVILEGE_LABEL );
            this.readNodePriv = tx.createNode( this.PRIVILEGE_LABEL );
            this.readRelPriv = tx.createNode( this.PRIVILEGE_LABEL );
            this.writeNodePriv = tx.createNode( this.PRIVILEGE_LABEL );
            this.writeRelPriv = tx.createNode( this.PRIVILEGE_LABEL );
            this.accessPriv = tx.createNode( this.PRIVILEGE_LABEL );
            this.tokenPriv = tx.createNode( this.PRIVILEGE_LABEL );
            this.schemaPriv = tx.createNode( this.PRIVILEGE_LABEL );
            this.adminPriv = tx.createNode( this.PRIVILEGE_LABEL );
            this.setupPrivilegeNode( this.traverseNodePriv, PrivilegeAction.TRAVERSE, labelSegement, graphResource );
            this.setupPrivilegeNode( this.traverserRelPriv, PrivilegeAction.TRAVERSE, relSegement, graphResource );
            this.setupPrivilegeNode( this.readNodePriv, PrivilegeAction.READ, labelSegement, allPropResource );
            this.setupPrivilegeNode( this.readRelPriv, PrivilegeAction.READ, relSegement, allPropResource );
            this.setupPrivilegeNode( this.writeNodePriv, PrivilegeAction.WRITE, labelSegement, allPropResource );
            this.setupPrivilegeNode( this.writeRelPriv, PrivilegeAction.WRITE, relSegement, allPropResource );
            this.setupPrivilegeNode( this.accessPriv, PrivilegeAction.ACCESS, dbSegement, dbResource );
            this.setupPrivilegeNode( this.tokenPriv, PrivilegeAction.TOKEN, dbSegement, dbResource );
            this.setupPrivilegeNode( this.schemaPriv, PrivilegeAction.SCHEMA, dbSegement, dbResource );
            this.setupPrivilegeNode( this.adminPriv, PrivilegeAction.ADMIN, dbSegement, dbResource );
        }
    }

    private void setupPrivilegeNode( Node privNode, PrivilegeAction action, Node segmentNode, Node resourceNode )
    {
        privNode.setProperty( "action", action.toString() );
        privNode.createRelationshipTo( segmentNode, this.SCOPE );
        privNode.createRelationshipTo( resourceNode, this.APPLIES_TO );
    }

    private void assignDefaultPrivileges( Node role, SimpleRole simpleRole )
    {
        if ( simpleRole.isPermitted( PredefinedRolesBuilder.SYSTEM ) )
        {
            role.createRelationshipTo( this.adminPriv, this.GRANTED );
        }

        if ( simpleRole.isPermitted( PredefinedRolesBuilder.SCHEMA ) )
        {
            role.createRelationshipTo( this.schemaPriv, this.GRANTED );
        }

        if ( simpleRole.isPermitted( PredefinedRolesBuilder.TOKEN ) )
        {
            role.createRelationshipTo( this.tokenPriv, this.GRANTED );
        }

        if ( simpleRole.isPermitted( PredefinedRolesBuilder.WRITE ) )
        {
            role.createRelationshipTo( this.writeNodePriv, this.GRANTED );
            role.createRelationshipTo( this.writeRelPriv, this.GRANTED );
        }

        if ( simpleRole.isPermitted( PredefinedRolesBuilder.READ ) )
        {
            role.createRelationshipTo( this.traverseNodePriv, this.GRANTED );
            role.createRelationshipTo( this.traverserRelPriv, this.GRANTED );
            role.createRelationshipTo( this.readNodePriv, this.GRANTED );
            role.createRelationshipTo( this.readRelPriv, this.GRANTED );
        }

        if ( simpleRole.isPermitted( PredefinedRolesBuilder.ACCESS ) )
        {
            role.createRelationshipTo( this.accessPriv, this.GRANTED );
        }
    }

    private void migrateFromFlatFileRealm( Transaction tx ) throws Exception
    {
        this.startUserRepository( this.migrationUserRepository );
        this.startRoleRepository( this.migrationRoleRepository );
        if ( this.migrationRoleRepository.getRoleByName( PredefinedRoles.PUBLIC ) != null )
        {
            throw this.logAndCreateException(
                    "Automatic migration of users and roles into system graph failed because 'PUBLIC' role exists. Please remove or rename that role and start again." );
        }
        else
        {
            this.doMigrateUsers( tx, this.migrationUserRepository );
            boolean migrateOk = this.doMigrateRoles( tx, this.migrationUserRepository, this.migrationRoleRepository );
            if ( !migrateOk )
            {
                throw this.logAndCreateException(
                        "Automatic migration of users and roles into system graph failed because repository files are inconsistent. " );
            }
            else
            {
                this.stopUserRepository( this.migrationUserRepository );
                this.stopRoleRepository( this.migrationRoleRepository );
            }
        }
    }

    private void startRoleRepository( RoleRepository roleRepository ) throws Exception
    {
        roleRepository.init();
        roleRepository.start();
    }

    private void stopRoleRepository( RoleRepository roleRepository ) throws Exception
    {
        roleRepository.stop();
        roleRepository.shutdown();
    }

    private boolean doMigrateRoles( Transaction tx, UserRepository userRepository, RoleRepository roleRepository ) throws Exception
    {
        ListSnapshot<User> users = userRepository.getPersistedSnapshot();
        ListSnapshot<RoleRecord> roles = roleRepository.getPersistedSnapshot();
        boolean usersToMigrate = !users.values().isEmpty();
        boolean rolesToMigrate = !roles.values().isEmpty();
        boolean valid = RoleRepository.validate( users.values(), roles.values() );
        if ( !valid )
        {
            return false;
        }
        else
        {
            if ( rolesToMigrate )
            {
                this.setUpDefaultPrivileges( tx );
                for ( RoleRecord roleRecord : roles.values() )
                {
                    String roleName = roleRecord.name();
                    Node role = this.newRole( tx, roleName );
                    if ( PredefinedRolesBuilder.roles.containsKey( roleName ) )
                    {
                        SimpleRole simpleRole = PredefinedRolesBuilder.roles.get( roleName );
                        this.assignDefaultPrivileges( role, simpleRole );
                    }

                    for ( String username : roleRecord.users() )
                    {
                        this.addRoleToUser( tx, role, username );
                    }
                }

                assert this.validateMigrationSucceeded( tx, userRepository, roleRepository );
            }

            if ( usersToMigrate || rolesToMigrate )
            {
                String roleString = roles.values().size() == 1 ? "role" : "roles";
                this.log.info( "Completed migration of %s %s into system graph.", Integer.toString( roles.values().size() ), roleString );
            }

            return true;
        }
    }

    private boolean validateMigrationSucceeded( Transaction tx, UserRepository userRepository, RoleRepository roleRepository ) throws Exception
    {
        ListSnapshot<User> users = userRepository.getPersistedSnapshot();
        ListSnapshot<RoleRecord> roles = roleRepository.getPersistedSnapshot();
        Set<String> systemGraphUsers = this.getAllNames( tx, this.USER_LABEL );
        List<String> repoUsernames = users.values().stream().map( User::name ).collect( Collectors.toList() );
        if ( !systemGraphUsers.containsAll( repoUsernames ) )
        {
            throw new IOException( "Users were not migrated correctly" );
        }
        else
        {
            List<String> repoRoleNames = roles.values().stream().map( RoleRecord::name ).collect( Collectors.toList() );
            Set<String> systemGraphRoles = this.getAllNames( tx, this.ROLE_LABEL );
            if ( !systemGraphRoles.containsAll( repoRoleNames ) )
            {
                throw new IOException( "Roles were not migrated correctly" );
            }
            else
            {

                if ( roles.values().isEmpty() )
                {
                    return true;
                }
                Set<String> usernamesForRole;

                for ( RoleRecord role : roles.values() )
                {
                    usernamesForRole = this.getUsernamesForRole( tx, role.name() );
                    usernamesForRole.containsAll( role.users() );
                }

                throw new IOException( "Role assignments were not migrated correctly" );
            }
        }
    }

    private Node newRole( Transaction tx, String roleName )
    {
        Node node = tx.createNode( this.ROLE_LABEL );
        node.setProperty( "name", roleName );
        this.roleNodes.add( node );
        return node;
    }

    private void addRoleToUser( Transaction tx, Node role, String username ) throws InvalidArgumentsException
    {
        BasicSystemGraphRealm.assertValidUsername( username );
        Node user = tx.findNode( this.USER_LABEL, "name", username );
        if ( user == null )
        {
            throw this.logAndCreateException( String.format( "User %s did not exist", username ) );
        }
        else
        {
            user.createRelationshipTo( role, this.USER_TO_ROLE );
        }
    }

    private Set<String> getUsernamesForRole( Transaction tx, String roleName ) throws InvalidArgumentsException
    {
        Set<String> usernames = new HashSet<>();
        Node role = tx.findNode( this.ROLE_LABEL, "name", roleName );
        if ( role == null )
        {
            throw this.logAndCreateException( "Role did not exist" );
        }
        else
        {
            Iterable<Relationship> relationships = role.getRelationships( Direction.INCOMING );
            relationships.forEach( ( relationship ) ->
                                   {
                                       usernames.add( (String) relationship.getStartNode().getProperty( "name" ) );
                                   } );
            return usernames;
        }
    }

    private Set<String> getAllNames( Transaction tx, Label label )
    {
        ResourceIterator<Node> nodes = tx.findNodes( label );
        Set<String> usernames = nodes.stream().map( ( node ) ->
                                                    {
                                                        return (String) node.getProperty( "name" );
                                                    } ).collect( Collectors.toSet() );
        nodes.close();
        return usernames;
    }
}
