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
package org.neo4j.kernel.impl.storemigration.legacy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.neo4j.common.EntityType;
import org.neo4j.configuration.Config;
import org.neo4j.internal.id.DefaultIdGeneratorFactory;
import org.neo4j.internal.id.SchemaIdType;
import org.neo4j.internal.recordstorage.RecordCursorTypes;
import org.neo4j.internal.schema.ConstraintDescriptor;
import org.neo4j.internal.schema.FulltextSchemaDescriptor;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.IndexProviderDescriptor;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.internal.schema.SchemaRule;
import org.neo4j.internal.schema.constraints.ConstraintDescriptorFactory;
import org.neo4j.io.fs.EphemeralFileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.io.pagecache.context.CursorContext;
import org.neo4j.kernel.impl.store.DynamicRecordAllocator;
import org.neo4j.kernel.impl.store.allocator.ReusableRecordsCompositeAllocator;
import org.neo4j.kernel.impl.store.format.standard.StandardV3_4;
import org.neo4j.kernel.impl.store.record.DynamicRecord;
import org.neo4j.logging.NullLogProvider;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.pagecache.EphemeralPageCacheExtension;
import org.neo4j.test.utils.TestDirectory;

import static java.nio.ByteBuffer.wrap;
import static java.util.Collections.singleton;
import static java.util.stream.IntStream.range;
import static org.eclipse.collections.api.factory.Sets.immutable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker.writable;
import static org.neo4j.index.internal.gbptree.RecoveryCleanupWorkCollector.immediate;
import static org.neo4j.internal.helpers.collection.Iterables.asCollection;
import static org.neo4j.internal.schema.SchemaDescriptors.forLabel;
import static org.neo4j.internal.schema.SchemaDescriptors.fulltext;
import static org.neo4j.io.pagecache.context.CursorContext.NULL;
import static org.neo4j.kernel.impl.store.AbstractDynamicStore.allocateRecordsFromBytes;
import static org.neo4j.kernel.impl.store.record.RecordLoad.CHECK;
import static org.neo4j.memory.EmptyMemoryTracker.INSTANCE;

@EphemeralPageCacheExtension
class SchemaStore35Test
{
    private static final String PROVIDER_KEY = "quantum-dex";
    private static final String PROVIDER_VERSION = "25.0";
    private static final IndexProviderDescriptor PROVIDER = new IndexProviderDescriptor( PROVIDER_KEY, PROVIDER_VERSION );

    @Inject
    private PageCache pageCache;
    @Inject
    private EphemeralFileSystemAbstraction fs;
    @Inject
    private TestDirectory testDirectory;

    private SchemaStore35 store;
    private SchemaStore35StoreCursors storeCursors;

    @BeforeEach
    void before()
    {
        Config config = Config.defaults();
        DefaultIdGeneratorFactory idGeneratorFactory = new DefaultIdGeneratorFactory( fs, immediate(), DEFAULT_DATABASE_NAME );
        NullLogProvider logProvider = NullLogProvider.getInstance();
        store = new SchemaStore35( testDirectory.file( "schema35" ), testDirectory.file( "schema35.db.id" ), config, SchemaIdType.SCHEMA,
                idGeneratorFactory, pageCache, logProvider, StandardV3_4.RECORD_FORMATS, writable(), DEFAULT_DATABASE_NAME, immutable.empty() );
        store.initialise( true, NULL );
        storeCursors = new SchemaStore35StoreCursors( store, NULL );
    }

    @AfterEach
    void after()
    {
        storeCursors.close();
        store.close();
    }

    @Test
    void storeAndLoadSchemaRule() throws Exception
    {
        // GIVEN
        long id = store.nextId( NULL );
        IndexDescriptor indexRule = IndexPrototype.forSchema( forLabel( 1, 4 ), PROVIDER ).withName( "index_" + id ).materialise( id );

        // WHEN
        IndexDescriptor readIndexRule = (IndexDescriptor) SchemaRuleSerialization35.deserialize(
                indexRule.getId(), wrap( SchemaRuleSerialization35.serialize( indexRule, INSTANCE ) ) );

        // THEN
        assertEquals( indexRule.getId(), readIndexRule.getId() );
        assertEquals( indexRule.schema(), readIndexRule.schema() );
        assertEquals( indexRule, readIndexRule );
        assertEquals( indexRule.getIndexProvider(), readIndexRule.getIndexProvider() );
    }

