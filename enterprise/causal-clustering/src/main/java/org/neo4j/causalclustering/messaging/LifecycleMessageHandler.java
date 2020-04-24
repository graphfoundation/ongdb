/*
 * Copyright (c) 2018-2020 "Graph Foundation"
 * Graph Foundation, Inc. [https://graphfoundation.org]
 *
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
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
package org.neo4j.causalclustering.messaging;

import org.neo4j.causalclustering.core.state.CoreLife;
import org.neo4j.causalclustering.identity.ClusterId;

/**
 * A {@link Inbound.MessageHandler} that can be started and stopped in {@link CoreLife}.
 * It is required that if this MessageHandler delegates to another MessageHandler to handle messages
 * then the delegate will also have lifecycle methods called
 */
public interface LifecycleMessageHandler<M extends Message> extends Inbound.MessageHandler<M>
{
    void start( ClusterId clusterId ) throws Throwable;

    void stop() throws Throwable;
}
