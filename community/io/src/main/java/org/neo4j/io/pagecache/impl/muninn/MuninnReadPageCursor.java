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
package org.neo4j.io.pagecache.impl.muninn;

import java.io.IOException;

import org.neo4j.io.pagecache.PageSwapper;
import org.neo4j.io.pagecache.context.CursorContext;

final class MuninnReadPageCursor extends MuninnPageCursor
{
    private long lockStamp;

    MuninnReadPageCursor( long victimPage, CursorContext cursorContext )
    {
        super( victimPage, cursorContext );
    }

    @Override
    protected void unpinCurrentPage()
    {
        if ( pinnedPageRef != 0 )
        {
            pinEvent.done();
        }
        lockStamp = 0; // make sure not to accidentally keep a lock state around
        clearPageCursorState();
    }

    @Override
    public boolean next() throws IOException
    {
        unpinCurrentPage();
        long lastPageId = assertPagedFileStillMappedAndGetIdOfLastPage();
        if ( nextPageId > lastPageId || nextPageId < 0 )
        {
            storeCurrentPageId( UNBOUND_PAGE_ID );
            return false;
        }
        storeCurrentPageId( nextPageId );
        nextPageId++;
        long filePageId = loadPlainCurrentPageId();
        pinEvent = tracer.beginPin( false, filePageId, swapper );
        pin( filePageId );
        verifyContext();
        return true;
    }

    @Override
    protected boolean tryLockPage( long pageRef )
    {
        lockStamp = PageList.tryOptimisticReadLock( pageRef );
        return true;
    }

    @Override
    protected void unlockPage( long pageRef )
    {
    }

    @Override
    protected void pinCursorToPage( long pageRef, long filePageId, PageSwapper swapper )
    {
        reset( pageRef );
        if ( updateUsage )
        {
            PageList.incrementUsage( pageRef );
        }
    }

    @Override
    protected void convertPageFaultLock( long pageRef )
    {
        lockStamp = PageList.unlockExclusive( pageRef );
    }

    @Override
    public boolean shouldRetry() throws IOException
    {
        MuninnReadPageCursor cursor = this;
        do
        {
            long pageRef = cursor.pinnedPageRef;
            if ( pageRef != 0 && !PageList.validateReadLock( pageRef, cursor.lockStamp ) )
            {
                assertPagedFileStillMappedAndGetIdOfLastPage();
                startRetryLinkedChain();
                return true;
            }
            cursor = (MuninnReadPageCursor) cursor.linkedCursor;
        }
        while ( cursor != null );
        return false;
    }

    private void startRetryLinkedChain() throws IOException
    {
        MuninnReadPageCursor cursor = this;
        do
        {
            long pageRef = cursor.pinnedPageRef;
            if ( pageRef != 0 )
            {
                cursor.startRetry( pageRef );
            }
            cursor = (MuninnReadPageCursor) cursor.linkedCursor;
        }
        while ( cursor != null );
    }

    private void startRetry( long pageRef ) throws IOException
    {
        setOffset( 0 );
        checkAndClearBoundsFlag();
        clearCursorException();
        lockStamp = PageList.tryOptimisticReadLock( pageRef );
        // The page might have been evicted while we held the optimistic
        // read lock, so we need to check with page.pin that this is still
        // the page we're actually interested in:
        if ( !PageList.isBoundTo( pageRef, pagedFile.swapperId, loadPlainCurrentPageId() ) )
        {
            // This is no longer the page we're interested in, so we have
            // to redo the pinning.
            // This might in turn lead to a new optimistic lock on a
            // different page if someone else has taken the page fault for
            // us. If nobody has done that, we'll take the page fault
            // ourselves, and in that case we'll end up with first an exclusive
            // lock during the faulting, and then an optimistic read lock once the
            // fault itself is over.
            // First, forget about this page in case pin() throws and the cursor
            // is closed, or in case we have PF_NO_FAULT and the page is no longer
            // in memory.
            clearPageReference();
            // Then try pin again.
            pin( loadPlainCurrentPageId() );
        }
    }

    @Override
    public void putByte( byte value )
    {
        throw new IllegalStateException( "Cannot write to read-locked page" );
    }

    @Override
    public void putLong( long value )
    {
        throw new IllegalStateException( "Cannot write to read-locked page" );
    }

    @Override
    public void putInt( int value )
    {
        throw new IllegalStateException( "Cannot write to read-locked page" );
    }

    @Override
    public void putBytes( byte[] data, int arrayOffset, int length )
    {
        throw new IllegalStateException( "Cannot write to read-locked page" );
    }

    @Override
    public void putShort( short value )
    {
        throw new IllegalStateException( "Cannot write to read-locked page" );
    }

    @Override
    public void shiftBytes( int sourceStart, int length, int shift )
    {
        throw new IllegalStateException( "Cannot write to read-locked page" );
    }

    @Override
    public void zapPage()
    {
        throw new IllegalStateException( "Cannot write to read-locked page" );
    }
}