    @Test
    void storeAndLoadCompositeSchemaRule() throws Exception
    {
        // GIVEN
        int[] propertyIds = {4, 5, 6, 7};
        long id = store.nextId( NULL );
        IndexDescriptor indexRule = IndexPrototype.forSchema( forLabel( 2, propertyIds ), PROVIDER ).withName( "index_" + id ).materialise( id );

        // WHEN
        IndexDescriptor readIndexRule = (IndexDescriptor) SchemaRuleSerialization35.deserialize(
                indexRule.getId(), wrap( SchemaRuleSerialization35.serialize( indexRule, INSTANCE ) ) );

        // THEN
        assertEquals( indexRule.getId(), readIndexRule.getId() );
        assertEquals( indexRule.schema(), readIndexRule.schema() );
        assertEquals( indexRule, readIndexRule );
        assertEquals( indexRule.getIndexProvider(), readIndexRule.getIndexProvider() );
    }

    @Test
    void storeAndLoadMultiTokenSchemaRule() throws Exception
    {
        // GIVEN
        int[] propertyIds = {4, 5, 6, 7};
        int[] entityTokens = {2, 3, 4};
        long id = store.nextId( NULL );
        IndexDescriptor indexRule = IndexPrototype.forSchema( fulltext( EntityType.RELATIONSHIP, entityTokens, propertyIds ), PROVIDER )
                .withName( "index_" + id ).withIndexType( IndexType.FULLTEXT ).materialise( id );

        // WHEN
        IndexDescriptor readIndexRule =
                (IndexDescriptor) SchemaRuleSerialization35.deserialize( indexRule.getId(),
                        wrap( SchemaRuleSerialization35.serialize( indexRule, INSTANCE ) ) );

        // THEN
        assertEquals( indexRule.getId(), readIndexRule.getId() );
        assertEquals( indexRule.schema(), readIndexRule.schema() );
        assertEquals( indexRule, readIndexRule );
        assertEquals( indexRule.getIndexProvider(), readIndexRule.getIndexProvider() );
    }

    @Test
    void storeAndLoad_Big_CompositeSchemaRule() throws Exception
    {
        // GIVEN
        long id = store.nextId( NULL );
        IndexDescriptor indexRule =
                IndexPrototype.forSchema( forLabel( 2, range( 1, 200 ).toArray() ), PROVIDER ).withName( "index_" + id ).materialise( id );

        // WHEN
        IndexDescriptor readIndexRule = (IndexDescriptor) SchemaRuleSerialization35.deserialize(
                indexRule.getId(), wrap( SchemaRuleSerialization35.serialize( indexRule, INSTANCE ) ) );

        // THEN
        assertEquals( indexRule.getId(), readIndexRule.getId() );
        assertEquals( indexRule.schema(), readIndexRule.schema() );
        assertEquals( indexRule, readIndexRule );
        assertEquals( indexRule.getIndexProvider(), readIndexRule.getIndexProvider() );
    }

    @Test
    void storeAndLoad_Big_CompositeMultiTokenSchemaRule() throws Exception
    {
        // GIVEN
        FulltextSchemaDescriptor schema = fulltext( EntityType.RELATIONSHIP, range( 1, 200 ).toArray(), range( 1, 200 ).toArray() );
        long id = store.nextId( NULL );
        IndexDescriptor indexRule = IndexPrototype.forSchema( schema, PROVIDER )
                .withName( "index_" + id ).withIndexType( IndexType.FULLTEXT ).materialise( id );

        // WHEN
        IndexDescriptor readIndexRule = (IndexDescriptor) SchemaRuleSerialization35.deserialize( indexRule.getId(),
                wrap( SchemaRuleSerialization35.serialize( indexRule, INSTANCE ) ) );

        // THEN
        assertEquals( indexRule.getId(), readIndexRule.getId() );
        assertEquals( indexRule.schema(), readIndexRule.schema() );
        assertEquals( indexRule, readIndexRule );
        assertEquals( indexRule.getIndexProvider(), readIndexRule.getIndexProvider() );
    }

