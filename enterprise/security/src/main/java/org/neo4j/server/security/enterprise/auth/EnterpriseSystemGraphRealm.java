/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.server.security.enterprise.auth;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;

import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

import org.neo4j.cypher.internal.security.SecureHasher;
import org.neo4j.dbms.database.DatabaseManager;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.NotFoundException;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.server.security.auth.AuthenticationStrategy;
import org.neo4j.server.security.enterprise.configuration.SecuritySettings;
import org.neo4j.server.security.systemgraph.BasicSystemGraphRealm;
import org.neo4j.server.security.systemgraph.SecurityGraphInitializer;

public class EnterpriseSystemGraphRealm extends BasicSystemGraphRealm implements RealmLifecycle, ShiroAuthorizationInfoProvider
{
    private static final Long MAX_NUM_THREADS = 10000L;
    private final boolean authorizationEnabled;
    private final Cache<String,Set<SecurityResourcePrivilege>> privilegeCache;

    public EnterpriseSystemGraphRealm( SecurityGraphInitializer systemGraphInitializer, DatabaseManager<?> databaseManager, SecureHasher secureHasher,
                                       AuthenticationStrategy authenticationStrategy, boolean authenticationEnabled, boolean authorizationEnabled )
    {
        super( systemGraphInitializer, databaseManager, secureHasher, authenticationStrategy, authenticationEnabled );
        this.setName( SecuritySettings.NATIVE_REALM_NAME );
        this.authorizationEnabled = authorizationEnabled;
        Caffeine<Object,Object> builder =
                Caffeine.newBuilder().maximumSize( MAX_NUM_THREADS ).executor( ForkJoinPool.commonPool() ).expireAfterAccess( Duration.ofHours( 1L ) );
        this.privilegeCache = builder.build();
        this.setAuthorizationCachingEnabled( true );
    }

    public void initialize()
    {
    }

