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
package org.neo4j.kernel.database;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ExceptionUtils;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.neo4j.dbms.database.DbmsRuntimeRepository;
import org.neo4j.dbms.database.DbmsRuntimeVersion;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.event.TransactionData;
import org.neo4j.io.fs.WritableChannel;
import org.neo4j.kernel.KernelVersion;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.internal.event.DatabaseTransactionEventListeners;
import org.neo4j.kernel.internal.event.InternalTransactionEventListener;
import org.neo4j.lock.Lock;
import org.neo4j.logging.AssertableLogProvider;
import org.neo4j.logging.LogAssertions;
import org.neo4j.storageengine.api.KernelVersionRepository;
import org.neo4j.storageengine.api.StorageCommand;
import org.neo4j.storageengine.api.StorageEngine;
import org.neo4j.test.Race;

import static java.lang.Integer.max;
import static java.util.concurrent.TimeUnit.MINUTES;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.neo4j.test.assertion.Assert.assertEventually;
import static org.neo4j.test.conditions.Conditions.equalityCondition;

class DatabaseUpgradeTransactionHandlerTest
{
    private volatile KernelVersion currentKernelVersion;
    private volatile DbmsRuntimeVersion currentDbmsRuntimeVersion;
    private InternalTransactionEventListener<Object> listener;
    private volatile boolean listenerUnregistered;
    private final ConcurrentLinkedQueue<RegisteredTransaction> registeredTransactions = new ConcurrentLinkedQueue<>();
    private final AssertableLogProvider logProvider = new AssertableLogProvider();
    private final RWUpgradeLocker lock = new RWUpgradeLocker();

    @AfterEach
    void checkTransactionStreamConsistency()
    {
        assertCorrectTransactionStream();
    }

    @Test
    void shouldUpdateKernelOnFirstTransactionAndUnsubscribeListener()
    {
        //Given
        init( KernelVersion.V4_2, DbmsRuntimeVersion.LATEST_DBMS_RUNTIME_COMPONENT_VERSION );

        //When
        doATransaction();

        //Then
        assertThat( currentKernelVersion ).isEqualTo( KernelVersion.LATEST );
        assertThat( listenerUnregistered ).isTrue();

        LogAssertions.assertThat( logProvider )
                .containsMessageWithArguments( "Upgrade transaction from %s to %s started", KernelVersion.V4_2, KernelVersion.LATEST )
                .containsMessageWithArguments( "Upgrade transaction from %s to %s completed", KernelVersion.V4_2, KernelVersion.LATEST );
    }

    @Test
    void shouldNotRegisterListenerWhenOnLatestVersion()
    {
        //Given
        init( KernelVersion.LATEST, DbmsRuntimeVersion.LATEST_DBMS_RUNTIME_COMPONENT_VERSION );

        //When
        doATransaction();

        //Then
        assertThat( listener ).isNull();
        assertThat( listenerUnregistered ).isFalse();
    }

    @Test
    void shouldNotUpgradePastRuntimeVersionAndKeepListener()
    {
        //Given
        init( KernelVersion.V4_0, DbmsRuntimeVersion.V4_2 );

        //When
        doATransaction();

        //Then
        assertThat( currentKernelVersion ).isEqualTo( KernelVersion.V4_2 );
        assertThat( listenerUnregistered ).isFalse();
    }

    @Test
    void shouldWaitForUpgradeUntilRuntimeVersionIsBumped()
    {
        //Given
        init( KernelVersion.V4_2, DbmsRuntimeVersion.V4_2 );

        //When
        doATransaction();

        //Then
        assertThat( currentKernelVersion ).isEqualTo( KernelVersion.V4_2 );
        assertThat( listenerUnregistered ).isFalse();

        //When
        setDbmsRuntime( DbmsRuntimeVersion.LATEST_DBMS_RUNTIME_COMPONENT_VERSION );
        doATransaction();

        //then
        assertThat( currentKernelVersion ).isEqualTo( KernelVersion.LATEST );
        assertThat( listenerUnregistered ).isTrue();
    }

