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
package org.neo4j.graphdb.traversal;

import org.neo4j.graphdb.Path;
import org.neo4j.graphdb.PathExpander;

/**
 * Factory for initial state of {@link TraversalBranch}es in a traversal.
 *
 * @param <STATE> type of initial state to produce.
 */
public interface InitialBranchState<STATE>
{
    InitialBranchState<Object> NO_STATE = path -> null;
    InitialBranchState<Double> DOUBLE_ZERO = path -> 0d;

    /**
     * Returns an initial state for a {@link Path}. All paths entering this method
     * are start paths(es) of a traversal. State is passed down along traversal
     * branches as the traversal progresses and can be changed at any point by a
     * {@link PathExpander} to becomes the new state from that point in that branch
     * and downwards.
     *
     * @param path the start branch to return the initial state for.
     * @return an initial state for the traversal branch.
     */
    STATE initialState( Path path );

    /**
     * Creates a version of this state factory which produces reversed initial state,
     * used in bidirectional traversals.
     * @return an instance which produces reversed initial state.
     */
    default InitialBranchState<STATE> reverse()
    {
        return this;
    }

    /**
     * Branch state evaluator for an initial state.
     */
    class State<STATE> implements InitialBranchState<STATE>
    {
        private final STATE initialState;
        private final STATE reversedInitialState;

        public State( STATE initialState, STATE reversedInitialState )
        {
            this.initialState = initialState;
            this.reversedInitialState = reversedInitialState;
        }

        @Override
        public InitialBranchState<STATE> reverse()
        {
            return new State<>( reversedInitialState, initialState );
        }

        @Override
        public STATE initialState( Path path )
        {
            return initialState;
        }
    }
}
