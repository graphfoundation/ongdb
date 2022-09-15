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
package org.neo4j.internal.collector;

import java.util.Map;

import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;

/**
 * Base class for managing state transitions of data-collector daemons.
 */
abstract class CollectorStateMachine<DATA>
{
    private enum State
    {
        IDLE, COLLECTING
    }

    static final class Status
    {
        final String message;

        Status( String message )
        {
            this.message = message;
        }
    }

    static final class Result
    {
        final boolean success;
        final String message;

        Result( boolean success, String message )
        {
            this.success = success;
            this.message = message;
        }
    }

    static Result success( String message )
    {
        return new Result( true, message );
    }

    static Result error( String message )
    {
        return new Result( false, message );
    }

    private State state;
    private long collectionId;
    private final boolean canGetDataWhileCollecting;

    CollectorStateMachine( boolean canGetDataWhileCollecting )
    {
        this.canGetDataWhileCollecting = canGetDataWhileCollecting;
        state = State.IDLE;
    }

    public synchronized Status status()
    {
        State state = this.state;
        switch ( state )
        {
        case IDLE:
            return new Status( "idle" );
        case COLLECTING:
            return new Status( "collecting" );
        default:
            throw new IllegalStateException( "Unknown state " + state );
        }
    }

    public synchronized Result collect( Map<String,Object> config ) throws InvalidArgumentsException
    {
        switch ( state )
        {
        case IDLE:
            state = State.COLLECTING;
            collectionId++;
            return doCollect( config, collectionId );
        case COLLECTING:
            return success( "Collection is already ongoing." );
        default:
            throw new IllegalStateException( "Unknown state " + state );
        }
    }

    public synchronized Result stop( long collectionIdToStop )
    {
        switch ( state )
        {
        case IDLE:
            return success( "Collector is idle, no collection ongoing." );
        case COLLECTING:
            if ( this.collectionId <= collectionIdToStop )
            {
                state = State.IDLE;
                return doStop();
            }
            return success( String.format( "Collection event %d has already been stopped, a new collection event is ongoing.", collectionIdToStop ) );
        default:
            throw new IllegalStateException( "Unknown state " + state );
        }
    }

    public synchronized Result clear()
    {
        switch ( state )
        {
        case IDLE:
            return doClear();
        case COLLECTING:
            return error( "Collected data cannot be cleared while collecting." );
        default:
            throw new IllegalStateException( "Unknown state " + state );
        }
    }

    public synchronized DATA getData()
    {
        switch ( state )
        {
        case IDLE:
            return doGetData();
        case COLLECTING:
            if ( canGetDataWhileCollecting )
            {
                return doGetData();
            }
            throw new IllegalStateException( "Collector is still collecting." );
        default:
            throw new IllegalStateException( "Unknown state " + state );
        }
    }

    protected abstract Result doCollect( Map<String,Object> config, long collectionId ) throws InvalidArgumentsException;
    protected abstract Result doStop();
    protected abstract Result doClear();
    protected abstract DATA doGetData();
}