    @Test
    void shouldNotRegisterListenerWhenKernelIsNewerThanRuntime()
    {
        //Given
        init( KernelVersion.LATEST, DbmsRuntimeVersion.V4_2 );

        //When
        doATransaction();

        //Then
        assertThat( listener ).isNull();
        assertThat( listenerUnregistered ).isFalse();
    }

    @Test
    void shouldUpgradeOnceEvenWithManyConcurrentTransactions()
    {
        //Given a dbms running with 4.3 "jars" and a db that has just now been upgraded to run on these jars too
        init( KernelVersion.V4_0, DbmsRuntimeVersion.V4_2 );
        AtomicBoolean stop = new AtomicBoolean();
        Race race = new Race().withEndCondition( stop::get );

        //When letting multiple transactions run, while in the midst of that upgrading the dbms runtime version
        race.addContestants( max( Runtime.getRuntime().availableProcessors() - 1, 2 ), this::doATransactionWithSomeSleeping );
        race.addContestant( () ->
        {
            //Wait for the first upgrade transaction
            //which really is the db setting its kernel version to that of the current dbms runtime version, which is 4.2
            assertEventually( this::getKernelVersion, equalityCondition( KernelVersion.V4_2 ), 1, MINUTES );
            //Then upgrade the dbms runtime version
            setDbmsRuntime( DbmsRuntimeVersion.LATEST_DBMS_RUNTIME_COMPONENT_VERSION );
            //And wait for the db to make the upgrade to this version too
            assertEventually( this::getKernelVersion, equalityCondition( KernelVersion.LATEST ), 1, MINUTES );
            stop.set( true );
        }, 1 );

        race.goUnchecked();
    }

    /**
     * Asserts that the observed transaction stream is consistent according to these rules:
     * - Start from some of the known versions
     * - All transactions up until the next upgrade transaction needs to be for the same version
     * - Upgrade transaction is expected to be of a newer version
     *
     * For example like this:
     * - V4_0,UPGRADE(V4_2),V4_2,V4_2,UPGRADE(V4_3),V4_3,V4_3,V4_3
     * - V4_2,V4_2,V4_2,UPGRADE(V4_3),V4_3,V4_3
     */
    private void assertCorrectTransactionStream()
    {
        KernelVersion checkVersion = null;
        for ( RegisteredTransaction registeredTransaction : registeredTransactions )
        {
            if ( registeredTransaction.isUpgradeTransaction )
            {
                if ( checkVersion != null )
                {
                    assertThat( registeredTransaction.version.isGreaterThan( checkVersion ) ).isTrue();
                }
                checkVersion = registeredTransaction.version;
            }
            else
            {
                if ( checkVersion != null )
                {
                    assertThat( registeredTransaction.version ).isEqualTo( checkVersion );
                }
                else
                {
                    checkVersion = registeredTransaction.version;
                }
            }
        }
    }

    private void init( KernelVersion initialKernelVersion, DbmsRuntimeVersion initialDbmsRuntimeVersion )
    {
        setKernelVersion( initialKernelVersion );
        setDbmsRuntime( initialDbmsRuntimeVersion );

        StorageEngine storageEngine = mock( StorageEngine.class );
        doAnswer( inv ->
        {
            KernelVersion toKernelVersion = inv.getArgument( 0, KernelVersion.class );
            registeredTransactions.add( new RegisteredTransaction( toKernelVersion, true ) );
            return List.of( new FakeKernelVersionUpgradeCommand( toKernelVersion ) );
        } ).when( storageEngine ).createUpgradeCommands( any(), any() );
        DbmsRuntimeRepository dbmsRuntimeRepository = mock( DbmsRuntimeRepository.class );
        doAnswer( inv -> currentDbmsRuntimeVersion ).when( dbmsRuntimeRepository ).getVersion();
        KernelVersionRepository kernelVersionRepository = this::getKernelVersion;
        DatabaseTransactionEventListeners databaseTransactionEventListeners = mock( DatabaseTransactionEventListeners.class );
        doAnswer( inv -> listener = inv.getArgument( 0, InternalTransactionEventListener.class ) )
                .when( databaseTransactionEventListeners ).registerTransactionEventListener( any() );
        doAnswer( inv -> listenerUnregistered = true ).when( databaseTransactionEventListeners ).unregisterTransactionEventListener( any() );

        DatabaseUpgradeTransactionHandler handler = new DatabaseUpgradeTransactionHandler( storageEngine, dbmsRuntimeRepository, kernelVersionRepository,
                databaseTransactionEventListeners, lock, logProvider );
        handler.registerUpgradeListener( commands -> setKernelVersion( ((FakeKernelVersionUpgradeCommand) commands.iterator().next()).version ) );
    }

