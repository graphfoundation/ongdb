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

import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.index.internal.gbptree.TreeNodeDynamicSize;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.test.RandomSupport;

import static org.neo4j.configuration.GraphDatabaseSettings.SchemaIndex.NATIVE_BTREE10;
import static org.neo4j.kernel.impl.index.schema.IndexEntryTestUtil.generateStringResultingInIndexEntrySize;

public class GenericStringLengthIndexValidationIT extends StringLengthIndexValidationIT
{
    @Override
    protected int getSingleKeySizeLimit()
    {
        return TreeNodeDynamicSize.keyValueSizeCapFromPageSize( PageCache.PAGE_SIZE );
    }

    @Override
    protected String getString( RandomSupport random, int keySize )
    {
        return generateStringResultingInIndexEntrySize( keySize );
    }

    @Override
    protected GraphDatabaseSettings.SchemaIndex getSchemaIndex()
    {
        return NATIVE_BTREE10;
    }

    @Override
    protected String expectedPopulationFailureCauseMessage( long indexId, long entityId )
    {
        return String.format( "Property value is too large to index, please see index documentation for limitations. " +
                              "Index: Index( id=%d, name='index_71616483', type='GENERAL BTREE', " +
                              "schema=(:LABEL_ONE {largeString}), indexProvider='native-btree-1.0' ), entity id: %d",
                              indexId, entityId );
    }
}
