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

package org.neo4j.dbms.database;

import java.util.Collection;

import org.neo4j.dbms.DatabaseState;
import org.neo4j.dbms.EnterpriseGraphDbState;
import org.neo4j.dbms.EnterpriseOperatorState;
import org.neo4j.dbms.GraphDbStateChangedListener;
import org.neo4j.dbms.OperatorState;

public class GraphDbOperationMonitorListener implements GraphDbStateChangedListener
{
    private GraphDbOperationMonitor monitor;

    public GraphDbOperationMonitorListener( GraphDbOperationMonitor monitor )
    {
        this.monitor = monitor;
    }

    public void stateChange( DatabaseState previousState, DatabaseState newState )
    {
        OperatorState previousOperatorState =
                previousState.operatorState().equals( EnterpriseOperatorState.STORE_COPYING ) ? EnterpriseOperatorState.STARTED : previousState.operatorState();
        OperatorState newOperatorState =
                newState.operatorState().equals( EnterpriseOperatorState.STORE_COPYING ) ? EnterpriseOperatorState.STARTED : newState.operatorState();
        if ( !previousOperatorState.equals( newOperatorState ) )
        {
            if ( EnterpriseOperatorState.DROPPED.equals( newOperatorState ) )
            {
                if ( previousOperatorState != EnterpriseOperatorState.STOPPED )
                {
                    this.monitor.increaseStopCount();
                }

                this.monitor.increaseDropCount();
            }
            else if ( EnterpriseOperatorState.STOPPED.equals( newOperatorState ) )
            {
                this.monitor.increaseStopCount();
            }
            else if ( EnterpriseOperatorState.STARTED.equals( newOperatorState ) )
            {
                if ( previousOperatorState == EnterpriseOperatorState.INITIAL )
                {
                    this.monitor.increaseCreateCount();
                }

                this.monitor.increaseStartCount();
            }
        }

        boolean previousFailed = previousState.hasFailed();
        boolean newFailed = newState.hasFailed();
        if ( !previousFailed && newFailed )
        {
            this.monitor.increaseFailedCount();
        }
        else if ( previousFailed && !newFailed )
        {
            this.monitor.increaseRecoveredCount();
        }
    }

    public void reset( Collection<EnterpriseGraphDbState> currentStates )
    {
        this.monitor.resetCounts();
        currentStates.forEach( ( state ) ->
                               {
                                   if ( state.hasFailed() )
                                   {
                                       this.monitor.increaseFailedCount();
                                   }

                                   switch ( state.operatorState() )
                                   {
                                   case STOPPED:
                                       this.monitor.increaseCreateCount();
                                       break;
                                   case STORE_COPYING:
                                   case STARTED:
                                       this.monitor.increaseCreateCount();
                                       this.monitor.increaseStartCount();
                                   }
                               } );
    }
}
