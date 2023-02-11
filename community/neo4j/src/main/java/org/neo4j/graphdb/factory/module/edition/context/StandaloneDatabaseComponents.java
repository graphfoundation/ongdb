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
package org.neo4j.graphdb.factory.module.edition.context;

import java.util.function.Function;

import org.neo4j.graphdb.factory.module.edition.StandaloneEditionModule;
import org.neo4j.graphdb.factory.module.id.DatabaseIdContext;
import org.neo4j.io.fs.watcher.DatabaseLayoutWatcher;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.kernel.database.DatabaseStartupController;
import org.neo4j.kernel.database.NamedDatabaseId;
import org.neo4j.kernel.impl.api.CommitProcessFactory;
import org.neo4j.kernel.impl.api.ExternalIdReuseConditionProvider;
import org.neo4j.kernel.impl.constraints.ConstraintSemantics;
import org.neo4j.kernel.impl.factory.AccessCapabilityFactory;
import org.neo4j.kernel.impl.locking.Locks;
import org.neo4j.kernel.impl.query.QueryEngineProvider;
import org.neo4j.kernel.impl.transaction.stats.DatabaseTransactionStats;
import org.neo4j.token.TokenHolders;

public class StandaloneDatabaseComponents implements EditionDatabaseComponents
{
    private final Function<DatabaseLayout,DatabaseLayoutWatcher> watcherServiceFactory;
    private final ConstraintSemantics constraintSemantics;
    private final CommitProcessFactory commitProcessFactory;
    private final TokenHolders tokenHolders;
    private final Locks locks;
    private final DatabaseTransactionStats transactionMonitor;
    private final DatabaseIdContext idContext;
    private final QueryEngineProvider queryEngineProvider;
    private final AccessCapabilityFactory accessCapabilityFactory;
    private final DatabaseStartupController startupController;

    public StandaloneDatabaseComponents( StandaloneEditionModule editionModule, NamedDatabaseId namedDatabaseId )
    {
        this.commitProcessFactory = editionModule.getCommitProcessFactory();
        this.constraintSemantics = editionModule.getConstraintSemantics();
        this.watcherServiceFactory = editionModule.getWatcherServiceFactory();
        this.idContext = editionModule.getIdContextFactory().createIdContext( namedDatabaseId );
        this.tokenHolders = editionModule.getTokenHoldersProvider().apply( namedDatabaseId );
        this.locks = editionModule.getLocksSupplier().get();
        this.transactionMonitor = editionModule.createTransactionMonitor();
        this.queryEngineProvider = editionModule.getQueryEngineProvider();
        this.startupController = editionModule.getDatabaseStartupController();
        this.accessCapabilityFactory = AccessCapabilityFactory.configDependent();
    }

    @Override
    public DatabaseIdContext getIdContext()
    {
        return idContext;
    }

    @Override
    public TokenHolders getTokenHolders()
    {
        return tokenHolders;
    }

    @Override
    public Function<DatabaseLayout,DatabaseLayoutWatcher> getWatcherServiceFactory()
    {
        return watcherServiceFactory;
    }

    @Override
    public ConstraintSemantics getConstraintSemantics()
    {
        return constraintSemantics;
    }

    @Override
    public CommitProcessFactory getCommitProcessFactory()
    {
        return commitProcessFactory;
    }

    @Override
    public Locks getLocks()
    {
        return locks;
    }

    @Override
    public DatabaseTransactionStats getTransactionMonitor()
    {
        return transactionMonitor;
    }

    @Override
    public QueryEngineProvider getQueryEngineProvider()
    {
        return queryEngineProvider;
    }

    @Override
    public AccessCapabilityFactory getAccessCapabilityFactory()
    {
        return accessCapabilityFactory;
    }

    @Override
    public DatabaseStartupController getStartupController()
    {
        return startupController;
    }

    @Override
    public ExternalIdReuseConditionProvider getExternalIdReuseConditionProvider()
    {
        return ExternalIdReuseConditionProvider.NONE;
    }
}
