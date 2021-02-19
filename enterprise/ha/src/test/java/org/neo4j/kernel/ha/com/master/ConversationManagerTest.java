/*
 * Copyright (c) 2018-2020 "Graph Foundation,"
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
/*
 * Copyright (c) 2002-2018 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.ha.com.master;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.Duration;

import org.neo4j.com.RequestContext;
import org.neo4j.kernel.configuration.Config;
import org.neo4j.kernel.ha.HaSettings;
import org.neo4j.kernel.ha.cluster.ConversationSPI;
import org.neo4j.kernel.impl.util.collection.TimedRepository;
import org.neo4j.scheduler.JobScheduler;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith( MockitoJUnitRunner.class )
public class ConversationManagerTest
{

    @Mock
    private ConversationSPI conversationSPI;
    @Mock
    private Config config;
    private ConversationManager conversationManager;

    @Test
    public void testStart()
    {
        JobScheduler.JobHandle reaperJobHandle = mock( JobScheduler.JobHandle.class );
        when( config.get( HaSettings.lock_read_timeout ) ).thenReturn( Duration.ofMillis( 1 ) );
        when( conversationSPI.scheduleRecurringJob( any( JobScheduler.Group.class ), any( Long.class ),
                any( Runnable.class ) ) ).thenReturn( reaperJobHandle );
        conversationManager = getConversationManager();

        conversationManager.start();

        assertNotNull( conversationManager.conversations );
        verify( conversationSPI ).scheduleRecurringJob(any( JobScheduler.Group.class ), any( Long.class ),
                any( Runnable.class ) );
    }

    @Test
    public void testStop()
    {
        JobScheduler.JobHandle reaperJobHandle = mock( JobScheduler.JobHandle.class );
        when( config.get( HaSettings.lock_read_timeout ) ).thenReturn( Duration.ofMillis( 1 ) );
        when( conversationSPI.scheduleRecurringJob( any( JobScheduler.Group.class ), any( Long.class ),
                any( Runnable.class ) ) ).thenReturn( reaperJobHandle );
        conversationManager = getConversationManager();

        conversationManager.start();
        conversationManager.stop();

        assertNull( conversationManager.conversations );
        verify( reaperJobHandle ).cancel( false );
    }

    @Test
    public void testConversationWorkflow() throws Exception
    {
        RequestContext requestContext = getRequestContext();
        conversationManager = getConversationManager();
        TimedRepository conversationStorage = mock( TimedRepository.class );
        conversationManager.conversations = conversationStorage;

        conversationManager.begin( requestContext );
        conversationManager.acquire( requestContext );
        conversationManager.release( requestContext );
        conversationManager.end( requestContext );

        InOrder conversationOrder = inOrder( conversationStorage);
        conversationOrder.verify(conversationStorage).begin( requestContext );
        conversationOrder.verify(conversationStorage).acquire( requestContext );
        conversationOrder.verify(conversationStorage).release( requestContext );
        conversationOrder.verify(conversationStorage).end( requestContext );
    }

    @Test
    public void testConversationStop()
    {
        RequestContext requestContext = getRequestContext();
        conversationManager = getConversationManager();

        Conversation conversation = mock( Conversation.class );
        when( conversation.isActive() ).thenReturn( true );

        TimedRepository conversationStorage = mock( TimedRepository.class );
        when( conversationStorage.end( requestContext ) ).thenReturn( conversation );
        conversationManager.conversations = conversationStorage;

        conversationManager.stop( requestContext );

        verify( conversationStorage ).end( requestContext );
        verify( conversation ).stop();
    }

    private RequestContext getRequestContext()
    {
        return new RequestContext( 1L, 1, 1, 1L, 1L );
    }

    private ConversationManager getConversationManager()
    {
        return new ConversationManager( conversationSPI, config, 1000, 5000 );
    }

}
