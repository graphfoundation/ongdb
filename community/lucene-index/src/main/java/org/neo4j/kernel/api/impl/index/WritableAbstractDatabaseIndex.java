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
package org.neo4j.kernel.api.impl.index;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import org.neo4j.dbms.database.readonly.DatabaseReadOnlyChecker;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.kernel.api.impl.index.partition.AbstractIndexPartition;
import org.neo4j.kernel.api.impl.schema.writer.LuceneIndexWriter;
import org.neo4j.kernel.api.index.ValueIndexReader;

/**
 * Writable lucene index representation that wraps provided index implementation and
 * allow read only operations only on top of it.
 * @param <INDEX> - particular index implementation
 */
public class WritableAbstractDatabaseIndex<INDEX extends AbstractLuceneIndex<READER>, READER extends ValueIndexReader>
        extends AbstractDatabaseIndex<INDEX,READER>
{
    // lock used to guard commits and close of lucene indexes from separate threads
    protected final ReentrantLock commitCloseLock = new ReentrantLock();
    private final DatabaseReadOnlyChecker readOnlyChecker;

    public WritableAbstractDatabaseIndex( INDEX luceneIndex, DatabaseReadOnlyChecker readOnlyChecker )
    {
        super( luceneIndex );
        this.readOnlyChecker = readOnlyChecker;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void create() throws IOException
    {
        luceneIndex.create();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isReadOnly()
    {
        return readOnlyChecker.isReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void drop()
    {
        commitCloseLock.lock();
        try
        {
            luceneIndex.drop();
        }
        finally
        {
            commitCloseLock.unlock();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void flush() throws IOException
    {
        commitCloseLock.lock();
        try
        {
            commitLockedFlush();
        }
        finally
        {
            commitCloseLock.unlock();
        }
    }

    protected void commitLockedFlush() throws IOException
    {
        luceneIndex.flush( false );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws IOException
    {
        commitCloseLock.lock();
        try
        {
            commitLockedClose();
        }
        finally
        {
            commitCloseLock.unlock();
        }
    }

    protected void commitLockedClose() throws IOException
    {
        luceneIndex.close();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceIterator<Path> snapshot() throws IOException
    {
        commitCloseLock.lock();
        try
        {
            return luceneIndex.snapshot();
        }
        finally
        {
            commitCloseLock.unlock();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void maybeRefreshBlocking() throws IOException
    {
        luceneIndex.maybeRefreshBlocking();
    }

    /**
     * Add new partition to the index. Must only be called by a single thread at a time.
     *
     * @return newly created partition
     * @throws IOException
     */
    public AbstractIndexPartition addNewPartition() throws IOException
    {
        return luceneIndex.addNewPartition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void markAsOnline() throws IOException
    {
        commitCloseLock.lock();
        try
        {
            luceneIndex.markAsOnline();
        }
        finally
        {
            commitCloseLock.unlock();
        }
    }

    @Override
    public LuceneIndexWriter getIndexWriter()
    {
        return luceneIndex.getIndexWriter( this );
    }

    public static boolean hasSinglePartition( List<AbstractIndexPartition> partitions )
    {
        return AbstractLuceneIndex.hasSinglePartition( partitions );
    }

    public static AbstractIndexPartition getFirstPartition( List<AbstractIndexPartition> partitions )
    {
        return AbstractLuceneIndex.getFirstPartition( partitions );
    }
}
