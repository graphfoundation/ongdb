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
package org.neo4j.causalclustering.core.state.machines.id;

import org.apache.commons.lang3.mutable.MutableBoolean;
import org.junit.Test;

import java.util.function.BooleanSupplier;

import org.neo4j.kernel.impl.store.id.IdGenerator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;

public class FreeIdFilteredIdGeneratorTest
{

    private IdGenerator idGenerator = mock( IdGenerator.class );

    @Test
    public void freeIdIfConditionSatisfied()
    {
        FreeIdFilteredIdGenerator generator = createFilteredIdGenerator( idGenerator, () -> true );
        generator.freeId( 1 );

        verify( idGenerator ).freeId( 1 );
    }

    @Test
    public void skipFreeIdIfConditionIsNotSatisfied()
    {
        FreeIdFilteredIdGenerator generator = createFilteredIdGenerator( idGenerator, () -> false );
        generator.freeId( 1 );

        verifyZeroInteractions( idGenerator );
    }

    @Test
    public void freeIdOnlyWhenConditionSatisfied()
    {
        MutableBoolean condition = new MutableBoolean();
        FreeIdFilteredIdGenerator generator = createFilteredIdGenerator( idGenerator, condition::booleanValue );
        generator.freeId( 1 );
        condition.setTrue();
        generator.freeId( 2 );

        verify( idGenerator ).freeId( 2 );
    }

    private FreeIdFilteredIdGenerator createFilteredIdGenerator( IdGenerator idGenerator,
            BooleanSupplier booleanSupplier )
    {
        return new FreeIdFilteredIdGenerator( idGenerator, booleanSupplier );
    }
}
