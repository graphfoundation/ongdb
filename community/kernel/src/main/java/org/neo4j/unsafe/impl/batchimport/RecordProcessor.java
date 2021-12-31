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
 * Copyright (c) 2002-2020 "Neo4j,"
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
package org.neo4j.unsafe.impl.batchimport;

import java.io.IOException;
import java.io.UncheckedIOException;

import org.neo4j.io.IOUtils;
import org.neo4j.kernel.impl.store.record.AbstractBaseRecord;

/**
 * Generic processor of {@link AbstractBaseRecord} from a store.
 *
 * @param <T>
 */
public interface RecordProcessor<T extends AbstractBaseRecord> extends AutoCloseable
{
    /**
     * Processes an item.
     *
     * @return {@code true} if processing this item resulted in changes that should be updated back to the source.
     */
    boolean process( T item );

    void done();

    @Override
    void close();

    class Multiple<T extends AbstractBaseRecord> implements RecordProcessor<T>
    {
        private final RecordProcessor<T>[] processors;

        @SafeVarargs
        public Multiple( RecordProcessor<T>... processors )
        {
            this.processors = processors;
        }

        @Override
        public boolean process( T item )
        {
            boolean result = false;
            for ( RecordProcessor<T> processor : processors )
            {
                result |= processor.process( item );
            }
            return result;
        }

        @Override
        public void done()
        {
            for ( RecordProcessor<T> processor : processors )
            {
                processor.done();
            }
        }

        @Override
        public void close()
        {
            try
            {
                IOUtils.closeAll( processors );
            }
            catch ( IOException e )
            {
                throw new UncheckedIOException( e );
            }
        }
    }
}
