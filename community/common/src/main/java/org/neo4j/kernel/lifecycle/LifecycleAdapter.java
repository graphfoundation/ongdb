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
package org.neo4j.kernel.lifecycle;

import org.neo4j.function.ThrowingAction;

/**
 * Adapter for Lifecycle interface. Subclass and override methods as needed
 */
public class LifecycleAdapter implements Lifecycle
{
    @Override
    public void init() throws Exception
    {
    }

    @Override
    public void start() throws Exception
    {
    }

    @Override
    public void stop() throws Exception
    {
    }

    @Override
    public void shutdown() throws Exception
    {
    }

    public static Lifecycle simpleLife( ThrowingAction onStart, ThrowingAction onStop )
    {
        return new LifecycleAdapter()
        {
            @Override
            public void start() throws Exception
            {
                onStart.apply();
            }

            @Override
            public void stop() throws Exception
            {
                onStop.apply();
            }
        };
    }

    public static Lifecycle onInit( ThrowingAction action )
    {
        return new LifecycleAdapter()
        {
            @Override
            public void init() throws Exception
            {
                action.apply();
            }
        };
    }

    public static Lifecycle onStart( ThrowingAction action )
    {
        return new LifecycleAdapter()
        {
            @Override
            public void start() throws Exception
            {
                action.apply();
            }
        };
    }

    public static Lifecycle onStop( ThrowingAction action )
    {
        return new LifecycleAdapter()
        {
            @Override
            public void stop() throws Exception
            {
                action.apply();
            }
        };
    }

    public static Lifecycle onShutdown( ThrowingAction action )
    {
        return new LifecycleAdapter()
        {
            @Override
            public void shutdown() throws Exception
            {
                action.apply();
            }
        };
    }
}
