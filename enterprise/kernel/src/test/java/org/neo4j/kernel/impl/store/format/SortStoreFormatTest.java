/*
 * Copyright (c) 2018-2020 "Graph Foundation"
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
package org.neo4j.kernel.impl.store.format;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.RuleChain;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.stream.Collectors;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.factory.EnterpriseGraphDatabaseFactory;
import org.neo4j.graphdb.factory.GraphDatabaseSettings;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.configuration.Settings;
import org.neo4j.kernel.impl.store.format.standard.StandardV3_0;
import org.neo4j.kernel.impl.store.format.standard.StandardV3_2;
import org.neo4j.kernel.impl.store.format.standard.StandardV3_4;
import org.neo4j.kernel.impl.store.format.standard.StandardV3_6;
import org.neo4j.logging.LogProvider;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.test.rule.PageCacheRule;
import org.neo4j.test.rule.TestDirectory;
import org.neo4j.test.rule.fs.DefaultFileSystemRule;

public class SortStoreFormatTest
{
    private static final LogProvider LOG = NullLogProvider.getInstance();

    private static final PageCacheRule pageCacheRule = new PageCacheRule();
    private static final DefaultFileSystemRule fileSystemRule = new DefaultFileSystemRule();
    private static final TestDirectory testDir = TestDirectory.testDirectory( fileSystemRule );
    @ClassRule
    public static final RuleChain ruleChain = RuleChain.outerRule( fileSystemRule ).around( pageCacheRule ).around( testDir );

    public static final String CREATE_QUERY = readQuery();
    public static final String DB_INDEXES = "CALL db.indexes()";

    @Test
    public void sortMigrate34To36()
    {
        sortMigrate( new StandardV3_4() );
    }

    @Test
    public void sortMigrate32To36()
    {
        sortMigrate( new StandardV3_2() );
    }

    @Test
    public void sortMigrate30To36()
    {
        sortMigrate( new StandardV3_0() );
    }

    public void sortMigrate( RecordFormats from )
    {
        RecordFormats to = new StandardV3_6();

        DatabaseLayout databaseLayout = testDir.databaseLayout( baseDirName( to, from ) );
        GraphDatabaseService database = getGraphDatabaseService( databaseLayout.databaseDirectory(), from.storeVersion() );

        database.execute( "CREATE INDEX ON :Person(name)" );
        database.execute( "CREATE INDEX ON :Person(born)" );
        database.execute( "CALL db.index.fulltext.createNodeIndex(\"testIndex\",[\"Person\"],[\"name\"])");
        database.execute( CREATE_QUERY );

        Result indexesResult = database.execute( DB_INDEXES );
        Assert.assertEquals( 3, indexesResult.stream().count());

        indexesResult = database.execute( DB_INDEXES );
        Assert.assertTrue( "Unable to find fulltext 'testIndex'.", indexesResult.stream().anyMatch( m -> !m.get( "indexName" ).equals( "Unnamed index" ) ) );

        // Close and shutdown
        indexesResult.close();
        database.shutdown();

        // Migrate Database
        database = getGraphDatabaseService( databaseLayout.databaseDirectory(), to.storeVersion() );

        // Ensure the db has been started up with the right number of indexes already created
        indexesResult = database.execute( DB_INDEXES );
        Assert.assertEquals( 3, indexesResult.stream().count());

        indexesResult = database.execute( DB_INDEXES );
        Assert.assertTrue( "Unable to find fulltext 'testIndex'.", indexesResult.stream().anyMatch( m -> !m.get( "indexName" ).equals( "Unnamed index" ) ) );

        indexesResult = database.execute( DB_INDEXES );
        Map<String,Object> testIndexMap = indexesResult.stream().filter( m -> m.get( "indexName" ).equals( "testIndex" ) ).findFirst().get();
        Assert.assertTrue( "The fulltext 'testIndex' is missing 'sortProperties' after migration", testIndexMap.containsKey( "sortProperties" ));
        Assert.assertTrue( ((Map<String,Object>) testIndexMap.get( "sortProperties" )).isEmpty() );

        // Try dropping a fulltext index
        database.execute( "CALL db.index.fulltext.drop(\"testIndex\")" );

        indexesResult = database.execute( DB_INDEXES );
        Assert.assertEquals( 2, indexesResult.stream().count());

        // Add a FT index with sort
        database.execute( "CALL db.index.fulltext.createNodeIndex(\"sortIndex\",[\"Person\"],[\"name\"], {}, {name: \"STRING\"})");

        indexesResult = database.execute( DB_INDEXES );
        Map<String,Object> sortIndex = indexesResult.stream().filter( m -> m.get( "indexName" ).equals( "sortIndex" ) ).findFirst().get();
        Assert.assertTrue( ((Map<String,Object>) sortIndex.get( "sortProperties" )).keySet().contains( "name" ) );

        indexesResult.close();
        database.shutdown();
    }

    private static String baseDirName( RecordFormats toFormat, RecordFormats fromFormat )
    {
        return fromFormat.storeVersion() + toFormat.storeVersion();
    }

    protected static GraphDatabaseService getGraphDatabaseService( File db, String storeVersion )
    {
        return new EnterpriseGraphDatabaseFactory().newEmbeddedDatabaseBuilder( db )
                                                   .setConfig( GraphDatabaseSettings.allow_upgrade, Settings.TRUE )
                                                   .setConfig( GraphDatabaseSettings.record_format, storeVersion ).newGraphDatabase();
    }

    private static String readQuery()
    {
        InputStream in = SortStoreFormatTest.class.getClassLoader().getResourceAsStream( "store-migration-data.txt" );
        String result = new BufferedReader( new InputStreamReader( in ) ).lines().collect( Collectors.joining( "\n" ) );
        try
        {
            in.close();
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }
        return result;
    }

}
