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
package org.neo4j.kernel.api.impl.schema;

import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;

import java.util.function.Supplier;

import org.neo4j.configuration.Config;
import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.function.Factory;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.kernel.api.impl.index.IndexWriterConfigs;
import org.neo4j.kernel.api.impl.index.builder.AbstractLuceneIndexBuilder;
import org.neo4j.kernel.api.impl.index.partition.WritableIndexPartitionFactory;
import org.neo4j.kernel.api.impl.index.storage.PartitionedIndexStorage;
import org.neo4j.kernel.impl.api.index.IndexSamplingConfig;

/**
 * Helper builder class to simplify construction and instantiation of lucene schema indexes.
 * Most of the values already have most useful default value, that still can be overridden by corresponding
 * builder methods.
 *
 * @see LuceneSchemaIndex
 * @see AbstractLuceneIndexBuilder
 */
public class LuceneSchemaIndexBuilder extends AbstractLuceneIndexBuilder<LuceneSchemaIndexBuilder>
{
    private final IndexDescriptor descriptor;
    private IndexSamplingConfig samplingConfig;
    private Supplier<IndexWriterConfig> writerConfigFactory;

    private LuceneSchemaIndexBuilder( IndexDescriptor descriptor, DatabaseReadOnlyChecker readOnlyChecker, Config config )
    {
        super( readOnlyChecker );
        this.descriptor = descriptor;
        this.samplingConfig = new IndexSamplingConfig( config );
        this.writerConfigFactory = () -> IndexWriterConfigs.standard( config );
    }

    /**
     * Create new lucene schema index builder.
     *
     * @return new LuceneSchemaIndexBuilder
     * @param descriptor The descriptor for this index
     */
    public static LuceneSchemaIndexBuilder create( IndexDescriptor descriptor, DatabaseReadOnlyChecker readOnlyChecker, Config config )
    {
        return new LuceneSchemaIndexBuilder( descriptor, readOnlyChecker, config );
    }

    /**
     * Specify lucene schema index sampling config
     *
     * @param samplingConfig sampling config
     * @return index builder
     */
    public LuceneSchemaIndexBuilder withSamplingConfig( IndexSamplingConfig samplingConfig )
    {
        this.samplingConfig = samplingConfig;
        return this;
    }

    /**
     * Specify {@link Factory} of lucene {@link IndexWriterConfig} to create {@link IndexWriter}s.
     *
     * @param writerConfigFactory the supplier of writer configs
     * @return index builder
     */
    public LuceneSchemaIndexBuilder withWriterConfig( Supplier<IndexWriterConfig> writerConfigFactory )
    {
        this.writerConfigFactory = writerConfigFactory;
        return this;
    }

    /**
     * Build lucene schema index with specified configuration
     *
     * @return lucene schema index
     */
    public SchemaIndex build()
    {
        PartitionedIndexStorage storage = storageBuilder.build();
        return new WritableDatabaseSchemaIndex( storage, descriptor, samplingConfig, new WritableIndexPartitionFactory( writerConfigFactory ),
                readOnlyChecker );
    }
}
