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
package org.neo4j.kernel.impl.index.schema;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import org.neo4j.common.EntityType;
import org.neo4j.configuration.Config;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexPrototype;
import org.neo4j.internal.schema.IndexType;
import org.neo4j.io.fs.FileSystemAbstraction;

import static org.neo4j.configuration.GraphDatabaseSettings.DEFAULT_DATABASE_NAME;
import static org.neo4j.internal.schema.IndexPrototype.forSchema;
import static org.neo4j.internal.schema.SchemaDescriptors.forAnyEntityTokens;
import static org.neo4j.internal.schema.SchemaDescriptors.forLabel;
import static org.neo4j.internal.schema.SchemaDescriptors.fulltext;
import static org.neo4j.kernel.impl.api.index.TestIndexProviderDescriptor.PROVIDER_DESCRIPTOR;

class PointIndexProviderTest extends IndexProviderTests
{
    private static final ProviderFactory factory =
            ( pageCache, fs, dir, monitors, collector, readOnlyChecker, databaseLayout ) ->
            {
                DatabaseIndexContext context = DatabaseIndexContext.builder( pageCache, fs, DEFAULT_DATABASE_NAME ).withMonitors( monitors )
                                                                   .withReadOnlyChecker( readOnlyChecker ).build();
                return new PointIndexProvider( context, dir, collector, Config.defaults() );
            };

    PointIndexProviderTest()
    {
        super( factory );
    }

    @Override
    void setupIndexFolders( FileSystemAbstraction fs ) throws IOException
    {
        Path nativeSchemaIndexStoreDirectory = newProvider().directoryStructure().rootDirectory();
        fs.mkdirs( nativeSchemaIndexStoreDirectory );
    }

    @Override
    IndexDescriptor descriptor()
    {
        return completeConfiguration( forSchema( forLabel( labelId, propId ), PROVIDER_DESCRIPTOR ).withIndexType( IndexType.POINT )
                                                                                                   .withName( "index" ).materialise( indexId ) );
    }

    @Override
    IndexDescriptor otherDescriptor()
    {
        return completeConfiguration( forSchema( forLabel( labelId, propId ), PROVIDER_DESCRIPTOR ).withIndexType( IndexType.POINT )
                                                                                                   .withName( "otherIndex" ).materialise( indexId + 1 ) );
    }

    @Override
    IndexPrototype validPrototype()
    {
        return forSchema( forLabel( labelId, propId ), PointIndexProvider.DESCRIPTOR ).withIndexType( IndexType.POINT ).withName( "index" );
    }

    @Override
    List<IndexPrototype> invalidPrototypes()
    {
        return List.of(
                forSchema( forAnyEntityTokens( EntityType.NODE ) ).withName( "unsupported" ),
                forSchema( fulltext( EntityType.NODE, new int[]{labelId}, new int[]{propId} ) ).withName( "unsupported" ),
                forSchema( forLabel( labelId, propId ) ).withIndexType( IndexType.BTREE ).withName( "unsupported" ),
                forSchema( forLabel( labelId, propId ) ).withIndexType( IndexType.RANGE ).withName( "unsupported" ),
                forSchema( forLabel( labelId, propId ) ).withIndexType( IndexType.TEXT ).withName( "unsupported" ),
                forSchema( forLabel( labelId, propId ), PROVIDER_DESCRIPTOR ).withIndexType( IndexType.LOOKUP ).withName( "unsupported" ) );
    }
}
