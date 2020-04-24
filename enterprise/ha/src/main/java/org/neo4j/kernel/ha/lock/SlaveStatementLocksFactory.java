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
package org.neo4j.kernel.ha.lock;

import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.kernel.impl.locking.StatementLocks;
import org.neo4j.kernel.impl.locking.StatementLocksFactory;

/**
 * Statement locks factory that will produce slave specific statement locks
 * that are aware how to grab shared locks for labels and relationship types
 * during slave commit
 */
public class SlaveStatementLocksFactory implements StatementLocksFactory
{
    private final StatementLocksFactory delegate;

    public SlaveStatementLocksFactory( StatementLocksFactory delegate )
    {
        this.delegate = delegate;
    }

    @Override
    public void initialize( Locks locks, Config config )
    {
        delegate.initialize( locks, config );
    }

    @Override
    public StatementLocks newInstance()
    {
        StatementLocks statementLocks = delegate.newInstance();
        return new SlaveStatementLocks( statementLocks );
    }
}
