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
package org.neo4j.cli;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

import org.neo4j.cli.Command.CommandType;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.neo4j.cli.Command.CommandType.DUMP;
import static org.neo4j.cli.Command.CommandType.LOAD;

class AdminToolTest
{
    @Test
    public void filterShouldKeepAllProvidersThatCreateUniqueCommands()
    {
        //given
        List<CommandProvider> commandProvider = List.of( createCommandProvider( LOAD, 1 ), createCommandProvider( DUMP, 2 ) );

        //when
        Collection<CommandProvider> filterCommandProviders = AdminTool.filterCommandProviders( commandProvider );

        //then
        assertThat( filterCommandProviders ).containsAll( commandProvider );
    }

    @Test
    public void filterShouldKeepTheProviderWithHigherPriorityIfBothOfThemCreateTheCommandWithSameType()
    {
        //given
        List<CommandProvider> commandProvider = List.of( createCommandProvider( LOAD, 2 ), createCommandProvider( LOAD, 1 ) );

        //when
        Collection<CommandProvider> filterCommandProviders = AdminTool.filterCommandProviders( commandProvider );

        //then
        assertThat( filterCommandProviders ).hasSize( 1 ).contains( commandProvider.get( 0 ) );
    }

    @Test
    public void filterShouldThrowExceptionIfTwoProvidersWithSameTypeCreateSameCommand()
    {
        //given
        List<CommandProvider> enterpriseProviders = List.of( createCommandProvider( LOAD, 1 ), createCommandProvider( LOAD, 1 ) );
        List<CommandProvider> communityProviders = List.of( createCommandProvider( LOAD, 2 ), createCommandProvider( LOAD, 2 ) );

        //when
        assertThrows( IllegalArgumentException.class, () -> AdminTool.filterCommandProviders( communityProviders ) );
        assertThrows( IllegalArgumentException.class, () -> AdminTool.filterCommandProviders( enterpriseProviders ) );
    }

    private CommandProvider createCommandProvider( CommandType commandType, int priority )
    {
        return new CommandProvider<>()
        {
            @Override
            public Command createCommand( ExecutionContext ctx )
            {
                return null;
            }

            @Override
            public CommandType commandType()
            {
                return commandType;
            }

            @Override
            public int getPriority()
            {
                return priority;
            }
        };
    }
}
