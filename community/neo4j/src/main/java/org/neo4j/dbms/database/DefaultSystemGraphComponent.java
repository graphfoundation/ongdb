/*
 * Copyright (c) "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB.
 *
 * ONgDB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Copyright (c) "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.dbms.database;

import java.time.Clock;
import java.time.ZonedDateTime;
import java.util.UUID;
import java.util.function.Function;

import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.kernel.database.NormalizedDatabaseName;
import org.neo4j.graphdb.ConstraintViolationException;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.graphdb.Transaction;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

import static org.neo4j.configuration.GraphDatabaseSettings.SYSTEM_DATABASE_NAME;
import static org.neo4j.dbms.database.TopologyGraphDbmsModel.DATABASE_CREATED_AT_PROPERTY;
import static org.neo4j.dbms.database.TopologyGraphDbmsModel.DATABASE_NAME_LABEL;
import static org.neo4j.dbms.database.TopologyGraphDbmsModel.DATABASE_DEFAULT_PROPERTY;
import static org.neo4j.dbms.database.TopologyGraphDbmsModel.DATABASE_LABEL;
import static org.neo4j.dbms.database.TopologyGraphDbmsModel.DATABASE_NAME_PROPERTY;
import static org.neo4j.dbms.database.TopologyGraphDbmsModel.DATABASE_STARTED_AT_PROPERTY;
import static org.neo4j.dbms.database.TopologyGraphDbmsModel.DATABASE_STATUS_PROPERTY;
import static org.neo4j.dbms.database.TopologyGraphDbmsModel.DATABASE_UUID_PROPERTY;
import static org.neo4j.dbms.database.TopologyGraphDbmsModel.DELETED_DATABASE_LABEL;
import static org.neo4j.dbms.database.TopologyGraphDbmsModel.NAME_PROPERTY;
import static org.neo4j.dbms.database.TopologyGraphDbmsModel.PRIMARY_PROPERTY;
import static org.neo4j.dbms.database.TopologyGraphDbmsModel.TARGETS_RELATIONSHIP;
import static org.neo4j.kernel.database.NamedDatabaseId.NAMED_SYSTEM_DATABASE_ID;

/**
 * This is the community component for databases.
 * Each database is represented by a node with label :Database or :DeletedDatabase
 * and properties for the database name, status, uuid, creation time, store version and more.
 * There is also one node with label :DatabaseDefault and one with label :DatabaseAll,
 * that represent the default database and all databases, respectively.
 */
public class DefaultSystemGraphComponent extends AbstractSystemGraphComponent
{
    private final NormalizedDatabaseName defaultDbName;
    private final Clock clock;

    public DefaultSystemGraphComponent( Config config, Clock clock )
    {
        super( config );
        this.defaultDbName = new NormalizedDatabaseName( config.get( GraphDatabaseSettings.default_database ) );
        this.clock = clock;
    }

    @Override
    public String componentName()
    {
        return "multi-database";
    }

    @Override
    public Status detect( Transaction tx )
    {
        return hasDatabaseNode( tx ) ? (hasSystemDatabaseNode( tx ) ? Status.CURRENT : Status.UNSUPPORTED) : Status.UNINITIALIZED;
    }

    @Override
    protected void initializeSystemGraphConstraints( Transaction tx )
    {
        initializeSystemGraphConstraint( tx, DATABASE_NAME_LABEL, NAME_PROPERTY );
        initializeSystemGraphConstraint( tx, DATABASE_LABEL, DATABASE_NAME_PROPERTY );
    }

    @Override
    public void initializeSystemGraphModel( GraphDatabaseService system ) throws InvalidArgumentsException
    {
        newDefaultDb( system );
        newDb( system, new NormalizedDatabaseName( SYSTEM_DATABASE_NAME ), false, NAMED_SYSTEM_DATABASE_ID.databaseId().uuid() );
    }

    /**
     * Only community edition (which does not support multiple online databases) should stop the old default database when the default database is changed.
     */
    protected void maybeStopDatabase( Node oldDatabaseNode )
    {
        oldDatabaseNode.setProperty( DATABASE_STATUS_PROPERTY, TopologyGraphDbmsModel.DatabaseStatus.offline.name() );
    }

    /**
     * If the system graph exists, we make sure the default database is set correctly based on the config file settings
     * (and in community we also make sure a default database change causes the old default to be stopped)
     */
    @Override
    protected void verifySystemGraph( GraphDatabaseService system ) throws Exception
    {
        updateDefaultDatabase( system );
    }

    @Override
    public void upgradeToCurrent( GraphDatabaseService system )
    {
    }

