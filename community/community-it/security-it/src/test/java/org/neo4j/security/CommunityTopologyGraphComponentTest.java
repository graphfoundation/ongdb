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
package org.neo4j.security;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.Clock;

import org.neo4j.configuration.Config;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.dbms.database.DefaultSystemGraphComponent;
import org.neo4j.dbms.database.SystemGraphComponent;
import org.neo4j.dbms.systemgraph.CommunityTopologyGraphComponent;
import org.neo4j.function.ThrowingConsumer;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.Transaction;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.configuration.GraphDatabaseSettings.SYSTEM_DATABASE_NAME;
import static org.neo4j.dbms.systemgraph.TopologyGraphDbmsModel.DATABASE_ACCESS_PROPERTY;
import static org.neo4j.dbms.systemgraph.TopologyGraphDbmsModel.DATABASE_LABEL;
import static org.neo4j.dbms.systemgraph.TopologyGraphDbmsModel.DATABASE_NAME_LABEL;
import static org.neo4j.dbms.systemgraph.TopologyGraphDbmsModel.DATABASE_NAME_PROPERTY;
import static org.neo4j.dbms.systemgraph.TopologyGraphDbmsModel.DatabaseAccess.READ_WRITE;
import static org.neo4j.dbms.systemgraph.TopologyGraphDbmsModel.PRIMARY_PROPERTY;
import static org.neo4j.dbms.systemgraph.TopologyGraphDbmsModel.TARGETS_RELATIONSHIP;

@TestDirectoryExtension
@TestInstance( PER_CLASS )
class CommunityTopologyGraphComponentTest
{
    @Inject
    private static TestDirectory directory;

    private static DatabaseManagementService dbms;
    private static GraphDatabaseService system;

    @BeforeAll
    static void setup()
    {
        dbms = new TestDatabaseManagementServiceBuilder( directory.homePath() ).impermanent().noOpSystemGraphInitializer().build();
        system = dbms.database( SYSTEM_DATABASE_NAME );
    }

    @BeforeEach
    void clear() throws Exception
    {
        inTx( tx -> tx.getAllNodes().stream().forEach( n ->
        {
            n.getRelationships().forEach( Relationship::delete );
            n.delete();
        } ) );
    }

    @AfterAll
    static void tearDown()
    {
        dbms.shutdown();
    }

    @Test
    void shouldDetectUninitialized() throws Exception
    {
        initializeSystem();
        CommunityTopologyGraphComponent component = new CommunityTopologyGraphComponent( Config.defaults(), NullLogProvider.getInstance() );
        inTx( tx ->
        {
            SystemGraphComponent.Status status = component.detect( tx );
            assertThat( status ).isEqualTo( SystemGraphComponent.Status.UNINITIALIZED );
        } );
    }

    @Test
    void shouldDetectStatusForLatest() throws Exception
    {
        // GIVEN
        initializeSystem();
        CommunityTopologyGraphComponent component = new CommunityTopologyGraphComponent( Config.defaults(), NullLogProvider.getInstance() );
        component.initializeSystemGraph( system, true );

        // WHEN .. THEN
        inTx( tx ->
        {
            SystemGraphComponent.Status status = component.detect( tx );
            assertThat( status ).isEqualTo( SystemGraphComponent.Status.CURRENT );
        } );
    }

    @Test
    void shouldSetAccessToReadWriteOnInitialization() throws Exception
    {
        // GIVEN
        initializeSystem();
        CommunityTopologyGraphComponent component = new CommunityTopologyGraphComponent( Config.defaults(), NullLogProvider.getInstance() );

        // WHEN
        component.initializeSystemGraph( system, true );

        // THEN
        inTx( tx ->
        {
            // Default db
            Node defaultDbNode = tx.findNode( DATABASE_LABEL, DATABASE_NAME_PROPERTY, DEFAULT_DATABASE_NAME );
            String defaultDbAccess = defaultDbNode.getProperty( DATABASE_ACCESS_PROPERTY ).toString();
            assertThat( defaultDbAccess ).isEqualTo( READ_WRITE.toString() );

            // System db
            Node systemDbNode = tx.findNode( DATABASE_LABEL, DATABASE_NAME_PROPERTY, SYSTEM_DATABASE_NAME );
            String systemDbAccess = systemDbNode.getProperty( DATABASE_ACCESS_PROPERTY ).toString();
            assertThat( systemDbAccess ).isEqualTo( READ_WRITE.toString() );
        } );
    }

