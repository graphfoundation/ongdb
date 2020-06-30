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
package org.neo4j.cypher.internal.javacompat;

import org.neo4j.cypher.internal.CompilerFactory;
import org.neo4j.cypher.internal.CypherRuntimeConfiguration;
import org.neo4j.cypher.internal.EnterpriseCompilerFactory;
import org.neo4j.cypher.internal.compiler.CypherPlannerConfiguration;

public class EnterpriseCypherEngineProvider extends CommunityCypherEngineProvider
{

    @Override
    protected int enginePriority()
    {
        return 1; // Lower means better. The enterprise version will have a lower number
    }

    protected CompilerFactory makeCompilerFactory( GraphDatabaseCypherService queryService, SPI spi, CypherPlannerConfiguration plannerConfig,
                                                   CypherRuntimeConfiguration runtimeConfig )
    {
        return new EnterpriseCompilerFactory( queryService, spi, plannerConfig, runtimeConfig );
    }
}
