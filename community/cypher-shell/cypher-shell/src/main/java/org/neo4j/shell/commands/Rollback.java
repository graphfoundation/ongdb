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
package org.neo4j.shell.commands;

import java.util.Collections;
import java.util.List;

import org.neo4j.shell.TransactionHandler;
import org.neo4j.shell.exception.CommandException;
import org.neo4j.shell.exception.ExitException;

import static org.neo4j.shell.commands.CommandHelper.simpleArgParse;

/**
 * This command marks a transaction as failed and closes it.
 */
public class Rollback implements Command
{
    public static final String COMMAND_NAME = ":rollback";
    private final TransactionHandler transactionHandler;

    public Rollback( final TransactionHandler transactionHandler )
    {
        this.transactionHandler = transactionHandler;
    }

    @Override
    public String getName()
    {
        return COMMAND_NAME;
    }

    @Override
    public String getDescription()
    {
        return "Rollback the currently open transaction";
    }

    @Override
    public String getUsage()
    {
        return "";
    }

    @Override
    public String getHelp()
    {
        return "Roll back and closes the currently open transaction";
    }

    @Override
    public List<String> getAliases()
    {
        return Collections.emptyList();
    }

    @Override
    public void execute( final String argString ) throws ExitException, CommandException
    {
        simpleArgParse( argString, 0, COMMAND_NAME, getUsage() );

        transactionHandler.rollbackTransaction();
    }
}
