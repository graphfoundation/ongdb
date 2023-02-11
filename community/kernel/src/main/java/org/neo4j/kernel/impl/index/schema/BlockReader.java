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
package org.neo4j.kernel.impl.index.schema;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.index.internal.gbptree.Layout;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.fs.ReadAheadChannel;
import org.neo4j.io.fs.StoreChannel;
import org.neo4j.io.memory.ScopedBuffer;
import org.neo4j.io.pagecache.PageCursor;

/**
 * Hands out {@link BlockEntryReader} for each Block in file in sequential order. The resulting readers have their own {@link StoreChannel} that they read
 * from and they need to be closed separately, this class does not take responsibility for created readers. This also mean it's safe to close this
 * {@link BlockReader} even if there are still child readers alive.
 */
public class BlockReader<KEY,VALUE> implements Closeable
{
    private final StoreChannel channel;
    private final FileSystemAbstraction fs;
    private final Path path;
    private final Layout<KEY,VALUE> layout;
    private final boolean produceNewKeyAndValueInstances;

    BlockReader( FileSystemAbstraction fs, Path path, Layout<KEY,VALUE> layout, boolean produceNewKeyAndValueInstances ) throws IOException
    {
        this.fs = fs;
        this.path = path;
        this.layout = layout;
        this.produceNewKeyAndValueInstances = produceNewKeyAndValueInstances;
        this.channel = fs.read( path );
    }

    BlockEntryReader<KEY,VALUE> nextBlock( ScopedBuffer blockBuffer ) throws IOException
    {
        long position = channel.position();
        if ( position >= channel.size() )
        {
            return null;
        }
        StoreChannel blockChannel = fs.read( path );
        blockChannel.position( position );
        PageCursor pageCursor = new ReadableChannelPageCursor( new ReadAheadChannel<>( blockChannel, blockBuffer.getBuffer() ) );
        BlockEntryReader<KEY,VALUE> blockEntryReader = new BlockEntryReader<>( pageCursor, layout, produceNewKeyAndValueInstances );
        long blockSize = blockEntryReader.blockSize();
        channel.position( position + blockSize );
        return blockEntryReader;
    }

    @Override
    public void close() throws IOException
    {
        channel.close();
    }
}
