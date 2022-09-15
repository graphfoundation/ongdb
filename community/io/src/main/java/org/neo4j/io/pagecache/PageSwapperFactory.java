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
package org.neo4j.io.pagecache;

import java.io.IOException;
import java.nio.file.Path;

import org.neo4j.annotations.service.Service;
import org.neo4j.io.pagecache.impl.muninn.SwapperSet;

/**
 * Creates PageSwappers for the given files.
 * <p>
 * A PageSwapper is responsible for swapping file pages in and out of memory.
 * <p>
 * The PageSwapperFactory presumably knows about what file system to use.
 * <p>
 * To be able to create PageSwapper factory need to be configured first using appropriate configure call.
 * Note that this API is <em>only</em> intended to be used by a {@link PageCache} implementation.
 * It should never be used directly by user code.
 */
@Service
public interface PageSwapperFactory
{
    /**
     * Create a PageSwapper for the given file.
     *
     * @param path The file that the PageSwapper will move file pages in and
     * out of.
     * @param filePageSize The size of the pages in the file. Presumably a
     * multiple of some record size.
     * @param onEviction The PageSwapper will be told about evictions, and has
     * the responsibility of informing the PagedFile via this callback.
     * @param createIfNotExist When true, creates the given file if it does not exist, instead of throwing an
     * exception.
     * @param useDirectIO When true, direct io open open will gonna be used for underlying channel.
     * Option supported only on Linux with certain limitations.
     * @param preallocateStoreFiles when true, page cache swapper will try to preallocate requested store file on a set of supported platforms
     * @param ioController controller to report swapper io's
     * @param swappers set of already registered swappers
     * @return A working PageSwapper instance for the given file.
     * @throws IOException If the PageSwapper could not be created, for
     * instance if the underlying file could not be opened, or the given file does not exist and createIfNotExist is
     * false.
     */
    PageSwapper createPageSwapper( Path path, int filePageSize, PageEvictionCallback onEviction, boolean createIfNotExist, boolean useDirectIO,
            boolean preallocateStoreFiles, IOController ioController, SwapperSet swappers ) throws IOException;

}
