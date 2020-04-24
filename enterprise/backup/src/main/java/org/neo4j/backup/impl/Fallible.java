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

import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Contains a reference to a class (designed for enums) and can optionally also contain a throwable if the provided state has an exception attached
 *
 * @param <T> generic of an enum (not enforced)
 */
class Fallible<T>
{
    private final T state;
    private final Throwable cause;

    public Optional<Throwable> getCause()
    {
        return Optional.ofNullable( cause );
    }

    public T getState()
    {
        return state;
    }

    Fallible( T state, @Nullable Throwable cause )
    {
        this.state = state;
        this.cause = cause;
    }
}