    private static boolean hasDatabaseNode( Transaction tx )
    {
        try ( ResourceIterator<Node> nodes = tx.findNodes( DATABASE_LABEL ) )
        {
            return nodes.hasNext();
        }
    }

    private static boolean hasSystemDatabaseNode( Transaction tx )
    {
        try ( ResourceIterator<Node> nodes = tx.findNodes( DATABASE_LABEL, DATABASE_NAME_PROPERTY, SYSTEM_DATABASE_NAME ) )
        {
            return nodes.hasNext();
        }
    }

    private void updateDefaultDatabase( GraphDatabaseService system ) throws InvalidArgumentsException
    {
        boolean defaultFound;

        try ( Transaction tx = system.beginTx() )
        {
            // A function we can apply to both :Database and :DeletedDatabase searches
            Function<ResourceIterator<Node>,Boolean> unsetOldNode = nodes ->
            {
                boolean correctDefaultFound = false;
                while ( nodes.hasNext() )
                {
                    Node oldDb = nodes.next();
                    if ( oldDb.getProperty( DATABASE_NAME_PROPERTY ).equals( defaultDbName.name() ) )
                    {
                        correctDefaultFound = true;
                    }
                    else
                    {
                        oldDb.setProperty( DATABASE_DEFAULT_PROPERTY, false );
                        maybeStopDatabase( oldDb );
                    }
                }
                return correctDefaultFound;
            };
            // First find current default, and if it does not have the name defined as default, unset it
            try ( ResourceIterator<Node> nodes = tx.findNodes( DATABASE_LABEL, DATABASE_DEFAULT_PROPERTY, true ) )
            {
                defaultFound = unsetOldNode.apply( nodes );
            }

            // If the current default is deleted, unset it, but do not record that we found a valid default
            try ( ResourceIterator<Node> nodes = tx.findNodes( DELETED_DATABASE_LABEL, DATABASE_DEFAULT_PROPERTY, true ) )
            {
                unsetOldNode.apply( nodes );
            }

            // If the old default was not the correct one, find the correct one and set the default flag
            if ( !defaultFound )
            {
                Node defaultDb = tx.findNode( DATABASE_LABEL, DATABASE_NAME_PROPERTY, defaultDbName.name() );
                if ( defaultDb != null )
                {
                    defaultDb.setProperty( DATABASE_DEFAULT_PROPERTY, true );
                    defaultDb.setProperty( DATABASE_STATUS_PROPERTY, TopologyGraphDbmsModel.DatabaseStatus.online.name() );
                    defaultFound = true;
                }
            }
            tx.commit();
        }

        // If no database exists with the default name, create it
        if ( !defaultFound )
        {
            newDb( system, defaultDbName, true, UUID.randomUUID() );
        }
    }

    private void newDefaultDb( GraphDatabaseService system ) throws InvalidArgumentsException
    {
        newDb( system, defaultDbName, true, UUID.randomUUID() );
    }

    private void newDb( GraphDatabaseService system, NormalizedDatabaseName databaseName, boolean defaultDb, UUID uuid ) throws InvalidArgumentsException
    {
        try ( var tx = system.beginTx() )
        {
            createDatabaseNode( tx, databaseName.name(), defaultDb, uuid, ZonedDateTime.ofInstant( clock.instant(), clock.getZone() ) );
            tx.commit();
        }
        catch ( ConstraintViolationException e )
        {
            throw new InvalidArgumentsException( "The specified database '" + databaseName + "' already exists." );
        }
    }

    protected Node createDatabaseNode( Transaction tx, String databaseName, boolean defaultDb, UUID uuid, ZonedDateTime now )
    {
        var databaseNode = tx.createNode( DATABASE_LABEL );
        databaseNode.setProperty( DATABASE_NAME_PROPERTY, databaseName );
        databaseNode.setProperty( DATABASE_UUID_PROPERTY, uuid.toString() );
        databaseNode.setProperty( DATABASE_STATUS_PROPERTY, TopologyGraphDbmsModel.DatabaseStatus.online.name() );
        databaseNode.setProperty( DATABASE_DEFAULT_PROPERTY, defaultDb );
        databaseNode.setProperty( DATABASE_CREATED_AT_PROPERTY, now );
        databaseNode.setProperty( DATABASE_STARTED_AT_PROPERTY, now );

        Node nameNode = tx.createNode( DATABASE_NAME_LABEL );
        nameNode.setProperty( NAME_PROPERTY, databaseName );
        nameNode.setProperty( PRIMARY_PROPERTY, true );
        nameNode.createRelationshipTo( databaseNode, TARGETS_RELATIONSHIP );
        return databaseNode;
    }
}
