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
package org.neo4j.server.security.enterprise.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Result.ResultRow;
import org.neo4j.graphdb.Result.ResultVisitor;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.kernel.api.exceptions.Status;
import org.neo4j.kernel.api.exceptions.Status.Statement;
import org.neo4j.kernel.api.procedure.SystemProcedure;
import org.neo4j.procedure.Admin;
import org.neo4j.procedure.Description;
import org.neo4j.procedure.Mode;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.Procedure;

public class UserManagementProcedures extends AuthProceduresBase
{
    /**
     * @deprecated
     */
    @Admin
    @SystemProcedure
    @Deprecated
    @Description( "Create a new user." )
    @Procedure( name = "dbms.security.createUser", mode = Mode.DBMS, deprecatedBy = "Administration command: CREATE USER" )
    public void createUser( @Name( "username" ) String username, @Name( "password" ) String password,
                            @Name( value = "requirePasswordChange", defaultValue = "true" ) boolean requirePasswordChange ) throws ProcedureException
    {
        String query = String.format( "CREATE USER %s SET PASSWORD '%s' %s", this.escapeParameter( username ), password == null ? "" : password,
                                      requirePasswordChange ? "CHANGE REQUIRED" : "CHANGE NOT REQUIRED" );
        this.runSystemCommand( query, "dbms.security.createUser" );
    }

    /**
     * @deprecated
     */
    @SystemProcedure
    @Deprecated
    @Description( "Change the current user's password." )
    @Procedure( name = "dbms.security.changePassword", mode = Mode.DBMS, deprecatedBy = "Administration command: ALTER CURRENT USER SET PASSWORD" )
    public void changePassword( @Name( "password" ) String password,
                                @Name( value = "requirePasswordChange", defaultValue = "false" ) boolean requirePasswordChange ) throws ProcedureException
    {
        throw new ProcedureException( Statement.FeatureDeprecationWarning, "This procedure is no longer available, use: 'ALTER CURRENT USER SET PASSWORD'" );
    }

    /**
     * @deprecated
     */
    @Admin
    @SystemProcedure
    @Deprecated
    @Description( "Change the given user's password." )
    @Procedure( name = "dbms.security.changeUserPassword", mode = Mode.DBMS, deprecatedBy = "Administration command: ALTER USER" )
    public void changeUserPassword( @Name( "username" ) String username, @Name( "newPassword" ) String newPassword,
                                    @Name( value = "requirePasswordChange", defaultValue = "true" ) boolean requirePasswordChange ) throws ProcedureException
    {
        String query = String.format( "ALTER USER %s SET PASSWORD '%s' %s", this.escapeParameter( username ), newPassword == null ? "" : newPassword,
                                      requirePasswordChange ? "CHANGE REQUIRED" : "CHANGE NOT REQUIRED" );
        this.runSystemCommand( query, "dbms.security.changeUserPassword" );
    }

    /**
     * @deprecated
     */
    @Admin
    @SystemProcedure
    @Deprecated
    @Description( "Assign a role to the user." )
    @Procedure( name = "dbms.security.addRoleToUser", mode = Mode.DBMS, deprecatedBy = "Administration command: GRANT ROLE TO USER" )
    public void addRoleToUser( @Name( "roleName" ) String roleName, @Name( "username" ) String username ) throws ProcedureException
    {
        String query = String.format( "GRANT ROLE %s TO %s", this.escapeParameter( roleName ), this.escapeParameter( username ) );
        this.runSystemCommand( query, "dbms.security.addRoleToUser" );
    }

    /**
     * @deprecated
     */
    @Admin
    @SystemProcedure
    @Deprecated
    @Description( "Unassign a role from the user." )
    @Procedure( name = "dbms.security.removeRoleFromUser", mode = Mode.DBMS, deprecatedBy = "Administration command: REVOKE ROLE FROM USER" )
    public void removeRoleFromUser( @Name( "roleName" ) String roleName, @Name( "username" ) String username ) throws ProcedureException
    {
        String query = String.format( "REVOKE ROLE %s FROM %s", this.escapeParameter( roleName ), this.escapeParameter( username ) );
        this.runSystemCommand( query, "dbms.security.removeRoleFromUser" );
    }

    /**
     * @deprecated
     */
    @Admin
    @SystemProcedure
    @Deprecated
    @Description( "Delete the specified user." )
    @Procedure( name = "dbms.security.deleteUser", mode = Mode.DBMS, deprecatedBy = "Administration command: DROP USER" )
    public void deleteUser( @Name( "username" ) String username ) throws ProcedureException
    {
        String query = String.format( "DROP USER %s", this.escapeParameter( username ) );
        this.runSystemCommand( query, "dbms.security.deleteUser" );
    }

