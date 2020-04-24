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
package org.neo4j.causalclustering.core.state;

import java.util.concurrent.CompletableFuture;

public class Result
{
    private final Exception exception;
    private final Object result;

    private Result( Exception exception )
    {
        this.exception = exception;
        this.result = null;
    }

    private Result( Object result )
    {
        this.result = result;
        this.exception = null;
    }

    public static Result of( Object result )
    {
        return new Result( result );
    }

    public static Result of( Exception exception )
    {
        return new Result( exception );
    }

    public Object consume() throws Exception
    {
        if ( exception != null )
        {
            throw exception;
        }
        else
        {
            return result;
        }
    }

    public CompletableFuture<Object> apply( CompletableFuture<Object> future )
    {
        if ( exception != null )
        {
            future.completeExceptionally( exception );
        }
        else
        {
            future.complete( result );
        }

        return future;
    }

    @Override
    public String toString()
    {
        return "Result{" +
               "exception=" + exception +
               ", result=" + result +
               '}';
    }
}
