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
package org.neo4j.kernel.internal.event;

import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.event.LabelEntry;
import org.neo4j.kernel.impl.core.NodeEntity;
import org.neo4j.kernel.impl.coreapi.InternalTransaction;
import org.neo4j.memory.HeapEstimator;

class LabelEntryView implements LabelEntry
{
    static final long SHALLOW_SIZE = HeapEstimator.shallowSizeOfInstance( LabelEntryView.class );

    private final InternalTransaction internalTransaction;
    private final long nodeId;
    private final Label label;

    LabelEntryView( InternalTransaction internalTransaction, long nodeId, String labelName )
    {
        this.internalTransaction = internalTransaction;
        this.nodeId = nodeId;
        this.label = Label.label( labelName );
    }

    @Override
    public Label label()
    {
        return label;
    }

    @Override
    public Node node()
    {
        return new NodeEntity( internalTransaction, nodeId );
    }

    @Override
    public String toString()
    {
        return "LabelEntryView{" +
                "nodeId=" + nodeId +
                ", label=" + label +
                '}';
    }
}
