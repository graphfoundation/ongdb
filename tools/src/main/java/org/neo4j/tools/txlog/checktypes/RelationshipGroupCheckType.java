/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
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
package org.neo4j.tools.txlog.checktypes;

import org.neo4j.kernel.impl.store.record.RelationshipGroupRecord;
import org.neo4j.kernel.impl.transaction.command.Command;

public class RelationshipGroupCheckType extends CheckType<Command.RelationshipGroupCommand,RelationshipGroupRecord>
{
    RelationshipGroupCheckType()
    {
        super( Command.RelationshipGroupCommand.class );
    }

    @Override
    public RelationshipGroupRecord before( Command.RelationshipGroupCommand command )
    {
        return command.getBefore();
    }

    @Override
    public RelationshipGroupRecord after( Command.RelationshipGroupCommand command )
    {
        return command.getAfter();
    }

    @Override
    protected boolean inUseRecordsEqual( RelationshipGroupRecord record1, RelationshipGroupRecord record2 )
    {
        return record1.getFirstIn() == record2.getFirstIn() &&
               record1.getFirstLoop() == record2.getFirstLoop() &&
               record1.getFirstOut() == record2.getFirstOut() &&
               record1.getNext() == record2.getNext() &&
               record1.getOwningNode() == record2.getOwningNode() &&
               record1.getPrev() == record2.getPrev() &&
               record1.getType() == record2.getType();
    }

    @Override
    public String name()
    {
        return "relationship_group";
    }
}