    private synchronized void setKernelVersion( KernelVersion newKernelVersion )
    {
        assertThat( currentKernelVersion ).as( "We only allow one upgrade transaction" ).isNotEqualTo( newKernelVersion );
        currentKernelVersion = newKernelVersion;
    }

    private synchronized KernelVersion getKernelVersion()
    {
        return currentKernelVersion;
    }

    private synchronized void setDbmsRuntime( DbmsRuntimeVersion dbmsRuntimeVersion )
    {
        this.currentDbmsRuntimeVersion = dbmsRuntimeVersion;
    }

    private void doATransaction()
    {
        doATransaction( false );
    }

    private void doATransactionWithSomeSleeping()
    {
        doATransaction( true );
    }

    private void doATransaction( boolean doSomeSleeping )
    {
        if ( !listenerUnregistered && listener != null )
        {
            try
            {
                Object state = listener.beforeCommit( mock( TransactionData.class ), mock( KernelTransaction.class ), mock( GraphDatabaseService.class ) );
                KernelVersion currentKernelVersion = this.currentKernelVersion;
                if ( doSomeSleeping )
                {
                    // This sleep is an enabler for upgrade vs transactions race, makes this way more likely to trigger
                    Thread.sleep( ThreadLocalRandom.current().nextInt( 3 ) );
                }
                registeredTransactions.add( new RegisteredTransaction( currentKernelVersion, false ) );
                // At this point we cannot assert on a comparison between dbms runtime version and kernel version
                listener.afterCommit( mock( TransactionData.class ), state, mock( GraphDatabaseService.class ) );
            }
            catch ( Exception e )
            {
                ExceptionUtils.throwAsUncheckedException( e );
            }
        }
    }

    private static class FakeKernelVersionUpgradeCommand implements StorageCommand
    {
        KernelVersion version;

        FakeKernelVersionUpgradeCommand( KernelVersion version )
        {
            this.version = version;
        }

        @Override
        public KernelVersion version()
        {
            return version;
        }

        @Override
        public void serialize( WritableChannel channel ) throws IOException
        {
        }
    }

    private static class RegisteredTransaction
    {
        private final KernelVersion version;
        private final boolean isUpgradeTransaction;

        RegisteredTransaction( KernelVersion version, boolean isUpgradeTransaction )
        {
            this.version = version;
            this.isUpgradeTransaction = isUpgradeTransaction;
        }

        @Override
        public String toString()
        {
            return "RegisteredTransaction{" + "version=" + version + ", isUpgradeTransaction=" + isUpgradeTransaction + '}';
        }
    }

    private static class RWUpgradeLocker implements UpgradeLocker
    {
        private final ReadWriteLock realLock = new ReentrantReadWriteLock();

        @Override
        public Lock acquireWriteLock( KernelTransaction tx )
        {
            realLock.writeLock().lock();
            return new Lock()
            {
                @Override
                public void release()
                {
                    realLock.writeLock().unlock();
                }
            };
        }

        @Override
        public Lock acquireReadLock( KernelTransaction tx )
        {
            realLock.readLock().lock();
            return new Lock()
            {
                @Override
                public void release()
                {
                    realLock.readLock().unlock();
                }
            };
        }
    }
}
