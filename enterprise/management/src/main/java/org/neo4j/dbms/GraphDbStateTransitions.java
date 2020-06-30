/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.dbms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.kernel.database.NamedDatabaseId;

final class GraphDbStateTransitions
{
    private final Map<Pair<EnterpriseOperatorState,EnterpriseOperatorState>,GraphDbStateTransitions.TransitionFunction[]> transitionsTable;

    private GraphDbStateTransitions( Map<Pair<EnterpriseOperatorState,EnterpriseOperatorState>,GraphDbStateTransitions.TransitionFunction[]> transitionsTable )
    {
        this.transitionsTable = transitionsTable;
    }

    public static GraphDbStateTransitions.TransitionsBuilder builder()
    {
        return new GraphDbStateTransitions.TransitionsBuilder();
    }

    GraphDbStateTransitions.TransitionLookup fromCurrent( EnterpriseGraphDbState current )
    {
        return new GraphDbStateTransitions.TransitionLookup( current );
    }

    public GraphDbStateTransitions extendWith( GraphDbStateTransitions other )
    {
        HashMap<Pair<EnterpriseOperatorState,EnterpriseOperatorState>,GraphDbStateTransitions.TransitionFunction[]> combined =
                new HashMap( this.transitionsTable );
        combined.putAll( other.transitionsTable );
        return new GraphDbStateTransitions( combined );
    }

    private Stream<GraphDbStateTransitions.Transition> lookup( GraphDbStateTransitions.TransitionLookup lookup )
    {
        if ( !Objects.equals( lookup.current.databaseId(), lookup.desired.databaseId() ) )
        {
            Stream<GraphDbStateTransitions.Transition> dropCurrent =
                    this.prepareTransitionFunctions( lookup.current.operatorState(), EnterpriseOperatorState.DROPPED, lookup.current.databaseId() );
            Stream<GraphDbStateTransitions.Transition> createNext =
                    this.prepareTransitionFunctions( EnterpriseOperatorState.INITIAL, lookup.desired.operatorState(), lookup.desired.databaseId() );
            return Stream.concat( dropCurrent, createNext );
        }
        else
        {
            return this.prepareTransitionFunctions( lookup.current.operatorState(), lookup.desired.operatorState(), lookup.current.databaseId() );
        }
    }

    private Stream<GraphDbStateTransitions.Transition> prepareTransitionFunctions( EnterpriseOperatorState current, EnterpriseOperatorState desired,
                                                                                   NamedDatabaseId namedDatabaseId )
    {
        if ( current == desired )
        {
            return Stream.empty();
        }
        else if ( current == EnterpriseOperatorState.DROPPED )
        {
            throw new IllegalArgumentException(
                    String.format( "Trying to set db %s to %s, but is 'DROPPED', which is a final state.", namedDatabaseId, desired ) );
        }
        else
        {
            GraphDbStateTransitions.TransitionFunction[] transitions =
                    (GraphDbStateTransitions.TransitionFunction[]) this.transitionsTable.get( Pair.of( current, desired ) );
            if ( transitions == null )
            {
                throw new IllegalArgumentException( String.format( "%s -> %s is an unsupported state transition", current, desired ) );
            }
            else
            {
                return Arrays.stream( transitions ).map( ( tn ) ->
                                                         {
                                                             return tn.prepare( namedDatabaseId );
                                                         } );
            }
        }
    }

    @FunctionalInterface
    public interface Transition extends Supplier<EnterpriseGraphDbState>
    {
        EnterpriseGraphDbState doTransition();

        default EnterpriseGraphDbState get()
        {
            return this.doTransition();
        }
    }

    @FunctionalInterface
    public interface TransitionFunction
    {
        EnterpriseGraphDbState forTransition( NamedDatabaseId namedDatabaseId );

        default GraphDbStateTransitions.Transition prepare( NamedDatabaseId namedDatabaseId )
        {
            return () ->
            {
                return this.forTransition( namedDatabaseId );
            };
        }
    }

    public interface BuildOrContinue
    {
        GraphDbStateTransitions.NeedsTo from( EnterpriseOperatorState enterpriseOperatorState1 );

        GraphDbStateTransitions build();
    }

    public interface NeedsDo
    {
        GraphDbStateTransitions.BuildOrContinue doTransitions( GraphDbStateTransitions.TransitionFunction... transitionFunctions );

        GraphDbStateTransitions.BuildOrContinue doNothing();
    }

    public interface NeedsTo
    {
        GraphDbStateTransitions.NeedsDo to( EnterpriseOperatorState enterpriseOperatorState );
    }

    public interface NeedsFrom
    {
        GraphDbStateTransitions.NeedsTo from( EnterpriseOperatorState enterpriseOperatorState );
    }

    public interface NeedsDesired
    {
        Stream<GraphDbStateTransitions.Transition> toDesired( EnterpriseGraphDbState enterpriseGraphDbState );
    }

    public static class TransitionsBuilder implements GraphDbStateTransitions.NeedsFrom, GraphDbStateTransitions.NeedsTo, GraphDbStateTransitions.NeedsDo,
                                                      GraphDbStateTransitions.BuildOrContinue
    {
        private final Map<Pair<EnterpriseOperatorState,EnterpriseOperatorState>,GraphDbStateTransitions.TransitionFunction[]> transitionsTable = new HashMap();
        private EnterpriseOperatorState from;
        private EnterpriseOperatorState to;
        private GraphDbStateTransitions.TransitionFunction[] transitions;

        private TransitionsBuilder()
        {
        }

        public GraphDbStateTransitions.NeedsTo from( EnterpriseOperatorState enterpriseOperatorState )
        {
            this.storePreviousEntry();
            this.from = enterpriseOperatorState;
            return this;
        }

        public GraphDbStateTransitions.NeedsDo to( EnterpriseOperatorState enterpriseOperatorState )
        {
            this.to = enterpriseOperatorState;
            return this;
        }

        public GraphDbStateTransitions.BuildOrContinue doTransitions( GraphDbStateTransitions.TransitionFunction... transitionFunctions )
        {
            this.transitions = transitionFunctions;
            return this;
        }

        public GraphDbStateTransitions.BuildOrContinue doNothing()
        {
            this.transitions = new GraphDbStateTransitions.TransitionFunction[]{( id ) ->
                                                                                {
                                                                                    return new EnterpriseGraphDbState( id, this.to );
                                                                                }};
            return this;
        }

        public GraphDbStateTransitions build()
        {
            this.storePreviousEntry();
            return new GraphDbStateTransitions( this.transitionsTable );
        }

        private void storePreviousEntry()
        {
            if ( this.from != null && this.to != null && this.transitions != null )
            {
                this.transitionsTable.put( Pair.of( this.from, this.to ), this.transitions );
            }
            else if ( this.from != null || this.to != null || this.transitions != null )
            {
                throw new IllegalStateException( "TransitionFunction builder is only partially complete" );
            }
        }
    }

    class TransitionLookup implements GraphDbStateTransitions.NeedsDesired
    {
        private final EnterpriseGraphDbState current;
        private EnterpriseGraphDbState desired;

        private TransitionLookup( EnterpriseGraphDbState current )
        {
            Objects.requireNonNull( current, "You must specify a current state for a transition!" );
            this.current = current;
        }

        public Stream<GraphDbStateTransitions.Transition> toDesired( EnterpriseGraphDbState enterpriseGraphDbState )
        {
            Objects.requireNonNull( enterpriseGraphDbState, "You must specify a desired state for a transition!" );
            this.desired = enterpriseGraphDbState;
            return GraphDbStateTransitions.this.lookup( this );
        }
    }
}
