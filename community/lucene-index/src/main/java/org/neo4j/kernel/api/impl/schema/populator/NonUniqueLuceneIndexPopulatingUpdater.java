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
package org.neo4j.kernel.api.impl.schema.populator;

import org.neo4j.kernel.api.impl.schema.writer.LuceneIndexWriter;
import org.neo4j.kernel.impl.index.schema.IndexUpdateIgnoreStrategy;
import org.neo4j.storageengine.api.ValueIndexEntryUpdate;

/**
 * A {@link LuceneIndexPopulatingUpdater} used for non-unique Lucene schema indexes.
 */
public class NonUniqueLuceneIndexPopulatingUpdater extends LuceneIndexPopulatingUpdater
{

    public NonUniqueLuceneIndexPopulatingUpdater( LuceneIndexWriter writer, IndexUpdateIgnoreStrategy ignoreStrategy )
    {
        super( writer, ignoreStrategy );
    }

    @Override
    protected void added( ValueIndexEntryUpdate<?> update )
    {
    }

    @Override
    protected void changed( ValueIndexEntryUpdate<?> update )
    {
    }

    @Override
    protected void removed( ValueIndexEntryUpdate<?> update )
    {
    }

    @Override
    public void close()
    {
        //writer is not closed here as it's shared with the populator
    }
}
