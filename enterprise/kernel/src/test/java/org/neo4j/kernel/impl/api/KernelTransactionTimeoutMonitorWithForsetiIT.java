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
package org.neo4j.kernel.impl.api;

import org.neo4j.kernel.impl.enterprise.lock.forseti.ForsetiLocksFactory;
import org.neo4j.test.rule.DatabaseRule;

import static org.neo4j.graphdb.factory.GraphDatabaseSettings.lock_manager;

public class KernelTransactionTimeoutMonitorWithForsetiIT extends
                                                          KernelTransactionTimeoutMonitorIT
{

    @Override
    protected DatabaseRule createDatabaseRule()
    {
        return super.createDatabaseRule().withSetting( lock_manager, ForsetiLocksFactory.KEY );
    }
}
