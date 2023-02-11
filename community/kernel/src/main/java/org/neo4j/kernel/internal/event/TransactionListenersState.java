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
package org.neo4j.kernel.internal.event;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.graphdb.event.TransactionData;
import org.neo4j.graphdb.event.TransactionEventListener;

public class TransactionListenersState
{
    private final TransactionData txData;
    private final List<ListenerState<?>> states = new ArrayList<>();
    private Throwable error;

    TransactionListenersState( TransactionData txData )
    {
        this.txData = txData;
    }

    public void failed( Throwable error )
    {
        this.error = error;
    }

    public boolean isFailed()
    {
        return error != null;
    }

    public Throwable failure()
    {
        return error;
    }

    void addListenerState( TransactionEventListener<?> handler, Object state )
    {
        states.add( new ListenerState( handler, state ) );
    }

    TransactionData getTxData()
    {
        return txData;
    }

    public List<ListenerState<?>> getStates()
    {
        return states;
    }

    static class ListenerState<T>
    {
        private final TransactionEventListener<T> listener;
        private final T state;

        ListenerState( TransactionEventListener<T> listener, T state )
        {
            this.listener = listener;
            this.state = state;
        }

        public TransactionEventListener<T> getListener()
        {
            return listener;
        }

        public T getState()
        {
            return state;
        }
    }
}