    /**
     * @deprecated
     */
    @Admin
    @SystemProcedure
    @Deprecated
    @Description( "Suspend the specified user." )
    @Procedure( name = "dbms.security.suspendUser", mode = Mode.DBMS, deprecatedBy = "Administration command: ALTER USER" )
    public void suspendUser( @Name( "username" ) String username ) throws ProcedureException
    {
        String query = String.format( "ALTER USER %s SET STATUS SUSPENDED", this.escapeParameter( username ) );
        this.runSystemCommand( query, "dbms.security.suspendUser" );
    }

    /**
     * @deprecated
     */
    @Admin
    @SystemProcedure
    @Deprecated
    @Description( "Activate a suspended user." )
    @Procedure( name = "dbms.security.activateUser", mode = Mode.DBMS, deprecatedBy = "Administration command: ALTER USER" )
    public void activateUser( @Name( "username" ) String username,
                              @Name( value = "requirePasswordChange", defaultValue = "true" ) boolean requirePasswordChange ) throws ProcedureException
    {
        String query = String.format( "ALTER USER %s %sSET STATUS ACTIVE", this.escapeParameter( username ),
                                      requirePasswordChange ? "SET PASSWORD CHANGE REQUIRED " : "" );
        this.runSystemCommand( query, "dbms.security.activateUser" );
    }

    /**
     * @deprecated
     */
    @Admin
    @SystemProcedure
    @Deprecated
    @Description( "List all native users." )
    @Procedure( name = "dbms.security.listUsers", mode = Mode.DBMS, deprecatedBy = "Administration command: SHOW USERS" )
    public Stream<AuthProceduresBase.UserResult> listUsers() throws ProcedureException
    {
        return this.listUsers( "dbms.security.listUsers" );
    }

    private Stream<AuthProceduresBase.UserResult> listUsers( String callingProcedure ) throws ProcedureException
    {
        ArrayList<AuthProceduresBase.UserResult> result = new ArrayList();
        String query = "SHOW USERS";

        try
        {
            Result execute = this.transaction.execute( query );
            execute.accept( ( row ) ->
                            {
                                String user = row.getString( "user" );
                                List<String> roles = (List) row.get( "roles" );
                                Boolean changeRequired = row.getBoolean( "passwordChangeRequired" );
                                Boolean suspended = row.getBoolean( "suspended" );
                                result.add( new AuthProceduresBase.UserResult( user, roles, changeRequired, suspended ) );
                                return true;
                            } );
        }
        catch ( Exception e )
        {
            this.translateException( e, callingProcedure );
        }

        return result.isEmpty() ? Stream.of( this.userResultForSubject() ) : result.stream();
    }

    /**
     * @deprecated
     */
    @Admin
    @SystemProcedure
    @Deprecated
    @Description( "List all available roles." )
    @Procedure( name = "dbms.security.listRoles", mode = Mode.DBMS, deprecatedBy = "Administration command: SHOW ROLES" )
    public Stream<AuthProceduresBase.RoleResult> listRoles() throws ProcedureException
    {
        final HashMap<String,Set<String>> result = new HashMap();
        ResultVisitor<RuntimeException> visitor = new ResultVisitor<RuntimeException>()
        {
            public boolean visit( ResultRow row ) throws RuntimeException
            {
                String role = row.getString( "role" );
                String user = row.getString( "member" );
                Set<String> users = result.computeIfAbsent( role, ( k ) ->
                {
                    return new HashSet();
                } );
                if ( user != null )
                {
                    users.add( user );
                }

                return true;
            }
        };
        this.queryForRoles( visitor, "dbms.security.listRoles" );
        return result.entrySet().stream().map( ( e ) ->
                                               {
                                                   return new AuthProceduresBase.RoleResult( e.getKey(), e.getValue() );
                                               } );
    }

    /**
     * @deprecated
     */
    @SystemProcedure
    @Deprecated
    @Description( "List all roles assigned to the specified user." )
    @Procedure( name = "dbms.security.listRolesForUser", mode = Mode.DBMS, deprecatedBy = "Administration command: SHOW USERS" )
    public Stream<AuthProceduresBase.StringResult> listRolesForUser( @Name( "username" ) final String username )
            throws ProcedureException, InvalidArgumentsException
    {
        String procedureName = "dbms.security.listRolesForUser";
        final HashSet<AuthProceduresBase.StringResult> result = new HashSet();
        boolean userExists = this.listUsers( procedureName ).anyMatch( ( res ) ->
                                                                       {
                                                                           return res.username.equals( username );
                                                                       } );
        if ( !userExists )
        {
            throw new InvalidArgumentsException( String.format( "User '%s' does not exist.", username ) );
        }
        else
        {
            ResultVisitor<RuntimeException> visitor = new ResultVisitor<RuntimeException>()
            {
                public boolean visit( ResultRow row ) throws RuntimeException
                {
                    String role = row.getString( "role" );
                    String user = row.getString( "member" );
                    if ( username.equals( user ) )
                    {
                        result.add( new AuthProceduresBase.StringResult( role ) );
                    }

                    return true;
                }
            };
            this.queryForRoles( visitor, procedureName );
            return result.stream();
        }
    }

