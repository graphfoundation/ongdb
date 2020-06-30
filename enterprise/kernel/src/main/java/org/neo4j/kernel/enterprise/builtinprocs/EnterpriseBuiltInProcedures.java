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
package org.neo4j.kernel.enterprise.builtinprocs;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.neo4j.common.DependencyResolver;
import org.neo4j.internal.kernel.api.exceptions.ProcedureException;
import org.neo4j.internal.schema.IndexProviderDescriptor;
import org.neo4j.kernel.api.KernelTransaction;
import org.neo4j.kernel.impl.api.index.IndexingService;
import org.neo4j.procedure.Context;
import org.neo4j.procedure.Description;
import org.neo4j.procedure.Mode;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.Procedure;
import org.neo4j.procedure.builtin.BuiltInProcedures.SchemaIndexInfo;
import org.neo4j.procedure.builtin.IndexProcedures;

@SuppressWarnings( "unused" )
public class EnterpriseBuiltInProcedures
{

    @Context
    public KernelTransaction tx;

    @Context
    public DependencyResolver resolver;

    @Description( "Create a named node key constraint. Backing index will use specified index provider and configuration (optional). Yield: name, labels, properties, providerName, status" )
    @Procedure( name = "db.createNodeKey", mode = Mode.SCHEMA )
    public Stream<SchemaIndexInfo> createNodeKey( @Name( "constraintName" ) String constraintName,
                                                  @Name( "labels" ) List<String> labels,
                                                  @Name( "properties" ) List<String> properties, @Name( "providerName" ) String providerName,
                                                  @Name( value = "config", defaultValue = "{}" ) Map<String,Object> config )
            throws ProcedureException
    {
        IndexProcedures indexProcedures = this.indexProcedures();
        IndexProviderDescriptor indexProviderDescriptor = this.getIndexProviderDescriptor( providerName );
        return indexProcedures
                .createNodeKey( constraintName, labels, properties, indexProviderDescriptor, config );
    }

    private IndexProviderDescriptor getIndexProviderDescriptor( String providerName )
    {
        return ((IndexingService) this.resolver.resolveDependency( IndexingService.class ))
                .indexProviderByName( providerName );
    }

    private IndexProcedures indexProcedures()
    {
        return new IndexProcedures( this.tx,
                                    (IndexingService) this.resolver.resolveDependency( IndexingService.class ) );
    }
}
