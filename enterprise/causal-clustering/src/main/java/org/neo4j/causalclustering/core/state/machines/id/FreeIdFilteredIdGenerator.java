/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.causalclustering.core.state.machines.id;

import java.util.function.BooleanSupplier;

import org.neo4j.kernel.impl.store.id.IdGenerator;

/**
 * Id generator that will perform filtering of ids to free using supplied condition.
 * Id will be freed only if condition is true, otherwise it will be ignored.
 */
public class FreeIdFilteredIdGenerator extends IdGenerator.Delegate
{
    private final BooleanSupplier freeIdCondition;

    FreeIdFilteredIdGenerator( IdGenerator delegate, BooleanSupplier freeIdCondition )
    {
        super( delegate );
        this.freeIdCondition = freeIdCondition;
    }

    @Override
    public void freeId( long id )
    {
        if ( freeIdCondition.getAsBoolean() )
        {
            super.freeId( id );
        }
    }
}
