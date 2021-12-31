/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * This file is part of ONgDB Enterprise Edition. The included source
 * code can be redistributed and/or modified under the terms of the
 * GNU AFFERO GENERAL PUBLIC LICENSE Version 3
 * (http://www.fsf.org/licensing/licenses/agpl-3.0.html) as found
 * in the associated LICENSE.txt file.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 */
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cluster.statemachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.neo4j.cluster.com.message.Message;
import org.neo4j.cluster.com.message.MessageHolder;
import org.neo4j.cluster.com.message.MessageType;

/**
 * Trigger messages when given state transitions occur
 */
public class StateMachineRules
    implements StateTransitionListener
{
    private final MessageHolder outgoing;

    private Map<State<?,?>,List<StateMachineRule>> rules = new HashMap<>();

    public StateMachineRules( MessageHolder outgoing )
    {
        this.outgoing = outgoing;
    }

    public StateMachineRules rule( State<?, ?> oldState,
                                   MessageType messageType,
                                   State<?, ?> newState,
                                   Message<?>... messages
    )
    {
        List<StateMachineRule> fromRules = rules.computeIfAbsent( oldState, k -> new ArrayList<>() );
        fromRules.add( new StateMachineRule( oldState,  messageType, newState, messages ) );
        return this;
    }

    @Override
    public void stateTransition( StateTransition transition )
    {
        List<StateMachineRule> oldStateRules = rules.get( transition.getOldState() );
        if ( oldStateRules != null )
        {
            for ( StateMachineRule oldStateRule : oldStateRules )
            {
                oldStateRule.stateTransition( transition );
            }
        }
    }

    private class StateMachineRule
        implements StateTransitionListener
    {
        State<?,?> oldState;
        MessageType messageType;
        State<?,?> newState;

        Message<?>[] messages;

        private StateMachineRule( State<?, ?> oldState, MessageType messageType, State<?, ?> newState, Message<?>[] messages )
        {
            this.oldState = oldState;
            this.messageType = messageType;
            this.newState = newState;
            this.messages = messages;
        }

        @Override
        public void stateTransition( StateTransition transition )
        {
            if ( oldState.equals( transition.getOldState() ) &&
                    transition.getMessage().getMessageType().equals( messageType ) &&
                    newState.equals( transition.getNewState() ) )
            {
                for ( Message<?> message : messages )
                {
                    outgoing.offer( message );
                }
            }
        }
    }
}
