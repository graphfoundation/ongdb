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
package org.neo4j.backup;

import java.util.function.Supplier;

import org.neo4j.graphdb.factory.GraphDatabaseSettings;
import org.neo4j.helpers.Service;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.NeoStoreDataSource;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.extension.ExtensionType;
import org.neo4j.kernel.extension.KernelExtensionFactory;
import org.neo4j.kernel.impl.enterprise.configuration.OnlineBackupSettings;
import org.neo4j.kernel.impl.factory.OperationalMode;
import org.neo4j.kernel.impl.spi.KernelContext;
import org.neo4j.kernel.impl.transaction.log.LogFileInformation;
import org.neo4j.kernel.impl.transaction.log.LogicalTransactionStore;
import org.neo4j.kernel.impl.transaction.log.TransactionIdStore;
import org.neo4j.kernel.impl.transaction.log.checkpoint.CheckPointer;
import org.neo4j.kernel.impl.transaction.log.checkpoint.StoreCopyCheckPointMutex;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.kernel.monitoring.Monitors;
import org.neo4j.logging.internal.LogService;

/**
 * @deprecated This will be moved to an internal package in the future.
 */
@Deprecated
@Service.Implementation( KernelExtensionFactory.class )
public class OnlineBackupExtensionFactory extends KernelExtensionFactory<OnlineBackupExtensionFactory.Dependencies>
{
    static final String KEY = "online backup";

    @Deprecated
    public interface Dependencies
    {
        Config getConfig();

        GraphDatabaseAPI getGraphDatabaseAPI();

        LogService logService();

        Monitors monitors();

        NeoStoreDataSource neoStoreDataSource();

        Supplier<CheckPointer> checkPointer();

        Supplier<TransactionIdStore> transactionIdStoreSupplier();

        Supplier<LogicalTransactionStore> logicalTransactionStoreSupplier();

        Supplier<LogFileInformation> logFileInformationSupplier();

        FileSystemAbstraction fileSystemAbstraction();

        PageCache pageCache();

        StoreCopyCheckPointMutex storeCopyCheckPointMutex();
    }

    public OnlineBackupExtensionFactory()
    {
        super( ExtensionType.DATABASE, KEY );
    }

    @Deprecated
    public Class<OnlineBackupSettings> getSettingsClass()
    {
        throw new AssertionError();
    }

    @Override
    public Lifecycle newInstance( KernelContext context, Dependencies dependencies )
    {
        if ( !isCausalClusterInstance( context ) && isDefaultDatabase( dependencies.neoStoreDataSource(), dependencies.getConfig() ) )
        {
            return new OnlineBackupKernelExtension( dependencies.getConfig(), dependencies.getGraphDatabaseAPI(),
                    dependencies.logService().getInternalLogProvider(), dependencies.monitors(), dependencies.neoStoreDataSource(),
                    dependencies.fileSystemAbstraction() );
        }
        return new LifecycleAdapter();
    }

    private static boolean isDefaultDatabase( NeoStoreDataSource neoStoreDataSource, Config config )
    {
        return neoStoreDataSource.getDatabaseName().equals( config.get( GraphDatabaseSettings.active_database ) );
    }

    private static boolean isCausalClusterInstance( KernelContext kernelContext )
    {
        OperationalMode thisMode = kernelContext.databaseInfo().operationalMode;
        return OperationalMode.core.equals( thisMode ) || OperationalMode.read_replica.equals( thisMode );
    }
}
