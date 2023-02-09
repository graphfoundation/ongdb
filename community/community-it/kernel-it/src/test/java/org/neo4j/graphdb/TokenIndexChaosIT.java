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
package org.neo4j.graphdb;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.util.Random;
import java.util.Set;

import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.test.extension.DbmsController;
import org.neo4j.test.extension.DbmsExtension;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.RandomExtension;
import org.neo4j.test.RandomSupport;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;
import static java.util.concurrent.TimeUnit.MINUTES;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.neo4j.graphdb.IndexingTestUtil.assertOnlyDefaultTokenIndexesExists;
import static org.neo4j.internal.helpers.collection.Iterators.asSet;
import static org.neo4j.io.fs.FileUtils.writeAll;

/**
 * Tests functionality around missing or corrupted token indexes, and that
 * the database should repair (i.e. rebuild) that automatically and just work.
 */
@DbmsExtension
@ExtendWith( RandomExtension.class )
public class TokenIndexChaosIT
{
    @Inject
    private RandomSupport random;
    @Inject
    private GraphDatabaseAPI db;
    @Inject
    private FileSystemAbstraction fs;
    @Inject
    private DbmsController controller;

    @Test
    void shouldRebuildDeletedTokenIndexesOnStartup()
    {
        assertOnlyDefaultTokenIndexesExists( db );
        RelationshipType relType = RelationshipType.withName( "Sample" );
        Node node1, node2, node3;
        Relationship rel1, rel2;
        try ( Transaction tx = db.beginTx() )
        {
            node1 = tx.createNode( Labels.First );
            node2 = tx.createNode( Labels.First );
            node3 = tx.createNode( Labels.First );
            rel1 = node1.createRelationshipTo( node2, relType );
            rel2 = node1.createRelationshipTo( node3, relType );
            tx.commit();
        }
        // just to create a hole in the store
        deleteRelation( rel2 );
        deleteNode( node3 );

        controller.restartDbms( builder ->
        {
            try
            {
                fs.deleteFile( db.databaseLayout().labelScanStore() );
                fs.deleteFile( db.databaseLayout().relationshipTypeScanStore() );
            }
            catch ( IOException e )
            {
                throw new UncheckedIOException( e );
            }
            return builder;
        } );

        awaitIndexesOnline();
        assertOnlyDefaultTokenIndexesExists( db );
        assertEquals( asSet( node1, node2 ), getAllNodesWithLabel( Labels.First ) );
        assertEquals( asSet( rel1 ), getRelationships( relType ) );
    }

    @Test
    void shouldRebuildCorruptedTokenIndexesOnStartup()
    {
        assertOnlyDefaultTokenIndexesExists( db );
        RelationshipType relType = RelationshipType.withName( "Sample" );
        Node node1, node2;
        Relationship relation;
        try ( Transaction tx = db.beginTx() )
        {
            node1 = tx.createNode( Labels.First );
            node2 = tx.createNode( Labels.First );
            relation = node1.createRelationshipTo( node2, relType );
            tx.commit();
        }

        controller.restartDbms( builder ->
        {
            scrambleFile( db.databaseLayout().labelScanStore() );
            scrambleFile( db.databaseLayout().relationshipTypeScanStore() );
            return builder;
        } );

        awaitIndexesOnline();
        assertOnlyDefaultTokenIndexesExists( db );
        assertEquals( asSet( node1, node2 ), getAllNodesWithLabel( Labels.First ) );
        assertEquals( asSet( relation ), getRelationships( relType ) );
    }

    private Set<Node> getAllNodesWithLabel( Label label )
    {
        try ( Transaction tx = db.beginTx() )
        {
            return asSet( tx.findNodes( label ) );
        }
    }

    private Set<Relationship> getRelationships( RelationshipType relType )
    {
        try ( Transaction tx = db.beginTx() )
        {
            return asSet( tx.findRelationships( relType ) );
        }
    }

    private void scrambleFile( java.nio.file.Path path )
    {
        scrambleFile( random.random(), path );
    }

    private void deleteRelation( Relationship relationship )
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.getRelationshipById( relationship.getId() ).delete();
            tx.commit();
        }
    }

    private void deleteNode( Node node )
    {
        try ( Transaction tx = db.beginTx() )
        {
            tx.getNodeById( node.getId() ).delete();
            tx.commit();
        }
    }

    private enum Labels implements Label
    {
        First, Second, Third
    }

    public static void scrambleFile( Random random, Path file )
    {
        try ( FileChannel channel = FileChannel.open( file, READ, WRITE ) )
        {
            // The files will be small, so OK to allocate a buffer for the full size
            byte[] bytes = new byte[(int) channel.size()];
            putRandomBytes( random, bytes );
            ByteBuffer buffer = ByteBuffer.wrap( bytes );
            channel.position( 0 );
            writeAll( channel, buffer );
        }
        catch ( IOException e )
        {
            throw new UncheckedIOException( e );
        }
    }

    private static void putRandomBytes( Random random, byte[] bytes )
    {
        for ( int i = 0; i < bytes.length; i++ )
        {
            bytes[i] = (byte) random.nextInt();
        }
    }

    private void awaitIndexesOnline()
    {
        try ( Transaction transaction = db.beginTx() )
        {
            transaction.schema().awaitIndexesOnline( 2, MINUTES );
            transaction.commit();
        }
    }
}
