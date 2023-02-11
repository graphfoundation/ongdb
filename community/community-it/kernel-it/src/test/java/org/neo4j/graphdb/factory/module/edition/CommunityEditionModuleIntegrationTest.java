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
package org.neo4j.graphdb.factory.module.edition;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import org.neo4j.common.DependencyResolver;
import org.neo4j.dbms.api.DatabaseManagementService;
import org.neo4j.internal.id.BufferedIdController;
import org.neo4j.internal.id.BufferingIdGeneratorFactory;
import org.neo4j.internal.id.IdController;
import org.neo4j.internal.id.IdGeneratorFactory;
import org.neo4j.io.layout.recordstorage.RecordDatabaseLayout;
import org.neo4j.kernel.impl.transaction.log.files.TransactionLogFilesHelper;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.test.TestDatabaseManagementServiceBuilder;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.Neo4jLayoutExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;

@Neo4jLayoutExtension
class CommunityEditionModuleIntegrationTest
{
    @Inject
    private TestDirectory testDirectory;
    @Inject
    private RecordDatabaseLayout databaseLayout;

    @Test
    void createBufferedIdComponentsByDefault()
    {
        DatabaseManagementService managementService = new TestDatabaseManagementServiceBuilder( testDirectory.homePath() ).build();
        GraphDatabaseAPI database = (GraphDatabaseAPI) managementService.database( DEFAULT_DATABASE_NAME );
        try
        {
            DependencyResolver dependencyResolver = database.getDependencyResolver();
            IdController idController = dependencyResolver.resolveDependency( IdController.class );
            IdGeneratorFactory idGeneratorFactory = dependencyResolver.resolveDependency( IdGeneratorFactory.class );

            assertThat( idController ).isInstanceOf( BufferedIdController.class );
            assertThat( idGeneratorFactory ).isInstanceOf( BufferingIdGeneratorFactory.class );
        }
        finally
        {
            managementService.shutdown();
        }
    }

    @Test
    void fileWatcherFileNameFilter()
    {
        Predicate<String> filter = CommunityEditionModule.communityFileWatcherFileNameFilter();
        assertFalse( filter.test( databaseLayout.metadataStore().getFileName().toString() ) );
        assertFalse( filter.test( databaseLayout.nodeStore().getFileName().toString() ) );
        assertTrue( filter.test( TransactionLogFilesHelper.DEFAULT_NAME + ".1" ) );
        assertTrue( filter.test( TransactionLogFilesHelper.CHECKPOINT_FILE_PREFIX + ".1" ) );
        assertTrue( filter.test( databaseLayout.labelScanStore().getFileName().toString() ) );
        assertTrue( filter.test( databaseLayout.relationshipTypeScanStore().getFileName().toString() ) );
    }

}
