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

package org.neo4j.dbms.database;

import java.util.Optional;
import java.util.function.BiConsumer;

import org.neo4j.dbms.api.DatabaseExistsException;
import org.neo4j.dbms.api.DatabaseLimitReachedException;
import org.neo4j.dbms.api.DatabaseManagementException;
import org.neo4j.dbms.api.DatabaseNotFoundException;
import org.neo4j.graphdb.factory.module.GlobalModule;
import org.neo4j.graphdb.factory.module.edition.AbstractEditionModule;
import org.neo4j.kernel.database.Database;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.enterprise.configuration.EnterpriseEditionSettings;

import static org.neo4j.configuration.GraphDatabaseSettings.SYSTEM_DATABASE_NAME;

/**
 * community/kernel/src/main/java/org/neo4j/dbms/db/
 *
 * @param <DB>
 */
public abstract class MultiDatabaseManager<DB extends DatabaseContext> extends AbstractDatabaseManager<DB>
{
    private final long maximumNumberOfDatabases;
    private volatile boolean databaseManagerStarted;

    public MultiDatabaseManager( GlobalModule globalModule, AbstractEditionModule edition )
    {
        this( globalModule, edition, false );
    }

    MultiDatabaseManager( GlobalModule globalModule, AbstractEditionModule edition, boolean manageDatabasesOnStartAndStop )
    {
        super( globalModule, edition, manageDatabasesOnStartAndStop );
        this.maximumNumberOfDatabases = (Long) globalModule.getGlobalConfig().get( EnterpriseEditionSettings.maxNumberOfDatabases );
    }

    @Override
    public DB createDatabase( NamedDatabaseId namedDatabaseId ) throws DatabaseManagementException
    {
        if ( this.databaseMap.get( namedDatabaseId ) != null )
        {
            throw new DatabaseExistsException( String.format( "Database with name `%s` already exists.", namedDatabaseId.name() ) );
        }
        else if ( (long) this.databaseMap.size() >= this.maximumNumberOfDatabases )
        {
            throw new DatabaseLimitReachedException(
                    String.format( "Reached maximum number of active databases. Unable to create new db `%s`.", namedDatabaseId.name() ) );
        }
        else
        {
            DB databaseContext;
            try
            {
                this.log.info( "Creating '%s' db.", new Object[]{namedDatabaseId.name()} );
                databaseContext = this.createDatabaseContext( namedDatabaseId );
            }
            catch ( Exception e )
            {
                throw new DatabaseManagementException( String.format( "An error occurred! Unable to create new db `%s`.", namedDatabaseId.name() ),
                                                       e );
            }

            this.databaseMap.put( namedDatabaseId, databaseContext );
            this.databaseIdRepository().cache( namedDatabaseId );
            return databaseContext;
        }
    }

    @Override
    public Optional<DB> getDatabaseContext( NamedDatabaseId namedDatabaseId )
    {
        return Optional.ofNullable( this.databaseMap.get( namedDatabaseId ) );
    }

    @Override
    public void dropDatabase( NamedDatabaseId namedDatabaseId ) throws DatabaseNotFoundException
    {
        if ( SYSTEM_DATABASE_NAME.equals( namedDatabaseId.name() ) )
        {
            throw new DatabaseManagementException( "System db can't be dropped." );
        }
        else
        {
            this.forNamedDatabase( namedDatabaseId, this::dropDatabase );
        }
    }

    @Override
    public void stopDatabase( NamedDatabaseId namedDatabaseId ) throws DatabaseNotFoundException
    {
        this.forNamedDatabase( namedDatabaseId, this::stopDatabase );
    }

    @Override
    public void startDatabase( NamedDatabaseId namedDatabaseId ) throws DatabaseNotFoundException
    {
        this.forNamedDatabase( namedDatabaseId, this::startDatabase );
    }

    protected final void forNamedDatabase( NamedDatabaseId namedDatabaseId, BiConsumer<NamedDatabaseId,DB> consumer )
    {
        this.requireDatabaseManagerHasStarted( namedDatabaseId );
        DB ctx = this.databaseMap.get( namedDatabaseId );
        if ( ctx == null )
        {
            throw new DatabaseNotFoundException( String.format( "Database with name `%s` not found.", namedDatabaseId.name() ) );
        }
        else
        {
            consumer.accept( namedDatabaseId, ctx );
        }
    }

    @Override
    public void start() throws Exception
    {
        if ( !this.databaseManagerStarted )
        {
            this.databaseManagerStarted = true;
            super.start();
        }
    }

    @Override
    public void stop() throws Exception
    {
        if ( this.databaseManagerStarted )
        {
            super.stop();
            this.databaseManagerStarted = false;
        }
    }

    @Override
    public final void shutdown()
    {
        this.databaseMap.clear();
    }

    /**
     * With DB context passed.
     *
     * @param namedDatabaseId
     * @param context
     */
    protected void dropDatabase( NamedDatabaseId namedDatabaseId, DB context )
    {
        try
        {
            this.log.info( "Drop '%s' db.", new Object[]{namedDatabaseId.name()} );
            Database database = context.database();
            database.drop();
            this.databaseIdRepository().invalidate( namedDatabaseId );
            this.databaseMap.remove( namedDatabaseId );
        }
        catch ( Throwable e )
        {
            throw new DatabaseManagementException( String.format( "An error occurred! Unable to drop db with name `%s`.", namedDatabaseId.name() ),
                                                   e );
        }
    }

    /**
     * @param namedDatabaseId
     */
    private void requireDatabaseManagerHasStarted( NamedDatabaseId namedDatabaseId )
    {
        if ( !this.databaseManagerStarted )
        {
            throw new IllegalStateException(
                    String.format( "The db manager must be started in order to operate on db `%s`", namedDatabaseId.name() ) );
        }
    }
}
