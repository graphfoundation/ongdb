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

package org.neo4j.dbms;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.neo4j.dbms.database.SystemGraphDbmsModel;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.event.PropertyEntry;
import org.neo4j.graphdb.event.TransactionData;
import org.neo4j.internal.helpers.collection.Iterables;
import org.neo4j.kernel.database.DatabaseIdFactory;
import org.neo4j.kernel.database.NamedDatabaseId;

public class EnterpriseSystemGraphDbmsModel extends SystemGraphDbmsModel
{
    protected final Supplier<GraphDatabaseService> systemDatabase;

    public EnterpriseSystemGraphDbmsModel( Supplier<GraphDatabaseService> systemDatabase )
    {
        this.systemDatabase = systemDatabase;
    }

    Collection<NamedDatabaseId> updatedDatabases( TransactionData transactionData )
    {
        Transaction tx = ((GraphDatabaseService) this.systemDatabase.get()).beginTx();

        Collection updatedDatabases;
        try
        {
            Stream<NamedDatabaseId> changedDatabases = Iterables.stream( transactionData.assignedNodeProperties() ).map( PropertyEntry::entity ).map( ( n ) ->
                                                                                                                                                      {
                                                                                                                                                          return tx
                                                                                                                                                                  .getNodeById(
                                                                                                                                                                          n.getId() );
                                                                                                                                                      } )
                                                                .filter( ( n ) ->
                                                                         {
                                                                             return n.hasLabel( DATABASE_LABEL );
                                                                         } ).map( this::getDatabaseId ).distinct();
            Stream<NamedDatabaseId> deletedDatabases = Iterables.stream( transactionData.assignedLabels() ).filter( ( l ) ->
                                                                                                                    {
                                                                                                                        return l.label().equals(
                                                                                                                                DELETED_DATABASE_LABEL );
                                                                                                                    } ).map( ( e ) ->
                                                                                                                             {
                                                                                                                                 return tx.getNodeById(
                                                                                                                                         e.node().getId() );
                                                                                                                             } ).map( this::getDatabaseId );
            updatedDatabases = Stream.concat( changedDatabases, deletedDatabases ).collect( Collectors.toList() );
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

        return updatedDatabases;
    }

    Map<String,EnterpriseGraphDbState> getDatabaseStates()
    {
        Map<String,EnterpriseGraphDbState> databases = new HashMap();
        Transaction tx = ((GraphDatabaseService) this.systemDatabase.get()).beginTx();

        try
        {
            List<Node> deletedDatabases = (List) tx.findNodes( DELETED_DATABASE_LABEL ).stream().collect( Collectors.toList() );
            deletedDatabases.forEach( ( node ) ->
                                      {
                                          databases.put( this.getDatabaseName( node ),
                                                         new EnterpriseGraphDbState( this.getDatabaseId( node ), EnterpriseOperatorState.DROPPED ) );
                                      } );
            List<Node> existingDatabases = (List) tx.findNodes( DATABASE_LABEL ).stream().collect( Collectors.toList() );
            existingDatabases.forEach( ( node ) ->
                                       {
                                           databases.put( this.getDatabaseName( node ),
                                                          new EnterpriseGraphDbState( this.getDatabaseId( node ), this.getOnlineStatus( node ) ) );
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

        return databases;
    }

    Optional<OperatorState> getStatus( NamedDatabaseId namedDatabaseId )
    {
        Transaction tx = ((GraphDatabaseService) this.systemDatabase.get()).beginTx();

        Optional result;
        try
        {
            String uuid = namedDatabaseId.databaseId().uuid().toString();
            Node databaseNode = tx.findNode( DATABASE_LABEL, "uuid", uuid );
            Node deletedDatabaseNode = tx.findNode( DELETED_DATABASE_LABEL, "uuid", uuid );
            if ( databaseNode != null )
            {
                result = Optional.of( this.getOnlineStatus( databaseNode ) );
            }
            else if ( deletedDatabaseNode != null )
            {
                result = Optional.of( EnterpriseOperatorState.DROPPED );
            }
            else
            {
                result = Optional.empty();
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

        if ( tx != null )
        {
            tx.close();
        }

        return result;
    }

    private EnterpriseOperatorState getOnlineStatus( Node node )
    {
        String onlineStatus = (String) node.getProperty( "status" );

        switch ( onlineStatus )
        {
        case "online":
            return EnterpriseOperatorState.STARTED;
        case "offline":
            return EnterpriseOperatorState.STOPPED;
        default:
            throw new IllegalArgumentException( "Unsupported db status: " + onlineStatus );
        }
    }

    private NamedDatabaseId getDatabaseId( Node node )
    {
        String name = (String) node.getProperty( "name" );
        UUID uuid = UUID.fromString( (String) node.getProperty( "uuid" ) );
        return DatabaseIdFactory.from( name, uuid );
    }

    private String getDatabaseName( Node node )
    {
        return (String) node.getProperty( "name" );
    }
}
