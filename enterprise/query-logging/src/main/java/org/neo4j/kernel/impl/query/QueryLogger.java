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
package org.neo4j.kernel.impl.query;

import org.neo4j.kernel.api.query.ExecutingQuery;

public interface QueryLogger
{
    QueryLogger NO_LOG = new QueryLogger()
    {
        @Override
        public void success( ExecutingQuery query )
        {
        }

        @Override
        public void failure( ExecutingQuery query, Throwable throwable )
        {
        }

        @Override
        public void failure( ExecutingQuery query, String reason )
        {
        }
    };

    void success( ExecutingQuery query );

    void failure( ExecutingQuery query, Throwable throwable );

    void failure( ExecutingQuery query, String reason );
}