    /**
     * @deprecated
     */
    @Admin
    @SystemProcedure
    @Deprecated
    @Description( "List all users currently assigned the specified role." )
    @Procedure( name = "dbms.security.listUsersForRole", mode = Mode.DBMS, deprecatedBy = "Administration command: SHOW ROLES WITH USERS" )
    public Stream<AuthProceduresBase.StringResult> listUsersForRole( @Name( "roleName" ) final String roleName )
            throws ProcedureException, InvalidArgumentsException
    {
        final AtomicBoolean roleExists = new AtomicBoolean( false );
        final HashSet<AuthProceduresBase.StringResult> result = new HashSet();
        ResultVisitor<RuntimeException> visitor = new ResultVisitor<RuntimeException>()
        {
            public boolean visit( ResultRow row ) throws RuntimeException
            {
                String role = row.getString( "role" );
                String user = row.getString( "member" );
                if ( roleName.equals( role ) )
                {
                    roleExists.set( true );
                    if ( user != null )
                    {
                        result.add( new AuthProceduresBase.StringResult( user ) );
                    }
                }

                return true;
            }
        };
        this.queryForRoles( visitor, "dbms.security.listUsersForRole" );
        if ( !roleExists.get() )
        {
            throw new InvalidArgumentsException( String.format( "Role '%s' does not exist.", roleName ) );
        }
        else
        {
            return result.stream();
        }
    }

    /**
     * @deprecated
     */
    @Admin
    @SystemProcedure
    @Deprecated
    @Description( "Create a new role." )
    @Procedure( name = "dbms.security.createRole", mode = Mode.DBMS, deprecatedBy = "Administration command: CREATE ROLE" )
    public void createRole( @Name( "roleName" ) String roleName ) throws ProcedureException
    {
        String query = String.format( "CREATE ROLE %s", this.escapeParameter( roleName ) );
        this.runSystemCommand( query, "dbms.security.createRole" );
    }

    /**
     * @deprecated
     */
    @Admin
    @SystemProcedure
    @Deprecated
    @Description( "Delete the specified role. Any role assignments will be removed." )
    @Procedure( name = "dbms.security.deleteRole", mode = Mode.DBMS, deprecatedBy = "Administration command: DROP ROLE" )
    public void deleteRole( @Name( "roleName" ) String roleName ) throws ProcedureException
    {
        String query = String.format( "DROP ROLE %s", this.escapeParameter( roleName ) );
        this.runSystemCommand( query, "dbms.security.deleteRole" );
    }

    private boolean isSelf( String username )
    {
        return this.securityContext.subject().hasUsername( username );
    }

    private void queryForRoles( ResultVisitor<RuntimeException> visitor, String procedureName ) throws ProcedureException
    {
        String query = "SHOW ALL ROLES WITH USERS";

        try
        {
            Result execute = this.transaction.execute( query );
            execute.accept( visitor );
        }
        catch ( Exception e )
        {
            this.translateException( e, procedureName );
        }
    }

    private HashSet<String> getStrings( Collection rolesObj ) throws ProcedureException
    {
        HashSet<String> roles = new HashSet();
        if ( !(rolesObj instanceof Collection) )
        {
            throw new ProcedureException( null, "" );
        }
        else
        {
            for ( Object roleObject : rolesObj )
            {
                if ( !(roleObject instanceof String) )
                {
                    // TODO: Review
                    throw new ProcedureException( null, "" );
                }

                roles.add( (String) roleObject );
            }

            return roles;
        }
    }

    private void runSystemCommand( String query, String procedureName ) throws ProcedureException
    {
        try
        {
            Result execute = this.transaction.execute( query );
            execute.accept( ( row ) ->
                            {
                                return true;
                            } );
        }
        catch ( Exception e )
        {
            this.translateException( e, procedureName );
        }
    }

    private void translateException( Exception e, String procedureName ) throws ProcedureException
    {
        Status status = Status.statusCodeOf( e );
        if ( status != null && status.equals( Statement.NotSystemDatabaseError ) )
        {
            throw new ProcedureException( org.neo4j.kernel.api.exceptions.Status.Procedure.ProcedureCallFailed, e,
                                          String.format( "This is an administration command and it should be executed against the system db: %s",
                                                         procedureName )
            );
        }
        else
        {
            throw new ProcedureException( org.neo4j.kernel.api.exceptions.Status.Procedure.ProcedureCallFailed, e, e.getMessage() );
        }
    }

    private String escapeParameter( String input )
    {
        return String.format( "`%s`", input == null ? "" : input );
    }
}

