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
package org.neo4j.harness;

import org.neo4j.annotations.service.ServiceProvider;
import org.neo4j.kernel.api.procedure.GlobalProcedures;
import org.neo4j.kernel.extension.ExtensionFactory;
import org.neo4j.kernel.extension.ExtensionType;
import org.neo4j.kernel.extension.context.ExtensionContext;
import org.neo4j.kernel.internal.GraphDatabaseAPI;
import org.neo4j.kernel.lifecycle.Lifecycle;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.logging.internal.LogService;

// Similar to the MyExtensionThatAddsInjectable, this demonstrates a
// non-public mechanism for adding new context components, but in this
// case the goal is to provide alternative Core API's and as such it wraps
// the old Core API.
@ServiceProvider
public class MyExtensionThatAddsAlternativeCoreAPI
        extends ExtensionFactory<MyExtensionThatAddsAlternativeCoreAPI.Dependencies>
{
    public MyExtensionThatAddsAlternativeCoreAPI()
    {
        super( ExtensionType.DATABASE, "my-ext" );
    }

    @Override
    public Lifecycle newInstance( ExtensionContext context, Dependencies dependencies )
    {
        dependencies.procedures().registerComponent( MyCoreAPI.class, ctx -> new MyCoreAPI( dependencies.logService().getUserLog( MyCoreAPI.class ) ), true );
        return new LifecycleAdapter();
    }

    public interface Dependencies
    {
        LogService logService();

        GlobalProcedures procedures();

        GraphDatabaseAPI getGraphDatabaseAPI();
    }
}
