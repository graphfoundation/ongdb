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
package org.neo4j.backup.impl;

import java.util.concurrent.TimeUnit;

import org.neo4j.causalclustering.monitor.StoreMonitor;
import org.neo4j.internal.helpers.Format;
import org.neo4j.logging.Log;
import org.neo4j.logging.LogProvider;
import org.neo4j.time.Clocks;
import org.neo4j.time.Stopwatch;
import org.neo4j.time.SystemNanoClock;

/**
 * Monitor for events that should be displayed to neo4j-admin backup stdout
 */
class BackupOutputMonitor implements StoreMonitor
{
    private final Log log;
    private final SystemNanoClock clock;
    private Stopwatch startTime;
    private Stopwatch segmentStart;

    /**
     * @param logProvider
     */
    BackupOutputMonitor( LogProvider logProvider )
    {
        this( logProvider, Clocks.nanoClock() );
    }

    /**
     * @param logProvider
     * @param clock
     */
    BackupOutputMonitor( LogProvider logProvider, SystemNanoClock clock )
    {
        this.log = logProvider.getLog( this.getClass() );
        this.clock = clock;
    }

    @Override
    public void start()
    {
        this.startTime = this.clock.startStopWatch();
    }

    @Override
    public void startReceivingStoreFiles()
    {
        log.info( "Start receiving store files" );
        this.initSegmentStart();
    }

    @Override
    public void finishReceivingStoreFiles()
    {
        log.info( "Finish receiving store files, took %s", segmentCurrentDuration() );
    }

    @Override
    public void startReceivingStoreFile( String file )
    {
        log.info( "Start receiving store file %s", file );
    }

    @Override
    public void finishReceivingStoreFile( String file )
    {
        log.info( "Finish receiving store file %s", file );
    }

    @Override
    public void startReceivingTransactions( long startTxId )
    {
        log.info( "Start receiving transactions from %d", startTxId );
        this.initSegmentStart();
    }

    @Override
    public void finishReceivingTransactions( long endTxId )
    {
        log.info( "Finish receiving transactions at %d, took %s", new Object[]{endTxId, segmentCurrentDuration()} );
    }

    @Override
    public void startRecoveringStore()
    {
        log.info( "Start recovering store" );
        this.initSegmentStart();
    }

    @Override
    public void finishRecoveringStore()
    {
        log.info( "Finish recovering store, took %s", new Object[]{this.segmentCurrentDuration()} );
    }

    @Override
    public void startReceivingIndexSnapshots()
    {
        log.info( "Start receiving index snapshots" );
        this.initSegmentStart();
    }

    @Override
    public void startReceivingIndexSnapshot( long indexId )
    {
        log.info( "Start receiving index snapshot id %d", indexId );
    }

    @Override
    public void finishReceivingIndexSnapshot( long indexId )
    {
        log.info( "Finished receiving index snapshot id %d", indexId );
    }

    @Override
    public void finishReceivingIndexSnapshots()
    {
        log.info( "Finished receiving index snapshots, took %s", segmentCurrentDuration() );
    }

    @Override
    public void finish()
    {
        this.log.info( "Finished, took %s", new Object[]{Format.duration( this.startTime.elapsed( TimeUnit.MILLISECONDS ) )} );
    }

    private void initSegmentStart()
    {
        this.segmentStart = this.clock.startStopWatch();
    }

    private String segmentCurrentDuration()
    {
        return Format.duration( this.segmentStart.elapsed( TimeUnit.MILLISECONDS ) );
    }
}
