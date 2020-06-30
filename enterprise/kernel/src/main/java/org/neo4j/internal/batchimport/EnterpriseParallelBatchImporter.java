/*
 * Copyright (c) 2002-2018 "Neo4j"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 *   This file is part of ONgDB.
 *
 *   ONgDB is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.neo4j.internal.batchimport;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;

import org.neo4j.configuration.Config;
import org.neo4j.internal.batchimport.ImportLogic.Monitor;
import org.neo4j.internal.batchimport.input.Collector;
import org.neo4j.internal.batchimport.input.Input;
import org.neo4j.internal.batchimport.staging.ExecutionMonitor;
import org.neo4j.internal.batchimport.store.BatchingNeoStores;
import org.neo4j.internal.helpers.ArrayUtil;
import org.neo4j.internal.helpers.collection.Iterators;
import org.neo4j.internal.helpers.collection.Pair;
import org.neo4j.internal.helpers.collection.PrefetchingIterator;
import org.neo4j.io.fs.FileSystemAbstraction;
import org.neo4j.io.layout.DatabaseLayout;
import org.neo4j.io.pagecache.PageCache;
import org.neo4j.kernel.impl.store.PropertyType;
import org.neo4j.kernel.impl.store.StoreType;
import org.neo4j.kernel.impl.store.format.RecordFormats;
import org.neo4j.logging.internal.LogService;
import org.neo4j.scheduler.JobScheduler;
import org.neo4j.storageengine.api.LogFilesInitializer;

public class EnterpriseParallelBatchImporter implements BatchImporter
{

    static final String FILE_NAME_STATE = "state";
    private static final String FILE_NAME_RELATIONSHIP_DISTRIBUTION = "relationship-type-distribution";
    private static final String STATE_NEW_IMPORT = "";
    private static final String STATE_INIT = "init";
    private static final String STATE_START = "start";
    private static final String STATE_DATA_IMPORT = "data-import";
    private static final String STATE_DATA_LINK = "data-link";
    private static final String STATE_DEFRAGMENT = "defragment";
    private final PageCache externalPageCache;
    private final DatabaseLayout databaseLayout;
    private final FileSystemAbstraction fileSystem;
    private final Configuration config;
    private final LogService logService;
    private final Config dbConfig;
    private final RecordFormats recordFormats;
    private final ExecutionMonitor executionMonitor;
    private final AdditionalInitialIds additionalInitialIds;
    private final DataStatisticsStorage dataStatisticsStorage;
    private final Monitor monitor;
    private final JobScheduler jobScheduler;
    private final Collector badCollector;
    private final LogFilesInitializer logFilesInitializer;

    public EnterpriseParallelBatchImporter( DatabaseLayout databaseLayout,
                                            FileSystemAbstraction fileSystem, PageCache externalPageCache, Configuration config,
                                            LogService logService, ExecutionMonitor executionMonitor,
                                            AdditionalInitialIds additionalInitialIds,
                                            Config dbConfig, RecordFormats recordFormats,
                                            Monitor monitor, JobScheduler jobScheduler, Collector badCollector,
                                            LogFilesInitializer logFilesInitializer )
    {
        this.externalPageCache = externalPageCache;
        this.databaseLayout = databaseLayout;
        this.fileSystem = fileSystem;
        this.config = config;
        this.logService = logService;
        this.dbConfig = dbConfig;
        this.recordFormats = recordFormats;
        this.executionMonitor = executionMonitor;
        this.additionalInitialIds = additionalInitialIds;
        this.monitor = monitor;
        this.dataStatisticsStorage =
                new DataStatisticsStorage( fileSystem,
                                           new File( this.databaseLayout.databaseDirectory(), FILE_NAME_RELATIONSHIP_DISTRIBUTION ) );
        this.jobScheduler = jobScheduler;
        this.badCollector = badCollector;
        this.logFilesInitializer = logFilesInitializer;
    }

    /**
     * @param store
     * @param stateStore
     * @param stateName
     * @param checkPoint
     * @param states
     * @throws IOException
     */
    private static void moveToLastCompletedState( BatchingNeoStores store,
                                                  BatchImportStateStore stateStore, String stateName, byte[] checkPoint,
                                                  PrefetchingIterator<BatchImportState> states ) throws IOException
    {
        if ( "".equals( stateName ) )
        {
            store.createNew();
            stateStore.set( STATE_INIT, PropertyType.EMPTY_BYTE_ARRAY );
        }
        else
        {
            Set<StoreType> mainStoresToKeep = new HashSet<>();
            HashSet tempStoresToKeep = new HashSet<>();

            while ( states.hasNext() )
            {
                BatchImportState batchImportState = states.peek();
                mainStoresToKeep.addAll( Arrays.asList( batchImportState.getMainStoreTypes() ) );
                tempStoresToKeep.addAll( Arrays.asList( batchImportState.getTempStoreTypes() ) );
                batchImportState.load();
                if ( batchImportState.name().equals( stateName ) )
                {
                    Objects.requireNonNull( mainStoresToKeep );
                    Predicate mstc = mainStoresToKeep::contains;
                    Objects.requireNonNull( tempStoresToKeep );
                    store.pruneAndOpenExistingStore( mstc, tempStoresToKeep::contains );
                    if ( checkPoint.length == 0 )
                    {
                        states.next();
                    }
                    break;
                }

                states.next();
            }
        }
    }

    @Override
    public void doImport( Input input ) throws IOException
    {
        BatchingNeoStores store =
                ImportLogic
                        .instantiateNeoStores( this.fileSystem, this.databaseLayout, this.externalPageCache,
                                               this.recordFormats, this.config,
                                               this.logService, this.additionalInitialIds, this.dbConfig, this.jobScheduler );

        try
        {
            ImportLogic logic =
                    new ImportLogic( this.databaseLayout, store, this.config, this.dbConfig, this.logService,
                                     this.executionMonitor, this.recordFormats,
                                     this.badCollector, this.monitor );

            try
            {
                BatchImportStateStore stateStore =
                        new BatchImportStateStore( this.fileSystem,
                                                   new File( this.databaseLayout.databaseDirectory(), FILE_NAME_STATE ) );
                PrefetchingIterator<BatchImportState> states = this.setupStates( logic, store );
                Pair<String,byte[]> previousState = stateStore.get();
                moveToLastCompletedState( store, stateStore, previousState.first(), previousState.other(),
                                          states );
                logic.initialize( input );
                this.runStates( store, stateStore, previousState.other(), states );
                logic.success();
            }
            catch ( Throwable e )
            {
                try
                {
                    logic.close();
                }
                catch ( Throwable e2 )
                {
                    e.addSuppressed( e2 );
                }

                throw e;
            }

            logic.close();
        }
        catch ( Throwable e )
        {
            if ( store != null )
            {
                try
                {
                    store.close();
                }
                catch ( Throwable e2 )
                {
                    e.addSuppressed( e2 );
                }
            }

            throw e;
        }

        if ( store != null )
        {
            store.close();
        }
    }

    /**
     * @param logic
     * @param store
     * @return
     */
    private PrefetchingIterator<BatchImportState> setupStates( final ImportLogic logic,
                                                               final BatchingNeoStores store )
    {
        List<BatchImportState> batchImportStates = new ArrayList();
        batchImportStates
                .add( new BatchImportState( STATE_INIT, ArrayUtil.array( new StoreType[0] ),
                                            ArrayUtil.array( new StoreType[0] ) ) );
        batchImportStates.add(
                new BatchImportState( STATE_START, ArrayUtil.array( new StoreType[]{StoreType.META_DATA} ),
                                      ArrayUtil.array( new StoreType[0] ) ) );
        batchImportStates.add( new BatchImportState( STATE_DATA_IMPORT, ArrayUtil.array(
                new StoreType[]{StoreType.NODE, StoreType.NODE_LABEL, StoreType.LABEL_TOKEN,
                                StoreType.LABEL_TOKEN_NAME, StoreType.RELATIONSHIP,
                                StoreType.RELATIONSHIP_TYPE_TOKEN, StoreType.RELATIONSHIP_TYPE_TOKEN_NAME,
                                StoreType.PROPERTY, StoreType.PROPERTY_ARRAY,
                                StoreType.PROPERTY_STRING, StoreType.PROPERTY_KEY_TOKEN,
                                StoreType.PROPERTY_KEY_TOKEN_NAME} ),
                                                     ArrayUtil.array( new StoreType[0] ) )
        {
            void run( byte[] fromCheckPoint, CheckPointManager checkPointManager ) throws IOException
            {
                logic.importNodes();
                logic.prepareIdMapper();
                logic.importRelationships();
            }

            void save() throws IOException
            {
                EnterpriseParallelBatchImporter.this.dataStatisticsStorage
                        .update( (DataStatistics) logic.getState( DataStatistics.class ) );
            }

            void load() throws IOException
            {
                logic.putState( EnterpriseParallelBatchImporter.this.dataStatisticsStorage.load() );
            }
        } );
        batchImportStates.add( new BatchImportState( STATE_DATA_LINK, ArrayUtil.array( new StoreType[0] ),
                                                     ArrayUtil.array( new StoreType[]{StoreType.RELATIONSHIP_GROUP} ) )
        {
            void run( byte[] fromCheckPoint, CheckPointManager checkPointManager )
            {
                logic.calculateNodeDegrees();

                /**
                 * Loop through all linkRelationships
                 */
                for ( int startingFromType = 0; startingFromType != -1;
                      startingFromType = logic.linkRelationships( startingFromType ) )
                {
                }
            }
        } );
        batchImportStates.add( new BatchImportState( STATE_DEFRAGMENT,
                                                     ArrayUtil.array( new StoreType[]{StoreType.RELATIONSHIP_GROUP} ),
                                                     ArrayUtil.array( new StoreType[0] ) )
        {
            void run( byte[] fromCheckPoint, CheckPointManager checkPointManager )
            {
                logic.defragmentRelationshipGroups();
            }
        } );
        batchImportStates.add( new BatchImportState( null, ArrayUtil.array( new StoreType[0] ),
                                                     ArrayUtil.array( new StoreType[0] ) )
        {
            void run( byte[] fromCheckPoint, CheckPointManager checkPointManager )
            {
                logic.buildCountsStore();
                EnterpriseParallelBatchImporter.this.logFilesInitializer.initializeLogFiles(
                        EnterpriseParallelBatchImporter.this.databaseLayout,
                        store.getNeoStores().getMetaDataStore(),
                        EnterpriseParallelBatchImporter.this.fileSystem );
            }
        } );
        return Iterators.prefetching( batchImportStates.iterator() );
    }

    /**
     * @param store
     * @param stateStore
     * @param checkPoint
     * @param states
     * @throws IOException
     */
    private void runStates( BatchingNeoStores store, BatchImportStateStore stateStore,
                            byte[] checkPoint, Iterator<BatchImportState> states )
            throws IOException
    {
        while ( states.hasNext() )
        {
            BatchImportState batchImportState = (BatchImportState) states.next();
            String stateName = batchImportState.name();
            batchImportState.run( checkPoint, ( cp ) ->
            {
                this.commitState( store, stateStore, stateName, cp );
            } );
            batchImportState.save();
            this.commitState( store, stateStore, stateName, checkPoint = PropertyType.EMPTY_BYTE_ARRAY );
        }
    }

    /**
     * @param store
     * @param state
     * @param stateName
     * @param checkPoint
     * @throws IOException
     */
    private void commitState( BatchingNeoStores store, BatchImportStateStore state, String stateName,
                              byte[] checkPoint ) throws IOException
    {
        store.flushAndForce();
        if ( stateName != null )
        {
            state.set( stateName, checkPoint );
        }
        else
        {
            state.remove();
            this.dataStatisticsStorage.deleteFile();
        }
    }
}
