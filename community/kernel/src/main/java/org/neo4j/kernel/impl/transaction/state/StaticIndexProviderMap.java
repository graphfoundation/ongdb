/*
 * Copyright (c) 2018-2022 "Graph Foundation,"
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
package org.neo4j.kernel.impl.transaction.state;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.neo4j.common.DependencyResolver;
import org.neo4j.configuration.Config;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.internal.schema.IndexDescriptor;
import org.neo4j.internal.schema.IndexProviderDescriptor;
import org.neo4j.kernel.api.impl.fulltext.FulltextIndexProvider;
import org.neo4j.kernel.api.impl.schema.TextIndexProvider;
import org.neo4j.kernel.api.index.IndexProvider;
import org.neo4j.kernel.impl.api.index.IndexProviderMap;
import org.neo4j.kernel.impl.api.index.IndexProviderNotFoundException;
import org.neo4j.kernel.impl.index.schema.GenericNativeIndexProvider;
import org.neo4j.kernel.impl.index.schema.PointIndexProvider;
import org.neo4j.kernel.impl.index.schema.RangeIndexProvider;
import org.neo4j.kernel.impl.index.schema.TokenIndexProvider;
import org.neo4j.kernel.impl.index.schema.fusion.FusionIndexProvider;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;

import static java.lang.String.format;
import static java.util.Objects.requireNonNull;

public class StaticIndexProviderMap extends LifecycleAdapter implements IndexProviderMap
{
    private final Map<IndexProviderDescriptor,IndexProvider> indexProvidersByDescriptor = new HashMap<>();
    private final Map<String,IndexProvider> indexProvidersByName = new HashMap<>();
    private final IndexProvider tokenIndexProvider;
    private final IndexProvider btreeIndexProvider;
    private final IndexProvider fusionIndexProvider;
    private final IndexProvider textIndexProvider;
    private final IndexProvider fulltextIndexProvider;
    private final IndexProvider rangeIndexProvider;
    private final IndexProvider pointIndexProvider;
    private final Config config;
    private final DependencyResolver dependencies;
    private volatile IndexProvider defaultIndexProvider;

    public StaticIndexProviderMap( TokenIndexProvider tokenIndexProvider, GenericNativeIndexProvider btreeIndexProvider,
                                   FusionIndexProvider fusionIndexProvider, TextIndexProvider textIndexProvider,
                                   FulltextIndexProvider fulltextIndexProvider, RangeIndexProvider rangeIndexProvider,
                                   PointIndexProvider pointIndexProvider, Config config, DependencyResolver dependencies )
    {
        this.tokenIndexProvider = tokenIndexProvider;
        this.btreeIndexProvider = btreeIndexProvider;
        this.fusionIndexProvider = fusionIndexProvider;
        this.textIndexProvider = textIndexProvider;
        this.fulltextIndexProvider = fulltextIndexProvider;
        this.rangeIndexProvider = rangeIndexProvider;
        this.pointIndexProvider = pointIndexProvider;
        this.config = config;
        this.dependencies = dependencies;
    }

    @Override
    public void init() throws Exception
    {
        add( tokenIndexProvider );
        add( btreeIndexProvider );
        add( fusionIndexProvider );
        add( textIndexProvider );
        add( fulltextIndexProvider );
        add( rangeIndexProvider );
        add( pointIndexProvider );
        dependencies.resolveTypeDependencies( IndexProvider.class ).forEach( this::add );
        this.defaultIndexProvider = selectDefaultProvider( config );
    }

    @Override
    public IndexProvider getDefaultProvider()
    {
        return defaultIndexProvider;
    }

    @Override
    public IndexProvider getFulltextProvider()
    {
        return fulltextIndexProvider;
    }

    @Override
    public IndexProvider getTokenIndexProvider()
    {
        return tokenIndexProvider;
    }

    @Override
    public IndexProvider getTextIndexProvider()
    {
        return textIndexProvider;
    }

    @Override
    public IndexProvider getRangeIndexProvider()
    {
        return rangeIndexProvider;
    }

    @Override
    public IndexProvider getPointIndexProvider()
    {
        return pointIndexProvider;
    }

    @Override
    public IndexProvider lookup( IndexProviderDescriptor providerDescriptor )
    {
        IndexProvider provider = indexProvidersByDescriptor.get( providerDescriptor );
        assertProviderFound( provider, providerDescriptor.name() );
        return provider;
    }

    @Override
    public IndexProvider lookup( String providerDescriptorName )
    {
        IndexProvider provider = indexProvidersByName.get( providerDescriptorName );
        assertProviderFound( provider, providerDescriptorName );
        return provider;
    }

    @Override
    public void accept( Consumer<IndexProvider> visitor )
    {
        indexProvidersByDescriptor.values().forEach( visitor );
    }

    private void assertProviderFound( IndexProvider provider, String providerDescriptorName )
    {
        if ( provider == null )
        {
            throw new IndexProviderNotFoundException( "Tried to get index provider with name " + providerDescriptorName +
                                                      " whereas available providers in this session being " + indexProvidersByName.keySet() +
                                                      ", and default being " +
                                                      defaultIndexProvider.getProviderDescriptor().name() );
        }
    }

    @Override
    public IndexDescriptor completeConfiguration( IndexDescriptor index )
    {
        IndexProviderDescriptor providerDescriptor = index.getIndexProvider();
        IndexProvider provider = lookup( providerDescriptor );
        return provider.completeConfiguration( index );
    }

    private void add( IndexProvider provider )
    {
        var providerDescriptor = requireNonNull( provider.getProviderDescriptor() );
        var existing = indexProvidersByDescriptor.putIfAbsent( providerDescriptor, provider );
        if ( existing != null )
        {
            throw new IllegalArgumentException( "Tried to load multiple schema index providers with the same provider descriptor " +
                                                providerDescriptor + ". First loaded " + existing + " then " + provider );
        }
        indexProvidersByName.putIfAbsent( providerDescriptor.name(), provider );
    }

    private IndexProvider selectDefaultProvider( Config config )
    {
        if ( config.isExplicitlySet( GraphDatabaseSettings.default_schema_provider ) )
        {
            var providerName = config.get( GraphDatabaseSettings.default_schema_provider );
            var configuredDefaultProvider = indexProvidersByName.get( providerName );
            requireNonNull( configuredDefaultProvider,
                            () -> format( "Configured default provider: `%s` not found. Available index providers: %s.", providerName,
                                          indexProvidersByName.keySet() ) );
            return configuredDefaultProvider;
        }
        return btreeIndexProvider;
    }
}