    protected AuthorizationInfo doGetAuthorizationInfo( PrincipalCollection principals )
    {
        if ( !this.authorizationEnabled )
        {
            return null;
        }
        else
        {
            String username = (String) this.getAvailablePrincipal( principals );
            if ( username == null )
            {
                return null;
            }
            else
            {
                boolean existingUser = false;
                boolean passwordChangeRequired = false;
                boolean suspended = false;
                TreeSet roleNames = new TreeSet<>();

                try
                {
                    Transaction tx = this.getSystemDb().beginTx();

                    try
                    {
                        Node userNode = tx.findNode( Label.label( "User" ), "name", username );
                        if ( userNode != null )
                        {
                            existingUser = true;
                            passwordChangeRequired = (Boolean) userNode.getProperty( "passwordChangeRequired" );
                            suspended = (Boolean) userNode.getProperty( "suspended" );
                            Iterable<Relationship> rels =
                                    userNode.getRelationships( Direction.OUTGOING, RelationshipType.withName( "HAS_ROLE" ) );
                            rels.forEach( ( rel ) ->
                                          {
                                              roleNames.add( rel.getEndNode().getProperty( "name" ) );
                                          } );
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
                catch ( NotFoundException e )
                {
                    return null;
                }

                if ( !existingUser )
                {
                    return null;
                }
                else
                {
                    return !passwordChangeRequired && !suspended ? new SimpleAuthorizationInfo( roleNames ) : new SimpleAuthorizationInfo();
                }
            }
        }
    }

    @Override
    protected Object getAuthorizationCacheKey( PrincipalCollection principals )
    {
        return this.getAvailablePrincipal( principals );
    }

    @Override
    public AuthorizationInfo getAuthorizationInfoSnapshot( PrincipalCollection principalCollection )
    {
        return this.getAuthorizationInfo( principalCollection );
    }

    public Set<SecurityResourcePrivilege> getPrivilegesForRoles( Set<String> roles )
    {
        Map<String,Set<SecurityResourcePrivilege>> resultsPerRole = new HashMap();
        boolean lookupPrivileges = false;
        Set<SecurityResourcePrivilege> securityResourcePrivileges;
        for ( String role : roles )
        {
            securityResourcePrivileges = this.privilegeCache.getIfPresent( role );
            if ( securityResourcePrivileges == null )
            {
                lookupPrivileges = true;
            }
            else
            {
                resultsPerRole.put( role, securityResourcePrivileges );
            }
        }

        if ( lookupPrivileges )
        {
            Transaction tx = this.getSystemDb().beginTx();

            try
            {
                Stream<Node> roleStream = tx.findNodes( Label.label( "Role" ) ).stream().filter( ( roleNode ) ->
                                                                                                 {
                                                                                                     return this.rolesContainsNameProperty( roles, roleNode );
                                                                                                 } );
                roleStream.forEach( ( roleNode ) ->
                                    {
                                        try
                                        {
                                            String roleName = (String) roleNode.getProperty( "name" );
                                            Set<SecurityResourcePrivilege> rolePrivileges = resultsPerRole.computeIfAbsent( roleName, ( role ) ->
                                            {
                                                return new HashSet<>();
                                            } );
                                            roleNode.getRelationships( Direction.OUTGOING ).forEach( ( relToPriv ) ->
                                                                                                     {
                                                                                                         try
                                                                                                         {
                                                                                                             Node privilege = relToPriv.getEndNode();
                                                                                                             String grantOrDeny = relToPriv.getType().name();
                                                                                                             String action =
                                                                                                                     (String) privilege.getProperty( "action" );
                                                                                                             Node resourceNode = Iterables
                                                                                                                     .single( privilege.getRelationships(
                                                                                                                             Direction.OUTGOING,
                                                                                                                             RelationshipType.withName(
                                                                                                                                     "APPLIES_TO" ) ) )
                                                                                                                     .getEndNode();
                                                                                                             Node segmentNode = Iterables
                                                                                                                     .single( privilege.getRelationships(
                                                                                                                             Direction.OUTGOING,
                                                                                                                             RelationshipType.withName(
                                                                                                                                     "SCOPE" ) ) )
                                                                                                                     .getEndNode();
                                                                                                             Node dbNode = Iterables.single(
                                                                                                                     segmentNode.getRelationships(
                                                                                                                             Direction.OUTGOING,
                                                                                                                             RelationshipType.withName(
                                                                                                                                     "FOR" ) ) )
                                                                                                                                    .getEndNode();
                                                                                                             String dbName =
                                                                                                                     (String) dbNode.getProperty( "name" );
                                                                                                             Node qualifierNode = Iterables
                                                                                                                     .single( segmentNode.getRelationships(
                                                                                                                             Direction.OUTGOING,
                                                                                                                             RelationshipType.withName(
                                                                                                                                     "QUALIFIED" ) ) )
                                                                                                                     .getEndNode();
                                                                                                             SecurityResourcePrivilege.GrantOrDeny
                                                                                                                     privilegeType =
                                                                                                                     SecurityResourcePrivilege.GrantOrDeny
                                                                                                                             .fromRelType( grantOrDeny );
                                                                                                             SecurityResourcePrivilegeBuilder
                                                                                                                     securityResourcePrivilegeBuilder =
                                                                                                                     new SecurityResourcePrivilegeBuilder(
                                                                                                                             privilegeType, action );
                                                                                                             securityResourcePrivilegeBuilder
                                                                                                                     .forScope( qualifierNode )
                                                                                                                     .forSecurityResource( resourceNode );
                                                                                                             String dbLabel = Iterables
                                                                                                                     .single( dbNode.getLabels() ).name();

                                                                                                             switch ( dbLabel )
                                                                                                             {
                                                                                                             case "Database":
                                                                                                                 securityResourcePrivilegeBuilder
                                                                                                                         .forDatabaseName( dbName );
                                                                                                                 break;
                                                                                                             case "DatabaseAll":
                                                                                                                 securityResourcePrivilegeBuilder
                                                                                                                         .forDatabases();
                                                                                                                 break;
                                                                                                             case "DeletedDatabase":
                                                                                                                 return;
                                                                                                             default:
                                                                                                                 throw new IllegalStateException(
                                                                                                                         "Cannot have db node without either 'Database' or 'DatabaseAll' labels: " +
                                                                                                                         dbLabel );
                                                                                                             }

                                                                                                             rolePrivileges
                                                                                                                     .add( securityResourcePrivilegeBuilder
                                                                                                                                   .build() );
                                                                                                         }
                                                                                                         catch ( InvalidArgumentsException e )
                                                                                                         {
                                                                                                             throw new IllegalStateException(
                                                                                                                     "Failed to authorize", e );
                                                                                                         }
                                                                                                     } );
                                        }
                                        catch ( NotFoundException nfe )
                                        {
                                        }
                                    } );
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

            if ( tx != null )
            {
                tx.close();
            }
        }

        if ( !resultsPerRole.isEmpty() )
        {
            this.privilegeCache.putAll( resultsPerRole );
        }

        Set<SecurityResourcePrivilege> combined = new HashSet<>();

        for ( Set<SecurityResourcePrivilege> privs : resultsPerRole.values() )
        {
            combined.addAll( privs );
        }

        return combined;
    }

    /**
     * @param roles
     * @param roleNode
     * @return
     */
    private boolean rolesContainsNameProperty( Set<String> roles, Node roleNode )
    {
        try
        {
            return roles.contains( roleNode.getProperty( "name" ).toString() );
        }
        catch ( NotFoundException e )
        {
            return false;
        }
    }

    /**
     *
     */
    public void invalidatePrivilegeCache()
    {
        this.privilegeCache.invalidateAll();
    }
}
