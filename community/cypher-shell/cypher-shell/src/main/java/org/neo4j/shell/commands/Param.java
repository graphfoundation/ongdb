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
package org.neo4j.shell.commands;

import java.util.Collections;
import java.util.List;

import org.neo4j.shell.ParameterMap;
import org.neo4j.shell.exception.CommandException;
import org.neo4j.shell.exception.ParameterException;
import org.neo4j.shell.log.AnsiFormattedText;
import org.neo4j.shell.util.ParameterSetter;

/**
 * This command sets a variable to a name, for use as query parameter.
 */
public class Param extends ParameterSetter<CommandException> implements Command
{
    private static final String COMMAND_NAME = ":param";

    /**
     * @param parameterMap the map to set parameters in
     */
    public Param( final ParameterMap parameterMap )
    {
        super( parameterMap );
    }

    @Override
    public String getName()
    {
        return COMMAND_NAME;
    }

    @Override
    public String getDescription()
    {
        return "Set the value of a query parameter";
    }

    @Override
    public String getUsage()
    {
        return "name => value";
    }

    @Override
    public String getHelp()
    {
        return "Set the specified query parameter to the value given";
    }

    @Override
    public List<String> getAliases()
    {
        return Collections.emptyList();
    }

    @Override
    protected void onWrongUsage() throws CommandException
    {
        throw new CommandException( AnsiFormattedText.from( "Incorrect usage.\nusage: " )
                                                     .bold( COMMAND_NAME ).append( " " ).append( getUsage() ) );
    }

    @Override
    protected void onWrongNumberOfArguments() throws CommandException
    {
        throw new CommandException( AnsiFormattedText.from( "Incorrect number of arguments.\nusage: " )
                                                     .bold( COMMAND_NAME ).append( " " ).append( getUsage() ) );
    }

    @Override
    protected void onParameterException( ParameterException e ) throws CommandException
    {
        throw new CommandException( e.getMessage(), e );
    }
}
