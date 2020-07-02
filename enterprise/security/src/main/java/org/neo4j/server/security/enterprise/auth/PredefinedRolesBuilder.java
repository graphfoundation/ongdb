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

import org.apache.shiro.authz.SimpleRole;
import org.apache.shiro.authz.permission.WildcardPermission;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PredefinedRolesBuilder implements RolesBuilder
{
    public static final WildcardPermission SYSTEM = new WildcardPermission( "system:*" );
    public static final WildcardPermission SCHEMA = new WildcardPermission( "database:*:*:schema" );
    public static final WildcardPermission TOKEN = new WildcardPermission( "database:*:*:token" );
    public static final WildcardPermission WRITE = new WildcardPermission( "database:*:write:graph" );
    public static final WildcardPermission READ = new WildcardPermission( "database:*:read:graph" );
    public static final WildcardPermission ACCESS = new WildcardPermission( "database:*:access:graph" );
    public static final Map<String,SimpleRole> roles;
    private static final Map<String,SimpleRole> innerRoles = staticBuildRoles();

    static
    {
        roles = Collections.unmodifiableMap( innerRoles );
    }

    private static Map<String,SimpleRole> staticBuildRoles()
    {
        Map<String,SimpleRole> roles = new ConcurrentHashMap( 4 );
        SimpleRole admin = new SimpleRole( "admin" );
        admin.add( SYSTEM );
        admin.add( SCHEMA );
        admin.add( TOKEN );
        admin.add( WRITE );
        admin.add( READ );
        admin.add( ACCESS );
        roles.put( "admin", admin );
        SimpleRole architect = new SimpleRole( "architect" );
        architect.add( SCHEMA );
        architect.add( TOKEN );
        architect.add( WRITE );
        architect.add( READ );
        architect.add( ACCESS );
        roles.put( "architect", architect );
        SimpleRole publisher = new SimpleRole( "publisher" );
        publisher.add( TOKEN );
        publisher.add( WRITE );
        publisher.add( READ );
        publisher.add( ACCESS );
        roles.put( "publisher", publisher );
        SimpleRole editor = new SimpleRole( "editor" );
        editor.add( WRITE );
        editor.add( READ );
        editor.add( ACCESS );
        roles.put( "editor", editor );
        SimpleRole reader = new SimpleRole( "reader" );
        reader.add( READ );
        reader.add( ACCESS );
        roles.put( "reader", reader );
        return roles;
    }

    public Map<String,SimpleRole> buildRoles()
    {
        return roles;
    }
}