    @Test
    void shouldSetAccessToReadWriteOnUpgrade() throws Exception
    {
        // GIVEN
        initializeSystem();

        // Simulate that we are upgrading from an earlier version with more databases
        inTx( tx ->
        {
           Node dbNode = tx.createNode( DATABASE_LABEL );
           dbNode.setProperty( DATABASE_NAME_PROPERTY, "custom" );
        } );

        CommunityTopologyGraphComponent component = new CommunityTopologyGraphComponent( Config.defaults(), NullLogProvider.getInstance() );

        // WHEN
        component.initializeSystemGraph( system, true );

        // THEN
        inTx( tx ->
        {
            // Custom db
            Node dbNode = tx.findNode( DATABASE_LABEL, DATABASE_NAME_PROPERTY, "custom" );
            String dbAccess = dbNode.getProperty( DATABASE_ACCESS_PROPERTY ).toString();
            assertThat( dbAccess ).isEqualTo( READ_WRITE.toString() );

            // Default db
            Node defaultDbNode = tx.findNode( DATABASE_LABEL, DATABASE_NAME_PROPERTY, DEFAULT_DATABASE_NAME );
            String defaultDbAccess = defaultDbNode.getProperty( DATABASE_ACCESS_PROPERTY ).toString();
            assertThat( defaultDbAccess ).isEqualTo( READ_WRITE.toString() );

            // System db
            Node systemDbNode = tx.findNode( DATABASE_LABEL, DATABASE_NAME_PROPERTY, SYSTEM_DATABASE_NAME );
            String systemDbAccess = systemDbNode.getProperty( DATABASE_ACCESS_PROPERTY ).toString();
            assertThat( systemDbAccess ).isEqualTo( READ_WRITE.toString() );
        } );
    }

    @Test
    void shouldHavePrimaryAliasOnInitialization() throws Exception
    {
        // GIVEN
        initializeSystem();
        CommunityTopologyGraphComponent component = new CommunityTopologyGraphComponent( Config.defaults(), NullLogProvider.getInstance() );

        // WHEN
        component.initializeSystemGraph( system, true );

        // THEN
        inTx( tx ->
              {
                  // Default db
                  shouldHavePrimaryAlias(DEFAULT_DATABASE_NAME, tx);

                  // System db
                  shouldHavePrimaryAlias(SYSTEM_DATABASE_NAME, tx);
              } );
    }

    @Test
    void shouldHavePrimaryAliasOnUpgrade() throws Exception
    {
        // GIVEN
        initializeSystem();

        // Simulate that we are upgrading from an earlier version with more databases
        inTx( tx ->
              {
                  Node dbNode = tx.createNode( DATABASE_LABEL );
                  dbNode.setProperty( DATABASE_NAME_PROPERTY, "custom" );
              } );

        CommunityTopologyGraphComponent component = new CommunityTopologyGraphComponent( Config.defaults(), NullLogProvider.getInstance() );

        // WHEN
        component.initializeSystemGraph( system, true );

        // THEN
        inTx( tx ->
              {
                  // Custom db
                  shouldHavePrimaryAlias( "custom", tx );

                  // Default db
                  shouldHavePrimaryAlias( DEFAULT_DATABASE_NAME, tx );

                  // System db
                  shouldHavePrimaryAlias( SYSTEM_DATABASE_NAME, tx );
              } );
    }

    private static void shouldHavePrimaryAlias( String dbName, Transaction tx )
    {
        Node dbAlias =
                tx.findNode( DATABASE_NAME_LABEL, DATABASE_NAME_PROPERTY, dbName );
        assertThat( dbAlias.getProperty( PRIMARY_PROPERTY ) ).isEqualTo( true );
        dbAlias.getRelationships( TARGETS_RELATIONSHIP )
               .forEach( target ->
                                 assertThat( target.getEndNode().hasLabel( DATABASE_LABEL ) ).isTrue()
               );
    }

    private static void initializeSystem() throws Exception
    {
        var systemGraphComponent = new DefaultSystemGraphComponent( Config.defaults(), Clock.systemUTC() );
        systemGraphComponent.initializeSystemGraph( system, true );
    }

    private static void inTx( ThrowingConsumer<Transaction,Exception> consumer ) throws Exception
    {
        try ( Transaction tx = system.beginTx() )
        {
            consumer.accept( tx );
            tx.commit();
        }
    }
}