    @Test
    void storeAndLoadAllRules()
    {
        // GIVEN
        long indexId = store.nextId( NULL );
        long constraintId = store.nextId( NULL );
        Collection<SchemaRule> rules = Arrays.asList(
                uniqueIndexRule( indexId, constraintId, 2, 5, 3 ),
                constraintUniqueRule( constraintId, indexId, 2, 5, 3 ),
                indexRule( store.nextId( NULL ), 0, 5 ),
                indexRule( store.nextId( NULL ), 1, 6, 10, 99 ),
                constraintExistsRule( store.nextId( NULL ), 5, 1 )
        );

        for ( SchemaRule rule : rules )
        {
            storeRule( rule );
        }

        // WHEN
        SchemaStorage35 storage35 = new SchemaStorage35( store );
        Collection<SchemaRule> readRules = asCollection( storage35.getAll( storeCursors ) );

        // THEN
        assertEquals( rules, readRules );
    }

    @Test
    void loadAllRulesIgnoringMalformed()
    {
        long indexId = store.nextId( NULL );
        long constraintId = store.nextId( NULL );
        var rules = Arrays.asList(
                uniqueIndexRule( indexId, constraintId, 2, 5, 3 ),
                constraintUniqueRule( constraintId, indexId, 2, 5, 3 ),
                indexRule( store.nextId( NULL ), 0, 5 ),
                indexRule( store.nextId( NULL ), 1, 6, 10, 99 ),
                constraintExistsRule( store.nextId( NULL ), 5, 1 )
        );

        for ( int i = 0; i < rules.size(); i++ )
        {
            var rule = rules.get( i );
            if ( i % 2 != 0 )
            {
                storeRule( rule );
            }
            else
            {
                storeBrokenRule( rule );
            }
        }

        var storage35 = new SchemaStorage35( store );
        var readRules = asCollection( storage35.getAllIgnoreMalformed( storeCursors ) );

        assertEquals( 2, readRules.size() );
        assertTrue( readRules.contains( rules.get( 1 ) ) );
        assertTrue( readRules.contains( rules.get( 3 ) ) );
    }

    private void storeBrokenRule( SchemaRule rule )
    {
        Collection<DynamicRecord> records = allocateFrom( rule, NULL );
        try ( var cursor = storeCursors.writeCursor( RecordCursorTypes.SCHEMA_CURSOR ) )
        {
            for ( DynamicRecord record : records )
            {
                record.setData( new byte[]{1, 3, 4} );
                store.updateRecord( record, cursor, NULL, storeCursors );
            }
        }
    }

    private void storeRule( SchemaRule rule )
    {
        Collection<DynamicRecord> records = allocateFrom( rule, NULL );
        try ( var cursor = storeCursors.writeCursor( RecordCursorTypes.SCHEMA_CURSOR ) )
        {
            for ( DynamicRecord record : records )
            {
                store.updateRecord( record, cursor, NULL, storeCursors );
            }
        }
    }

    private static IndexDescriptor indexRule( long ruleId, int labelId, int... propertyIds )
    {
        return IndexPrototype.forSchema( forLabel( labelId, propertyIds ), PROVIDER ).withName( "index_" + ruleId ).materialise( ruleId );
    }

    private static IndexDescriptor uniqueIndexRule( long ruleId, long owningConstraint, int labelId, int... propertyIds )
    {
        return IndexPrototype.uniqueForSchema( forLabel( labelId, propertyIds ), PROVIDER )
                .withName( "constraint_" + ruleId ).materialise( ruleId ).withOwningConstraintId( owningConstraint );
    }

    private static ConstraintDescriptor constraintUniqueRule( long ruleId, long ownedIndexId, int labelId, int... propertyIds )
    {
        return ConstraintDescriptorFactory.uniqueForLabel( labelId, propertyIds ).withId( ruleId )
                .withName( "constraint_" + ruleId ).withOwnedIndexId( ownedIndexId );
    }

    private static ConstraintDescriptor constraintExistsRule( long ruleId, int labelId, int... propertyIds )
    {
        return ConstraintDescriptorFactory.existsForLabel( labelId, propertyIds ).withName( "constraint_" + ruleId ).withId( ruleId );
    }

    public List<DynamicRecord> allocateFrom( SchemaRule rule, CursorContext cursorContext )
    {
        List<DynamicRecord> records = new ArrayList<>();
        DynamicRecord record = store.newRecord();
        var cursor = storeCursors.readCursor( RecordCursorTypes.SCHEMA_CURSOR );
        store.getRecordByCursor( rule.getId(), record, CHECK, cursor );
        DynamicRecordAllocator recordAllocator = new ReusableRecordsCompositeAllocator( singleton( record ), store );
        allocateRecordsFromBytes( records, SchemaRuleSerialization35.serialize( rule, INSTANCE ), recordAllocator, cursorContext, INSTANCE );
        return records;
    }
}
