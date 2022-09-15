/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.kernel.impl.api;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.EphemeralFileSystemExtension;
import org.neo4j.test.extension.Inject;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.graphdb.Label.label;

@ExtendWith( EphemeralFileSystemExtension.class )
class LabelRecoveryTest
{
    @Inject
    private EphemeralFileSystemAbstraction filesystem;
    private GraphDatabaseService database;
    private DatabaseManagementService managementService;

    @AfterEach
    void tearDown()
    {
        if ( managementService != null )
        {
            managementService.shutdown();
        }
    }

    /**
     * Reading a node command might leave a node record which referred to
     * labels in one or more dynamic records as marked as heavy even if that
     * node already had references to dynamic records, changed in a transaction,
     * but had no labels on that node changed within that same transaction.
     * Now defensively only marks as heavy if there were one or more dynamic
     * records provided when providing the record object with the label field
     * value. This would give the opportunity to load the dynamic records the
     * next time that record would be ensured heavy.
     */
    @Test
    void shouldRecoverNodeWithDynamicLabelRecords()
    {
        // GIVEN
        managementService = new TestDatabaseManagementServiceBuilder().setFileSystem( filesystem ).impermanent().build();
        database = managementService.database( DEFAULT_DATABASE_NAME );
        Node node;
        Label[] labels = new Label[] { label( "a" ),
                label( "b" ),
                label( "c" ),
                label( "d" ),
                label( "e" ),
                label( "f" ),
                label( "g" ),
                label( "h" ),
                label( "i" ),
                label( "j" ),
                label( "k" ) };
        try ( Transaction tx = database.beginTx() )
        {
            node = tx.createNode( labels );
            tx.commit();
        }

        // WHEN
        try ( Transaction tx = database.beginTx() )
        {
            node = tx.getNodeById( node.getId() );
            node.setProperty( "prop", "value" );
            tx.commit();
        }
        EphemeralFileSystemAbstraction snapshot = filesystem.snapshot();
        managementService.shutdown();
        managementService = new TestDatabaseManagementServiceBuilder().setFileSystem( snapshot ).impermanent().build();
        database = managementService.database( DEFAULT_DATABASE_NAME );

        // THEN
        try ( Transaction tx = database.beginTx() )
        {
            node = tx.getNodeById( node.getId() );
            for ( Label label : labels )
            {
                assertTrue( node.hasLabel( label ) );
            }
        }
    }
}
