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
package org.neo4j.io.pagecache.impl.muninn;

import org.neo4j.io.pagecache.context.CursorContext;

final class CursorFactory
{
    private final MuninnPagedFile pagedFile;
    private final long victimPage;

    /**
     * Cursor factory construction
     * @param pagedFile paged file for which cursor is created
     */
    CursorFactory( MuninnPagedFile pagedFile )
    {
        this.pagedFile = pagedFile;
        this.victimPage = pagedFile.pageCache.victimPage;
    }

    MuninnReadPageCursor takeReadCursor( long pageId, int pf_flags, CursorContext cursorContext )
    {
        MuninnReadPageCursor cursor = new MuninnReadPageCursor( victimPage, cursorContext );
        cursor.initialise( pagedFile, pageId, pf_flags );
        return cursor;
    }

    MuninnWritePageCursor takeWriteCursor( long pageId, int pf_flags, CursorContext cursorContext )
    {
        MuninnWritePageCursor cursor = new MuninnWritePageCursor( victimPage, cursorContext );
        cursor.initialise( pagedFile, pageId, pf_flags );
        return cursor;
    }
}
