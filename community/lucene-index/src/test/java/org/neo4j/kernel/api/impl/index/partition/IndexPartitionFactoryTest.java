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
package org.neo4j.kernel.api.impl.index.partition;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.store.Directory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.configuration.Config;
import org.neo4j.kernel.api.impl.index.IndexWriterConfigs;
import org.neo4j.kernel.api.impl.index.SearcherReference;
import org.neo4j.kernel.api.impl.index.storage.DirectoryFactory;
import org.neo4j.test.extension.Inject;
import org.neo4j.test.extension.testdirectory.TestDirectoryExtension;
import org.neo4j.test.utils.TestDirectory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestDirectoryExtension
class IndexPartitionFactoryTest
{
    @Inject
    private TestDirectory testDirectory;
    private Directory directory;

    @BeforeEach
    void setUp() throws IOException
    {
        directory = DirectoryFactory.PERSISTENT.open( testDirectory.homePath() );
    }

    @Test
    void createReadOnlyPartition() throws Exception
    {
        prepareIndex();
        try ( AbstractIndexPartition indexPartition =
                new ReadOnlyIndexPartitionFactory().createPartition( testDirectory.homePath(), directory ) )
        {
            assertThrows(UnsupportedOperationException.class, indexPartition::getIndexWriter );
        }
    }

    @Test
    void createWritablePartition() throws Exception
    {
        try ( AbstractIndexPartition indexPartition =
                      new WritableIndexPartitionFactory( () -> IndexWriterConfigs.standard( Config.defaults() ) )
                              .createPartition( testDirectory.homePath(), directory ) )
        {

            try ( IndexWriter indexWriter = indexPartition.getIndexWriter() )
            {
                indexWriter.addDocument( new Document() );
                indexWriter.commit();
                indexPartition.maybeRefreshBlocking();
                try ( SearcherReference searcher = indexPartition.acquireSearcher() )
                {
                    assertEquals( 1, searcher.getIndexSearcher().getIndexReader().numDocs(), "We should be able to see newly added document " );
                }
            }
        }
    }

    private void prepareIndex() throws IOException
    {
        Path location = testDirectory.homePath();
        try ( AbstractIndexPartition ignored =
                      new WritableIndexPartitionFactory( () -> IndexWriterConfigs.standard( Config.defaults() ) )
                              .createPartition( location, DirectoryFactory.PERSISTENT.open( location ) ) )
        {
            // empty
        }
    }
}
